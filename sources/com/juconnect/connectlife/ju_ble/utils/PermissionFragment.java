package com.juconnect.connectlife.ju_ble.utils;

import android.app.Dialog;
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
import com.juconnect.connectlife.ju_ble.R$color;
import com.juconnect.connectlife.ju_ble.R$id;
import com.juconnect.connectlife.ju_ble.R$layout;
import com.juconnect.connectlife.ju_ble.R$style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p302b.p303a.p304s.C3693e;
import p040c.p301y.p302b.p303a.p304s.C3694f;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/utils/PermissionFragment;", "Landroidx/fragment/app/DialogFragment;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "startCode", "", "(Lio/flutter/plugin/common/MethodChannel;I)V", "animResId", "getChannel", "()Lio/flutter/plugin/common/MethodChannel;", "getStartCode", "()I", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PermissionFragment.kt */
public final class PermissionFragment extends DialogFragment {
    public int animResId = R$style.permission_bottom_dialog;
    @NotNull
    public final C9017j channel;
    public final int startCode;

    public PermissionFragment(@NotNull C9017j jVar, int i) {
        Intrinsics.checkNotNullParameter(jVar, "channel");
        this.channel = jVar;
        this.startCode = i;
    }

    /* renamed from: onCreateView$lambda-0  reason: not valid java name */
    public static final void m26780onCreateView$lambda0(PermissionFragment permissionFragment, View view) {
        Intrinsics.checkNotNullParameter(permissionFragment, "this$0");
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        FragmentActivity activity = permissionFragment.getActivity();
        if (activity != null) {
            activity.startActivityForResult(intent, permissionFragment.startCode);
        }
    }

    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m26781onCreateView$lambda1(PermissionFragment permissionFragment, View view) {
        Intrinsics.checkNotNullParameter(permissionFragment, "this$0");
        permissionFragment.channel.mo46573c("getBleDeviceCallback", "false");
        permissionFragment.dismiss();
    }

    @NotNull
    public final C9017j getChannel() {
        return this.channel;
    }

    public final int getStartCode() {
        return this.startCode;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.startCode) {
            dismiss();
        } else {
            dismiss();
        }
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
        if (!(inflate == null || (textView2 = (TextView) inflate.findViewById(R$id.f8403ok)) == null)) {
            textView2.setOnClickListener(new C3693e(this));
        }
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(R$id.cancel)) == null)) {
            textView.setOnClickListener(new C3694f(this));
        }
        return inflate;
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
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), R$color.transparent)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }
}
