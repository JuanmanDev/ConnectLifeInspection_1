package com.internationalwinecooler.p529ui.webview;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/internationalwinecooler/ui/webview/BaseWineWebViewActivity$initWebViewClient$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$initWebViewClient$1 */
/* compiled from: BaseWineWebViewActivity.kt */
public final class BaseWineWebViewActivity$initWebViewClient$1 extends WebViewClient {
    public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(str, "url");
        if (!StringsKt__StringsJVMKt.startsWith$default(str, "http://", false, 2, (Object) null) && !StringsKt__StringsJVMKt.startsWith$default(str, "https://", false, 2, (Object) null)) {
            return false;
        }
        webView.loadUrl(str);
        return true;
    }
}
