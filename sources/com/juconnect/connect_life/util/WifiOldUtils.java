package com.juconnect.connect_life.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p508a.p514x.C7737a;

@Metadata(mo47990d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020!H\u0002J\"\u0010/\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!0 J\u0010\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u0006H\u0002J\u0006\u0010-\u001a\u00020!J\u001c\u00103\u001a\u00020!2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R.\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000e2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0011¨\u00067"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/WifiOldUtils;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "SSID", "", "getSSID", "()Ljava/lang/String;", "setSSID", "(Ljava/lang/String;)V", "TAG", "getTAG", "configuration", "", "Landroid/net/wifi/WifiConfiguration;", "getConfiguration", "()Ljava/util/List;", "getContext", "()Landroid/content/Context;", "setContext", "filter", "Landroid/content/IntentFilter;", "getFilter", "()Landroid/content/IntentFilter;", "setFilter", "(Landroid/content/IntentFilter;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "listen", "Lkotlin/Function1;", "", "getListen", "()Lkotlin/jvm/functions/Function1;", "setListen", "(Lkotlin/jvm/functions/Function1;)V", "mWifiInfo", "Landroid/net/wifi/WifiInfo;", "mWifiManager", "Landroid/net/wifi/WifiManager;", "<set-?>", "Landroid/net/wifi/ScanResult;", "wifiList", "getWifiList", "LogScanResult", "connectwifi", "mListen", "createWifiConfig", "ssid", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@SuppressLint({"MissingPermission"})
/* compiled from: WifiOldUtils.kt */
public final class WifiOldUtils extends BroadcastReceiver {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static volatile WifiOldUtils instance;
    @NotNull
    public String SSID;
    @NotNull
    public final String TAG;
    @NotNull
    public final List<WifiConfiguration> configuration;
    @NotNull
    public Context context;
    @Nullable
    public IntentFilter filter;
    @NotNull
    public final Handler handler;
    @Nullable
    public Function1<? super String, Unit> listen;
    @Nullable
    public final WifiInfo mWifiInfo;
    @NotNull
    public final WifiManager mWifiManager;
    @Nullable
    public List<ScanResult> wifiList;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/WifiOldUtils$Companion;", "", "()V", "instance", "Lcom/juconnect/connect_life/util/WifiOldUtils;", "getInstance", "()Lcom/juconnect/connect_life/util/WifiOldUtils;", "setInstance", "(Lcom/juconnect/connect_life/util/WifiOldUtils;)V", "context", "Landroid/content/Context;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WifiOldUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final WifiOldUtils getInstance() {
            return WifiOldUtils.instance;
        }

        public final void setInstance(@Nullable WifiOldUtils wifiOldUtils) {
            WifiOldUtils.instance = wifiOldUtils;
        }

        @NotNull
        public final WifiOldUtils getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getInstance() == null) {
                synchronized (Reflection.getOrCreateKotlinClass(WifiOldUtils.class)) {
                    if (WifiOldUtils.Companion.getInstance() == null) {
                        WifiOldUtils.Companion.setInstance(new WifiOldUtils(context, (DefaultConstructorMarker) null));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            WifiOldUtils instance = getInstance();
            Intrinsics.checkNotNull(instance);
            return instance;
        }
    }

    public WifiOldUtils(Context context2) {
        this.context = context2;
        this.TAG = "wifi-conn--";
        this.handler = new Handler();
        this.SSID = "";
        Object systemService = this.context.getSystemService("wifi");
        if (systemService != null) {
            WifiManager wifiManager = (WifiManager) systemService;
            this.mWifiManager = wifiManager;
            this.mWifiInfo = wifiManager.getConnectionInfo();
            List<WifiConfiguration> configuredNetworks = this.mWifiManager.getConfiguredNetworks();
            Intrinsics.checkNotNullExpressionValue(configuredNetworks, "mWifiManager.configuredNetworks");
            this.configuration = configuredNetworks;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
    }

    public /* synthetic */ WifiOldUtils(Context context2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2);
    }

    private final void LogScanResult() {
        List<ScanResult> asMutableList = TypeIntrinsics.asMutableList(this.wifiList);
        if (asMutableList != null) {
            for (ScanResult stringPlus : asMutableList) {
                Intrinsics.stringPlus("wifi列表：", stringPlus);
            }
        }
    }

    /* renamed from: connectwifi$lambda-1  reason: not valid java name */
    public static final void m27247connectwifi$lambda1(WifiOldUtils wifiOldUtils) {
        Intrinsics.checkNotNullParameter(wifiOldUtils, "this$0");
        String str = wifiOldUtils.TAG;
        Function1<? super String, Unit> function1 = wifiOldUtils.listen;
        if (function1 != null) {
            function1.invoke("0");
        }
        wifiOldUtils.context.unregisterReceiver(wifiOldUtils);
        wifiOldUtils.handler.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0075, code lost:
        if (r6 == false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.net.wifi.WifiConfiguration createWifiConfig(java.lang.String r12) {
        /*
            r11 = this;
            android.net.wifi.WifiConfiguration r0 = new android.net.wifi.WifiConfiguration
            r0.<init>()
            java.util.BitSet r1 = r0.allowedAuthAlgorithms
            r1.clear()
            java.util.BitSet r1 = r0.allowedGroupCiphers
            r1.clear()
            java.util.BitSet r1 = r0.allowedKeyManagement
            r1.clear()
            java.util.BitSet r1 = r0.allowedPairwiseCiphers
            r1.clear()
            java.util.BitSet r1 = r0.allowedProtocols
            r1.clear()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            r1.append(r2)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.SSID = r1
            android.net.wifi.WifiManager r1 = r11.mWifiManager
            java.util.List r1 = r1.getConfiguredNetworks()
            java.lang.String r3 = "mWifiManager.configuredNetworks"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
        L_0x0048:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0075
            java.lang.Object r8 = r1.next()
            r9 = r8
            android.net.wifi.WifiConfiguration r9 = (android.net.wifi.WifiConfiguration) r9
            java.lang.String r9 = r9.SSID
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r12)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0048
            if (r6 == 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            r6 = r3
            r7 = r8
            goto L_0x0048
        L_0x0075:
            if (r6 != 0) goto L_0x0078
        L_0x0077:
            r7 = r5
        L_0x0078:
            android.net.wifi.WifiConfiguration r7 = (android.net.wifi.WifiConfiguration) r7
            if (r7 == 0) goto L_0x0088
            android.net.wifi.WifiManager r1 = r11.mWifiManager
            int r2 = r7.networkId
            r1.removeNetwork(r2)
            android.net.wifi.WifiManager r1 = r11.mWifiManager
            r1.saveConfiguration()
        L_0x0088:
            java.lang.String r1 = "HIS"
            r2 = 2
            boolean r12 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r12, (java.lang.CharSequence) r1, (boolean) r4, (int) r2, (java.lang.Object) r5)
            if (r12 == 0) goto L_0x0097
            java.util.BitSet r12 = r0.allowedKeyManagement
            r12.set(r4)
            goto L_0x00be
        L_0x0097:
            java.lang.String r12 = "\"ConnectLife\""
            r0.preSharedKey = r12
            r0.hiddenSSID = r3
            java.util.BitSet r12 = r0.allowedAuthAlgorithms
            r12.set(r4)
            java.util.BitSet r12 = r0.allowedGroupCiphers
            r12.set(r2)
            java.util.BitSet r12 = r0.allowedKeyManagement
            r12.set(r3)
            java.util.BitSet r12 = r0.allowedPairwiseCiphers
            r12.set(r3)
            java.util.BitSet r12 = r0.allowedGroupCiphers
            r1 = 3
            r12.set(r1)
            java.util.BitSet r12 = r0.allowedPairwiseCiphers
            r12.set(r2)
            r0.status = r2
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connect_life.util.WifiOldUtils.createWifiConfig(java.lang.String):android.net.wifi.WifiConfiguration");
    }

    public final void connectwifi(@NotNull String str, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "SSID");
        Intrinsics.checkNotNullParameter(function1, "mListen");
        this.SSID = str;
        this.listen = function1;
        IntentFilter intentFilter = new IntentFilter();
        this.filter = intentFilter;
        Intrinsics.checkNotNull(intentFilter);
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        IntentFilter intentFilter2 = this.filter;
        Intrinsics.checkNotNull(intentFilter2);
        intentFilter2.addAction("android.net.wifi.STATE_CHANGE");
        this.context.registerReceiver(this, this.filter);
        this.handler.postDelayed(new C7737a(this), 10000);
        List<WifiConfiguration> configuredNetworks = this.mWifiManager.getConfiguredNetworks();
        Intrinsics.checkNotNullExpressionValue(configuredNetworks, "mWifiManager.configuredNetworks");
        Iterator<T> it = configuredNetworks.iterator();
        T t = null;
        boolean z = false;
        T t2 = null;
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                String str2 = ((WifiConfiguration) next).SSID;
                Intrinsics.checkNotNullExpressionValue(str2, "it.SSID");
                if (Intrinsics.areEqual((Object) StringsKt__StringsJVMKt.replace$default(str2, "\"", "", false, 4, (Object) null), (Object) str)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    t2 = next;
                }
            } else if (z) {
                t = t2;
            }
        }
        WifiConfiguration wifiConfiguration = (WifiConfiguration) t;
        String.valueOf(wifiConfiguration);
        if (wifiConfiguration == null) {
            Intrinsics.stringPlus("新增wifi：", str);
            this.mWifiManager.enableNetwork(this.mWifiManager.addNetwork(createWifiConfig(str)), true);
            return;
        }
        Intrinsics.stringPlus("已有wifi：", str);
        this.mWifiManager.enableNetwork(wifiConfiguration.networkId, true);
    }

    @NotNull
    public final List<WifiConfiguration> getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final IntentFilter getFilter() {
        return this.filter;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    public final Function1<String, Unit> getListen() {
        return this.listen;
    }

    @NotNull
    public final String getSSID() {
        return this.SSID;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Nullable
    public final List<ScanResult> getWifiList() {
        return this.wifiList;
    }

    public void onReceive(@Nullable Context context2, @Nullable Intent intent) {
        NetworkInfo.State state;
        NetworkInfo.State state2;
        Object obj;
        String str = null;
        if (Intrinsics.areEqual((Object) intent == null ? null : intent.getAction(), (Object) "android.net.wifi.STATE_CHANGE")) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null) {
                state = null;
            } else {
                state = networkInfo.getState();
            }
            if (state != NetworkInfo.State.DISCONNECTED) {
                if (networkInfo == null) {
                    state2 = null;
                } else {
                    state2 = networkInfo.getState();
                }
                if (state2 == NetworkInfo.State.CONNECTED) {
                    if (context2 == null) {
                        obj = null;
                    } else {
                        obj = context2.getSystemService("wifi");
                    }
                    if (obj != null) {
                        WifiInfo connectionInfo = ((WifiManager) obj).getConnectionInfo();
                        Intrinsics.stringPlus("连接到网络: ", connectionInfo.getSSID());
                        String ssid = connectionInfo.getSSID();
                        Intrinsics.checkNotNullExpressionValue(ssid, "wifiInfo.ssid");
                        if (Intrinsics.areEqual((Object) StringsKt__StringsJVMKt.replace$default(ssid, "\"", "", false, 4, (Object) null), (Object) this.SSID)) {
                            Intrinsics.stringPlus("连接成功: ", connectionInfo.getSSID());
                            Function1<? super String, Unit> function1 = this.listen;
                            if (function1 != null) {
                                function1.invoke("1");
                            }
                            this.handler.removeCallbacksAndMessages((Object) null);
                            context2.unregisterReceiver(this);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
                }
                return;
            }
            return;
        }
        if (intent != null) {
            str = intent.getAction();
        }
        if (Intrinsics.areEqual((Object) str, (Object) "android.net.wifi.WIFI_STATE_CHANGED")) {
            intent.getIntExtra("wifi_state", 1);
        }
    }

    public final void setContext(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setFilter(@Nullable IntentFilter intentFilter) {
        this.filter = intentFilter;
    }

    public final void setListen(@Nullable Function1<? super String, Unit> function1) {
        this.listen = function1;
    }

    public final void setSSID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.SSID = str;
    }

    /* renamed from: getWifiList  reason: collision with other method in class */
    public final void m27248getWifiList() {
        this.wifiList = this.mWifiManager.getScanResults();
        LogScanResult();
    }
}
