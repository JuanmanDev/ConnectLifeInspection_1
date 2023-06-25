package p040c.p200q.p353b.p355b;

import java.util.Collection;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.w1 */
/* compiled from: ObjectArrays */
public final class C6172w1 {
    /* renamed from: a */
    public static Object m17290a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m17291b(Object... objArr) {
        m17292c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    public static Object[] m17292c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m17290a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static Object[] m17293d(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
        return objArr;
    }

    /* renamed from: e */
    public static <T> T[] m17294e(T[] tArr, int i) {
        return C5882b2.m16640b(tArr, i);
    }

    /* renamed from: f */
    public static Object[] m17295f(Collection<?> collection) {
        Object[] objArr = new Object[collection.size()];
        m17293d(collection, objArr);
        return objArr;
    }

    /* renamed from: g */
    public static <T> T[] m17296g(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = m17294e(tArr, size);
        }
        m17293d(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* renamed from: h */
    public static <T> T[] m17297h(Object[] objArr, int i, int i2, T[] tArr) {
        C5850m.m16599t(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = m17294e(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }
}
