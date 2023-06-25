package com.hisense.connect_life.core.dialog;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.ActivityChooserModel;
import com.hisense.connect_life.core.R$style;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/core/dialog/LoadingDialog;", "Landroidx/appcompat/app/AlertDialog;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getView", "()Landroid/view/View;", "view$delegate", "Lkotlin/Lazy;", "dismiss", "", "show", "message", "", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoadingDialog.kt */
public final class LoadingDialog extends AlertDialog {
    @NotNull
    public final Activity activity;
    @NotNull
    public final Lazy view$delegate = LazyKt__LazyJVMKt.lazy(new LoadingDialog$view$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingDialog(@NotNull Activity activity2) {
        super(activity2, R$style.LoadingDialog);
        Intrinsics.checkNotNullParameter(activity2, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.activity = activity2;
        setView(getView());
    }

    private final View getView() {
        return (View) this.view$delegate.getValue();
    }

    public void dismiss() {
        if (this.activity.isDestroyed()) {
            super.dismiss();
        }
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final void show(@Nullable CharSequence charSequence) {
        super.show();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.0f;
        onWindowAttributesChanged(attributes);
    }
}
