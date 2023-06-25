package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzack;
import java.io.OutputStream;

/* renamed from: c.q.a.c.g.g.r0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4731r0 extends C4678p0 {

    /* renamed from: h */
    public final OutputStream f9590h;

    public C4731r0(OutputStream outputStream, int i) {
        super(i);
        this.f9590h = outputStream;
    }

    /* renamed from: A */
    public final void mo26547A(int i, int i2) {
        mo26588O(20);
        mo26493L(i << 3);
        mo26493L(i2);
    }

    /* renamed from: B */
    public final void mo26548B(int i) {
        mo26588O(5);
        mo26493L(i);
    }

    /* renamed from: C */
    public final void mo26549C(int i, long j) {
        mo26588O(20);
        mo26493L(i << 3);
        mo26494M(j);
    }

    /* renamed from: D */
    public final void mo26550D(long j) {
        mo26588O(10);
        mo26494M(j);
    }

    /* renamed from: N */
    public final void mo26587N() {
        this.f9590h.write(this.f9537d, 0, this.f9539f);
        this.f9539f = 0;
    }

    /* renamed from: O */
    public final void mo26588O(int i) {
        if (this.f9538e - this.f9539f < i) {
            mo26587N();
        }
    }

    /* renamed from: P */
    public final void mo26589P(byte[] bArr, int i, int i2) {
        int i3 = this.f9538e;
        int i4 = this.f9539f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.f9537d, i4, i2);
            this.f9539f += i2;
            this.f9540g += i2;
            return;
        }
        System.arraycopy(bArr, 0, this.f9537d, i4, i5);
        int i6 = i2 - i5;
        this.f9539f = this.f9538e;
        this.f9540g += i5;
        mo26587N();
        if (i6 <= this.f9538e) {
            System.arraycopy(bArr, i5, this.f9537d, 0, i6);
            this.f9539f = i6;
        } else {
            this.f9590h.write(bArr, i5, i6);
        }
        this.f9540g += i6;
    }

    /* renamed from: Q */
    public final void mo26590Q(String str) {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int f = C4783t0.m13103f(length);
            int i3 = f + length;
            int i4 = this.f9538e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int b = C4385e4.m11884b(str, bArr, 0, length);
                mo26548B(b);
                mo26589P(bArr, 0, b);
                return;
            }
            if (i3 > i4 - this.f9539f) {
                mo26587N();
            }
            int f2 = C4783t0.m13103f(str.length());
            i = this.f9539f;
            if (f2 == f) {
                int i5 = i + f2;
                this.f9539f = i5;
                int b2 = C4385e4.m11884b(str, this.f9537d, i5, this.f9538e - i5);
                this.f9539f = i;
                i2 = (b2 - i) - f2;
                mo26493L(i2);
                this.f9539f = b2;
            } else {
                i2 = C4385e4.m11885c(str);
                mo26493L(i2);
                this.f9539f = C4385e4.m11884b(str, this.f9537d, this.f9539f, i2);
            }
            this.f9540g += i2;
        } catch (C4358d4 e) {
            this.f9540g -= this.f9539f - i;
            this.f9539f = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzack(e2);
        } catch (C4358d4 e3) {
            mo26658k(str, e3);
        }
    }

    /* renamed from: a */
    public final void mo26553a(byte[] bArr, int i, int i2) {
        mo26589P(bArr, 0, i2);
    }

    /* renamed from: m */
    public final void mo26554m() {
        if (this.f9539f > 0) {
            mo26587N();
        }
    }

    /* renamed from: n */
    public final void mo26555n(byte b) {
        if (this.f9539f == this.f9538e) {
            mo26587N();
        }
        mo26490I(b);
    }

    /* renamed from: o */
    public final void mo26556o(int i, boolean z) {
        mo26588O(11);
        mo26493L(i << 3);
        mo26490I(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo26557p(int i, zzacc zzacc) {
        mo26548B((i << 3) | 2);
        mo26548B(zzacc.zzd());
        zzacc.zzj(this);
    }

    /* renamed from: r */
    public final void mo26558r(int i, int i2) {
        mo26588O(14);
        mo26493L((i << 3) | 5);
        mo26491J(i2);
    }

    /* renamed from: s */
    public final void mo26559s(int i) {
        mo26588O(4);
        mo26491J(i);
    }

    /* renamed from: t */
    public final void mo26560t(int i, long j) {
        mo26588O(18);
        mo26493L((i << 3) | 1);
        mo26492K(j);
    }

    /* renamed from: u */
    public final void mo26561u(long j) {
        mo26588O(8);
        mo26492K(j);
    }

    /* renamed from: v */
    public final void mo26562v(int i, int i2) {
        mo26588O(20);
        mo26493L(i << 3);
        if (i2 >= 0) {
            mo26493L(i2);
        } else {
            mo26494M((long) i2);
        }
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
        mo26590Q(str);
    }

    /* renamed from: z */
    public final void mo26566z(int i, int i2) {
        mo26548B((i << 3) | i2);
    }
}
