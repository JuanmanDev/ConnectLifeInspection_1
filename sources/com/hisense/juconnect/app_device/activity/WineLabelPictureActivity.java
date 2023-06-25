package com.hisense.juconnect.app_device.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.glide.GlideUtils;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.event.WinePhotoEvent;
import com.juconnect.vivino.VivinoCache;
import com.juconnect.vivino.model.HiVintage;
import com.juconnect.vivino.model.HiWine;
import java.io.File;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7497h0;
import p040c.p429r.p460b.p461a.p462a.C7518s;
import p040c.p531f0.p532a.C8824a;

@Metadata(mo47990d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0014J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0014J\"\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0014J\b\u0010,\u001a\u00020\u001bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006-"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/WineLabelPictureActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/activity/VivinoViewModel;", "()V", "connectLifeViewModel", "Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "getConnectLifeViewModel", "()Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "connectLifeViewModel$delegate", "Lkotlin/Lazy;", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "countDownTimer$delegate", "mHiVintage", "Lcom/juconnect/vivino/model/HiVintage;", "pathImage", "", "getPathImage", "()Ljava/lang/String;", "setPathImage", "(Ljava/lang/String;)V", "typeScanner", "getTypeScanner", "setTypeScanner", "addWinePhone", "", "bindLayout", "", "gotoWineLabelScanFailure", "gotoWineLabelScanSuccess", "handleTimeOut", "initData", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "scanLabel", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/winelabelpicture")
/* compiled from: WineLabelPictureActivity.kt */
public final class WineLabelPictureActivity extends BaseVmActivity<VivinoViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy connectLifeViewModel$delegate = LazyKt__LazyJVMKt.lazy(new WineLabelPictureActivity$connectLifeViewModel$2(this));
    @NotNull
    public final Lazy countDownTimer$delegate = LazyKt__LazyJVMKt.lazy(new WineLabelPictureActivity$countDownTimer$2(this));
    @Nullable
    public HiVintage mHiVintage;
    @Autowired(name = "path")
    public String pathImage;
    @Autowired(name = "wine_scanner")
    public String typeScanner;

    /* access modifiers changed from: private */
    public final void addWinePhone() {
        EventBus.getDefault().post(new WinePhotoEvent(getPathImage()));
        finish();
    }

    private final ConnectLifeViewModel getConnectLifeViewModel() {
        return (ConnectLifeViewModel) this.connectLifeViewModel$delegate.getValue();
    }

    private final CountDownTimer getCountDownTimer() {
        return (CountDownTimer) this.countDownTimer$delegate.getValue();
    }

    private final void gotoWineLabelScanFailure() {
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            boolean z = ((Integer) obj).intValue() == 0;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            String buildAssetUrl = JuConnectExtKt.buildAssetUrl(HtmlPaths.LABEL_SCAN_FAILURE2, applicationContext, SPManagerKt.getLanguageType(), MapsKt__MapsKt.mapOf(TuplesKt.m25743to("generic", Boolean.valueOf(z)), TuplesKt.m25743to("inventoryFlag", Boolean.FALSE)));
            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("gotoWineLabelScanFailure targetUrl: ", buildAssetUrl));
            Postcard a = C1337a.m211c().mo15011a(Paths.App.ScanFailureWebViewActivity);
            a.withFlags(335544320);
            a.withString(KeyConst.KEY_TARGET_URL, buildAssetUrl);
            a.withString(KeyConst.KEY_IMAGE_PATH, getPathImage());
            a.navigation();
            finish();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    private final void gotoWineLabelScanSuccess() {
        Gson gson = new Gson();
        HiVintage hiVintage = this.mHiVintage;
        Long l = null;
        String json = gson.toJson((Object) hiVintage == null ? null : hiVintage.getWine(), (Type) HiWine.class);
        if (json == null) {
            json = "";
        }
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.WineLabelScannerSuccessActivity);
        a.withString("path", getPathImage());
        a.withString(KeyConst.KEY_WINE_JSON, json);
        HiVintage hiVintage2 = this.mHiVintage;
        if (hiVintage2 != null) {
            l = Long.valueOf(hiVintage2.getId());
        }
        a.withString(KeyConst.KEY_VIVINO_ID, String.valueOf(l));
        a.navigation();
        finish();
    }

    /* access modifiers changed from: private */
    public final void handleTimeOut() {
        gotoWineLabelScanFailure();
    }

    /* access modifiers changed from: private */
    public final void scanLabel() {
        if (TextUtils.isEmpty(getPathImage())) {
            showString(R$string.tip_none_file);
            return;
        }
        File file = new File(getPathImage());
        if (!file.exists()) {
            showString(R$string.tip_none_file);
            return;
        }
        C8824a d = C8824a.m23749d(Uri.fromFile(file), Uri.fromFile(file));
        d.mo45967g(3.0f, 4.0f);
        d.mo45968h(480, 640);
        C8824a.C8825a aVar = new C8824a.C8825a();
        aVar.mo45973d("");
        aVar.mo45972c(true);
        aVar.mo45971b(true);
        d.mo45969i(aVar);
        d.mo45965e(this);
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m27141subscribeObservable$lambda1(WineLabelPictureActivity wineLabelPictureActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(wineLabelPictureActivity, "this$0");
        if (pair != null) {
            wineLabelPictureActivity.getCountDownTimer().cancel();
            VivinoCache.Companion.setCache((HiVintage) pair.getSecond());
            if (!((Boolean) pair.getFirst()).booleanValue() || pair.getSecond() == null) {
                wineLabelPictureActivity.gotoWineLabelScanFailure();
                return;
            }
            wineLabelPictureActivity.mHiVintage = (HiVintage) pair.getSecond();
            wineLabelPictureActivity.gotoWineLabelScanSuccess();
        }
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m27142subscribeObservable$lambda3(WineLabelPictureActivity wineLabelPictureActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(wineLabelPictureActivity, "this$0");
        wineLabelPictureActivity.hideLoading();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            wineLabelPictureActivity.getCountDownTimer().cancel();
            if (booleanValue) {
                wineLabelPictureActivity.gotoWineLabelScanSuccess();
            } else {
                wineLabelPictureActivity.gotoWineLabelScanFailure();
            }
        }
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
        return R$layout.activity_wine_label_picture;
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
    public final String getTypeScanner() {
        String str = this.typeScanner;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("typeScanner");
        return null;
    }

    public void initData() {
        super.initData();
        VivinoCache.Companion.clearCache();
    }

    @NotNull
    public Class<VivinoViewModel> initViewModelClz() {
        return VivinoViewModel.class;
    }

    public void initWidgets() {
        GlideUtils glideUtils = GlideUtils.INSTANCE;
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.label_image);
        Intrinsics.checkNotNullExpressionValue(imageView, "label_image");
        glideUtils.loadLocalImage(imageView, getPathImage());
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object obj = null;
        if (i2 == -1 && i == 69) {
            if (intent != null) {
                obj = C8824a.m23748c(intent);
            }
            getCountDownTimer().start();
            ((VivinoViewModel) getMViewModel()).scanLabel(new File(new URI(String.valueOf(obj))));
            Intrinsics.stringPlus("文件长度", Long.valueOf(new File(new URI(String.valueOf(obj))).length()));
            Bitmap decodeFile = BitmapFactory.decodeFile(getPathImage());
            Intrinsics.checkNotNullExpressionValue(decodeFile, "decodeFile(pathImage)");
            ((ImageView) _$_findCachedViewById(R$id.label_image)).setImageBitmap(decodeFile);
            decodeFile.getWidth() + "宽度";
            decodeFile.getHeight() + "长度";
        } else if (i2 == 96) {
            gotoWineLabelScanFailure();
            if (intent != null) {
                obj = C8824a.m23747a(intent);
            }
            Intrinsics.checkNotNull(obj);
        } else if (i2 == 0) {
            hideLoading();
        }
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.cancel_text);
        Intrinsics.checkNotNullExpressionValue(textView, "cancel_text");
        JuConnectExtKt.singleClickListener(textView, new WineLabelPictureActivity$setListeners$1(this));
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.afresh_text);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "afresh_text");
        JuConnectExtKt.singleClickListener(iconFontView, new WineLabelPictureActivity$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.use_text);
        Intrinsics.checkNotNullExpressionValue(textView2, "use_text");
        JuConnectExtKt.singleClickListener(textView2, new WineLabelPictureActivity$setListeners$3(this));
    }

    public final void setPathImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pathImage = str;
    }

    public final void setTypeScanner(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.typeScanner = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((VivinoViewModel) getMViewModel()).getVivinoScanLiveData().observe(this, new C7497h0(this));
        getConnectLifeViewModel().getVivinoLogLiveData().observe(this, new C7518s(this));
    }
}
