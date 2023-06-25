package p040c.p200q.p353b.p355b;

import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.v */
/* compiled from: CollectPreconditions */
public final class C6166v {
    /* renamed from: a */
    public static void m17275a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    /* renamed from: b */
    public static int m17276b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: c */
    public static long m17277c(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j);
    }

    /* renamed from: d */
    public static void m17278d(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " must be positive but was: " + i);
        }
    }

    /* renamed from: e */
    public static void m17279e(boolean z) {
        C5850m.m16601v(z, "no calls to next() since the last call to remove()");
    }
}
