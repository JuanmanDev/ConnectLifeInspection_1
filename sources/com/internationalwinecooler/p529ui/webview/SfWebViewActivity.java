package com.internationalwinecooler.p529ui.webview;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.juconnect.app_device.activity.WineLabelScannerActivity;
import com.hisense.juconnect.app_device.event.WinePhotoEvent;
import com.hisense.juconnect.app_device.model.LabelScannerType;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.WebActionEnum;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p492g.C7623c;
import p040c.p482v.p483a.p492g.C7628h;
import p040c.p482v.p483a.p492g.C7632l;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\u001e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#H\u0016J\u001e\u0010$\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0007J\b\u0010(\u001a\u00020\u0019H\u0014J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0005H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006+"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/SfWebViewActivity;", "Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "()V", "compImageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getCompImageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "compImageLiveData$delegate", "Lkotlin/Lazy;", "imagePath", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "scannerType", "Lcom/hisense/juconnect/app_device/model/LabelScannerType;", "getScannerType", "()Lcom/hisense/juconnect/app_device/model/LabelScannerType;", "setScannerType", "(Lcom/hisense/juconnect/app_device/model/LabelScannerType;)V", "targetUrl", "getTargetUrl", "setTargetUrl", "gotoScanner", "", "initWidgets", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPermissionsDenied", "requestCode", "", "perms", "", "onPermissionsGranted", "onWinePhoto", "event", "Lcom/hisense/juconnect/app_device/event/WinePhotoEvent;", "setListeners", "takePhoto", "type", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/scanFailureWebViewActivity")
/* renamed from: com.internationalwinecooler.ui.webview.SfWebViewActivity */
/* compiled from: SfWebViewActivity.kt */
public final class SfWebViewActivity extends BaseWineWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy compImageLiveData$delegate = LazyKt__LazyJVMKt.lazy(SfWebViewActivity$compImageLiveData$2.INSTANCE);
    @Autowired(name = "key_image_path")
    public String imagePath;
    @NotNull
    public LabelScannerType scannerType = LabelScannerType.WINE_PHOTO;
    @Autowired(name = "target_url")
    public String targetUrl;

    private final MutableLiveData<String> getCompImageLiveData() {
        return (MutableLiveData) this.compImageLiveData$delegate.getValue();
    }

    private final void gotoScanner() {
        WineLabelScannerActivity.Companion.gotoWLabScannerForResult(this, this.scannerType.getType(), 1);
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27217setListeners$lambda0(SfWebViewActivity sfWebViewActivity, String str) {
        Intrinsics.checkNotNullParameter(sfWebViewActivity, "this$0");
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
            sfWebViewActivity.takePhoto(str);
        }
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27218setListeners$lambda2(SfWebViewActivity sfWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(sfWebViewActivity, "this$0");
        if (bool != null) {
            bool.booleanValue();
            sfWebViewActivity.compressImage(WebActionEnum.GET_BAD_IMAGE_AFTER_VIVINO_CALLBACK, sfWebViewActivity.getImagePath());
        }
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27219setListeners$lambda3(SfWebViewActivity sfWebViewActivity, String str) {
        Intrinsics.checkNotNullParameter(sfWebViewActivity, "this$0");
        if (!TextUtils.isEmpty(str)) {
            WebActionEnum webActionEnum = WebActionEnum.TAKE_PHOTO_CALLBACK;
            Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
            sfWebViewActivity.compressImage(webActionEnum, str);
        }
    }

    private final void takePhoto(String str) {
        LabelScannerType labelScannerType;
        if (TextUtils.equals("1", str)) {
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
        bVar.mo50750e(getString(R.string.rationale_camera));
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

    @NotNull
    public final String getImagePath() {
        String str = this.imagePath;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imagePath");
        return null;
    }

    @NotNull
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

    public final void setImagePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imagePath = str;
    }

    public void setListeners() {
        super.setListeners();
        getWineWebViewModel().getTakePhotoLiveData().observe(this, new C7623c(this));
        getWineWebViewModel().getImageBadPathLiveData().observe(this, new C7628h(this));
        getCompImageLiveData().observe(this, new C7632l(this));
    }

    public final void setScannerType(@NotNull LabelScannerType labelScannerType) {
        Intrinsics.checkNotNullParameter(labelScannerType, "<set-?>");
        this.scannerType = labelScannerType;
    }

    public final void setTargetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUrl = str;
    }
}
