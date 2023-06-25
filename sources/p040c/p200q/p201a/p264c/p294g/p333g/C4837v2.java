package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.v2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4837v2 implements C4491i2 {

    /* renamed from: a */
    public final C4572l2 f9695a;

    /* renamed from: b */
    public final String f9696b;

    /* renamed from: c */
    public final Object[] f9697c;

    /* renamed from: d */
    public final int f9698d;

    public C4837v2(C4572l2 l2Var, String str, Object[] objArr) {
        this.f9695a = l2Var;
        this.f9696b = str;
        this.f9697c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9698d = charAt;
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
                this.f9698d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo26093a() {
        return (this.f9698d & 2) == 2;
    }

    /* renamed from: b */
    public final int mo26094b() {
        return (this.f9698d & 1) == 1 ? 1 : 2;
    }

    /* renamed from: c */
    public final String mo26764c() {
        return this.f9696b;
    }

    /* renamed from: d */
    public final Object[] mo26765d() {
        return this.f9697c;
    }

    public final C4572l2 zza() {
        return this.f9695a;
    }
}
