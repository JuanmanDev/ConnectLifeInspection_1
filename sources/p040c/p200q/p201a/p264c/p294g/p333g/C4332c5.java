package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.c5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4332c5 {
    /* renamed from: a */
    public static C4305b5 m11752a(String str) {
        C4305b5 b5Var = (C4305b5) C4840v5.m13306l().get(str);
        if (b5Var != null) {
            return b5Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
