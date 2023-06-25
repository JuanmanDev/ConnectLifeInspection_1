package androidx.camera.core;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraCaptureMetaData;
import androidx.camera.core.CameraCaptureResult;
import androidx.camera.core.CameraX;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.DeferrableSurface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureConfig;
import androidx.camera.core.ImageReaderProxy;
import androidx.camera.core.ImageSaver;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCaseConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FluentFuture;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public class ImageCapture extends UseCase {
    public static final long CHECK_3A_TIMEOUT_IN_MS = 1000;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public static final Metadata EMPTY_METADATA = new Metadata();
    public static final int MAX_IMAGES = 2;
    public static final String TAG = "ImageCapture";
    public final CaptureBundle mCaptureBundle;
    public final CaptureConfig mCaptureConfig;
    public final CaptureMode mCaptureMode;
    public final CaptureProcessor mCaptureProcessor;
    public ImageCaptureConfig mConfig;
    public DeferrableSurface mDeferrableSurface;
    public boolean mEnableCheck3AConverged;
    public final ExecutorService mExecutor = Executors.newFixedThreadPool(1, new ThreadFactory() {
        public final AtomicInteger mId = new AtomicInteger(0);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.mId.getAndIncrement());
        }
    });
    public FlashMode mFlashMode;
    public final Handler mHandler;
    public final ArrayDeque<ImageCaptureRequest> mImageCaptureRequests = new ArrayDeque<>();
    public ImageReaderProxy mImageReader;
    public final Handler mMainHandler = new Handler(Looper.getMainLooper());
    public final int mMaxCaptureStages;
    public CameraCaptureCallback mMetadataMatchingCaptureCallback;
    public final ForwardingImageProxy.OnImageCloseListener mOnImageCloseListener = new ForwardingImageProxy.OnImageCloseListener() {
        public void onImageClose(final ImageProxy imageProxy) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                ImageCapture.this.mMainHandler.post(new Runnable() {
                    public void run() {
                        C040011.this.onImageClose(imageProxy);
                    }
                });
                return;
            }
            ImageCapture.this.mImageCaptureRequests.poll();
            ImageCapture.this.issueImageCaptureRequests();
        }
    };
    public final CaptureCallbackChecker mSessionCallbackChecker = new CaptureCallbackChecker();
    public final SessionConfig.Builder mSessionConfigBuilder;
    public final ImageCaptureConfig.Builder mUseCaseConfigBuilder;

    /* renamed from: androidx.camera.core.ImageCapture$19 */
    public static /* synthetic */ class C041219 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$FlashMode;
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageSaver$SaveError;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|(2:5|6)|7|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.FlashMode[] r0 = androidx.camera.core.FlashMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$FlashMode = r0
                r1 = 1
                androidx.camera.core.FlashMode r2 = androidx.camera.core.FlashMode.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$FlashMode     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.FlashMode r2 = androidx.camera.core.FlashMode.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$core$FlashMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.FlashMode r2 = androidx.camera.core.FlashMode.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.camera.core.ImageSaver$SaveError[] r0 = androidx.camera.core.ImageSaver.SaveError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$ImageSaver$SaveError = r0
                androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.C041219.<clinit>():void");
        }
    }

    public static final class CaptureCallbackChecker extends CameraCaptureCallback {
        public static final long NO_TIMEOUT = 0;
        public final Set<CaptureResultListener> mCaptureResultListeners = new HashSet();

        public interface CaptureResultChecker<T> {
            @Nullable
            T check(@NonNull CameraCaptureResult cameraCaptureResult);
        }

        public interface CaptureResultListener {
            boolean onCaptureResult(@NonNull CameraCaptureResult cameraCaptureResult);
        }

        private void deliverCaptureResultToListeners(@NonNull CameraCaptureResult cameraCaptureResult) {
            synchronized (this.mCaptureResultListeners) {
                HashSet hashSet = null;
                Iterator it = new HashSet(this.mCaptureResultListeners).iterator();
                while (it.hasNext()) {
                    CaptureResultListener captureResultListener = (CaptureResultListener) it.next();
                    if (captureResultListener.onCaptureResult(cameraCaptureResult)) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(captureResultListener);
                    }
                }
                if (hashSet != null) {
                    this.mCaptureResultListeners.removeAll(hashSet);
                }
            }
        }

        public void addListener(CaptureResultListener captureResultListener) {
            synchronized (this.mCaptureResultListeners) {
                this.mCaptureResultListeners.add(captureResultListener);
            }
        }

        public <T> C6316e<T> checkCaptureResult(CaptureResultChecker<T> captureResultChecker) {
            return checkCaptureResult(captureResultChecker, 0, (Object) null);
        }

        public void onCaptureCompleted(@NonNull CameraCaptureResult cameraCaptureResult) {
            deliverCaptureResultToListeners(cameraCaptureResult);
        }

        public <T> C6316e<T> checkCaptureResult(CaptureResultChecker<T> captureResultChecker, long j, T t) {
            long j2 = 0;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    j2 = SystemClock.elapsedRealtime();
                }
                final long j3 = j2;
                final CaptureResultChecker<T> captureResultChecker2 = captureResultChecker;
                final long j4 = j;
                final T t2 = t;
                return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<T>() {
                    public Object attachCompleter(@NonNull final CallbackToFutureAdapter.Completer<T> completer) {
                        CaptureCallbackChecker.this.addListener(new CaptureResultListener() {
                            public boolean onCaptureResult(@NonNull CameraCaptureResult cameraCaptureResult) {
                                Object check = captureResultChecker2.check(cameraCaptureResult);
                                if (check != null) {
                                    completer.set(check);
                                    return true;
                                } else if (j3 <= 0) {
                                    return false;
                                } else {
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    C04211 r6 = C04211.this;
                                    if (elapsedRealtime - j3 <= j4) {
                                        return false;
                                    }
                                    completer.set(t2);
                                    return true;
                                }
                            }
                        });
                        return "checkCaptureResult";
                    }
                });
            }
            throw new IllegalArgumentException("Invalid timeout value: " + j);
        }
    }

    public enum CaptureMode {
        MAX_QUALITY,
        MIN_LATENCY
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {
        public static final CaptureMode DEFAULT_CAPTURE_MODE = CaptureMode.MIN_LATENCY;
        public static final ImageCaptureConfig DEFAULT_CONFIG = new ImageCaptureConfig.Builder().setCaptureMode(DEFAULT_CAPTURE_MODE).setFlashMode(DEFAULT_FLASH_MODE).setCallbackHandler(DEFAULT_HANDLER).setSurfaceOccupancyPriority(4).build();
        public static final FlashMode DEFAULT_FLASH_MODE = FlashMode.OFF;
        public static final Handler DEFAULT_HANDLER = new Handler(Looper.getMainLooper());
        public static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        public ImageCaptureConfig getConfig(CameraX.LensFacing lensFacing) {
            return DEFAULT_CONFIG;
        }
    }

    public final class ImageCaptureRequest {
        @Nullable
        public Handler mHandler;
        public OnImageCapturedListener mListener;
        public int mRotationDegrees;
        public Rational mTargetRatio;

        public ImageCaptureRequest(OnImageCapturedListener onImageCapturedListener, @Nullable Handler handler, int i, Rational rational) {
            this.mListener = onImageCapturedListener;
            this.mHandler = handler;
            this.mRotationDegrees = i;
            this.mTargetRatio = rational;
        }

        public void dispatchImage(final ImageProxy imageProxy) {
            if (this.mHandler == null || Looper.myLooper() == this.mHandler.getLooper()) {
                Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
                if (ImageUtil.isAspectRatioValid(size, this.mTargetRatio)) {
                    imageProxy.setCropRect(ImageUtil.computeCropRectFromAspectRatio(size, this.mTargetRatio));
                }
                this.mListener.onCaptureSuccess(imageProxy, this.mRotationDegrees);
            } else if (!this.mHandler.post(new Runnable() {
                public void run() {
                    ImageCaptureRequest.this.dispatchImage(imageProxy);
                }
            })) {
                imageProxy.close();
            }
        }
    }

    public static final class Metadata {
        public boolean isReversedHorizontal;
        public boolean isReversedVertical;
        @Nullable
        public Location location;
    }

    public static abstract class OnImageCapturedListener {
        public void onCaptureSuccess(ImageProxy imageProxy, int i) {
            imageProxy.close();
        }

        public void onError(UseCaseError useCaseError, String str, @Nullable Throwable th) {
        }
    }

    public interface OnImageSavedListener {
        void onError(@NonNull UseCaseError useCaseError, @NonNull String str, @Nullable Throwable th);

        void onImageSaved(@NonNull File file);
    }

    public static final class TakePictureState {
        public boolean mIsAePrecaptureTriggered = false;
        public boolean mIsAfTriggered = false;
        public boolean mIsFlashTriggered = false;
        public CameraCaptureResult mPreCaptureState = CameraCaptureResult.EmptyCameraCaptureResult.create();
    }

    public enum UseCaseError {
        UNKNOWN_ERROR,
        FILE_IO_ERROR
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.mUseCaseConfigBuilder = ImageCaptureConfig.Builder.fromConfig(imageCaptureConfig);
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) getUseCaseConfig();
        this.mConfig = imageCaptureConfig2;
        this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        this.mFlashMode = this.mConfig.getFlashMode();
        this.mCaptureProcessor = this.mConfig.getCaptureProcessor((CaptureProcessor) null);
        int maxCaptureStages = this.mConfig.getMaxCaptureStages(2);
        this.mMaxCaptureStages = maxCaptureStages;
        if (maxCaptureStages >= 1) {
            Integer bufferFormat = this.mConfig.getBufferFormat((Integer) null);
            if (bufferFormat != null) {
                if (this.mCaptureProcessor == null) {
                    setImageFormat(bufferFormat.intValue());
                } else {
                    throw new IllegalArgumentException("Cannot set buffer format with CaptureProcessor defined.");
                }
            } else if (this.mCaptureProcessor != null) {
                setImageFormat(35);
            } else {
                setImageFormat(ImageReaderFormatRecommender.chooseCombo().imageCaptureFormat());
            }
            this.mCaptureBundle = this.mConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            CaptureMode captureMode = this.mCaptureMode;
            if (captureMode == CaptureMode.MAX_QUALITY) {
                this.mEnableCheck3AConverged = true;
            } else if (captureMode == CaptureMode.MIN_LATENCY) {
                this.mEnableCheck3AConverged = false;
            }
            Handler callbackHandler = this.mConfig.getCallbackHandler((Handler) null);
            this.mHandler = callbackHandler;
            if (callbackHandler != null) {
                SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.mConfig);
                this.mSessionConfigBuilder = createFrom;
                createFrom.addRepeatingCameraCaptureCallback(this.mSessionCallbackChecker);
                this.mCaptureConfig = CaptureConfig.Builder.createFrom(this.mConfig).build();
                return;
            }
            throw new IllegalStateException("No default handler specified.");
        }
        throw new IllegalArgumentException("Maximum outstanding image count must be at least 1");
    }

    public static String getCameraIdUnchecked(CameraX.LensFacing lensFacing) {
        try {
            return CameraX.getCameraWithLensFacing(lensFacing);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get camera id for camera lens facing " + lensFacing, e);
        }
    }

    private CaptureBundle getCaptureBundle(CaptureBundle captureBundle) {
        List<CaptureStage> captureStages = this.mCaptureBundle.getCaptureStages();
        return (captureStages == null || captureStages.isEmpty()) ? captureBundle : CaptureBundles.createCaptureBundle(captureStages);
    }

    private CameraControl getCurrentCameraControl() {
        return getCameraControl(getCameraIdUnchecked(this.mConfig.getLensFacing()));
    }

    private C6316e<CameraCaptureResult> getPreCaptureStateIfNeeded() {
        if (this.mEnableCheck3AConverged || getFlashMode() == FlashMode.AUTO) {
            return this.mSessionCallbackChecker.checkCaptureResult(new CaptureCallbackChecker.CaptureResultChecker<CameraCaptureResult>() {
                public CameraCaptureResult check(@NonNull CameraCaptureResult cameraCaptureResult) {
                    return cameraCaptureResult;
                }
            });
        }
        return Futures.immediateFuture(null);
    }

    private C6316e<Void> preTakePicture(final TakePictureState takePictureState) {
        return FluentFuture.from(getPreCaptureStateIfNeeded()).transformAsync(new AsyncFunction<CameraCaptureResult, Boolean>() {
            public C6316e<Boolean> apply(CameraCaptureResult cameraCaptureResult) {
                TakePictureState takePictureState = takePictureState;
                takePictureState.mPreCaptureState = cameraCaptureResult;
                ImageCapture.this.triggerAfIfNeeded(takePictureState);
                if (ImageCapture.this.isFlashRequired(takePictureState)) {
                    TakePictureState takePictureState2 = takePictureState;
                    takePictureState2.mIsFlashTriggered = true;
                    ImageCapture.this.triggerAePrecapture(takePictureState2);
                }
                return ImageCapture.this.check3AConverged(takePictureState);
            }
        }, this.mExecutor).transform(new Function<Boolean, Void>() {
            public Void apply(Boolean bool) {
                return null;
            }
        }, this.mExecutor);
    }

    @UiThread
    private void sendImageCaptureRequest(OnImageCapturedListener onImageCapturedListener, @Nullable Handler handler) {
        int i = 0;
        try {
            i = CameraX.getCameraInfo(getCameraIdUnchecked(this.mConfig.getLensFacing())).getSensorRotationDegrees(this.mConfig.getTargetRotation(0));
        } catch (CameraInfoUnavailableException unused) {
        }
        int i2 = i;
        this.mImageCaptureRequests.offer(new ImageCaptureRequest(onImageCapturedListener, handler, i2, ImageUtil.rotate(this.mConfig.getTargetAspectRatio((Rational) null), i2)));
        if (this.mImageCaptureRequests.size() == 1) {
            issueImageCaptureRequests();
        }
    }

    private void takePictureInternal() {
        final TakePictureState takePictureState = new TakePictureState();
        FluentFuture.from(preTakePicture(takePictureState)).transformAsync(new AsyncFunction<Void, Void>() {
            public C6316e<Void> apply(Void voidR) {
                return ImageCapture.this.issueTakePicture();
            }
        }, this.mExecutor).transformAsync(new AsyncFunction<Void, Void>() {
            public C6316e<Void> apply(Void voidR) {
                return ImageCapture.this.postTakePicture(takePictureState);
            }
        }, this.mExecutor).addCallback(new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
            }

            public void onSuccess(Void voidR) {
            }
        }, this.mExecutor);
    }

    private void triggerAf(TakePictureState takePictureState) {
        takePictureState.mIsAfTriggered = true;
        getCurrentCameraControl().triggerAf();
    }

    public void cancelAfAeTrigger(TakePictureState takePictureState) {
        if (takePictureState.mIsAfTriggered || takePictureState.mIsAePrecaptureTriggered) {
            getCurrentCameraControl().cancelAfAeTrigger(takePictureState.mIsAfTriggered, takePictureState.mIsAePrecaptureTriggered);
            takePictureState.mIsAfTriggered = false;
            takePictureState.mIsAePrecaptureTriggered = false;
        }
    }

    public C6316e<Boolean> check3AConverged(TakePictureState takePictureState) {
        if (this.mEnableCheck3AConverged || takePictureState.mIsFlashTriggered) {
            return this.mSessionCallbackChecker.checkCaptureResult(new CaptureCallbackChecker.CaptureResultChecker<Boolean>() {
                public Boolean check(@NonNull CameraCaptureResult cameraCaptureResult) {
                    if ((cameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO || cameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.FOCUSED || cameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.LOCKED_FOCUSED || cameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED) && cameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.CONVERGED && cameraCaptureResult.getAwbState() == CameraCaptureMetaData.AwbState.CONVERGED) {
                        return Boolean.TRUE;
                    }
                    return null;
                }
            }, 1000, Boolean.FALSE);
        }
        return Futures.immediateFuture(Boolean.FALSE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void clear() {
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.setOnSurfaceDetachedListener(CameraXExecutors.mainThreadExecutor(), new DeferrableSurface.OnSurfaceDetachedListener() {
                public void onSurfaceDetached() {
                    ImageReaderProxy imageReaderProxy = ImageCapture.this.mImageReader;
                    if (imageReaderProxy != null) {
                        imageReaderProxy.close();
                        ImageCapture.this.mImageReader = null;
                    }
                }
            });
        }
        this.mExecutor.shutdown();
        super.clear();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getDefaultBuilder(CameraX.LensFacing lensFacing) {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) CameraX.getDefaultUseCaseConfig(ImageCaptureConfig.class, lensFacing);
        if (imageCaptureConfig != null) {
            return ImageCaptureConfig.Builder.fromConfig(imageCaptureConfig);
        }
        return null;
    }

    public FlashMode getFlashMode() {
        return this.mFlashMode;
    }

    public boolean isFlashRequired(TakePictureState takePictureState) {
        int i = C041219.$SwitchMap$androidx$camera$core$FlashMode[getFlashMode().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return false;
            }
            throw new AssertionError(getFlashMode());
        } else if (takePictureState.mPreCaptureState.getAeState() == CameraCaptureMetaData.AeState.FLASH_REQUIRED) {
            return true;
        } else {
            return false;
        }
    }

    @UiThread
    public void issueImageCaptureRequests() {
        if (!this.mImageCaptureRequests.isEmpty()) {
            takePictureInternal();
        }
    }

    public C6316e<Void> issueTakePicture() {
        CaptureBundle captureBundle;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (this.mCaptureProcessor != null) {
            captureBundle = getCaptureBundle((CaptureBundle) null);
            if (captureBundle == null) {
                throw new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle.");
            } else if (captureBundle.getCaptureStages().size() <= this.mMaxCaptureStages) {
                ((ProcessingImageReader) this.mImageReader).setCaptureBundle(captureBundle);
            } else {
                throw new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size");
            }
        } else {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle.getCaptureStages().size() > 1) {
                throw new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1.");
            }
        }
        for (final CaptureStage next : captureBundle.getCaptureStages()) {
            final CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks());
            builder.addSurface(this.mDeferrableSurface);
            builder.addImplementationOptions(next.getCaptureConfig().getImplementationOptions());
            builder.setTag(next.getCaptureConfig().getTag());
            builder.addCameraCaptureCallback(this.mMetadataMatchingCaptureCallback);
            arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<Void>() {
                public Object attachCompleter(@NonNull final CallbackToFutureAdapter.Completer<Void> completer) {
                    builder.addCameraCaptureCallback(new CameraCaptureCallback() {
                        public void onCaptureCompleted(@NonNull CameraCaptureResult cameraCaptureResult) {
                            completer.set(null);
                        }

                        public void onCaptureFailed(@NonNull CameraCaptureFailure cameraCaptureFailure) {
                            "capture picture get onCaptureFailed with reason " + cameraCaptureFailure.getReason();
                            completer.set(null);
                        }
                    });
                    arrayList2.add(builder.build());
                    return "issueTakePicture[stage=" + next.getId() + "]";
                }
            }));
        }
        getCurrentCameraControl().submitCaptureRequests(arrayList2);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<Void>() {
            public Object attachCompleter(@NonNull final CallbackToFutureAdapter.Completer<Void> completer) {
                Futures.addCallback(Futures.successfulAsList(arrayList), new FutureCallback<List<Void>>() {
                    public void onFailure(Throwable th) {
                        completer.setException(th);
                    }

                    public void onSuccess(@Nullable List<Void> list) {
                        completer.set(null);
                    }
                }, CameraXExecutors.directExecutor());
                return "issueTakePicture";
            }
        });
    }

    public void onCameraControlReady(String str) {
        getCameraControl(str).setFlashMode(this.mFlashMode);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<String, Size> onSuggestedResolutionUpdated(Map<String, Size> map) {
        String cameraIdUnchecked = getCameraIdUnchecked(this.mConfig.getLensFacing());
        Size size = map.get(cameraIdUnchecked);
        if (size != null) {
            ImageReaderProxy imageReaderProxy = this.mImageReader;
            if (imageReaderProxy != null) {
                if (imageReaderProxy.getHeight() == size.getHeight() && this.mImageReader.getWidth() == size.getWidth()) {
                    return map;
                }
                this.mImageReader.close();
            }
            if (this.mCaptureProcessor != null) {
                ProcessingImageReader processingImageReader = new ProcessingImageReader(size.getWidth(), size.getHeight(), getImageFormat(), this.mMaxCaptureStages, this.mHandler, getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle()), this.mCaptureProcessor);
                this.mMetadataMatchingCaptureCallback = processingImageReader.getCameraCaptureCallback();
                this.mImageReader = processingImageReader;
            } else {
                MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), getImageFormat(), 2, this.mHandler);
                this.mMetadataMatchingCaptureCallback = metadataImageReader.getCameraCaptureCallback();
                this.mImageReader = metadataImageReader;
            }
            this.mImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() {
                /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
                    return;
                 */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onImageAvailable(androidx.camera.core.ImageReaderProxy r3) {
                    /*
                        r2 = this;
                        androidx.camera.core.ImageProxy r3 = r3.acquireLatestImage()     // Catch:{ IllegalStateException -> 0x0028, all -> 0x0026 }
                        if (r3 == 0) goto L_0x0028
                        androidx.camera.core.ImageCapture r0 = androidx.camera.core.ImageCapture.this
                        java.util.ArrayDeque<androidx.camera.core.ImageCapture$ImageCaptureRequest> r0 = r0.mImageCaptureRequests
                        java.lang.Object r0 = r0.peek()
                        androidx.camera.core.ImageCapture$ImageCaptureRequest r0 = (androidx.camera.core.ImageCapture.ImageCaptureRequest) r0
                        if (r0 == 0) goto L_0x0022
                        androidx.camera.core.SingleCloseImageProxy r1 = new androidx.camera.core.SingleCloseImageProxy
                        r1.<init>(r3)
                        androidx.camera.core.ImageCapture r3 = androidx.camera.core.ImageCapture.this
                        androidx.camera.core.ForwardingImageProxy$OnImageCloseListener r3 = r3.mOnImageCloseListener
                        r1.addOnImageCloseListener(r3)
                        r0.dispatchImage(r1)
                        goto L_0x0028
                    L_0x0022:
                        r3.close()
                        goto L_0x0028
                    L_0x0026:
                        r3 = move-exception
                        throw r3
                    L_0x0028:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.C039910.onImageAvailable(androidx.camera.core.ImageReaderProxy):void");
                }
            }, this.mMainHandler);
            this.mSessionConfigBuilder.clearSurfaces();
            ImmediateSurface immediateSurface = new ImmediateSurface(this.mImageReader.getSurface());
            this.mDeferrableSurface = immediateSurface;
            this.mSessionConfigBuilder.addNonRepeatingSurface(immediateSurface);
            attachToCamera(cameraIdUnchecked, this.mSessionConfigBuilder.build());
            notifyActive();
            return map;
        }
        throw new IllegalArgumentException("Suggested resolution map missing resolution for camera " + cameraIdUnchecked);
    }

    public C6316e<Void> postTakePicture(final TakePictureState takePictureState) {
        final ExecutorService executorService = this.mExecutor;
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<Void>() {
            public Object attachCompleter(@NonNull final CallbackToFutureAdapter.Completer<Void> completer) {
                executorService.execute(new Runnable() {
                    public void run() {
                        C040414 r0 = C040414.this;
                        ImageCapture.this.cancelAfAeTrigger(takePictureState);
                        completer.set(null);
                    }
                });
                return "postTakePicture[state=" + takePictureState + "]";
            }
        });
    }

    public void setFlashMode(FlashMode flashMode) {
        this.mFlashMode = flashMode;
        getCurrentCameraControl().setFlashMode(flashMode);
    }

    public void setTargetAspectRatio(Rational rational) {
        if (!rational.equals(((ImageOutputConfig) getUseCaseConfig()).getTargetAspectRatio((Rational) null))) {
            this.mUseCaseConfigBuilder.setTargetAspectRatio(rational);
            updateUseCaseConfig(this.mUseCaseConfigBuilder.build());
            this.mConfig = (ImageCaptureConfig) getUseCaseConfig();
        }
    }

    public void setTargetRotation(int i) {
        int targetRotation = ((ImageOutputConfig) getUseCaseConfig()).getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i) {
            this.mUseCaseConfigBuilder.setTargetRotation(i);
            updateUseCaseConfig(this.mUseCaseConfigBuilder.build());
            this.mConfig = (ImageCaptureConfig) getUseCaseConfig();
        }
    }

    public void takePicture(final OnImageCapturedListener onImageCapturedListener) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    ImageCapture.this.takePicture(onImageCapturedListener);
                }
            });
        } else {
            sendImageCaptureRequest(onImageCapturedListener, this.mHandler);
        }
    }

    public String toString() {
        return "ImageCapture:" + getName();
    }

    public void triggerAePrecapture(TakePictureState takePictureState) {
        takePictureState.mIsAePrecaptureTriggered = true;
        getCurrentCameraControl().triggerAePrecapture();
    }

    public void triggerAfIfNeeded(TakePictureState takePictureState) {
        if (this.mEnableCheck3AConverged && takePictureState.mPreCaptureState.getAfMode() == CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO && takePictureState.mPreCaptureState.getAfState() == CameraCaptureMetaData.AfState.INACTIVE) {
            triggerAf(takePictureState);
        }
    }

    public void takePicture(File file, OnImageSavedListener onImageSavedListener) {
        takePicture(file, onImageSavedListener, EMPTY_METADATA);
    }

    public void takePicture(final File file, final OnImageSavedListener onImageSavedListener, final Metadata metadata) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    ImageCapture.this.takePicture(file, onImageSavedListener, metadata);
                }
            });
            return;
        }
        final C04154 r6 = new ImageSaver.OnImageSavedListener() {
            public void onError(ImageSaver.SaveError saveError, String str, @Nullable Throwable th) {
                UseCaseError useCaseError = UseCaseError.UNKNOWN_ERROR;
                if (C041219.$SwitchMap$androidx$camera$core$ImageSaver$SaveError[saveError.ordinal()] == 1) {
                    useCaseError = UseCaseError.FILE_IO_ERROR;
                }
                onImageSavedListener.onError(useCaseError, str, th);
            }

            public void onImageSaved(File file) {
                onImageSavedListener.onImageSaved(file);
            }
        };
        final File file2 = file;
        final Metadata metadata2 = metadata;
        final OnImageSavedListener onImageSavedListener2 = onImageSavedListener;
        sendImageCaptureRequest(new OnImageCapturedListener() {
            public void onCaptureSuccess(ImageProxy imageProxy, int i) {
                ImageCapture imageCapture = ImageCapture.this;
                Handler handler = imageCapture.mHandler;
                if (handler == null) {
                    handler = imageCapture.mMainHandler;
                }
                Executor ioExecutor = CameraXExecutors.ioExecutor();
                File file = file2;
                Metadata metadata = metadata2;
                ImageProxy imageProxy2 = imageProxy;
                int i2 = i;
                ioExecutor.execute(new ImageSaver(imageProxy2, file, i2, metadata.isReversedHorizontal, metadata.isReversedVertical, metadata.location, r6, handler));
            }

            public void onError(UseCaseError useCaseError, String str, @Nullable Throwable th) {
                onImageSavedListener2.onError(useCaseError, str, th);
            }
        }, this.mMainHandler);
    }
}
