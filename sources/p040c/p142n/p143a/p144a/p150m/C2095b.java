package p040c.p142n.p143a.p144a.p150m;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: c.n.a.a.m.b */
/* compiled from: ByteArrayBuilder */
public final class C2095b extends OutputStream {

    /* renamed from: o */
    public static final byte[] f2042o = new byte[0];

    /* renamed from: e */
    public final LinkedList<byte[]> f2043e;

    /* renamed from: l */
    public int f2044l;

    /* renamed from: m */
    public byte[] f2045m;

    /* renamed from: n */
    public int f2046n;

    public C2095b() {
        this((C2094a) null);
    }

    /* renamed from: a */
    public final void mo16822a() {
        int length = this.f2044l + this.f2045m.length;
        this.f2044l = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 262144) {
            max = 262144;
        }
        this.f2043e.add(this.f2045m);
        this.f2045m = new byte[max];
        this.f2046n = 0;
    }

    /* renamed from: b */
    public void mo16823b(int i) {
        if (this.f2046n >= this.f2045m.length) {
            mo16822a();
        }
        byte[] bArr = this.f2045m;
        int i2 = this.f2046n;
        this.f2046n = i2 + 1;
        bArr[i2] = (byte) i;
    }

    /* renamed from: c */
    public void mo16824c(int i) {
        int i2 = this.f2046n;
        int i3 = i2 + 2;
        byte[] bArr = this.f2045m;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f2046n = i4;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i4 + 1;
            this.f2046n = i5;
            bArr[i4] = (byte) (i >> 8);
            this.f2046n = i5 + 1;
            bArr[i5] = (byte) i;
            return;
        }
        mo16823b(i >> 16);
        mo16823b(i >> 8);
        mo16823b(i);
    }

    public void close() {
    }

    /* renamed from: d */
    public void mo16826d(int i) {
        int i2 = this.f2046n;
        int i3 = i2 + 1;
        byte[] bArr = this.f2045m;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f2046n = i4;
            bArr[i2] = (byte) (i >> 8);
            this.f2046n = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        mo16823b(i >> 8);
        mo16823b(i);
    }

    /* renamed from: e */
    public byte[] mo16827e(int i) {
        this.f2046n = i;
        return mo16835n();
    }

    /* renamed from: f */
    public byte[] mo16828f() {
        mo16822a();
        return this.f2045m;
    }

    public void flush() {
    }

    /* renamed from: g */
    public byte[] mo16830g() {
        return this.f2045m;
    }

    /* renamed from: h */
    public int mo16831h() {
        return this.f2046n;
    }

    /* renamed from: i */
    public void mo16832i() {
        this.f2044l = 0;
        this.f2046n = 0;
        if (!this.f2043e.isEmpty()) {
            this.f2043e.clear();
        }
    }

    /* renamed from: j */
    public byte[] mo16833j() {
        mo16832i();
        return this.f2045m;
    }

    /* renamed from: m */
    public void mo16834m(int i) {
        this.f2046n = i;
    }

    /* renamed from: n */
    public byte[] mo16835n() {
        int i = this.f2044l + this.f2046n;
        if (i == 0) {
            return f2042o;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f2043e.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f2045m, 0, bArr, i2, this.f2046n);
        int i3 = i2 + this.f2046n;
        if (i3 == i) {
            if (!this.f2043e.isEmpty()) {
                mo16832i();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public C2095b(C2094a aVar) {
        this(aVar, 500);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f2045m.length - this.f2046n, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f2045m, this.f2046n, min);
                i += min;
                this.f2046n += min;
                i2 -= min;
            }
            if (i2 > 0) {
                mo16822a();
            } else {
                return;
            }
        }
    }

    public C2095b(C2094a aVar, int i) {
        this.f2043e = new LinkedList<>();
        this.f2045m = aVar == null ? new byte[i] : aVar.mo16812a(2);
    }

    public void write(int i) {
        mo16823b(i);
    }
}
