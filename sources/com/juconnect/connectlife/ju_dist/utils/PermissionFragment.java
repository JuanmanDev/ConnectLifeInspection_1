package com.juconnect.connectlife.ju_dist.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import com.juconnect.connectlife.ju_dist.R$color;
import com.juconnect.connectlife.ju_dist.R$id;
import com.juconnect.connectlife.ju_dist.R$layout;
import com.juconnect.connectlife.ju_dist.R$style;
import com.juconnect.connectlife.ju_dist.utils.WifiNameUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p302b.p305b.p306s.C3725a;
import p040c.p301y.p302b.p305b.p306s.C3726b;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/PermissionFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "animResId", "", "finish", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PermissionFragment.kt */
public final class PermissionFragment extends DialogFragment {
    public int animResId = R$style.permission_bottom_dialog;

    private final void finish() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: onCreateView$lambda-0  reason: not valid java name */
    public static final void m26799onCreateView$lambda0(PermissionFragment permissionFragment, View view) {
        Intrinsics.checkNotNullParameter(permissionFragment, "this$0");
        permissionFragment.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 887);
    }

    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m26800onCreateView$lambda1(PermissionFragment permissionFragment, View view) {
        Intrinsics.checkNotNullParameter(permissionFragment, "this$0");
        permissionFragment.dismiss();
        permissionFragment.finish();
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 887) {
            finish();
            WifiNameUtils.Companion companion = WifiNameUtils.Companion;
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity);
            Intrinsics.checkNotNullExpressionValue(activity, "activity!!");
            String wifiName = companion.wifiName(activity);
            C9017j channel = JuDistPlugin.Companion.getChannel();
            if (channel != null) {
                channel.mo46573c("getWifiNameCallback", wifiName);
                return;
            }
            return;
        }
        finish();
    }

    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TextView textView;
        TextView textView2;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R$layout.gps_dialog, viewGroup, false);
        if (!(inflate == null || (textView2 = (TextView) inflate.findViewById(R$id.f8593ok)) == null)) {
            textView2.setOnClickListener(new C3726b(this));
        }
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(R$id.cancel)) == null)) {
            textView.setOnClickListener(new C3725a(this));
        }
        return inflate;
    }

    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setWindowAnimations(this.animResId);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 80;
            attributes.width = -1;
            window.setAttributes(attributes);
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(context, R$color.transparent)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }
}
