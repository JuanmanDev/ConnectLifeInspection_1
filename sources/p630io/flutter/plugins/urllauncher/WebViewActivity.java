package p630io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugins.urllauncher.WebViewActivity */
public class WebViewActivity extends Activity {

    /* renamed from: o */
    public static String f18571o = "close action";

    /* renamed from: p */
    public static String f18572p = "url";

    /* renamed from: q */
    public static String f18573q = "enableJavaScript";

    /* renamed from: r */
    public static String f18574r = "enableDomStorage";

    /* renamed from: e */
    public final BroadcastReceiver f18575e = new C9436a();

    /* renamed from: l */
    public final WebViewClient f18576l = new C9437b(this);

    /* renamed from: m */
    public WebView f18577m;

    /* renamed from: n */
    public IntentFilter f18578n = new IntentFilter(f18571o);

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$a */
    public class C9436a extends BroadcastReceiver {
        public C9436a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f18571o.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c */
    public class C9438c extends WebChromeClient {

        /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c$a */
        public class C9439a extends WebViewClient {
            public C9439a() {
            }

            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f18577m.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f18577m.loadUrl(str);
                return true;
            }
        }

        public C9438c() {
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            C9439a aVar = new C9439a();
            WebView webView2 = new WebView(WebViewActivity.this.f18577m.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public /* synthetic */ C9438c(WebViewActivity webViewActivity, C9436a aVar) {
            this();
        }
    }

    /* renamed from: b */
    public static Intent m25537b(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(f18572p, str).putExtra(f18573q, z).putExtra(f18574r, z2).putExtra("com.android.browser.headers", bundle);
    }

    /* renamed from: d */
    public final Map<String, String> mo47570d(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f18577m = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f18572p);
        boolean booleanExtra = intent.getBooleanExtra(f18573q, false);
        boolean booleanExtra2 = intent.getBooleanExtra(f18574r, false);
        this.f18577m.loadUrl(stringExtra, mo47570d(intent.getBundleExtra("com.android.browser.headers")));
        this.f18577m.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f18577m.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f18577m.setWebViewClient(this.f18576l);
        this.f18577m.getSettings().setSupportMultipleWindows(true);
        this.f18577m.setWebChromeClient(new C9438c(this, (C9436a) null));
        registerReceiver(this.f18575e, this.f18578n);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f18575e);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f18577m.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f18577m.goBack();
        return true;
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$b */
    public class C9437b extends WebViewClient {
        public C9437b(WebViewActivity webViewActivity) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }

        @RequiresApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    }
}
