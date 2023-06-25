package p040c.p077d.p078a.p099m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: c.d.a.m.e */
/* compiled from: ManifestParser */
public final class C1896e {

    /* renamed from: a */
    public final Context f1506a;

    public C1896e(Context context) {
        this.f1506a = context;
    }

    /* renamed from: b */
    public static C1894c m2294b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof C1894c) {
                    return (C1894c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                m2295c(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                m2295c(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m2295c(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m2295c(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: c */
    public static void m2295c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List<C1894c> mo16239a() {
        boolean isLoggable = Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f1506a.getPackageManager().getApplicationInfo(this.f1506a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                boolean isLoggable2 = Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                "Got app info metadata: " + applicationInfo.metaData;
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m2294b(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        "Loaded Glide module: " + str;
                    }
                }
            }
            boolean isLoggable3 = Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
