package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzjk;

/* renamed from: c.q.a.c.g.i.z7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5368z7 extends C4999b8 {

    /* renamed from: d */
    public final byte[] f10294d;

    /* renamed from: e */
    public final int f10295e;

    /* renamed from: f */
    public int f10296f;

    public C5368z7(byte[] bArr, int i, int i2) {
        super((C4983a8) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f10294d = bArr;
                this.f10296f = 0;
                this.f10295e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: E */
    public final void mo27972E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f10294d, this.f10296f, i2);
            this.f10296f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10296f), Integer.valueOf(this.f10295e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo27973F(String str) {
        int i = this.f10296f;
        try {
            int a = C4999b8.m13822a(str.length() * 3);
            int a2 = C4999b8.m13822a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f10296f = i2;
                int b = C5177mb.m14499b(str, this.f10294d, i2, this.f10295e - i2);
                this.f10296f = i;
                mo27001u((b - i) - a2);
                this.f10296f = b;
                return;
            }
            mo27001u(C5177mb.m14500c(str));
            byte[] bArr = this.f10294d;
            int i3 = this.f10296f;
            this.f10296f = C5177mb.m14499b(str, bArr, i3, this.f10295e - i3);
        } catch (C5162lb e) {
            this.f10296f = i;
            mo26986e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjk(e2);
        }
    }

    /* renamed from: g */
    public final int mo26987g() {
        return this.f10295e - this.f10296f;
    }

    /* renamed from: h */
    public final void mo26988h(byte b) {
        try {
            byte[] bArr = this.f10294d;
            int i = this.f10296f;
            this.f10296f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10296f), Integer.valueOf(this.f10295e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo26989i(int i, boolean z) {
        mo27001u(i << 3);
        mo26988h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo26990j(int i, zzje zzje) {
        mo27001u((i << 3) | 2);
        mo27001u(zzje.zzd());
        zzje.zzh(this);
    }

    /* renamed from: k */
    public final void mo26991k(int i, int i2) {
        mo27001u((i << 3) | 5);
        mo26992l(i2);
    }

    /* renamed from: l */
    public final void mo26992l(int i) {
        try {
            byte[] bArr = this.f10294d;
            int i2 = this.f10296f;
            int i3 = i2 + 1;
            this.f10296f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f10296f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f10296f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f10296f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10296f), Integer.valueOf(this.f10295e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo26993m(int i, long j) {
        mo27001u((i << 3) | 1);
        mo26994n(j);
    }

    /* renamed from: n */
    public final void mo26994n(long j) {
        try {
            byte[] bArr = this.f10294d;
            int i = this.f10296f;
            int i2 = i + 1;
            this.f10296f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f10296f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f10296f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f10296f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f10296f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f10296f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f10296f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f10296f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10296f), Integer.valueOf(this.f10295e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo26995o(int i, int i2) {
        mo27001u(i << 3);
        mo26996p(i2);
    }

    /* renamed from: p */
    public final void mo26996p(int i) {
        if (i >= 0) {
            mo27001u(i);
        } else {
            mo27003w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo26997q(byte[] bArr, int i, int i2) {
        mo27972E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo26998r(int i, String str) {
        mo27001u((i << 3) | 2);
        mo27973F(str);
    }

    /* renamed from: s */
    public final void mo26999s(int i, int i2) {
        mo27001u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo27000t(int i, int i2) {
        mo27001u(i << 3);
        mo27001u(i2);
    }

    /* renamed from: u */
    public final void mo27001u(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f10294d;
            int i2 = this.f10296f;
            this.f10296f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f10294d;
            int i3 = this.f10296f;
            this.f10296f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10296f), Integer.valueOf(this.f10295e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo27002v(int i, long j) {
        mo27001u(i << 3);
        mo27003w(j);
    }

    /* renamed from: w */
    public final void mo27003w(long j) {
        if (!C4999b8.f9826c || this.f10295e - this.f10296f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f10294d;
                int i = this.f10296f;
                this.f10296f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f10294d;
                int i2 = this.f10296f;
                this.f10296f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10296f), Integer.valueOf(this.f10295e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f10294d;
                int i3 = this.f10296f;
                this.f10296f = i3 + 1;
                C5082gb.m14163s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f10294d;
            int i4 = this.f10296f;
            this.f10296f = i4 + 1;
            C5082gb.m14163s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
