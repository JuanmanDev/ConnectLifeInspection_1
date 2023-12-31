package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo47991d2 = {"", "Lkotlin/Pair;", "Landroid/view/View;", "", "sharedElements", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "FragmentNavigatorExtras", "([Lkotlin/Pair;)Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: FragmentNavigatorExtras.kt */
public final class FragmentNavigatorExtrasKt {
    @NotNull
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(@NotNull Pair<? extends View, String>... pairArr) {
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (Pair<? extends View, String> pair : pairArr) {
            builder.addSharedElement((View) pair.component1(), pair.component2());
        }
        FragmentNavigator.Extras build = builder.build();
        Intrinsics.checkExpressionValueIsNotNull(build, "FragmentNavigator.Extras…      }\n        }.build()");
        return build;
    }
}
