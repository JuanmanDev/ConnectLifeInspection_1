package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.y5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4918y5 {
    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static C4588li m13576a(C4453gi giVar) {
        C4507ii E = C4588li.m12426E();
        E.mo26114m(giVar.mo26034F());
        for (C4426fi fiVar : giVar.mo26036K()) {
            C4534ji F = C4561ki.m12300F();
            F.mo26142p(fiVar.mo25991F().mo26733J());
            F.mo26143q(fiVar.mo25994N());
            F.mo26141m(fiVar.mo25992I());
            F.mo26140l(fiVar.mo25990E());
            E.mo26113l((C4561ki) F.mo26052e());
        }
        return (C4588li) E.mo26052e();
    }

    /* renamed from: b */
    public static void m13577b(C4453gi giVar) {
        int F = giVar.mo26034F();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (C4426fi fiVar : giVar.mo26036K()) {
            if (fiVar.mo25994N() == 3) {
                if (!fiVar.mo25993M()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(fiVar.mo25990E())}));
                } else if (fiVar.mo25992I() == zzoy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(fiVar.mo25990E())}));
                } else if (fiVar.mo25994N() != 2) {
                    if (fiVar.mo25990E() == F) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= fiVar.mo25991F().mo26731F() == zznr.ASYMMETRIC_PUBLIC;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(fiVar.mo25990E())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
