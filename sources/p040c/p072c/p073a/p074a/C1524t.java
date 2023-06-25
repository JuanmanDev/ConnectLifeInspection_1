package p040c.p072c.p073a.p074a;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"ApplySharedPref"})
/* renamed from: c.c.a.a.t */
/* compiled from: SPUtils */
public final class C1524t {

    /* renamed from: b */
    public static final Map<String, C1524t> f745b = new HashMap();

    /* renamed from: a */
    public SharedPreferences f746a;

    public C1524t(String str, int i) {
        this.f746a = C1535z.m1079a().getSharedPreferences(str, i);
    }

    /* renamed from: e */
    public static C1524t m1041e() {
        return m1043g("", 0);
    }

    /* renamed from: f */
    public static C1524t m1042f(String str) {
        return m1043g(str, 0);
    }

    /* renamed from: g */
    public static C1524t m1043g(String str, int i) {
        if (m1044k(str)) {
            str = "spUtils";
        }
        C1524t tVar = f745b.get(str);
        if (tVar == null) {
            synchronized (C1524t.class) {
                tVar = f745b.get(str);
                if (tVar == null) {
                    tVar = new C1524t(str, i);
                    f745b.put(str, tVar);
                }
            }
        }
        return tVar;
    }

    /* renamed from: k */
    public static boolean m1044k(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo15414a() {
        mo15415b(false);
    }

    /* renamed from: b */
    public void mo15415b(boolean z) {
        if (z) {
            this.f746a.edit().clear().commit();
        } else {
            this.f746a.edit().clear().apply();
        }
    }

    /* renamed from: c */
    public boolean mo15416c(@NonNull String str) {
        if (str != null) {
            return mo15417d(str, false);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: d */
    public boolean mo15417d(@NonNull String str, boolean z) {
        if (str != null) {
            return this.f746a.getBoolean(str, z);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: h */
    public long mo15418h(@NonNull String str, long j) {
        if (str != null) {
            return this.f746a.getLong(str, j);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: i */
    public String mo15419i(@NonNull String str) {
        if (str != null) {
            return mo15420j(str, "");
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: j */
    public String mo15420j(@NonNull String str, String str2) {
        if (str != null) {
            return this.f746a.getString(str, str2);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: l */
    public void mo15421l(@NonNull String str, long j) {
        if (str != null) {
            mo15422m(str, j, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: m */
    public void mo15422m(@NonNull String str, long j, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (z) {
            this.f746a.edit().putLong(str, j).commit();
        } else {
            this.f746a.edit().putLong(str, j).apply();
        }
    }

    /* renamed from: n */
    public void mo15423n(@NonNull String str, String str2) {
        if (str != null) {
            mo15424o(str, str2, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: o */
    public void mo15424o(@NonNull String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (z) {
            this.f746a.edit().putString(str, str2).commit();
        } else {
            this.f746a.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: p */
    public void mo15425p(@NonNull String str, boolean z) {
        if (str != null) {
            mo15426q(str, z, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: q */
    public void mo15426q(@NonNull String str, boolean z, boolean z2) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (z2) {
            this.f746a.edit().putBoolean(str, z).commit();
        } else {
            this.f746a.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: r */
    public void mo15427r(@NonNull String str) {
        if (str != null) {
            mo15428s(str, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: s */
    public void mo15428s(@NonNull String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (z) {
            this.f746a.edit().remove(str).commit();
        } else {
            this.f746a.edit().remove(str).apply();
        }
    }
}
