package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.os.IBinder;

/* renamed from: c.q.a.d.a.a.c.p */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5811p extends C5805j {

    /* renamed from: l */
    public final /* synthetic */ IBinder f11317l;

    /* renamed from: m */
    public final /* synthetic */ C5814s f11318m;

    public C5811p(C5814s sVar, IBinder iBinder) {
        this.f11318m = sVar;
        this.f11317l = iBinder;
    }

    /* renamed from: a */
    public final void mo28900a() {
        this.f11318m.f11320e.f11334m = C5800e.m16481e(this.f11317l);
        C5815t.m16509n(this.f11318m.f11320e);
        this.f11318m.f11320e.f11328g = false;
        for (Runnable run : this.f11318m.f11320e.f11325d) {
            run.run();
        }
        this.f11318m.f11320e.f11325d.clear();
    }
}
