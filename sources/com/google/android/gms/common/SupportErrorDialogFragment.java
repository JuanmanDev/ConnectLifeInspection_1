package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: e */
    public Dialog f8167e;

    /* renamed from: l */
    public DialogInterface.OnCancelListener f8168l;
    @Nullable

    /* renamed from: m */
    public Dialog f8169m;

    @NonNull
    /* renamed from: q */
    public static SupportErrorDialogFragment m10860q(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        C3495o.m8909k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f8167e = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f8168l = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8168l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f8167e;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f8169m == null) {
            Context context = getContext();
            C3495o.m8908j(context);
            this.f8169m = new AlertDialog.Builder(context).create();
        }
        return this.f8169m;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}
