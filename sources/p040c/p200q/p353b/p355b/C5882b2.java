package p040c.p200q.p353b.p355b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: c.q.b.b.b2 */
/* compiled from: Platform */
public final class C5882b2 {
    /* renamed from: a */
    public static <T> T[] m16639a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    public static <T> T[] m16640b(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m16641c(int i) {
        return C6174x.m17306l(i);
    }

    /* renamed from: d */
    public static <E> Set<E> m16642d(int i) {
        return C6198y.m17405s(i);
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m16643e(int i) {
        return C6203z.m17436J(i);
    }

    /* renamed from: f */
    public static <E> Set<E> m16644f(int i) {
        return C5874a0.m16624R(i);
    }

    /* renamed from: g */
    public static <E> Set<E> m16645g() {
        return C6198y.m17404p();
    }

    /* renamed from: h */
    public static <K, V> Map<K, V> m16646h() {
        return C6174x.m17305g();
    }
}
