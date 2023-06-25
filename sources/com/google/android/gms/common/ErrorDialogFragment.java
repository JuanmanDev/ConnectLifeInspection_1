package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: e */
    public Dialog f8157e;

    /* renamed from: l */
    public DialogInterface.OnCancelListener f8158l;
    @Nullable

    /* renamed from: m */
    public Dialog f8159m;

    @NonNull
    /* renamed from: a */
    public static ErrorDialogFragment m10855a(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        C3495o.m8909k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.f8157e = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f8158l = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8158l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f8157e;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f8159m == null) {
            Activity activity = getActivity();
            C3495o.m8908j(activity);
            this.f8159m = new AlertDialog.Builder(activity).create();
        }
        return this.f8159m;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}
