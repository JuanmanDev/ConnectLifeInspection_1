package p040c.p200q.p201a.p219b.p260n0;

import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.n0.k */
/* compiled from: DefaultAllocator */
public final class C3126k implements C3117d {

    /* renamed from: a */
    public final boolean f5728a;

    /* renamed from: b */
    public final int f5729b;

    /* renamed from: c */
    public final byte[] f5730c;

    /* renamed from: d */
    public final C3116c[] f5731d;

    /* renamed from: e */
    public int f5732e;

    /* renamed from: f */
    public int f5733f;

    /* renamed from: g */
    public int f5734g;

    /* renamed from: h */
    public C3116c[] f5735h;

    public C3126k(boolean z, int i) {
        this(z, i, 0);
    }

    /* renamed from: a */
    public synchronized void mo19871a(C3116c cVar) {
        this.f5731d[0] = cVar;
        mo19874d(this.f5731d);
    }

    /* renamed from: b */
    public synchronized C3116c mo19872b() {
        C3116c cVar;
        this.f5733f++;
        if (this.f5734g > 0) {
            C3116c[] cVarArr = this.f5735h;
            int i = this.f5734g - 1;
            this.f5734g = i;
            cVar = cVarArr[i];
            this.f5735h[i] = null;
        } else {
            cVar = new C3116c(new byte[this.f5729b], 0);
        }
        return cVar;
    }

    /* renamed from: c */
    public synchronized void mo19873c() {
        int i = 0;
        int max = Math.max(0, C3152e0.m7801h(this.f5732e, this.f5729b) - this.f5733f);
        if (max < this.f5734g) {
            if (this.f5730c != null) {
                int i2 = this.f5734g - 1;
                while (i <= i2) {
                    C3116c cVar = this.f5735h[i];
                    if (cVar.f5705a == this.f5730c) {
                        i++;
                    } else {
                        C3116c cVar2 = this.f5735h[i2];
                        if (cVar2.f5705a != this.f5730c) {
                            i2--;
                        } else {
                            this.f5735h[i] = cVar2;
                            this.f5735h[i2] = cVar;
                            i2--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f5734g) {
                    return;
                }
            }
            Arrays.fill(this.f5735h, max, this.f5734g, (Object) null);
            this.f5734g = max;
        }
    }

    /* renamed from: d */
    public synchronized void mo19874d(C3116c[] cVarArr) {
        if (this.f5734g + cVarArr.length >= this.f5735h.length) {
            this.f5735h = (C3116c[]) Arrays.copyOf(this.f5735h, Math.max(this.f5735h.length * 2, this.f5734g + cVarArr.length));
        }
        for (C3116c cVar : cVarArr) {
            C3116c[] cVarArr2 = this.f5735h;
            int i = this.f5734g;
            this.f5734g = i + 1;
            cVarArr2[i] = cVar;
        }
        this.f5733f -= cVarArr.length;
        notifyAll();
    }

    /* renamed from: e */
    public int mo19875e() {
        return this.f5729b;
    }

    /* renamed from: f */
    public synchronized int mo19896f() {
        return this.f5733f * this.f5729b;
    }

    /* renamed from: g */
    public synchronized void mo19897g() {
        if (this.f5728a) {
            mo19898h(0);
        }
    }

    /* renamed from: h */
    public synchronized void mo19898h(int i) {
        boolean z = i < this.f5732e;
        this.f5732e = i;
        if (z) {
            mo19873c();
        }
    }

    public C3126k(boolean z, int i, int i2) {
        C3151e.m7753a(i > 0);
        C3151e.m7753a(i2 >= 0);
        this.f5728a = z;
        this.f5729b = i;
        this.f5734g = i2;
        this.f5735h = new C3116c[(i2 + 100)];
        if (i2 > 0) {
            this.f5730c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f5735h[i3] = new C3116c(this.f5730c, i3 * i);
            }
        } else {
            this.f5730c = null;
        }
        this.f5731d = new C3116c[1];
    }
}
