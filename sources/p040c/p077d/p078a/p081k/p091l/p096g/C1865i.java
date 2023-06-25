package p040c.p077d.p078a.p081k.p091l.p096g;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p040c.p077d.p078a.p081k.C1566b;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

/* renamed from: c.d.a.k.l.g.i */
/* compiled from: StreamGifDecoder */
public class C1865i implements C1572f<InputStream, GifDrawable> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f1470a;

    /* renamed from: b */
    public final C1572f<ByteBuffer, GifDrawable> f1471b;

    /* renamed from: c */
    public final C1692b f1472c;

    public C1865i(List<ImageHeaderParser> list, C1572f<ByteBuffer, GifDrawable> fVar, C1692b bVar) {
        this.f1470a = list;
        this.f1471b = fVar;
        this.f1472c = bVar;
    }

    /* renamed from: e */
    public static byte[] m2224e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("StreamGifDecoder", 5);
            return null;
        }
    }

    /* renamed from: c */
    public C1685u<GifDrawable> mo15621b(@NonNull InputStream inputStream, int i, int i2, @NonNull C1571e eVar) {
        byte[] e = m2224e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f1471b.mo15621b(ByteBuffer.wrap(e), i, i2, eVar);
    }

    /* renamed from: d */
    public boolean mo15620a(@NonNull InputStream inputStream, @NonNull C1571e eVar) {
        return !((Boolean) eVar.mo15616c(C1864h.f1469b)).booleanValue() && C1566b.m1276b(this.f1470a, inputStream, this.f1472c) == ImageHeaderParser.ImageType.GIF;
    }
}
