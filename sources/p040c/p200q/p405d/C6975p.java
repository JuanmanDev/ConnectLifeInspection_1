package p040c.p200q.p405d;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.d.p */
/* compiled from: ExtensionRegistryLite */
public class C6975p {

    /* renamed from: b */
    public static boolean f13341b = true;

    /* renamed from: c */
    public static volatile C6975p f13342c;

    /* renamed from: d */
    public static final C6975p f13343d = new C6975p(true);

    /* renamed from: a */
    public final Map<C6976a, GeneratedMessageLite.C8430e<?, ?>> f13344a;

    /* renamed from: c.q.d.p$a */
    /* compiled from: ExtensionRegistryLite */
    public static final class C6976a {

        /* renamed from: a */
        public final Object f13345a;

        /* renamed from: b */
        public final int f13346b;

        public C6976a(Object obj, int i) {
            this.f13345a = obj;
            this.f13346b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6976a)) {
                return false;
            }
            C6976a aVar = (C6976a) obj;
            if (this.f13345a == aVar.f13345a && this.f13346b == aVar.f13346b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f13345a) * 65535) + this.f13346b;
        }
    }

    public C6975p() {
        this.f13344a = new HashMap();
    }

    /* renamed from: b */
    public static C6975p m20507b() {
        C6975p pVar = f13342c;
        if (pVar == null) {
            synchronized (C6975p.class) {
                pVar = f13342c;
                if (pVar == null) {
                    pVar = f13341b ? C6967o.m20428a() : f13343d;
                    f13342c = pVar;
                }
            }
        }
        return pVar;
    }

    /* renamed from: a */
    public <ContainingType extends C6954m0> GeneratedMessageLite.C8430e<ContainingType, ?> mo32279a(ContainingType containingtype, int i) {
        return this.f13344a.get(new C6976a(containingtype, i));
    }

    public C6975p(boolean z) {
        this.f13344a = Collections.emptyMap();
    }
}
