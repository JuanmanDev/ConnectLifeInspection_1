package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.q.a.c.g.g.z4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4943z4 {

    /* renamed from: b */
    public static final Logger f9761b = Logger.getLogger(C4943z4.class.getName());

    /* renamed from: a */
    public final ConcurrentMap f9762a;

    public C4943z4() {
        this.f9762a = new ConcurrentHashMap();
    }

    @Deprecated
    /* renamed from: a */
    public final C4787t4 mo26870a(String str) {
        return mo26876g(str, (Class) null);
    }

    /* renamed from: b */
    public final C4787t4 mo26871b(String str, Class cls) {
        return mo26876g(str, cls);
    }

    /* renamed from: c */
    public final C4787t4 mo26872c(String str) {
        return mo26877h(str).mo26786a();
    }

    /* renamed from: d */
    public final synchronized void mo26873d(C4923ya yaVar, C4364da daVar) {
        Class c;
        int f = daVar.mo25891f();
        if (!C4790t7.m13146a(1)) {
            String valueOf = String.valueOf(yaVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (C4790t7.m13146a(f)) {
            String d = yaVar.mo25850d();
            String d2 = daVar.mo25850d();
            if (!(!this.f9762a.containsKey(d) || ((C4917y4) this.f9762a.get(d)).mo26788c() == null || (c = ((C4917y4) this.f9762a.get(d)).mo26788c()) == null)) {
                if (!c.getName().equals(daVar.getClass().getName())) {
                    Logger logger = f9761b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d + " with inconsistent public key type " + d2);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{yaVar.getClass().getName(), c.getName(), daVar.getClass().getName()}));
                }
            }
            mo26878i(new C4891x4(yaVar, daVar), true);
            mo26878i(new C4865w4(daVar), false);
        } else {
            String valueOf2 = String.valueOf(daVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* renamed from: e */
    public final synchronized void mo26874e(C4364da daVar) {
        if (C4790t7.m13146a(daVar.mo25891f())) {
            mo26878i(new C4865w4(daVar), false);
        } else {
            String valueOf = String.valueOf(daVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* renamed from: f */
    public final boolean mo26875f(String str) {
        return this.f9762a.containsKey(str);
    }

    /* renamed from: g */
    public final C4787t4 mo26876g(String str, Class cls) {
        C4917y4 h = mo26877h(str);
        if (cls == null) {
            return h.mo26786a();
        }
        if (h.mo26789d().contains(cls)) {
            return h.mo26790e(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(h.mo26787b());
        Set<Class> d = h.mo26789d();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : d) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    /* renamed from: h */
    public final synchronized C4917y4 mo26877h(String str) {
        if (this.f9762a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (C4917y4) this.f9762a.get(str);
    }

    /* renamed from: i */
    public final synchronized void mo26878i(C4917y4 y4Var, boolean z) {
        String d = y4Var.mo26786a().mo26666d();
        C4917y4 y4Var2 = (C4917y4) this.f9762a.get(d);
        if (y4Var2 != null) {
            if (!y4Var2.mo26787b().equals(y4Var.mo26787b())) {
                f9761b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(d));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{d, y4Var2.mo26787b().getName(), y4Var.mo26787b().getName()}));
            }
        }
        if (!z) {
            this.f9762a.putIfAbsent(d, y4Var);
        } else {
            this.f9762a.put(d, y4Var);
        }
    }

    public C4943z4(C4943z4 z4Var) {
        this.f9762a = new ConcurrentHashMap(z4Var.f9762a);
    }
}
