package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aB\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\b¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\b¢\u0006\u0004\b\t\u0010\u000b\u001aB\u0010\f\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\b¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, mo47991d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/fragment/app/FragmentTransaction;", "", "containerViewId", "", "tag", "Landroid/os/Bundle;", "args", "add", "(Landroidx/fragment/app/FragmentTransaction;ILjava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/FragmentTransaction;", "(Landroidx/fragment/app/FragmentTransaction;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/FragmentTransaction;", "replace", "fragment-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: FragmentTransaction.kt */
public final class FragmentTransactionKt {
    @NotNull
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(@NotNull FragmentTransaction fragmentTransaction, @IdRes int i, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i, Fragment.class, bundle, str);
        Intrinsics.checkExpressionValueIsNotNull(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i, Fragment.class, bundle, str);
        Intrinsics.checkExpressionValueIsNotNull(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    @NotNull
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(@NotNull FragmentTransaction fragmentTransaction, @IdRes int i, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i, Fragment.class, bundle, str);
        Intrinsics.checkExpressionValueIsNotNull(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i, Fragment.class, bundle, str);
        Intrinsics.checkExpressionValueIsNotNull(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    @NotNull
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(@NotNull FragmentTransaction fragmentTransaction, @NotNull String str, @Nullable Bundle bundle) {
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add((Class<? extends Fragment>) Fragment.class, bundle, str);
        Intrinsics.checkExpressionValueIsNotNull(add, "add(F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add((Class<? extends Fragment>) Fragment.class, bundle, str);
        Intrinsics.checkExpressionValueIsNotNull(add, "add(F::class.java, args, tag)");
        return add;
    }
}
