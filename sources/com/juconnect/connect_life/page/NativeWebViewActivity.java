package com.juconnect.connect_life.page;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.facebook.stetho.server.http.HttpHeaders;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.dialog.LoadingDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.DialogManager;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p301y.p508a.p511u.C7729a;

@Metadata(mo47990d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0015"}, mo47991d2 = {"Lcom/juconnect/connect_life/page/NativeWebViewActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "url", "getUrl", "setUrl", "(Ljava/lang/String;)V", "webClient", "com/juconnect/connect_life/page/NativeWebViewActivity$webClient$1", "Lcom/juconnect/connect_life/page/NativeWebViewActivity$webClient$1;", "bindLayout", "", "initWidgets", "", "onDestroy", "setListeners", "setWebViewConfigure", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NativeWebViewActivity.kt */
public final class NativeWebViewActivity extends BaseActivity {
    @NotNull
    public final String TAG = "NativeWebViewActivity";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String url = "";
    @NotNull
    public final NativeWebViewActivity$webClient$1 webClient = new NativeWebViewActivity$webClient$1(this);

    /* renamed from: initWidgets$lambda-1  reason: not valid java name */
    public static final void m27240initWidgets$lambda1(NativeWebViewActivity nativeWebViewActivity) {
        Intrinsics.checkNotNullParameter(nativeWebViewActivity, "this$0");
        new OkHttpClient().newCall(new Request.Builder().url(nativeWebViewActivity.url).addHeader("Authorization", Intrinsics.stringPlus("Bearer ", HiSmart.Companion.getInstance().getToken())).addHeader(HttpHeaders.CONTENT_TYPE, "application/json").build()).enqueue(new NativeWebViewActivity$initWidgets$2$1(nativeWebViewActivity));
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
        return R.layout.activity_native_web_view;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public void initWidgets() {
        setWebViewConfigure();
        Bundle extras = getIntent().getExtras();
        String str = "";
        if (extras != null) {
            str = extras.getString("params", str);
            Intrinsics.checkNotNullExpressionValue(str, "it.getString(\"params\", \"\")");
        }
        WebViewParams webViewParams = (WebViewParams) C1502i.m924d(str, WebViewParams.class);
        String title = webViewParams.getTitle();
        ((TextView) _$_findCachedViewById(R$id.tv_title)).setText(title);
        String url2 = webViewParams.getUrl();
        this.url = url2;
        if (!TextUtils.isEmpty(url2) && StringsKt__StringsKt.contains$default((CharSequence) this.url, (CharSequence) ".pdf", false, 2, (Object) null) && !Intrinsics.areEqual((Object) title, (Object) "FirmwareManuals")) {
            ((WebView) _$_findCachedViewById(R$id.web_view)).loadUrl(Intrinsics.stringPlus("http://docs.google.com/gviewembedded=true&url=", this.url));
        } else if (Intrinsics.areEqual((Object) title, (Object) "FirmwareManuals")) {
            LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment(false);
            DialogManager dialogManager = DialogManager.INSTANCE;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            dialogManager.displayDialog(loadingDialogFragment, supportFragmentManager, "tag_loading_aty");
            new Thread(new C7729a(this)).start();
        } else {
            ((WebView) _$_findCachedViewById(R$id.web_view)).loadUrl(this.url);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        WebView webView = (WebView) _$_findCachedViewById(R$id.web_view);
        if (webView != null) {
            webView.stopLoading();
        }
        WebView webView2 = (WebView) _$_findCachedViewById(R$id.web_view);
        if (webView2 != null) {
            webView2.removeAllViews();
        }
        WebView webView3 = (WebView) _$_findCachedViewById(R$id.web_view);
        if (webView3 != null) {
            webView3.destroy();
        }
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_back);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_back");
        JuConnectExtKt.singleClickListener(textView, new NativeWebViewActivity$setListeners$1(this));
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
    public final void setWebViewConfigure() {
        WebSettings settings = ((WebView) _$_findCachedViewById(R$id.web_view)).getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "web_view.settings");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        ((WebView) _$_findCachedViewById(R$id.web_view)).setWebViewClient(this.webClient);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setDisplayZoomControls(false);
        ((WebView) _$_findCachedViewById(R$id.web_view)).addJavascriptInterface(this, "connectLife");
    }
}
