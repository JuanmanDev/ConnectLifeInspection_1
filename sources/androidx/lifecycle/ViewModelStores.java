package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

@Deprecated
public class ViewModelStores {
    @MainThread
    @NonNull
    @Deprecated
    /* renamed from: of */
    public static ViewModelStore m100of(@NonNull FragmentActivity fragmentActivity) {
        return fragmentActivity.getViewModelStore();
    }

    @MainThread
    @NonNull
    @Deprecated
    /* renamed from: of */
    public static ViewModelStore m99of(@NonNull Fragment fragment) {
        return fragment.getViewModelStore();
    }
}
