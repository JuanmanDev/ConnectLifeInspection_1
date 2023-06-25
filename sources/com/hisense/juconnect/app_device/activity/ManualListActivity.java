package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.stetho.server.http.HttpHeaders;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$color;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.juconnect.connectlife.model.ConlManual;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7485b0;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ManualListActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "()V", "auid", "", "getAuid", "()Ljava/lang/String;", "setAuid", "(Ljava/lang/String;)V", "deviceName", "getDeviceName", "setDeviceName", "bindLayout", "", "gotoNativeWebViewActivity", "", "params", "Lcom/juconnect/connectlife/model/ConlManual;", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/ManualListActivity")
/* compiled from: ManualListActivity.kt */
public final class ManualListActivity extends BaseVmActivity<ConnectLifeViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "AUID")
    public String auid;
    @Autowired(name = "DEVICE_NAME")
    public String deviceName;

    /* access modifiers changed from: private */
    public final void gotoNativeWebViewActivity(ConlManual conlManual) {
        if (StringsKt__StringsJVMKt.endsWith$default(conlManual.getUrl(), "html", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) conlManual.getUrl(), (CharSequence) "html#", false, 2, (Object) null)) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Device.ManualHtmlActivity);
            a.withString("url", conlManual.getUrl());
            a.withString("manual_name", "");
            a.navigation();
            return;
        }
        Postcard a2 = C1337a.m211c().mo15011a(Paths.Device.ManualPdfActivity);
        a2.withString("url", conlManual.getUrl());
        a2.withString("manual_name", "");
        a2.navigation();
    }

    /* renamed from: initWidgets$lambda-1  reason: not valid java name */
    public static final void m27118initWidgets$lambda1(ManualListActivity manualListActivity, Ref.ObjectRef objectRef) {
        Intrinsics.checkNotNullParameter(manualListActivity, "this$0");
        Intrinsics.checkNotNullParameter(objectRef, "$language");
        Request.Builder builder = new Request.Builder();
        new OkHttpClient().newCall(builder.url("https://api.connectlife.io/api/v1/manuals/" + manualListActivity.getAuid() + '/' + ((String) objectRef.element)).addHeader("Authorization", Intrinsics.stringPlus("Bearer ", AppConfig.Companion.getAccessToken())).addHeader(HttpHeaders.CONTENT_TYPE, "application/json").build()).enqueue(new ManualListActivity$initWidgets$2$1(manualListActivity));
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
        return R$layout.activity_manual_list;
    }

    @NotNull
    public final String getAuid() {
        String str = this.auid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(KeyConst.KEY_AUIT);
        return null;
    }

    @NotNull
    public final String getDeviceName() {
        String str = this.deviceName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceName");
        return null;
    }

    @NotNull
    public Class<ConnectLifeViewModel> initViewModelClz() {
        return ConnectLifeViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.manuals));
        getDeviceName();
        ((TextView) _$_findCachedViewById(R$id.tv_device_name)).setText(getDeviceName());
        ((RelativeLayout) _$_findCachedViewById(R$id.rl_top_bar)).setBackgroundResource(R$color.colorWhite);
        ((RelativeLayout) _$_findCachedViewById(R$id.rl_top_bar)).setElevation(4.0f);
        showLoading(true);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T languageType = SPManagerKt.getLanguageType();
        objectRef.element = languageType;
        if (StringsKt__StringsKt.contains$default((CharSequence) languageType, (CharSequence) LanguageConstKt.zh_CN, false, 2, (Object) null)) {
            objectRef.element = "zh-cn";
        }
        new Thread(new C7485b0(this, objectRef)).start();
    }

    public final void setAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.auid = str;
    }

    public final void setDeviceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new ManualListActivity$setListeners$1(this));
    }
}
