package com.juconnect.connect_life.broadcast;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010!\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006#"}, mo47991d2 = {"Lcom/juconnect/connect_life/broadcast/NetWorkMonitorManager;", "", "()V", "application", "Landroid/app/Application;", "netListener", "Lcom/juconnect/connect_life/broadcast/NetMonitorListener;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "getNetworkCallback", "()Landroid/net/ConnectivityManager$NetworkCallback;", "setNetworkCallback", "(Landroid/net/ConnectivityManager$NetworkCallback;)V", "receiver", "Landroid/content/BroadcastReceiver;", "getReceiver", "()Landroid/content/BroadcastReceiver;", "setReceiver", "(Landroid/content/BroadcastReceiver;)V", "addNetMonitor", "", "netMonitorListener", "getAPNType", "", "context", "Landroid/content/Context;", "getConnectionType", "", "type", "init", "initMonitor", "netIsAvailable", "", "onDestroy", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetWorkMonitorManager.kt */
public final class NetWorkMonitorManager {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "NetWorkMonitor >>> : ";
    @Nullable
    public static NetWorkMonitorManager ourInstance;
    public Application application;
    @Nullable
    public NetMonitorListener netListener;
    @NotNull
    public ConnectivityManager.NetworkCallback networkCallback;
    @NotNull
    public BroadcastReceiver receiver;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, mo47991d2 = {"Lcom/juconnect/connect_life/broadcast/NetWorkMonitorManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/juconnect/connect_life/broadcast/NetWorkMonitorManager;", "getInstance", "()Lcom/juconnect/connect_life/broadcast/NetWorkMonitorManager;", "ourInstance", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NetWorkMonitorManager.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final NetWorkMonitorManager getInstance() {
            synchronized (NetWorkMonitorManager.class) {
                if (NetWorkMonitorManager.ourInstance == null) {
                    Companion companion = NetWorkMonitorManager.Companion;
                    NetWorkMonitorManager.ourInstance = new NetWorkMonitorManager((DefaultConstructorMarker) null);
                }
                Unit unit = Unit.INSTANCE;
            }
            return NetWorkMonitorManager.ourInstance;
        }
    }

    public NetWorkMonitorManager() {
        this.receiver = new NetWorkMonitorManager$receiver$1(this);
        this.networkCallback = new NetWorkMonitorManager$networkCallback$1(this);
    }

    public /* synthetic */ NetWorkMonitorManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final String getConnectionType(int i) {
        return i != 0 ? i != 1 ? "" : "WIFI网络" : "3G网络数据";
    }

    private final void initMonitor() {
        Application application2 = this.application;
        Application application3 = null;
        if (application2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            application2 = null;
        }
        Object systemService = application2.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                connectivityManager.registerDefaultNetworkCallback(this.networkCallback);
            } else if (i >= 21) {
                NetworkRequest build = new NetworkRequest.Builder().build();
                Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
                connectivityManager.registerNetworkCallback(build, this.networkCallback);
            } else {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                Application application4 = this.application;
                if (application4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("application");
                } else {
                    application3 = application4;
                }
                application3.registerReceiver(this.receiver, intentFilter);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    public final void addNetMonitor(@NotNull NetMonitorListener netMonitorListener) {
        Intrinsics.checkNotNullParameter(netMonitorListener, "netMonitorListener");
        this.netListener = netMonitorListener;
    }

    public final int getAPNType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                Object systemService2 = context.getSystemService(EventBusConstKt.PHONE);
                if (systemService2 != null) {
                    TelephonyManager telephonyManager = (TelephonyManager) systemService2;
                    if (subtype == 13 && !telephonyManager.isNetworkRoaming()) {
                        return 4;
                    }
                    if (subtype == 3 || subtype == 8 || (subtype == 5 && !telephonyManager.isNetworkRoaming())) {
                        return 3;
                    }
                    if (!(subtype == 1 || subtype == 2 || subtype != 4)) {
                        boolean isNetworkRoaming = telephonyManager.isNetworkRoaming();
                    }
                    return 2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } else if (type != 1) {
                return 0;
            } else {
                return 1;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    @NotNull
    public final ConnectivityManager.NetworkCallback getNetworkCallback() {
        return this.networkCallback;
    }

    @NotNull
    public final BroadcastReceiver getReceiver() {
        return this.receiver;
    }

    public final void init(@Nullable Application application2) {
        if (application2 != null) {
            this.application = application2;
            initMonitor();
            return;
        }
        throw new NullPointerException("application can not be null");
    }

    public final boolean netIsAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final void onDestroy() {
        if (Build.VERSION.SDK_INT < 21) {
            Application application2 = this.application;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application2 = null;
            }
            application2.unregisterReceiver(this.receiver);
        }
    }

    public final void setNetworkCallback(@NotNull ConnectivityManager.NetworkCallback networkCallback2) {
        Intrinsics.checkNotNullParameter(networkCallback2, "<set-?>");
        this.networkCallback = networkCallback2;
    }

    public final void setReceiver(@NotNull BroadcastReceiver broadcastReceiver) {
        Intrinsics.checkNotNullParameter(broadcastReceiver, "<set-?>");
        this.receiver = broadcastReceiver;
    }
}
