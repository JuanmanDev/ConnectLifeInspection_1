package com.hisense.connect_life.hismart.networks;

import android.content.Context;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.hismart.networks.exception.HiNetworkException;
import com.hisense.connect_life.hismart.networks.request.account.AccountManager;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.request.url.HostUrlDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u000eX\u0002"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiNetWorks;", "", "()V", "accountManager", "Lcom/hisense/connect_life/hismart/networks/request/account/AccountManager;", "getAccountManager", "()Lcom/hisense/connect_life/hismart/networks/request/account/AccountManager;", "hiSystemSetting", "Lcom/hisense/connect_life/hismart/networks/HiSystemSetting;", "getHiSystemSetting", "()Lcom/hisense/connect_life/hismart/networks/HiSystemSetting;", "setHiSystemSetting", "(Lcom/hisense/connect_life/hismart/networks/HiSystemSetting;)V", "getHostUrl", "", "cloudService", "Lcom/hisense/connect_life/hismart/networks/request/url/CloudService;", "getJhkAppKey", "getJhkAppSecret", "getJhlAppKey", "getJhlAppSecret", "getJhlClientId", "updateContext", "", "context", "Landroid/content/Context;", "Companion", "hismart_account_release", "host"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiNetWorks.kt */
public final class HiNetWorks {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property0(new PropertyReference0Impl(HiNetWorks.class, Http2ExchangeCodec.HOST, "<v#0>", 0))};
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final HiNetWorks hiNetWorks = new HiNetWorks();
    @NotNull
    public final AccountManager accountManager = new AccountManager();
    @Nullable
    public HiSystemSetting hiSystemSetting;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiNetWorks$Companion;", "", "()V", "hiNetWorks", "Lcom/hisense/connect_life/hismart/networks/HiNetWorks;", "getInstance", "initialize", "settings", "Lcom/hisense/connect_life/hismart/networks/HiSystemSetting;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HiNetWorks.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HiNetWorks getInstance() {
            return HiNetWorks.hiNetWorks;
        }

        @NotNull
        public final HiNetWorks initialize(@NotNull HiSystemSetting hiSystemSetting) {
            Intrinsics.checkNotNullParameter(hiSystemSetting, HtmlPaths.DEVICE_SETTINGS);
            HiNetWorks.hiNetWorks.setHiSystemSetting(hiSystemSetting);
            return HiNetWorks.hiNetWorks;
        }
    }

    /* renamed from: getHostUrl$lambda-0  reason: not valid java name */
    public static final String m26926getHostUrl$lambda0(HostUrlDelegate hostUrlDelegate) {
        return hostUrlDelegate.getValue((Object) null, (KProperty) $$delegatedProperties[0]);
    }

    @NotNull
    public final AccountManager getAccountManager() {
        return this.accountManager;
    }

    @Nullable
    public final HiSystemSetting getHiSystemSetting() {
        return this.hiSystemSetting;
    }

    @NotNull
    public final String getHostUrl(@NotNull CloudService cloudService) {
        Intrinsics.checkNotNullParameter(cloudService, "cloudService");
        HiSystemSetting hiSystemSetting2 = this.hiSystemSetting;
        if (hiSystemSetting2 != null) {
            Intrinsics.checkNotNull(hiSystemSetting2);
            String serviceLocation = hiSystemSetting2.getServiceLocation();
            HiSystemSetting hiSystemSetting3 = this.hiSystemSetting;
            Intrinsics.checkNotNull(hiSystemSetting3);
            return m26926getHostUrl$lambda0(new HostUrlDelegate(cloudService, serviceLocation, hiSystemSetting3.getServiceType()));
        }
        throw new HiNetworkException("The instance of HiSystemSetting is'nt initialized");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getJhkAppKey();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getJhkAppKey() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r2.hiSystemSetting
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            java.lang.String r0 = r0.getJhkAppKey()
            if (r0 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.HiNetWorks.getJhkAppKey():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getJhkAppSecret();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getJhkAppSecret() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r2.hiSystemSetting
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            java.lang.String r0 = r0.getJhkAppSecret()
            if (r0 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.HiNetWorks.getJhkAppSecret():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getJhlAppKey();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getJhlAppKey() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r2.hiSystemSetting
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            java.lang.String r0 = r0.getJhlAppKey()
            if (r0 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.HiNetWorks.getJhlAppKey():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getJhlAppSecret();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getJhlAppSecret() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r2.hiSystemSetting
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            java.lang.String r0 = r0.getJhlAppSecret()
            if (r0 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.HiNetWorks.getJhlAppSecret():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getJhlClientId();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getJhlClientId() {
        /*
            r2 = this;
            com.hisense.connect_life.hismart.networks.HiSystemSetting r0 = r2.hiSystemSetting
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            java.lang.String r0 = r0.getJhlClientId()
            if (r0 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.HiNetWorks.getJhlClientId():java.lang.String");
    }

    public final void setHiSystemSetting(@Nullable HiSystemSetting hiSystemSetting2) {
        this.hiSystemSetting = hiSystemSetting2;
    }

    public final void updateContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HiSystemSetting hiSystemSetting2 = this.hiSystemSetting;
        if (hiSystemSetting2 != null) {
            hiSystemSetting2.setContext(context);
        }
    }
}
