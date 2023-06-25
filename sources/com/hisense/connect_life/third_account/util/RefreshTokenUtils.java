package com.hisense.connect_life.third_account.util;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007\b\u0012¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\bH\u0002J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004J0\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0006\u0010\u0018\u001a\u00020\bJ\f\u0010\u0019\u001a\u00020\b*\u00020\u000bH\u0002J\f\u0010\u001a\u001a\u00020\b*\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo47991d2 = {"Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils;", "", "()V", "context", "Landroid/content/Context;", "firstConnectedFilter", "", "deInit", "", "onEventMessage", "event", "", "refreshToken", "refreshTokenOnTime", "targetTime", "", "appContext", "setLoginSuccInfo", "signonReplyInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "email", "password", "loginSource", "thirdPlatformId", "stopTimer", "log", "logE", "Companion", "SingletonHolder", "UploadWorker", "third_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RefreshTokenUtils.kt */
public final class RefreshTokenUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final RefreshTokenUtils instance = SingletonHolder.INSTANCE.getHolder();
    @Nullable
    public Context context;
    public boolean firstConnectedFilter;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils$Companion;", "", "()V", "instance", "Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils;", "getInstance", "()Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils;", "third_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RefreshTokenUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RefreshTokenUtils getInstance() {
            return RefreshTokenUtils.instance;
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils$SingletonHolder;", "", "()V", "holder", "Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils;", "getHolder", "()Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils;", "third_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RefreshTokenUtils.kt */
    public static final class SingletonHolder {
        @NotNull
        public static final SingletonHolder INSTANCE = new SingletonHolder();
        @NotNull
        public static final RefreshTokenUtils holder = new RefreshTokenUtils((DefaultConstructorMarker) null);

        @NotNull
        public final RefreshTokenUtils getHolder() {
            return holder;
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/third_account/util/RefreshTokenUtils$UploadWorker;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "third_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RefreshTokenUtils.kt */
    public static final class UploadWorker extends Worker {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UploadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
            super(context, workerParameters);
            Intrinsics.checkNotNullParameter(context, "appContext");
            Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        }

        @NotNull
        public ListenableWorker.Result doWork() {
            RefreshTokenUtils.Companion.getInstance().refreshToken();
            ListenableWorker.Result success = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(success, "success()");
            return success;
        }
    }

    public RefreshTokenUtils() {
        this.firstConnectedFilter = true;
    }

    public /* synthetic */ RefreshTokenUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void deInit() {
        stopTimer();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    private final void log(String str) {
    }

    private final void logE(String str) {
    }

    /* access modifiers changed from: private */
    public final void refreshToken() {
        LoginInfo userInfo;
        if (!(AppConfig.Companion.getAccessToken().length() == 0) && (userInfo = AccountUtils.Companion.getUserInfo()) != null) {
            logE(Intrinsics.stringPlus("refreshToken=", userInfo.getRefreshToken()));
            Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new RefreshTokenUtils$refreshToken$1$1(userInfo, this, (Continuation<? super RefreshTokenUtils$refreshToken$1$1>) null), 2, (Object) null);
        }
    }

    public static /* synthetic */ void refreshTokenOnTime$default(RefreshTokenUtils refreshTokenUtils, int i, Context context2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context2 = null;
        }
        refreshTokenUtils.refreshTokenOnTime(i, context2);
    }

    /* access modifiers changed from: private */
    public final void setLoginSuccInfo(ClientLoginInfo clientLoginInfo, String str, String str2, String str3, String str4) {
        SPManagerKt.setCustomerId(clientLoginInfo.getCustomerId());
        AppConfig.Companion.setAnonymousLoginToken("");
        AccountUtils.Companion.cacheLoginInfo(clientLoginInfo, str2, str, str3, str4);
        AccountUtils.Companion.updateRefreshToken(clientLoginInfo.getRefreshToken(), clientLoginInfo.getCustomerId());
        refreshTokenOnTime$default(this, clientLoginInfo.getAccessTokenExpiredTime() / 2, (Context) null, 2, (Object) null);
        HiSmart.Companion.getInstance().updateToken(clientLoginInfo.getAccessToken());
        HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
        if (hiSystemParameter != null) {
            hiSystemParameter.setToken(clientLoginInfo.getAccessToken());
        }
        AppConfig.Companion.setAccessToken(clientLoginInfo.getAccessToken());
        SPManagerKt.setEmail(str);
        SPManagerKt.setPsw(str2);
        EventBus.getDefault().post(KeyConst.REFRESH_TOKEN);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_EVENT);
        if (Intrinsics.areEqual((Object) str, (Object) KeyConst.Exit_App)) {
            log("倒计时:App退出登录");
            deInit();
        } else if (Intrinsics.areEqual((Object) str, (Object) KeyConst.CONNECTED_NET)) {
            log("检测到网络连接");
            if (this.firstConnectedFilter) {
                this.firstConnectedFilter = false;
            } else {
                refreshToken();
            }
        }
    }

    public final void refreshTokenOnTime(int i, @Nullable Context context2) {
        log(Intrinsics.stringPlus("设置定时器,时间是:", Integer.valueOf(i)));
        if (context2 != null) {
            this.context = context2;
        }
        long j = (long) i;
        WorkRequest build = ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) UploadWorker.class, j, TimeUnit.SECONDS).addTag("refresh")).setInitialDelay(j, TimeUnit.SECONDS)).build();
        Intrinsics.checkNotNullExpressionValue(build, "PeriodicWorkRequestBuild…\n                .build()");
        PeriodicWorkRequest periodicWorkRequest = (PeriodicWorkRequest) build;
        Context context3 = this.context;
        if (context3 != null) {
            WorkManager.getInstance(context3).enqueueUniquePeriodicWork("refresh", ExistingPeriodicWorkPolicy.REPLACE, periodicWorkRequest);
        }
    }

    public final void stopTimer() {
        Context context2 = this.context;
        if (context2 != null) {
            WorkManager.getInstance(context2).cancelAllWorkByTag("refresh");
        }
    }
}
