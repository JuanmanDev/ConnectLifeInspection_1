package p040c.p200q.p201a.p264c.p340i.p342b;

import p040c.p200q.p201a.p264c.p276d.p291o.C3572b;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.i.b.a4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5420a4 {

    /* renamed from: a */
    public final C5648t4 f10315a;

    public C5420a4(C5709y9 y9Var) {
        this.f10315a = y9Var.mo28739b0();
    }

    /* renamed from: a */
    public final boolean mo28030a() {
        try {
            C3572b a = C3573c.m9110a(this.f10315a.mo28490f());
            if (a == null) {
                this.f10315a.mo28487b().mo28343v().mo28259a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo20847e("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f10315a.mo28487b().mo28343v().mo28260b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
