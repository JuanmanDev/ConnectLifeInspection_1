package pub.devrel.easypermissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;
import p687n.p688a.p689a.C9821c;
import p687n.p688a.p689a.C9822d;
import pub.devrel.easypermissions.EasyPermissions;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RationaleDialogFragmentCompat extends AppCompatDialogFragment {

    /* renamed from: e */
    public EasyPermissions.PermissionCallbacks f19481e;

    /* renamed from: l */
    public EasyPermissions.C9998a f19482l;

    /* renamed from: q */
    public static RationaleDialogFragmentCompat m26777q(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String[] strArr) {
        RationaleDialogFragmentCompat rationaleDialogFragmentCompat = new RationaleDialogFragmentCompat();
        rationaleDialogFragmentCompat.setArguments(new C9822d(str2, str3, str, i, i2, strArr).mo50755c());
        return rationaleDialogFragmentCompat;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions.PermissionCallbacks) {
                this.f19481e = (EasyPermissions.PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions.C9998a) {
                this.f19482l = (EasyPermissions.C9998a) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions.PermissionCallbacks) {
            this.f19481e = (EasyPermissions.PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions.C9998a) {
            this.f19482l = (EasyPermissions.C9998a) context;
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        C9822d dVar = new C9822d(getArguments());
        return dVar.mo50754b(getContext(), new C9821c(this, dVar, this.f19481e, this.f19482l));
    }

    public void onDetach() {
        super.onDetach();
        this.f19481e = null;
        this.f19482l = null;
    }

    /* renamed from: r */
    public void mo53753r(FragmentManager fragmentManager, String str) {
        if (!fragmentManager.isStateSaved()) {
            show(fragmentManager, str);
        }
    }
}
