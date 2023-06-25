package p040c.p200q.p353b.p355b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.y */
/* compiled from: CompactHashSet */
public class C6198y<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: e */
    public transient int[] f11806e;

    /* renamed from: l */
    public transient long[] f11807l;

    /* renamed from: m */
    public transient Object[] f11808m;

    /* renamed from: n */
    public transient int f11809n;

    /* renamed from: o */
    public transient int f11810o;

    /* renamed from: c.q.b.b.y$a */
    /* compiled from: CompactHashSet */
    public class C6199a implements Iterator<E> {

        /* renamed from: e */
        public int f11811e;

        /* renamed from: l */
        public int f11812l;

        /* renamed from: m */
        public int f11813m = -1;

        public C6199a() {
            C6198y yVar = C6198y.this;
            this.f11811e = yVar.f11809n;
            this.f11812l = yVar.mo29022t();
        }

        /* renamed from: a */
        public final void mo30139a() {
            if (C6198y.this.f11809n != this.f11811e) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            return this.f11812l >= 0;
        }

        public E next() {
            mo30139a();
            if (hasNext()) {
                int i = this.f11812l;
                this.f11813m = i;
                C6198y yVar = C6198y.this;
                E e = yVar.f11808m[i];
                this.f11812l = yVar.mo29025y(i);
                return e;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            mo30139a();
            C6166v.m17279e(this.f11813m >= 0);
            this.f11811e++;
            C6198y yVar = C6198y.this;
            boolean unused = yVar.mo30129I(yVar.f11808m[this.f11813m], C6198y.m17406u(yVar.f11807l[this.f11813m]));
            this.f11812l = C6198y.this.mo29020l(this.f11812l, this.f11813m);
            this.f11813m = -1;
        }
    }

    public C6198y() {
        mo29011A(3);
    }

    /* renamed from: F */
    public static long[] m17398F(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: H */
    public static int[] m17399H(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: Q */
    public static long m17400Q(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: p */
    public static <E> C6198y<E> m17404p() {
        return new C6198y<>();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo29011A(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + readInt);
    }

    /* renamed from: s */
    public static <E> C6198y<E> m17405s(int i) {
        return new C6198y<>(i);
    }

    /* renamed from: u */
    public static int m17406u(long j) {
        return (int) (j >>> 32);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f11810o);
        int t = mo29022t();
        while (t >= 0) {
            objectOutputStream.writeObject(this.f11808m[t]);
            t = mo29025y(t);
        }
    }

    /* renamed from: x */
    public static int m17407x(long j) {
        return (int) j;
    }

    /* renamed from: A */
    public void mo29011A(int i) {
        C5850m.m16584e(i >= 0, "Initial capacity must be non-negative");
        this.f11809n = Math.max(1, i);
    }

    /* renamed from: B */
    public void mo29012B(int i, E e, int i2) {
        this.f11807l[i] = (((long) i2) << 32) | 4294967295L;
        this.f11808m[i] = e;
    }

    /* renamed from: D */
    public void mo29013D(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f11808m;
            objArr[i] = objArr[size];
            objArr[size] = null;
            long[] jArr = this.f11807l;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int u = m17406u(j) & mo30138z();
            int[] iArr = this.f11806e;
            int i2 = iArr[u];
            if (i2 == size) {
                iArr[u] = i;
                return;
            }
            while (true) {
                long j2 = this.f11807l[i2];
                int x = m17407x(j2);
                if (x == size) {
                    this.f11807l[i2] = m17400Q(j2, i);
                    return;
                }
                i2 = x;
            }
        } else {
            this.f11808m[i] = null;
            this.f11807l[i] = -1;
        }
    }

    /* renamed from: E */
    public boolean mo30128E() {
        return this.f11806e == null;
    }

    /* renamed from: I */
    public final boolean mo30129I(Object obj, int i) {
        int z = mo30138z() & i;
        int i2 = this.f11806e[z];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (m17406u(this.f11807l[i2]) != i || !C5845j.m16576a(obj, this.f11808m[i2])) {
                int x = m17407x(this.f11807l[i2]);
                if (x == -1) {
                    return false;
                }
                int i4 = x;
                i3 = i2;
                i2 = i4;
            } else {
                if (i3 == -1) {
                    this.f11806e[z] = m17407x(this.f11807l[i2]);
                } else {
                    long[] jArr = this.f11807l;
                    jArr[i3] = m17400Q(jArr[i3], m17407x(jArr[i2]));
                }
                mo29013D(i2);
                this.f11810o--;
                this.f11809n++;
                return true;
            }
        }
    }

    /* renamed from: L */
    public void mo29014L(int i) {
        this.f11808m = Arrays.copyOf(this.f11808m, i);
        long[] jArr = this.f11807l;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f11807l = copyOf;
    }

    /* renamed from: O */
    public final void mo30130O(int i) {
        int length = this.f11807l.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo29014L(max);
            }
        }
    }

    /* renamed from: P */
    public final void mo30131P(int i) {
        int[] H = m17399H(i);
        long[] jArr = this.f11807l;
        int length = H.length - 1;
        for (int i2 = 0; i2 < this.f11810o; i2++) {
            int u = m17406u(jArr[i2]);
            int i3 = u & length;
            int i4 = H[i3];
            H[i3] = i2;
            jArr[i2] = (((long) u) << 32) | (((long) i4) & 4294967295L);
        }
        this.f11806e = H;
    }

    public boolean add(E e) {
        if (mo30128E()) {
            mo29021o();
        }
        long[] jArr = this.f11807l;
        Object[] objArr = this.f11808m;
        int d = C6204z0.m17453d(e);
        int z = mo30138z() & d;
        int i = this.f11810o;
        int[] iArr = this.f11806e;
        int i2 = iArr[z];
        if (i2 == -1) {
            iArr[z] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m17406u(j) == d && C5845j.m16576a(e, objArr[i2])) {
                    return false;
                }
                int x = m17407x(j);
                if (x == -1) {
                    jArr[i2] = m17400Q(j, i);
                    break;
                }
                i2 = x;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            mo30130O(i3);
            mo29012B(i, e, d);
            this.f11810o = i3;
            int length = this.f11806e.length;
            if (C6204z0.m17451b(i, length, 1.0d)) {
                mo30131P(length * 2);
            }
            this.f11809n++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public void clear() {
        if (!mo30128E()) {
            this.f11809n++;
            Arrays.fill(this.f11808m, 0, this.f11810o, (Object) null);
            Arrays.fill(this.f11806e, -1);
            Arrays.fill(this.f11807l, 0, this.f11810o, -1);
            this.f11810o = 0;
        }
    }

    public boolean contains(Object obj) {
        if (mo30128E()) {
            return false;
        }
        int d = C6204z0.m17453d(obj);
        int i = this.f11806e[mo30138z() & d];
        while (i != -1) {
            long j = this.f11807l[i];
            if (m17406u(j) == d && C5845j.m16576a(obj, this.f11808m[i])) {
                return true;
            }
            i = m17407x(j);
        }
        return false;
    }

    public boolean isEmpty() {
        return this.f11810o == 0;
    }

    public Iterator<E> iterator() {
        return new C6199a();
    }

    /* renamed from: l */
    public int mo29020l(int i, int i2) {
        return i - 1;
    }

    /* renamed from: o */
    public void mo29021o() {
        C5850m.m16601v(mo30128E(), "Arrays already allocated");
        int i = this.f11809n;
        this.f11806e = m17399H(C6204z0.m17450a(i, 1.0d));
        this.f11807l = m17398F(i);
        this.f11808m = new Object[i];
    }

    public boolean remove(Object obj) {
        if (mo30128E()) {
            return false;
        }
        return mo30129I(obj, C6204z0.m17453d(obj));
    }

    public int size() {
        return this.f11810o;
    }

    /* renamed from: t */
    public int mo29022t() {
        return isEmpty() ? -1 : 0;
    }

    public Object[] toArray() {
        if (mo30128E()) {
            return new Object[0];
        }
        return Arrays.copyOf(this.f11808m, this.f11810o);
    }

    /* renamed from: y */
    public int mo29025y(int i) {
        int i2 = i + 1;
        if (i2 < this.f11810o) {
            return i2;
        }
        return -1;
    }

    /* renamed from: z */
    public final int mo30138z() {
        return this.f11806e.length - 1;
    }

    public C6198y(int i) {
        mo29011A(i);
    }

    public <T> T[] toArray(T[] tArr) {
        if (!mo30128E()) {
            return C6172w1.m17297h(this.f11808m, 0, this.f11810o, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }
}
