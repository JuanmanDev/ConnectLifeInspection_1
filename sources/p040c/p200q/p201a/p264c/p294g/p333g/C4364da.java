package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: c.q.a.c.g.g.da */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4364da {

    /* renamed from: a */
    public final Class f9168a;

    /* renamed from: b */
    public final Map f9169b;

    /* renamed from: c */
    public final Class f9170c;

    @SafeVarargs
    public C4364da(Class cls, C4897xa... xaVarArr) {
        this.f9168a = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            C4897xa xaVar = xaVarArr[i];
            if (!hashMap.containsKey(xaVar.mo26821b())) {
                hashMap.put(xaVar.mo26821b(), xaVar);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(xaVar.mo26821b().getCanonicalName())));
            }
        }
        this.f9170c = xaVarArr[0].mo26821b();
        this.f9169b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public C4337ca mo25847a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract zznr mo25848b();

    /* renamed from: c */
    public abstract C4572l2 mo25849c(zzacc zzacc);

    /* renamed from: d */
    public abstract String mo25850d();

    /* renamed from: e */
    public abstract void mo25851e(C4572l2 l2Var);

    /* renamed from: f */
    public int mo25891f() {
        return 1;
    }

    /* renamed from: g */
    public final Class mo25892g() {
        return this.f9170c;
    }

    /* renamed from: h */
    public final Class mo25893h() {
        return this.f9168a;
    }

    /* renamed from: i */
    public final Object mo25894i(C4572l2 l2Var, Class cls) {
        C4897xa xaVar = (C4897xa) this.f9169b.get(cls);
        if (xaVar != null) {
            return xaVar.mo25786a(l2Var);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    /* renamed from: j */
    public final Set mo25895j() {
        return this.f9169b.keySet();
    }
}
