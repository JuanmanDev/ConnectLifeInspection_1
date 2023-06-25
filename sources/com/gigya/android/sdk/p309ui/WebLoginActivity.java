package com.gigya.android.sdk.p309ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.annotation.RequiresApi;
import com.gigya.android.sdk.R$id;
import com.gigya.android.sdk.R$layout;
import java.util.HashMap;
import java.util.Map;
import p040c.p151o.p152a.p153a.C2098a;
import p040c.p151o.p152a.p153a.C2100c;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p172t.C2191b;
import p040c.p151o.p152a.p153a.p174u.C2206g;
import p040c.p151o.p152a.p153a.p174u.C2207h;

/* renamed from: com.gigya.android.sdk.ui.WebLoginActivity */
public class WebLoginActivity extends Activity {

    /* renamed from: e */
    public C3957b f7210e;

    /* renamed from: l */
    public int f7211l = -1;

    /* renamed from: m */
    public String f7212m;

    /* renamed from: com.gigya.android.sdk.ui.WebLoginActivity$b */
    public interface C3957b {
        /* renamed from: a */
        void mo17010a(Activity activity, Map<String, Object> map);

        /* renamed from: b */
        void mo17011b();
    }

    /* renamed from: e */
    public static void m9843e(Context context, String str, C3957b bVar) {
        Intent intent = new Intent(context, WebLoginActivity.class);
        intent.putExtra("web_login_lifecycle_callback", C2191b.m3323b(bVar));
        intent.putExtra("web_login_uri", str);
        intent.setFlags(268500992);
        context.startActivity(intent);
    }

    /* renamed from: b */
    public final boolean mo23424b(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        if (scheme == null || host == null || path == null || !scheme.equals("gigya") || !host.equals("gsapi")) {
            return false;
        }
        String encodedFragment = uri.getEncodedFragment();
        HashMap hashMap = new HashMap();
        C2207h.m3363e(hashMap, encodedFragment);
        C2103f.m3056b("WebLoginActivity", "evaluateUri: parsed url parameters = " + hashMap.toString());
        if (this.f7210e == null || isFinishing()) {
            return true;
        }
        this.f7210e.mo17010a(this, hashMap);
        finish();
        return true;
    }

    /* renamed from: d */
    public final boolean mo23425d() {
        C2103f.m3056b("WebLoginActivity", "failedValidation: uri = " + this.f7212m);
        String str = this.f7212m;
        if (str == null) {
            return false;
        }
        Map<String, Object> d = C2207h.m3362d(str);
        C2103f.m3056b("WebLoginActivity", "failedValidation: parsed parameters = " + d.toString());
        try {
            Uri parse = Uri.parse(this.f7212m);
            if (!parse.getScheme().equals("https")) {
                return true;
            }
            String host = parse.getHost();
            if (!host.equals("socialize." + ((C2098a) C2100c.m3048a().mo16935g(C2098a.class)).mo16853b())) {
                return true;
            }
            String path = parse.getPath();
            if (path.equals("/socialize.login") || path.equals("/socialize.addConnection")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f */
    public final void mo23426f() {
        try {
            if (((C2098a) C2100c.m3048a().mo16935g(C2098a.class)).mo16859h()) {
                C2206g.m3358a(getWindow());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void finish() {
        C2191b.m3325d(this.f7211l);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        if (this.f7210e != null && !isFinishing()) {
            this.f7210e.mo17011b();
        }
        super.onBackPressed();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo23426f();
        setContentView(R$layout.gigya_activity_web_provider);
        if (getIntent() == null) {
            C2103f.m3056b("WebLoginActivity", "Intent null");
            finish();
        } else if (getIntent().getExtras() == null) {
            C2103f.m3056b("WebLoginActivity", "Intent extras null");
            finish();
        } else {
            int intExtra = getIntent().getIntExtra("web_login_lifecycle_callback", -1);
            this.f7211l = intExtra;
            if (intExtra == -1) {
                C2103f.m3056b("WebLoginActivity", "web_login_lifecycle_callback null");
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("web_login_uri");
            this.f7212m = stringExtra;
            if (stringExtra == null) {
                C2103f.m3056b("WebLoginActivity", "web_login_uri null");
                finish();
            } else if (mo23425d()) {
                C2103f.m3057c("WebLoginActivity", "Failed to validate URL. Exiting activity");
                finish();
            } else {
                this.f7210e = C2191b.m3327f(this.f7211l);
                WebView webView = (WebView) findViewById(R$id.gig_web_provider_web_view);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(false);
                webView.setWebViewClient(new C3956a((ProgressBar) findViewById(R$id.gig_web_provider_progress)));
                webView.loadUrl(this.f7212m);
            }
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.WebLoginActivity$a */
    public class C3956a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f7213a;

        public C3956a(ProgressBar progressBar) {
            this.f7213a = progressBar;
        }

        public void onPageFinished(WebView webView, String str) {
            C2103f.m3056b("WebLoginActivity", "onPageFinished: " + str);
            this.f7213a.setVisibility(4);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C2103f.m3056b("WebLoginActivity", "onPageStarted: " + str);
            this.f7213a.setVisibility(0);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C2103f.m3056b("WebLoginActivity", "shouldOverrideUrlLoading: " + str);
            if (WebLoginActivity.this.mo23424b(Uri.parse(str))) {
                return false;
            }
            webView.loadUrl(str);
            return true;
        }

        @RequiresApi(api = 21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C2103f.m3056b("WebLoginActivity", "shouldOverrideUrlLoading: " + webResourceRequest.getUrl().toString());
            if (WebLoginActivity.this.mo23424b(webResourceRequest.getUrl())) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }
}
