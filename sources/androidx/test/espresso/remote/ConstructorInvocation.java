package androidx.test.espresso.remote;

import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.cache.Cache;
import androidx.test.espresso.core.internal.deps.guava.cache.CacheBuilder;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public final class ConstructorInvocation {
    public static final String TAG = "ConstructorInvocation";
    public static final Cache<ConstructorKey, Constructor<?>> constructorCache = CacheBuilder.newBuilder().maximumSize(256).build();
    public final Class<? extends Annotation> annotationClass;
    public final Class<?> clazz;
    public final Class<?>[] parameterTypes;

    public static final class ConstructorKey {
        public final Class<?>[] parameterTypes;
        public final Class<?> type;

        public ConstructorKey(Class<?> cls, Class<?>[] clsArr) {
            this.type = cls;
            this.parameterTypes = clsArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ConstructorKey.class != obj.getClass()) {
                return false;
            }
            ConstructorKey constructorKey = (ConstructorKey) obj;
            if (!this.type.equals(constructorKey.type)) {
                return false;
            }
            return Arrays.equals(this.parameterTypes, constructorKey.parameterTypes);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + Arrays.hashCode(this.parameterTypes);
        }
    }

    public ConstructorInvocation(Class<?> cls, Class<? extends Annotation> cls2, Class<?>... clsArr) {
        this.clazz = (Class) Preconditions.checkNotNull(cls, "clazz cannot be null!");
        this.annotationClass = cls2;
        this.parameterTypes = clsArr;
    }

    public static void invalidateCache() {
        constructorCache.invalidateAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e7, code lost:
        throw new androidx.test.espresso.remote.RemoteProtocolException(java.lang.String.format(java.util.Locale.ROOT, "No constructor found for clazz: %s. Available constructors: %s", new java.lang.Object[]{r13.clazz.getName(), java.util.Arrays.asList(r13.clazz.getConstructors())}), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        throw new androidx.test.espresso.remote.RemoteProtocolException(java.lang.String.format(java.util.Locale.ROOT, "Cannot create instance of %s", new java.lang.Object[]{r13.clazz.getName()}), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ff, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0115, code lost:
        throw new androidx.test.espresso.remote.RemoteProtocolException(java.lang.String.format(java.util.Locale.ROOT, "Cannot create instance of %s", new java.lang.Object[]{r13.clazz.getName()}), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3, all -> 0x00a9 }, ExcHandler: NoSuchMethodException (r0v5 'e' java.lang.NoSuchMethodException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8 A[Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3, all -> 0x00a9 }, ExcHandler: InstantiationException (r3v3 'e' java.lang.InstantiationException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff A[Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3, all -> 0x00a9 }, ExcHandler: IllegalAccessException (r3v2 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object invokeConstructorExplosively(java.lang.Object... r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Cannot create instance of %s"
            java.lang.String r1 = "%s(%s)"
            java.lang.String r2 = "ConstructorInvocation"
            androidx.test.espresso.remote.ConstructorInvocation$ConstructorKey r3 = new androidx.test.espresso.remote.ConstructorInvocation$ConstructorKey
            java.lang.Class<?> r4 = r13.clazz
            java.lang.Class<?>[] r5 = r13.parameterTypes
            r3.<init>(r4, r5)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            androidx.test.espresso.core.internal.deps.guava.cache.Cache<androidx.test.espresso.remote.ConstructorInvocation$ConstructorKey, java.lang.reflect.Constructor<?>> r8 = constructorCache     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.lang.Object r8 = r8.getIfPresent(r3)     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            if (r8 != 0) goto L_0x0072
            java.lang.String r7 = "Cache miss for constructor: %s(%s). Loading into cache."
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.Class<?> r10 = r13.clazz     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.String r10 = r10.getSimpleName()     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            r9[r5] = r10     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.String r10 = java.util.Arrays.toString(r14)     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            r9[r6] = r10     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            androidx.test.internal.util.LogUtil.logDebug((java.lang.String) r2, (java.lang.String) r7, (java.lang.Object[]) r9)     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.Class<? extends java.lang.annotation.Annotation> r7 = r13.annotationClass     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            if (r7 == 0) goto L_0x004f
            java.lang.Class<?> r7 = r13.clazz     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.reflect.Constructor[] r7 = r7.getDeclaredConstructors()     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            int r9 = r7.length     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            r10 = r5
        L_0x003e:
            if (r10 >= r9) goto L_0x004f
            r11 = r7[r10]     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.Class<? extends java.lang.annotation.Annotation> r12 = r13.annotationClass     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            boolean r12 = r11.isAnnotationPresent(r12)     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            if (r12 == 0) goto L_0x004c
            r7 = r11
            goto L_0x0050
        L_0x004c:
            int r10 = r10 + 1
            goto L_0x003e
        L_0x004f:
            r7 = r8
        L_0x0050:
            if (r7 != 0) goto L_0x005a
            java.lang.Class<?> r8 = r13.clazz     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.lang.Class<?>[] r9 = r13.parameterTypes     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.lang.reflect.Constructor r7 = r8.getConstructor(r9)     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
        L_0x005a:
            if (r7 == 0) goto L_0x005e
            r8 = r6
            goto L_0x005f
        L_0x005e:
            r8 = r5
        L_0x005f:
            java.lang.String r9 = "No constructor found for annotation: %s, or parameter types: %s"
            java.lang.Class<? extends java.lang.annotation.Annotation> r10 = r13.annotationClass     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.lang.Class<?>[] r11 = r13.parameterTypes     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkState(r8, r9, r10, r11)     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            androidx.test.espresso.core.internal.deps.guava.cache.Cache<androidx.test.espresso.remote.ConstructorInvocation$ConstructorKey, java.lang.reflect.Constructor<?>> r8 = constructorCache     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            r8.put(r3, r7)     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            goto L_0x0088
        L_0x0072:
            java.lang.String r3 = "Cache hit for constructor: %s(%s)."
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.Class<?> r9 = r13.clazz     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            r7[r5] = r9     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            java.lang.String r9 = java.util.Arrays.toString(r14)     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            r7[r6] = r9     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            androidx.test.internal.util.LogUtil.logDebug((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r7)     // Catch:{ InvocationTargetException -> 0x00a6, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00a3 }
            r7 = r8
        L_0x0088:
            r7.setAccessible(r6)     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.lang.Object r0 = r7.newInstance(r14)     // Catch:{ InvocationTargetException -> 0x0116, IllegalAccessException -> 0x00ff, InstantiationException -> 0x00e8, NoSuchMethodException -> 0x00c3, SecurityException -> 0x00ac }
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Class<?> r4 = r13.clazz
            java.lang.String r4 = r4.getSimpleName()
            r3[r5] = r4
            java.lang.String r14 = java.util.Arrays.toString(r14)
            r3[r6] = r14
            androidx.test.internal.util.LogUtil.logDebug((java.lang.String) r2, (java.lang.String) r1, (java.lang.Object[]) r3)
            return r0
        L_0x00a3:
            r0 = move-exception
            r7 = r8
            goto L_0x00ad
        L_0x00a6:
            r0 = move-exception
            r7 = r8
            goto L_0x0117
        L_0x00a9:
            r0 = move-exception
            goto L_0x0138
        L_0x00ac:
            r0 = move-exception
        L_0x00ad:
            androidx.test.espresso.remote.RemoteProtocolException r3 = new androidx.test.espresso.remote.RemoteProtocolException     // Catch:{ all -> 0x00a9 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "Constructor not accessible: %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00a9 }
            r10[r5] = r7     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = java.lang.String.format(r8, r9, r10)     // Catch:{ all -> 0x00a9 }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x00a9 }
            throw r3     // Catch:{ all -> 0x00a9 }
        L_0x00c3:
            r0 = move-exception
            androidx.test.espresso.remote.RemoteProtocolException r3 = new androidx.test.espresso.remote.RemoteProtocolException     // Catch:{ all -> 0x00a9 }
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "No constructor found for clazz: %s. Available constructors: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x00a9 }
            java.lang.Class<?> r10 = r13.clazz     // Catch:{ all -> 0x00a9 }
            java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x00a9 }
            r9[r5] = r10     // Catch:{ all -> 0x00a9 }
            java.lang.Class<?> r10 = r13.clazz     // Catch:{ all -> 0x00a9 }
            java.lang.reflect.Constructor[] r10 = r10.getConstructors()     // Catch:{ all -> 0x00a9 }
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ all -> 0x00a9 }
            r9[r6] = r10     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = java.lang.String.format(r7, r8, r9)     // Catch:{ all -> 0x00a9 }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x00a9 }
            throw r3     // Catch:{ all -> 0x00a9 }
        L_0x00e8:
            r3 = move-exception
            androidx.test.espresso.remote.RemoteProtocolException r7 = new androidx.test.espresso.remote.RemoteProtocolException     // Catch:{ all -> 0x00a9 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x00a9 }
            java.lang.Class<?> r10 = r13.clazz     // Catch:{ all -> 0x00a9 }
            java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x00a9 }
            r9[r5] = r10     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = java.lang.String.format(r8, r0, r9)     // Catch:{ all -> 0x00a9 }
            r7.<init>(r0, r3)     // Catch:{ all -> 0x00a9 }
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00ff:
            r3 = move-exception
            androidx.test.espresso.remote.RemoteProtocolException r7 = new androidx.test.espresso.remote.RemoteProtocolException     // Catch:{ all -> 0x00a9 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x00a9 }
            java.lang.Class<?> r10 = r13.clazz     // Catch:{ all -> 0x00a9 }
            java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x00a9 }
            r9[r5] = r10     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = java.lang.String.format(r8, r0, r9)     // Catch:{ all -> 0x00a9 }
            r7.<init>(r0, r3)     // Catch:{ all -> 0x00a9 }
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x0116:
            r0 = move-exception
        L_0x0117:
            androidx.test.espresso.remote.RemoteProtocolException r3 = new androidx.test.espresso.remote.RemoteProtocolException     // Catch:{ all -> 0x00a9 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "Cannot invoke constructor %s with constructorParams [%s] on clazz %s"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x00a9 }
            r10[r5] = r7     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = java.util.Arrays.toString(r14)     // Catch:{ all -> 0x00a9 }
            r10[r6] = r7     // Catch:{ all -> 0x00a9 }
            java.lang.Class<?> r7 = r13.clazz     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00a9 }
            r10[r4] = r7     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = java.lang.String.format(r8, r9, r10)     // Catch:{ all -> 0x00a9 }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x00a9 }
            throw r3     // Catch:{ all -> 0x00a9 }
        L_0x0138:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Class<?> r4 = r13.clazz
            java.lang.String r4 = r4.getSimpleName()
            r3[r5] = r4
            java.lang.String r14 = java.util.Arrays.toString(r14)
            r3[r6] = r14
            androidx.test.internal.util.LogUtil.logDebug((java.lang.String) r2, (java.lang.String) r1, (java.lang.Object[]) r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.remote.ConstructorInvocation.invokeConstructorExplosively(java.lang.Object[]):java.lang.Object");
    }

    public Object invokeConstructor(Object... objArr) {
        return invokeConstructorExplosively(objArr);
    }
}
