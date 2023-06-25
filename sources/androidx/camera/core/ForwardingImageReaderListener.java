package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.GuardedBy;
import androidx.camera.core.ImageProxyDownsampler;
import java.util.Collections;
import java.util.List;

public final class ForwardingImageReaderListener implements ImageReader.OnImageAvailableListener {
    @GuardedBy("this")
    public final List<QueuedImageReaderProxy> mImageReaders;

    public ForwardingImageReaderListener(List<QueuedImageReaderProxy> list) {
        this.mImageReaders = Collections.unmodifiableList(list);
    }

    public synchronized void onImageAvailable(ImageReader imageReader) {
        ReferenceCountedImageProxy referenceCountedImageProxy = new ReferenceCountedImageProxy(new AndroidImageProxy(imageReader.acquireNextImage()));
        for (QueuedImageReaderProxy next : this.mImageReaders) {
            synchronized (next) {
                if (!next.isClosed()) {
                    next.enqueueImage(ImageProxyDownsampler.downsample(referenceCountedImageProxy.fork(), next.getWidth(), next.getHeight(), ImageProxyDownsampler.DownsamplingMethod.AVERAGING));
                }
            }
        }
        referenceCountedImageProxy.close();
    }
}
