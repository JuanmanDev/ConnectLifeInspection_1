package p040c.p313b0.p314a.p319i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import androidx.navigation.NavInflater;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.R$style;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p313b0.p314a.C4205j;
import p040c.p313b0.p314a.C4221o;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: c.b0.a.i.e */
/* compiled from: InAppWebViewChromeClient */
public class C4176e extends WebChromeClient implements C9024l.C9025a, InAppBrowserActivity.C8769g {

    /* renamed from: s */
    public static Map<Integer, Message> f8800s = new HashMap();

    /* renamed from: t */
    public static int f8801t = 0;

    /* renamed from: u */
    public static final FrameLayout.LayoutParams f8802u = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: e */
    public C4171c f8803e;

    /* renamed from: l */
    public InAppBrowserActivity f8804l;

    /* renamed from: m */
    public C9017j f8805m;

    /* renamed from: n */
    public Uri f8806n;

    /* renamed from: o */
    public View f8807o;

    /* renamed from: p */
    public WebChromeClient.CustomViewCallback f8808p;

    /* renamed from: q */
    public int f8809q;

    /* renamed from: r */
    public int f8810r;

    /* renamed from: c.b0.a.i.e$a */
    /* compiled from: InAppWebViewChromeClient */
    public class C4177a implements DialogInterface.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ JsPromptResult f8811e;

        public C4177a(C4176e eVar, JsPromptResult jsPromptResult) {
            this.f8811e = jsPromptResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8811e.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$b */
    /* compiled from: InAppWebViewChromeClient */
    public class C4178b implements DialogInterface.OnCancelListener {

        /* renamed from: e */
        public final /* synthetic */ JsPromptResult f8812e;

        public C4178b(C4176e eVar, JsPromptResult jsPromptResult) {
            this.f8812e = jsPromptResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f8812e.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$c */
    /* compiled from: InAppWebViewChromeClient */
    public class C4179c implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ JsResult f8813a;

        /* renamed from: b */
        public final /* synthetic */ WebView f8814b;

        /* renamed from: c */
        public final /* synthetic */ String f8815c;

        public C4179c(JsResult jsResult, WebView webView, String str) {
            this.f8813a = jsResult;
            this.f8814b = webView;
            this.f8815c = str;
        }

        public void error(String str, String str2, Object obj) {
            str + ", " + str2;
            this.f8813a.cancel();
        }

        public void notImplemented() {
            C4176e.this.mo25542h(this.f8814b, this.f8815c, this.f8813a, (String) null, (String) null, (String) null);
        }

        public void success(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj != null) {
                Map map = (Map) obj;
                String str4 = (String) map.get("message");
                String str5 = (String) map.get("confirmButtonTitle");
                String str6 = (String) map.get("cancelButtonTitle");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool == null || !bool.booleanValue()) {
                    str3 = str4;
                    str2 = str5;
                    str = str6;
                } else {
                    Integer num = (Integer) map.get(NavInflater.TAG_ACTION);
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        this.f8813a.cancel();
                        return;
                    } else {
                        this.f8813a.confirm();
                        return;
                    }
                }
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C4176e.this.mo25540g(this.f8814b, this.f8815c, this.f8813a, str3, str2, str);
        }
    }

    /* renamed from: c.b0.a.i.e$d */
    /* compiled from: InAppWebViewChromeClient */
    public class C4180d implements DialogInterface.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8817e;

        public C4180d(C4176e eVar, JsResult jsResult) {
            this.f8817e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8817e.confirm();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$e */
    /* compiled from: InAppWebViewChromeClient */
    public class C4181e implements DialogInterface.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8818e;

        public C4181e(C4176e eVar, JsResult jsResult) {
            this.f8818e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8818e.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$f */
    /* compiled from: InAppWebViewChromeClient */
    public class C4182f implements DialogInterface.OnCancelListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8819e;

        public C4182f(C4176e eVar, JsResult jsResult) {
            this.f8819e = jsResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f8819e.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$g */
    /* compiled from: InAppWebViewChromeClient */
    public class C4183g implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ int f8820a;

        public C4183g(C4176e eVar, int i) {
            this.f8820a = i;
        }

        public void error(String str, @Nullable String str2, @Nullable Object obj) {
            if (C4176e.f8800s.containsKey(Integer.valueOf(this.f8820a))) {
                C4176e.f8800s.remove(Integer.valueOf(this.f8820a));
            }
        }

        public void notImplemented() {
            if (C4176e.f8800s.containsKey(Integer.valueOf(this.f8820a))) {
                C4176e.f8800s.remove(Integer.valueOf(this.f8820a));
            }
        }

        public void success(@Nullable Object obj) {
            if (!(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) && C4176e.f8800s.containsKey(Integer.valueOf(this.f8820a))) {
                C4176e.f8800s.remove(Integer.valueOf(this.f8820a));
            }
        }
    }

    /* renamed from: c.b0.a.i.e$h */
    /* compiled from: InAppWebViewChromeClient */
    public class C4184h implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ GeolocationPermissions.Callback f8821a;

        /* renamed from: b */
        public final /* synthetic */ String f8822b;

        public C4184h(C4176e eVar, GeolocationPermissions.Callback callback, String str) {
            this.f8821a = callback;
            this.f8822b = str;
        }

        public void error(String str, String str2, Object obj) {
            this.f8821a.invoke(this.f8822b, false, false);
        }

        public void notImplemented() {
            this.f8821a.invoke(this.f8822b, false, false);
        }

        public void success(Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                this.f8821a.invoke((String) map.get(EventBusConstKt.ORIGIN), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
            } else {
                this.f8821a.invoke(this.f8822b, false, false);
            }
        }
    }

    /* renamed from: c.b0.a.i.e$i */
    /* compiled from: InAppWebViewChromeClient */
    public class C4185i implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ PermissionRequest f8823a;

        public C4185i(C4176e eVar, PermissionRequest permissionRequest) {
            this.f8823a = permissionRequest;
        }

        public void error(String str, String str2, Object obj) {
            str + ", " + str2;
        }

        public void notImplemented() {
            this.f8823a.deny();
        }

        public void success(Object obj) {
            if (obj != null) {
                Map map = (Map) obj;
                Integer num = (Integer) map.get(NavInflater.TAG_ACTION);
                List list = (List) map.get("resources");
                if (list == null) {
                    list = new ArrayList();
                }
                String[] strArr = (String[]) list.toArray(new String[list.size()]);
                if (num != null) {
                    if (num.intValue() != 1) {
                        this.f8823a.deny();
                        return;
                    } else {
                        this.f8823a.grant(strArr);
                        return;
                    }
                }
            }
            this.f8823a.deny();
        }
    }

    /* renamed from: c.b0.a.i.e$j */
    /* compiled from: InAppWebViewChromeClient */
    public class C4186j implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ JsResult f8824a;

        /* renamed from: b */
        public final /* synthetic */ WebView f8825b;

        /* renamed from: c */
        public final /* synthetic */ String f8826c;

        public C4186j(JsResult jsResult, WebView webView, String str) {
            this.f8824a = jsResult;
            this.f8825b = webView;
            this.f8826c = str;
        }

        public void error(String str, String str2, Object obj) {
            str + ", " + str2;
            this.f8824a.cancel();
        }

        public void notImplemented() {
            C4176e.this.mo25539f(this.f8825b, this.f8826c, this.f8824a, (String) null, (String) null);
        }

        public void success(Object obj) {
            String str;
            String str2;
            if (obj != null) {
                Map map = (Map) obj;
                String str3 = (String) map.get("message");
                String str4 = (String) map.get("confirmButtonTitle");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool == null || !bool.booleanValue()) {
                    str2 = str3;
                    str = str4;
                } else {
                    Integer num = (Integer) map.get(NavInflater.TAG_ACTION);
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        this.f8824a.cancel();
                        return;
                    } else {
                        this.f8824a.confirm();
                        return;
                    }
                }
            } else {
                str2 = null;
                str = null;
            }
            C4176e.this.mo25539f(this.f8825b, this.f8826c, this.f8824a, str2, str);
        }
    }

    /* renamed from: c.b0.a.i.e$k */
    /* compiled from: InAppWebViewChromeClient */
    public class C4187k implements DialogInterface.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8828e;

        public C4187k(C4176e eVar, JsResult jsResult) {
            this.f8828e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8828e.confirm();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$l */
    /* compiled from: InAppWebViewChromeClient */
    public class C4188l implements DialogInterface.OnCancelListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8829e;

        public C4188l(C4176e eVar, JsResult jsResult) {
            this.f8829e = jsResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f8829e.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$m */
    /* compiled from: InAppWebViewChromeClient */
    public class C4189m implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ JsResult f8830a;

        /* renamed from: b */
        public final /* synthetic */ WebView f8831b;

        /* renamed from: c */
        public final /* synthetic */ String f8832c;

        public C4189m(JsResult jsResult, WebView webView, String str) {
            this.f8830a = jsResult;
            this.f8831b = webView;
            this.f8832c = str;
        }

        public void error(String str, String str2, Object obj) {
            str + ", " + str2;
            this.f8830a.cancel();
        }

        public void notImplemented() {
            C4176e.this.mo25542h(this.f8831b, this.f8832c, this.f8830a, (String) null, (String) null, (String) null);
        }

        public void success(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj != null) {
                Map map = (Map) obj;
                String str4 = (String) map.get("message");
                String str5 = (String) map.get("confirmButtonTitle");
                String str6 = (String) map.get("cancelButtonTitle");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool == null || !bool.booleanValue()) {
                    str3 = str4;
                    str2 = str5;
                    str = str6;
                } else {
                    Integer num = (Integer) map.get(NavInflater.TAG_ACTION);
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        this.f8830a.cancel();
                        return;
                    } else {
                        this.f8830a.confirm();
                        return;
                    }
                }
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C4176e.this.mo25542h(this.f8831b, this.f8832c, this.f8830a, str3, str2, str);
        }
    }

    /* renamed from: c.b0.a.i.e$n */
    /* compiled from: InAppWebViewChromeClient */
    public class C4190n implements DialogInterface.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8834e;

        public C4190n(C4176e eVar, JsResult jsResult) {
            this.f8834e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8834e.confirm();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$o */
    /* compiled from: InAppWebViewChromeClient */
    public class C4191o implements DialogInterface.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8835e;

        public C4191o(C4176e eVar, JsResult jsResult) {
            this.f8835e = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8835e.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$p */
    /* compiled from: InAppWebViewChromeClient */
    public class C4192p implements DialogInterface.OnCancelListener {

        /* renamed from: e */
        public final /* synthetic */ JsResult f8836e;

        public C4192p(C4176e eVar, JsResult jsResult) {
            this.f8836e = jsResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f8836e.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: c.b0.a.i.e$q */
    /* compiled from: InAppWebViewChromeClient */
    public class C4193q implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ JsPromptResult f8837a;

        /* renamed from: b */
        public final /* synthetic */ WebView f8838b;

        /* renamed from: c */
        public final /* synthetic */ String f8839c;

        /* renamed from: d */
        public final /* synthetic */ String f8840d;

        public C4193q(JsPromptResult jsPromptResult, WebView webView, String str, String str2) {
            this.f8837a = jsPromptResult;
            this.f8838b = webView;
            this.f8839c = str;
            this.f8840d = str2;
        }

        public void error(String str, String str2, Object obj) {
            str + ", " + str2;
            this.f8837a.cancel();
        }

        public void notImplemented() {
            C4176e.this.mo25543i(this.f8838b, this.f8839c, this.f8840d, this.f8837a, (String) null, (String) null, (String) null, (String) null, (String) null);
        }

        public void success(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj != null) {
                Map map = (Map) obj;
                String str6 = (String) map.get("message");
                String str7 = (String) map.get("defaultValue");
                String str8 = (String) map.get("confirmButtonTitle");
                String str9 = (String) map.get("cancelButtonTitle");
                String str10 = (String) map.get("value");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool == null || !bool.booleanValue()) {
                    str5 = str6;
                    str4 = str7;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                } else {
                    Integer num = (Integer) map.get(NavInflater.TAG_ACTION);
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        this.f8837a.cancel();
                        return;
                    } else {
                        this.f8837a.confirm(str10);
                        return;
                    }
                }
            } else {
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            C4176e.this.mo25543i(this.f8838b, this.f8839c, this.f8840d, this.f8837a, str5, str4, str3, str2, str);
        }
    }

    /* renamed from: c.b0.a.i.e$r */
    /* compiled from: InAppWebViewChromeClient */
    public class C4194r implements DialogInterface.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ EditText f8842e;

        /* renamed from: l */
        public final /* synthetic */ JsPromptResult f8843l;

        /* renamed from: m */
        public final /* synthetic */ String f8844m;

        public C4194r(C4176e eVar, EditText editText, JsPromptResult jsPromptResult, String str) {
            this.f8842e = editText;
            this.f8843l = jsPromptResult;
            this.f8844m = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f8842e.getText().toString();
            JsPromptResult jsPromptResult = this.f8843l;
            String str = this.f8844m;
            if (str != null) {
                obj = str;
            }
            jsPromptResult.confirm(obj);
            dialogInterface.dismiss();
        }
    }

    public C4176e(Object obj) {
        if (obj instanceof InAppBrowserActivity) {
            InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) obj;
            this.f8804l = inAppBrowserActivity;
            inAppBrowserActivity.f16785w.add(this);
        } else if (obj instanceof C4171c) {
            this.f8803e = (C4171c) obj;
        }
        InAppBrowserActivity inAppBrowserActivity2 = this.f8804l;
        this.f8805m = inAppBrowserActivity2 != null ? inAppBrowserActivity2.f16773e : this.f8803e.f8794l;
        C9024l.C9027c cVar = C4221o.f8994b;
        if (cVar != null) {
            cVar.mo46296a(this);
        } else {
            C4221o.f8997e.mo46415a(this);
        }
    }

    /* renamed from: a */
    public boolean mo20939a(int i, int i2, Intent intent) {
        Uri uri;
        if (C4205j.f8969s == null && C4205j.f8968r == null) {
            return true;
        }
        if (i != 1) {
            if (i == 3) {
                if (i2 != -1) {
                    uri = null;
                } else {
                    uri = intent == null ? this.f8806n : intent.getData();
                }
                C4205j.f8968r.onReceiveValue(uri);
            }
        } else if (i2 != -1) {
            ValueCallback<Uri[]> valueCallback = C4205j.f8969s;
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
            }
        } else {
            Uri[] r = mo25570r(intent, i2);
            if (r != null) {
                C4205j.f8969s.onReceiveValue(r);
            } else {
                C4205j.f8969s.onReceiveValue(new Uri[]{this.f8806n});
            }
        }
        C4205j.f8969s = null;
        C4205j.f8968r = null;
        this.f8806n = null;
        return true;
    }

    /* renamed from: b */
    public final Boolean mo25536b(String[] strArr) {
        String[] k = mo25545k(strArr);
        return Boolean.valueOf(mo25572t(k).booleanValue() || mo25538e(k, "image").booleanValue());
    }

    /* renamed from: d */
    public final Boolean mo25537d(String[] strArr) {
        String[] k = mo25545k(strArr);
        return Boolean.valueOf(mo25572t(k).booleanValue() || mo25538e(k, "video").booleanValue());
    }

    /* renamed from: e */
    public final Boolean mo25538e(String[] strArr, String str) {
        for (String contains : strArr) {
            if (contains.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: f */
    public void mo25539f(WebView webView, String str, JsResult jsResult, String str2, String str3) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        C4187k kVar = new C4187k(this, jsResult);
        Context context = this.f8804l;
        if (context == null) {
            context = C4221o.f8998f;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R$style.Theme_AppCompat_Dialog_Alert);
        builder.setMessage((CharSequence) str);
        if (str3 == null || str3.isEmpty()) {
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) kVar);
        } else {
            builder.setPositiveButton((CharSequence) str3, (DialogInterface.OnClickListener) kVar);
        }
        builder.setOnCancelListener(new C4188l(this, jsResult));
        builder.create().show();
    }

    /* renamed from: g */
    public void mo25540g(WebView webView, String str, JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        C4180d dVar = new C4180d(this, jsResult);
        C4181e eVar = new C4181e(this, jsResult);
        Context context = this.f8804l;
        if (context == null) {
            context = C4221o.f8998f;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R$style.Theme_AppCompat_Dialog_Alert);
        builder.setMessage((CharSequence) str);
        if (str3 == null || str3.isEmpty()) {
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) dVar);
        } else {
            builder.setPositiveButton((CharSequence) str3, (DialogInterface.OnClickListener) dVar);
        }
        if (str4 == null || str4.isEmpty()) {
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) eVar);
        } else {
            builder.setNegativeButton((CharSequence) str4, (DialogInterface.OnClickListener) eVar);
        }
        builder.setOnCancelListener(new C4182f(this, jsResult));
        builder.create().show();
    }

    public Bitmap getDefaultVideoPoster() {
        if (this.f8807o == null) {
            return null;
        }
        Activity activity = this.f8804l;
        if (activity == null) {
            activity = C4221o.f8998f;
        }
        return BitmapFactory.decodeResource(activity.getApplicationContext().getResources(), 2130837573);
    }

    /* renamed from: h */
    public void mo25542h(WebView webView, String str, JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        C4190n nVar = new C4190n(this, jsResult);
        C4191o oVar = new C4191o(this, jsResult);
        Context context = this.f8804l;
        if (context == null) {
            context = C4221o.f8998f;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R$style.Theme_AppCompat_Dialog_Alert);
        builder.setMessage((CharSequence) str);
        if (str3 == null || str3.isEmpty()) {
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) nVar);
        } else {
            builder.setPositiveButton((CharSequence) str3, (DialogInterface.OnClickListener) nVar);
        }
        if (str4 == null || str4.isEmpty()) {
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) oVar);
        } else {
            builder.setNegativeButton((CharSequence) str4, (DialogInterface.OnClickListener) oVar);
        }
        builder.setOnCancelListener(new C4192p(this, jsResult));
        builder.create().show();
    }

    /* renamed from: i */
    public void mo25543i(WebView webView, String str, String str2, JsPromptResult jsPromptResult, String str3, String str4, String str5, String str6, String str7) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (str4 != null && !str4.isEmpty()) {
            str2 = str4;
        }
        editText.setText(str2);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView(editText);
        if (str3 != null && !str3.isEmpty()) {
            str = str3;
        }
        C4194r rVar = new C4194r(this, editText, jsPromptResult, str5);
        C4177a aVar = new C4177a(this, jsPromptResult);
        Context context = this.f8804l;
        if (context == null) {
            context = C4221o.f8998f;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R$style.Theme_AppCompat_Dialog_Alert);
        builder.setMessage((CharSequence) str);
        if (str7 == null || str7.isEmpty()) {
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) rVar);
        } else {
            builder.setPositiveButton((CharSequence) str7, (DialogInterface.OnClickListener) rVar);
        }
        if (str6 == null || str6.isEmpty()) {
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) aVar);
        } else {
            builder.setNegativeButton((CharSequence) str6, (DialogInterface.OnClickListener) aVar);
        }
        builder.setOnCancelListener(new C4178b(this, jsPromptResult));
        AlertDialog create = builder.create();
        create.setView(frameLayout);
        create.show();
    }

    /* renamed from: j */
    public void mo25544j() {
        this.f8805m.mo46575e((C9017j.C9021c) null);
        C8950c cVar = C4221o.f8997e;
        if (cVar != null) {
            cVar.mo46420e(this);
        }
        if (this.f8804l != null) {
            this.f8804l = null;
        }
        if (this.f8803e != null) {
            this.f8803e = null;
        }
    }

    /* renamed from: k */
    public final String[] mo25545k(String[] strArr) {
        if (mo25572t(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                strArr2[i] = mo25548n(str.replace(MAPCookie.DOT, ""));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File mo25546l(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            boolean r0 = r7.equals(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES
            java.lang.String r7 = "image-"
            java.lang.String r0 = ".jpg"
        L_0x0010:
            r5 = r1
            r1 = r7
            r7 = r5
            goto L_0x0025
        L_0x0014:
            java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0023
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES
            java.lang.String r7 = "video-"
            java.lang.String r0 = ".mp4"
            goto L_0x0010
        L_0x0023:
            r7 = r1
            r0 = r7
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L_0x004f
            java.io.File r7 = android.os.Environment.getExternalStoragePublicDirectory(r7)
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r1)
            return r0
        L_0x004f:
            com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity r7 = r6.f8804l
            if (r7 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            android.app.Activity r7 = p040c.p313b0.p314a.C4221o.f8998f
        L_0x0056:
            android.content.Context r7 = r7.getApplicationContext()
            r2 = 0
            java.io.File r7 = r7.getExternalFilesDir(r2)
            java.io.File r7 = java.io.File.createTempFile(r1, r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.p319i.C4176e.mo25546l(java.lang.String):java.io.File");
    }

    @RequiresApi(api = 19)
    /* renamed from: m */
    public final Intent mo25547m(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", mo25545k(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    /* renamed from: n */
    public final String mo25548n(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    /* renamed from: o */
    public final Uri mo25549o(String str) {
        File file;
        try {
            file = mo25546l(str);
        } catch (IOException e) {
            e.printStackTrace();
            file = null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        Activity activity = this.f8804l;
        if (activity == null) {
            activity = C4221o.f8998f;
        }
        String packageName = activity.getApplicationContext().getPackageName();
        Context applicationContext = activity.getApplicationContext();
        return FileProvider.getUriForFile(applicationContext, packageName + MAPCookie.DOT + "flutter_inappwebview.fileprovider", file);
    }

    public void onCloseWindow(WebView webView) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        this.f8805m.mo46573c("onCloseWindow", hashMap);
        super.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("message", consoleMessage.message());
        hashMap.put("messageLevel", Integer.valueOf(consoleMessage.messageLevel().ordinal()));
        this.f8805m.mo46573c("onConsoleMessage", hashMap);
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        int i = f8801t + 1;
        f8801t = i;
        String extra = webView.getHitTestResult().getExtra();
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", extra);
        hashMap.put("windowId", Integer.valueOf(i));
        hashMap.put("androidIsDialog", Boolean.valueOf(z));
        hashMap.put("androidIsUserGesture", Boolean.valueOf(z2));
        hashMap.put("iosWKNavigationType", (Object) null);
        hashMap.put("iosIsForMainFrame", (Object) null);
        f8800s.put(Integer.valueOf(i), message);
        this.f8805m.mo46574d("onCreateWindow", hashMap, new C4183g(this, i));
        return true;
    }

    public void onGeolocationPermissionsHidePrompt() {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        this.f8805m.mo46573c("onGeolocationPermissionsHidePrompt", hashMap);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put(EventBusConstKt.ORIGIN, str);
        this.f8805m.mo46574d("onGeolocationPermissionsShowPrompt", hashMap, new C4184h(this, callback, str));
    }

    public void onHideCustomView() {
        Activity activity = this.f8804l;
        if (activity == null) {
            activity = C4221o.f8998f;
        }
        ViewGroup q = mo25569q();
        ((FrameLayout) q).removeView(this.f8807o);
        this.f8807o = null;
        q.setSystemUiVisibility(this.f8810r);
        activity.setRequestedOrientation(this.f8809q);
        this.f8808p.onCustomViewHidden();
        this.f8808p = null;
        activity.getWindow().clearFlags(512);
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        this.f8805m.mo46573c("onExitFullscreen", hashMap);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("iosIsMainFrame", (Object) null);
        this.f8805m.mo46574d("onJsAlert", hashMap, new C4186j(jsResult, webView, str2));
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("iosIsMainFrame", (Object) null);
        this.f8805m.mo46574d("onJsBeforeUnload", hashMap, new C4179c(jsResult, webView, str2));
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("iosIsMainFrame", (Object) null);
        this.f8805m.mo46574d("onJsConfirm", hashMap, new C4189m(jsResult, webView, str2));
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("defaultValue", str3);
        hashMap.put("iosIsMainFrame", (Object) null);
        this.f8805m.mo46574d("onJsPrompt", hashMap, new C4193q(jsPromptResult, webView, str2, str3));
        return true;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        if (Build.VERSION.SDK_INT >= 23) {
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = this.f8804l;
            if (inAppBrowserActivity != null) {
                hashMap.put("uuid", inAppBrowserActivity.f16775m);
            }
            hashMap.put(EventBusConstKt.ORIGIN, permissionRequest.getOrigin().toString());
            hashMap.put("resources", Arrays.asList(permissionRequest.getResources()));
            this.f8805m.mo46574d("onPermissionRequest", hashMap, new C4185i(this, permissionRequest));
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        ProgressBar progressBar;
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (!(inAppBrowserActivity == null || (progressBar = inAppBrowserActivity.f16782t) == null)) {
            progressBar.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f8804l.f16782t.setProgress(i, true);
            } else {
                this.f8804l.f16782t.setProgress(i);
            }
            if (i == 100) {
                this.f8804l.f16782t.setVisibility(8);
            }
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.f8804l;
        if (inAppBrowserActivity2 != null) {
            hashMap.put("uuid", inAppBrowserActivity2.f16775m);
        }
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(i));
        this.f8805m.mo46573c("onProgressChanged", hashMap);
        super.onProgressChanged(webView, i);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            String message = e.getMessage();
        }
        bitmap.recycle();
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("icon", byteArrayOutputStream.toByteArray());
        this.f8805m.mo46573c("onReceivedIcon", hashMap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (!(inAppBrowserActivity == null || inAppBrowserActivity.f16777o == null || !inAppBrowserActivity.f16780r.f8783d.isEmpty())) {
            this.f8804l.f16777o.setTitle((CharSequence) str);
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity2 = this.f8804l;
        if (inAppBrowserActivity2 != null) {
            hashMap.put("uuid", inAppBrowserActivity2.f16775m);
        }
        hashMap.put(NotificationCompatJellybean.KEY_TITLE, str);
        this.f8805m.mo46573c("onTitleChanged", hashMap);
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", str);
        hashMap.put("precomposed", Boolean.valueOf(z));
        this.f8805m.mo46573c("onReceivedTouchIconUrl", hashMap);
    }

    public void onRequestFocus(WebView webView) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        this.f8805m.mo46573c("onRequestFocus", hashMap);
        super.onCloseWindow(webView);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f8807o != null) {
            onHideCustomView();
            return;
        }
        Activity activity = this.f8804l;
        if (activity == null) {
            activity = C4221o.f8998f;
        }
        ViewGroup q = mo25569q();
        this.f8807o = view;
        this.f8810r = q.getSystemUiVisibility();
        this.f8809q = activity.getRequestedOrientation();
        this.f8808p = customViewCallback;
        this.f8807o.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (Build.VERSION.SDK_INT >= 19) {
            q.setSystemUiVisibility(7942);
        } else {
            q.setSystemUiVisibility(1798);
        }
        activity.getWindow().setFlags(512, 512);
        ((FrameLayout) q).addView(this.f8807o, f8802u);
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f8804l;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        this.f8805m.mo46573c("onEnterFullscreen", hashMap);
    }

    @TargetApi(21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean z = true;
        if (fileChooserParams.getMode() != 1) {
            z = false;
        }
        return mo25574v(valueCallback, fileChooserParams.createIntent(), acceptTypes, z);
    }

    /* renamed from: p */
    public final Intent mo25568p() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri o = mo25549o("android.media.action.IMAGE_CAPTURE");
        this.f8806n = o;
        intent.putExtra("output", o);
        return intent;
    }

    /* renamed from: q */
    public ViewGroup mo25569q() {
        Activity activity = this.f8804l;
        if (activity == null) {
            activity = C4221o.f8998f;
        }
        return (ViewGroup) activity.findViewById(16908290);
    }

    /* renamed from: r */
    public final Uri[] mo25570r(Intent intent, int i) {
        Uri[] uriArr = null;
        if (intent == null) {
            return null;
        }
        if (intent.getData() == null) {
            if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                uriArr = new Uri[itemCount];
                for (int i2 = 0; i2 < itemCount; i2++) {
                    uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
                }
            }
            return uriArr;
        } else if (i != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    /* renamed from: s */
    public final Intent mo25571s() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri o = mo25549o("android.media.action.VIDEO_CAPTURE");
        this.f8806n = o;
        intent.putExtra("output", o);
        return intent;
    }

    /* renamed from: t */
    public final Boolean mo25572t(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: u */
    public boolean mo25573u() {
        Activity activity = this.f8804l;
        if (activity == null) {
            activity = C4221o.f8998f;
        }
        try {
            if (!Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") || ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: v */
    public boolean mo25574v(ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr, boolean z) {
        C4205j.f8969s = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!mo25573u()) {
            if (mo25536b(strArr).booleanValue()) {
                arrayList.add(mo25568p());
            }
            if (mo25537d(strArr).booleanValue()) {
                arrayList.add(mo25571s());
            }
        }
        Intent m = mo25547m(strArr, z);
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", m);
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        Activity activity = this.f8804l;
        if (activity == null) {
            activity = C4221o.f8998f;
        }
        if (intent2.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(intent2, 1);
        }
        return true;
    }
}
