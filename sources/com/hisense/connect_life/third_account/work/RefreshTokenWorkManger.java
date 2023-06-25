package com.hisense.connect_life.third_account.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.third_account.util.AccountUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/third_account/work/RefreshTokenWorkManger;", "", "()V", "Companion", "third_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RefreshTokenWorkManger.kt */
public final class RefreshTokenWorkManger {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String NAME_REFRESH_TOKEN_WORK = "refresh_token_work";

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/third_account/work/RefreshTokenWorkManger$Companion;", "", "()V", "NAME_REFRESH_TOKEN_WORK", "", "addRefreshTokenWorker", "", "context", "Landroid/content/Context;", "removeRefreshTokenWoker", "third_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RefreshTokenWorkManger.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"RestrictedApi", "VisibleForTests"})
        public final void addRefreshTokenWorker(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            LoggerUtil.Companion.mo39146e("RefreshTokenWorkManger - addRefreshTokenWorker");
            LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
            if (userInfo != null) {
                WorkRequest build = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(RefreshTokenWork.class).addTag("refresh_token_work")).setScheduleRequestedAt((System.currentTimeMillis() / ((long) 1000)) + ((long) ((userInfo.getTokenExpireTime() * 2) / 3)), TimeUnit.SECONDS)).build();
                Intrinsics.checkNotNullExpressionValue(build, "OneTimeWorkRequestBuilde…t.SECONDS\n\t\t\t\t\t\t).build()");
                WorkManager instance = WorkManager.getInstance(context);
                Intrinsics.checkNotNullExpressionValue(instance, "getInstance(context)");
                instance.enqueue((WorkRequest) (OneTimeWorkRequest) build);
            }
        }

        public final void removeRefreshTokenWoker(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WorkManager instance = WorkManager.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(instance, "getInstance(context)");
            instance.cancelAllWorkByTag("refresh_token_work");
        }
    }
}
