package p040c.p200q.p363c.p370n.p371h.p375k;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;

/* renamed from: c.q.c.n.h.k.d */
/* compiled from: KeysMap */
public class C6553d {

    /* renamed from: a */
    public final Map<String, String> f12361a = new HashMap();

    /* renamed from: b */
    public final int f12362b;

    /* renamed from: c */
    public final int f12363c;

    public C6553d(int i, int i2) {
        this.f12362b = i;
        this.f12363c = i2;
    }

    /* renamed from: c */
    public static String m18425c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    @NonNull
    /* renamed from: a */
    public synchronized Map<String, String> mo30832a() {
        return Collections.unmodifiableMap(new HashMap(this.f12361a));
    }

    /* renamed from: b */
    public final String mo30833b(String str) {
        if (str != null) {
            return m18425c(str, this.f12363c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public synchronized boolean mo30834d(String str, String str2) {
        String b = mo30833b(str);
        if (this.f12361a.size() >= this.f12362b) {
            if (!this.f12361a.containsKey(b)) {
                C6479f f = C6479f.m18125f();
                f.mo30649k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f12362b);
                return false;
            }
        }
        String c = m18425c(str2, this.f12363c);
        if (C6513n.m18220A(this.f12361a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.f12361a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    /* renamed from: e */
    public synchronized void mo30835e(Map<String, String> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String b = mo30833b((String) next.getKey());
            if (this.f12361a.size() >= this.f12362b) {
                if (!this.f12361a.containsKey(b)) {
                    i++;
                }
            }
            String str = (String) next.getValue();
            this.f12361a.put(b, str == null ? "" : m18425c(str, this.f12363c));
        }
        if (i > 0) {
            C6479f f = C6479f.m18125f();
            f.mo30649k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f12362b);
        }
    }
}
