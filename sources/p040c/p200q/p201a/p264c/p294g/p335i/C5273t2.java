package p040c.p200q.p201a.p264c.p294g.p335i;

import android.app.Activity;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p292e.C3587b;

/* renamed from: c.q.a.c.g.i.t2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C5273t2 extends C5137k2 {

    /* renamed from: o */
    public final /* synthetic */ Activity f10148o;

    /* renamed from: p */
    public final /* synthetic */ C5288u2 f10149p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5273t2(C5288u2 u2Var, Activity activity) {
        super(u2Var.f10168e, true);
        this.f10149p = u2Var;
        this.f10148o = activity;
    }

    /* renamed from: a */
    public final void mo26914a() {
        C5040e1 s = this.f10149p.f10168e.f10186h;
        C3495o.m8908j(s);
        s.onActivityDestroyed(C3587b.m9124k(this.f10148o), this.f9973l);
    }
}
