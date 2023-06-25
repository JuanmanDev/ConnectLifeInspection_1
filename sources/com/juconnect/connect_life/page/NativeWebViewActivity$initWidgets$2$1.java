package com.juconnect.connect_life.page;

import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.core.utils.DialogManager;
import com.juconnect.connect_life.R$id;
import com.juconnect.connect_life.model.FirmwareManualsInfo;
import com.juconnect.connect_life.model.FirmwareManualsInfoItem;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p077d.p078a.p080j.C1564e;
import p040c.p301y.p508a.p511u.C7730b;

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo47991d2 = {"com/juconnect/connect_life/page/NativeWebViewActivity$initWidgets$2$1", "Lokhttp3/Callback;", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NativeWebViewActivity.kt */
public final class NativeWebViewActivity$initWidgets$2$1 implements Callback {
    public final /* synthetic */ NativeWebViewActivity this$0;

    public NativeWebViewActivity$initWidgets$2$1(NativeWebViewActivity nativeWebViewActivity) {
        this.this$0 = nativeWebViewActivity;
    }

    /* renamed from: onResponse$lambda-0  reason: not valid java name */
    public static final void m27241onResponse$lambda0(NativeWebViewActivity nativeWebViewActivity, String str) {
        Intrinsics.checkNotNullParameter(nativeWebViewActivity, "this$0");
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = nativeWebViewActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.dismissDialog(supportFragmentManager, "tag_loading_aty");
        Object d = C1502i.m924d(str, FirmwareManualsInfo.class);
        Intrinsics.checkNotNullExpressionValue(d, "fromJson<FirmwareManuals…                        )");
        FirmwareManualsInfo firmwareManualsInfo = (FirmwareManualsInfo) d;
        if (firmwareManualsInfo.size() > 0) {
            ((FirmwareManualsInfoItem) firmwareManualsInfo.get(0)).getUrl();
            ((WebView) nativeWebViewActivity._$_findCachedViewById(R$id.web_view)).loadUrl(Intrinsics.stringPlus("file:///android_asset/pdfjs/PdfIndex.html?", ((FirmwareManualsInfoItem) firmwareManualsInfo.get(0)).getUrl()));
        }
    }

    public void onFailure(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(iOException, C1564e.f893u);
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.dismissDialog(supportFragmentManager, "tag_loading_aty");
    }

    public void onResponse(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        ResponseBody body = response.body();
        String string = body == null ? null : body.string();
        NativeWebViewActivity nativeWebViewActivity = this.this$0;
        nativeWebViewActivity.runOnUiThread(new C7730b(nativeWebViewActivity, string));
    }
}
