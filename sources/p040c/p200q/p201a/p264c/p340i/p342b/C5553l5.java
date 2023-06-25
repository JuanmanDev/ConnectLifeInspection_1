package p040c.p200q.p201a.p264c.p340i.p342b;

/* renamed from: c.q.a.c.i.b.l5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5553l5 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f10649e;

    /* renamed from: l */
    public final /* synthetic */ String f10650l;

    /* renamed from: m */
    public final /* synthetic */ String f10651m;

    /* renamed from: n */
    public final /* synthetic */ long f10652n;

    /* renamed from: o */
    public final /* synthetic */ C5565m5 f10653o;

    public C5553l5(C5565m5 m5Var, String str, String str2, String str3, long j) {
        this.f10653o = m5Var;
        this.f10649e = str;
        this.f10650l = str2;
        this.f10651m = str3;
        this.f10652n = j;
    }

    public final void run() {
        String str = this.f10649e;
        if (str == null) {
            this.f10653o.f10673e.mo28764w(this.f10650l, (C5519i7) null);
            return;
        }
        this.f10653o.f10673e.mo28764w(this.f10650l, new C5519i7(this.f10651m, str, this.f10652n));
    }
}
