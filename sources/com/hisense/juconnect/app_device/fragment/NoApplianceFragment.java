package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.hisense.connect_life.core.base.BaseFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/NoApplianceFragment;", "Lcom/hisense/connect_life/core/base/BaseFragment;", "()V", "isCheckCamera", "", "bindLayout", "", "checkCameraPer", "", "gotoBindDevice", "initWidgets", "view", "Landroid/view/View;", "onPermissionsDenied", "requestCode", "perms", "", "", "onPermissionsGranted", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NoApplianceFragment.kt */
public final class NoApplianceFragment extends BaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public boolean isCheckCamera;

    private final void checkCameraPer() {
        if (EasyPermissions.m26767a(requireActivity(), "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            gotoBindDevice();
            return;
        }
        C9818b.C9820b bVar = new C9818b.C9820b((Fragment) this, 1, "android.permission.CAMERA");
        bVar.mo50749d(R$string.pt_camera);
        bVar.mo50748c(R$string.rationale_ask_ok);
        bVar.mo50747b(R$string.camera_cancel);
        C9818b a = bVar.mo50746a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(this, CODE_PERMI…\n                .build()");
        this.isCheckCamera = true;
        EasyPermissions.m26771e(a);
    }

    private final void gotoBindDevice() {
        JuConnectExtKt.navigation(Paths.Device.AddNewWifiInstructionsActivity);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.dashboard_no_appliance;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        super.onPermissionsDenied(i, list);
        if (i == 1) {
            showString(R$string.pt_camera);
        }
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        super.onPermissionsGranted(i, list);
        if (i == 1 && this.isCheckCamera) {
            this.isCheckCamera = false;
            gotoBindDevice();
        }
    }

    public void setListeners() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.dashboard_add_appliance);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "dashboard_add_appliance");
        JuConnectExtKt.singleClickListener(linearLayout, NoApplianceFragment$setListeners$1.INSTANCE);
    }
}
