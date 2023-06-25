package com.internationalwinecooler.p529ui.webview;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertDialog;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseWebViewActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p492g.C7621a;
import p040c.p482v.p483a.p492g.C7635o;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0017"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/VivinoWebViewActivity;", "Lcom/hisense/connect_life/core/base/BaseWebViewActivity;", "()V", "vivinoId", "", "getVivinoId", "()Ljava/lang/String;", "setVivinoId", "(Ljava/lang/String;)V", "bindLayout", "", "checkisValid", "", "url", "gotoVivino", "initClient", "initWebView", "Landroid/webkit/WebView;", "initWebViewClient", "Landroid/webkit/WebViewClient;", "initWidgets", "setListeners", "showDialog", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/VivinoWebViewActivity")
/* renamed from: com.internationalwinecooler.ui.webview.VivinoWebViewActivity */
/* compiled from: VivinoWebViewActivity.kt */
public class VivinoWebViewActivity extends BaseWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "vivinoId")
    public String vivinoId;

    private final void checkisValid(String str) {
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        if (!queryIntentActivities.isEmpty()) {
            showDialog(str);
        }
    }

    private final void gotoVivino(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    private final void initClient() {
        ((WebView) _$_findCachedViewById(R$id.vivino_webview)).setWebChromeClient(new VivinoWebViewActivity$initClient$1(this));
    }

    private final void showDialog(String str) {
        AlertDialog create = new AlertDialog.Builder(this).setIcon((int) R.mipmap.hisense_launcher).setTitle((int) R.string.warning).setMessage((int) R.string.whether_to_jump_vivino).setPositiveButton((int) R.string.key_confirm_upper, (DialogInterface.OnClickListener) new C7635o(this, str)).setNegativeButton((int) R.string.camera_cancel, (DialogInterface.OnClickListener) C7621a.f14354e).create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        create.show();
    }

    /* renamed from: showDialog$lambda-0  reason: not valid java name */
    public static final void m27223showDialog$lambda0(VivinoWebViewActivity vivinoWebViewActivity, String str, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(vivinoWebViewActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, "$url");
        vivinoWebViewActivity.gotoVivino(str);
        dialogInterface.dismiss();
    }

    /* renamed from: showDialog$lambda-1  reason: not valid java name */
    public static final void m27224showDialog$lambda1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
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
        return R.layout.activity_vivino_web_view;
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
    public WebView initWebView() {
        WebView webView = (WebView) _$_findCachedViewById(R$id.vivino_webview);
        Intrinsics.checkNotNullExpressionValue(webView, "vivino_webview");
        return webView;
    }

    @NotNull
    public WebViewClient initWebViewClient() {
        return new VivinoWebViewActivity$initWebViewClient$1();
    }

    public void initWidgets() {
        super.initWidgets();
        initClient();
        ((WebView) _$_findCachedViewById(R$id.vivino_webview)).loadUrl(Intrinsics.stringPlus("https://www.vivino.com/wines/", getVivinoId()));
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.vivino_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "vivino_back");
        JuConnectExtKt.singleClickListener(iconFontView, new VivinoWebViewActivity$setListeners$1(this));
    }

    public final void setVivinoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vivinoId = str;
    }
}
