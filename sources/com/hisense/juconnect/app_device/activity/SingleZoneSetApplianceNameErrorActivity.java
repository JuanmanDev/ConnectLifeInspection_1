package com.hisense.juconnect.app_device.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
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

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0014J\"\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZoneSetApplianceNameErrorActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "SINGLE_QR_CODE_REQUEST_CODE", "", "goToAddSingleRequestCode", "bindLayout", "gotoBindDevice", "", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onPermissionsDenied", "perms", "", "", "onPermissionsGranted", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZoneSetApplianceNameErrorActivity")
/* compiled from: SingleZoneSetApplianceNameErrorActivity.kt */
public final class SingleZoneSetApplianceNameErrorActivity extends BaseActivity {
    public final int SINGLE_QR_CODE_REQUEST_CODE = 1002;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final int goToAddSingleRequestCode = 1001;

    private final void gotoBindDevice() {
        JuConnectExtKt.navigationForResult(Paths.Device.AddNewWifiInstructionsActivity, this, 1001);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.activity_single_zone_set_appliance_name_error;
    }

    public void initWidgets() {
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == this.goToAddSingleRequestCode) {
            finish();
        }
        if (i2 != -1 || i != this.SINGLE_QR_CODE_REQUEST_CODE || intent == null) {
            return;
        }
        if (!intent.getBooleanExtra("data", true)) {
            showString("绑定失败");
        } else {
            showString("绑定成功");
        }
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
    }

    public void setListeners() {
        Button button = (Button) _$_findCachedViewById(R$id.single_zone_set_appliance_name_error_back);
        Intrinsics.checkNotNullExpressionValue(button, "single_zone_set_appliance_name_error_back");
        JuConnectExtKt.singleClickListener(button, new SingleZoneSetApplianceNameErrorActivity$setListeners$1(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.single_zone_set_appliance_name_error_cancel);
        Intrinsics.checkNotNullExpressionValue(button2, "single_zone_set_appliance_name_error_cancel");
        JuConnectExtKt.singleClickListener(button2, SingleZoneSetApplianceNameErrorActivity$setListeners$2.INSTANCE);
    }
}
