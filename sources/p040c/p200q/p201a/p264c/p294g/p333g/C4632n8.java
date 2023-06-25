package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: c.q.a.c.g.g.n8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4632n8 {
    /* renamed from: a */
    public static void m12528a(C4424fg fgVar) {
        C4906xj.m13512l(m12530c(fgVar.mo25988I().mo26473J()));
        m12529b(fgVar.mo25988I().mo26474K());
        if (fgVar.mo25989L() != 2) {
            C4840v5.m13297c(fgVar.mo25987E().mo26860H());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m12529b(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(C4799tg.m13164a(i))));
    }

    /* renamed from: c */
    public static int m12530c(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(C4694pg.m12819a(i))));
    }

    /* renamed from: d */
    public static int m12531d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(C4850vf.m13331a(i))));
            }
        }
        return i3;
    }
}
