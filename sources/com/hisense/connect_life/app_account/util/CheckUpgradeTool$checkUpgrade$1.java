package com.hisense.connect_life.app_account.util;

import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.model.CheckUpgradeByPackageResponse;
import java.io.PrintStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeByPackageResponse;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CheckUpgradeTool.kt */
public final class CheckUpgradeTool$checkUpgrade$1 extends Lambda implements Function1<CheckUpgradeByPackageResponse, Unit> {
    public static final CheckUpgradeTool$checkUpgrade$1 INSTANCE = new CheckUpgradeTool$checkUpgrade$1();

    public CheckUpgradeTool$checkUpgrade$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CheckUpgradeByPackageResponse) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull CheckUpgradeByPackageResponse checkUpgradeByPackageResponse) {
        Integer forcedUpdate;
        Intrinsics.checkNotNullParameter(checkUpgradeByPackageResponse, LanguageConstKt.f15954it);
        if (checkUpgradeByPackageResponse.getForcedUpdate() == null) {
            PrintStream printStream = System.out;
            printStream.println("get-app-policy response error: needUpdate=" + checkUpgradeByPackageResponse.getForcedUpdate() + ", apkVersion=" + checkUpgradeByPackageResponse.getVersionName());
            return;
        }
        Integer forcedUpdate2 = checkUpgradeByPackageResponse.getForcedUpdate();
        if ((forcedUpdate2 != null && forcedUpdate2.intValue() == 1) || ((forcedUpdate = checkUpgradeByPackageResponse.getForcedUpdate()) != null && forcedUpdate.intValue() == 2)) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Account.UpgradeActivity);
            Integer forcedUpdate3 = checkUpgradeByPackageResponse.getForcedUpdate();
            Intrinsics.checkNotNull(forcedUpdate3);
            a.withString("type", String.valueOf(forcedUpdate3.intValue()));
            String updateDescription = checkUpgradeByPackageResponse.getUpdateDescription();
            String str = "";
            if (updateDescription == null) {
                updateDescription = str;
            }
            a.withString(BrowserServiceFileProvider.CONTENT_SCHEME, updateDescription);
            String versionName = checkUpgradeByPackageResponse.getVersionName();
            if (versionName != null) {
                str = versionName;
            }
            a.withString("version", str);
            a.navigation();
            return;
        }
        System.out.println(Intrinsics.stringPlus("get-app-policy response, no need upgrade, needUpdate=", checkUpgradeByPackageResponse.getForcedUpdate()));
    }
}
