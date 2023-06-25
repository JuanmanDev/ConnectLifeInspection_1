package p040c.p107e.p108a.p109e.p110d;

/* renamed from: c.e.a.e.d.i */
/* compiled from: LangUtils */
public final class C1981i {
    /* renamed from: a */
    public static boolean m2649a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static boolean m2650b(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!m2649a(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static int m2651c(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: d */
    public static int m2652d(int i, Object obj) {
        return m2651c(i, obj != null ? obj.hashCode() : 0);
    }
}
