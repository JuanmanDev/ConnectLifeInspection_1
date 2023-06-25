package com.juconnect.connectlife.ju_dist.utils;

import android.net.Network;
import com.juconnect.connectlife.ju_dist.connect.ConnectParameter;
import com.juconnect.connectlife.ju_dist.connect.TcpClient;
import com.juconnect.connectlife.ju_dist.connect.order.NetReplyOrder;
import com.juconnect.connectlife.ju_dist.connect.order.Order;
import com.juconnect.connectlife.ju_dist.connect.order.SearchWifiOrder;
import com.juconnect.connectlife.ju_dist.connect.order.SearchWifiReplyOrder;
import com.juconnect.connectlife.ju_dist.connect.order.WiFiArr;
import com.juconnect.connectlife.ju_dist.connect.order.ZeroSettingReplyOrder;
import com.juconnect.connectlife.ju_dist.utils.LogUtils;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ8\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%2\u0016\u0010&\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010\u001f0'J\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020\u001f2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002J&\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u0002002\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f\u0018\u00010'J.\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\"2\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f\u0018\u00010'J\b\u00106\u001a\u0004\u0018\u00010\rR\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00068"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/ProtocolUtils;", "", "()V", "client", "Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;", "getClient", "()Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;", "setClient", "(Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;)V", "clientLock", "connectNum", "", "netReplyOrder", "Lcom/juconnect/connectlife/ju_dist/connect/order/NetReplyOrder;", "getNetReplyOrder", "()Lcom/juconnect/connectlife/ju_dist/connect/order/NetReplyOrder;", "setNetReplyOrder", "(Lcom/juconnect/connectlife/ju_dist/connect/order/NetReplyOrder;)V", "searchWifiReplyOrder", "Lcom/juconnect/connectlife/ju_dist/connect/order/SearchWifiReplyOrder;", "getSearchWifiReplyOrder", "()Lcom/juconnect/connectlife/ju_dist/connect/order/SearchWifiReplyOrder;", "setSearchWifiReplyOrder", "(Lcom/juconnect/connectlife/ju_dist/connect/order/SearchWifiReplyOrder;)V", "zeroSettingReplyOrder", "Lcom/juconnect/connectlife/ju_dist/connect/order/ZeroSettingReplyOrder;", "getZeroSettingReplyOrder", "()Lcom/juconnect/connectlife/ju_dist/connect/order/ZeroSettingReplyOrder;", "setZeroSettingReplyOrder", "(Lcom/juconnect/connectlife/ju_dist/connect/order/ZeroSettingReplyOrder;)V", "close", "", "connect", "host", "", "port", "network", "Landroid/net/Network;", "callBack", "Lkotlin/Function1;", "isConnected", "", "printSearchPackage", "wifiAddress", "Ljava/util/LinkedList;", "Lcom/juconnect/connectlife/ju_dist/connect/order/WiFiArr;", "searchWifi", "firstOrder", "Lcom/juconnect/connectlife/ju_dist/connect/order/SearchWifiOrder;", "tickCallBack", "settingWifi", "wiFiArr", "password", "sendCmdCallback", "verifySet", "Companion", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ProtocolUtils.kt */
public final class ProtocolUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "TcpClient";
    @NotNull
    public static final Lazy<ProtocolUtils> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, ProtocolUtils$Companion$instance$2.INSTANCE);
    public TcpClient client;
    @NotNull
    public final Object clientLock = new Object();
    public int connectNum;
    public NetReplyOrder netReplyOrder;
    public SearchWifiReplyOrder searchWifiReplyOrder;
    public ZeroSettingReplyOrder zeroSettingReplyOrder;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/ProtocolUtils$Companion;", "", "()V", "TAG", "", "instance", "Lcom/juconnect/connectlife/ju_dist/utils/ProtocolUtils;", "getInstance", "()Lcom/juconnect/connectlife/ju_dist/utils/ProtocolUtils;", "instance$delegate", "Lkotlin/Lazy;", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ProtocolUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProtocolUtils getInstance() {
            return (ProtocolUtils) ProtocolUtils.instance$delegate.getValue();
        }
    }

    private final void printSearchPackage(LinkedList<WiFiArr> linkedList) {
        if (linkedList != null) {
            for (WiFiArr wiFiArr : linkedList) {
                "包中的WIFI-SSID:" + wiFiArr.getSSID() + " , WIFI-BSSID:" + wiFiArr.getBSSID();
            }
        }
    }

    public static /* synthetic */ SearchWifiReplyOrder searchWifi$default(ProtocolUtils protocolUtils, SearchWifiOrder searchWifiOrder, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return protocolUtils.searchWifi(searchWifiOrder, function1);
    }

    public static /* synthetic */ ZeroSettingReplyOrder settingWifi$default(ProtocolUtils protocolUtils, WiFiArr wiFiArr, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return protocolUtils.settingWifi(wiFiArr, str, function1);
    }

    public final void close() {
        LogUtils.Companion.debug("TcpClient", "close tcp");
        getClient().close();
    }

    public final void connect(@NotNull String str, int i, @Nullable Network network, @NotNull Function1<? super String, Unit> function1) {
        LogUtils.Companion companion;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(str, Http2ExchangeCodec.HOST);
        Intrinsics.checkNotNullParameter(function1, "callBack");
        synchronized (this.clientLock) {
            try {
                if (this.client != null) {
                    getClient().close();
                }
                setClient(new TcpClient(str, i, network));
                getClient().connect();
                this.connectNum = 0;
                companion = LogUtils.Companion;
                str2 = "TcpClient";
                str3 = "ProtocolUtils::connect(host=" + str + ",port=" + i + ')';
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                    if (this.connectNum >= 3) {
                        function1.invoke(e.getMessage());
                        this.connectNum = 0;
                    } else {
                        this.connectNum++;
                        connect(str, i, network, function1);
                    }
                    companion = LogUtils.Companion;
                    str2 = "TcpClient";
                    str3 = "ProtocolUtils::connect(host=" + str + ",port=" + i + ')';
                } catch (Throwable th) {
                    LogUtils.Companion.debug("TcpClient", "ProtocolUtils::connect(host=" + str + ",port=" + i + ')');
                    throw th;
                }
            }
            companion.debug(str2, str3);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final TcpClient getClient() {
        TcpClient tcpClient = this.client;
        if (tcpClient != null) {
            return tcpClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("client");
        return null;
    }

    @NotNull
    public final NetReplyOrder getNetReplyOrder() {
        NetReplyOrder netReplyOrder2 = this.netReplyOrder;
        if (netReplyOrder2 != null) {
            return netReplyOrder2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("netReplyOrder");
        return null;
    }

    @NotNull
    public final SearchWifiReplyOrder getSearchWifiReplyOrder() {
        SearchWifiReplyOrder searchWifiReplyOrder2 = this.searchWifiReplyOrder;
        if (searchWifiReplyOrder2 != null) {
            return searchWifiReplyOrder2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchWifiReplyOrder");
        return null;
    }

    @NotNull
    public final ZeroSettingReplyOrder getZeroSettingReplyOrder() {
        ZeroSettingReplyOrder zeroSettingReplyOrder2 = this.zeroSettingReplyOrder;
        if (zeroSettingReplyOrder2 != null) {
            return zeroSettingReplyOrder2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("zeroSettingReplyOrder");
        return null;
    }

    public final boolean isConnected() {
        return this.client != null && getClient().isConnected();
    }

    @NotNull
    public final SearchWifiReplyOrder searchWifi(@NotNull SearchWifiOrder searchWifiOrder, @Nullable Function1<? super SearchWifiReplyOrder, Unit> function1) {
        LinkedList<WiFiArr> wiFiArr;
        Intrinsics.checkNotNullParameter(searchWifiOrder, "firstOrder");
        searchWifiOrder.execute(getClient());
        Order nextOrder = searchWifiOrder.getNextOrder(getClient());
        if (nextOrder != null) {
            SearchWifiReplyOrder searchWifiReplyOrder2 = (SearchWifiReplyOrder) nextOrder;
            Integer endflag = searchWifiReplyOrder2.getENDFLAG();
            while (true) {
                if (endflag != null && endflag.intValue() == 0) {
                    break;
                }
                Order nextOrder2 = searchWifiOrder.getNextOrder(getClient());
                if (nextOrder2 != null) {
                    SearchWifiReplyOrder searchWifiReplyOrder3 = (SearchWifiReplyOrder) nextOrder2;
                    printSearchPackage(searchWifiReplyOrder3.getWiFiArr());
                    LinkedList<WiFiArr> wiFiArr2 = searchWifiReplyOrder3.getWiFiArr();
                    if (wiFiArr2 == null || wiFiArr2.isEmpty()) {
                        break;
                    }
                    LinkedList<WiFiArr> wiFiArr3 = searchWifiReplyOrder3.getWiFiArr();
                    if (!(wiFiArr3 == null || (wiFiArr = searchWifiReplyOrder2.getWiFiArr()) == null)) {
                        wiFiArr.addAll(wiFiArr3);
                    }
                    setSearchWifiReplyOrder(searchWifiReplyOrder2);
                    if (function1 != null) {
                        function1.invoke(searchWifiReplyOrder2);
                    }
                    endflag = searchWifiReplyOrder3.getENDFLAG();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connectlife.ju_dist.connect.order.SearchWifiReplyOrder");
                }
            }
            setSearchWifiReplyOrder(searchWifiReplyOrder2);
            return searchWifiReplyOrder2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connectlife.ju_dist.connect.order.SearchWifiReplyOrder");
    }

    public final void setClient(@NotNull TcpClient tcpClient) {
        Intrinsics.checkNotNullParameter(tcpClient, "<set-?>");
        this.client = tcpClient;
    }

    public final void setNetReplyOrder(@NotNull NetReplyOrder netReplyOrder2) {
        Intrinsics.checkNotNullParameter(netReplyOrder2, "<set-?>");
        this.netReplyOrder = netReplyOrder2;
    }

    public final void setSearchWifiReplyOrder(@NotNull SearchWifiReplyOrder searchWifiReplyOrder2) {
        Intrinsics.checkNotNullParameter(searchWifiReplyOrder2, "<set-?>");
        this.searchWifiReplyOrder = searchWifiReplyOrder2;
    }

    public final void setZeroSettingReplyOrder(@NotNull ZeroSettingReplyOrder zeroSettingReplyOrder2) {
        Intrinsics.checkNotNullParameter(zeroSettingReplyOrder2, "<set-?>");
        this.zeroSettingReplyOrder = zeroSettingReplyOrder2;
    }

    @NotNull
    public final ZeroSettingReplyOrder settingWifi(@NotNull WiFiArr wiFiArr, @NotNull String str, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(wiFiArr, "wiFiArr");
        Intrinsics.checkNotNullParameter(str, "password");
        SearchWifiReplyOrder searchWifiReplyOrder2 = getSearchWifiReplyOrder();
        ConnectParameter.INSTANCE.initTicket();
        Order nextOder = searchWifiReplyOrder2.getNextOder(wiFiArr, str);
        if (function1 != null) {
            function1.invoke(nextOder.getJson());
        }
        nextOder.execute(getClient());
        Order nextOrder = nextOder.getNextOrder(getClient());
        if (nextOrder != null) {
            setZeroSettingReplyOrder((ZeroSettingReplyOrder) nextOrder);
            ConnectParameter.INSTANCE.setZeroSettingReplyOrder(getZeroSettingReplyOrder());
            return getZeroSettingReplyOrder();
        }
        throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connectlife.ju_dist.connect.order.ZeroSettingReplyOrder");
    }

    @Nullable
    public final NetReplyOrder verifySet() {
        if (getZeroSettingReplyOrder() != null) {
            Order nextOrder = getZeroSettingReplyOrder().getNextOrder(getClient());
            nextOrder.execute(getClient());
            Order nextOrder2 = nextOrder.getNextOrder(getClient());
            if (nextOrder2 != null) {
                return (NetReplyOrder) nextOrder2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connectlife.ju_dist.connect.order.NetReplyOrder");
        }
        throw new IllegalArgumentException("你可能还没有配置wifi或者配置错误");
    }
}
