package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.SafeBrowsingResponse;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.SafeBrowsingResponseCompat;
import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import p648m.p654b.p655a.p656a.C9616a;

public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {
    public SafeBrowsingResponseBoundaryInterface mBoundaryInterface;
    public SafeBrowsingResponse mFrameworksImpl;

    public SafeBrowsingResponseImpl(@NonNull InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) C9616a.m25809a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) C9616a.m25809a(SafeBrowsingResponseBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(27)
    private SafeBrowsingResponse getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    @SuppressLint({"NewApi"})
    public void backToSafety(boolean z) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY);
        if (feature.isSupportedByFramework()) {
            getFrameworksImpl().backToSafety(z);
        } else if (feature.isSupportedByWebView()) {
            getBoundaryInterface().backToSafety(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @SuppressLint({"NewApi"})
    public void proceed(boolean z) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.SAFE_BROWSING_RESPONSE_PROCEED);
        if (feature.isSupportedByFramework()) {
            getFrameworksImpl().proceed(z);
        } else if (feature.isSupportedByWebView()) {
            getBoundaryInterface().proceed(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @SuppressLint({"NewApi"})
    public void showInterstitial(boolean z) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL);
        if (feature.isSupportedByFramework()) {
            getFrameworksImpl().showInterstitial(z);
        } else if (feature.isSupportedByWebView()) {
            getBoundaryInterface().showInterstitial(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public SafeBrowsingResponseImpl(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        this.mFrameworksImpl = safeBrowsingResponse;
    }
}
