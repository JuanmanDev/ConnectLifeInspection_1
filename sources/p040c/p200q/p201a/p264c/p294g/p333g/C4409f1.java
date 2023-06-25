package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.f1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4409f1 extends C4311bb {

    /* renamed from: m */
    public final CharSequence f9201m;

    /* renamed from: n */
    public int f9202n = 0;

    /* renamed from: o */
    public int f9203o;

    public C4409f1(C4303b3 b3Var, CharSequence charSequence) {
        C4371dh unused = b3Var.f9131a;
        this.f9203o = Integer.MAX_VALUE;
        this.f9201m = charSequence;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25817a() {
        int i;
        int i2 = this.f9202n;
        while (true) {
            int i3 = this.f9202n;
            if (i3 != -1) {
                int d = mo25918d(i3);
                if (d == -1) {
                    d = this.f9201m.length();
                    this.f9202n = -1;
                    i = -1;
                } else {
                    i = mo25917c(d);
                    this.f9202n = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f9202n = i4;
                    if (i4 > this.f9201m.length()) {
                        this.f9202n = -1;
                    }
                } else {
                    if (i2 < d) {
                        this.f9201m.charAt(i2);
                    }
                    if (i2 < d) {
                        this.f9201m.charAt(d - 1);
                    }
                    int i5 = this.f9203o;
                    if (i5 == 1) {
                        d = this.f9201m.length();
                        this.f9202n = -1;
                        if (d > i2) {
                            this.f9201m.charAt(d - 1);
                        }
                    } else {
                        this.f9203o = i5 - 1;
                    }
                    return this.f9201m.subSequence(i2, d).toString();
                }
            } else {
                mo25818b();
                return null;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo25917c(int i);

    /* renamed from: d */
    public abstract int mo25918d(int i);
}
