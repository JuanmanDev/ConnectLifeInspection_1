package p040c.p077d.p078a.p081k.p091l.p092c;

import android.media.ExifInterface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

@RequiresApi(27)
/* renamed from: c.d.a.k.l.c.n */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class C1820n implements ImageHeaderParser {
    @NonNull
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo16077a(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo16078b(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public int mo16079c(@NonNull InputStream inputStream, @NonNull C1692b bVar) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
