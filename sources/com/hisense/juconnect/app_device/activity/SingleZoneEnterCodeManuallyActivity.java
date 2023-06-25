package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.Button;
import androidx.core.view.PointerIconCompat;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7492f;
import p040c.p429r.p460b.p461a.p462a.C7498i;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0005H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/SingleZoneEnterCodeManuallyActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "SINGLE_QR_CODE_ENTER_MANUALLY_REQUEST_CODE", "", "SINGLE_QR_CODE_ERROR_REQUEST_CODE", "SINGLE_QR_CODE_HELP_REQUEST_CODE", "SINGLE_QR_CODE_RIGHT_REQUEST_CODE", "auid", "", "deviceDefaultName", "isFirst", "", "isOpenFlashlight", "nickName", "wifiId", "bindLayout", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "onDestroy", "onResume", "onStop", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/SingleZoneEnterCodeManuallyActivity")
/* compiled from: SingleZoneEnterCodeManuallyActivity.kt */
public final class SingleZoneEnterCodeManuallyActivity extends BaseVmActivity<DeviceViewModel> {
    public final int SINGLE_QR_CODE_ENTER_MANUALLY_REQUEST_CODE = PointerIconCompat.TYPE_WAIT;
    public final int SINGLE_QR_CODE_ERROR_REQUEST_CODE = PointerIconCompat.TYPE_HELP;
    public final int SINGLE_QR_CODE_HELP_REQUEST_CODE = 1001;
    public final int SINGLE_QR_CODE_RIGHT_REQUEST_CODE = 1002;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String auid = "";
    @NotNull
    public final String deviceDefaultName = "Wine Climate Cabinet ";
    public boolean isFirst = true;
    public boolean isOpenFlashlight;
    @NotNull
    public String nickName = "";
    @NotNull
    public String wifiId = "";

    public static final /* synthetic */ DeviceViewModel access$getMViewModel(SingleZoneEnterCodeManuallyActivity singleZoneEnterCodeManuallyActivity) {
        return (DeviceViewModel) singleZoneEnterCodeManuallyActivity.getMViewModel();
    }

    /* renamed from: initWidgets$lambda-0  reason: not valid java name */
    public static final void m27134initWidgets$lambda0(SingleZoneEnterCodeManuallyActivity singleZoneEnterCodeManuallyActivity, View view) {
        Intrinsics.checkNotNullParameter(singleZoneEnterCodeManuallyActivity, "this$0");
        singleZoneEnterCodeManuallyActivity.finish();
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m27135subscribeObservable$lambda1(Boolean bool) {
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
        return R$layout.activity_single_zone_enter_code_manually;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setOnClickListener(new C7498i(this));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStop() {
        super.onStop();
    }

    public void setListeners() {
        Button button = (Button) _$_findCachedViewById(R$id.bt_single_zone_enter_manually_connect);
        Intrinsics.checkNotNullExpressionValue(button, "bt_single_zone_enter_manually_connect");
        JuConnectExtKt.singleClickListener(button, new SingleZoneEnterCodeManuallyActivity$setListeners$1(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getSingleZoneQrCodeAuidTypeLiveData().observe(this, C7492f.f14189a);
    }
}
