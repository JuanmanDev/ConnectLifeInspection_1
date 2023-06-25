package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.y */
/* compiled from: SectionReader */
public final class C2815y implements C2781e0 {

    /* renamed from: a */
    public final C2814x f4358a;

    /* renamed from: b */
    public final C3173t f4359b = new C3173t(32);

    /* renamed from: c */
    public int f4360c;

    /* renamed from: d */
    public int f4361d;

    /* renamed from: e */
    public boolean f4362e;

    /* renamed from: f */
    public boolean f4363f;

    public C2815y(C2814x xVar) {
        this.f4358a = xVar;
    }

    /* renamed from: a */
    public void mo18756a(C3146b0 b0Var, C2676i iVar, C2781e0.C2785d dVar) {
        this.f4358a.mo18738a(b0Var, iVar, dVar);
        this.f4363f = true;
    }

    /* renamed from: b */
    public void mo18757b(C3173t tVar, int i) {
        boolean z = (i & 1) != 0;
        int c = z ? tVar.mo20010c() + tVar.mo20032y() : -1;
        if (this.f4363f) {
            if (z) {
                this.f4363f = false;
                tVar.mo20006L(c);
                this.f4361d = 0;
            } else {
                return;
            }
        }
        while (tVar.mo20008a() > 0) {
            int i2 = this.f4361d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int y = tVar.mo20032y();
                    tVar.mo20006L(tVar.mo20010c() - 1);
                    if (y == 255) {
                        this.f4363f = true;
                        return;
                    }
                }
                int min = Math.min(tVar.mo20008a(), 3 - this.f4361d);
                tVar.mo20015h(this.f4359b.f5877a, this.f4361d, min);
                int i3 = this.f4361d + min;
                this.f4361d = i3;
                if (i3 == 3) {
                    this.f4359b.mo20002H(3);
                    this.f4359b.mo20007M(1);
                    int y2 = this.f4359b.mo20032y();
                    int y3 = this.f4359b.mo20032y();
                    this.f4362e = (y2 & 128) != 0;
                    this.f4360c = (((y2 & 15) << 8) | y3) + 3;
                    int b = this.f4359b.mo20009b();
                    int i4 = this.f4360c;
                    if (b < i4) {
                        C3173t tVar2 = this.f4359b;
                        byte[] bArr = tVar2.f5877a;
                        tVar2.mo20002H(Math.min(4098, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f4359b.f5877a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(tVar.mo20008a(), this.f4360c - this.f4361d);
                tVar.mo20015h(this.f4359b.f5877a, this.f4361d, min2);
                int i5 = this.f4361d + min2;
                this.f4361d = i5;
                int i6 = this.f4360c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f4362e) {
                        this.f4359b.mo20002H(i6);
                    } else if (C3152e0.m7816p(this.f4359b.f5877a, 0, i6, -1) != 0) {
                        this.f4363f = true;
                        return;
                    } else {
                        this.f4359b.mo20002H(this.f4360c - 4);
                    }
                    this.f4358a.mo18739b(this.f4359b);
                    this.f4361d = 0;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo18758c() {
        this.f4363f = true;
    }
}
