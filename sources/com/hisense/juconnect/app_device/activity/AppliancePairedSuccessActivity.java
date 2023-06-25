package com.hisense.juconnect.app_device.activity;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.event.ZoneWineBindEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u001e\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/AppliancePairedSuccessActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "applianceName", "", "getApplianceName", "()Ljava/lang/String;", "setApplianceName", "(Ljava/lang/String;)V", "canTurn", "", "deviceId", "getDeviceId", "setDeviceId", "wifiId", "getWifiId", "setWifiId", "bindLayout", "", "gotoNameApplianceActivity", "", "initWidgets", "onDestroy", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/appliancepairedsuccess")
/* compiled from: AppliancePairedSuccessActivity.kt */
public final class AppliancePairedSuccessActivity extends BaseActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "applianceName")
    public String applianceName;
    public boolean canTurn = true;
    @Autowired(name = "deviceId")
    public String deviceId;
    @Autowired(name = "wifiId")
    public String wifiId;

    /* access modifiers changed from: private */
    public final void gotoNameApplianceActivity() {
        EventBus.getDefault().post(new ZoneWineBindEvent("Wine Climate Cabinet", getWifiId(), getDeviceId()));
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
        return R$layout.activity_appliance_paired_success;
    }

    @NotNull
    public final String getApplianceName() {
        String str = this.applianceName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.APPLIANCENAME);
        return null;
    }

    @NotNull
    public final String getDeviceId() {
        String str = this.deviceId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceId");
        return null;
    }

    @NotNull
    public final String getWifiId() {
        String str = this.wifiId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.WIFIID);
        return null;
    }

    public void initWidgets() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.top_title);
        Intrinsics.checkNotNullExpressionValue(textView, "top_title");
        textView.setVisibility(8);
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R$string.btn_main_close));
        new Handler().postDelayed(new AppliancePairedSuccessActivity$initWidgets$1(this), ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS);
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().post(102);
    }

    public final void setApplianceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applianceName = str;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new AppliancePairedSuccessActivity$setListeners$1(this));
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }
}
