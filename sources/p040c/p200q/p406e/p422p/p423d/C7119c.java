package p040c.p200q.p406e.p422p.p423d;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.p.d.c */
/* compiled from: BoundingBox */
public final class C7119c {

    /* renamed from: a */
    public C7033b f13681a;

    /* renamed from: b */
    public C7023i f13682b;

    /* renamed from: c */
    public C7023i f13683c;

    /* renamed from: d */
    public C7023i f13684d;

    /* renamed from: e */
    public C7023i f13685e;

    /* renamed from: f */
    public int f13686f;

    /* renamed from: g */
    public int f13687g;

    /* renamed from: h */
    public int f13688h;

    /* renamed from: i */
    public int f13689i;

    public C7119c(C7033b bVar, C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4) {
        if (!(iVar == null && iVar3 == null) && (!(iVar2 == null && iVar4 == null) && ((iVar == null || iVar2 != null) && (iVar3 == null || iVar4 != null)))) {
            mo32777k(bVar, iVar, iVar2, iVar3, iVar4);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: l */
    public static C7119c m21205l(C7119c cVar, C7119c cVar2) {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new C7119c(cVar.f13681a, cVar.f13682b, cVar.f13683c, cVar2.f13684d, cVar2.f13685e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p406e.p422p.p423d.C7119c mo32767a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            c.q.e.i r0 = r12.f13682b
            c.q.e.i r1 = r12.f13683c
            c.q.e.i r2 = r12.f13684d
            c.q.e.i r3 = r12.f13685e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo32487d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            c.q.e.i r13 = new c.q.e.i
            float r4 = r4.mo32486c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            c.q.e.i r13 = r12.f13683c
            goto L_0x0034
        L_0x0032:
            c.q.e.i r13 = r12.f13685e
        L_0x0034:
            float r0 = r13.mo32487d()
            int r0 = (int) r0
            int r0 = r0 + r14
            c.q.e.l.b r14 = r12.f13681a
            int r14 = r14.mo32538h()
            if (r0 < r14) goto L_0x004a
            c.q.e.l.b r14 = r12.f13681a
            int r14 = r14.mo32538h()
            int r0 = r14 + -1
        L_0x004a:
            c.q.e.i r14 = new c.q.e.i
            float r13 = r13.mo32486c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            r12.mo32768b()
            c.q.e.p.d.c r13 = new c.q.e.p.d.c
            c.q.e.l.b r7 = r12.f13681a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p422p.p423d.C7119c.mo32767a(int, int, boolean):c.q.e.p.d.c");
    }

    /* renamed from: b */
    public final void mo32768b() {
        if (this.f13682b == null) {
            this.f13682b = new C7023i(0.0f, this.f13684d.mo32487d());
            this.f13683c = new C7023i(0.0f, this.f13685e.mo32487d());
        } else if (this.f13684d == null) {
            this.f13684d = new C7023i((float) (this.f13681a.mo32542k() - 1), this.f13682b.mo32487d());
            this.f13685e = new C7023i((float) (this.f13681a.mo32542k() - 1), this.f13683c.mo32487d());
        }
        this.f13686f = (int) Math.min(this.f13682b.mo32486c(), this.f13683c.mo32486c());
        this.f13687g = (int) Math.max(this.f13684d.mo32486c(), this.f13685e.mo32486c());
        this.f13688h = (int) Math.min(this.f13682b.mo32487d(), this.f13684d.mo32487d());
        this.f13689i = (int) Math.max(this.f13683c.mo32487d(), this.f13685e.mo32487d());
    }

    /* renamed from: c */
    public C7023i mo32769c() {
        return this.f13683c;
    }

    /* renamed from: d */
    public C7023i mo32770d() {
        return this.f13685e;
    }

    /* renamed from: e */
    public int mo32771e() {
        return this.f13687g;
    }

    /* renamed from: f */
    public int mo32772f() {
        return this.f13689i;
    }

    /* renamed from: g */
    public int mo32773g() {
        return this.f13686f;
    }

    /* renamed from: h */
    public int mo32774h() {
        return this.f13688h;
    }

    /* renamed from: i */
    public C7023i mo32775i() {
        return this.f13682b;
    }

    /* renamed from: j */
    public C7023i mo32776j() {
        return this.f13684d;
    }

    /* renamed from: k */
    public final void mo32777k(C7033b bVar, C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4) {
        this.f13681a = bVar;
        this.f13682b = iVar;
        this.f13683c = iVar2;
        this.f13684d = iVar3;
        this.f13685e = iVar4;
        mo32768b();
    }

    public C7119c(C7119c cVar) {
        mo32777k(cVar.f13681a, cVar.f13682b, cVar.f13683c, cVar.f13684d, cVar.f13685e);
    }
}
