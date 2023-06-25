package p040c.p200q.p405d;

import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: c.q.d.h */
/* compiled from: ByteBufferWriter */
public final class C6929h {

    /* renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f13262a = new ThreadLocal<>();

    /* renamed from: b */
    public static final Class<?> f13263b;

    /* renamed from: c */
    public static final long f13264c;

    static {
        Class<?> e = m19927e("java.io.FileOutputStream");
        f13263b = e;
        f13264c = m19924b(e);
    }

    /* renamed from: a */
    public static byte[] m19923a() {
        SoftReference softReference = f13262a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    public static long m19924b(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (C6961n1.m20332G()) {
                return C6961n1.m20334I(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static byte[] m19925c(int i) {
        int max = Math.max(i, 1024);
        byte[] a = m19923a();
        if (a == null || m19926d(max, a.length)) {
            a = new byte[max];
            if (max <= 16384) {
                m19928f(a);
            }
        }
        return a;
    }

    /* renamed from: d */
    public static boolean m19926d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* renamed from: e */
    public static Class<?> m19927e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m19928f(byte[] bArr) {
        f13262a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    public static void m19929g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m19930h(byteBuffer, outputStream)) {
                byte[] c = m19925c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), c.length);
                    byteBuffer.get(c, 0, min);
                    outputStream.write(c, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    /* renamed from: h */
    public static boolean m19930h(ByteBuffer byteBuffer, OutputStream outputStream) {
        if (f13264c < 0 || !f13263b.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) C6961n1.m20330E(outputStream, f13264c);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
