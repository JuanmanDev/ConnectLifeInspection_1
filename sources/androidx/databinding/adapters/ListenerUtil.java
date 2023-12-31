package androidx.databinding.adapters;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class ListenerUtil {
    public static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray<>();

    public static <T> T getListener(View view, int i) {
        if (Build.VERSION.SDK_INT >= 14) {
            return view.getTag(i);
        }
        synchronized (sListeners) {
            WeakHashMap weakHashMap = sListeners.get(i);
            if (weakHashMap == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) weakHashMap.get(view);
            if (weakReference == null) {
                return null;
            }
            T t = weakReference.get();
            return t;
        }
    }

    public static <T> T trackListener(View view, T t, int i) {
        WeakReference weakReference;
        if (Build.VERSION.SDK_INT >= 14) {
            T tag = view.getTag(i);
            view.setTag(i, t);
            return tag;
        }
        synchronized (sListeners) {
            WeakHashMap weakHashMap = sListeners.get(i);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                sListeners.put(i, weakHashMap);
            }
            if (t == null) {
                weakReference = (WeakReference) weakHashMap.remove(view);
            } else {
                weakReference = (WeakReference) weakHashMap.put(view, new WeakReference(t));
            }
            if (weakReference == null) {
                return null;
            }
            T t2 = weakReference.get();
            return t2;
        }
    }
}
