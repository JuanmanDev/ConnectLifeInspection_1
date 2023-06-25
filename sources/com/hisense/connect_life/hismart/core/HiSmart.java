package com.hisense.connect_life.hismart.core;

import android.content.Context;
import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.hismart.listener.ITokenInvalidCallback;
import com.hisense.connect_life.hismart.networks.HiLogger;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.HiSystemSetting;
import com.hisense.connect_life.hismart.networks.exception.HiNetworkException;
import com.hisense.connect_life.hismart.networks.request.account.AccountManager;
import com.hisense.connect_life.hismart.networks.request.account.AccountServiceImpl;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.clife.ClifeServiceImpl;
import com.hisense.connect_life.hismart.networks.request.clife.IClifeService;
import com.hisense.connect_life.hismart.networks.request.config.ConfigServiceImpl;
import com.hisense.connect_life.hismart.networks.request.config.IConfigService;
import com.hisense.connect_life.hismart.networks.request.device.DeviceServiceImpl;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.language.ILanguageService;
import com.hisense.connect_life.hismart.networks.request.language.LanguageServiceImpl;
import com.hisense.connect_life.hismart.networks.request.message.IMessageService;
import com.hisense.connect_life.hismart.networks.request.message.MessageServiceImpl;
import com.hisense.connect_life.hismart.networks.request.pushmessage.IPushMessageService;
import com.hisense.connect_life.hismart.networks.request.pushmessage.PushMessageServiceImpl;
import com.hisense.connect_life.hismart.networks.request.statistic.IStatisticService;
import com.hisense.connect_life.hismart.networks.request.statistic.StatisticServiceImpl;
import com.hisense.connect_life.hismart.networks.request.wine.IWineCategoryManager;
import com.hisense.connect_life.hismart.networks.request.wine.WineCategoryManagerImpl;
import com.hisense.connect_life.hismart.networks.request.wine.inventory.manager.WineInventoryService;
import com.hisense.connect_life.hismart.networks.request.wine.inventory.manager.WineInventoryServiceImpl;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J.\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020&2\u0006\u0010'\u001a\u00020!J\u000e\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020\u0010J\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020\u0010J\u000e\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020=R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006?"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/core/HiSmart;", "", "()V", "hiSystemParameter", "Lcom/hisense/connect_life/hismart/core/HiSystemParameter;", "getHiSystemParameter", "()Lcom/hisense/connect_life/hismart/core/HiSystemParameter;", "setHiSystemParameter", "(Lcom/hisense/connect_life/hismart/core/HiSystemParameter;)V", "iTokenInvalidCallback", "Lcom/hisense/connect_life/hismart/listener/ITokenInvalidCallback;", "getITokenInvalidCallback", "()Lcom/hisense/connect_life/hismart/listener/ITokenInvalidCallback;", "setITokenInvalidCallback", "(Lcom/hisense/connect_life/hismart/listener/ITokenInvalidCallback;)V", "wineHost", "", "getWineHost", "()Ljava/lang/String;", "setWineHost", "(Ljava/lang/String;)V", "accountManager", "Lcom/hisense/connect_life/hismart/networks/request/account/AccountManager;", "accountService", "Lcom/hisense/connect_life/hismart/networks/request/account/IAccountService;", "clifeService", "Lcom/hisense/connect_life/hismart/networks/request/clife/IClifeService;", "domain", "configService", "Lcom/hisense/connect_life/hismart/networks/request/config/IConfigService;", "deviceService", "Lcom/hisense/connect_life/hismart/networks/request/device/IDeviceService;", "getContext", "Landroid/content/Context;", "getJhkSerial", "getLaunguageId", "getToken", "initialize", "", "context", "isLogEnable", "", "tag", "languageService", "Lcom/hisense/connect_life/hismart/networks/request/language/ILanguageService;", "messageService", "Lcom/hisense/connect_life/hismart/networks/request/message/IMessageService;", "pushMessageService", "Lcom/hisense/connect_life/hismart/networks/request/pushmessage/IPushMessageService;", "setContext", "setLanguageId", "languageId", "statisticService", "Lcom/hisense/connect_life/hismart/networks/request/statistic/IStatisticService;", "updateJhkSerial", "jhkSerial", "updateToken", "token", "wineCategoryService", "Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "wineWineInventoryManagerSerivce", "Lcom/hisense/connect_life/hismart/networks/request/wine/inventory/manager/WineInventoryService;", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiSmart.kt */
public final class HiSmart {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static HiNetWorks hiNetWorks;
    @Nullable
    public static HiSmart hismart;
    @Nullable
    public HiSystemParameter hiSystemParameter;
    @Nullable
    public ITokenInvalidCallback iTokenInvalidCallback;
    @NotNull
    public String wineHost;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/core/HiSmart$Companion;", "", "()V", "hiNetWorks", "Lcom/hisense/connect_life/hismart/networks/HiNetWorks;", "getHiNetWorks$hismart_account_release", "()Lcom/hisense/connect_life/hismart/networks/HiNetWorks;", "setHiNetWorks$hismart_account_release", "(Lcom/hisense/connect_life/hismart/networks/HiNetWorks;)V", "hismart", "Lcom/hisense/connect_life/hismart/core/HiSmart;", "getInstance", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HiSmart.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HiNetWorks getHiNetWorks$hismart_account_release() {
            return HiSmart.hiNetWorks;
        }

        @NotNull
        public final HiSmart getInstance() {
            if (HiSmart.hismart == null) {
                synchronized (Reflection.getOrCreateKotlinClass(HiSmart.class)) {
                    Companion companion = HiSmart.Companion;
                    HiSmart.hismart = new HiSmart((DefaultConstructorMarker) null);
                    Unit unit = Unit.INSTANCE;
                }
            }
            HiSmart access$getHismart$cp = HiSmart.hismart;
            Intrinsics.checkNotNull(access$getHismart$cp);
            return access$getHismart$cp;
        }

        public final void setHiNetWorks$hismart_account_release(@Nullable HiNetWorks hiNetWorks) {
            HiSmart.hiNetWorks = hiNetWorks;
        }
    }

    public HiSmart() {
        this.wineHost = "";
    }

    public /* synthetic */ HiSmart(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final AccountManager accountManager() {
        HiNetWorks hiNetWorks2 = hiNetWorks;
        AccountManager accountManager = hiNetWorks2 == null ? null : hiNetWorks2.getAccountManager();
        if (accountManager != null) {
            return accountManager;
        }
        throw new HiNetworkException("The instance of HiNetWorks is'nt initialized");
    }

    @NotNull
    public final IAccountService accountService() {
        return new AccountServiceImpl();
    }

    @NotNull
    public final IClifeService clifeService(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "domain");
        return new ClifeServiceImpl(str);
    }

    @NotNull
    public final IConfigService configService() {
        return new ConfigServiceImpl();
    }

    @NotNull
    public final IDeviceService deviceService() {
        return new DeviceServiceImpl();
    }

    @NotNull
    public final Context getContext() {
        HiSystemSetting hiSystemSetting;
        HiNetWorks hiNetWorks2 = hiNetWorks;
        Context context = null;
        if (!(hiNetWorks2 == null || (hiSystemSetting = hiNetWorks2.getHiSystemSetting()) == null)) {
            context = hiSystemSetting.getContext();
        }
        if (context != null) {
            return context;
        }
        throw new HiNetworkException("The instance of Context is'nt initialized");
    }

    @Nullable
    public final HiSystemParameter getHiSystemParameter() {
        HiSystemParameter hiSystemParameter2 = this.hiSystemParameter;
        if (hiSystemParameter2 == null) {
            return null;
        }
        new HiSystemParameter(hiSystemParameter2);
        return hiSystemParameter2;
    }

    @Nullable
    public final ITokenInvalidCallback getITokenInvalidCallback() {
        return this.iTokenInvalidCallback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.getHiSystemSetting()).getJhkSerial();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getJhkSerial() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiNetWorks r0 = hiNetWorks
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x0016
        L_0x0007:
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r0.getHiSystemSetting()
            if (r0 != 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.String r0 = r0.getJhkSerial()
            if (r0 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.core.HiSmart.getJhkSerial():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.getHiSystemSetting()).getLanguageId();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getLaunguageId() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiNetWorks r0 = hiNetWorks
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x0016
        L_0x0007:
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r0.getHiSystemSetting()
            if (r0 != 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.String r0 = r0.getLanguageId()
            if (r0 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.core.HiSmart.getLaunguageId():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.getHiSystemSetting()).getToken();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getToken() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiNetWorks r0 = hiNetWorks
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x0016
        L_0x0007:
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r0.getHiSystemSetting()
            if (r0 != 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.String r0 = r0.getToken()
            if (r0 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.core.HiSmart.getToken():java.lang.String");
    }

    @NotNull
    public final String getWineHost() {
        return this.wineHost;
    }

    public final void initialize(@NotNull Context context, @NotNull HiSystemParameter hiSystemParameter2, boolean z, @NotNull ITokenInvalidCallback iTokenInvalidCallback2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hiSystemParameter2, "hiSystemParameter");
        Intrinsics.checkNotNullParameter(iTokenInvalidCallback2, "iTokenInvalidCallback");
        Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
        this.hiSystemParameter = hiSystemParameter2;
        this.iTokenInvalidCallback = iTokenInvalidCallback2;
        hiNetWorks = HiNetWorks.Companion.initialize(HiSystemSetting.Companion.initialize(hiSystemParameter2));
        HiLogger.Companion.initializeHiLogger(hiSystemParameter2.getLogLevel());
        LoggerUtil.Companion.initLog(z, str);
        LoginUserInfoRoom.Companion.init(context);
    }

    @NotNull
    public final ILanguageService languageService() {
        return new LanguageServiceImpl();
    }

    @NotNull
    public final IMessageService messageService() {
        return new MessageServiceImpl();
    }

    @NotNull
    public final IPushMessageService pushMessageService() {
        return new PushMessageServiceImpl();
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HiNetWorks hiNetWorks2 = hiNetWorks;
        if (hiNetWorks2 != null) {
            hiNetWorks2.updateContext(context);
        }
    }

    public final void setHiSystemParameter(@Nullable HiSystemParameter hiSystemParameter2) {
        this.hiSystemParameter = hiSystemParameter2;
    }

    public final void setITokenInvalidCallback(@Nullable ITokenInvalidCallback iTokenInvalidCallback2) {
        this.iTokenInvalidCallback = iTokenInvalidCallback2;
    }

    public final void setLanguageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        HiNetWorks hiNetWorks2 = hiNetWorks;
        HiSystemSetting hiSystemSetting = hiNetWorks2 == null ? null : hiNetWorks2.getHiSystemSetting();
        if (hiSystemSetting != null) {
            hiSystemSetting.setLanguageId(str);
        }
    }

    public final void setWineHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wineHost = str;
    }

    @NotNull
    public final IStatisticService statisticService() {
        return new StatisticServiceImpl();
    }

    public final void updateJhkSerial(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "jhkSerial");
        HiNetWorks hiNetWorks2 = hiNetWorks;
        HiSystemSetting hiSystemSetting = hiNetWorks2 == null ? null : hiNetWorks2.getHiSystemSetting();
        if (hiSystemSetting != null) {
            hiSystemSetting.setJhkSerial(str);
        }
    }

    public final void updateToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        HiNetWorks hiNetWorks2 = hiNetWorks;
        HiSystemSetting hiSystemSetting = hiNetWorks2 == null ? null : hiNetWorks2.getHiSystemSetting();
        if (hiSystemSetting != null) {
            hiSystemSetting.setToken(str);
        }
    }

    @NotNull
    public final IWineCategoryManager wineCategoryService() {
        return new WineCategoryManagerImpl();
    }

    @NotNull
    public final WineInventoryService wineWineInventoryManagerSerivce() {
        return new WineInventoryServiceImpl();
    }
}
