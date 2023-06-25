package p040c.p072c.p073a.p074a;

import androidx.annotation.NonNull;

/* renamed from: c.c.a.a.s */
/* compiled from: SPStaticUtils */
public final class C1523s {

    /* renamed from: a */
    public static C1524t f744a;

    /* renamed from: a */
    public static C1524t m1031a() {
        C1524t tVar = f744a;
        return tVar != null ? tVar : C1524t.m1041e();
    }

    /* renamed from: b */
    public static long m1032b(@NonNull String str, long j) {
        if (str != null) {
            return m1033c(str, j, m1031a());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: c */
    public static long m1033c(@NonNull String str, long j, @NonNull C1524t tVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (tVar != null) {
            return tVar.mo15418h(str, j);
        } else {
            throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* renamed from: d */
    public static String m1034d(@NonNull String str) {
        if (str != null) {
            return m1035e(str, m1031a());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: e */
    public static String m1035e(@NonNull String str, @NonNull C1524t tVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (tVar != null) {
            return tVar.mo15419i(str);
        } else {
            throw new NullPointerException("Argument 'spUtils' of type SPUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* renamed from: f */
    public static void m1036f(@NonNull String str, long j) {
        if (str != null) {
            m1037g(str, j, m1031a());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: g */
    public static void m1037g(@NonNull String str, long j, @NonNull C1524t tVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (tVar != null) {
            tVar.mo15421l(str, j);
        } else {
            throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* renamed from: h */
    public static void m1038h(@NonNull String str, String str2) {
        if (str != null) {
            m1039i(str, str2, m1031a());
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: i */
    public static void m1039i(@NonNull String str, String str2, @NonNull C1524t tVar) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (tVar != null) {
            tVar.mo15423n(str, str2);
        } else {
            throw new NullPointerException("Argument 'spUtils' of type SPUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* renamed from: j */
    public static void m1040j(C1524t tVar) {
        f744a = tVar;
    }
}
