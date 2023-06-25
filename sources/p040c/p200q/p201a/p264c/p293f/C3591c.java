package p040c.p200q.p201a.p264c.p293f;

import dalvik.system.PathClassLoader;

/* renamed from: c.q.a.c.f.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3591c extends PathClassLoader {
    public C3591c(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
