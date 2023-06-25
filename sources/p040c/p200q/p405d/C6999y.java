package p040c.p200q.p405d;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6954m0;

/* renamed from: c.q.d.y */
/* compiled from: Internal */
public final class C6999y {

    /* renamed from: a */
    public static final Charset f13392a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f13393b;

    /* renamed from: c.q.d.y$a */
    /* compiled from: Internal */
    public interface C7000a extends C7008i<Boolean> {
    }

    /* renamed from: c.q.d.y$b */
    /* compiled from: Internal */
    public interface C7001b extends C7008i<Double> {
    }

    /* renamed from: c.q.d.y$c */
    /* compiled from: Internal */
    public interface C7002c {
        int getNumber();
    }

    /* renamed from: c.q.d.y$d */
    /* compiled from: Internal */
    public interface C7003d<T extends C7002c> {
        /* renamed from: a */
        T mo32428a(int i);
    }

    /* renamed from: c.q.d.y$e */
    /* compiled from: Internal */
    public interface C7004e {
        /* renamed from: a */
        boolean mo32429a(int i);
    }

    /* renamed from: c.q.d.y$f */
    /* compiled from: Internal */
    public interface C7005f extends C7008i<Float> {
    }

    /* renamed from: c.q.d.y$g */
    /* compiled from: Internal */
    public interface C7006g extends C7008i<Integer> {
    }

    /* renamed from: c.q.d.y$h */
    /* compiled from: Internal */
    public interface C7007h extends C7008i<Long> {
    }

    /* renamed from: c.q.d.y$i */
    /* compiled from: Internal */
    public interface C7008i<E> extends List<E>, RandomAccess {
        /* renamed from: N */
        boolean mo31823N();

        /* renamed from: m */
        void mo31828m();

        /* renamed from: q */
        C7008i<E> mo31773q(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f13393b = bArr;
        ByteBuffer.wrap(bArr);
        C6937j.m19966i(f13393b);
    }

    /* renamed from: a */
    public static <T> T m20707a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: b */
    public static <T> T m20708b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m20709c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m20710d(byte[] bArr) {
        return m20711e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m20711e(byte[] bArr, int i, int i2) {
        int i3 = m20715i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m20712f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m20713g(byte[] bArr) {
        return C6969o1.m20454s(bArr);
    }

    /* renamed from: h */
    public static Object m20714h(Object obj, Object obj2) {
        C6954m0.C6955a b = ((C6954m0) obj).mo32215b();
        b.mo31738B((C6954m0) obj2);
        return b.mo32220D();
    }

    /* renamed from: i */
    public static int m20715i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m20716j(byte[] bArr) {
        return new String(bArr, f13392a);
    }
}
