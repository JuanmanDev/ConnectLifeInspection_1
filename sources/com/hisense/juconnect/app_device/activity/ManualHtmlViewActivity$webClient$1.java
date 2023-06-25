package com.hisense.juconnect.app_device.activity;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/ManualHtmlViewActivity$webClient$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ManualHtmlViewActivity.kt */
public final class ManualHtmlViewActivity$webClient$1 extends WebViewClient {
    public final /* synthetic */ ManualHtmlViewActivity this$0;

    public ManualHtmlViewActivity$webClient$1(ManualHtmlViewActivity manualHtmlViewActivity) {
        this.this$0 = manualHtmlViewActivity;
    }

    public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
        this.this$0.getTAG();
        Intrinsics.stringPlus("url is ", str);
        return false;
    }
}
