package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.runtime.C0737R;

public class ViewTreeLifecycleOwner {
    @Nullable
    public static LifecycleOwner get(@NonNull View view) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) view.getTag(C0737R.C0738id.view_tree_lifecycle_owner);
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        ViewParent parent = view.getParent();
        while (lifecycleOwner == null && (parent instanceof View)) {
            View view2 = (View) parent;
            lifecycleOwner = (LifecycleOwner) view2.getTag(C0737R.C0738id.view_tree_lifecycle_owner);
            parent = view2.getParent();
        }
        return lifecycleOwner;
    }

    public static void set(@NonNull View view, @Nullable LifecycleOwner lifecycleOwner) {
        view.setTag(C0737R.C0738id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
