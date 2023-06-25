package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

/* renamed from: c.q.a.d.a.a.c.n */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5809n extends C5805j {

    /* renamed from: l */
    public final /* synthetic */ C5815t f11316l;

    public C5809n(C5815t tVar) {
        this.f11316l = tVar;
    }

    /* renamed from: a */
    public final void mo28900a() {
        C5815t tVar = this.f11316l;
        if (tVar.f11334m != null) {
            tVar.f11323b.mo28898d("Unbind from service.", new Object[0]);
            C5815t tVar2 = this.f11316l;
            tVar2.f11322a.unbindService(tVar2.f11333l);
            this.f11316l.f11328g = false;
            this.f11316l.f11334m = null;
            this.f11316l.f11333l = null;
        }
        this.f11316l.mo28914t();
    }
}
