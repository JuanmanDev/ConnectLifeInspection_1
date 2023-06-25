package p687n.p688a.p689a;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import p687n.p688a.p689a.p690e.C9827e;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.RationaleDialogFragment;
import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* renamed from: n.a.a.c */
/* compiled from: RationaleDialogClickListener */
public class C9821c implements DialogInterface.OnClickListener {

    /* renamed from: e */
    public Object f19099e;

    /* renamed from: l */
    public C9822d f19100l;

    /* renamed from: m */
    public EasyPermissions.PermissionCallbacks f19101m;

    /* renamed from: n */
    public EasyPermissions.C9998a f19102n;

    public C9821c(RationaleDialogFragmentCompat rationaleDialogFragmentCompat, C9822d dVar, EasyPermissions.PermissionCallbacks permissionCallbacks, EasyPermissions.C9998a aVar) {
        Object obj;
        if (rationaleDialogFragmentCompat.getParentFragment() != null) {
            obj = rationaleDialogFragmentCompat.getParentFragment();
        } else {
            obj = rationaleDialogFragmentCompat.getActivity();
        }
        this.f19099e = obj;
        this.f19100l = dVar;
        this.f19101m = permissionCallbacks;
        this.f19102n = aVar;
    }

    /* renamed from: a */
    public final void mo50751a() {
        EasyPermissions.PermissionCallbacks permissionCallbacks = this.f19101m;
        if (permissionCallbacks != null) {
            C9822d dVar = this.f19100l;
            permissionCallbacks.onPermissionsDenied(dVar.f19106d, Arrays.asList(dVar.f19108f));
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C9822d dVar = this.f19100l;
        int i2 = dVar.f19106d;
        if (i == -1) {
            String[] strArr = dVar.f19108f;
            EasyPermissions.C9998a aVar = this.f19102n;
            if (aVar != null) {
                aVar.mo53746a(i2);
            }
            Object obj = this.f19099e;
            if (obj instanceof Fragment) {
                C9827e.m26420e((Fragment) obj).mo50756a(i2, strArr);
            } else if (obj instanceof Activity) {
                C9827e.m26419d((Activity) obj).mo50756a(i2, strArr);
            } else {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
        } else {
            EasyPermissions.C9998a aVar2 = this.f19102n;
            if (aVar2 != null) {
                aVar2.mo53747b(i2);
            }
            mo50751a();
        }
    }

    public C9821c(RationaleDialogFragment rationaleDialogFragment, C9822d dVar, EasyPermissions.PermissionCallbacks permissionCallbacks, EasyPermissions.C9998a aVar) {
        this.f19099e = rationaleDialogFragment.getActivity();
        this.f19100l = dVar;
        this.f19101m = permissionCallbacks;
        this.f19102n = aVar;
    }
}
