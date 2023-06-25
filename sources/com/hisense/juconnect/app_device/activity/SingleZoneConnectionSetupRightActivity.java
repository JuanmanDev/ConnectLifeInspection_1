package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\"\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u001e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eH\u0016J\b\u0010 \u001a\u00020\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006!"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZoneConnectionSetupRightActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "SINGLE_QR_CODE_REQUEST_CODE", "", "SINGLE_QR_CODE_REQUEST_CODE_ADD_NEW_APPLIANCE", "goToAddSingleRequestCode", "mDevId", "", "getMDevId", "()Ljava/lang/String;", "setMDevId", "(Ljava/lang/String;)V", "mDevType", "getMDevType", "setMDevType", "mWifiId", "getMWifiId", "setMWifiId", "bindLayout", "gotoSetApplianceName", "", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onPermissionsDenied", "perms", "", "onPermissionsGranted", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZoneConnectionSetupRightActivity")
/* compiled from: SingleZoneConnectionSetupRightActivity.kt */
public final class SingleZoneConnectionSetupRightActivity extends BaseActivity {
    public final int SINGLE_QR_CODE_REQUEST_CODE = 1002;
    public final int SINGLE_QR_CODE_REQUEST_CODE_ADD_NEW_APPLIANCE = PointerIconCompat.TYPE_HELP;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final int goToAddSingleRequestCode = 1001;
    @Autowired(name = "DevId")
    public String mDevId;
    @Autowired(name = "DevType")
    public String mDevType;
    @Autowired(name = "WifiId")
    public String mWifiId;

    /* access modifiers changed from: private */
    public final void gotoSetApplianceName() {
        int i = this.SINGLE_QR_CODE_REQUEST_CODE_ADD_NEW_APPLIANCE;
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.SingleZoneSetApplianceNameActivity);
        a.withString("DevId", getMDevId());
        a.withString("WifiId", getMWifiId());
        a.withString("DevType", getMDevType());
        a.withString("from", "");
        a.navigation((Activity) this, i);
        finish();
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
        return R$layout.activity_single_zone_qr_right;
    }

    @NotNull
    public final String getMDevId() {
        String str = this.mDevId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDevId");
        return null;
    }

    @NotNull
    public final String getMDevType() {
        String str = this.mDevType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDevType");
        return null;
    }

    @NotNull
    public final String getMWifiId() {
        String str = this.mWifiId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mWifiId");
        return null;
    }

    public void initWidgets() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, (CoroutineContext) null, (CoroutineStart) null, new SingleZoneConnectionSetupRightActivity$initWidgets$1(this, (Continuation<? super SingleZoneConnectionSetupRightActivity$initWidgets$1>) null), 3, (Object) null);
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
    }

    public final void setMDevId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mDevId = str;
    }

    public final void setMDevType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mDevType = str;
    }

    public final void setMWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mWifiId = str;
    }
}
