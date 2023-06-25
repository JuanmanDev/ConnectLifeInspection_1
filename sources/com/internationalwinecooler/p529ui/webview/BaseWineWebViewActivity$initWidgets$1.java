package com.internationalwinecooler.p529ui.webview;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p040c.p525z.p526a.C7820f;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/internationalwinecooler/ui/webview/BaseWineWebViewActivity$initWidgets$1", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$initWidgets$1 */
/* compiled from: BaseWineWebViewActivity.kt */
public final class BaseWineWebViewActivity$initWidgets$1 extends WebChromeClient {
    public boolean onConsoleMessage(@Nullable ConsoleMessage consoleMessage) {
        C7820f.m21850d(Intrinsics.stringPlus("onConsoleMessage: ", consoleMessage == null ? null : consoleMessage.message()), new Object[0]);
        return super.onConsoleMessage(consoleMessage);
    }
}
