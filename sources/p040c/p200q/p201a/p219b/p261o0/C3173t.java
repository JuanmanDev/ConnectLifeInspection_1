package p040c.p200q.p201a.p219b.p261o0;

import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.Charset;
import okio.Utf8;

/* renamed from: c.q.a.b.o0.t */
/* compiled from: ParsableByteArray */
public final class C3173t {

    /* renamed from: a */
    public byte[] f5877a;

    /* renamed from: b */
    public int f5878b;

    /* renamed from: c */
    public int f5879c;

    public C3173t() {
        this.f5877a = C3152e0.f5824f;
    }

    /* renamed from: A */
    public long mo19995A() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        int i4 = i3 + 1;
        this.f5878b = i4;
        this.f5878b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: B */
    public int mo19996B() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f5878b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: C */
    public int mo19997C() {
        int j = mo20017j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: " + j);
    }

    /* renamed from: D */
    public long mo19998D() {
        long r = mo20025r();
        if (r >= 0) {
            return r;
        }
        throw new IllegalStateException("Top bit not zero: " + r);
    }

    /* renamed from: E */
    public int mo19999E() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        this.f5878b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: F */
    public long mo20000F() {
        int i;
        int i2;
        long j = (long) this.f5877a[this.f5878b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f5877a[this.f5878b + i];
                if ((b & ExifInterface.MARKER_SOF0) == 128) {
                    j = (j << 6) | ((long) (b & Utf8.REPLACEMENT_BYTE));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f5878b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: G */
    public void mo20001G() {
        this.f5878b = 0;
        this.f5879c = 0;
    }

    /* renamed from: H */
    public void mo20002H(int i) {
        mo20004J(mo20009b() < i ? new byte[i] : this.f5877a, i);
    }

    /* renamed from: I */
    public void mo20003I(byte[] bArr) {
        mo20004J(bArr, bArr.length);
    }

    /* renamed from: J */
    public void mo20004J(byte[] bArr, int i) {
        this.f5877a = bArr;
        this.f5879c = i;
        this.f5878b = 0;
    }

    /* renamed from: K */
    public void mo20005K(int i) {
        C3151e.m7753a(i >= 0 && i <= this.f5877a.length);
        this.f5879c = i;
    }

    /* renamed from: L */
    public void mo20006L(int i) {
        C3151e.m7753a(i >= 0 && i <= this.f5879c);
        this.f5878b = i;
    }

    /* renamed from: M */
    public void mo20007M(int i) {
        mo20006L(this.f5878b + i);
    }

    /* renamed from: a */
    public int mo20008a() {
        return this.f5879c - this.f5878b;
    }

    /* renamed from: b */
    public int mo20009b() {
        return this.f5877a.length;
    }

    /* renamed from: c */
    public int mo20010c() {
        return this.f5878b;
    }

    /* renamed from: d */
    public int mo20011d() {
        return this.f5879c;
    }

    /* renamed from: e */
    public char mo20012e() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: f */
    public int mo20013f() {
        return this.f5877a[this.f5878b] & 255;
    }

    /* renamed from: g */
    public void mo20014g(C3172s sVar, int i) {
        mo20015h(sVar.f5873a, 0, i);
        sVar.mo19991n(0);
    }

    /* renamed from: h */
    public void mo20015h(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f5877a, this.f5878b, bArr, i, i2);
        this.f5878b += i2;
    }

    /* renamed from: i */
    public double mo20016i() {
        return Double.longBitsToDouble(mo20025r());
    }

    /* renamed from: j */
    public int mo20017j() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f5878b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f5878b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: k */
    public int mo20018k() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        byte b = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f5878b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    @Nullable
    /* renamed from: l */
    public String mo20019l() {
        if (mo20008a() == 0) {
            return null;
        }
        int i = this.f5878b;
        while (i < this.f5879c && !C3152e0.m7778R(this.f5877a[i])) {
            i++;
        }
        int i2 = this.f5878b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f5877a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f5878b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f5877a;
        int i3 = this.f5878b;
        String u = C3152e0.m7821u(bArr2, i3, i - i3);
        this.f5878b = i;
        int i4 = this.f5879c;
        if (i == i4) {
            return u;
        }
        if (this.f5877a[i] == 13) {
            int i5 = i + 1;
            this.f5878b = i5;
            if (i5 == i4) {
                return u;
            }
        }
        byte[] bArr3 = this.f5877a;
        int i6 = this.f5878b;
        if (bArr3[i6] == 10) {
            this.f5878b = i6 + 1;
        }
        return u;
    }

    /* renamed from: m */
    public int mo20020m() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f5878b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f5878b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    /* renamed from: n */
    public long mo20021n() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        int i4 = i3 + 1;
        this.f5878b = i4;
        int i5 = i4 + 1;
        this.f5878b = i5;
        int i6 = i5 + 1;
        this.f5878b = i6;
        int i7 = i6 + 1;
        this.f5878b = i7;
        int i8 = i7 + 1;
        this.f5878b = i8;
        this.f5878b = i8 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: o */
    public long mo20022o() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        int i4 = i3 + 1;
        this.f5878b = i4;
        this.f5878b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: p */
    public int mo20023p() {
        int m = mo20020m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException("Top bit not zero: " + m);
    }

    /* renamed from: q */
    public int mo20024q() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        this.f5878b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: r */
    public long mo20025r() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        int i4 = i3 + 1;
        this.f5878b = i4;
        int i5 = i4 + 1;
        this.f5878b = i5;
        int i6 = i5 + 1;
        this.f5878b = i6;
        int i7 = i6 + 1;
        this.f5878b = i7;
        int i8 = i7 + 1;
        this.f5878b = i8;
        this.f5878b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    @Nullable
    /* renamed from: s */
    public String mo20026s() {
        if (mo20008a() == 0) {
            return null;
        }
        int i = this.f5878b;
        while (i < this.f5879c && this.f5877a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f5877a;
        int i2 = this.f5878b;
        String u = C3152e0.m7821u(bArr, i2, i - i2);
        this.f5878b = i;
        if (i < this.f5879c) {
            this.f5878b = i + 1;
        }
        return u;
    }

    /* renamed from: t */
    public String mo20027t(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f5878b + i) - 1;
        String u = C3152e0.m7821u(this.f5877a, this.f5878b, (i2 >= this.f5879c || this.f5877a[i2] != 0) ? i : i - 1);
        this.f5878b += i;
        return u;
    }

    /* renamed from: u */
    public short mo20028u() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        this.f5878b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: v */
    public String mo20029v(int i) {
        return mo20030w(i, Charset.forName("UTF-8"));
    }

    /* renamed from: w */
    public String mo20030w(int i, Charset charset) {
        String str = new String(this.f5877a, this.f5878b, i, charset);
        this.f5878b += i;
        return str;
    }

    /* renamed from: x */
    public int mo20031x() {
        return (mo20032y() << 21) | (mo20032y() << 14) | (mo20032y() << 7) | mo20032y();
    }

    /* renamed from: y */
    public int mo20032y() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        this.f5878b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: z */
    public int mo20033z() {
        byte[] bArr = this.f5877a;
        int i = this.f5878b;
        int i2 = i + 1;
        this.f5878b = i2;
        int i3 = i2 + 1;
        this.f5878b = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f5878b = i3 + 2;
        return b;
    }

    public C3173t(int i) {
        this.f5877a = new byte[i];
        this.f5879c = i;
    }

    public C3173t(byte[] bArr) {
        this.f5877a = bArr;
        this.f5879c = bArr.length;
    }

    public C3173t(byte[] bArr, int i) {
        this.f5877a = bArr;
        this.f5879c = i;
    }
}
