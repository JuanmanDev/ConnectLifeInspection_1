package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public final class SingleImageProxyBundle implements ImageProxyBundle {
    public final int mCaptureId;
    public final ImageProxy mImageProxy;

    public SingleImageProxyBundle(@NonNull ImageProxy imageProxy) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo != null) {
            Object tag = imageInfo.getTag();
            if (tag == null) {
                throw new IllegalArgumentException("ImageProxy has no associated tag");
            } else if (tag instanceof Integer) {
                this.mCaptureId = ((Integer) tag).intValue();
                this.mImageProxy = imageProxy;
            } else {
                throw new IllegalArgumentException("ImageProxy has tag that isn't an integer");
            }
        } else {
            throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
    }

    public void close() {
        this.mImageProxy.close();
    }

    public List<Integer> getCaptureIds() {
        return Collections.singletonList(Integer.valueOf(this.mCaptureId));
    }

    public C6316e<ImageProxy> getImageProxy(int i) {
        if (i != this.mCaptureId) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return Futures.immediateFuture(this.mImageProxy);
    }

    public SingleImageProxyBundle(@NonNull ImageProxy imageProxy, int i) {
        this.mCaptureId = i;
        this.mImageProxy = imageProxy;
    }
}
