package com.hisense.connect_life.core.base;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.NotificationHelper;
import com.hisense.connect_life.core.utils.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p436b.C7281a;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseApplication;", "Landroid/app/Application;", "()V", "upgradeHaveBeenChecked", "", "getUpgradeHaveBeenChecked", "()Z", "setUpgradeHaveBeenChecked", "(Z)V", "initLogTag", "", "isLogEnable", "onCreate", "", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseApplication.kt */
public abstract class BaseApplication extends Application {
    public boolean upgradeHaveBeenChecked;

    public final boolean getUpgradeHaveBeenChecked() {
        return this.upgradeHaveBeenChecked;
    }

    @NotNull
    public abstract String initLogTag();

    public abstract boolean isLogEnable();

    public void onCreate() {
        super.onCreate();
        Boolean bool = C7281a.f13908a;
        Intrinsics.checkNotNullExpressionValue(bool, "isLogEnable");
        if (bool.booleanValue()) {
            C1337a.m214i();
            C1337a.m213h();
        }
        C1337a.m212d(this);
        LoggerUtil.Companion.initLog(isLogEnable(), initLogTag());
        SPUtils sPUtils = SPUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        sPUtils.init(applicationContext);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
            notificationHelper.initDefaultChannel(applicationContext2);
        }
    }

    public final void setUpgradeHaveBeenChecked(boolean z) {
        this.upgradeHaveBeenChecked = z;
    }
}
