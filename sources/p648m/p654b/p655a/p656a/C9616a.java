package p648m.p654b.p655a.p656a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

@SuppressLint({"BanTargetApiAnnotation"})
/* renamed from: m.b.a.a.a */
/* compiled from: BoundaryInterfaceReflectionUtil */
public class C9616a {

    @TargetApi(19)
    /* renamed from: m.b.a.a.a$a */
    /* compiled from: BoundaryInterfaceReflectionUtil */
    public static class C9617a implements InvocationHandler {

        /* renamed from: a */
        public final Object f18856a;

        public C9617a(@NonNull Object obj) {
            this.f18856a = obj;
        }

        @NonNull
        /* renamed from: a */
        public Object mo50296a() {
            return this.f18856a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return C9616a.m25812d(method, this.f18856a.getClass().getClassLoader()).invoke(this.f18856a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static <T> T m25809a(@NonNull Class<T> cls, @Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C9616a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m25810b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m25814f()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @TargetApi(19)
    @Nullable
    /* renamed from: c */
    public static InvocationHandler m25811c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return new C9617a(obj);
    }

    /* renamed from: d */
    public static Method m25812d(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @Nullable
    /* renamed from: e */
    public static Object m25813e(@Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C9617a) invocationHandler).mo50296a();
    }

    /* renamed from: f */
    public static boolean m25814f() {
        return "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
    }
}
