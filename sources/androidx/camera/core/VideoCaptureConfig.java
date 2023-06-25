package androidx.camera.core;

import android.os.Handler;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraDeviceConfig;
import androidx.camera.core.CameraX;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.Config;
import androidx.camera.core.ImageOutputConfig;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.ThreadConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseConfig;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.Set;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class VideoCaptureConfig implements UseCaseConfig<VideoCapture>, ImageOutputConfig, CameraDeviceConfig, ThreadConfig {
    public static final Config.Option<Integer> OPTION_AUDIO_BIT_RATE = Config.Option.create("camerax.core.videoCapture.audioBitRate", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_CHANNEL_COUNT = Config.Option.create("camerax.core.videoCapture.audioChannelCount", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_MIN_BUFFER_SIZE = Config.Option.create("camerax.core.videoCapture.audioMinBufferSize", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_RECORD_SOURCE = Config.Option.create("camerax.core.videoCapture.audioRecordSource", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_SAMPLE_RATE = Config.Option.create("camerax.core.videoCapture.audioSampleRate", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_BIT_RATE = Config.Option.create("camerax.core.videoCapture.bitRate", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_INTRA_FRAME_INTERVAL = Config.Option.create("camerax.core.videoCapture.intraFrameInterval", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_VIDEO_FRAME_RATE = Config.Option.create("camerax.core.videoCapture.recordingFrameRate", Integer.TYPE);
    public final OptionsBundle mConfig;

    public static final class Builder implements UseCaseConfig.Builder<VideoCapture, VideoCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, CameraDeviceConfig.Builder<Builder>, ThreadConfig.Builder<Builder> {
        public final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(VideoCaptureConfig videoCaptureConfig) {
            return new Builder(MutableOptionsBundle.from(videoCaptureConfig));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioBitRate(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_BIT_RATE, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioChannelCount(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioMinBufferSize(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioRecordSource(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_RECORD_SOURCE, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioSampleRate(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i));
            return this;
        }

        public Builder setBitRate(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_BIT_RATE, Integer.valueOf(i));
            return this;
        }

        public Builder setIFrameInterval(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i));
            return this;
        }

        public Builder setVideoFrameRate(int i) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i));
            return this;
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<VideoCapture> cls = VideoCapture.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public VideoCaptureConfig build() {
            return new VideoCaptureConfig(OptionsBundle.from(this.mMutableConfig));
        }

        public Builder setCallbackHandler(Handler handler) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_CALLBACK_HANDLER, handler);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        public Builder setLensFacing(CameraX.LensFacing lensFacing) {
            getMutableConfig().insertOption(CameraDeviceConfig.OPTION_LENS_FACING, lensFacing);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetAspectRatio(Rational rational) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, rational);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetClass(Class<VideoCapture> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setUseCaseEventListener(UseCase.EventListener eventListener) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_LISTENER, eventListener);
            return this;
        }
    }

    public VideoCaptureConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean containsOption(Config.Option<?> option) {
        return this.mConfig.containsOption(option);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void findOptions(String str, Config.OptionMatcher optionMatcher) {
        this.mConfig.findOptions(str, optionMatcher);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioBitRate(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_BIT_RATE, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioChannelCount(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioMinBufferSize(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioRecordSource(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_RECORD_SOURCE, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioSampleRate(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i))).intValue();
    }

    public int getBitRate(int i) {
        return ((Integer) retrieveOption(OPTION_BIT_RATE, Integer.valueOf(i))).intValue();
    }

    @Nullable
    public Handler getCallbackHandler(@Nullable Handler handler) {
        return (Handler) retrieveOption(ThreadConfig.OPTION_CALLBACK_HANDLER, handler);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(@Nullable CaptureConfig.OptionUnpacker optionUnpacker) {
        return (CaptureConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig getDefaultCaptureConfig(@Nullable CaptureConfig captureConfig) {
        return (CaptureConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig getDefaultSessionConfig(@Nullable SessionConfig sessionConfig) {
        return (SessionConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    public int getIFrameInterval(int i) {
        return ((Integer) retrieveOption(OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i))).intValue();
    }

    @Nullable
    public CameraX.LensFacing getLensFacing(@Nullable CameraX.LensFacing lensFacing) {
        return (CameraX.LensFacing) retrieveOption(CameraDeviceConfig.OPTION_LENS_FACING, lensFacing);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size getMaxResolution(Size size) {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig.OptionUnpacker getSessionOptionUnpacker(@Nullable SessionConfig.OptionUnpacker optionUnpacker) {
        return (SessionConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getSurfaceOccupancyPriority(int i) {
        return ((Integer) retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i))).intValue();
    }

    @Nullable
    public Rational getTargetAspectRatio(@Nullable Rational rational) {
        return (Rational) retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, rational);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Class<VideoCapture> getTargetClass(@Nullable Class<VideoCapture> cls) {
        return (Class) retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
    }

    @Nullable
    public String getTargetName(@Nullable String str) {
        return (String) retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size getTargetResolution(Size size) {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
    }

    public int getTargetRotation(int i) {
        return ((Integer) retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCase.EventListener getUseCaseEventListener(@Nullable UseCase.EventListener eventListener) {
        return (UseCase.EventListener) retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_LISTENER, eventListener);
    }

    public int getVideoFrameRate(int i) {
        return ((Integer) retrieveOption(OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Config.Option<?>> listOptions() {
        return this.mConfig.listOptions();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option) {
        return this.mConfig.retrieveOption(option);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioBitRate() {
        return ((Integer) retrieveOption(OPTION_AUDIO_BIT_RATE)).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioChannelCount() {
        return ((Integer) retrieveOption(OPTION_AUDIO_CHANNEL_COUNT)).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioMinBufferSize() {
        return ((Integer) retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE)).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioRecordSource() {
        return ((Integer) retrieveOption(OPTION_AUDIO_RECORD_SOURCE)).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAudioSampleRate() {
        return ((Integer) retrieveOption(OPTION_AUDIO_SAMPLE_RATE)).intValue();
    }

    public int getBitRate() {
        return ((Integer) retrieveOption(OPTION_BIT_RATE)).intValue();
    }

    public Handler getCallbackHandler() {
        return (Handler) retrieveOption(ThreadConfig.OPTION_CALLBACK_HANDLER);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return (CaptureConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig getDefaultCaptureConfig() {
        return (CaptureConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig getDefaultSessionConfig() {
        return (SessionConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
    }

    public int getIFrameInterval() {
        return ((Integer) retrieveOption(OPTION_INTRA_FRAME_INTERVAL)).intValue();
    }

    public CameraX.LensFacing getLensFacing() {
        return (CameraX.LensFacing) retrieveOption(CameraDeviceConfig.OPTION_LENS_FACING);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size getMaxResolution() {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return (SessionConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getSurfaceOccupancyPriority() {
        return ((Integer) retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    public Rational getTargetAspectRatio() {
        return (Rational) retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
    }

    public String getTargetName() {
        return (String) retrieveOption(TargetConfig.OPTION_TARGET_NAME);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size getTargetResolution() {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION);
    }

    public int getTargetRotation() {
        return ((Integer) retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION)).intValue();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCase.EventListener getUseCaseEventListener() {
        return (UseCase.EventListener) retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_LISTENER);
    }

    public int getVideoFrameRate() {
        return ((Integer) retrieveOption(OPTION_VIDEO_FRAME_RATE)).intValue();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, @Nullable ValueT valuet) {
        return this.mConfig.retrieveOption(option, valuet);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Class<VideoCapture> getTargetClass() {
        return (Class) retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
    }
}
