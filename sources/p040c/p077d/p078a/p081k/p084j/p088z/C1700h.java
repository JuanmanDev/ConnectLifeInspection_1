package p040c.p077d.p078a.p081k.p084j.p088z;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p077d.p078a.p081k.p084j.p088z.C1710m;

/* renamed from: c.d.a.k.j.z.h */
/* compiled from: GroupedLinkedMap */
public class C1700h<K extends C1710m, V> {

    /* renamed from: a */
    public final C1701a<K, V> f1228a = new C1701a<>();

    /* renamed from: b */
    public final Map<K, C1701a<K, V>> f1229b = new HashMap();

    /* renamed from: c.d.a.k.j.z.h$a */
    /* compiled from: GroupedLinkedMap */
    public static class C1701a<K, V> {

        /* renamed from: a */
        public final K f1230a;

        /* renamed from: b */
        public List<V> f1231b;

        /* renamed from: c */
        public C1701a<K, V> f1232c;

        /* renamed from: d */
        public C1701a<K, V> f1233d;

        public C1701a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo15933a(V v) {
            if (this.f1231b == null) {
                this.f1231b = new ArrayList();
            }
            this.f1231b.add(v);
        }

        @Nullable
        /* renamed from: b */
        public V mo15934b() {
            int c = mo15935c();
            if (c > 0) {
                return this.f1231b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo15935c() {
            List<V> list = this.f1231b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C1701a(K k) {
            this.f1233d = this;
            this.f1232c = this;
            this.f1230a = k;
        }
    }

    /* renamed from: e */
    public static <K, V> void m1681e(C1701a<K, V> aVar) {
        C1701a<K, V> aVar2 = aVar.f1233d;
        aVar2.f1232c = aVar.f1232c;
        aVar.f1232c.f1233d = aVar2;
    }

    /* renamed from: g */
    public static <K, V> void m1682g(C1701a<K, V> aVar) {
        aVar.f1232c.f1233d = aVar;
        aVar.f1233d.f1232c = aVar;
    }

    @Nullable
    /* renamed from: a */
    public V mo15927a(K k) {
        C1701a aVar = this.f1229b.get(k);
        if (aVar == null) {
            aVar = new C1701a(k);
            this.f1229b.put(k, aVar);
        } else {
            k.mo15910a();
        }
        mo15928b(aVar);
        return aVar.mo15934b();
    }

    /* renamed from: b */
    public final void mo15928b(C1701a<K, V> aVar) {
        m1681e(aVar);
        C1701a<K, V> aVar2 = this.f1228a;
        aVar.f1233d = aVar2;
        aVar.f1232c = aVar2.f1232c;
        m1682g(aVar);
    }

    /* renamed from: c */
    public final void mo15929c(C1701a<K, V> aVar) {
        m1681e(aVar);
        C1701a<K, V> aVar2 = this.f1228a;
        aVar.f1233d = aVar2.f1233d;
        aVar.f1232c = aVar2;
        m1682g(aVar);
    }

    /* renamed from: d */
    public void mo15930d(K k, V v) {
        C1701a aVar = this.f1229b.get(k);
        if (aVar == null) {
            aVar = new C1701a(k);
            mo15929c(aVar);
            this.f1229b.put(k, aVar);
        } else {
            k.mo15910a();
        }
        aVar.mo15933a(v);
    }

    @Nullable
    /* renamed from: f */
    public V mo15931f() {
        for (C1701a<K, V> aVar = this.f1228a.f1233d; !aVar.equals(this.f1228a); aVar = aVar.f1233d) {
            V b = aVar.mo15934b();
            if (b != null) {
                return b;
            }
            m1681e(aVar);
            this.f1229b.remove(aVar.f1230a);
            ((C1710m) aVar.f1230a).mo15910a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1701a<K, V> aVar = this.f1228a.f1232c; !aVar.equals(this.f1228a); aVar = aVar.f1232c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f1230a);
            sb.append(':');
            sb.append(aVar.mo15935c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
