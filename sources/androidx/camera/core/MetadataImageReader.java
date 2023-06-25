package androidx.camera.core;

import android.media.ImageReader;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageReaderProxy;
import java.util.ArrayList;
import java.util.List;

public class MetadataImageReader implements ImageReaderProxy, ForwardingImageProxy.OnImageCloseListener {
    public static final String TAG = "MetadataImageReader";
    @GuardedBy("mLock")
    public final List<ImageProxy> mAcquiredImageProxies = new ArrayList();
    public CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() {
        public void onCaptureCompleted(@NonNull CameraCaptureResult cameraCaptureResult) {
            super.onCaptureCompleted(cameraCaptureResult);
            MetadataImageReader.this.resultIncoming(cameraCaptureResult);
        }
    };
    @GuardedBy("mLock")
    public boolean mClosed = false;
    @GuardedBy("mLock")
    @Nullable
    public Handler mHandler;
    @GuardedBy("mLock")
    public int mImageProxiesIndex;
    @GuardedBy("mLock")
    public final ImageReaderProxy mImageReaderProxy;
    @GuardedBy("mLock")
    @Nullable
    public ImageReaderProxy.OnImageAvailableListener mListener;
    public final Object mLock = new Object();
    @GuardedBy("mLock")
    public List<ImageProxy> mMatchedImageProxies;
    @GuardedBy("mLock")
    public final LongSparseArray<ImageInfo> mPendingImageInfos = new LongSparseArray<>();
    @GuardedBy("mLock")
    public final LongSparseArray<ImageProxy> mPendingImages = new LongSparseArray<>();
    public ImageReaderProxy.OnImageAvailableListener mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() {
        public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
            MetadataImageReader.this.imageIncoming(imageReaderProxy);
        }
    };

    public MetadataImageReader(int i, int i2, int i3, int i4, @Nullable Handler handler) {
        this.mImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
        init(handler);
    }

    private void dequeImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            int indexOf = this.mMatchedImageProxies.indexOf(imageProxy);
            if (indexOf >= 0) {
                this.mMatchedImageProxies.remove(indexOf);
                if (indexOf <= this.mImageProxiesIndex) {
                    this.mImageProxiesIndex--;
                }
            }
            this.mAcquiredImageProxies.remove(imageProxy);
        }
    }

    private void enqueueImageProxy(SettableImageProxy settableImageProxy) {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.size() < getMaxImages()) {
                settableImageProxy.addOnImageCloseListener(this);
                this.mMatchedImageProxies.add(settableImageProxy);
                if (this.mListener != null) {
                    if (this.mHandler != null) {
                        this.mHandler.post(new Runnable() {
                            public void run() {
                                MetadataImageReader metadataImageReader = MetadataImageReader.this;
                                metadataImageReader.mListener.onImageAvailable(metadataImageReader);
                            }
                        });
                    } else {
                        this.mListener.onImageAvailable(this);
                    }
                }
            } else {
                settableImageProxy.close();
            }
        }
    }

    private void init(Handler handler) {
        this.mHandler = handler;
        this.mImageReaderProxy.setOnImageAvailableListener(this.mTransformedListener, handler);
        this.mImageProxiesIndex = 0;
        this.mMatchedImageProxies = new ArrayList(getMaxImages());
    }

    private void matchImages() {
        synchronized (this.mLock) {
            for (int size = this.mPendingImageInfos.size() - 1; size >= 0; size--) {
                ImageInfo valueAt = this.mPendingImageInfos.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                ImageProxy imageProxy = this.mPendingImages.get(timestamp);
                if (imageProxy != null) {
                    this.mPendingImages.remove(timestamp);
                    this.mPendingImageInfos.removeAt(size);
                    enqueueImageProxy(new SettableImageProxy(imageProxy, valueAt));
                }
            }
            removeStaleData();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void removeStaleData() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.mLock
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r1 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0015
            goto L_0x008c
        L_0x0015:
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r3 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            boolean r4 = r3.equals(r1)     // Catch:{ all -> 0x008e }
            r5 = 1
            if (r4 != 0) goto L_0x0032
            r2 = r5
        L_0x0032:
            androidx.core.util.Preconditions.checkArgument(r2)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            long r8 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            int r1 = r1 - r5
        L_0x0048:
            if (r1 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            long r4 = r2.keyAt(r1)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x008e }
            androidx.camera.core.ImageProxy r2 = (androidx.camera.core.ImageProxy) r2     // Catch:{ all -> 0x008e }
            r2.close()     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r10.mPendingImages     // Catch:{ all -> 0x008e }
            r2.removeAt(r1)     // Catch:{ all -> 0x008e }
        L_0x0068:
            int r1 = r1 + -1
            goto L_0x0048
        L_0x006b:
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r2 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            int r2 = r2.size()     // Catch:{ all -> 0x008e }
            int r2 = r2 - r5
        L_0x0072:
            if (r2 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r3 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0087
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r3 = r10.mPendingImageInfos     // Catch:{ all -> 0x008e }
            r3.removeAt(r2)     // Catch:{ all -> 0x008e }
        L_0x0087:
            int r2 = r2 + -1
            goto L_0x0072
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.MetadataImageReader.removeStaleData():void");
    }

    @Nullable
    public ImageProxy acquireLatestImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex < this.mMatchedImageProxies.size()) {
                ArrayList<ImageProxy> arrayList = new ArrayList<>();
                for (int i = 0; i < this.mMatchedImageProxies.size() - 1; i++) {
                    if (!this.mAcquiredImageProxies.contains(this.mMatchedImageProxies.get(i))) {
                        arrayList.add(this.mMatchedImageProxies.get(i));
                    }
                }
                for (ImageProxy close : arrayList) {
                    close.close();
                }
                int size = this.mMatchedImageProxies.size() - 1;
                this.mImageProxiesIndex = size;
                List<ImageProxy> list = this.mMatchedImageProxies;
                this.mImageProxiesIndex = size + 1;
                ImageProxy imageProxy = list.get(size);
                this.mAcquiredImageProxies.add(imageProxy);
                return imageProxy;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Nullable
    public ImageProxy acquireNextImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex < this.mMatchedImageProxies.size()) {
                List<ImageProxy> list = this.mMatchedImageProxies;
                int i = this.mImageProxiesIndex;
                this.mImageProxiesIndex = i + 1;
                ImageProxy imageProxy = list.get(i);
                this.mAcquiredImageProxies.add(imageProxy);
                return imageProxy;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                for (ImageProxy close : new ArrayList(this.mMatchedImageProxies)) {
                    close.close();
                }
                this.mMatchedImageProxies.clear();
                this.mImageReaderProxy.close();
                this.mClosed = true;
            }
        }
    }

    public CameraCaptureCallback getCameraCaptureCallback() {
        return this.mCameraCaptureCallback;
    }

    @Nullable
    public Handler getHandler() {
        return this.mHandler;
    }

    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void imageIncoming(androidx.camera.core.ImageReaderProxy r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            boolean r1 = r6.mClosed     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x0009:
            r1 = 0
        L_0x000a:
            r2 = 0
            androidx.camera.core.ImageProxy r2 = r7.acquireNextImage()     // Catch:{ IllegalStateException -> 0x0022, all -> 0x0020 }
            if (r2 == 0) goto L_0x0022
            int r1 = r1 + 1
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r3 = r6.mPendingImages     // Catch:{ all -> 0x002c }
            long r4 = r2.getTimestamp()     // Catch:{ all -> 0x002c }
            r3.put(r4, r2)     // Catch:{ all -> 0x002c }
            r6.matchImages()     // Catch:{ all -> 0x002c }
            goto L_0x0022
        L_0x0020:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x002c }
        L_0x0022:
            if (r2 == 0) goto L_0x002a
            int r2 = r7.getMaxImages()     // Catch:{ all -> 0x002c }
            if (r1 < r2) goto L_0x000a
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.MetadataImageReader.imageIncoming(androidx.camera.core.ImageReaderProxy):void");
    }

    public void onImageClose(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            dequeImageProxy(imageProxy);
        }
    }

    public void resultIncoming(CameraCaptureResult cameraCaptureResult) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mPendingImageInfos.put(cameraCaptureResult.getTimestamp(), new CameraCaptureResultImageInfo(cameraCaptureResult));
                matchImages();
            }
        }
    }

    public void setOnImageAvailableListener(@Nullable ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @Nullable Handler handler) {
        synchronized (this.mLock) {
            this.mListener = onImageAvailableListener;
            this.mHandler = handler;
            this.mImageReaderProxy.setOnImageAvailableListener(this.mTransformedListener, handler);
        }
    }

    public MetadataImageReader(ImageReaderProxy imageReaderProxy, @Nullable Handler handler) {
        this.mImageReaderProxy = imageReaderProxy;
        init(handler);
    }
}
