package p040c.p200q.p353b.p355b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.x */
/* compiled from: CompactHashMap */
public class C6174x<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: e */
    public transient int[] f11756e;

    /* renamed from: l */
    public transient long[] f11757l;

    /* renamed from: m */
    public transient Object[] f11758m;

    /* renamed from: n */
    public transient Object[] f11759n;

    /* renamed from: o */
    public transient int f11760o;

    /* renamed from: p */
    public transient int f11761p;

    /* renamed from: q */
    public transient Set<K> f11762q;

    /* renamed from: r */
    public transient Set<Map.Entry<K, V>> f11763r;

    /* renamed from: s */
    public transient Collection<V> f11764s;

    /* renamed from: c.q.b.b.x$a */
    /* compiled from: CompactHashMap */
    public class C6175a extends C6174x<K, V>.e<K> {
        public C6175a() {
            super(C6174x.this, (C6175a) null);
        }

        /* renamed from: b */
        public K mo30068b(int i) {
            return C6174x.this.f11758m[i];
        }
    }

    /* renamed from: c.q.b.b.x$b */
    /* compiled from: CompactHashMap */
    public class C6176b extends C6174x<K, V>.e<Map.Entry<K, V>> {
        public C6176b() {
            super(C6174x.this, (C6175a) null);
        }

        /* renamed from: c */
        public Map.Entry<K, V> mo30068b(int i) {
            return new C6181g(i);
        }
    }

    /* renamed from: c.q.b.b.x$c */
    /* compiled from: CompactHashMap */
    public class C6177c extends C6174x<K, V>.e<V> {
        public C6177c() {
            super(C6174x.this, (C6175a) null);
        }

        /* renamed from: b */
        public V mo30068b(int i) {
            return C6174x.this.f11759n[i];
        }
    }

    /* renamed from: c.q.b.b.x$d */
    /* compiled from: CompactHashMap */
    public class C6178d extends AbstractSet<Map.Entry<K, V>> {
        public C6178d() {
        }

        public void clear() {
            C6174x.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int c = C6174x.this.mo30060s(entry.getKey());
            if (c == -1 || !C5845j.m16576a(C6174x.this.f11759n[c], entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C6174x.this.mo30054m();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int c = C6174x.this.mo30060s(entry.getKey());
            if (c == -1 || !C5845j.m16576a(C6174x.this.f11759n[c], entry.getValue())) {
                return false;
            }
            Object unused = C6174x.this.mo30036C(c);
            return true;
        }

        public int size() {
            return C6174x.this.f11761p;
        }
    }

    /* renamed from: c.q.b.b.x$f */
    /* compiled from: CompactHashMap */
    public class C6180f extends AbstractSet<K> {
        public C6180f() {
        }

        public void clear() {
            C6174x.this.clear();
        }

        public boolean contains(Object obj) {
            return C6174x.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return C6174x.this.mo30065w();
        }

        public boolean remove(Object obj) {
            int c = C6174x.this.mo30060s(obj);
            if (c == -1) {
                return false;
            }
            Object unused = C6174x.this.mo30036C(c);
            return true;
        }

        public int size() {
            return C6174x.this.f11761p;
        }
    }

    /* renamed from: c.q.b.b.x$g */
    /* compiled from: CompactHashMap */
    public final class C6181g extends C5978g<K, V> {

        /* renamed from: e */
        public final K f11774e;

        /* renamed from: l */
        public int f11775l;

        public C6181g(int i) {
            this.f11774e = C6174x.this.f11758m[i];
            this.f11775l = i;
        }

        /* renamed from: a */
        public final void mo30084a() {
            int i = this.f11775l;
            if (i == -1 || i >= C6174x.this.size() || !C5845j.m16576a(this.f11774e, C6174x.this.f11758m[this.f11775l])) {
                this.f11775l = C6174x.this.mo30060s(this.f11774e);
            }
        }

        public K getKey() {
            return this.f11774e;
        }

        public V getValue() {
            mo30084a();
            int i = this.f11775l;
            if (i == -1) {
                return null;
            }
            return C6174x.this.f11759n[i];
        }

        public V setValue(V v) {
            mo30084a();
            int i = this.f11775l;
            if (i == -1) {
                C6174x.this.put(this.f11774e, v);
                return null;
            }
            V[] vArr = C6174x.this.f11759n;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
    }

    /* renamed from: c.q.b.b.x$h */
    /* compiled from: CompactHashMap */
    public class C6182h extends AbstractCollection<V> {
        public C6182h() {
        }

        public void clear() {
            C6174x.this.clear();
        }

        public Iterator<V> iterator() {
            return C6174x.this.mo30040H();
        }

        public int size() {
            return C6174x.this.f11761p;
        }
    }

    public C6174x() {
        mo30062t(3);
    }

    /* renamed from: A */
    public static int[] m17300A(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: G */
    public static long m17301G(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: g */
    public static <K, V> C6174x<K, V> m17305g() {
        return new C6174x<>();
    }

    /* renamed from: l */
    public static <K, V> C6174x<K, V> m17306l(int i) {
        return new C6174x<>(i);
    }

    /* renamed from: o */
    public static int m17307o(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: p */
    public static int m17308p(long j) {
        return (int) j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo30062t(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f11761p);
        int n = mo30055n();
        while (n >= 0) {
            objectOutputStream.writeObject(this.f11758m[n]);
            objectOutputStream.writeObject(this.f11759n[n]);
            n = mo30057q(n);
        }
    }

    /* renamed from: z */
    public static long[] m17309z(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: B */
    public final V mo30035B(Object obj, int i) {
        int r = mo30058r() & i;
        int i2 = this.f11756e[r];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (m17307o(this.f11757l[i2]) != i || !C5845j.m16576a(obj, this.f11758m[i2])) {
                int p = m17308p(this.f11757l[i2]);
                if (p == -1) {
                    return null;
                }
                int i4 = p;
                i3 = i2;
                i2 = i4;
            } else {
                V v = this.f11759n[i2];
                if (i3 == -1) {
                    this.f11756e[r] = m17308p(this.f11757l[i2]);
                } else {
                    long[] jArr = this.f11757l;
                    jArr[i3] = m17301G(jArr[i3], m17308p(jArr[i2]));
                }
                mo30066x(i2);
                this.f11761p--;
                this.f11760o++;
                return v;
            }
        }
    }

    /* renamed from: C */
    public final V mo30036C(int i) {
        return mo30035B(this.f11758m[i], m17307o(this.f11757l[i]));
    }

    /* renamed from: D */
    public void mo30037D(int i) {
        this.f11758m = Arrays.copyOf(this.f11758m, i);
        this.f11759n = Arrays.copyOf(this.f11759n, i);
        long[] jArr = this.f11757l;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f11757l = copyOf;
    }

    /* renamed from: E */
    public final void mo30038E(int i) {
        int length = this.f11757l.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo30037D(max);
            }
        }
    }

    /* renamed from: F */
    public final void mo30039F(int i) {
        int[] A = m17300A(i);
        long[] jArr = this.f11757l;
        int length = A.length - 1;
        for (int i2 = 0; i2 < this.f11761p; i2++) {
            int o = m17307o(jArr[i2]);
            int i3 = o & length;
            int i4 = A[i3];
            A[i3] = i2;
            jArr[i2] = (((long) o) << 32) | (((long) i4) & 4294967295L);
        }
        this.f11756e = A;
    }

    /* renamed from: H */
    public Iterator<V> mo30040H() {
        return new C6177c();
    }

    public void clear() {
        if (!mo30067y()) {
            this.f11760o++;
            Arrays.fill(this.f11758m, 0, this.f11761p, (Object) null);
            Arrays.fill(this.f11759n, 0, this.f11761p, (Object) null);
            Arrays.fill(this.f11756e, -1);
            Arrays.fill(this.f11757l, 0, this.f11761p, -1);
            this.f11761p = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return mo30060s(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.f11761p; i++) {
            if (C5845j.m16576a(obj, this.f11759n[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo30044d(int i) {
    }

    /* renamed from: e */
    public int mo30045e(int i, int i2) {
        return i - 1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11763r;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> h = mo30049h();
        this.f11763r = h;
        return h;
    }

    /* renamed from: f */
    public void mo30047f() {
        C5850m.m16601v(mo30067y(), "Arrays already allocated");
        int i = this.f11760o;
        this.f11756e = m17300A(C6204z0.m17450a(i, 1.0d));
        this.f11757l = m17309z(i);
        this.f11758m = new Object[i];
        this.f11759n = new Object[i];
    }

    public V get(Object obj) {
        int s = mo30060s(obj);
        mo30044d(s);
        if (s == -1) {
            return null;
        }
        return this.f11759n[s];
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo30049h() {
        return new C6178d();
    }

    /* renamed from: i */
    public Set<K> mo30050i() {
        return new C6180f();
    }

    public boolean isEmpty() {
        return this.f11761p == 0;
    }

    /* renamed from: j */
    public Collection<V> mo30052j() {
        return new C6182h();
    }

    public Set<K> keySet() {
        Set<K> set = this.f11762q;
        if (set != null) {
            return set;
        }
        Set<K> i = mo30050i();
        this.f11762q = i;
        return i;
    }

    /* renamed from: m */
    public Iterator<Map.Entry<K, V>> mo30054m() {
        return new C6176b();
    }

    /* renamed from: n */
    public int mo30055n() {
        return isEmpty() ? -1 : 0;
    }

    public V put(K k, V v) {
        if (mo30067y()) {
            mo30047f();
        }
        long[] jArr = this.f11757l;
        Object[] objArr = this.f11758m;
        V[] vArr = this.f11759n;
        int d = C6204z0.m17453d(k);
        int r = mo30058r() & d;
        int i = this.f11761p;
        int[] iArr = this.f11756e;
        int i2 = iArr[r];
        if (i2 == -1) {
            iArr[r] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m17307o(j) != d || !C5845j.m16576a(k, objArr[i2])) {
                    int p = m17308p(j);
                    if (p == -1) {
                        jArr[i2] = m17301G(j, i);
                        break;
                    }
                    i2 = p;
                } else {
                    V v2 = vArr[i2];
                    vArr[i2] = v;
                    mo30044d(i2);
                    return v2;
                }
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            mo30038E(i3);
            mo30063u(i, k, v, d);
            this.f11761p = i3;
            int length = this.f11756e.length;
            if (C6204z0.m17451b(i, length, 1.0d)) {
                mo30039F(length * 2);
            }
            this.f11760o++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: q */
    public int mo30057q(int i) {
        int i2 = i + 1;
        if (i2 < this.f11761p) {
            return i2;
        }
        return -1;
    }

    /* renamed from: r */
    public final int mo30058r() {
        return this.f11756e.length - 1;
    }

    public V remove(Object obj) {
        if (mo30067y()) {
            return null;
        }
        return mo30035B(obj, C6204z0.m17453d(obj));
    }

    /* renamed from: s */
    public final int mo30060s(Object obj) {
        if (mo30067y()) {
            return -1;
        }
        int d = C6204z0.m17453d(obj);
        int i = this.f11756e[mo30058r() & d];
        while (i != -1) {
            long j = this.f11757l[i];
            if (m17307o(j) == d && C5845j.m16576a(obj, this.f11758m[i])) {
                return i;
            }
            i = m17308p(j);
        }
        return -1;
    }

    public int size() {
        return this.f11761p;
    }

    /* renamed from: t */
    public void mo30062t(int i) {
        C5850m.m16584e(i >= 0, "Expected size must be non-negative");
        this.f11760o = Math.max(1, i);
    }

    /* renamed from: u */
    public void mo30063u(int i, K k, V v, int i2) {
        this.f11757l[i] = (((long) i2) << 32) | 4294967295L;
        this.f11758m[i] = k;
        this.f11759n[i] = v;
    }

    public Collection<V> values() {
        Collection<V> collection = this.f11764s;
        if (collection != null) {
            return collection;
        }
        Collection<V> j = mo30052j();
        this.f11764s = j;
        return j;
    }

    /* renamed from: w */
    public Iterator<K> mo30065w() {
        return new C6175a();
    }

    /* renamed from: x */
    public void mo30066x(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f11758m;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f11759n;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f11757l;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int o = m17307o(j) & mo30058r();
            int[] iArr = this.f11756e;
            int i2 = iArr[o];
            if (i2 == size) {
                iArr[o] = i;
                return;
            }
            while (true) {
                long j2 = this.f11757l[i2];
                int p = m17308p(j2);
                if (p == size) {
                    this.f11757l[i2] = m17301G(j2, i);
                    return;
                }
                i2 = p;
            }
        } else {
            this.f11758m[i] = null;
            this.f11759n[i] = null;
            this.f11757l[i] = -1;
        }
    }

    /* renamed from: y */
    public boolean mo30067y() {
        return this.f11756e == null;
    }

    public C6174x(int i) {
        mo30062t(i);
    }

    /* renamed from: c.q.b.b.x$e */
    /* compiled from: CompactHashMap */
    public abstract class C6179e<T> implements Iterator<T> {

        /* renamed from: e */
        public int f11769e;

        /* renamed from: l */
        public int f11770l;

        /* renamed from: m */
        public int f11771m;

        public C6179e() {
            C6174x xVar = C6174x.this;
            this.f11769e = xVar.f11760o;
            this.f11770l = xVar.mo30055n();
            this.f11771m = -1;
        }

        /* renamed from: a */
        public final void mo30075a() {
            if (C6174x.this.f11760o != this.f11769e) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public abstract T mo30068b(int i);

        public boolean hasNext() {
            return this.f11770l >= 0;
        }

        public T next() {
            mo30075a();
            if (hasNext()) {
                int i = this.f11770l;
                this.f11771m = i;
                T b = mo30068b(i);
                this.f11770l = C6174x.this.mo30057q(this.f11770l);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            mo30075a();
            C6166v.m17279e(this.f11771m >= 0);
            this.f11769e++;
            Object unused = C6174x.this.mo30036C(this.f11771m);
            this.f11770l = C6174x.this.mo30045e(this.f11770l, this.f11771m);
            this.f11771m = -1;
        }

        public /* synthetic */ C6179e(C6174x xVar, C6175a aVar) {
            this();
        }
    }
}
