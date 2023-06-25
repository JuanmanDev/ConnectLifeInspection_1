package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class WeightTypefaceApi21 {
    public static final String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    public static final String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    public static final String NATIVE_INSTANCE_FIELD = "native_instance";
    public static final String TAG = "WeightTypeface";
    public static final Constructor<Typeface> sConstructor;
    public static final Method sNativeCreateFromTypeface;
    public static final Method sNativeCreateWeightAlias;
    public static final Field sNativeInstance;
    public static final Object sWeightCacheLock = new Object();
    @GuardedBy("sWeightCacheLock")
    public static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache = new LongSparseArray<>(3);

    static {
        Constructor<Typeface> constructor;
        Method method;
        Method method2;
        Field field = null;
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            method2 = Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_METHOD, new Class[]{Long.TYPE, Integer.TYPE});
            method2.setAccessible(true);
            method = Typeface.class.getDeclaredMethod(NATIVE_CREATE_WEIGHT_ALIAS_METHOD, new Class[]{Long.TYPE, Integer.TYPE});
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(new Class[]{Long.TYPE});
            constructor.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            e.getClass().getName();
            method2 = null;
            method = null;
            constructor = null;
        }
        sNativeInstance = field;
        sNativeCreateFromTypeface = method2;
        sNativeCreateWeightAlias = method;
        sConstructor = constructor;
    }

    @Nullable
    public static Typeface create(long j) {
        try {
            return sConstructor.newInstance(new Object[]{Long.valueOf(j)});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public static Typeface createWeightStyle(@NonNull Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        if (!isPrivateApiAvailable()) {
            return null;
        }
        boolean z2 = (i << 1) | z;
        synchronized (sWeightCacheLock) {
            long nativeInstance = getNativeInstance(typeface);
            SparseArray sparseArray = sWeightTypefaceCache.get(nativeInstance);
            if (sparseArray == null) {
                sparseArray = new SparseArray(4);
                sWeightTypefaceCache.put(nativeInstance, sparseArray);
            } else {
                Typeface typeface3 = (Typeface) sparseArray.get(z2);
                if (typeface3 != null) {
                    return typeface3;
                }
            }
            if (z == typeface.isItalic()) {
                typeface2 = create(nativeCreateWeightAlias(nativeInstance, i));
            } else {
                typeface2 = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
            }
            sparseArray.put(z2 ? 1 : 0, typeface2);
            return typeface2;
        }
    }

    public static long getNativeInstance(@NonNull Typeface typeface) {
        try {
            return sNativeInstance.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long nativeCreateFromTypefaceWithExactStyle(long j, int i, boolean z) {
        try {
            return ((Long) sNativeCreateWeightAlias.invoke((Object) null, new Object[]{Long.valueOf(((Long) sNativeCreateFromTypeface.invoke((Object) null, new Object[]{Long.valueOf(j), Integer.valueOf(z ? 2 : 0)})).longValue()), Integer.valueOf(i)})).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long nativeCreateWeightAlias(long j, int i) {
        try {
            return ((Long) sNativeCreateWeightAlias.invoke((Object) null, new Object[]{Long.valueOf(j), Integer.valueOf(i)})).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
