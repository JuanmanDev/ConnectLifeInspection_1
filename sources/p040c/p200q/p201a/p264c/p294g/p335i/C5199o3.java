package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.o3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5199o3 {

    /* renamed from: a */
    public final C5345y f10026a;

    /* renamed from: b */
    public final C5215p4 f10027b;

    /* renamed from: c */
    public final C5215p4 f10028c;

    /* renamed from: d */
    public final C5233q7 f10029d = new C5233q7();

    public C5199o3() {
        C5345y yVar = new C5345y();
        this.f10026a = yVar;
        C5215p4 p4Var = new C5215p4((C5215p4) null, yVar);
        this.f10028c = p4Var;
        this.f10027b = p4Var.mo27495a();
        this.f10028c.mo27501g("require", new C5101he(this.f10029d));
        this.f10029d.mo27515a("internal.platform", C5213p2.f10055e);
        this.f10028c.mo27501g("runtime.counter", new C5102i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final C5225q mo27479a(C5215p4 p4Var, C5186n5... n5VarArr) {
        C5225q qVar = C5225q.f10068c;
        for (C5186n5 a : n5VarArr) {
            qVar = C5232q6.m14672a(a);
            C5216p5.m14633c(this.f10028c);
            if ((qVar instanceof C5240r) || (qVar instanceof C5210p)) {
                qVar = this.f10026a.mo27938a(p4Var, qVar);
            }
        }
        return qVar;
    }
}
