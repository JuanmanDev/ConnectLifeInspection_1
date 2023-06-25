package p040c.p200q.p201a.p219b;

import java.util.HashSet;

/* renamed from: c.q.a.b.k */
/* compiled from: ExoPlayerLibraryInfo */
public final class C2862k {

    /* renamed from: a */
    public static final HashSet<String> f4514a = new HashSet<>();

    /* renamed from: b */
    public static String f4515b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m6234a(String str) {
        synchronized (C2862k.class) {
            if (f4514a.add(str)) {
                f4515b += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m6235b() {
        String str;
        synchronized (C2862k.class) {
            str = f4515b;
        }
        return str;
    }
}
