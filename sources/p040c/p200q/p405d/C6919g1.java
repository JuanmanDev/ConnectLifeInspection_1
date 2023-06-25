package p040c.p200q.p405d;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p040c.p200q.p405d.C6988u;

/* renamed from: c.q.d.g1 */
/* compiled from: SmallSortedMap */
public class C6919g1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: e */
    public final int f13241e;

    /* renamed from: l */
    public List<C6919g1<K, V>.e> f13242l;

    /* renamed from: m */
    public Map<K, V> f13243m;

    /* renamed from: n */
    public boolean f13244n;

    /* renamed from: o */
    public volatile C6919g1<K, V>.g f13245o;

    /* renamed from: p */
    public Map<K, V> f13246p;

    /* renamed from: q */
    public volatile C6919g1<K, V>.c f13247q;

    /* renamed from: c.q.d.g1$a */
    /* compiled from: SmallSortedMap */
    public static class C6920a extends C6919g1<FieldDescriptorType, Object> {
        public C6920a(int i) {
            super(i, (C6920a) null);
        }

        /* renamed from: p */
        public void mo31972p() {
            if (!mo31971o()) {
                for (int i = 0; i < mo31967k(); i++) {
                    Map.Entry j = mo31966j(i);
                    if (((C6988u.C6990b) j.getKey()).mo32374f()) {
                        j.setValue(Collections.unmodifiableList((List) j.getValue()));
                    }
                }
                for (Map.Entry entry : mo31969m()) {
                    if (((C6988u.C6990b) entry.getKey()).mo32374f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C6919g1.super.mo31972p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C6919g1.super.put((C6988u.C6990b) obj, obj2);
        }
    }

    /* renamed from: c.q.d.g1$c */
    /* compiled from: SmallSortedMap */
    public class C6922c extends C6919g1<K, V>.g {
        public C6922c() {
            super(C6919g1.this, (C6920a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6921b(C6919g1.this, (C6920a) null);
        }

        public /* synthetic */ C6922c(C6919g1 g1Var, C6920a aVar) {
            this();
        }
    }

    /* renamed from: c.q.d.g1$d */
    /* compiled from: SmallSortedMap */
    public static class C6923d {

        /* renamed from: a */
        public static final Iterator<Object> f13252a = new C6924a();

        /* renamed from: b */
        public static final Iterable<Object> f13253b = new C6925b();

        /* renamed from: c.q.d.g1$d$a */
        /* compiled from: SmallSortedMap */
        public static class C6924a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: c.q.d.g1$d$b */
        /* compiled from: SmallSortedMap */
        public static class C6925b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C6923d.f13252a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m19916b() {
            return f13253b;
        }
    }

    /* renamed from: c.q.d.g1$e */
    /* compiled from: SmallSortedMap */
    public class C6926e implements Map.Entry<K, V>, Comparable<C6919g1<K, V>.e> {

        /* renamed from: e */
        public final K f13254e;

        /* renamed from: l */
        public V f13255l;

        public C6926e(C6919g1 g1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: c */
        public int compareTo(C6919g1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public final boolean mo31990d(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* renamed from: e */
        public K getKey() {
            return this.f13254e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!mo31990d(this.f13254e, entry.getKey()) || !mo31990d(this.f13255l, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f13255l;
        }

        public int hashCode() {
            K k = this.f13254e;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f13255l;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C6919g1.this.mo31961g();
            V v2 = this.f13255l;
            this.f13255l = v;
            return v2;
        }

        public String toString() {
            return this.f13254e + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + this.f13255l;
        }

        public C6926e(K k, V v) {
            this.f13254e = k;
            this.f13255l = v;
        }
    }

    /* renamed from: c.q.d.g1$g */
    /* compiled from: SmallSortedMap */
    public class C6928g extends AbstractSet<Map.Entry<K, V>> {
        public C6928g() {
        }

        /* renamed from: c */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C6919g1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C6919g1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C6919g1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6927f(C6919g1.this, (C6920a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C6919g1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C6919g1.this.size();
        }

        public /* synthetic */ C6928g(C6919g1 g1Var, C6920a aVar) {
            this();
        }
    }

    public /* synthetic */ C6919g1(int i, C6920a aVar) {
        this(i);
    }

    /* renamed from: q */
    public static <FieldDescriptorType extends C6988u.C6990b<FieldDescriptorType>> C6919g1<FieldDescriptorType, Object> m19898q(int i) {
        return new C6920a(i);
    }

    public void clear() {
        mo31961g();
        if (!this.f13242l.isEmpty()) {
            this.f13242l.clear();
        }
        if (!this.f13243m.isEmpty()) {
            this.f13243m.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo31960f(comparable) >= 0 || this.f13243m.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f13245o == null) {
            this.f13245o = new C6928g(this, (C6920a) null);
        }
        return this.f13245o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6919g1)) {
            return super.equals(obj);
        }
        C6919g1 g1Var = (C6919g1) obj;
        int size = size();
        if (size != g1Var.size()) {
            return false;
        }
        int k = mo31967k();
        if (k != g1Var.mo31967k()) {
            return entrySet().equals(g1Var.entrySet());
        }
        for (int i = 0; i < k; i++) {
            if (!mo31966j(i).equals(g1Var.mo31966j(i))) {
                return false;
            }
        }
        if (k != size) {
            return this.f13243m.equals(g1Var.f13243m);
        }
        return true;
    }

    /* renamed from: f */
    public final int mo31960f(K k) {
        int size = this.f13242l.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f13242l.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f13242l.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: g */
    public final void mo31961g() {
        if (this.f13244n) {
            throw new UnsupportedOperationException();
        }
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = mo31960f(comparable);
        if (f >= 0) {
            return this.f13242l.get(f).getValue();
        }
        return this.f13243m.get(comparable);
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo31963h() {
        if (this.f13247q == null) {
            this.f13247q = new C6922c(this, (C6920a) null);
        }
        return this.f13247q;
    }

    public int hashCode() {
        int k = mo31967k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            i += this.f13242l.get(i2).hashCode();
        }
        return mo31968l() > 0 ? i + this.f13243m.hashCode() : i;
    }

    /* renamed from: i */
    public final void mo31965i() {
        mo31961g();
        if (this.f13242l.isEmpty() && !(this.f13242l instanceof ArrayList)) {
            this.f13242l = new ArrayList(this.f13241e);
        }
    }

    /* renamed from: j */
    public Map.Entry<K, V> mo31966j(int i) {
        return this.f13242l.get(i);
    }

    /* renamed from: k */
    public int mo31967k() {
        return this.f13242l.size();
    }

    /* renamed from: l */
    public int mo31968l() {
        return this.f13243m.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> mo31969m() {
        if (this.f13243m.isEmpty()) {
            return C6923d.m19916b();
        }
        return this.f13243m.entrySet();
    }

    /* renamed from: n */
    public final SortedMap<K, V> mo31970n() {
        mo31961g();
        if (this.f13243m.isEmpty() && !(this.f13243m instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13243m = treeMap;
            this.f13246p = treeMap.descendingMap();
        }
        return (SortedMap) this.f13243m;
    }

    /* renamed from: o */
    public boolean mo31971o() {
        return this.f13244n;
    }

    /* renamed from: p */
    public void mo31972p() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f13244n) {
            if (this.f13243m.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f13243m);
            }
            this.f13243m = map;
            if (this.f13246p.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f13246p);
            }
            this.f13246p = map2;
            this.f13244n = true;
        }
    }

    /* renamed from: r */
    public V put(K k, V v) {
        mo31961g();
        int f = mo31960f(k);
        if (f >= 0) {
            return this.f13242l.get(f).setValue(v);
        }
        mo31965i();
        int i = -(f + 1);
        if (i >= this.f13241e) {
            return mo31970n().put(k, v);
        }
        int size = this.f13242l.size();
        int i2 = this.f13241e;
        if (size == i2) {
            C6926e remove = this.f13242l.remove(i2 - 1);
            mo31970n().put(remove.getKey(), remove.getValue());
        }
        this.f13242l.add(i, new C6926e(k, v));
        return null;
    }

    public V remove(Object obj) {
        mo31961g();
        Comparable comparable = (Comparable) obj;
        int f = mo31960f(comparable);
        if (f >= 0) {
            return mo31976s(f);
        }
        if (this.f13243m.isEmpty()) {
            return null;
        }
        return this.f13243m.remove(comparable);
    }

    /* renamed from: s */
    public final V mo31976s(int i) {
        mo31961g();
        V value = this.f13242l.remove(i).getValue();
        if (!this.f13243m.isEmpty()) {
            Iterator it = mo31970n().entrySet().iterator();
            this.f13242l.add(new C6926e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public int size() {
        return this.f13242l.size() + this.f13243m.size();
    }

    /* renamed from: c.q.d.g1$b */
    /* compiled from: SmallSortedMap */
    public class C6921b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e */
        public int f13248e;

        /* renamed from: l */
        public Iterator<Map.Entry<K, V>> f13249l;

        public C6921b() {
            this.f13248e = C6919g1.this.f13242l.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo31978a() {
            if (this.f13249l == null) {
                this.f13249l = C6919g1.this.f13246p.entrySet().iterator();
            }
            return this.f13249l;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (mo31978a().hasNext()) {
                return (Map.Entry) mo31978a().next();
            }
            List b = C6919g1.this.f13242l;
            int i = this.f13248e - 1;
            this.f13248e = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f13248e;
            return (i > 0 && i <= C6919g1.this.f13242l.size()) || mo31978a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C6921b(C6919g1 g1Var, C6920a aVar) {
            this();
        }
    }

    /* renamed from: c.q.d.g1$f */
    /* compiled from: SmallSortedMap */
    public class C6927f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e */
        public int f13257e;

        /* renamed from: l */
        public boolean f13258l;

        /* renamed from: m */
        public Iterator<Map.Entry<K, V>> f13259m;

        public C6927f() {
            this.f13257e = -1;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo31998a() {
            if (this.f13259m == null) {
                this.f13259m = C6919g1.this.f13243m.entrySet().iterator();
            }
            return this.f13259m;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f13258l = true;
            int i = this.f13257e + 1;
            this.f13257e = i;
            if (i < C6919g1.this.f13242l.size()) {
                return (Map.Entry) C6919g1.this.f13242l.get(this.f13257e);
            }
            return (Map.Entry) mo31998a().next();
        }

        public boolean hasNext() {
            if (this.f13257e + 1 < C6919g1.this.f13242l.size()) {
                return true;
            }
            if (C6919g1.this.f13243m.isEmpty() || !mo31998a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f13258l) {
                this.f13258l = false;
                C6919g1.this.mo31961g();
                if (this.f13257e < C6919g1.this.f13242l.size()) {
                    C6919g1 g1Var = C6919g1.this;
                    int i = this.f13257e;
                    this.f13257e = i - 1;
                    Object unused = g1Var.mo31976s(i);
                    return;
                }
                mo31998a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C6927f(C6919g1 g1Var, C6920a aVar) {
            this();
        }
    }

    public C6919g1(int i) {
        this.f13241e = i;
        this.f13242l = Collections.emptyList();
        this.f13243m = Collections.emptyMap();
        this.f13246p = Collections.emptyMap();
    }
}
