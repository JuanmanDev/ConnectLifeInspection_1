package com.juconnect.connect_life.application;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.core.base.BaseApplication;
import com.hisense.connect_life.core.global.AccountConst;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.multilingual.MultiLanguageUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.listener.ITokenInvalidCallback;
import com.hisense.connect_life.hismart.networks.HiLogger;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.hismart.networks.request.pushmessage.PushMessageConst;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hmct.cloud.sdk.bean.account.SignonReplyInfo;
import com.juconnect.connect_life.util.DeviceIdUtils;
import com.juconnect.connect_life.util.LogFileUtils;
import com.juconnect.connectlife.ConnectLife;
import com.juconnect.connectlife.ju_ble.BlueToothHelper;
import com.juconnect.connectlife.ju_ble.parameters.Constant;
import com.juconnect.vivino.Vivino;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p072c.p073a.p074a.C1524t;
import p040c.p072c.p073a.p074a.C1535z;
import p040c.p200q.p363c.C6331h;
import p040c.p301y.p508a.C7726r;
import p040c.p301y.p508a.p509s.C7727a;
import p040c.p525z.p526a.C7815a;
import p040c.p525z.p526a.C7820f;
import p040c.p525z.p526a.C7822h;
import p553f.p554a.p589h.C9172c;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0002J0\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo47991d2 = {"Lcom/juconnect/connect_life/application/MainApplication;", "Lcom/hisense/connect_life/core/base/BaseApplication;", "Lcom/hisense/connect_life/hismart/listener/ITokenInvalidCallback;", "()V", "mActivityCountNum", "", "accept", "", "isITokenInvalid", "", "initActivityCallBack", "initCrashThird", "initJhkDevSerial", "initLogTag", "initLoginInfo", "isApplicationBackground", "", "isLogEnable", "onCreate", "refreshToken", "setLoginSuccInfo", "signonReplyInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "email", "password", "loginSource", "thirdPlatformId", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainApplication.kt */
public final class MainApplication extends BaseApplication implements ITokenInvalidCallback {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final ThreadPoolExecutor threadExecutor = new ThreadPoolExecutor(4, 6, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(10));
    public int mActivityCountNum;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connect_life/application/MainApplication$Companion;", "", "()V", "threadExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getThreadExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MainApplication.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ThreadPoolExecutor getThreadExecutor() {
            return MainApplication.threadExecutor;
        }
    }

    private final void initActivityCallBack() {
        registerActivityLifecycleCallbacks(new MainApplication$initActivityCallBack$1(this));
    }

    private final void initCrashThird() {
        Thread.setDefaultUncaughtExceptionHandler(new C7727a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    /* renamed from: initCrashThird$lambda-1  reason: not valid java name */
    public static final void m27238initCrashThird$lambda1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("======================================Crash Log Start=======================================");
        sb.append("\n");
        sb.append(th.getMessage());
        sb.append("\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        sb.append("=======================================Crash Log End========================================");
        LogFileUtils logFileUtils = LogFileUtils.Companion.get();
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        logFileUtils.writeLogToFile(sb2, true, true);
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    private final void initJhkDevSerial() {
        String j = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15420j(KeyConst.KEY_JHK_DEV_SERIAL, "");
        String j2 = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15420j(KeyConst.KEY_JHK_DEVICE_ID, "");
        Intrinsics.stringPlus("AppConfig.jhkDevSirial: ", j);
        if (TextUtils.isEmpty(j) || TextUtils.isEmpty(j2) || Intrinsics.areEqual((Object) j, (Object) AppConfig.DEFAULT_SERIAL_UUID)) {
            Intrinsics.stringPlus("生成新的deviceID: ", DeviceIdUtils.Companion.createDeviceId());
            return;
        }
        AppConfig.Companion companion = AppConfig.Companion;
        Intrinsics.checkNotNullExpressionValue(j, "devSerial");
        companion.setJhlDevSerial(j);
        AppConfig.Companion companion2 = AppConfig.Companion;
        Intrinsics.checkNotNullExpressionValue(j2, "deviceId");
        companion2.setJhkDeviceId(j2);
        HiSmart.Companion.getInstance().updateJhkSerial(j);
    }

    private final void initLoginInfo() {
        LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
        if (userInfo != null) {
            String j = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15420j(KeyConst.KEY_LOGIN_INFO, "");
            if (TextUtils.isEmpty(j)) {
                AccountConst.Companion.resetUserInfo();
                return;
            }
            try {
                C1502i.m924d(j, ClientLoginInfo.class);
            } catch (Exception unused) {
                C1502i.m924d(j, SignonReplyInfo.class);
            }
            AccountConst.Companion.updateUserInfo(userInfo.getLoginName(), userInfo.getSubscriberId(), userInfo.getCustomerId().toString(), userInfo.getToken(), userInfo.getRefreshToken());
        }
    }

    private final void refreshToken() {
        LoginInfo userInfo;
        if (!(AppConfig.Companion.getAccessToken().length() == 0) && (userInfo = AccountUtils.Companion.getUserInfo()) != null) {
            Intrinsics.stringPlus("MainApplication:refreshToken:refreshToken=", userInfo.getRefreshToken());
            Ref.IntRef intRef = new Ref.IntRef();
            try {
                ArrayList<LoginUserInfo> all = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll();
                intRef.element = (all == null ? null : Integer.valueOf(all.size())).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new MainApplication$refreshToken$1$1(userInfo, this, intRef, (Continuation<? super MainApplication$refreshToken$1$1>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void setLoginSuccInfo(ClientLoginInfo clientLoginInfo, String str, String str2, String str3, String str4) {
        SPManagerKt.setCustomerId(clientLoginInfo.getCustomerId());
        AppConfig.Companion.setAnonymousLoginToken("");
        AccountUtils.Companion.cacheLoginInfo(clientLoginInfo, str2, str, str3, str4);
        AccountUtils.Companion.updateRefreshToken(clientLoginInfo.getRefreshToken(), clientLoginInfo.getCustomerId());
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

    public void accept(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "isITokenInvalid");
        if (!Intrinsics.areEqual((Object) str, (Object) "false")) {
            Activity lastActivity = LoginActivityManager.Companion.get().getLastActivity();
            String localClassName = lastActivity == null ? null : lastActivity.getLocalClassName();
            if ((localClassName == null || localClassName.length() == 0) || (!StringsKt__StringsKt.contains$default((CharSequence) localClassName, (CharSequence) "LoginUsersActivity", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) localClassName, (CharSequence) "LoginFirstActivity", false, 2, (Object) null))) {
                HiSmart.Companion.getInstance().updateToken("");
                if (Intrinsics.areEqual((Object) str, (Object) "600722")) {
                    AccountUtils.Companion.deleteCurrentUserInfoFromDatabase();
                }
                refreshToken();
            }
        }
    }

    @NotNull
    public String initLogTag() {
        return "ConnectLife";
    }

    public final boolean isApplicationBackground() {
        Intrinsics.stringPlus("active activity is ", Integer.valueOf(this.mActivityCountNum));
        return this.mActivityCountNum == 0;
    }

    public boolean isLogEnable() {
        Boolean bool = C7726r.f14500a;
        Intrinsics.checkNotNullExpressionValue(bool, "isLogEnable");
        return bool.booleanValue();
    }

    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
        LogFileUtils logFileUtils = LogFileUtils.Companion.get();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
        LogFileUtils init = logFileUtils.init(applicationContext);
        Boolean bool = C7726r.f14500a;
        Intrinsics.checkNotNullExpressionValue(bool, "isLogEnable");
        LogFileUtils canWrite = init.setCanWrite(bool.booleanValue());
        boolean z = true;
        canWrite.setIsAddTime(true);
        C9172c.m24876d(getApplicationContext());
        AppConfig.Companion.setApplication(this);
        C7822h.C7824b j = C7822h.m21875j();
        j.mo33338d(false);
        j.mo33336b(0);
        j.mo33337c(7);
        j.mo33339e("hi_smart");
        C7822h a = j.mo33335a();
        Intrinsics.checkNotNullExpressionValue(a, "newBuilder()\n           …GGER\n            .build()");
        if (!SPManagerKt.getFlutterSettingLanguage()) {
            String language = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String lowerCase = language.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Intrinsics.stringPlus("application languageType: ", lowerCase);
            LanguageListManager languageListManager = LanguageListManager.INSTANCE;
            String language2 = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language2, "getDefault().language");
            Locale locale2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
            String lowerCase2 = language2.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            Intrinsics.stringPlus("application languageCode: ", languageListManager.getLanguageCodeByType(lowerCase2));
            SPManagerKt.setLanguageType(LanguageListManager.INSTANCE.getLanguageType());
            LanguageListManager languageListManager2 = LanguageListManager.INSTANCE;
            String language3 = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language3, "getDefault().language");
            Locale locale3 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale3, "ROOT");
            String lowerCase3 = language3.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            SPManagerKt.setLanguageId(Long.parseLong(languageListManager2.getLanguageCodeByType(lowerCase3)));
        }
        if (SPManagerKt.getLanguageType().length() != 0) {
            z = false;
        }
        if (z) {
            Intrinsics.stringPlus("application languageType: ", LanguageListManager.INSTANCE.getLanguageType());
            SPManagerKt.setLanguageType(LanguageListManager.INSTANCE.getLanguageType());
        }
        MultiLanguageUtil.INSTANCE.setConfiguration();
        C7820f.m21847a(new C7815a(a));
        BlueToothHelper.Companion.getInstances().initContext(this);
        BlueToothHelper.Companion.getInstances().initBlueUUID(Constant.dfuUuid, Constant.dfuServiceUuid);
        HiSmart instance = HiSmart.Companion.getInstance();
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "this.applicationContext");
        HiSystemParameter hiSystemParameter = new HiSystemParameter(applicationContext2, "cn", "release", HiLogger.LogLevel.Error, "", String.valueOf(SPManagerKt.getLanguageId()), AppConfig.Jhk_APP_KEY, AppConfig.Jhk_APP_SECRET, AppConfig.Jhl_APP_KEY, AppConfig.Jhl_APP_SECRET, AppConfig.Jhl_CLIENT_ID, AppConfig.Companion.getJhlDevSerial());
        Boolean bool2 = C7726r.f14500a;
        Intrinsics.checkNotNullExpressionValue(bool2, "isLogEnable");
        instance.initialize(this, hiSystemParameter, bool2.booleanValue(), this, "HiSmart");
        initLoginInfo();
        initJhkDevSerial();
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(contentResolve…ttings.Secure.ANDROID_ID)");
        PushMessageConst.Companion.setPHONECODE(string);
        C6331h.m17787r(this);
        initActivityCallBack();
        Resources resources = C1535z.m1079a().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getApp().resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "utilResources.displayMetrics");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "utilResources.configuration");
        configuration.locale = LanguageListManager.INSTANCE.getLocale();
        getResources().updateConfiguration(configuration, displayMetrics);
        Vivino.Companion.init(this, "production", "SmkFOz76TpXrF2yGaPzNMPS3KPfet4g9mW3yEfEl", "QuquImRfSqDUOyIRY5hyNoKf2Fw8yU7abEc15xAh");
        ConnectLife.Companion companion = ConnectLife.Companion;
        Boolean bool3 = C7726r.f14500a;
        Intrinsics.checkNotNullExpressionValue(bool3, "isLogEnable");
        companion.init(this, "release", bool3.booleanValue(), "ConnectLife");
    }
}
