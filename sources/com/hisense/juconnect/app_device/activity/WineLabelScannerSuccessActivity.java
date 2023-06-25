package com.hisense.juconnect.app_device.activity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.glide.GlideUtils;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7520t;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0014J\b\u0010\"\u001a\u00020\u0019H\u0014J\b\u0010#\u001a\u00020\u0019H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006$"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/WineLabelScannerSuccessActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/activity/WineLabelScannerSuccessViewModel;", "()V", "launch", "Lkotlinx/coroutines/Job;", "getLaunch", "()Lkotlinx/coroutines/Job;", "setLaunch", "(Lkotlinx/coroutines/Job;)V", "pathImage", "", "getPathImage", "()Ljava/lang/String;", "setPathImage", "(Ljava/lang/String;)V", "vivinoId", "getVivinoId", "setVivinoId", "wineJson", "getWineJson", "setWineJson", "bindLayout", "", "gotoAddWine", "", "isInventory", "", "cId", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onDestroy", "onStart", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/winelabelscannersuceess")
/* compiled from: WineLabelScannerSuccessActivity.kt */
public final class WineLabelScannerSuccessActivity extends BaseVmActivity<WineLabelScannerSuccessViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public Job launch;
    @Autowired(name = "path")
    public String pathImage;
    @Autowired(name = "vivinoId")
    public String vivinoId;
    @Autowired(name = "path")
    public String wineJson;

    public static final /* synthetic */ WineLabelScannerSuccessViewModel access$getMViewModel(WineLabelScannerSuccessActivity wineLabelScannerSuccessActivity) {
        return (WineLabelScannerSuccessViewModel) wineLabelScannerSuccessActivity.getMViewModel();
    }

    private final void gotoAddWine(boolean z, String str) {
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            boolean z2 = ((Integer) obj).intValue() == 0;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            String buildAssetUrl = JuConnectExtKt.buildAssetUrl(HtmlPaths.ADD_WINE_EDIT2, applicationContext, SPManagerKt.getLanguageType(), MapsKt__MapsKt.mapOf(TuplesKt.m25743to("generic", Boolean.valueOf(z2)), TuplesKt.m25743to("found", Boolean.valueOf(z)), TuplesKt.m25743to("inventoryFlag", Boolean.FALSE)));
            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("targetUrl ", buildAssetUrl));
            Postcard a = C1337a.m211c().mo15011a(Paths.App.AddWineWebViewActivity);
            a.withString(KeyConst.KEY_TARGET_URL, buildAssetUrl);
            a.withString(KeyConst.KEY_IMAGE_PATH, getPathImage());
            a.withString(KeyConst.CATORY_ID_, str);
            a.navigation();
            finish();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m27145subscribeObservable$lambda0(WineLabelScannerSuccessActivity wineLabelScannerSuccessActivity, String str) {
        Intrinsics.checkNotNullParameter(wineLabelScannerSuccessActivity, "this$0");
        if (Intrinsics.areEqual((Object) str, (Object) "0")) {
            Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
            wineLabelScannerSuccessActivity.gotoAddWine(false, str);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(str, LanguageConstKt.f15954it);
        wineLabelScannerSuccessActivity.gotoAddWine(true, str);
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
        return R$layout.activity_wine_label_scanner_success;
    }

    @NotNull
    public final Job getLaunch() {
        Job job = this.launch;
        if (job != null) {
            return job;
        }
        Intrinsics.throwUninitializedPropertyAccessException("launch");
        return null;
    }

    @NotNull
    public final String getPathImage() {
        String str = this.pathImage;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pathImage");
        return null;
    }

    @NotNull
    public final String getVivinoId() {
        String str = this.vivinoId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(KeyConst.KEY_VIVINO_ID);
        return null;
    }

    @NotNull
    public final String getWineJson() {
        String str = this.wineJson;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wineJson");
        return null;
    }

    @NotNull
    public Class<WineLabelScannerSuccessViewModel> initViewModelClz() {
        return WineLabelScannerSuccessViewModel.class;
    }

    public void initWidgets() {
        GlideUtils glideUtils = GlideUtils.INSTANCE;
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.label_image);
        Intrinsics.checkNotNullExpressionValue(imageView, "label_image");
        glideUtils.loadLocalImage(imageView, getPathImage());
    }

    public void onDestroy() {
        super.onDestroy();
        if (getLaunch().isActive()) {
            Job.DefaultImpls.cancel$default(getLaunch(), (CancellationException) null, 1, (Object) null);
        }
    }

    public void onStart() {
        super.onStart();
        setLaunch(BuildersKt__Builders_commonKt.launch$default(this, (CoroutineContext) null, (CoroutineStart) null, new WineLabelScannerSuccessActivity$onStart$1(this, (Continuation<? super WineLabelScannerSuccessActivity$onStart$1>) null), 3, (Object) null));
    }

    public final void setLaunch(@NotNull Job job) {
        Intrinsics.checkNotNullParameter(job, "<set-?>");
        this.launch = job;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.confirm_iftv);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "confirm_iftv");
        JuConnectExtKt.singleClickListener(iconFontView, WineLabelScannerSuccessActivity$setListeners$1.INSTANCE);
        TextView textView = (TextView) _$_findCachedViewById(R$id.cancel_text);
        Intrinsics.checkNotNullExpressionValue(textView, "cancel_text");
        JuConnectExtKt.singleClickListener(textView, new WineLabelScannerSuccessActivity$setListeners$2(this));
    }

    public final void setPathImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pathImage = str;
    }

    public final void setVivinoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vivinoId = str;
    }

    public final void setWineJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wineJson = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((WineLabelScannerSuccessViewModel) getMViewModel()).getCategoryIdLiveData().observe(this, new C7520t(this));
    }
}
