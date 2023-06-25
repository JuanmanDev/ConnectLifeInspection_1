package androidx.webkit.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p648m.p654b.p655a.p656a.C9616a;

public enum WebViewFeatureInternal {
    VISUAL_STATE_CALLBACK_FEATURE(WebViewFeature.VISUAL_STATE_CALLBACK, WebViewFeature.VISUAL_STATE_CALLBACK, 23),
    OFF_SCREEN_PRERASTER(WebViewFeature.OFF_SCREEN_PRERASTER, WebViewFeature.OFF_SCREEN_PRERASTER, 23),
    SAFE_BROWSING_ENABLE(WebViewFeature.SAFE_BROWSING_ENABLE, WebViewFeature.SAFE_BROWSING_ENABLE, 26),
    DISABLED_ACTION_MODE_MENU_ITEMS(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS, WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS, 24),
    START_SAFE_BROWSING(WebViewFeature.START_SAFE_BROWSING, WebViewFeature.START_SAFE_BROWSING, 27),
    SAFE_BROWSING_WHITELIST(WebViewFeature.SAFE_BROWSING_WHITELIST, WebViewFeature.SAFE_BROWSING_WHITELIST, 27),
    SAFE_BROWSING_PRIVACY_POLICY_URL(WebViewFeature.SAFE_BROWSING_PRIVACY_POLICY_URL, WebViewFeature.SAFE_BROWSING_PRIVACY_POLICY_URL, 27),
    SERVICE_WORKER_BASIC_USAGE(WebViewFeature.SERVICE_WORKER_BASIC_USAGE, WebViewFeature.SERVICE_WORKER_BASIC_USAGE, 24),
    SERVICE_WORKER_CACHE_MODE(WebViewFeature.SERVICE_WORKER_CACHE_MODE, WebViewFeature.SERVICE_WORKER_CACHE_MODE, 24),
    SERVICE_WORKER_CONTENT_ACCESS(WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS, WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS, 24),
    SERVICE_WORKER_FILE_ACCESS(WebViewFeature.SERVICE_WORKER_FILE_ACCESS, WebViewFeature.SERVICE_WORKER_FILE_ACCESS, 24),
    SERVICE_WORKER_BLOCK_NETWORK_LOADS(WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS, WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS, 24),
    SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST(WebViewFeature.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, WebViewFeature.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, 24),
    RECEIVE_WEB_RESOURCE_ERROR(WebViewFeature.RECEIVE_WEB_RESOURCE_ERROR, WebViewFeature.RECEIVE_WEB_RESOURCE_ERROR, 23),
    RECEIVE_HTTP_ERROR(WebViewFeature.RECEIVE_HTTP_ERROR, WebViewFeature.RECEIVE_HTTP_ERROR, 23),
    SHOULD_OVERRIDE_WITH_REDIRECTS(WebViewFeature.SHOULD_OVERRIDE_WITH_REDIRECTS, WebViewFeature.SHOULD_OVERRIDE_WITH_REDIRECTS, 24),
    SAFE_BROWSING_HIT(WebViewFeature.SAFE_BROWSING_HIT, WebViewFeature.SAFE_BROWSING_HIT, 27),
    WEB_RESOURCE_REQUEST_IS_REDIRECT(WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT, WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT, 24),
    WEB_RESOURCE_ERROR_GET_DESCRIPTION(WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION, WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION, 23),
    WEB_RESOURCE_ERROR_GET_CODE(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE, WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE, 23),
    SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY(WebViewFeature.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, WebViewFeature.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, 27),
    SAFE_BROWSING_RESPONSE_PROCEED(WebViewFeature.SAFE_BROWSING_RESPONSE_PROCEED, WebViewFeature.SAFE_BROWSING_RESPONSE_PROCEED, 27),
    SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL(WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, 27),
    WEB_MESSAGE_PORT_POST_MESSAGE(WebViewFeature.WEB_MESSAGE_PORT_POST_MESSAGE, WebViewFeature.WEB_MESSAGE_PORT_POST_MESSAGE, 23),
    WEB_MESSAGE_PORT_CLOSE(WebViewFeature.WEB_MESSAGE_PORT_CLOSE, WebViewFeature.WEB_MESSAGE_PORT_CLOSE, 23),
    WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK(WebViewFeature.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, WebViewFeature.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, 23),
    CREATE_WEB_MESSAGE_CHANNEL(WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL, WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL, 23),
    POST_WEB_MESSAGE(WebViewFeature.POST_WEB_MESSAGE, WebViewFeature.POST_WEB_MESSAGE, 23),
    WEB_MESSAGE_CALLBACK_ON_MESSAGE(WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE, WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE, 23),
    GET_WEB_VIEW_CLIENT(WebViewFeature.GET_WEB_VIEW_CLIENT, WebViewFeature.GET_WEB_VIEW_CLIENT, 26),
    GET_WEB_CHROME_CLIENT(WebViewFeature.GET_WEB_CHROME_CLIENT, WebViewFeature.GET_WEB_CHROME_CLIENT, 26),
    GET_WEB_VIEW_RENDERER(WebViewFeature.GET_WEB_VIEW_RENDERER, WebViewFeature.GET_WEB_VIEW_RENDERER, 29),
    WEB_VIEW_RENDERER_TERMINATE(WebViewFeature.WEB_VIEW_RENDERER_TERMINATE, WebViewFeature.WEB_VIEW_RENDERER_TERMINATE, 29),
    TRACING_CONTROLLER_BASIC_USAGE(WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE, WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE, 28),
    WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, 29),
    PROXY_OVERRIDE(WebViewFeature.PROXY_OVERRIDE, "PROXY_OVERRIDE:3"),
    SUPPRESS_ERROR_PAGE(WebViewFeature.SUPPRESS_ERROR_PAGE, WebViewFeature.SUPPRESS_ERROR_PAGE),
    MULTI_PROCESS_QUERY(WebViewFeature.MULTI_PROCESS_QUERY, WebViewFeature.MULTI_PROCESS_QUERY),
    FORCE_DARK(WebViewFeature.FORCE_DARK, WebViewFeature.FORCE_DARK),
    FORCE_DARK_STRATEGY(WebViewFeature.FORCE_DARK_STRATEGY, "FORCE_DARK_BEHAVIOR"),
    WEB_MESSAGE_LISTENER(WebViewFeature.WEB_MESSAGE_LISTENER, WebViewFeature.WEB_MESSAGE_LISTENER);
    
    public static final int NOT_SUPPORTED_BY_FRAMEWORK = -1;
    public final String mInternalFeatureValue;
    public final int mOsVersion;
    public final String mPublicFeatureValue;

    public static class LAZY_HOLDER {
        public static final Set<String> WEBVIEW_APK_FEATURES = null;

        static {
            WEBVIEW_APK_FEATURES = new HashSet(Arrays.asList(WebViewGlueCommunicator.getFactory().getWebViewFeatures()));
        }
    }

    /* access modifiers changed from: public */
    WebViewFeatureInternal(@NonNull String str, @NonNull String str2) {
        this(r7, r8, str, str2, -1);
    }

    @NonNull
    public static WebViewFeatureInternal getFeature(@NonNull String str) {
        for (WebViewFeatureInternal webViewFeatureInternal : values()) {
            if (webViewFeatureInternal.mPublicFeatureValue.equals(str)) {
                return webViewFeatureInternal;
            }
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    @NonNull
    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @NonNull
    public static Set<String> getWebViewApkFeaturesForTesting() {
        return LAZY_HOLDER.WEBVIEW_APK_FEATURES;
    }

    public boolean isSupportedByFramework() {
        int i = this.mOsVersion;
        if (i != -1 && Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }

    public boolean isSupportedByWebView() {
        return C9616a.m25810b(LAZY_HOLDER.WEBVIEW_APK_FEATURES, this.mInternalFeatureValue);
    }

    /* access modifiers changed from: public */
    WebViewFeatureInternal(@NonNull String str, @NonNull String str2, int i) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        this.mOsVersion = i;
    }
}
