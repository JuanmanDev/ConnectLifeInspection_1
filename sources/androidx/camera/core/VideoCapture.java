package androidx.camera.core;

import android.location.Location;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;
import androidx.camera.core.DeferrableSurface;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCaseConfig;
import androidx.camera.core.VideoCaptureConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class VideoCapture extends UseCase {
    public static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final int[] CamcorderQuality = {8, 6, 5, 4};
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public static final int DEQUE_TIMEOUT_USEC = 10000;
    public static final Metadata EMPTY_METADATA = new Metadata();
    public static final String TAG = "VideoCapture";
    public static final String VIDEO_MIME_TYPE = "video/avc";
    public static final short[] sAudioEncoding = {2, 3, 4};
    public int mAudioBitRate;
    public final MediaCodec.BufferInfo mAudioBufferInfo = new MediaCodec.BufferInfo();
    public int mAudioBufferSize;
    public int mAudioChannelCount;
    @NonNull
    public MediaCodec mAudioEncoder;
    public final Handler mAudioHandler;
    public final HandlerThread mAudioHandlerThread = new HandlerThread("CameraX-audio encoding thread");
    @NonNull
    public AudioRecord mAudioRecorder;
    public int mAudioSampleRate;
    public int mAudioTrackIndex;
    public Surface mCameraSurface;
    public DeferrableSurface mDeferrableSurface;
    public final AtomicBoolean mEndOfAudioStreamSignal = new AtomicBoolean(true);
    public final AtomicBoolean mEndOfAudioVideoSignal = new AtomicBoolean(true);
    public final AtomicBoolean mEndOfVideoStreamSignal = new AtomicBoolean(true);
    public final AtomicBoolean mIsFirstAudioSampleWrite = new AtomicBoolean(false);
    public final AtomicBoolean mIsFirstVideoSampleWrite = new AtomicBoolean(false);
    public boolean mIsRecording = false;
    @GuardedBy("mMuxerLock")
    public MediaMuxer mMuxer;
    public final Object mMuxerLock = new Object();
    public boolean mMuxerStarted = false;
    public final VideoCaptureConfig.Builder mUseCaseConfigBuilder;
    public final MediaCodec.BufferInfo mVideoBufferInfo = new MediaCodec.BufferInfo();
    @NonNull
    public MediaCodec mVideoEncoder;
    public final Handler mVideoHandler;
    public final HandlerThread mVideoHandlerThread = new HandlerThread("CameraX-video encoding thread");
    public int mVideoTrackIndex;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<VideoCaptureConfig> {
        public static final int DEFAULT_AUDIO_BIT_RATE = 64000;
        public static final int DEFAULT_AUDIO_CHANNEL_COUNT = 1;
        public static final int DEFAULT_AUDIO_MIN_BUFFER_SIZE = 1024;
        public static final int DEFAULT_AUDIO_RECORD_SOURCE = 1;
        public static final int DEFAULT_AUDIO_SAMPLE_RATE = 8000;
        public static final int DEFAULT_BIT_RATE = 8388608;
        public static final VideoCaptureConfig DEFAULT_CONFIG = new VideoCaptureConfig.Builder().setCallbackHandler(DEFAULT_HANDLER).setVideoFrameRate(30).setBitRate(8388608).setIFrameInterval(1).setAudioBitRate(DEFAULT_AUDIO_BIT_RATE).setAudioSampleRate(DEFAULT_AUDIO_SAMPLE_RATE).setAudioChannelCount(1).setAudioRecordSource(1).setAudioMinBufferSize(1024).setMaxResolution(DEFAULT_MAX_RESOLUTION).setSurfaceOccupancyPriority(3).build();
        public static final Handler DEFAULT_HANDLER = new Handler(Looper.getMainLooper());
        public static final int DEFAULT_INTRA_FRAME_INTERVAL = 1;
        public static final Size DEFAULT_MAX_RESOLUTION = new Size(1920, 1080);
        public static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 3;
        public static final int DEFAULT_VIDEO_FRAME_RATE = 30;

        public VideoCaptureConfig getConfig(CameraX.LensFacing lensFacing) {
            return DEFAULT_CONFIG;
        }
    }

    public static final class Metadata {
        @Nullable
        public Location location;
    }

    public interface OnVideoSavedListener {
        void onError(UseCaseError useCaseError, String str, @Nullable Throwable th);

        void onVideoSaved(File file);
    }

    public enum UseCaseError {
        UNKNOWN_ERROR,
        ENCODER_ERROR,
        MUXER_ERROR,
        RECORDING_IN_PROGRESS
    }

    public VideoCapture(VideoCaptureConfig videoCaptureConfig) {
        super(videoCaptureConfig);
        this.mUseCaseConfigBuilder = VideoCaptureConfig.Builder.fromConfig(videoCaptureConfig);
        this.mVideoHandlerThread.start();
        this.mVideoHandler = new Handler(this.mVideoHandlerThread.getLooper());
        this.mAudioHandlerThread.start();
        this.mAudioHandler = new Handler(this.mAudioHandlerThread.getLooper());
    }

    private AudioRecord autoConfigAudioRecordSource(VideoCaptureConfig videoCaptureConfig) {
        short[] sArr = sAudioEncoding;
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            short s = sArr[i];
            int i2 = this.mAudioChannelCount == 1 ? 16 : 12;
            int audioRecordSource = videoCaptureConfig.getAudioRecordSource();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(this.mAudioSampleRate, i2, s);
                if (minBufferSize <= 0) {
                    minBufferSize = videoCaptureConfig.getAudioMinBufferSize();
                }
                int i3 = minBufferSize;
                AudioRecord audioRecord = new AudioRecord(audioRecordSource, this.mAudioSampleRate, i2, s, i3 * 2);
                if (audioRecord.getState() == 1) {
                    this.mAudioBufferSize = i3;
                    "source: " + audioRecordSource + " audioSampleRate: " + this.mAudioSampleRate + " channelConfig: " + i2 + " audioFormat: " + s + " bufferSize: " + i3;
                    return audioRecord;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private MediaFormat createAudioMediaFormat() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(AUDIO_MIME_TYPE, this.mAudioSampleRate, this.mAudioChannelCount);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", this.mAudioBitRate);
        return createAudioFormat;
    }

    public static MediaFormat createMediaFormat(VideoCaptureConfig videoCaptureConfig, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", videoCaptureConfig.getBitRate());
        createVideoFormat.setInteger("frame-rate", videoCaptureConfig.getVideoFrameRate());
        createVideoFormat.setInteger("i-frame-interval", videoCaptureConfig.getIFrameInterval());
        return createVideoFormat;
    }

    public static String getCameraIdUnchecked(CameraX.LensFacing lensFacing) {
        try {
            return CameraX.getCameraWithLensFacing(lensFacing);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get camera id for camera lens facing " + lensFacing, e);
        }
    }

    private ByteBuffer getInputBuffer(MediaCodec mediaCodec, int i) {
        return mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(MediaCodec mediaCodec, int i) {
        return mediaCodec.getOutputBuffer(i);
    }

    private void releaseCameraSurface(final boolean z) {
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            final Surface surface = this.mCameraSurface;
            final MediaCodec mediaCodec = this.mVideoEncoder;
            deferrableSurface.setOnSurfaceDetachedListener(CameraXExecutors.mainThreadExecutor(), new DeferrableSurface.OnSurfaceDetachedListener() {
                public void onSurfaceDetached() {
                    MediaCodec mediaCodec;
                    if (z && (mediaCodec = mediaCodec) != null) {
                        mediaCodec.release();
                    }
                    Surface surface = surface;
                    if (surface != null) {
                        surface.release();
                    }
                }
            });
            if (z) {
                this.mVideoEncoder = null;
            }
            this.mCameraSurface = null;
            this.mDeferrableSurface = null;
        }
    }

    private void setAudioParametersByCamcorderProfile(Size size, String str) {
        int[] iArr = CamcorderQuality;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = iArr[i];
            if (CamcorderProfile.hasProfile(Integer.parseInt(str), i2)) {
                CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i2);
                if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                    this.mAudioChannelCount = camcorderProfile.audioChannels;
                    this.mAudioSampleRate = camcorderProfile.audioSampleRate;
                    this.mAudioBitRate = camcorderProfile.audioBitRate;
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (!z) {
            VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) getUseCaseConfig();
            this.mAudioChannelCount = videoCaptureConfig.getAudioChannelCount();
            this.mAudioSampleRate = videoCaptureConfig.getAudioSampleRate();
            this.mAudioBitRate = videoCaptureConfig.getAudioBitRate();
        }
    }

    private void setupEncoder(Size size) {
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) getUseCaseConfig();
        this.mVideoEncoder.reset();
        this.mVideoEncoder.configure(createMediaFormat(videoCaptureConfig, size), (Surface) null, (MediaCrypto) null, 1);
        if (this.mCameraSurface != null) {
            releaseCameraSurface(false);
        }
        this.mCameraSurface = this.mVideoEncoder.createInputSurface();
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(videoCaptureConfig);
        ImmediateSurface immediateSurface = new ImmediateSurface(this.mCameraSurface);
        this.mDeferrableSurface = immediateSurface;
        createFrom.addSurface(immediateSurface);
        String cameraIdUnchecked = getCameraIdUnchecked(videoCaptureConfig.getLensFacing());
        attachToCamera(cameraIdUnchecked, createFrom.build());
        setAudioParametersByCamcorderProfile(size, cameraIdUnchecked);
        this.mAudioEncoder.reset();
        this.mAudioEncoder.configure(createAudioMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = this.mAudioRecorder;
        if (audioRecord != null) {
            audioRecord.release();
        }
        this.mAudioRecorder = autoConfigAudioRecordSource(videoCaptureConfig);
        this.mVideoTrackIndex = -1;
        this.mAudioTrackIndex = -1;
        this.mIsRecording = false;
    }

    private boolean writeAudioEncodedBuffer(int i) {
        ByteBuffer outputBuffer = getOutputBuffer(this.mAudioEncoder, i);
        outputBuffer.position(this.mAudioBufferInfo.offset);
        if (this.mAudioTrackIndex >= 0 && this.mVideoTrackIndex >= 0) {
            MediaCodec.BufferInfo bufferInfo = this.mAudioBufferInfo;
            if (bufferInfo.size > 0 && bufferInfo.presentationTimeUs > 0) {
                try {
                    synchronized (this.mMuxerLock) {
                        if (!this.mIsFirstAudioSampleWrite.get()) {
                            this.mIsFirstAudioSampleWrite.set(true);
                        }
                        this.mMuxer.writeSampleData(this.mAudioTrackIndex, outputBuffer, this.mAudioBufferInfo);
                    }
                } catch (Exception e) {
                    "audio error:size=" + this.mAudioBufferInfo.size + "/offset=" + this.mAudioBufferInfo.offset + "/timeUs=" + this.mAudioBufferInfo.presentationTimeUs;
                    e.printStackTrace();
                }
            }
        }
        this.mAudioEncoder.releaseOutputBuffer(i, false);
        if ((this.mAudioBufferInfo.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    private boolean writeVideoEncodedBuffer(int i) {
        if (i < 0) {
            "Output buffer should not have negative index: " + i;
            return false;
        }
        ByteBuffer outputBuffer = this.mVideoEncoder.getOutputBuffer(i);
        if (outputBuffer == null) {
            return false;
        }
        if (this.mAudioTrackIndex >= 0 && this.mVideoTrackIndex >= 0) {
            MediaCodec.BufferInfo bufferInfo = this.mVideoBufferInfo;
            if (bufferInfo.size > 0) {
                outputBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.mVideoBufferInfo;
                outputBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                this.mVideoBufferInfo.presentationTimeUs = System.nanoTime() / 1000;
                synchronized (this.mMuxerLock) {
                    if (!this.mIsFirstVideoSampleWrite.get()) {
                        this.mIsFirstVideoSampleWrite.set(true);
                    }
                    this.mMuxer.writeSampleData(this.mVideoTrackIndex, outputBuffer, this.mVideoBufferInfo);
                }
            }
        }
        this.mVideoEncoder.releaseOutputBuffer(i, false);
        if ((this.mVideoBufferInfo.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean audioEncode(OnVideoSavedListener onVideoSavedListener) {
        boolean z = false;
        while (!z && this.mIsRecording) {
            if (this.mEndOfAudioStreamSignal.get()) {
                this.mEndOfAudioStreamSignal.set(false);
                this.mIsRecording = false;
            }
            MediaCodec mediaCodec = this.mAudioEncoder;
            if (mediaCodec != null && this.mAudioRecorder != null) {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(-1);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = getInputBuffer(this.mAudioEncoder, dequeueInputBuffer);
                    inputBuffer.clear();
                    int read = this.mAudioRecorder.read(inputBuffer, this.mAudioBufferSize);
                    if (read > 0) {
                        this.mAudioEncoder.queueInputBuffer(dequeueInputBuffer, 0, read, System.nanoTime() / 1000, this.mIsRecording ? 0 : 4);
                    }
                }
                while (true) {
                    int dequeueOutputBuffer = this.mAudioEncoder.dequeueOutputBuffer(this.mAudioBufferInfo, 0);
                    if (dequeueOutputBuffer == -2) {
                        synchronized (this.mMuxerLock) {
                            int addTrack = this.mMuxer.addTrack(this.mAudioEncoder.getOutputFormat());
                            this.mAudioTrackIndex = addTrack;
                            if (addTrack >= 0 && this.mVideoTrackIndex >= 0) {
                                this.mMuxerStarted = true;
                                this.mMuxer.start();
                            }
                        }
                    } else if (dequeueOutputBuffer != -1) {
                        z = writeAudioEncodedBuffer(dequeueOutputBuffer);
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (z) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        try {
            this.mAudioRecorder.stop();
        } catch (IllegalStateException e) {
            onVideoSavedListener.onError(UseCaseError.ENCODER_ERROR, "Audio recorder stop failed!", e);
        }
        try {
            this.mAudioEncoder.stop();
        } catch (IllegalStateException e2) {
            onVideoSavedListener.onError(UseCaseError.ENCODER_ERROR, "Audio encoder stop failed!", e2);
        }
        this.mEndOfVideoStreamSignal.set(true);
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void clear() {
        this.mVideoHandlerThread.quitSafely();
        this.mAudioHandlerThread.quitSafely();
        MediaCodec mediaCodec = this.mAudioEncoder;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.mAudioEncoder = null;
        }
        AudioRecord audioRecord = this.mAudioRecorder;
        if (audioRecord != null) {
            audioRecord.release();
            this.mAudioRecorder = null;
        }
        if (this.mCameraSurface != null) {
            releaseCameraSurface(true);
        }
        super.clear();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getDefaultBuilder(CameraX.LensFacing lensFacing) {
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) CameraX.getDefaultUseCaseConfig(VideoCaptureConfig.class, lensFacing);
        if (videoCaptureConfig != null) {
            return VideoCaptureConfig.Builder.fromConfig(videoCaptureConfig);
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<String, Size> onSuggestedResolutionUpdated(Map<String, Size> map) {
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) getUseCaseConfig();
        if (this.mCameraSurface != null) {
            this.mVideoEncoder.stop();
            this.mVideoEncoder.release();
            this.mAudioEncoder.stop();
            this.mAudioEncoder.release();
            releaseCameraSurface(false);
        }
        try {
            this.mVideoEncoder = MediaCodec.createEncoderByType(VIDEO_MIME_TYPE);
            this.mAudioEncoder = MediaCodec.createEncoderByType(AUDIO_MIME_TYPE);
            String cameraIdUnchecked = getCameraIdUnchecked(videoCaptureConfig.getLensFacing());
            Size size = map.get(cameraIdUnchecked);
            if (size != null) {
                setupEncoder(size);
                return map;
            }
            throw new IllegalArgumentException("Suggested resolution map missing resolution for camera " + cameraIdUnchecked);
        } catch (IOException e) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e.getCause());
        }
    }

    public void setTargetRotation(int i) {
        int targetRotation = ((ImageOutputConfig) getUseCaseConfig()).getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i) {
            this.mUseCaseConfigBuilder.setTargetRotation(i);
            updateUseCaseConfig(this.mUseCaseConfigBuilder.build());
        }
    }

    public void startRecording(File file, OnVideoSavedListener onVideoSavedListener) {
        this.mIsFirstVideoSampleWrite.set(false);
        this.mIsFirstAudioSampleWrite.set(false);
        startRecording(file, onVideoSavedListener, EMPTY_METADATA);
    }

    public void stopRecording() {
        notifyInactive();
        if (!this.mEndOfAudioVideoSignal.get() && this.mIsRecording) {
            this.mEndOfAudioStreamSignal.set(true);
        }
    }

    public boolean videoEncode(OnVideoSavedListener onVideoSavedListener) {
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) getUseCaseConfig();
        boolean z = false;
        boolean z2 = false;
        while (!z && !z2) {
            if (this.mEndOfVideoStreamSignal.get()) {
                this.mVideoEncoder.signalEndOfInputStream();
                this.mEndOfVideoStreamSignal.set(false);
            }
            int dequeueOutputBuffer = this.mVideoEncoder.dequeueOutputBuffer(this.mVideoBufferInfo, 10000);
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer == -2) {
                    if (this.mMuxerStarted) {
                        onVideoSavedListener.onError(UseCaseError.ENCODER_ERROR, "Unexpected change in video encoding format.", (Throwable) null);
                        z2 = true;
                    }
                    synchronized (this.mMuxerLock) {
                        int addTrack = this.mMuxer.addTrack(this.mVideoEncoder.getOutputFormat());
                        this.mVideoTrackIndex = addTrack;
                        if (this.mAudioTrackIndex >= 0 && addTrack >= 0) {
                            this.mMuxerStarted = true;
                            this.mMuxer.start();
                        }
                    }
                } else if (dequeueOutputBuffer != -1) {
                    z = writeVideoEncodedBuffer(dequeueOutputBuffer);
                }
            }
        }
        try {
            this.mVideoEncoder.stop();
        } catch (IllegalStateException e) {
            onVideoSavedListener.onError(UseCaseError.ENCODER_ERROR, "Video encoder stop failed!", e);
            z2 = true;
        }
        try {
            synchronized (this.mMuxerLock) {
                if (this.mMuxer != null) {
                    if (this.mMuxerStarted) {
                        this.mMuxer.stop();
                    }
                    this.mMuxer.release();
                    this.mMuxer = null;
                }
            }
        } catch (IllegalStateException e2) {
            onVideoSavedListener.onError(UseCaseError.MUXER_ERROR, "Muxer stop failed!", e2);
            z2 = true;
        }
        this.mMuxerStarted = false;
        setupEncoder(getAttachedSurfaceResolution(getCameraIdUnchecked(videoCaptureConfig.getLensFacing())));
        notifyReset();
        this.mEndOfAudioVideoSignal.set(true);
        return z2;
    }

    public void startRecording(final File file, final OnVideoSavedListener onVideoSavedListener, Metadata metadata) {
        int i;
        if (!this.mEndOfAudioVideoSignal.get()) {
            onVideoSavedListener.onError(UseCaseError.RECORDING_IN_PROGRESS, "It is still in video recording!", (Throwable) null);
            return;
        }
        try {
            this.mAudioRecorder.startRecording();
            String cameraIdUnchecked = getCameraIdUnchecked(((CameraDeviceConfig) getUseCaseConfig()).getLensFacing());
            try {
                this.mVideoEncoder.start();
                this.mAudioEncoder.start();
                try {
                    i = CameraX.getCameraInfo(cameraIdUnchecked).getSensorRotationDegrees(((ImageOutputConfig) getUseCaseConfig()).getTargetRotation(0));
                } catch (CameraInfoUnavailableException unused) {
                    i = 0;
                }
                try {
                    synchronized (this.mMuxerLock) {
                        MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                        this.mMuxer = mediaMuxer;
                        mediaMuxer.setOrientationHint(i);
                        if (metadata.location != null) {
                            this.mMuxer.setLocation((float) metadata.location.getLatitude(), (float) metadata.location.getLongitude());
                        }
                    }
                    this.mEndOfVideoStreamSignal.set(false);
                    this.mEndOfAudioStreamSignal.set(false);
                    this.mEndOfAudioVideoSignal.set(false);
                    this.mIsRecording = true;
                    notifyActive();
                    this.mAudioHandler.post(new Runnable() {
                        public void run() {
                            VideoCapture.this.audioEncode(onVideoSavedListener);
                        }
                    });
                    this.mVideoHandler.post(new Runnable() {
                        public void run() {
                            if (!VideoCapture.this.videoEncode(onVideoSavedListener)) {
                                onVideoSavedListener.onVideoSaved(file);
                            }
                        }
                    });
                } catch (IOException e) {
                    setupEncoder(getAttachedSurfaceResolution(cameraIdUnchecked));
                    onVideoSavedListener.onError(UseCaseError.MUXER_ERROR, "MediaMuxer creation failed!", e);
                }
            } catch (IllegalStateException e2) {
                setupEncoder(getAttachedSurfaceResolution(cameraIdUnchecked));
                onVideoSavedListener.onError(UseCaseError.ENCODER_ERROR, "Audio/Video encoder start fail", e2);
            }
        } catch (IllegalStateException e3) {
            onVideoSavedListener.onError(UseCaseError.ENCODER_ERROR, "AudioRecorder start fail", e3);
        }
    }
}
