package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.g.i.i2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C5105i2 extends C5137k2 {

    /* renamed from: o */
    public final /* synthetic */ Long f9942o;

    /* renamed from: p */
    public final /* synthetic */ String f9943p;

    /* renamed from: q */
    public final /* synthetic */ String f9944q;

    /* renamed from: r */
    public final /* synthetic */ Bundle f9945r;

    /* renamed from: s */
    public final /* synthetic */ boolean f9946s;

    /* renamed from: t */
    public final /* synthetic */ boolean f9947t;

    /* renamed from: u */
    public final /* synthetic */ C5303v2 f9948u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5105i2(C5303v2 v2Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(v2Var, true);
        this.f9948u = v2Var;
        this.f9942o = l;
        this.f9943p = str;
        this.f9944q = str2;
        this.f9945r = bundle;
        this.f9946s = z;
        this.f9947t = z2;
    }

    /* renamed from: a */
    public final void mo26914a() {
        long j;
        Long l = this.f9942o;
        if (l == null) {
            j = this.f9972e;
        } else {
            j = l.longValue();
        }
        long j2 = j;
        C5040e1 s = this.f9948u.f10186h;
        C3495o.m8908j(s);
        s.logEvent(this.f9943p, this.f9944q, this.f9945r, this.f9946s, this.f9947t, j2);
    }
}
