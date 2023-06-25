package com.hisense.connect_life.core.multilingual;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.SPManagerKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1535z;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/core/multilingual/MultiLanguageUtil;", "", "()V", "TAG", "", "attachBaseContext", "Landroid/content/Context;", "context", "createConfigurationResources", "getConfigLocale", "Ljava/util/Locale;", "setConfiguration", "", "updateConfiguration", "language", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MultiLanguageUtil.kt */
public final class MultiLanguageUtil {
    @NotNull
    public static final MultiLanguageUtil INSTANCE = new MultiLanguageUtil();
    @NotNull
    public static final String TAG = "MultiLanguageUtil";

    @TargetApi(24)
    private final Context createConfigurationResources(Context context) {
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
        if (SPManagerKt.getLanguageType().length() > 0) {
            if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.zh_CN, false, 2, (Object) null)) {
                locale = Locale.SIMPLIFIED_CHINESE;
                Intrinsics.checkNotNullExpressionValue(locale, "SIMPLIFIED_CHINESE");
            } else if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.zh_TW_HK, false, 2, (Object) null)) {
                locale = Locale.TRADITIONAL_CHINESE;
                Intrinsics.checkNotNullExpressionValue(locale, "TRADITIONAL_CHINESE");
            } else if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.sr_BA, false, 2, (Object) null)) {
                locale = new Locale("sr", "BA");
            } else {
                locale = new Locale(SPManagerKt.getLanguageType());
            }
        }
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "context.createConfigurationContext(configuration)");
        return createConfigurationContext;
    }

    private final void updateConfiguration(Locale locale, Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Build.VERSION.SDK_INT >= 24) {
            context.createConfigurationContext(configuration);
        } else {
            resources.updateConfiguration(configuration, displayMetrics);
        }
        Resources resources2 = C1535z.m1079a().getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getApp().resources");
        DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "utilResources.displayMetrics");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "utilResources.configuration");
        configuration2.locale = LanguageListManager.INSTANCE.getLocale();
        resources.updateConfiguration(configuration2, displayMetrics2);
    }

    @NotNull
    public final Context attachBaseContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            return createConfigurationResources(context);
        }
        setConfiguration(context);
        return context;
    }

    @NotNull
    public final Locale getConfigLocale() {
        Locale locale;
        if (SPManagerKt.getLanguageType().length() > 0) {
            if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.zh_CN, false, 2, (Object) null)) {
                locale = Locale.SIMPLIFIED_CHINESE;
            } else if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.zh_TW_HK, false, 2, (Object) null)) {
                locale = Locale.TRADITIONAL_CHINESE;
            } else if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.sr_BA, false, 2, (Object) null)) {
                locale = new Locale("sr", "BA");
            } else {
                locale = new Locale(SPManagerKt.getLanguageType());
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        Intrinsics.stringPlus("language: ", locale);
        String locale2 = locale.toString();
        Intrinsics.checkNotNullExpressionValue(locale2, "language.toString()");
        if (StringsKt__StringsKt.contains$default((CharSequence) locale2, (CharSequence) "zh_CN", false, 2, (Object) null)) {
            Locale locale3 = Locale.SIMPLIFIED_CHINESE;
            Intrinsics.checkNotNullExpressionValue(locale3, "SIMPLIFIED_CHINESE");
            return locale3;
        }
        String locale4 = locale.toString();
        Intrinsics.checkNotNullExpressionValue(locale4, "language.toString()");
        if (!StringsKt__StringsKt.contains$default((CharSequence) locale4, (CharSequence) "zh_TW", false, 2, (Object) null)) {
            String locale5 = locale.toString();
            Intrinsics.checkNotNullExpressionValue(locale5, "language.toString()");
            if (!StringsKt__StringsKt.contains$default((CharSequence) locale5, (CharSequence) "zh_HK", false, 2, (Object) null)) {
                String locale6 = locale.toString();
                Intrinsics.checkNotNullExpressionValue(locale6, "language.toString()");
                if (!StringsKt__StringsKt.contains$default((CharSequence) locale6, (CharSequence) "zh_MO", false, 2, (Object) null)) {
                    String locale7 = locale.toString();
                    Intrinsics.checkNotNullExpressionValue(locale7, "language.toString()");
                    if (StringsKt__StringsKt.contains$default((CharSequence) locale7, (CharSequence) "sr", false, 2, (Object) null)) {
                        return new Locale("sr", "BA");
                    }
                    Intrinsics.checkNotNullExpressionValue(locale, "language");
                    return locale;
                }
            }
        }
        Locale locale8 = Locale.TRADITIONAL_CHINESE;
        Intrinsics.checkNotNullExpressionValue(locale8, "TRADITIONAL_CHINESE");
        return locale8;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void setConfiguration() {
        Locale locale;
        if (SPManagerKt.getLanguageType().length() > 0) {
            Intrinsics.stringPlus("languageType: ", SPManagerKt.getLanguageType());
            Intrinsics.stringPlus("is TW : ", Boolean.valueOf(StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.zh_TW_HK, false, 2, (Object) null)));
            if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.zh_CN)) {
                locale = Locale.SIMPLIFIED_CHINESE;
                Intrinsics.checkNotNullExpressionValue(locale, "SIMPLIFIED_CHINESE");
            } else if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.zh_TW_HK)) {
                locale = new Locale("zh_TW_#Hant");
            } else if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.sr_BA, false, 2, (Object) null)) {
                locale = new Locale("sr", "BA");
            } else {
                locale = new Locale(SPManagerKt.getLanguageType());
            }
            Intrinsics.stringPlus("before updateConfiguration: ", locale);
            updateConfiguration(locale, AppConfig.Companion.getApplication());
        }
    }

    private final void setConfiguration(Context context) {
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
        if (SPManagerKt.getLanguageType().length() > 0) {
            if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.zh_CN)) {
                locale = Locale.SIMPLIFIED_CHINESE;
                Intrinsics.checkNotNullExpressionValue(locale, "SIMPLIFIED_CHINESE");
            } else if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.zh_TW_HK)) {
                locale = Locale.TRADITIONAL_CHINESE;
                Intrinsics.checkNotNullExpressionValue(locale, "TRADITIONAL_CHINESE");
            } else if (StringsKt__StringsKt.contains$default((CharSequence) SPManagerKt.getLanguageType(), (CharSequence) LanguageConstKt.sr_BA, false, 2, (Object) null)) {
                locale = new Locale("sr", "BA");
            } else {
                locale = new Locale(SPManagerKt.getLanguageType());
            }
        }
        updateConfiguration(locale, context);
    }
}
