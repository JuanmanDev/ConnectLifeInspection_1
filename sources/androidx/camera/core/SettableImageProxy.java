package androidx.camera.core;

public final class SettableImageProxy extends ForwardingImageProxy {
    public final ImageInfo mImageInfo;

    public SettableImageProxy(ImageProxy imageProxy, ImageInfo imageInfo) {
        super(imageProxy);
        this.mImageInfo = imageInfo;
    }

    public ImageInfo getImageInfo() {
        return this.mImageInfo;
    }
}
