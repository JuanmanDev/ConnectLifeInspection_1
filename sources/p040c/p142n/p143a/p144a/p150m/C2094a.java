package p040c.p142n.p143a.p144a.p150m;

import androidx.camera.core.VideoCapture;
import okhttp3.internal.platform.android.AndroidLog;

/* renamed from: c.n.a.a.m.a */
/* compiled from: BufferRecycler */
public class C2094a {

    /* renamed from: c */
    public static final int[] f2038c = {VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, 2000, 2000};

    /* renamed from: d */
    public static final int[] f2039d = {AndroidLog.MAX_LOG_LENGTH, AndroidLog.MAX_LOG_LENGTH, 200, 200};

    /* renamed from: a */
    public final byte[][] f2040a;

    /* renamed from: b */
    public final char[][] f2041b;

    public C2094a() {
        this(4, 4);
    }

    /* renamed from: a */
    public final byte[] mo16812a(int i) {
        return mo16813b(i, 0);
    }

    /* renamed from: b */
    public byte[] mo16813b(int i, int i2) {
        int f = mo16817f(i);
        if (i2 < f) {
            i2 = f;
        }
        byte[][] bArr = this.f2040a;
        byte[] bArr2 = bArr[i];
        if (bArr2 == null || bArr2.length < i2) {
            return mo16816e(i2);
        }
        bArr[i] = null;
        return bArr2;
    }

    /* renamed from: c */
    public final char[] mo16814c(int i) {
        return mo16815d(i, 0);
    }

    /* renamed from: d */
    public char[] mo16815d(int i, int i2) {
        int h = mo16819h(i);
        if (i2 < h) {
            i2 = h;
        }
        char[][] cArr = this.f2041b;
        char[] cArr2 = cArr[i];
        if (cArr2 == null || cArr2.length < i2) {
            return mo16818g(i2);
        }
        cArr[i] = null;
        return cArr2;
    }

    /* renamed from: e */
    public byte[] mo16816e(int i) {
        return new byte[i];
    }

    /* renamed from: f */
    public int mo16817f(int i) {
        return f2038c[i];
    }

    /* renamed from: g */
    public char[] mo16818g(int i) {
        return new char[i];
    }

    /* renamed from: h */
    public int mo16819h(int i) {
        return f2039d[i];
    }

    /* renamed from: i */
    public final void mo16820i(int i, byte[] bArr) {
        this.f2040a[i] = bArr;
    }

    /* renamed from: j */
    public void mo16821j(int i, char[] cArr) {
        this.f2041b[i] = cArr;
    }

    public C2094a(int i, int i2) {
        this.f2040a = new byte[i][];
        this.f2041b = new char[i2][];
    }
}
