package androidx.test.espresso.base;

import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import androidx.test.espresso.Root;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.collect.Lists;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class RootsOracle implements ActiveRootLister {
    public static final String GET_DEFAULT_IMPL = "getDefault";
    public static final String GET_GLOBAL_INSTANCE = "getInstance";
    public static final String TAG = "RootsOracle";
    public static final String VIEWS_FIELD = "mViews";
    public static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
    public static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
    public static final String WINDOW_PARAMS_FIELD = "mParams";
    public boolean initialized;
    public final Looper mainLooper;
    public Field paramsField;
    public Field viewsField;
    public Object windowManagerObj;

    public RootsOracle(Looper looper) {
        this.mainLooper = looper;
    }

    private void initialize() {
        this.initialized = true;
        String str = Build.VERSION.SDK_INT > 16 ? WINDOW_MANAGER_GLOBAL_CLAZZ : WINDOW_MANAGER_IMPL_CLAZZ;
        String str2 = Build.VERSION.SDK_INT > 16 ? GET_GLOBAL_INSTANCE : GET_DEFAULT_IMPL;
        try {
            Class<?> cls = Class.forName(str);
            this.windowManagerObj = cls.getMethod(str2, new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField(VIEWS_FIELD);
            this.viewsField = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField(WINDOW_PARAMS_FIELD);
            this.paramsField = declaredField2;
            declaredField2.setAccessible(true);
        } catch (InvocationTargetException e) {
            String.format(Locale.ROOT, "could not invoke: %s on %s", new Object[]{str2, str});
            e.getCause();
        } catch (ClassNotFoundException unused) {
            String.format(Locale.ROOT, "could not find class: %s", new Object[]{str});
        } catch (NoSuchFieldException unused2) {
            String.format(Locale.ROOT, "could not find field: %s or %s on %s", new Object[]{WINDOW_PARAMS_FIELD, VIEWS_FIELD, str});
        } catch (NoSuchMethodException unused3) {
            String.format(Locale.ROOT, "could not find method: %s on %s", new Object[]{str2, str});
        } catch (RuntimeException unused4) {
            String.format(Locale.ROOT, "reflective setup failed using obj: %s method: %s field: %s", new Object[]{str, str2, VIEWS_FIELD});
        } catch (IllegalAccessException unused5) {
            String.format(Locale.ROOT, "reflective setup failed using obj: %s method: %s field: %s", new Object[]{str, str2, VIEWS_FIELD});
        }
    }

    public List<Root> listActiveRoots() {
        List list;
        List list2;
        Preconditions.checkState(this.mainLooper.equals(Looper.myLooper()), "must be called on main thread.");
        if (!this.initialized) {
            initialize();
        }
        Object obj = this.windowManagerObj;
        if (obj == null) {
            return Lists.newArrayList();
        }
        Field field = this.viewsField;
        if (field == null) {
            return Lists.newArrayList();
        }
        if (this.paramsField == null) {
            return Lists.newArrayList();
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                list = Arrays.asList((View[]) field.get(obj));
                list2 = Arrays.asList((WindowManager.LayoutParams[]) this.paramsField.get(this.windowManagerObj));
            } else {
                list = (List) field.get(obj);
                list2 = (List) this.paramsField.get(this.windowManagerObj);
            }
            ArrayList newArrayList = Lists.newArrayList();
            for (int size = list.size() - 1; size > -1; size--) {
                newArrayList.add(new Root.Builder().withDecorView((View) list.get(size)).withWindowLayoutParams((WindowManager.LayoutParams) list2.get(size)).build());
            }
            return newArrayList;
        } catch (RuntimeException unused) {
            String.format(Locale.ROOT, "Reflective access to %s or %s on %s failed.", new Object[]{this.viewsField, this.paramsField, this.windowManagerObj});
            return Lists.newArrayList();
        } catch (IllegalAccessException unused2) {
            String.format(Locale.ROOT, "Reflective access to %s or %s on %s failed.", new Object[]{this.viewsField, this.paramsField, this.windowManagerObj});
            return Lists.newArrayList();
        }
    }
}
