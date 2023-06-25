package com.internationalwinecooler.p529ui.webview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavInflater;
import com.alibaba.android.arouter.facade.Postcard;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.base.BaseWebViewActivity;
import com.hisense.connect_life.core.dialog.LoadingDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.DialogManager;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.networks.request.message.MessageObserver;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.AndroidToJs;
import com.internationalwinecooler.p529ui.WebActionEnum;
import com.internationalwinecooler.p529ui.WineWebViewModel;
import com.internationalwinecooler.utils.AndroidBug5497Workaround;
import com.juconnect.connect_life.R$id;
import com.juconnect.vivino.global.UrlConstKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p482v.p483a.p492g.C7627g;
import p040c.p482v.p483a.p492g.C7636p;
import p040c.p482v.p483a.p492g.C7640t;
import p040c.p482v.p483a.p492g.C7641u;

@Metadata(mo47990d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0004J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0004J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0004J\u001c\u0010#\u001a\u00020\u00192\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040%H\u0004J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0014J\b\u0010+\u001a\u00020\u0019H\u0016J\u0012\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000200J\u0010\u00104\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u00105\u001a\u00020\u0019H\u0014J\u0010\u00106\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0002J\u0006\u00107\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118DX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u00068"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "Lcom/hisense/connect_life/core/base/BaseWebViewActivity;", "()V", "TAG_LOADING", "", "deviceids", "getDeviceids", "()Ljava/lang/String;", "setDeviceids", "(Ljava/lang/String;)V", "jsResp", "Lcom/google/gson/JsonObject;", "getJsResp", "()Lcom/google/gson/JsonObject;", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "wineWebViewModel", "Lcom/internationalwinecooler/ui/WineWebViewModel;", "getWineWebViewModel", "()Lcom/internationalwinecooler/ui/WineWebViewModel;", "wineWebViewModel$delegate", "Lkotlin/Lazy;", "bindLayout", "", "compressImage", "", "webActionEnum", "Lcom/internationalwinecooler/ui/WebActionEnum;", "imagePath", "dismissLoadingDialog", "displayLoadingDialog", "doEvaluateJs", "action", "value", "", "doEvaluateJsAction", "pair", "Lkotlin/Pair;", "initWebView", "Landroid/webkit/WebView;", "initWebViewClient", "Landroid/webkit/WebViewClient;", "initWidgets", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setCommonUI", "", "activity", "Landroid/app/Activity;", "dark", "setDeviceId", "setListeners", "setTranslucentStatus", "subscribeMessage", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.BaseWineWebViewActivity */
/* compiled from: BaseWineWebViewActivity.kt */
public abstract class BaseWineWebViewActivity extends BaseWebViewActivity {
    @NotNull
    public final String TAG_LOADING = "tag_loading_frm";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String deviceids = "";
    @NotNull
    public final JsonObject jsResp = new JsonObject();
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    @NotNull
    public final Lazy wineWebViewModel$delegate = LazyKt__LazyJVMKt.lazy(new BaseWineWebViewActivity$wineWebViewModel$2(this));

    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m27205onCreate$lambda1(BaseWineWebViewActivity baseWineWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseWineWebViewActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                baseWineWebViewActivity.displayLoadingDialog();
            } else {
                baseWineWebViewActivity.dismissLoadingDialog();
            }
        }
    }

    /* renamed from: setListeners$lambda-10  reason: not valid java name */
    public static final void m27206setListeners$lambda10(BaseWineWebViewActivity baseWineWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseWineWebViewActivity, "this$0");
        if (bool != null && bool.booleanValue()) {
            Postcard a = C1337a.m211c().mo15011a(Paths.App.InventoryWineWebView);
            Context baseContext = baseWineWebViewActivity.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
            a.withString(KeyConst.KEY_TARGET_URL, JuConnectExtKt.buildAssetUrl(HtmlPaths.WINE_INVENTORY_MAINTAIN, baseContext, SPManagerKt.getLanguageType(), UrlConstKt.APP_PLATFORM, ""));
            a.navigation();
            baseWineWebViewActivity.finish();
        }
    }

    /* renamed from: setListeners$lambda-5  reason: not valid java name */
    public static final void m27207setListeners$lambda5(BaseWineWebViewActivity baseWineWebViewActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(baseWineWebViewActivity, "this$0");
        if (pair != null) {
            baseWineWebViewActivity.doEvaluateJsAction(pair);
        }
    }

    /* renamed from: setListeners$lambda-7  reason: not valid java name */
    public static final void m27208setListeners$lambda7(BaseWineWebViewActivity baseWineWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseWineWebViewActivity, "this$0");
        if (bool != null && bool.booleanValue()) {
            baseWineWebViewActivity.finish();
        }
    }

    private final void setTranslucentStatus(Activity activity) {
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
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
        return R.layout.activity_hi_web_view;
    }

    public final void compressImage(@NotNull WebActionEnum webActionEnum, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webActionEnum, "webActionEnum");
        Intrinsics.checkNotNullParameter(str, "imagePath");
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new BaseWineWebViewActivity$compressImage$1(str, this, webActionEnum, (Continuation<? super BaseWineWebViewActivity$compressImage$1>) null), 2, (Object) null);
    }

    public void dismissLoadingDialog() {
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.dismissDialog(supportFragmentManager, this.TAG_LOADING);
    }

    public void displayLoadingDialog() {
        LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment();
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.displayDialog(loadingDialogFragment, supportFragmentManager, this.TAG_LOADING);
    }

    public final void doEvaluateJs(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, NavInflater.TAG_ACTION);
        Intrinsics.checkNotNullParameter(str2, "value");
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:" + str + '(');
        sb.append(str2);
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        LogUtilsShen.Companion companion = LogUtilsShen.Companion;
        companion.mo39140i("js action " + str + "  data  " + str2);
        getWebView().evaluateJavascript(sb2, (ValueCallback) null);
    }

    public final void doEvaluateJsAction(@NotNull Pair<? extends WebActionEnum, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        doEvaluateJs(((WebActionEnum) pair.getFirst()).getType(), pair.getSecond());
    }

    @NotNull
    public final String getDeviceids() {
        return this.deviceids;
    }

    @NotNull
    public final JsonObject getJsResp() {
        return this.jsResp;
    }

    @NotNull
    public final WineWebViewModel getWineWebViewModel() {
        return (WineWebViewModel) this.wineWebViewModel$delegate.getValue();
    }

    @NotNull
    public WebView initWebView() {
        WebView webView = (WebView) _$_findCachedViewById(R$id.web_view);
        Intrinsics.checkNotNullExpressionValue(webView, "web_view");
        return webView;
    }

    @NotNull
    public WebViewClient initWebViewClient() {
        return new BaseWineWebViewActivity$initWebViewClient$1();
    }

    public void initWidgets() {
        super.initWidgets();
        AndroidBug5497Workaround.Companion.assistActivity(this);
        setTranslucentStatus(this);
        setCommonUI(this, true);
        getWebView().setWebChromeClient(new BaseWineWebViewActivity$initWidgets$1());
        WebView webView = getWebView();
        webView.clearCache(true);
        webView.clearHistory();
        webView.requestFocus();
        webView.setLayerType(2, (Paint) null);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, HtmlPaths.DEVICE_SETTINGS);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(Intrinsics.stringPlus(getApplicationContext().getCacheDir().getAbsolutePath(), "/webcache"));
        getWebView().addJavascriptInterface(new AndroidToJs(getWineWebViewModel()), "wine");
    }

    public void onBackPressed() {
        getWineWebViewModel().getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.ON_BACKPRESSED_CALLBACK, ""));
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWineWebViewModel().getLoadingData().observe(this, new C7627g(this));
    }

    public final boolean setCommonUI(@NotNull Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        return true;
    }

    public void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceids");
        this.deviceids = str;
        Intrinsics.stringPlus("setDeviceId: ", str);
    }

    public final void setDeviceids(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceids = str;
    }

    public void setListeners() {
        getWineWebViewModel().getEvaluateJsLiveData().observe(this, new C7640t(this));
        subscribeMessage();
        getWineWebViewModel().getGobackLiveData().observe(this, new C7641u(this));
        getWineWebViewModel().getGoInvLiveData().observe(this, new C7636p(this));
    }

    public final void subscribeMessage() {
        JsonObject jsonObject = this.jsResp;
        jsonObject.addProperty("resultCode", (Number) 0);
        jsonObject.addProperty("errorDesc", "");
        jsonObject.add("data", new JsonArray());
        if (this.messageReceivedListener == null) {
            this.messageReceivedListener = new BaseWineWebViewActivity$subscribeMessage$2(this);
        }
        if (this.messageReceivedListener != null) {
            MessageObserver instance = MessageObserver.Companion.getInstance();
            MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
            Intrinsics.checkNotNull(messageReceivedListener2);
            instance.subscribe(messageReceivedListener2);
        }
    }

    public final void doEvaluateJs(@NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, NavInflater.TAG_ACTION);
        Intrinsics.checkNotNullParameter(bArr, "value");
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:" + str + '(');
        sb.append(bArr);
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        getWebView().evaluateJavascript(sb2, (ValueCallback) null);
    }
}
