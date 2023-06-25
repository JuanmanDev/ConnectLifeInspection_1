package androidx.camera.core;

import android.media.ImageReader;
import android.os.Handler;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.QueuedImageReaderProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ImageReaderProxys {
    public static final int SHARED_IMAGE_FORMAT = 35;
    public static final int SHARED_MAX_IMAGES = 8;
    public static final String TAG = "ImageReaderProxys";
    public static ImageReader sSharedImageReader;
    public static final List<QueuedImageReaderProxy> sSharedImageReaderProxys = new ArrayList();
    public static Set<DeviceProperties> sSharedReaderWhitelist;

    public static void clearSharedReaders() {
        sSharedImageReaderProxys.clear();
        sSharedImageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        sSharedImageReader.close();
        sSharedImageReader = null;
    }

    public static ImageReaderProxy createCompatibleReader(String str, int i, int i2, int i3, int i4, Handler handler) {
        if (inSharedReaderWhitelist(DeviceProperties.create())) {
            return createSharedReader(str, i, i2, i3, i4, handler);
        }
        return createIsolatedReader(i, i2, i3, i4, handler);
    }

    public static ImageReaderProxy createIsolatedReader(int i, int i2, int i3, int i4, Handler handler) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static ImageReaderProxy createSharedReader(String str, int i, int i2, int i3, int i4, Handler handler) {
        if (sSharedImageReader == null) {
            Size maxOutputSize = CameraX.getSurfaceManager().getMaxOutputSize(str, 35);
            "Resolution of base ImageReader: " + maxOutputSize;
            sSharedImageReader = ImageReader.newInstance(maxOutputSize.getWidth(), maxOutputSize.getHeight(), 35, 8);
        }
        "Resolution of forked ImageReader: " + new Size(i, i2);
        QueuedImageReaderProxy queuedImageReaderProxy = new QueuedImageReaderProxy(i, i2, i3, i4, sSharedImageReader.getSurface());
        sSharedImageReaderProxys.add(queuedImageReaderProxy);
        sSharedImageReader.setOnImageAvailableListener(new ForwardingImageReaderListener(sSharedImageReaderProxys), handler);
        queuedImageReaderProxy.addOnReaderCloseListener(new QueuedImageReaderProxy.OnReaderCloseListener() {
            public void onReaderClose(ImageReaderProxy imageReaderProxy) {
                ImageReaderProxys.sSharedImageReaderProxys.remove(imageReaderProxy);
                if (ImageReaderProxys.sSharedImageReaderProxys.isEmpty()) {
                    ImageReaderProxys.clearSharedReaders();
                }
            }
        });
        return queuedImageReaderProxy;
    }

    public static boolean inSharedReaderWhitelist(DeviceProperties deviceProperties) {
        if (sSharedReaderWhitelist == null) {
            sSharedReaderWhitelist = new HashSet();
            for (int i = 21; i <= 27; i++) {
            }
        }
        return sSharedReaderWhitelist.contains(deviceProperties);
    }
}
