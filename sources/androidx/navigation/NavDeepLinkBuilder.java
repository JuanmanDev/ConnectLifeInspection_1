package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class NavDeepLinkBuilder {
    public Bundle mArgs;
    public final Context mContext;
    public int mDestId;
    public NavGraph mGraph;
    public final Intent mIntent;

    public static class PermissiveNavigatorProvider extends NavigatorProvider {
        public final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() {
            @NonNull
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Nullable
            public NavDestination navigate(@NonNull NavDestination navDestination, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
                throw new IllegalStateException("navigate is not supported");
            }

            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @NonNull
        public Navigator<? extends NavDestination> getNavigator(@NonNull String str) {
            try {
                return super.getNavigator(str);
            } catch (IllegalStateException unused) {
                return this.mDestNavigator;
            }
        }
    }

    public NavDeepLinkBuilder(@NonNull Context context) {
        this.mContext = context;
        if (context instanceof Activity) {
            Context context2 = this.mContext;
            this.mIntent = new Intent(context2, context2.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(this.mContext.getPackageName());
            this.mIntent = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.mIntent.addFlags(268468224);
    }

    private void fillInIntent() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.mGraph);
        NavDestination navDestination = null;
        while (!arrayDeque.isEmpty() && navDestination == null) {
            NavDestination navDestination2 = (NavDestination) arrayDeque.poll();
            if (navDestination2.getId() == this.mDestId) {
                navDestination = navDestination2;
            } else if (navDestination2 instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (navDestination != null) {
            this.mIntent.putExtra(NavController.KEY_DEEP_LINK_IDS, navDestination.buildDeepLinkIds());
            return;
        }
        String displayName = NavDestination.getDisplayName(this.mContext, this.mDestId);
        throw new IllegalArgumentException("navigation destination " + displayName + " is unknown to this NavController");
    }

    @NonNull
    public PendingIntent createPendingIntent() {
        Bundle bundle = this.mArgs;
        int i = 0;
        if (bundle != null) {
            int i2 = 0;
            for (String str : bundle.keySet()) {
                Object obj = this.mArgs.get(str);
                i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
            }
            i = i2;
        }
        return createTaskStackBuilder().getPendingIntent((i * 31) + this.mDestId, 134217728);
    }

    @NonNull
    public TaskStackBuilder createTaskStackBuilder() {
        if (this.mIntent.getIntArrayExtra(NavController.KEY_DEEP_LINK_IDS) != null) {
            TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.mContext).addNextIntentWithParentStack(new Intent(this.mIntent));
            for (int i = 0; i < addNextIntentWithParentStack.getIntentCount(); i++) {
                addNextIntentWithParentStack.editIntentAt(i).putExtra(NavController.KEY_DEEP_LINK_INTENT, this.mIntent);
            }
            return addNextIntentWithParentStack;
        } else if (this.mGraph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else {
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
    }

    @NonNull
    public NavDeepLinkBuilder setArguments(@Nullable Bundle bundle) {
        this.mArgs = bundle;
        this.mIntent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, bundle);
        return this;
    }

    @NonNull
    public NavDeepLinkBuilder setComponentName(@NonNull Class<? extends Activity> cls) {
        return setComponentName(new ComponentName(this.mContext, cls));
    }

    @NonNull
    public NavDeepLinkBuilder setDestination(@IdRes int i) {
        this.mDestId = i;
        if (this.mGraph != null) {
            fillInIntent();
        }
        return this;
    }

    @NonNull
    public NavDeepLinkBuilder setGraph(@NavigationRes int i) {
        return setGraph(new NavInflater(this.mContext, new PermissiveNavigatorProvider()).inflate(i));
    }

    @NonNull
    public NavDeepLinkBuilder setComponentName(@NonNull ComponentName componentName) {
        this.mIntent.setComponent(componentName);
        return this;
    }

    @NonNull
    public NavDeepLinkBuilder setGraph(@NonNull NavGraph navGraph) {
        this.mGraph = navGraph;
        if (this.mDestId != 0) {
            fillInIntent();
        }
        return this;
    }

    public NavDeepLinkBuilder(@NonNull NavController navController) {
        this(navController.getContext());
        this.mGraph = navController.getGraph();
    }
}
