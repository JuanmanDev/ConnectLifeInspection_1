package com.hisense.connect_life.core.utils;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/DialogManager;", "", "()V", "TAG_DEFAULT", "", "getTAG_DEFAULT", "()Ljava/lang/String;", "dismissDialog", "", "fm", "Landroidx/fragment/app/FragmentManager;", "tag", "displayDialog", "df", "Landroidx/fragment/app/DialogFragment;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DialogManager.kt */
public final class DialogManager {
    @NotNull
    public static final DialogManager INSTANCE = new DialogManager();
    @NotNull
    public static final String TAG_DEFAULT = "Ju_Dialog";

    public final void dismissDialog(@NotNull FragmentManager fragmentManager, @NotNull String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "fm.beginTransaction()");
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
            beginTransaction.remove(dialogFragment);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public final void displayDialog(@NotNull DialogFragment dialogFragment, @NotNull FragmentManager fragmentManager, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "df");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        if ((findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null) == null) {
            dialogFragment.show(fragmentManager, str);
        }
    }

    @NotNull
    public final String getTAG_DEFAULT() {
        return TAG_DEFAULT;
    }

    public final void displayDialog(@NotNull DialogFragment dialogFragment, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(dialogFragment, "df");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(TAG_DEFAULT);
        if ((findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null) == null) {
            dialogFragment.show(fragmentManager, TAG_DEFAULT);
        }
    }

    public final void dismissDialog(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "fm.beginTransaction()");
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(TAG_DEFAULT);
        DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
            beginTransaction.remove(dialogFragment);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
