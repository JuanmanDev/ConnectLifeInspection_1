package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzack;

/* renamed from: c.q.a.c.g.g.q0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4705q0 extends C4783t0 {

    /* renamed from: d */
    public final byte[] f9573d;

    /* renamed from: e */
    public final int f9574e;

    /* renamed from: f */
    public int f9575f;

    public C4705q0(byte[] bArr, int i, int i2) {
        super((C4757s0) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f9573d = bArr;
                this.f9575f = 0;
                this.f9574e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: A */
    public final void mo26547A(int i, int i2) {
        mo26548B(i << 3);
        mo26548B(i2);
    }

    /* renamed from: B */
    public final void mo26548B(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f9573d;
            int i2 = this.f9575f;
            this.f9575f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f9573d;
            int i3 = this.f9575f;
            this.f9575f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9575f), Integer.valueOf(this.f9574e), 1}), e);
        }
    }

    /* renamed from: C */
    public final void mo26549C(int i, long j) {
        mo26548B(i << 3);
        mo26550D(j);
    }

    /* renamed from: D */
    public final void mo26550D(long j) {
        if (!C4783t0.f9630c || this.f9574e - this.f9575f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f9573d;
                int i = this.f9575f;
                this.f9575f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f9573d;
                int i2 = this.f9575f;
                this.f9575f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9575f), Integer.valueOf(this.f9574e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f9573d;
                int i3 = this.f9575f;
                this.f9575f = i3 + 1;
                C4916y3.m13563s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f9573d;
            int i4 = this.f9575f;
            this.f9575f = i4 + 1;
            C4916y3.m13563s(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: I */
    public final void mo26551I(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f9573d, this.f9575f, i2);
            this.f9575f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9575f), Integer.valueOf(this.f9574e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: J */
    public final void mo26552J(String str) {
        int i = this.f9575f;
        try {
            int f = C4783t0.m13103f(str.length() * 3);
            int f2 = C4783t0.m13103f(str.length());
            if (f2 == f) {
                int i2 = i + f2;
                this.f9575f = i2;
                int b = C4385e4.m11884b(str, this.f9573d, i2, this.f9574e - i2);
                this.f9575f = i;
                mo26548B((b - i) - f2);
                this.f9575f = b;
                return;
            }
            mo26548B(C4385e4.m11885c(str));
            byte[] bArr = this.f9573d;
            int i3 = this.f9575f;
            this.f9575f = C4385e4.m11884b(str, bArr, i3, this.f9574e - i3);
        } catch (C4358d4 e) {
            this.f9575f = i;
            mo26658k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzack(e2);
        }
    }

    /* renamed from: a */
    public final void mo26553a(byte[] bArr, int i, int i2) {
        mo26551I(bArr, 0, i2);
    }

    /* renamed from: m */
    public final void mo26554m() {
    }

    /* renamed from: n */
    public final void mo26555n(byte b) {
        try {
            byte[] bArr = this.f9573d;
            int i = this.f9575f;
            this.f9575f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9575f), Integer.valueOf(this.f9574e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo26556o(int i, boolean z) {
        mo26548B(i << 3);
        mo26555n(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo26557p(int i, zzacc zzacc) {
        mo26548B((i << 3) | 2);
        mo26548B(zzacc.zzd());
        zzacc.zzj(this);
    }

    /* renamed from: q */
    public final int mo26495q() {
        return this.f9574e - this.f9575f;
    }

    /* renamed from: r */
    public final void mo26558r(int i, int i2) {
        mo26548B((i << 3) | 5);
        mo26559s(i2);
    }

    /* renamed from: s */
    public final void mo26559s(int i) {
        try {
            byte[] bArr = this.f9573d;
            int i2 = this.f9575f;
            int i3 = i2 + 1;
            this.f9575f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f9575f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f9575f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f9575f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9575f), Integer.valueOf(this.f9574e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo26560t(int i, long j) {
        mo26548B((i << 3) | 1);
        mo26561u(j);
    }

    /* renamed from: u */
    public final void mo26561u(long j) {
        try {
            byte[] bArr = this.f9573d;
            int i = this.f9575f;
            int i2 = i + 1;
            this.f9575f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f9575f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f9575f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f9575f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f9575f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f9575f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f9575f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f9575f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9575f), Integer.valueOf(this.f9574e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo26562v(int i, int i2) {
        mo26548B(i << 3);
        mo26563w(i2);
    }

    /* renamed from: w */
    public final void mo26563w(int i) {
        if (i >= 0) {
            mo26548B(i);
        } else {
            mo26550D((long) i);
        }
    }

    /* renamed from: x */
    public final void mo26564x(int i, C4572l2 l2Var, C4889x2 x2Var) {
        mo26548B((i << 3) | 2);
        mo26548B(((C4782t) l2Var).mo26149b(x2Var));
        x2Var.mo26423i(l2Var, this.f9631a);
    }

    /* renamed from: y */
    public final void mo26565y(int i, String str) {
        mo26548B((i << 3) | 2);
        mo26552J(str);
    }

    /* renamed from: z */
    public final void mo26566z(int i, int i2) {
        mo26548B((i << 3) | i2);
    }
}
