package com.gigya.android.sdk.p309ui.provider;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.gigya.android.sdk.p309ui.WebViewFragment;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p174u.C2207h;

/* renamed from: com.gigya.android.sdk.ui.provider.ProviderFragment */
public class ProviderFragment extends WebViewFragment {
    @Nullable

    /* renamed from: q */
    public WebViewFragment.C3958a f7266q;

    /* renamed from: com.gigya.android.sdk.ui.provider.ProviderFragment$a */
    public class C3976a extends WebChromeClient {
        public C3976a(ProviderFragment providerFragment) {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.provider.ProviderFragment$c */
    public class C3978c extends WebChromeClient {
        public C3978c() {
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                ProviderFragment.this.f7215e.getVisibility();
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        WebViewFragment.C3958a aVar = this.f7266q;
        if (aVar != null) {
            aVar.mo23437b();
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo23435r();
        String str = this.f7217m;
        if (str != null) {
            String str2 = this.f7218n;
            if (str2 != null) {
                this.f7215e.postUrl(str, str2.getBytes());
            } else {
                this.f7215e.loadUrl(str);
            }
        }
    }

    /* renamed from: q */
    public void mo23434q() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f7217m = arguments.getString("arg_url");
            this.f7218n = arguments.getString("arg_body");
            this.f7219o = arguments.getString("arg_redirect_prefix");
            this.f7220p = arguments.getString("arg_title");
            HashMap hashMap = (HashMap) arguments.getSerializable("arg_params");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: r */
    public void mo23435r() {
        super.mo23435r();
        this.f7215e.setVerticalScrollBarEnabled(true);
        this.f7215e.setHorizontalScrollBarEnabled(true);
        this.f7215e.setInitialScale(1);
        this.f7215e.setFocusable(true);
        WebSettings settings = this.f7215e.getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        this.f7215e.setWebChromeClient(new C3976a(this));
        this.f7215e.setWebViewClient(new C3977b());
        this.f7215e.setWebChromeClient(new C3978c());
    }

    /* renamed from: z */
    public final void mo23483z(@NonNull Map<String, Object> map) {
        C2103f.m3056b("ProviderFragment", "handleResult: " + map.toString());
        if (getActivity() != null) {
            WebViewFragment.C3958a aVar = this.f7266q;
            if (aVar != null) {
                aVar.mo23436a(map);
            }
            getActivity().getSupportFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
            getActivity().finish();
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.provider.ProviderFragment$b */
    public class C3977b extends WebViewClient {
        public C3977b() {
        }

        @Nullable
        /* renamed from: a */
        public final String mo23485a(String str) {
            if (ProviderFragment.this.f7219o == null || ProviderFragment.this.f7217m == null || !str.startsWith(ProviderFragment.this.f7219o)) {
                return null;
            }
            try {
                return URLDecoder.decode(str, "UTF8").replace("gsapi", "http");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public void onPageFinished(WebView webView, String str) {
            C2103f.m3056b("ProviderFragment", "onPageFinished: with Url = " + str);
            ProviderFragment.this.f7216l.setVisibility(4);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C2103f.m3056b("ProviderFragment", "onPageStarted: with Url = " + str);
            ProviderFragment.this.f7216l.setVisibility(0);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C2103f.m3056b("ProviderFragment", webResourceError.toString());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String a = mo23485a(str);
            if (a == null) {
                return false;
            }
            ProviderFragment.this.mo23483z(C2207h.m3362d(a));
            return true;
        }

        @RequiresApi(api = 21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String a = mo23485a(webResourceRequest.getUrl().toString());
            if (a == null) {
                return false;
            }
            ProviderFragment.this.mo23483z(C2207h.m3362d(a));
            return true;
        }
    }
}
