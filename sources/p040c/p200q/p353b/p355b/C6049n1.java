package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6250c;

/* renamed from: c.q.b.b.n1 */
/* compiled from: Lists */
public final class C6049n1 {

    /* renamed from: c.q.b.b.n1$a */
    /* compiled from: Lists */
    public static class C6050a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final List<F> f11632e;

        /* renamed from: l */
        public final C5838g<? super F, ? extends T> f11633l;

        /* renamed from: c.q.b.b.n1$a$a */
        /* compiled from: Lists */
        public class C6051a extends C5982g3<F, T> {
            public C6051a(ListIterator listIterator) {
                super(listIterator);
            }

            /* renamed from: a */
            public T mo29448a(F f) {
                return C6050a.this.f11633l.apply(f);
            }
        }

        public C6050a(List<F> list, C5838g<? super F, ? extends T> gVar) {
            C5850m.m16594o(list);
            this.f11632e = list;
            C5850m.m16594o(gVar);
            this.f11633l = gVar;
        }

        public void clear() {
            this.f11632e.clear();
        }

        public T get(int i) {
            return this.f11633l.apply(this.f11632e.get(i));
        }

        public boolean isEmpty() {
            return this.f11632e.isEmpty();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new C6051a(this.f11632e.listIterator(i));
        }

        public T remove(int i) {
            return this.f11633l.apply(this.f11632e.remove(i));
        }

        public int size() {
            return this.f11632e.size();
        }
    }

    /* renamed from: c.q.b.b.n1$b */
    /* compiled from: Lists */
    public static class C6052b<F, T> extends AbstractSequentialList<T> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final List<F> f11635e;

        /* renamed from: l */
        public final C5838g<? super F, ? extends T> f11636l;

        /* renamed from: c.q.b.b.n1$b$a */
        /* compiled from: Lists */
        public class C6053a extends C5982g3<F, T> {
            public C6053a(ListIterator listIterator) {
                super(listIterator);
            }

            /* renamed from: a */
            public T mo29448a(F f) {
                return C6052b.this.f11636l.apply(f);
            }
        }

        public C6052b(List<F> list, C5838g<? super F, ? extends T> gVar) {
            C5850m.m16594o(list);
            this.f11635e = list;
            C5850m.m16594o(gVar);
            this.f11636l = gVar;
        }

        public void clear() {
            this.f11635e.clear();
        }

        public ListIterator<T> listIterator(int i) {
            return new C6053a(this.f11635e.listIterator(i));
        }

        public int size() {
            return this.f11635e.size();
        }
    }

    /* renamed from: a */
    public static int m16973a(int i) {
        C6166v.m17276b(i, "arraySize");
        return C6250c.m17574h(((long) i) + 5 + ((long) (i / 10)));
    }

    /* renamed from: b */
    public static boolean m16974b(List<?> list, Object obj) {
        C5850m.m16594o(list);
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C6028l1.m16935g(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C5845j.m16576a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static int m16975c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m16976d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C5845j.m16576a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m16976d(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m16977e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m16978f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C5845j.m16576a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static int m16978f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static <E> ArrayList<E> m16979g() {
        return new ArrayList<>();
    }

    /* renamed from: h */
    public static <E> ArrayList<E> m16980h(Iterable<? extends E> iterable) {
        C5850m.m16594o(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>(C6170w.m17282a(iterable));
        }
        return m16981i(iterable.iterator());
    }

    /* renamed from: i */
    public static <E> ArrayList<E> m16981i(Iterator<? extends E> it) {
        ArrayList<E> g = m16979g();
        C6028l1.m16929a(g, it);
        return g;
    }

    /* renamed from: j */
    public static <E> ArrayList<E> m16982j(int i) {
        C6166v.m17276b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* renamed from: k */
    public static <E> ArrayList<E> m16983k(int i) {
        return new ArrayList<>(m16973a(i));
    }

    /* renamed from: l */
    public static <F, T> List<T> m16984l(List<F> list, C5838g<? super F, ? extends T> gVar) {
        return list instanceof RandomAccess ? new C6050a(list, gVar) : new C6052b(list, gVar);
    }
}
