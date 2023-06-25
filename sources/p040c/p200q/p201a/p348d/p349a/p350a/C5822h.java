package p040c.p200q.p201a.p348d.p349a.p350a;

import android.os.Bundle;
import android.os.RemoteException;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5805j;

/* renamed from: c.q.a.d.a.a.h */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5822h extends C5805j {

    /* renamed from: l */
    public final /* synthetic */ C5773k f11341l;

    /* renamed from: m */
    public final /* synthetic */ C5825k f11342m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5822h(C5825k kVar, C5773k kVar2, C5773k kVar3) {
        super(kVar2);
        this.f11342m = kVar;
        this.f11341l = kVar3;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, c.q.a.d.a.a.c.f] */
    /* renamed from: a */
    public final void mo28900a() {
        try {
            ? e = this.f11342m.f11347a.mo28909e();
            String c = this.f11342m.f11348b;
            Bundle a = C5826l.m16529a();
            C5825k kVar = this.f11342m;
            e.mo28893Y(c, a, new C5824j(kVar, this.f11341l, kVar.f11348b));
        } catch (RemoteException e2) {
            C5825k.f11346c.mo28897c(e2, "error requesting in-app review for %s", this.f11342m.f11348b);
            this.f11341l.mo28862d(new RuntimeException(e2));
        }
    }
}
