package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.ea */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5049ea implements C5250r9 {

    /* renamed from: a */
    public final C5295u9 f9877a;

    /* renamed from: b */
    public final String f9878b;

    /* renamed from: c */
    public final Object[] f9879c;

    /* renamed from: d */
    public final int f9880d;

    public C5049ea(C5295u9 u9Var, String str, Object[] objArr) {
        this.f9877a = u9Var;
        this.f9878b = str;
        this.f9879c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9880d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f9880d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo27193a() {
        return (this.f9880d & 2) == 2;
    }

    /* renamed from: b */
    public final int mo27194b() {
        return (this.f9880d & 1) == 1 ? 1 : 2;
    }

    /* renamed from: c */
    public final String mo27195c() {
        return this.f9878b;
    }

    /* renamed from: d */
    public final Object[] mo27196d() {
        return this.f9879c;
    }

    public final C5295u9 zza() {
        return this.f9877a;
    }
}
