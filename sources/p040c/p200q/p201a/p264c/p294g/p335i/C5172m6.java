package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.m6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5172m6 extends C5262s6 {
    public C5172m6(C5202o6 o6Var, String str, Double d, boolean z) {
        super(o6Var, "measurement.test.double_flag", d, true, (C5247r6) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27357a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            "Invalid double value for " + super.mo27634c() + ": " + ((String) obj);
            return null;
        }
    }
}
