package com.hisense.connect_life.core.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.hisense.connect_life.core.listener.IPredicate;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0002\t\u000e\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/NetworkObserverUtil;", "", "()V", "mAvailableCallback", "Lcom/hisense/connect_life/core/listener/IPredicate;", "mConnManager", "Landroid/net/ConnectivityManager;", "mLostCallback", "mNetworkCallback", "com/hisense/connect_life/core/utils/NetworkObserverUtil$mNetworkCallback$1", "Lcom/hisense/connect_life/core/utils/NetworkObserverUtil$mNetworkCallback$1;", "mWifiManager", "Landroid/net/wifi/WifiManager;", "wifiReceiver", "com/hisense/connect_life/core/utils/NetworkObserverUtil$wifiReceiver$1", "Lcom/hisense/connect_life/core/utils/NetworkObserverUtil$wifiReceiver$1;", "wrContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "handleNetChange", "", "init", "context", "onClear", "registerNetworkReceiver", "setAvailableCallback", "callback", "setLostCallback", "unregisterNetworkReceiver", "Companion", "Holder", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetworkUtil.kt */
public final class NetworkObserverUtil {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public IPredicate mAvailableCallback;
    @Nullable
    public ConnectivityManager mConnManager;
    @Nullable
    public IPredicate mLostCallback;
    @NotNull
    public final NetworkObserverUtil$mNetworkCallback$1 mNetworkCallback;
    @Nullable
    public WifiManager mWifiManager;
    @NotNull
    public final NetworkObserverUtil$wifiReceiver$1 wifiReceiver;
    public WeakReference<Context> wrContext;

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/NetworkObserverUtil$Companion;", "", "()V", "getInstance", "Lcom/hisense/connect_life/core/utils/NetworkObserverUtil;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NetworkUtil.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkObserverUtil getInstance() {
            return Holder.INSTANCE.getWifiUtil();
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/NetworkObserverUtil$Holder;", "", "()V", "wifiUtil", "Lcom/hisense/connect_life/core/utils/NetworkObserverUtil;", "getWifiUtil", "()Lcom/hisense/connect_life/core/utils/NetworkObserverUtil;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NetworkUtil.kt */
    public static final class Holder {
        @NotNull
        public static final Holder INSTANCE = new Holder();
        @NotNull
        public static final NetworkObserverUtil wifiUtil = new NetworkObserverUtil((DefaultConstructorMarker) null);

        @NotNull
        public final NetworkObserverUtil getWifiUtil() {
            return wifiUtil;
        }
    }

    public NetworkObserverUtil() {
        this.wifiReceiver = new NetworkObserverUtil$wifiReceiver$1(this);
        this.mNetworkCallback = new NetworkObserverUtil$mNetworkCallback$1(this);
    }

    public /* synthetic */ NetworkObserverUtil(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final void handleNetChange() {
        ConnectivityManager connectivityManager = this.mConnManager;
        NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            IPredicate iPredicate = this.mLostCallback;
            if (iPredicate != null) {
                iPredicate.accept();
                return;
            }
            return;
        }
        IPredicate iPredicate2 = this.mAvailableCallback;
        if (iPredicate2 != null) {
            iPredicate2.accept();
        }
    }

    private final void registerNetworkReceiver() {
        WeakReference<Context> weakReference = this.wrContext;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wrContext");
            weakReference = null;
        }
        Context context = (Context) weakReference.get();
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                ConnectivityManager connectivityManager = this.mConnManager;
                if (connectivityManager != null) {
                    connectivityManager.registerDefaultNetworkCallback(this.mNetworkCallback);
                    return;
                }
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.wifiReceiver, intentFilter);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r0 = r0.getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init(@org.jetbrains.annotations.NotNull android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.wrContext = r0
            java.lang.String r4 = "wrContext"
            r1 = 0
            if (r0 != 0) goto L_0x0015
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r0 = r1
        L_0x0015:
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x002c
        L_0x001f:
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 != 0) goto L_0x0026
            goto L_0x001d
        L_0x0026:
            java.lang.String r2 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r2)
        L_0x002c:
            if (r0 == 0) goto L_0x0062
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            r3.mWifiManager = r0
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.wrContext
            if (r0 != 0) goto L_0x003a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r0 = r1
        L_0x003a:
            java.lang.Object r4 = r0.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L_0x0043
            goto L_0x0050
        L_0x0043:
            android.content.Context r4 = r4.getApplicationContext()
            if (r4 != 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r0)
        L_0x0050:
            if (r1 == 0) goto L_0x005a
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r3.mConnManager = r1
            r3.registerNetworkReceiver()
            return
        L_0x005a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r4.<init>(r0)
            throw r4
        L_0x0062:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.core.utils.NetworkObserverUtil.init(android.content.Context):void");
    }

    public final void onClear() {
        WeakReference<Context> weakReference = this.wrContext;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wrContext");
            weakReference = null;
        }
        Context context = (Context) weakReference.get();
        if (context != null) {
            context.unregisterReceiver(this.wifiReceiver);
        }
        ConnectivityManager connectivityManager = this.mConnManager;
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
        }
    }

    public final void setAvailableCallback(@NotNull IPredicate iPredicate) {
        Intrinsics.checkNotNullParameter(iPredicate, "callback");
        this.mAvailableCallback = iPredicate;
    }

    public final void setLostCallback(@NotNull IPredicate iPredicate) {
        Intrinsics.checkNotNullParameter(iPredicate, "callback");
        this.mLostCallback = iPredicate;
    }

    public final void unregisterNetworkReceiver() {
        WeakReference<Context> weakReference = this.wrContext;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wrContext");
            weakReference = null;
        }
        Context context = (Context) weakReference.get();
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                ConnectivityManager connectivityManager = this.mConnManager;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
                    return;
                }
                return;
            }
            context.unregisterReceiver(this.wifiReceiver);
        }
    }
}
