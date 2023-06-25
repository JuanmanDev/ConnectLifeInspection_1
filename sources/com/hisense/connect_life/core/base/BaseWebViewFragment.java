package com.hisense.connect_life.core.base;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.hisense.connect_life.core.global.HtmlPaths;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0003J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015J\"\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001bJ\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0015H\u0007J\u000e\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020\nJ\u0006\u0010*\u001a\u00020\nJ\u0006\u0010+\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006,"}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseWebViewFragment;", "Lcom/hisense/connect_life/core/base/BaseFragment;", "()V", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "configWebView", "", "goForward", "goback", "initWebView", "initWebViewClient", "Landroid/webkit/WebViewClient;", "initWidgets", "view", "Landroid/view/View;", "loadData", "data", "", "mimeType", "encoding", "loadUrl", "url", "conditionHeaders", "", "moreWebSettings", "settings", "Landroid/webkit/WebSettings;", "postUrl", "postData", "", "wAddJavascriptInterface", "any", "", "interfaceName", "wClearCache", "includeDiskFiles", "", "wClearHistory", "wOnPause", "wOnResume", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseWebViewFragment.kt */
public abstract class BaseWebViewFragment extends BaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public WebView webView;

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void configWebView() {
        WebSettings settings = getWebView().getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setCacheMode(2);
            settings.setSupportZoom(true);
            settings.setAllowFileAccess(true);
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            moreWebSettings(settings);
            WebView webView2 = getWebView();
            webView2.setWebViewClient(initWebViewClient());
            webView2.setVerticalScrollBarEnabled(false);
            webView2.setHorizontalScrollBarEnabled(false);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @NotNull
    public final WebView getWebView() {
        WebView webView2 = this.webView;
        if (webView2 != null) {
            return webView2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        return null;
    }

    public final void goForward() {
        if (getWebView().canGoForward()) {
            getWebView().goForward();
        }
    }

    public final void goback() {
        if (getWebView().canGoBack()) {
            getWebView().goBack();
        }
    }

    @NotNull
    public abstract WebView initWebView();

    @NotNull
    public abstract WebViewClient initWebViewClient();

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        setWebView(initWebView());
        configWebView();
    }

    public final void loadData(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "data");
        Intrinsics.checkNotNullParameter(str2, "mimeType");
        getWebView().loadData(str, str2, str3);
    }

    public final void loadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        getWebView().loadUrl(str);
    }

    public void moreWebSettings(@NotNull WebSettings webSettings) {
        Intrinsics.checkNotNullParameter(webSettings, HtmlPaths.DEVICE_SETTINGS);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void postUrl(@NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(bArr, "postData");
        getWebView().postUrl(str, bArr);
    }

    public final void setWebView(@NotNull WebView webView2) {
        Intrinsics.checkNotNullParameter(webView2, "<set-?>");
        this.webView = webView2;
    }

    @SuppressLint({"JavascriptInterface"})
    public final void wAddJavascriptInterface(@NotNull Object obj, @NotNull String str) {
        Intrinsics.checkNotNullParameter(obj, "any");
        Intrinsics.checkNotNullParameter(str, "interfaceName");
        getWebView().addJavascriptInterface(obj, str);
    }

    public final void wClearCache(boolean z) {
        getWebView().clearCache(z);
    }

    public final void wClearHistory() {
        getWebView().clearHistory();
    }

    public final void wOnPause() {
        getWebView().onPause();
    }

    public final void wOnResume() {
        getWebView().onResume();
    }

    public final void loadData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "data");
        loadData(str, "text/html; charset=UTF-8", (String) null);
    }

    public final void loadUrl(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(map, "conditionHeaders");
        getWebView().loadUrl(str, map);
    }
}
