package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

public interface ImageProxy extends AutoCloseable {

    public interface PlaneProxy {
        ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    void close();

    Rect getCropRect();

    int getFormat();

    int getHeight();

    @Nullable
    Image getImage();

    @Nullable
    ImageInfo getImageInfo();

    PlaneProxy[] getPlanes();

    long getTimestamp();

    int getWidth();

    void setCropRect(Rect rect);

    void setTimestamp(long j);
}
