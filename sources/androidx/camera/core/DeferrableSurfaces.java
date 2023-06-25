package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DeferrableSurfaces {
    public static final String TAG = "DeferrableSurfaces";

    public static void refresh(Collection<DeferrableSurface> collection) {
        for (DeferrableSurface refresh : collection) {
            refresh.refresh();
        }
    }

    public static List<Surface> surfaceList(Collection<DeferrableSurface> collection) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface surface : collection) {
            arrayList.add(surface.getSurface());
        }
        try {
            ArrayList arrayList2 = new ArrayList((Collection) Futures.successfulAsList(arrayList).get());
            arrayList2.removeAll(Collections.singleton((Object) null));
            return Collections.unmodifiableList(arrayList2);
        } catch (InterruptedException | ExecutionException unused) {
            return Collections.unmodifiableList(Collections.emptyList());
        }
    }

    public static Set<Surface> surfaceSet(Collection<DeferrableSurface> collection) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface surface : collection) {
            arrayList.add(surface.getSurface());
        }
        try {
            HashSet hashSet = new HashSet((Collection) Futures.successfulAsList(arrayList).get());
            hashSet.removeAll(Collections.singleton((Object) null));
            return Collections.unmodifiableSet(hashSet);
        } catch (InterruptedException | ExecutionException unused) {
            return Collections.unmodifiableSet(Collections.emptySet());
        }
    }
}
