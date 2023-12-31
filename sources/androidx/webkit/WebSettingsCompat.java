package androidx.webkit;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class WebSettingsCompat {
    public static final int FORCE_DARK_AUTO = 1;
    public static final int FORCE_DARK_OFF = 0;
    public static final int FORCE_DARK_ON = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int USER_AGENT_DARKENING_ONLY = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int WEB_THEME_DARKENING_ONLY = 1;

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDark {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkStrategy {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuItemFlags {
    }

    public static WebSettingsAdapter getAdapter(WebSettings webSettings) {
        return WebViewGlueCommunicator.getCompatConverter().convertSettings(webSettings);
    }

    @SuppressLint({"NewApi"})
    public static int getDisabledActionModeMenuItems(@NonNull WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS);
        if (feature.isSupportedByFramework()) {
            return webSettings.getDisabledActionModeMenuItems();
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(webSettings).getDisabledActionModeMenuItems();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static int getForceDark(@NonNull WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.FORCE_DARK);
        if (feature.isSupportedByFramework()) {
            return webSettings.getForceDark();
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(webSettings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getForceDarkStrategy(@NonNull WebSettings webSettings) {
        if (WebViewFeatureInternal.getFeature(WebViewFeature.FORCE_DARK_STRATEGY).isSupportedByWebView()) {
            return getAdapter(webSettings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static boolean getOffscreenPreRaster(@NonNull WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.OFF_SCREEN_PRERASTER);
        if (feature.isSupportedByFramework()) {
            return webSettings.getOffscreenPreRaster();
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(webSettings).getOffscreenPreRaster();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static boolean getSafeBrowsingEnabled(@NonNull WebSettings webSettings) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.SAFE_BROWSING_ENABLE);
        if (feature.isSupportedByFramework()) {
            return webSettings.getSafeBrowsingEnabled();
        }
        if (feature.isSupportedByWebView()) {
            return getAdapter(webSettings).getSafeBrowsingEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static void setDisabledActionModeMenuItems(@NonNull WebSettings webSettings, int i) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS);
        if (feature.isSupportedByFramework()) {
            webSettings.setDisabledActionModeMenuItems(i);
        } else if (feature.isSupportedByWebView()) {
            getAdapter(webSettings).setDisabledActionModeMenuItems(i);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @SuppressLint({"NewApi"})
    public static void setForceDark(@NonNull WebSettings webSettings, int i) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.FORCE_DARK);
        if (feature.isSupportedByFramework()) {
            webSettings.setForceDark(i);
        } else if (feature.isSupportedByWebView()) {
            getAdapter(webSettings).setForceDark(i);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @SuppressLint({"NewApi"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setForceDarkStrategy(@NonNull WebSettings webSettings, int i) {
        if (WebViewFeatureInternal.getFeature(WebViewFeature.FORCE_DARK_STRATEGY).isSupportedByWebView()) {
            getAdapter(webSettings).setForceDarkStrategy(i);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public static void setOffscreenPreRaster(@NonNull WebSettings webSettings, boolean z) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.OFF_SCREEN_PRERASTER);
        if (feature.isSupportedByFramework()) {
            webSettings.setOffscreenPreRaster(z);
        } else if (feature.isSupportedByWebView()) {
            getAdapter(webSettings).setOffscreenPreRaster(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @SuppressLint({"NewApi"})
    public static void setSafeBrowsingEnabled(@NonNull WebSettings webSettings, boolean z) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(WebViewFeature.SAFE_BROWSING_ENABLE);
        if (feature.isSupportedByFramework()) {
            webSettings.setSafeBrowsingEnabled(z);
        } else if (feature.isSupportedByWebView()) {
            getAdapter(webSettings).setSafeBrowsingEnabled(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @SuppressLint({"NewApi"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void setWillSuppressErrorPage(@NonNull WebSettings webSettings, boolean z) {
        if (WebViewFeatureInternal.getFeature(WebViewFeature.SUPPRESS_ERROR_PAGE).isSupportedByWebView()) {
            getAdapter(webSettings).setWillSuppressErrorPage(z);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean willSuppressErrorPage(@NonNull WebSettings webSettings) {
        if (WebViewFeatureInternal.getFeature(WebViewFeature.SUPPRESS_ERROR_PAGE).isSupportedByWebView()) {
            return getAdapter(webSettings).willSuppressErrorPage();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
