package p040c.p077d.p078a.p081k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p091l.p092c.C1824r;

/* renamed from: c.d.a.k.b */
/* compiled from: ImageHeaderParserUtils */
public final class C1566b {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m1275a(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C1692b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1824r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int c = list.get(i).mo16079c(inputStream, bVar);
                if (c != -1) {
                    inputStream.reset();
                    return c;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    /* renamed from: b */
    public static ImageHeaderParser.ImageType m1276b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C1692b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1824r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                ImageHeaderParser.ImageType b = list.get(i).mo16078b(inputStream);
                if (b != ImageHeaderParser.ImageType.UNKNOWN) {
                    inputStream.reset();
                    return b;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    /* renamed from: c */
    public static ImageHeaderParser.ImageType m1277c(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = list.get(i).mo16077a(byteBuffer);
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
