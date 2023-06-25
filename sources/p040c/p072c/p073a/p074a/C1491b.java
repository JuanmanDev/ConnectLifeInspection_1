package p040c.p072c.p073a.p074a;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.c.a.a.b */
/* compiled from: AdaptScreenUtils */
public final class C1491b {

    /* renamed from: a */
    public static List<Field> f680a;

    /* renamed from: c.c.a.a.b$a */
    /* compiled from: AdaptScreenUtils */
    public static class C1492a implements Runnable {
        public void run() {
            C1491b.m870g();
        }
    }

    /* renamed from: b */
    public static void m865b(Resources resources, float f) {
        resources.getDisplayMetrics().xdpi = f;
        C1535z.m1079a().getResources().getDisplayMetrics().xdpi = f;
        m867d(resources, f);
    }

    /* renamed from: c */
    public static void m866c(Resources resources, float f) {
        for (Field field : f680a) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) field.get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m867d(Resources resources, float f) {
        if (f680a == null) {
            f680a = new ArrayList();
            Class cls = resources.getClass();
            Field[] declaredFields = cls.getDeclaredFields();
            while (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                        field.setAccessible(true);
                        DisplayMetrics e = m868e(resources, field);
                        if (e != null) {
                            f680a.add(field);
                            e.xdpi = f;
                        }
                    }
                }
                cls = cls.getSuperclass();
                if (cls != null) {
                    declaredFields = cls.getDeclaredFields();
                } else {
                    return;
                }
            }
            return;
        }
        m866c(resources, f);
    }

    /* renamed from: e */
    public static DisplayMetrics m868e(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Runnable m869f() {
        return new C1492a();
    }

    /* renamed from: g */
    public static void m870g() {
        m865b(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }
}
