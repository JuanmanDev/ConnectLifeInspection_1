package p040c.p200q.p201a.p219b.p224f0.p232y;

import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.f0.y.s */
/* compiled from: NalUnitTargetBuffer */
public final class C2806s {

    /* renamed from: a */
    public final int f4312a;

    /* renamed from: b */
    public boolean f4313b;

    /* renamed from: c */
    public boolean f4314c;

    /* renamed from: d */
    public byte[] f4315d;

    /* renamed from: e */
    public int f4316e;

    public C2806s(int i, int i2) {
        this.f4312a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f4315d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo18840a(byte[] bArr, int i, int i2) {
        if (this.f4313b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f4315d;
            int length = bArr2.length;
            int i4 = this.f4316e;
            if (length < i4 + i3) {
                this.f4315d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f4315d, this.f4316e, i3);
            this.f4316e += i3;
        }
    }

    /* renamed from: b */
    public boolean mo18841b(int i) {
        if (!this.f4313b) {
            return false;
        }
        this.f4316e -= i;
        this.f4313b = false;
        this.f4314c = true;
        return true;
    }

    /* renamed from: c */
    public boolean mo18842c() {
        return this.f4314c;
    }

    /* renamed from: d */
    public void mo18843d() {
        this.f4313b = false;
        this.f4314c = false;
    }

    /* renamed from: e */
    public void mo18844e(int i) {
        boolean z = true;
        C3151e.m7759g(!this.f4313b);
        if (i != this.f4312a) {
            z = false;
        }
        this.f4313b = z;
        if (z) {
            this.f4316e = 3;
            this.f4314c = false;
        }
    }
}
