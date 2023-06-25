package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0005H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZonePairApplianceGuideActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "SINGLE_QR_CODE_REQUEST_CODE_ADD_NEW_APPLIANCE", "", "deviceDefaultName", "", "isFirst", "", "isOpenFlashlight", "mAuid", "getMAuid", "()Ljava/lang/String;", "setMAuid", "(Ljava/lang/String;)V", "nickName", "wifiId", "bindLayout", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZonePairApplianceGuideActivity")
/* compiled from: SingleZonePairApplianceGuideActivity.kt */
public final class SingleZonePairApplianceGuideActivity extends BaseVmActivity<DeviceViewModel> {
    public final int SINGLE_QR_CODE_REQUEST_CODE_ADD_NEW_APPLIANCE = 1001;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final String deviceDefaultName = "Wine Climate Cabinet ";
    public boolean isFirst = true;
    public boolean isOpenFlashlight;
    @Autowired(name = "auid")
    public String mAuid;
    @NotNull
    public String nickName = "";
    @NotNull
    public String wifiId = "";

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
        return R$layout.activity_single_zone_pair_appliance;
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

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.pair_appliance));
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new SingleZonePairApplianceGuideActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.bt_single_zone_pair_next);
        Intrinsics.checkNotNullExpressionValue(button, "bt_single_zone_pair_next");
        JuConnectExtKt.singleClickListener(button, new SingleZonePairApplianceGuideActivity$setListeners$2(this));
    }

    public final void setMAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mAuid = str;
    }
}
