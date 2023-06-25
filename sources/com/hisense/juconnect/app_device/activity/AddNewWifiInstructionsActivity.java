package com.hisense.juconnect.app_device.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/AddNewWifiInstructionsActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "QR_CODE_REQUEST_CODE", "", "bindLayout", "initWidgets", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "setFailLayoutShow", "isShowFail", "", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/AddNewWifiInstructionsActivity")
/* compiled from: AddNewWifiInstructionsActivity.kt */
public final class AddNewWifiInstructionsActivity extends BaseActivity {
    public final int QR_CODE_REQUEST_CODE = 1001;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* access modifiers changed from: private */
    public final void setFailLayoutShow(boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.failLayout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "failLayout");
        relativeLayout.setVisibility(z ? 0 : 8);
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
        return R$layout.activity_add_new_wifi_instructions;
    }

    public void initWidgets() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.top_title);
        Intrinsics.checkNotNullExpressionValue(textView, "top_title");
        textView.setVisibility(8);
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R$string.btn_main_close));
        Bundle extras = getIntent().getExtras();
        String string = extras == null ? null : extras.getString(EventBusConstKt.COOLER_ACCESS_TOKEN);
        Intrinsics.stringPlus("accessToken=", string);
        AppConfig.Companion companion = AppConfig.Companion;
        if (string == null) {
            string = "";
        }
        companion.setAnonymousLoginToken(string);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (!intent.getBooleanExtra("data", true)) {
                setFailLayoutShow(true);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("data", true);
            setResult(-1, intent2);
            finish();
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new AddNewWifiInstructionsActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.scan_qr_code);
        Intrinsics.checkNotNullExpressionValue(button, "scan_qr_code");
        JuConnectExtKt.singleClickListener(button, AddNewWifiInstructionsActivity$setListeners$2.INSTANCE);
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.icon_close);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "icon_close");
        JuConnectExtKt.singleClickListener(iconFontView2, new AddNewWifiInstructionsActivity$setListeners$3(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.close);
        Intrinsics.checkNotNullExpressionValue(button2, "close");
        JuConnectExtKt.singleClickListener(button2, new AddNewWifiInstructionsActivity$setListeners$4(this));
    }
}
