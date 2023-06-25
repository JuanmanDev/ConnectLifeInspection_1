package com.hisense.juconnect.app_device.activity;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.widget.IconFontView;
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

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\"\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZoneAddNewApplicationActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "SINGLE_QR_CODE_CONNECTION_SETUP_REQUEST_CODE", "", "SINGLE_QR_CODE_PAIR_APPLIANCE_REQUEST_CODE", "SINGLE_QR_CODE_REQUEST_CODE", "goToAddSingleRequestCode", "mAuid", "", "getMAuid", "()Ljava/lang/String;", "setMAuid", "(Ljava/lang/String;)V", "bindLayout", "gotoBindDevice", "", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onPermissionsDenied", "perms", "", "onPermissionsGranted", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZoneAddNewApplicationActivity")
/* compiled from: SingleZoneAddNewApplicationActivity.kt */
public final class SingleZoneAddNewApplicationActivity extends BaseActivity {
    public final int SINGLE_QR_CODE_CONNECTION_SETUP_REQUEST_CODE = PointerIconCompat.TYPE_HELP;
    public final int SINGLE_QR_CODE_PAIR_APPLIANCE_REQUEST_CODE = PointerIconCompat.TYPE_WAIT;
    public final int SINGLE_QR_CODE_REQUEST_CODE = 1002;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final int goToAddSingleRequestCode = 1001;
    @Autowired(name = "auid")
    public String mAuid;

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
        return R$layout.activity_single_zone_add_new_application;
    }

    @NotNull
    public final String getMAuid() {
        String str = this.mAuid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAuid");
        return null;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.add_appliance_new));
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
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, SingleZoneAddNewApplicationActivity$setListeners$1.INSTANCE);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_connection_setup);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_connection_setup");
        JuConnectExtKt.singleClickListener(linearLayout, new SingleZoneAddNewApplicationActivity$setListeners$2(this));
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_pair_appliance);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_pair_appliance");
        JuConnectExtKt.singleClickListener(linearLayout2, new SingleZoneAddNewApplicationActivity$setListeners$3(this));
    }

    public final void setMAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mAuid = str;
    }
}
