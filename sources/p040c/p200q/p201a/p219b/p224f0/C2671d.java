package p040c.p200q.p201a.p219b.p224f0;

import java.io.EOFException;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.d */
/* compiled from: DefaultExtractorInput */
public final class C2671d implements C2675h {

    /* renamed from: a */
    public final byte[] f3408a = new byte[4096];

    /* renamed from: b */
    public final C3122h f3409b;

    /* renamed from: c */
    public final long f3410c;

    /* renamed from: d */
    public long f3411d;

    /* renamed from: e */
    public byte[] f3412e = new byte[65536];

    /* renamed from: f */
    public int f3413f;

    /* renamed from: g */
    public int f3414g;

    public C2671d(C3122h hVar, long j, long j2) {
        this.f3409b = hVar;
        this.f3411d = j;
        this.f3410c = j2;
    }

    /* renamed from: a */
    public boolean mo18522a(byte[] bArr, int i, int i2, boolean z) {
        int m = mo18535m(bArr, i, i2);
        while (m < i2 && m != -1) {
            m = mo18534l(bArr, i, i2, m, z);
        }
        mo18532j(m);
        return m != -1;
    }

    /* renamed from: b */
    public boolean mo18523b(byte[] bArr, int i, int i2, boolean z) {
        if (!mo18530h(i2, z)) {
            return false;
        }
        System.arraycopy(this.f3412e, this.f3413f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: c */
    public long mo18524c() {
        return this.f3411d + ((long) this.f3413f);
    }

    /* renamed from: d */
    public void mo18525d(int i) {
        mo18530h(i, false);
    }

    /* renamed from: e */
    public long mo18526e() {
        return this.f3410c;
    }

    /* renamed from: f */
    public void mo18527f() {
        this.f3413f = 0;
    }

    /* renamed from: g */
    public void mo18528g(int i) {
        mo18537o(i, false);
    }

    public long getPosition() {
        return this.f3411d;
    }

    /* renamed from: h */
    public boolean mo18530h(int i, boolean z) {
        mo18533k(i);
        int i2 = this.f3414g - this.f3413f;
        while (i2 < i) {
            i2 = mo18534l(this.f3412e, this.f3413f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f3414g = this.f3413f + i2;
        }
        this.f3413f += i;
        return true;
    }

    /* renamed from: i */
    public void mo18531i(byte[] bArr, int i, int i2) {
        mo18523b(bArr, i, i2, false);
    }

    /* renamed from: j */
    public final void mo18532j(int i) {
        if (i != -1) {
            this.f3411d += (long) i;
        }
    }

    /* renamed from: k */
    public final void mo18533k(int i) {
        int i2 = this.f3413f + i;
        byte[] bArr = this.f3412e;
        if (i2 > bArr.length) {
            this.f3412e = Arrays.copyOf(this.f3412e, C3152e0.m7813n(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: l */
    public final int mo18534l(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.f3409b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: m */
    public final int mo18535m(byte[] bArr, int i, int i2) {
        int i3 = this.f3414g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f3412e, 0, bArr, i, min);
        mo18538p(min);
        return min;
    }

    /* renamed from: n */
    public final int mo18536n(int i) {
        int min = Math.min(this.f3414g, i);
        mo18538p(min);
        return min;
    }

    /* renamed from: o */
    public boolean mo18537o(int i, boolean z) {
        int n = mo18536n(i);
        while (n < i && n != -1) {
            n = mo18534l(this.f3408a, -n, Math.min(i, this.f3408a.length + n), n, z);
        }
        mo18532j(n);
        return n != -1;
    }

    /* renamed from: p */
    public final void mo18538p(int i) {
        int i2 = this.f3414g - i;
        this.f3414g = i2;
        this.f3413f = 0;
        byte[] bArr = this.f3412e;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f3412e, i, bArr, 0, this.f3414g);
        this.f3412e = bArr;
    }

    public int read(byte[] bArr, int i, int i2) {
        int m = mo18535m(bArr, i, i2);
        if (m == 0) {
            m = mo18534l(bArr, i, i2, 0, true);
        }
        mo18532j(m);
        return m;
    }

    public void readFully(byte[] bArr, int i, int i2) {
        mo18522a(bArr, i, i2, false);
    }

    public int skip(int i) {
        int n = mo18536n(i);
        if (n == 0) {
            byte[] bArr = this.f3408a;
            n = mo18534l(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        mo18532j(n);
        return n;
    }
}
