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

@RequiresApi(26)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class WeightTypefaceApi26 {
    public static final String NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD = "nativeCreateFromTypefaceWithExactStyle";
    public static final String NATIVE_INSTANCE_FIELD = "native_instance";
    public static final String TAG = "WeightTypeface";
    public static final Constructor<Typeface> sConstructor;
    public static final Method sNativeCreateFromTypefaceWithExactStyle;
    public static final Field sNativeInstance;
    public static final Object sWeightCacheLock = new Object();
    @GuardedBy("sWeightCacheLock")
    public static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache = new LongSparseArray<>(3);

    static {
        Constructor<Typeface> constructor;
        Method method;
        Field field = null;
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            method = Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD, new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE});
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(new Class[]{Long.TYPE});
            constructor.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            constructor = null;
        }
        sNativeInstance = field;
        sNativeCreateFromTypefaceWithExactStyle = method;
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
                Typeface typeface2 = (Typeface) sparseArray.get(z2);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            Typeface create = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
            sparseArray.put(z2 ? 1 : 0, create);
            return create;
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
            return ((Long) sNativeCreateFromTypefaceWithExactStyle.invoke((Object) null, new Object[]{Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z)})).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
