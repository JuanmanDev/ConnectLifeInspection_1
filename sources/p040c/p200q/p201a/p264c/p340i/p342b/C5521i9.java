package p040c.p200q.p201a.p264c.p340i.p342b;

import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3553d;

/* renamed from: c.q.a.c.i.b.i9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5521i9 {

    /* renamed from: a */
    public final C3553d f10571a;

    /* renamed from: b */
    public long f10572b;

    public C5521i9(C3553d dVar) {
        C3495o.m8908j(dVar);
        this.f10571a = dVar;
    }

    /* renamed from: a */
    public final void mo28350a() {
        this.f10572b = 0;
    }

    /* renamed from: b */
    public final void mo28351b() {
        this.f10572b = this.f10571a.mo20839b();
    }

    /* renamed from: c */
    public final boolean mo28352c(long j) {
        return this.f10572b == 0 || this.f10571a.mo20839b() - this.f10572b >= 3600000;
    }
}
