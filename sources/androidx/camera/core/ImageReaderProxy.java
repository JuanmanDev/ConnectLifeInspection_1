package androidx.camera.core;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ImageReaderProxy {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnImageAvailableListener {
        void onImageAvailable(ImageReaderProxy imageReaderProxy);
    }

    @Nullable
    ImageProxy acquireLatestImage();

    @Nullable
    ImageProxy acquireNextImage();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(@Nullable OnImageAvailableListener onImageAvailableListener, @Nullable Handler handler);
}
