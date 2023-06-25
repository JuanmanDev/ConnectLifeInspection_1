package pub.devrel.easypermissions;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import p687n.p688a.p689a.C9821c;
import p687n.p688a.p689a.C9822d;
import pub.devrel.easypermissions.EasyPermissions;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RationaleDialogFragment extends DialogFragment {

    /* renamed from: e */
    public EasyPermissions.PermissionCallbacks f19478e;

    /* renamed from: l */
    public EasyPermissions.C9998a f19479l;

    /* renamed from: m */
    public boolean f19480m = false;

    /* renamed from: a */
    public static RationaleDialogFragment m26775a(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String[] strArr) {
        RationaleDialogFragment rationaleDialogFragment = new RationaleDialogFragment();
        rationaleDialogFragment.setArguments(new C9822d(str, str2, str3, i, i2, strArr).mo50755c());
        return rationaleDialogFragment;
    }

    /* renamed from: b */
    public void mo53748b(FragmentManager fragmentManager, String str) {
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !this.f19480m) {
            show(fragmentManager, str);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (Build.VERSION.SDK_INT >= 17 && getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions.PermissionCallbacks) {
                this.f19478e = (EasyPermissions.PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions.C9998a) {
                this.f19479l = (EasyPermissions.C9998a) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions.PermissionCallbacks) {
            this.f19478e = (EasyPermissions.PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions.C9998a) {
            this.f19479l = (EasyPermissions.C9998a) context;
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        C9822d dVar = new C9822d(getArguments());
        return dVar.mo50753a(getActivity(), new C9821c(this, dVar, this.f19478e, this.f19479l));
    }

    public void onDetach() {
        super.onDetach();
        this.f19478e = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f19480m = true;
        super.onSaveInstanceState(bundle);
    }
}
