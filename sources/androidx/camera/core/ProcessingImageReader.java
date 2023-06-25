package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.List;

public class ProcessingImageReader implements ImageReaderProxy {
    public static final String TAG = "ProcessingImageReader";
    public final List<Integer> mCaptureIdList = new ArrayList();
    @NonNull
    public CaptureProcessor mCaptureProcessor;
    public FutureCallback<List<ImageProxy>> mCaptureStageReadyCallback = new FutureCallback<List<ImageProxy>>() {
        public void onFailure(Throwable th) {
        }

        public void onSuccess(@Nullable List<ImageProxy> list) {
            ProcessingImageReader processingImageReader = ProcessingImageReader.this;
            processingImageReader.mCaptureProcessor.process(processingImageReader.mSettableImageProxyBundle);
        }
    };
    @GuardedBy("mLock")
    public boolean mClosed = false;
    @GuardedBy("mLock")
    @Nullable
    public Handler mHandler;
    public ImageReader.OnImageAvailableListener mImageProcessedListener = new ImageReader.OnImageAvailableListener() {
        public void onImageAvailable(ImageReader imageReader) {
            ProcessingImageReader processingImageReader = ProcessingImageReader.this;
            Handler handler = processingImageReader.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    public void run() {
                        ProcessingImageReader processingImageReader = ProcessingImageReader.this;
                        processingImageReader.mListener.onImageAvailable(processingImageReader);
                    }
                });
            } else {
                processingImageReader.mListener.onImageAvailable(processingImageReader);
            }
            ProcessingImageReader.this.mSettableImageProxyBundle.reset();
            ProcessingImageReader.this.setupSettableImageProxyBundleCallbacks();
        }
    };
    @GuardedBy("mLock")
    public final ImageReaderProxy mInputImageReader;
    @GuardedBy("mLock")
    @Nullable
    public ImageReaderProxy.OnImageAvailableListener mListener;
    public final Object mLock = new Object();
    @GuardedBy("mLock")
    public final ImageReader mOutputImageReader;
    @GuardedBy("mLock")
    public SettableImageProxyBundle mSettableImageProxyBundle = null;
    public ImageReaderProxy.OnImageAvailableListener mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() {
        public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
            ProcessingImageReader.this.imageIncoming(imageReaderProxy);
        }
    };

    public ProcessingImageReader(int i, int i2, int i3, int i4, @Nullable Handler handler, @NonNull CaptureBundle captureBundle, @NonNull CaptureProcessor captureProcessor) {
        this.mInputImageReader = new MetadataImageReader(i, i2, i3, i4, handler);
        this.mOutputImageReader = ImageReader.newInstance(i, i2, i3, i4);
        init(handler, captureBundle, captureProcessor);
    }

    private void init(@Nullable Handler handler, @NonNull CaptureBundle captureBundle, @NonNull CaptureProcessor captureProcessor) {
        this.mHandler = handler;
        this.mInputImageReader.setOnImageAvailableListener(this.mTransformedListener, handler);
        this.mOutputImageReader.setOnImageAvailableListener(this.mImageProcessedListener, handler);
        this.mCaptureProcessor = captureProcessor;
        captureProcessor.onOutputSurface(this.mOutputImageReader.getSurface(), getImageFormat());
        this.mCaptureProcessor.onResolutionUpdate(new Size(this.mInputImageReader.getWidth(), this.mInputImageReader.getHeight()));
        setCaptureBundle(captureBundle);
    }

    @Nullable
    public ImageProxy acquireLatestImage() {
        synchronized (this.mLock) {
            Image acquireLatestImage = this.mOutputImageReader.acquireLatestImage();
            if (acquireLatestImage == null) {
                return null;
            }
            AndroidImageProxy androidImageProxy = new AndroidImageProxy(acquireLatestImage);
            return androidImageProxy;
        }
    }

    @Nullable
    public ImageProxy acquireNextImage() {
        synchronized (this.mLock) {
            Image acquireNextImage = this.mOutputImageReader.acquireNextImage();
            if (acquireNextImage == null) {
                return null;
            }
            AndroidImageProxy androidImageProxy = new AndroidImageProxy(acquireNextImage);
            return androidImageProxy;
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mInputImageReader.close();
                this.mOutputImageReader.close();
                this.mSettableImageProxyBundle.close();
                this.mClosed = true;
            }
        }
    }

    @Nullable
    public CameraCaptureCallback getCameraCaptureCallback() {
        ImageReaderProxy imageReaderProxy = this.mInputImageReader;
        if (imageReaderProxy instanceof MetadataImageReader) {
            return ((MetadataImageReader) imageReaderProxy).getCameraCaptureCallback();
        }
        return null;
    }

    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mInputImageReader.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mInputImageReader.getImageFormat();
        }
        return imageFormat;
    }

    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mInputImageReader.getMaxImages();
        }
        return maxImages;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mInputImageReader.getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mInputImageReader.getWidth();
        }
        return width;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void imageIncoming(androidx.camera.core.ImageReaderProxy r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            boolean r1 = r4.mClosed     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0009:
            androidx.camera.core.ImageProxy r5 = r5.acquireNextImage()     // Catch:{ IllegalStateException -> 0x003e, all -> 0x003c }
            if (r5 == 0) goto L_0x003e
            androidx.camera.core.ImageInfo r1 = r5.getImageInfo()     // Catch:{ all -> 0x0040 }
            java.lang.Object r1 = r1.getTag()     // Catch:{ all -> 0x0040 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0040 }
            java.util.List<java.lang.Integer> r2 = r4.mCaptureIdList     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.contains(r1)     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0036
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0040 }
            r2.<init>()     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = "ImageProxyBundle does not contain this id: "
            r2.append(r3)     // Catch:{ all -> 0x0040 }
            r2.append(r1)     // Catch:{ all -> 0x0040 }
            r2.toString()     // Catch:{ all -> 0x0040 }
            r5.close()     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0036:
            androidx.camera.core.SettableImageProxyBundle r1 = r4.mSettableImageProxyBundle     // Catch:{ all -> 0x0040 }
            r1.addImageProxy(r5)     // Catch:{ all -> 0x0040 }
            goto L_0x003e
        L_0x003c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ProcessingImageReader.imageIncoming(androidx.camera.core.ImageReaderProxy):void");
    }

    public void setCaptureBundle(@NonNull CaptureBundle captureBundle) {
        synchronized (this.mLock) {
            if (captureBundle.getCaptureStages() != null) {
                if (this.mInputImageReader.getMaxImages() >= captureBundle.getCaptureStages().size()) {
                    this.mCaptureIdList.clear();
                    for (CaptureStage next : captureBundle.getCaptureStages()) {
                        if (next != null) {
                            this.mCaptureIdList.add(Integer.valueOf(next.getId()));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is lager than InputImageReader.");
                }
            }
            this.mSettableImageProxyBundle = new SettableImageProxyBundle(this.mCaptureIdList);
            setupSettableImageProxyBundleCallbacks();
        }
    }

    public void setOnImageAvailableListener(@Nullable ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @Nullable Handler handler) {
        synchronized (this.mLock) {
            this.mListener = onImageAvailableListener;
            this.mHandler = handler;
            this.mInputImageReader.setOnImageAvailableListener(this.mTransformedListener, handler);
            this.mOutputImageReader.setOnImageAvailableListener(this.mImageProcessedListener, handler);
        }
    }

    public void setupSettableImageProxyBundleCallbacks() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.mCaptureIdList) {
            arrayList.add(this.mSettableImageProxyBundle.getImageProxy(intValue.intValue()));
        }
        Futures.addCallback(Futures.allAsList(arrayList), this.mCaptureStageReadyCallback, CameraXExecutors.directExecutor());
    }

    public ProcessingImageReader(ImageReaderProxy imageReaderProxy, @Nullable Handler handler, @NonNull CaptureBundle captureBundle, @NonNull CaptureProcessor captureProcessor) {
        if (imageReaderProxy.getMaxImages() >= captureBundle.getCaptureStages().size()) {
            this.mInputImageReader = imageReaderProxy;
            this.mOutputImageReader = ImageReader.newInstance(imageReaderProxy.getWidth(), imageReaderProxy.getHeight(), imageReaderProxy.getImageFormat(), imageReaderProxy.getMaxImages());
            init(handler, captureBundle, captureProcessor);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }
}
