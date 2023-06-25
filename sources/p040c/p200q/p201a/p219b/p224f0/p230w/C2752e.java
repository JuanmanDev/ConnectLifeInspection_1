package p040c.p200q.p201a.p219b.p224f0.p230w;

import java.util.Arrays;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.e */
/* compiled from: OggPacket */
public final class C2752e {

    /* renamed from: a */
    public final C2753f f3984a = new C2753f();

    /* renamed from: b */
    public final C3173t f3985b = new C3173t(new byte[65025], 0);

    /* renamed from: c */
    public int f3986c = -1;

    /* renamed from: d */
    public int f3987d;

    /* renamed from: e */
    public boolean f3988e;

    /* renamed from: a */
    public final int mo18711a(int i) {
        int i2;
        int i3 = 0;
        this.f3987d = 0;
        do {
            int i4 = this.f3987d;
            int i5 = i + i4;
            C2753f fVar = this.f3984a;
            if (i5 >= fVar.f3993d) {
                break;
            }
            int[] iArr = fVar.f3996g;
            this.f3987d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public C2753f mo18712b() {
        return this.f3984a;
    }

    /* renamed from: c */
    public C3173t mo18713c() {
        return this.f3985b;
    }

    /* renamed from: d */
    public boolean mo18714d(C2675h hVar) {
        int i;
        C3151e.m7759g(hVar != null);
        if (this.f3988e) {
            this.f3988e = false;
            this.f3985b.mo20001G();
        }
        while (!this.f3988e) {
            if (this.f3986c < 0) {
                if (!this.f3984a.mo18717a(hVar, true)) {
                    return false;
                }
                C2753f fVar = this.f3984a;
                int i2 = fVar.f3994e;
                if ((fVar.f3991b & 1) == 1 && this.f3985b.mo20011d() == 0) {
                    i2 += mo18711a(0);
                    i = this.f3987d + 0;
                } else {
                    i = 0;
                }
                hVar.mo18528g(i2);
                this.f3986c = i;
            }
            int a = mo18711a(this.f3986c);
            int i3 = this.f3986c + this.f3987d;
            if (a > 0) {
                if (this.f3985b.mo20009b() < this.f3985b.mo20011d() + a) {
                    C3173t tVar = this.f3985b;
                    tVar.f5877a = Arrays.copyOf(tVar.f5877a, tVar.mo20011d() + a);
                }
                C3173t tVar2 = this.f3985b;
                hVar.readFully(tVar2.f5877a, tVar2.mo20011d(), a);
                C3173t tVar3 = this.f3985b;
                tVar3.mo20005K(tVar3.mo20011d() + a);
                this.f3988e = this.f3984a.f3996g[i3 + -1] != 255;
            }
            if (i3 == this.f3984a.f3993d) {
                i3 = -1;
            }
            this.f3986c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void mo18715e() {
        this.f3984a.mo18718b();
        this.f3985b.mo20001G();
        this.f3986c = -1;
        this.f3988e = false;
    }

    /* renamed from: f */
    public void mo18716f() {
        C3173t tVar = this.f3985b;
        byte[] bArr = tVar.f5877a;
        if (bArr.length != 65025) {
            tVar.f5877a = Arrays.copyOf(bArr, Math.max(65025, tVar.mo20011d()));
        }
    }
}
