package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

public final class Navigation {
    @NonNull
    public static View.OnClickListener createNavigateOnClickListener(@IdRes int i) {
        return createNavigateOnClickListener(i, (Bundle) null);
    }

    @NonNull
    public static NavController findNavController(@NonNull Activity activity, @IdRes int i) {
        NavController findViewNavController = findViewNavController(ActivityCompat.requireViewById(activity, i));
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    @Nullable
    public static NavController findViewNavController(@NonNull View view) {
        while (view != null) {
            NavController viewNavController = getViewNavController(view);
            if (viewNavController != null) {
                return viewNavController;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @Nullable
    public static NavController getViewNavController(@NonNull View view) {
        Object tag = view.getTag(C0801R.C0804id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static void setViewNavController(@NonNull View view, @Nullable NavController navController) {
        view.setTag(C0801R.C0804id.nav_controller_view_tag, navController);
    }

    @NonNull
    public static View.OnClickListener createNavigateOnClickListener(@IdRes final int i, @Nullable final Bundle bundle) {
        return new View.OnClickListener() {
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(i, bundle);
            }
        };
    }

    @NonNull
    public static View.OnClickListener createNavigateOnClickListener(@NonNull final NavDirections navDirections) {
        return new View.OnClickListener() {
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(navDirections);
            }
        };
    }

    @NonNull
    public static NavController findNavController(@NonNull View view) {
        NavController findViewNavController = findViewNavController(view);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
