package pub.devrel.easypermissions;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p687n.p688a.p689a.C9817a;
import p687n.p688a.p689a.C9818b;

public class EasyPermissions {

    public interface PermissionCallbacks extends ActivityCompat.OnRequestPermissionsResultCallback {
        void onPermissionsDenied(int i, @NonNull List<String> list);

        void onPermissionsGranted(int i, @NonNull List<String> list);
    }

    /* renamed from: pub.devrel.easypermissions.EasyPermissions$a */
    public interface C9998a {
        /* renamed from: a */
        void mo53746a(int i);

        /* renamed from: b */
        void mo53747b(int i);
    }

    /* renamed from: a */
    public static boolean m26767a(@NonNull Context context, @Size(min = 1) @NonNull String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context != null) {
            for (String checkSelfPermission : strArr) {
                if (ContextCompat.checkSelfPermission(context, checkSelfPermission) != 0) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Can't check permissions for null context");
    }

    /* renamed from: b */
    public static boolean m26768b(@NonNull Object obj) {
        if (!obj.getClass().getSimpleName().endsWith("_")) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static void m26769c(@NonNull Object obj, int i, @NonNull String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = 0;
        }
        m26770d(i, strArr, iArr, obj);
    }

    /* renamed from: d */
    public static void m26770d(int i, @NonNull String[] strArr, @NonNull int[] iArr, @NonNull Object... objArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (PermissionCallbacks permissionCallbacks : objArr) {
            if (!arrayList.isEmpty() && (permissionCallbacks instanceof PermissionCallbacks)) {
                permissionCallbacks.onPermissionsGranted(i, arrayList);
            }
            if (!arrayList2.isEmpty() && (permissionCallbacks instanceof PermissionCallbacks)) {
                permissionCallbacks.onPermissionsDenied(i, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                m26772f(permissionCallbacks, i);
            }
        }
    }

    /* renamed from: e */
    public static void m26771e(C9818b bVar) {
        if (m26767a(bVar.mo50736a().mo50757b(), bVar.mo50738c())) {
            m26769c(bVar.mo50736a().mo50761c(), bVar.mo50742f(), bVar.mo50738c());
        } else {
            bVar.mo50736a().mo50762f(bVar.mo50740e(), bVar.mo50739d(), bVar.mo50737b(), bVar.mo50743g(), bVar.mo50742f(), bVar.mo50738c());
        }
    }

    /* renamed from: f */
    public static void m26772f(@NonNull Object obj, int i) {
        Class cls = obj.getClass();
        if (m26768b(obj)) {
            cls = cls.getSuperclass();
        }
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                C9817a aVar = (C9817a) method.getAnnotation(C9817a.class);
                if (aVar != null && aVar.value() == i) {
                    if (method.getParameterTypes().length <= 0) {
                        try {
                            if (!method.isAccessible()) {
                                method.setAccessible(true);
                            }
                            method.invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    } else {
                        throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                    }
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
