package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.dp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4379dp extends C4409f1 {
    public C4379dp(C4272a aVar, C4303b3 b3Var, CharSequence charSequence) {
        super(b3Var, charSequence);
    }

    /* renamed from: c */
    public final int mo25917c(int i) {
        return i + 1;
    }

    /* renamed from: d */
    public final int mo25918d(int i) {
        CharSequence charSequence = this.f9201m;
        int length = charSequence.length();
        C4540jo.m12244b(i, length, "index");
        while (i < length) {
            if (charSequence.charAt(i) == '.') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
