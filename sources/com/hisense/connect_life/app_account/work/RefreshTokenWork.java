package com.hisense.connect_life.app_account.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/work/RefreshTokenWork;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RefreshTokenWork.kt */
public final class RefreshTokenWork extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshTokenWork(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
    }

    @NotNull
    public ListenableWorker.Result doWork() {
        LoggerUtil.Companion.mo39146e("RefreshTokenWork");
        LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
        if (userInfo != null) {
            HiSmart.Companion.getInstance().accountService().refreshToken(userInfo.getRefreshToken(), AppConfig.Companion.getJhkDeviceId(), AppConfig.Companion.getJhlDevSerial(), new RefreshTokenWork$doWork$1$1(userInfo));
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(success, "success()");
        return success;
    }
}
