package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.q.a.c.g.g.u7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4816u7 {

    /* renamed from: a */
    public static final Logger f9657a = Logger.getLogger(C4816u7.class.getName());

    /* renamed from: b */
    public static final AtomicBoolean f9658b = new AtomicBoolean(false);

    /* renamed from: a */
    public static Boolean m13227a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f9657a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m13228b() {
        return f9658b.get();
    }
}
