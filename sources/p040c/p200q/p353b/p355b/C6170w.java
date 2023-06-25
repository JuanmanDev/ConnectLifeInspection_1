package p040c.p200q.p353b.p355b;

import androidx.test.internal.runner.RunnerArgs;
import java.util.Collection;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.w */
/* compiled from: Collections2 */
public final class C6170w {
    /* renamed from: a */
    public static <T> Collection<T> m17282a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    /* renamed from: b */
    public static boolean m17283b(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static StringBuilder m17284c(int i) {
        C6166v.m17276b(i, RunnerArgs.ARGUMENT_TEST_SIZE);
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: d */
    public static boolean m17285d(Collection<?> collection, Object obj) {
        C5850m.m16594o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m17286e(Collection<?> collection, Object obj) {
        C5850m.m16594o(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static String m17287f(Collection<?> collection) {
        StringBuilder c = m17284c(collection.size());
        c.append('[');
        boolean z = true;
        for (Object next : collection) {
            if (!z) {
                c.append(", ");
            }
            z = false;
            if (next == collection) {
                c.append("(this Collection)");
            } else {
                c.append(next);
            }
        }
        c.append(']');
        return c.toString();
    }
}
