package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.UUID;

public final class NavBackStackEntry implements ViewModelStoreOwner {
    public final Bundle mArgs;
    public final NavDestination mDestination;
    @NonNull
    public final UUID mId;
    public NavControllerViewModel mNavControllerViewModel;

    public NavBackStackEntry(@NonNull NavDestination navDestination, @Nullable Bundle bundle, @Nullable NavControllerViewModel navControllerViewModel) {
        this(UUID.randomUUID(), navDestination, bundle, navControllerViewModel);
    }

    @Nullable
    public Bundle getArguments() {
        return this.mArgs;
    }

    @NonNull
    public NavDestination getDestination() {
        return this.mDestination;
    }

    @NonNull
    public ViewModelStore getViewModelStore() {
        return this.mNavControllerViewModel.getViewModelStore(this.mId);
    }

    public void setNavControllerViewModel(@NonNull NavControllerViewModel navControllerViewModel) {
        this.mNavControllerViewModel = navControllerViewModel;
    }

    public NavBackStackEntry(@NonNull UUID uuid, @NonNull NavDestination navDestination, @Nullable Bundle bundle, @Nullable NavControllerViewModel navControllerViewModel) {
        this.mId = uuid;
        this.mDestination = navDestination;
        this.mArgs = bundle;
        this.mNavControllerViewModel = navControllerViewModel;
    }
}
