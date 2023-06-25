package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.k2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public abstract class C5137k2 implements Runnable {

    /* renamed from: e */
    public final long f9972e;

    /* renamed from: l */
    public final long f9973l;

    /* renamed from: m */
    public final boolean f9974m;

    /* renamed from: n */
    public final /* synthetic */ C5303v2 f9975n;

    public C5137k2(C5303v2 v2Var, boolean z) {
        this.f9975n = v2Var;
        this.f9972e = v2Var.f10180b.mo20838a();
        this.f9973l = v2Var.f10180b.mo20839b();
        this.f9974m = z;
    }

    /* renamed from: a */
    public abstract void mo26914a();

    /* renamed from: b */
    public void mo26915b() {
    }

    public final void run() {
        if (this.f9975n.f10185g) {
            mo26915b();
            return;
        }
        try {
            mo26914a();
        } catch (Exception e) {
            this.f9975n.mo27805l(e, false, this.f9974m);
            mo26915b();
        }
    }
}
