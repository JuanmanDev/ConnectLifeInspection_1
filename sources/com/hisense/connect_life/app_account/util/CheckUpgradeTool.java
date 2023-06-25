package com.hisense.connect_life.app_account.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseApplication;
import com.hisense.connect_life.core.global.SPManagerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/CheckUpgradeTool;", "", "()V", "accountViewModel", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "upgradeMap", "", "", "getUpgradeMap", "()Ljava/util/Map;", "checkUpgrade", "", "application", "Lcom/hisense/connect_life/core/base/BaseApplication;", "jumpToGoogle", "context", "Landroid/content/Context;", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CheckUpgradeTool.kt */
public final class CheckUpgradeTool {
    @NotNull
    public static final CheckUpgradeTool INSTANCE = new CheckUpgradeTool();
    @Nullable
    public static AccountViewModel accountViewModel;
    @NotNull
    public static final Map<String, String> upgradeMap = new LinkedHashMap();

    public final void checkUpgrade(@NotNull BaseApplication baseApplication) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(baseApplication, "application");
        boolean upgradeHaveBeenChecked = baseApplication.getUpgradeHaveBeenChecked();
        if (upgradeHaveBeenChecked) {
            System.out.println("Upgrade check is already finished.");
            return;
        }
        PackageManager packageManager = baseApplication.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = packageManager.getPackageInfo(baseApplication.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        } else {
            packageInfo = packageManager.getPackageInfo(baseApplication.getPackageName(), 0);
        }
        if (packageInfo == null) {
            System.out.println("Can not get app version code.");
            return;
        }
        if (accountViewModel == null) {
            accountViewModel = new AccountViewModel();
        }
        if (!upgradeHaveBeenChecked) {
            baseApplication.setUpgradeHaveBeenChecked(true);
            AccountViewModel accountViewModel2 = accountViewModel;
            if (accountViewModel2 != null) {
                String valueOf = String.valueOf(SPManagerKt.getLanguageId());
                int i = packageInfo.versionCode;
                String packageName = baseApplication.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "application.packageName");
                accountViewModel2.checkUpgradeByPackage(valueOf, i, packageName, CheckUpgradeTool$checkUpgrade$1.INSTANCE);
            }
        }
    }

    @NotNull
    public final Map<String, String> getUpgradeMap() {
        return upgradeMap;
    }

    public final void jumpToGoogle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(Intrinsics.stringPlus("market://details?id=", context.getPackageName())));
            intent.setPackage("com.android.vending");
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(Intrinsics.stringPlus("https://play.google.com/store/apps/details?id=", context.getPackageName())));
            if (intent2.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent2);
            }
        } catch (ActivityNotFoundException e) {
            Intrinsics.stringPlus("GoogleMarket Intent not found :", e);
        }
    }
}
