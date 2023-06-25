package com.hisense.juconnect.app_device.activity;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7519s0;

@Metadata(mo47990d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0007R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u000bR\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ManualHtmlViewActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "manualName", "getManualName", "setManualName", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "webClient", "com/hisense/juconnect/app_device/activity/ManualHtmlViewActivity$webClient$1", "Lcom/hisense/juconnect/app_device/activity/ManualHtmlViewActivity$webClient$1;", "bindLayout", "", "initWidgets", "", "onDestroy", "setListeners", "setWebViewConfigure", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/ManualHtmlViewActivity")
/* compiled from: ManualHtmlViewActivity.kt */
public final class ManualHtmlViewActivity extends BaseActivity {
    public final String TAG = ManualHtmlViewActivity.class.getSimpleName();
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "manual_name")
    public String manualName;
    @Autowired(name = "url")
    public String url;
    @NotNull
    public final ManualHtmlViewActivity$webClient$1 webClient = new ManualHtmlViewActivity$webClient$1(this);

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final boolean m27117setListeners$lambda0(ManualHtmlViewActivity manualHtmlViewActivity, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(manualHtmlViewActivity, "this$0");
        if ((i != 0 && i != 3) || keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        WebView webView = (WebView) manualHtmlViewActivity._$_findCachedViewById(R$id.web_view);
        if (webView != null) {
            webView.findNext(true);
        }
        return true;
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
        return R$layout.activity_native_html_web_view;
    }

    @NotNull
    public final String getManualName() {
        String str = this.manualName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("manualName");
        return null;
    }

    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("url");
        return null;
    }

    public void initWidgets() {
        setWebViewConfigure();
        ((TextView) _$_findCachedViewById(R$id.tv_title)).setText(getManualName());
        if (StringsKt__StringsKt.contains$default((CharSequence) getUrl(), (CharSequence) ".pdf", false, 2, (Object) null)) {
            ((WebView) _$_findCachedViewById(R$id.web_view)).loadUrl(Intrinsics.stringPlus("file:///android_asset/pdfjs/PdfIndex.html?", getUrl()));
        } else {
            ((WebView) _$_findCachedViewById(R$id.web_view)).loadUrl(getUrl());
        }
        EditText editText = (EditText) _$_findCachedViewById(R$id.search_text_input);
        if (editText != null) {
            editText.setHint(getString(R$string.search));
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
        JuConnectExtKt.singleClickListener(textView, new ManualHtmlViewActivity$setListeners$1(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.search_text_input);
        if (editText != null) {
            editText.addTextChangedListener(new ManualHtmlViewActivity$setListeners$2(this));
        }
        ((EditText) _$_findCachedViewById(R$id.search_text_input)).setOnEditorActionListener(new C7519s0(this));
    }

    public final void setManualName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.manualName = str;
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
