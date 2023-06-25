package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo47991d2 = {"Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavController;", "findNavController", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;", "navigation-fragment-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Fragment.kt */
public final class FragmentKt {
    @NotNull
    public static final NavController findNavController(@NotNull Fragment fragment) {
        NavController findNavController = NavHostFragment.findNavController(fragment);
        Intrinsics.checkExpressionValueIsNotNull(findNavController, "NavHostFragment.findNavController(this)");
        return findNavController;
    }
}
