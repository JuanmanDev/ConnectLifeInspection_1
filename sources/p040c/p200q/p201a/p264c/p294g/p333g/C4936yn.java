package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzvg;
import java.lang.reflect.Type;

/* renamed from: c.q.a.c.g.g.yn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4936yn {
    /* renamed from: a */
    public static Object m13619a(String str, Type type) {
        if (type == String.class) {
            try {
                C4433fp fpVar = new C4433fp();
                fpVar.mo26002a(str);
                if (fpVar.mo26004d()) {
                    return fpVar.mo26003b();
                }
                throw new zzvg("No error message: " + str);
            } catch (Exception e) {
                throw new zzvg("Json conversion failed! ".concat(String.valueOf(e.getMessage())), e);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                C4297ao aoVar = (C4297ao) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    aoVar.mo25802c(str);
                    return aoVar;
                } catch (Exception e2) {
                    throw new zzvg("Json conversion failed! ".concat(String.valueOf(e2.getMessage())), e2);
                }
            } catch (Exception e3) {
                throw new zzvg("Instantiation of JsonResponse failed! ".concat(type.toString()), e3);
            }
        }
    }
}
