package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: c.q.a.c.g.g.l5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4575l5 {

    /* renamed from: a */
    public final Class f9377a;

    /* renamed from: b */
    public ConcurrentMap f9378b = new ConcurrentHashMap();

    /* renamed from: c */
    public C4602m5 f9379c;

    /* renamed from: d */
    public C4421fd f9380d;

    public /* synthetic */ C4575l5(Class cls, C4548k5 k5Var) {
        this.f9377a = cls;
        this.f9380d = C4421fd.f9226b;
    }

    /* renamed from: a */
    public final C4575l5 mo26251a(Object obj, C4426fi fiVar) {
        mo26255e(obj, fiVar, true);
        return this;
    }

    /* renamed from: b */
    public final C4575l5 mo26252b(Object obj, C4426fi fiVar) {
        mo26255e(obj, fiVar, false);
        return this;
    }

    /* renamed from: c */
    public final C4575l5 mo26253c(C4421fd fdVar) {
        if (this.f9378b != null) {
            this.f9380d = fdVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    /* renamed from: d */
    public final C4710q5 mo26254d() {
        ConcurrentMap concurrentMap = this.f9378b;
        if (concurrentMap != null) {
            C4710q5 q5Var = new C4710q5(concurrentMap, this.f9379c, this.f9380d, this.f9377a, (C4683p5) null);
            this.f9378b = null;
            return q5Var;
        }
        throw new IllegalStateException("build cannot be called twice");
    }

    /* renamed from: e */
    public final C4575l5 mo26255e(Object obj, C4426fi fiVar, boolean z) {
        byte[] bArr;
        if (this.f9378b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (fiVar.mo25994N() == 3) {
            ConcurrentMap concurrentMap = this.f9378b;
            Integer valueOf = Integer.valueOf(fiVar.mo25990E());
            if (fiVar.mo25992I() == zzoy.RAW) {
                valueOf = null;
            }
            C4761s4 a = C4661oa.m12703b().mo26463a(C4949za.m13709a(fiVar.mo25991F().mo26733J(), fiVar.mo25991F().mo26732I(), fiVar.mo25991F().mo26731F(), fiVar.mo25992I(), valueOf), C4892x5.m13479a());
            int ordinal = fiVar.mo25992I().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = C4655o4.f9511a;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(fiVar.mo25990E()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(fiVar.mo25990E()).array();
            }
            C4602m5 m5Var = new C4602m5(obj, bArr, fiVar.mo25994N(), fiVar.mo25992I(), fiVar.mo25990E(), a);
            ArrayList arrayList = new ArrayList();
            arrayList.add(m5Var);
            C4656o5 o5Var = new C4656o5(m5Var.mo26305f(), (C4629n5) null);
            List list = (List) concurrentMap.put(o5Var, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(m5Var);
                concurrentMap.put(o5Var, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.f9379c == null) {
                    this.f9379c = m5Var;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }
}
