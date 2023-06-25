package com.internationalwinecooler.p529ui.webview;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.activity.WineLabelScannerActivity;
import com.hisense.juconnect.app_device.event.WinePhotoEvent;
import com.hisense.juconnect.app_device.model.LabelScannerType;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.JsResp;
import com.internationalwinecooler.p529ui.WebActionEnum;
import com.internationalwinecooler.utils.AndroidBug5497Workaround;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p492g.C7622b;
import p040c.p482v.p483a.p492g.C7638r;
import p040c.p482v.p483a.p492g.C7639s;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0014J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014J\u001e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0016J\u001e\u0010&\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0007J\b\u0010*\u001a\u00020\u0018H\u0014J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0005H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006-"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/TpWebViewActivity;", "Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "()V", "compImageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getCompImageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "compImageLiveData$delegate", "Lkotlin/Lazy;", "scannerType", "Lcom/hisense/juconnect/app_device/model/LabelScannerType;", "getScannerType", "()Lcom/hisense/juconnect/app_device/model/LabelScannerType;", "setScannerType", "(Lcom/hisense/juconnect/app_device/model/LabelScannerType;)V", "targetUrl", "getTargetUrl", "()Ljava/lang/String;", "setTargetUrl", "(Ljava/lang/String;)V", "getWineCoolerName", "deviceId", "gotoScanner", "", "handleNotification", "count", "", "nameNot", "initWidgets", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPermissionsDenied", "requestCode", "perms", "", "onPermissionsGranted", "onWinePhoto", "event", "Lcom/hisense/juconnect/app_device/event/WinePhotoEvent;", "setListeners", "takePhoto", "type", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/takePhotoWebViewActivity")
/* renamed from: com.internationalwinecooler.ui.webview.TpWebViewActivity */
/* compiled from: TpWebViewActivity.kt */
public final class TpWebViewActivity extends BaseWineWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy compImageLiveData$delegate = LazyKt__LazyJVMKt.lazy(TpWebViewActivity$compImageLiveData$2.INSTANCE);
    @Nullable
    public LabelScannerType scannerType;
    @Autowired(name = "target_url")
    public String targetUrl;

    private final MutableLiveData<String> getCompImageLiveData() {
        return (MutableLiveData) this.compImageLiveData$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getWineCoolerName(String str) {
        Boolean bool;
        if (str == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(DeviceCache.Companion.getInstance().getDevice(str) == null);
        }
        if (bool.booleanValue()) {
            return getString(R.string.device_deleted);
        }
        DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(str);
        if (device == null) {
            return null;
        }
        return device.getDeviceNickName();
    }

    private final void gotoScanner() {
        LabelScannerType labelScannerType = this.scannerType;
        if (labelScannerType != null) {
            WineLabelScannerActivity.Companion companion = WineLabelScannerActivity.Companion;
            Intrinsics.checkNotNull(labelScannerType);
            companion.gotoWLabScannerForResult(this, labelScannerType.getType(), 1);
            return;
        }
        String json = new Gson().toJson((Object) new JsResp("", -1, ""));
        String type = WebActionEnum.TAKE_PHOTO_CALLBACK.getType();
        Intrinsics.checkNotNullExpressionValue(json, "json");
        doEvaluateJs(type, json);
    }

    private final void handleNotification(String str, int i, String str2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new TpWebViewActivity$handleNotification$1(i, this, str, str2, (Continuation<? super TpWebViewActivity$handleNotification$1>) null), 2, (Object) null);
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27220setListeners$lambda0(TpWebViewActivity tpWebViewActivity, String str) {
        Intrinsics.checkNotNullParameter(tpWebViewActivity, "this$0");
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
            tpWebViewActivity.takePhoto(str);
        }
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27221setListeners$lambda1(TpWebViewActivity tpWebViewActivity, String str) {
        Intrinsics.checkNotNullParameter(tpWebViewActivity, "this$0");
        if (!TextUtils.isEmpty(str)) {
            WebActionEnum webActionEnum = WebActionEnum.TAKE_PHOTO_CALLBACK;
            Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
            tpWebViewActivity.compressImage(webActionEnum, str);
        }
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27222setListeners$lambda3(TpWebViewActivity tpWebViewActivity, Triple triple) {
        Intrinsics.checkNotNullParameter(tpWebViewActivity, "this$0");
        if (triple != null) {
            tpWebViewActivity.handleNotification((String) triple.component1(), ((Number) triple.component2()).intValue(), (String) triple.component3());
        }
    }

    private final void takePhoto(String str) {
        LabelScannerType labelScannerType;
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("takePhoto type: ", str));
        if (Intrinsics.areEqual((Object) str, (Object) "1")) {
            labelScannerType = LabelScannerType.ADD_WINE;
        } else {
            labelScannerType = LabelScannerType.WINE_PHOTO;
        }
        this.scannerType = labelScannerType;
        if (EasyPermissions.m26767a(this, "android.permission.CAMERA")) {
            gotoScanner();
            return;
        }
        C9818b.C9820b bVar = new C9818b.C9820b((Activity) this, 1, "android.permission.CAMERA");
        bVar.mo50749d(R.string.rationale_camera);
        bVar.mo50748c(R.string.rationale_ask_ok);
        bVar.mo50747b(R.string.camera_cancel);
        C9818b a = bVar.mo50746a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(this, CODE_PERMI…\n                .build()");
        EasyPermissions.m26771e(a);
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

    @Nullable
    public final LabelScannerType getScannerType() {
        return this.scannerType;
    }

    @NotNull
    public final String getTargetUrl() {
        String str = this.targetUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
        return null;
    }

    public void initWidgets() {
        super.initWidgets();
        loadUrl(getTargetUrl());
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        AndroidBug5497Workaround.Companion.assistActivity(this);
        EventBus.getDefault().register(this);
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        showString((int) R.string.pt_camera);
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        gotoScanner();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onWinePhoto(@NotNull WinePhotoEvent winePhotoEvent) {
        Intrinsics.checkNotNullParameter(winePhotoEvent, NotificationCompat.CATEGORY_EVENT);
        getCompImageLiveData().setValue(winePhotoEvent.getPath());
    }

    public void setListeners() {
        super.setListeners();
        getWineWebViewModel().getTakePhotoLiveData().observe(this, new C7638r(this));
        getCompImageLiveData().observe(this, new C7622b(this));
        getWineWebViewModel().getAddWineSucLiveData().observe(this, new C7639s(this));
    }

    public final void setScannerType(@Nullable LabelScannerType labelScannerType) {
        this.scannerType = labelScannerType;
    }

    public final void setTargetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUrl = str;
    }
}
