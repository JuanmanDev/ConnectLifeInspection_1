package com.internationalwinecooler.p529ui.webview;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/internationalwinecooler/ui/webview/VivinoWebViewActivity$initClient$1", "Landroid/webkit/WebChromeClient;", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.VivinoWebViewActivity$initClient$1 */
/* compiled from: VivinoWebViewActivity.kt */
public final class VivinoWebViewActivity$initClient$1 extends WebChromeClient {
    public final /* synthetic */ VivinoWebViewActivity this$0;

    public VivinoWebViewActivity$initClient$1(VivinoWebViewActivity vivinoWebViewActivity) {
        this.this$0 = vivinoWebViewActivity;
    }

    public void onProgressChanged(@Nullable WebView webView, int i) {
        ((ProgressBar) this.this$0._$_findCachedViewById(R$id.vivino_progress)).setProgress(i);
        if (100 == i) {
            ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(R$id.vivino_progress);
            Intrinsics.checkNotNullExpressionValue(progressBar, "vivino_progress");
            progressBar.setVisibility(8);
        }
    }
}
