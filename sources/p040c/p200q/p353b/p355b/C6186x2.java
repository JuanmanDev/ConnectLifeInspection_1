package p040c.p200q.p353b.p355b;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.x2 */
/* compiled from: SortedLists */
public final class C6186x2 {

    /* renamed from: c.q.b.b.x2$b */
    /* compiled from: SortedLists */
    public enum C6188b {
        NEXT_LOWER {
            /* renamed from: c */
            public int mo30126c(int i) {
                return i - 1;
            }
        },
        NEXT_HIGHER {
            /* renamed from: c */
            public int mo30126c(int i) {
                return i;
            }
        },
        INVERTED_INSERTION_INDEX {
            /* renamed from: c */
            public int mo30126c(int i) {
                return ~i;
            }
        };

        /* renamed from: c */
        public abstract int mo30126c(int i);
    }

    /* renamed from: c.q.b.b.x2$c */
    /* compiled from: SortedLists */
    public enum C6192c {
        ANY_PRESENT {
            /* renamed from: c */
            public <E> int mo30127c(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        },
        LAST_PRESENT {
            /* renamed from: c */
            public <E> int mo30127c(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        },
        FIRST_PRESENT {
            /* renamed from: c */
            public <E> int mo30127c(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER {
            /* renamed from: c */
            public <E> int mo30127c(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return C6192c.LAST_PRESENT.mo30127c(comparator, e, list, i) + 1;
            }
        },
        LAST_BEFORE {
            /* renamed from: c */
            public <E> int mo30127c(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return C6192c.FIRST_PRESENT.mo30127c(comparator, e, list, i) - 1;
            }
        };

        /* renamed from: c */
        public abstract <E> int mo30127c(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
    }

    /* renamed from: a */
    public static <E, K extends Comparable> int m17385a(List<E> list, C5838g<? super E, K> gVar, K k, C6192c cVar, C6188b bVar) {
        return m17386b(list, gVar, k, C6205z1.m17455e(), cVar, bVar);
    }

    /* renamed from: b */
    public static <E, K> int m17386b(List<E> list, C5838g<? super E, K> gVar, K k, Comparator<? super K> comparator, C6192c cVar, C6188b bVar) {
        return m17387c(C6049n1.m16984l(list, gVar), k, comparator, cVar, bVar);
    }

    /* renamed from: c */
    public static <E> int m17387c(List<? extends E> list, E e, Comparator<? super E> comparator, C6192c cVar, C6188b bVar) {
        C5850m.m16594o(comparator);
        C5850m.m16594o(list);
        C5850m.m16594o(cVar);
        C5850m.m16594o(bVar);
        boolean z = list instanceof RandomAccess;
        ArrayList<? extends E> arrayList = list;
        if (!z) {
            arrayList = C6049n1.m16980h(list);
        }
        int i = 0;
        int size = arrayList.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, arrayList.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return i + cVar.mo30127c(comparator, e, arrayList.subList(i, size + 1), i2 - i);
            } else {
                i = i2 + 1;
            }
        }
        return bVar.mo30126c(i);
    }
}
