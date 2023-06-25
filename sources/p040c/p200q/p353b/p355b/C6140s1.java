package p040c.p200q.p353b.p355b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;

/* renamed from: c.q.b.b.s1 */
/* compiled from: Multimaps */
public final class C6140s1 {

    /* renamed from: c.q.b.b.s1$a */
    /* compiled from: Multimaps */
    public static final class C6141a<K, V> extends C6108q1.C6130r<K, Collection<V>> {

        /* renamed from: n */
        public final C6136r1<K, V> f11732n;

        /* renamed from: c.q.b.b.s1$a$a */
        /* compiled from: Multimaps */
        public class C6142a extends C6108q1.C6121j<K, Collection<V>> {

            /* renamed from: c.q.b.b.s1$a$a$a */
            /* compiled from: Multimaps */
            public class C6143a implements C5838g<K, Collection<V>> {
                public C6143a() {
                }

                /* renamed from: a */
                public Collection<V> apply(K k) {
                    return C6141a.this.f11732n.get(k);
                }
            }

            public C6142a() {
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return C6108q1.m17167c(C6141a.this.f11732n.keySet(), new C6143a());
            }

            /* renamed from: k */
            public Map<K, Collection<V>> mo29233k() {
                return C6141a.this;
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C6141a.this.mo29964g(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public C6141a(C6136r1<K, V> r1Var) {
            C5850m.m16594o(r1Var);
            this.f11732n = r1Var;
        }

        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo29100a() {
            return new C6142a();
        }

        public void clear() {
            this.f11732n.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f11732n.containsKey(obj);
        }

        /* renamed from: e */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f11732n.get(obj);
            }
            return null;
        }

        /* renamed from: f */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f11732n.removeAll(obj);
            }
            return null;
        }

        /* renamed from: g */
        public void mo29964g(Object obj) {
            this.f11732n.keySet().remove(obj);
        }

        public boolean isEmpty() {
            return this.f11732n.isEmpty();
        }

        public Set<K> keySet() {
            return this.f11732n.keySet();
        }

        public int size() {
            return this.f11732n.keySet().size();
        }
    }

    /* renamed from: c.q.b.b.s1$b */
    /* compiled from: Multimaps */
    public static abstract class C6144b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* renamed from: c */
        public abstract C6136r1<K, V> mo29481c();

        public void clear() {
            mo29481c().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo29481c().containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo29481c().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return mo29481c().size();
        }
    }

    /* renamed from: c.q.b.b.s1$c */
    /* compiled from: Multimaps */
    public static class C6145c<K, V> extends C5992i<K> {

        /* renamed from: e */
        public final C6136r1<K, V> f11735e;

        /* renamed from: c.q.b.b.s1$c$a */
        /* compiled from: Multimaps */
        public class C6146a extends C5977f3<Map.Entry<K, Collection<V>>, C6153t1.C6154a<K>> {

            /* renamed from: c.q.b.b.s1$c$a$a */
            /* compiled from: Multimaps */
            public class C6147a extends C6158u1.C6160b<K> {

                /* renamed from: e */
                public final /* synthetic */ Map.Entry f11736e;

                public C6147a(C6146a aVar, Map.Entry entry) {
                    this.f11736e = entry;
                }

                /* renamed from: a */
                public K mo29977a() {
                    return this.f11736e.getKey();
                }

                public int getCount() {
                    return ((Collection) this.f11736e.getValue()).size();
                }
            }

            public C6146a(C6145c cVar, Iterator it) {
                super(it);
            }

            /* renamed from: b */
            public C6153t1.C6154a<K> mo29448a(Map.Entry<K, Collection<V>> entry) {
                return new C6147a(this, entry);
            }
        }

        public C6145c(C6136r1<K, V> r1Var) {
            this.f11735e = r1Var;
        }

        public void clear() {
            this.f11735e.clear();
        }

        public boolean contains(Object obj) {
            return this.f11735e.containsKey(obj);
        }

        public int count(Object obj) {
            Collection collection = (Collection) C6108q1.m17185u(this.f11735e.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public int distinctElements() {
            return this.f11735e.asMap().size();
        }

        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        public Set<K> elementSet() {
            return this.f11735e.keySet();
        }

        public Iterator<C6153t1.C6154a<K>> entryIterator() {
            return new C6146a(this, this.f11735e.asMap().entrySet().iterator());
        }

        public Iterator<K> iterator() {
            return C6108q1.m17176l(this.f11735e.entries().iterator());
        }

        public int remove(Object obj, int i) {
            C6166v.m17276b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) C6108q1.m17185u(this.f11735e.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        public int size() {
            return this.f11735e.size();
        }
    }

    /* renamed from: a */
    public static boolean m17236a(C6136r1<?, ?> r1Var, Object obj) {
        if (obj == r1Var) {
            return true;
        }
        if (obj instanceof C6136r1) {
            return r1Var.asMap().equals(((C6136r1) obj).asMap());
        }
        return false;
    }
}
