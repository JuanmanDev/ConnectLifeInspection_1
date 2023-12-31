package androidx.test.espresso.remote;

import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.cache.Cache;
import androidx.test.espresso.core.internal.deps.guava.cache.CacheBuilder;
import androidx.test.internal.util.LogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;

public final class MethodInvocation {
    public static final String TAG = "MethodInvocation";
    public static final Cache<MethodKey, Method> methodCache = CacheBuilder.newBuilder().maximumSize(256).build();
    public final Class<?> clazz;
    public final Object instance;
    public final String methodName;
    public final Class<?>[] parameterTypes;

    public static final class MethodKey {
        public final String methodName;
        public final Class<?>[] parameterTypes;
        public final Class<?> type;

        public MethodKey(Class<?> cls, String str, Class<?>[] clsArr) {
            this.type = cls;
            this.methodName = str;
            this.parameterTypes = clsArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MethodKey.class != obj.getClass()) {
                return false;
            }
            MethodKey methodKey = (MethodKey) obj;
            if (this.type.equals(methodKey.type) && this.methodName.equals(methodKey.methodName)) {
                return Arrays.equals(this.parameterTypes, methodKey.parameterTypes);
            }
            return false;
        }

        public int hashCode() {
            return (((this.type.hashCode() * 31) + this.methodName.hashCode()) * 31) + Arrays.hashCode(this.parameterTypes);
        }
    }

    public MethodInvocation(Class<?> cls, Object obj, String str, Class<?>... clsArr) {
        this.clazz = (Class) Preconditions.checkNotNull(cls, "clazz cannot be null!");
        this.instance = obj;
        Preconditions.checkArgument(str != null && !str.isEmpty(), "methodName cannot be null or empty");
        this.methodName = str;
        this.parameterTypes = clsArr;
    }

    public static Method getDeclaredMethod(MethodKey methodKey) {
        return getMethodInternal(methodKey, true);
    }

    public static Method getMethod(MethodKey methodKey) {
        return getMethodInternal(methodKey, false);
    }

    public static Method getMethodInternal(MethodKey methodKey, boolean z) {
        Method method;
        Method ifPresent = methodCache.getIfPresent(methodKey);
        if (ifPresent == null) {
            LogUtil.logDebug(TAG, "Cache miss for method: %s#%s(%s). Loading into cache.", methodKey.type.getSimpleName(), methodKey.methodName, Arrays.toString(methodKey.parameterTypes));
            if (z) {
                method = methodKey.type.getDeclaredMethod(methodKey.methodName, methodKey.parameterTypes);
            } else {
                method = methodKey.type.getMethod(methodKey.methodName, methodKey.parameterTypes);
            }
            Method method2 = method;
            methodCache.put(methodKey, method2);
            return method2;
        }
        LogUtil.logDebug(TAG, "Cache hit for method: %s#%s(%s).", methodKey.type.getSimpleName(), methodKey.methodName, Arrays.toString(methodKey.parameterTypes));
        return ifPresent;
    }

    public static void invalidateCache() {
        methodCache.invalidateAll();
    }

    private Object invokeMethodExplosively(Method method, Object... objArr) {
        try {
            method.setAccessible(true);
            Object invoke = method.invoke(this.instance, objArr);
            LogUtil.logDebug(TAG, "%s.invokeMethodExplosively(%s,%s)", this.clazz.getSimpleName(), this.methodName, Arrays.toString(objArr));
            return invoke;
        } catch (InvocationTargetException e) {
            throw new RemoteProtocolException(String.format(Locale.ROOT, "Cannot invoke method %s with args [%s] on builder %s", new Object[]{method, Arrays.toString(objArr), this.clazz.getName()}), e);
        } catch (IllegalAccessException e2) {
            throw new RemoteProtocolException(String.format(Locale.ROOT, "Cannot create instance of %s", new Object[]{this.clazz.getName()}), e2);
        } catch (SecurityException e3) {
            throw new RemoteProtocolException(String.format(Locale.ROOT, "Method not accessible: %s", new Object[]{method.getName()}), e3);
        } catch (Throwable th) {
            LogUtil.logDebug(TAG, "%s.invokeMethodExplosively(%s,%s)", this.clazz.getSimpleName(), this.methodName, Arrays.toString(objArr));
            throw th;
        }
    }

    public Object invokeDeclaredMethod(Object... objArr) {
        try {
            return invokeMethodExplosively(getDeclaredMethod(new MethodKey(this.clazz, this.methodName, this.parameterTypes)), objArr);
        } catch (NoSuchMethodException e) {
            throw new RemoteProtocolException(String.format(Locale.ROOT, "No method: %s(%s) found for clazz: %s Available methods: %s", new Object[]{this.methodName, Arrays.asList(this.parameterTypes), this.clazz.getName(), Arrays.asList(this.clazz.getDeclaredMethods())}), e);
        }
    }

    public Object invokeMethod(Object... objArr) {
        try {
            return invokeMethodExplosively(getMethod(new MethodKey(this.clazz, this.methodName, this.parameterTypes)), objArr);
        } catch (NoSuchMethodException e) {
            throw new RemoteProtocolException(String.format(Locale.ROOT, "No method: %s found for clazz: %s. Available methods: %s", new Object[]{this.methodName, this.clazz.getName(), Arrays.asList(this.clazz.getMethods())}), e);
        }
    }
}
