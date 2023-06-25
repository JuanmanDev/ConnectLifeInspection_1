package p040c.p200q.p353b.p355b;

import java.util.Comparator;
import java.util.SortedSet;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.w2 */
/* compiled from: SortedIterables */
public final class C6173w2 {
    /* renamed from: a */
    public static <E> Comparator<? super E> m17298a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? C6205z1.m17455e() : comparator;
    }

    /* renamed from: b */
    public static boolean m17299b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C5850m.m16594o(comparator);
        C5850m.m16594o(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m17298a((SortedSet) iterable);
        } else if (!(iterable instanceof C6169v2)) {
            return false;
        } else {
            comparator2 = ((C6169v2) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
