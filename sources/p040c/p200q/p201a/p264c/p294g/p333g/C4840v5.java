package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.q.a.c.g.g.v5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4840v5 {

    /* renamed from: a */
    public static final Logger f9701a = Logger.getLogger(C4840v5.class.getName());

    /* renamed from: b */
    public static final AtomicReference f9702b = new AtomicReference(new C4943z4());

    /* renamed from: c */
    public static final ConcurrentMap f9703c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap f9704d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap f9705e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap f9706f = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
    }

    @Deprecated
    /* renamed from: a */
    public static C4787t4 m13295a(String str) {
        return ((C4943z4) f9702b.get()).mo26870a(str);
    }

    /* renamed from: b */
    public static C4787t4 m13296b(String str) {
        return ((C4943z4) f9702b.get()).mo26872c(str);
    }

    /* renamed from: c */
    public static synchronized C4826uh m13297c(C4930yh yhVar) {
        C4826uh f;
        synchronized (C4840v5.class) {
            C4787t4 b = m13296b(yhVar.mo26865J());
            if (((Boolean) f9704d.get(yhVar.mo26865J())).booleanValue()) {
                f = b.mo26668f(yhVar.mo26864I());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(yhVar.mo26865J())));
            }
        }
        return f;
    }

    /* renamed from: d */
    public static synchronized C4572l2 m13298d(C4930yh yhVar) {
        C4572l2 e;
        synchronized (C4840v5.class) {
            C4787t4 b = m13296b(yhVar.mo26865J());
            if (((Boolean) f9704d.get(yhVar.mo26865J())).booleanValue()) {
                e = b.mo26667e(yhVar.mo26864I());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(yhVar.mo26865J())));
            }
        }
        return e;
    }

    /* renamed from: e */
    public static Class m13299e(Class cls) {
        C4736r5 r5Var = (C4736r5) f9705e.get(cls);
        if (r5Var == null) {
            return null;
        }
        return r5Var.zza();
    }

    @Deprecated
    /* renamed from: f */
    public static Object m13300f(C4826uh uhVar) {
        String J = uhVar.mo26733J();
        return ((C4943z4) f9702b.get()).mo26870a(J).mo26665c(uhVar.mo26732I());
    }

    /* renamed from: g */
    public static Object m13301g(C4826uh uhVar, Class cls) {
        return m13302h(uhVar.mo26733J(), uhVar.mo26732I(), cls);
    }

    /* renamed from: h */
    public static Object m13302h(String str, zzacc zzacc, Class cls) {
        return ((C4943z4) f9702b.get()).mo26871b(str, cls).mo26665c(zzacc);
    }

    /* renamed from: i */
    public static Object m13303i(String str, C4572l2 l2Var, Class cls) {
        return ((C4943z4) f9702b.get()).mo26871b(str, cls).mo26664a(l2Var);
    }

    /* renamed from: j */
    public static Object m13304j(String str, byte[] bArr, Class cls) {
        return m13302h(str, zzacc.zzn(bArr), cls);
    }

    /* renamed from: k */
    public static Object m13305k(C4710q5 q5Var, Class cls) {
        C4736r5 r5Var = (C4736r5) f9705e.get(cls);
        if (r5Var == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(q5Var.mo26569c().getName())));
        } else if (r5Var.zza().equals(q5Var.mo26569c())) {
            return r5Var.mo25790b(q5Var);
        } else {
            String obj = r5Var.zza().toString();
            String obj2 = q5Var.mo26569c().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    /* renamed from: l */
    public static synchronized Map m13306l() {
        Map unmodifiableMap;
        synchronized (C4840v5.class) {
            unmodifiableMap = Collections.unmodifiableMap(f9706f);
        }
        return unmodifiableMap;
    }

    /* renamed from: m */
    public static synchronized void m13307m(C4923ya yaVar, C4364da daVar, boolean z) {
        synchronized (C4840v5.class) {
            C4943z4 z4Var = new C4943z4((C4943z4) f9702b.get());
            z4Var.mo26873d(yaVar, daVar);
            String d = yaVar.mo25850d();
            String d2 = daVar.mo25850d();
            m13310p(d, yaVar.mo25847a().mo25815c(), true);
            m13310p(d2, Collections.emptyMap(), false);
            if (!((C4943z4) f9702b.get()).mo26875f(d)) {
                f9703c.put(d, new C4814u5(yaVar));
                m13311q(yaVar.mo25850d(), yaVar.mo25847a().mo25815c());
            }
            f9704d.put(d, Boolean.TRUE);
            f9704d.put(d2, Boolean.FALSE);
            f9702b.set(z4Var);
        }
    }

    /* renamed from: n */
    public static synchronized void m13308n(C4364da daVar, boolean z) {
        synchronized (C4840v5.class) {
            C4943z4 z4Var = new C4943z4((C4943z4) f9702b.get());
            z4Var.mo26874e(daVar);
            String d = daVar.mo25850d();
            m13310p(d, daVar.mo25847a().mo25815c(), true);
            if (!((C4943z4) f9702b.get()).mo26875f(d)) {
                f9703c.put(d, new C4814u5(daVar));
                m13311q(d, daVar.mo25847a().mo25815c());
            }
            f9704d.put(d, Boolean.TRUE);
            f9702b.set(z4Var);
        }
    }

    /* renamed from: o */
    public static synchronized void m13309o(C4736r5 r5Var) {
        synchronized (C4840v5.class) {
            if (r5Var != null) {
                Class a = r5Var.mo25789a();
                if (f9705e.containsKey(a)) {
                    C4736r5 r5Var2 = (C4736r5) f9705e.get(a);
                    if (!r5Var.getClass().getName().equals(r5Var2.getClass().getName())) {
                        f9701a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(a.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a.getName(), r5Var2.getClass().getName(), r5Var.getClass().getName()}));
                    }
                }
                f9705e.put(a, r5Var);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: p */
    public static synchronized void m13310p(String str, Map map, boolean z) {
        synchronized (C4840v5.class) {
            if (z) {
                if (f9704d.containsKey(str)) {
                    if (!((Boolean) f9704d.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((C4943z4) f9702b.get()).mo26875f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f9706f.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f9706f.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, c.q.a.c.g.g.l2] */
    /* renamed from: q */
    public static void m13311q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f9706f.put((String) entry.getKey(), C4305b5.m11706e(str, ((C4310ba) entry.getValue()).f9135a.mo26231i(), ((C4310ba) entry.getValue()).f9136b));
        }
    }
}
