package p553f.p554a.p570e.p571a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: f.a.e.a.o */
/* compiled from: StringCodec */
public final class C9034o implements C9015h<String> {

    /* renamed from: a */
    public static final Charset f17703a = Charset.forName("UTF8");

    /* renamed from: b */
    public static final C9034o f17704b = new C9034o();

    /* renamed from: c */
    public String mo46563b(ByteBuffer byteBuffer) {
        int i;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f17703a);
    }

    /* renamed from: d */
    public ByteBuffer mo46562a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f17703a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
