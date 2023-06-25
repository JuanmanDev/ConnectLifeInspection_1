package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;
import p040c.p200q.p353b.p354a.C5852o;
import p040c.p200q.p353b.p354a.C5865r;
import p040c.p200q.p353b.p355b.C5927d3;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6148s2;

/* renamed from: c.q.b.b.c3 */
/* compiled from: StandardTable */
public class C5895c3<R, C, V> extends C6103q<R, C, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Map<R, Map<C, V>> backingMap;
    public transient Set<C> columnKeySet;
    public transient C5895c3<R, C, V>.f columnMap;
    public final C5865r<? extends Map<C, V>> factory;
    public transient Map<R, Map<C, V>> rowMap;

    /* renamed from: c.q.b.b.c3$b */
    /* compiled from: StandardTable */
    public class C5897b implements Iterator<C5927d3.C5928a<R, C, V>> {

        /* renamed from: e */
        public final Iterator<Map.Entry<R, Map<C, V>>> f11424e;

        /* renamed from: l */
        public Map.Entry<R, Map<C, V>> f11425l;

        /* renamed from: m */
        public Iterator<Map.Entry<C, V>> f11426m;

        public C5897b() {
            this.f11424e = C5895c3.this.backingMap.entrySet().iterator();
            this.f11426m = C6028l1.m16938j();
        }

        /* renamed from: a */
        public C5927d3.C5928a<R, C, V> next() {
            if (!this.f11426m.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f11424e.next();
                this.f11425l = next;
                this.f11426m = next.getValue().entrySet().iterator();
            }
            Map.Entry next2 = this.f11426m.next();
            return C5963e3.m16820b(this.f11425l.getKey(), next2.getKey(), next2.getValue());
        }

        public boolean hasNext() {
            return this.f11424e.hasNext() || this.f11426m.hasNext();
        }

        public void remove() {
            this.f11426m.remove();
            if (this.f11425l.getValue().isEmpty()) {
                this.f11424e.remove();
                this.f11425l = null;
            }
        }
    }

    /* renamed from: c.q.b.b.c3$c */
    /* compiled from: StandardTable */
    public class C5898c extends C6108q1.C6130r<R, V> {

        /* renamed from: n */
        public final C f11428n;

        /* renamed from: c.q.b.b.c3$c$a */
        /* compiled from: StandardTable */
        public class C5899a extends C6148s2.C6149a<Map.Entry<R, V>> {
            public C5899a() {
            }

            public void clear() {
                C5898c.this.mo29103d(C5852o.m16604a());
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return C5895c3.this.containsMapping(entry.getKey(), C5898c.this.f11428n, entry.getValue());
            }

            public boolean isEmpty() {
                C5898c cVar = C5898c.this;
                return !C5895c3.this.containsColumn(cVar.f11428n);
            }

            public Iterator<Map.Entry<R, V>> iterator() {
                return new C5900b();
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return C5895c3.this.removeMapping(entry.getKey(), C5898c.this.f11428n, entry.getValue());
            }

            public boolean retainAll(Collection<?> collection) {
                return C5898c.this.mo29103d(C5852o.m16609f(C5852o.m16607d(collection)));
            }

            public int size() {
                int i = 0;
                for (Map<C, V> containsKey : C5895c3.this.backingMap.values()) {
                    if (containsKey.containsKey(C5898c.this.f11428n)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* renamed from: c.q.b.b.c3$c$b */
        /* compiled from: StandardTable */
        public class C5900b extends C5886c<Map.Entry<R, V>> {

            /* renamed from: m */
            public final Iterator<Map.Entry<R, Map<C, V>>> f11431m;

            /* renamed from: c.q.b.b.c3$c$b$a */
            /* compiled from: StandardTable */
            public class C5901a extends C5978g<R, V> {

                /* renamed from: e */
                public final /* synthetic */ Map.Entry f11433e;

                public C5901a(Map.Entry entry) {
                    this.f11433e = entry;
                }

                public R getKey() {
                    return this.f11433e.getKey();
                }

                public V getValue() {
                    return ((Map) this.f11433e.getValue()).get(C5898c.this.f11428n);
                }

                public V setValue(V v) {
                    C c = C5898c.this.f11428n;
                    C5850m.m16594o(v);
                    return ((Map) this.f11433e.getValue()).put(c, v);
                }
            }

            public C5900b() {
                this.f11431m = C5895c3.this.backingMap.entrySet().iterator();
            }

            /* renamed from: d */
            public Map.Entry<R, V> mo29067a() {
                while (this.f11431m.hasNext()) {
                    Map.Entry next = this.f11431m.next();
                    if (((Map) next.getValue()).containsKey(C5898c.this.f11428n)) {
                        return new C5901a(next);
                    }
                }
                return (Map.Entry) mo29068b();
            }
        }

        /* renamed from: c.q.b.b.c3$c$c */
        /* compiled from: StandardTable */
        public class C5902c extends C6108q1.C6125m<R, V> {
            public C5902c() {
                super(C5898c.this);
            }

            public boolean contains(Object obj) {
                C5898c cVar = C5898c.this;
                return C5895c3.this.contains(obj, cVar.f11428n);
            }

            public boolean remove(Object obj) {
                C5898c cVar = C5898c.this;
                return C5895c3.this.remove(obj, cVar.f11428n) != null;
            }

            public boolean retainAll(Collection<?> collection) {
                return C5898c.this.mo29103d(C6108q1.m17178n(C5852o.m16609f(C5852o.m16607d(collection))));
            }
        }

        /* renamed from: c.q.b.b.c3$c$d */
        /* compiled from: StandardTable */
        public class C5903d extends C6108q1.C6129q<R, V> {
            public C5903d() {
                super(C5898c.this);
            }

            public boolean remove(Object obj) {
                return obj != null && C5898c.this.mo29103d(C6108q1.m17164E(C5852o.m16606c(obj)));
            }

            public boolean removeAll(Collection<?> collection) {
                return C5898c.this.mo29103d(C6108q1.m17164E(C5852o.m16607d(collection)));
            }

            public boolean retainAll(Collection<?> collection) {
                return C5898c.this.mo29103d(C6108q1.m17164E(C5852o.m16609f(C5852o.m16607d(collection))));
            }
        }

        public C5898c(C c) {
            C5850m.m16594o(c);
            this.f11428n = c;
        }

        /* renamed from: a */
        public Set<Map.Entry<R, V>> mo29100a() {
            return new C5899a();
        }

        /* renamed from: b */
        public Set<R> mo29057b() {
            return new C5902c();
        }

        /* renamed from: c */
        public Collection<V> mo29101c() {
            return new C5903d();
        }

        public boolean containsKey(Object obj) {
            return C5895c3.this.contains(obj, this.f11428n);
        }

        /* renamed from: d */
        public boolean mo29103d(C5851n<? super Map.Entry<R, V>> nVar) {
            Iterator<Map.Entry<R, Map<C, V>>> it = C5895c3.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                Map map = (Map) next.getValue();
                Object obj = map.get(this.f11428n);
                if (obj != null && nVar.apply(C6108q1.m17173i(next.getKey(), obj))) {
                    map.remove(this.f11428n);
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public V get(Object obj) {
            return C5895c3.this.get(obj, this.f11428n);
        }

        public V put(R r, V v) {
            return C5895c3.this.put(r, this.f11428n, v);
        }

        public V remove(Object obj) {
            return C5895c3.this.remove(obj, this.f11428n);
        }
    }

    /* renamed from: c.q.b.b.c3$d */
    /* compiled from: StandardTable */
    public class C5904d extends C5886c<C> {

        /* renamed from: m */
        public final Map<C, V> f11437m;

        /* renamed from: n */
        public final Iterator<Map<C, V>> f11438n;

        /* renamed from: o */
        public Iterator<Map.Entry<C, V>> f11439o;

        public C5904d() {
            this.f11437m = (Map) C5895c3.this.factory.get();
            this.f11438n = C5895c3.this.backingMap.values().iterator();
            this.f11439o = C6028l1.m16936h();
        }

        /* renamed from: a */
        public C mo29067a() {
            while (true) {
                if (this.f11439o.hasNext()) {
                    Map.Entry next = this.f11439o.next();
                    if (!this.f11437m.containsKey(next.getKey())) {
                        this.f11437m.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else if (!this.f11438n.hasNext()) {
                    return mo29068b();
                } else {
                    this.f11439o = this.f11438n.next().entrySet().iterator();
                }
            }
        }
    }

    /* renamed from: c.q.b.b.c3$e */
    /* compiled from: StandardTable */
    public class C5905e extends C5895c3<R, C, V>.i<C> {
        public C5905e() {
            super();
        }

        public boolean contains(Object obj) {
            return C5895c3.this.containsColumn(obj);
        }

        public Iterator<C> iterator() {
            return C5895c3.this.createColumnKeyIterator();
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = C5895c3.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().remove(obj)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public boolean removeAll(Collection<?> collection) {
            C5850m.m16594o(collection);
            Iterator<Map<C, V>> it = C5895c3.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map next = it.next();
                if (C6028l1.m16946r(next.keySet().iterator(), collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            C5850m.m16594o(collection);
            Iterator<Map<C, V>> it = C5895c3.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().retainAll(collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public int size() {
            return C6028l1.m16949u(iterator());
        }
    }

    /* renamed from: c.q.b.b.c3$f */
    /* compiled from: StandardTable */
    public class C5906f extends C6108q1.C6130r<C, Map<R, V>> {

        /* renamed from: c.q.b.b.c3$f$a */
        /* compiled from: StandardTable */
        public class C5907a extends C5895c3<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* renamed from: c.q.b.b.c3$f$a$a */
            /* compiled from: StandardTable */
            public class C5908a implements C5838g<C, Map<R, V>> {
                public C5908a() {
                }

                /* renamed from: a */
                public Map<R, V> apply(C c) {
                    return C5895c3.this.column(c);
                }
            }

            public C5907a() {
                super();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!C5895c3.this.containsColumn(entry.getKey())) {
                    return false;
                }
                return C5906f.this.get(entry.getKey()).equals(entry.getValue());
            }

            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return C6108q1.m17167c(C5895c3.this.columnKeySet(), new C5908a());
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map unused = C5895c3.this.removeColumn(((Map.Entry) obj).getKey());
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                C5850m.m16594o(collection);
                return C6148s2.m17253f(this, collection.iterator());
            }

            public boolean retainAll(Collection<?> collection) {
                C5850m.m16594o(collection);
                Iterator it = C6049n1.m16981i(C5895c3.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C6108q1.m17173i(next, C5895c3.this.column(next)))) {
                        Map unused = C5895c3.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }

            public int size() {
                return C5895c3.this.columnKeySet().size();
            }
        }

        /* renamed from: c.q.b.b.c3$f$b */
        /* compiled from: StandardTable */
        public class C5909b extends C6108q1.C6129q<C, Map<R, V>> {
            public C5909b() {
                super(C5906f.this);
            }

            public boolean remove(Object obj) {
                for (Map.Entry entry : C5906f.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        Map unused = C5895c3.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            public boolean removeAll(Collection<?> collection) {
                C5850m.m16594o(collection);
                Iterator it = C6049n1.m16981i(C5895c3.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(C5895c3.this.column(next))) {
                        Map unused = C5895c3.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                C5850m.m16594o(collection);
                Iterator it = C6049n1.m16981i(C5895c3.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C5895c3.this.column(next))) {
                        Map unused = C5895c3.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        public C5906f() {
        }

        /* renamed from: a */
        public Set<Map.Entry<C, Map<R, V>>> mo29100a() {
            return new C5907a();
        }

        /* renamed from: c */
        public Collection<Map<R, V>> mo29101c() {
            return new C5909b();
        }

        public boolean containsKey(Object obj) {
            return C5895c3.this.containsColumn(obj);
        }

        /* renamed from: d */
        public Map<R, V> get(Object obj) {
            if (C5895c3.this.containsColumn(obj)) {
                return C5895c3.this.column(obj);
            }
            return null;
        }

        /* renamed from: e */
        public Map<R, V> remove(Object obj) {
            if (C5895c3.this.containsColumn(obj)) {
                return C5895c3.this.removeColumn(obj);
            }
            return null;
        }

        public Set<C> keySet() {
            return C5895c3.this.columnKeySet();
        }
    }

    /* renamed from: c.q.b.b.c3$g */
    /* compiled from: StandardTable */
    public class C5910g extends C6108q1.C6123l<C, V> {

        /* renamed from: e */
        public final R f11446e;

        /* renamed from: l */
        public Map<C, V> f11447l;

        /* renamed from: c.q.b.b.c3$g$a */
        /* compiled from: StandardTable */
        public class C5911a implements Iterator<Map.Entry<C, V>> {

            /* renamed from: e */
            public final /* synthetic */ Iterator f11449e;

            public C5911a(Iterator it) {
                this.f11449e = it;
            }

            /* renamed from: a */
            public Map.Entry<C, V> next() {
                return C5910g.this.mo29141e((Map.Entry) this.f11449e.next());
            }

            public boolean hasNext() {
                return this.f11449e.hasNext();
            }

            public void remove() {
                this.f11449e.remove();
                C5910g.this.mo29140d();
            }
        }

        /* renamed from: c.q.b.b.c3$g$b */
        /* compiled from: StandardTable */
        public class C5912b extends C6135r0<C, V> {

            /* renamed from: e */
            public final /* synthetic */ Map.Entry f11451e;

            public C5912b(C5910g gVar, Map.Entry entry) {
                this.f11451e = entry;
            }

            /* renamed from: c */
            public Map.Entry<C, V> delegate() {
                return this.f11451e;
            }

            public boolean equals(Object obj) {
                return standardEquals(obj);
            }

            public V setValue(V v) {
                C5850m.m16594o(v);
                return super.setValue(v);
            }
        }

        public C5910g(R r) {
            C5850m.m16594o(r);
            this.f11446e = r;
        }

        /* renamed from: a */
        public Iterator<Map.Entry<C, V>> mo29135a() {
            Map b = mo29136b();
            if (b == null) {
                return C6028l1.m16938j();
            }
            return new C5911a(b.entrySet().iterator());
        }

        /* renamed from: b */
        public Map<C, V> mo29136b() {
            Map<C, V> map = this.f11447l;
            if (map != null && (!map.isEmpty() || !C5895c3.this.backingMap.containsKey(this.f11446e))) {
                return this.f11447l;
            }
            Map<C, V> c = mo29137c();
            this.f11447l = c;
            return c;
        }

        /* renamed from: c */
        public Map<C, V> mo29137c() {
            return C5895c3.this.backingMap.get(this.f11446e);
        }

        public void clear() {
            Map b = mo29136b();
            if (b != null) {
                b.clear();
            }
            mo29140d();
        }

        public boolean containsKey(Object obj) {
            Map b = mo29136b();
            return (obj == null || b == null || !C6108q1.m17184t(b, obj)) ? false : true;
        }

        /* renamed from: d */
        public void mo29140d() {
            if (mo29136b() != null && this.f11447l.isEmpty()) {
                C5895c3.this.backingMap.remove(this.f11446e);
                this.f11447l = null;
            }
        }

        /* renamed from: e */
        public Map.Entry<C, V> mo29141e(Map.Entry<C, V> entry) {
            return new C5912b(this, entry);
        }

        public V get(Object obj) {
            Map b = mo29136b();
            if (obj == null || b == null) {
                return null;
            }
            return C6108q1.m17185u(b, obj);
        }

        public V put(C c, V v) {
            C5850m.m16594o(c);
            C5850m.m16594o(v);
            Map<C, V> map = this.f11447l;
            if (map == null || map.isEmpty()) {
                return C5895c3.this.put(this.f11446e, c, v);
            }
            return this.f11447l.put(c, v);
        }

        public V remove(Object obj) {
            Map b = mo29136b();
            if (b == null) {
                return null;
            }
            V v = C6108q1.m17186v(b, obj);
            mo29140d();
            return v;
        }

        public int size() {
            Map b = mo29136b();
            if (b == null) {
                return 0;
            }
            return b.size();
        }
    }

    /* renamed from: c.q.b.b.c3$h */
    /* compiled from: StandardTable */
    public class C5913h extends C6108q1.C6130r<R, Map<C, V>> {

        /* renamed from: c.q.b.b.c3$h$a */
        /* compiled from: StandardTable */
        public class C5914a extends C5895c3<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* renamed from: c.q.b.b.c3$h$a$a */
            /* compiled from: StandardTable */
            public class C5915a implements C5838g<R, Map<C, V>> {
                public C5915a() {
                }

                /* renamed from: a */
                public Map<C, V> apply(R r) {
                    return C5895c3.this.row(r);
                }
            }

            public C5914a() {
                super();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !C6170w.m17285d(C5895c3.this.backingMap.entrySet(), entry)) {
                    return false;
                }
                return true;
            }

            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return C6108q1.m17167c(C5895c3.this.backingMap.keySet(), new C5915a());
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !C5895c3.this.backingMap.entrySet().remove(entry)) {
                    return false;
                }
                return true;
            }

            public int size() {
                return C5895c3.this.backingMap.size();
            }
        }

        public C5913h() {
        }

        /* renamed from: a */
        public Set<Map.Entry<R, Map<C, V>>> mo29100a() {
            return new C5914a();
        }

        public boolean containsKey(Object obj) {
            return C5895c3.this.containsRow(obj);
        }

        /* renamed from: d */
        public Map<C, V> get(Object obj) {
            if (C5895c3.this.containsRow(obj)) {
                return C5895c3.this.row(obj);
            }
            return null;
        }

        /* renamed from: e */
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return C5895c3.this.backingMap.remove(obj);
        }
    }

    /* renamed from: c.q.b.b.c3$i */
    /* compiled from: StandardTable */
    public abstract class C5916i<T> extends C6148s2.C6149a<T> {
        public C5916i() {
        }

        public void clear() {
            C5895c3.this.backingMap.clear();
        }

        public boolean isEmpty() {
            return C5895c3.this.backingMap.isEmpty();
        }
    }

    public C5895c3(Map<R, Map<C, V>> map, C5865r<? extends Map<C, V>> rVar) {
        this.backingMap = map;
        this.factory = rVar;
    }

    /* access modifiers changed from: private */
    public boolean containsMapping(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    private Map<C, V> getOrCreate(R r) {
        Map<C, V> map = this.backingMap.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = (Map) this.factory.get();
        this.backingMap.put(r, map2);
        return map2;
    }

    /* access modifiers changed from: private */
    public Map<R, V> removeColumn(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Object remove = ((Map) next.getValue()).remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (((Map) next.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    public boolean removeMapping(Object obj, Object obj2, Object obj3) {
        if (!containsMapping(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    public Iterator<C5927d3.C5928a<R, C, V>> cellIterator() {
        return new C5897b();
    }

    public Set<C5927d3.C5928a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    public void clear() {
        this.backingMap.clear();
    }

    public Map<R, V> column(C c) {
        return new C5898c(c);
    }

    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        C5905e eVar = new C5905e();
        this.columnKeySet = eVar;
        return eVar;
    }

    public Map<C, Map<R, V>> columnMap() {
        C5895c3<R, C, V>.f fVar = this.columnMap;
        if (fVar != null) {
            return fVar;
        }
        C5895c3<R, C, V>.f fVar2 = new C5906f();
        this.columnMap = fVar2;
        return fVar2;
    }

    public boolean contains(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map<C, V> t : this.backingMap.values()) {
            if (C6108q1.m17184t(t, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsRow(Object obj) {
        return obj != null && C6108q1.m17184t(this.backingMap, obj);
    }

    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        return new C5904d();
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new C5913h();
    }

    public V get(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return super.get(obj, obj2);
    }

    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    public V put(R r, C c, V v) {
        C5850m.m16594o(r);
        C5850m.m16594o(c);
        C5850m.m16594o(v);
        return getOrCreate(r).put(c, v);
    }

    public V remove(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) C6108q1.m17185u(this.backingMap, obj)) == null) {
            return null;
        }
        V remove = map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return remove;
    }

    public Map<C, V> row(R r) {
        return new C5910g(r);
    }

    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> createRowMap = createRowMap();
        this.rowMap = createRowMap;
        return createRowMap;
    }

    public int size() {
        int i = 0;
        for (Map<C, V> size : this.backingMap.values()) {
            i += size.size();
        }
        return i;
    }

    public Collection<V> values() {
        return super.values();
    }
}
