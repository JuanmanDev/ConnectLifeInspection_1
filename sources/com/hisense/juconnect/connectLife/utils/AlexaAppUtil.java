package com.hisense.juconnect.connectlife.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/juconnect/connectlife/utils/AlexaAppUtil;", "", "()V", "ALEXA_PACKAGE_NAME", "", "REQUIRED_MINIMUM_VERSION_CODE", "", "doesAlexaAppSupportAppToApp", "", "context", "Landroid/content/Context;", "getAlexaStartIntent", "Landroid/content/Intent;", "appUrl", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AlexaAppUtil.kt */
public final class AlexaAppUtil {
    @NotNull
    public static final String ALEXA_PACKAGE_NAME = "com.amazon.dee.app";
    @NotNull
    public static final AlexaAppUtil INSTANCE = new AlexaAppUtil();
    public static final int REQUIRED_MINIMUM_VERSION_CODE = 866607211;

    @JvmStatic
    public static final boolean doesAlexaAppSupportAppToApp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            PackageInfo packageInfo = packageManager.getPackageInfo(ALEXA_PACKAGE_NAME, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                if (packageInfo.getLongVersionCode() <= ((long) REQUIRED_MINIMUM_VERSION_CODE)) {
                    return false;
                }
            } else if (packageInfo == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent getAlexaStartIntent(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "appUrl");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(ALEXA_PACKAGE_NAME);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setAction("android.intent.action.VIEW");
            }
            if (launchIntentForPackage == null) {
                return launchIntentForPackage;
            }
            launchIntentForPackage.setData(Uri.parse(str));
            return launchIntentForPackage;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
