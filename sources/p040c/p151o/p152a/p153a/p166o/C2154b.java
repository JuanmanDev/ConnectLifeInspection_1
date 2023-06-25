package p040c.p151o.p152a.p153a.p166o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c.o.a.a.o.b */
/* compiled from: PersistenceService */
public class C2154b implements C2153a {

    /* renamed from: a */
    public SharedPreferences f2120a;

    /* renamed from: b */
    public final Context f2121b;

    /* renamed from: a */
    public void mo16962a(String str) {
        mo16970i("sessionProtectionType", str);
    }

    /* renamed from: b */
    public void mo16963b() {
        mo16975n("GS_PROVIDER_SET");
    }

    /* renamed from: c */
    public void mo16964c(String str) {
        mo16970i("GS_PREFS", str);
    }

    /* renamed from: d */
    public void mo16965d(String str) {
        Set m = mo16974m();
        if (m == null) {
            m = new HashSet();
        }
        m.add(str);
        mo16973l().edit().putStringSet("GS_PROVIDER_SET", m).apply();
    }

    /* renamed from: e */
    public void mo16966e(long j) {
        mo16970i("GS_SESSION_EXPIRE_TIMESTAMP", Long.valueOf(j));
    }

    /* renamed from: f */
    public long mo16967f() {
        return mo16972k("GS_SESSION_EXPIRE_TIMESTAMP", 0L).longValue();
    }

    /* renamed from: g */
    public void mo16968g() {
        mo16975n("GS_PREFS");
    }

    /* renamed from: h */
    public String mo16969h(String str, String str2) {
        return mo16973l().getString(str, str2);
    }

    /* renamed from: i */
    public void mo16970i(String str, Object obj) {
        SharedPreferences.Editor edit = mo16973l().edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    /* renamed from: j */
    public String mo16971j() {
        return mo16969h("sessionProtectionType", "DEFAULT");
    }

    /* renamed from: k */
    public Long mo16972k(String str, Long l) {
        return Long.valueOf(mo16973l().getLong(str, l.longValue()));
    }

    /* renamed from: l */
    public SharedPreferences mo16973l() {
        if (this.f2120a == null) {
            this.f2120a = this.f2121b.getSharedPreferences("GSLIB", 0);
        }
        return this.f2120a;
    }

    /* renamed from: m */
    public Set<String> mo16974m() {
        return mo16973l().getStringSet("GS_PROVIDER_SET", new HashSet());
    }

    /* renamed from: n */
    public final void mo16975n(String... strArr) {
        SharedPreferences.Editor edit = mo16973l().edit();
        for (String remove : strArr) {
            edit.remove(remove);
        }
        edit.apply();
    }
}
