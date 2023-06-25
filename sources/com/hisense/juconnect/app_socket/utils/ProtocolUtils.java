package com.hisense.juconnect.app_socket.utils;

import com.hisense.juconnect.app_socket.connect.ConnectParameter;
import com.hisense.juconnect.app_socket.connect.TcpClient;
import com.hisense.juconnect.app_socket.connect.order.NetReplyOrder;
import com.hisense.juconnect.app_socket.connect.order.Order;
import com.hisense.juconnect.app_socket.connect.order.SearchWifiOrder;
import com.hisense.juconnect.app_socket.connect.order.SearchWifiReplyOrder;
import com.hisense.juconnect.app_socket.connect.order.WiFiArr;
import com.hisense.juconnect.app_socket.connect.order.ZeroSettingReplyOrder;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001fJ\b\u0010)\u001a\u0004\u0018\u00010\nR\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006+"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/utils/ProtocolUtils;", "", "()V", "client", "Lcom/hisense/juconnect/app_socket/connect/TcpClient;", "getClient", "()Lcom/hisense/juconnect/app_socket/connect/TcpClient;", "setClient", "(Lcom/hisense/juconnect/app_socket/connect/TcpClient;)V", "netReplyOrder", "Lcom/hisense/juconnect/app_socket/connect/order/NetReplyOrder;", "getNetReplyOrder", "()Lcom/hisense/juconnect/app_socket/connect/order/NetReplyOrder;", "setNetReplyOrder", "(Lcom/hisense/juconnect/app_socket/connect/order/NetReplyOrder;)V", "searchWifiReplyOrder", "Lcom/hisense/juconnect/app_socket/connect/order/SearchWifiReplyOrder;", "getSearchWifiReplyOrder", "()Lcom/hisense/juconnect/app_socket/connect/order/SearchWifiReplyOrder;", "setSearchWifiReplyOrder", "(Lcom/hisense/juconnect/app_socket/connect/order/SearchWifiReplyOrder;)V", "zeroSettingReplyOrder", "Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;", "getZeroSettingReplyOrder", "()Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;", "setZeroSettingReplyOrder", "(Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;)V", "close", "", "connect", "host", "", "port", "", "searchWifi", "firstOrder", "Lcom/hisense/juconnect/app_socket/connect/order/SearchWifiOrder;", "settingWifi", "wiFiArr", "Lcom/hisense/juconnect/app_socket/connect/order/WiFiArr;", "password", "verifySet", "Companion", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ProtocolUtils.kt */
public final class ProtocolUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "TcpClient";
    @NotNull
    public static final Lazy<ProtocolUtils> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, ProtocolUtils$Companion$instance$2.INSTANCE);
    public TcpClient client;
    public NetReplyOrder netReplyOrder;
    public SearchWifiReplyOrder searchWifiReplyOrder;
    public ZeroSettingReplyOrder zeroSettingReplyOrder;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/utils/ProtocolUtils$Companion;", "", "()V", "TAG", "", "instance", "Lcom/hisense/juconnect/app_socket/utils/ProtocolUtils;", "getInstance", "()Lcom/hisense/juconnect/app_socket/utils/ProtocolUtils;", "instance$delegate", "Lkotlin/Lazy;", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
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

    public final void close() {
        LogUtils.Companion.debug("TcpClient", "close tcp");
        TcpClient client2 = getClient();
        if (client2 != null) {
            client2.close();
        }
    }

    public final void connect(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, Http2ExchangeCodec.HOST);
        LogUtils.Companion.debug("TcpClient", "tcp socket client connect begining");
        try {
            if (!(this.client == null || getClient() == null)) {
                LogUtils.Companion.debug("TcpClient", "tcp socket client close");
                getClient().close();
            }
            LogUtils.Companion.debug("TcpClient", "TcpClient(host, port)");
            setClient(new TcpClient(str, i));
            LogUtils.Companion.debug("TcpClient", "tcp socket client connect start");
            getClient().connect();
            LogUtils.Companion.debug("TcpClient", "tcp socket client connect successfully");
        } finally {
            LogUtils.Companion.debug("TcpClient", "tcp socket 连接");
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

    @NotNull
    public final SearchWifiReplyOrder searchWifi(@NotNull SearchWifiOrder searchWifiOrder) {
        LinkedList<WiFiArr> wiFiArr;
        Intrinsics.checkNotNullParameter(searchWifiOrder, "firstOrder");
        searchWifiOrder.execute(getClient());
        Order nextOder = searchWifiOrder.getNextOder(getClient());
        if (nextOder != null) {
            SearchWifiReplyOrder searchWifiReplyOrder2 = (SearchWifiReplyOrder) nextOder;
            Integer endflag = searchWifiReplyOrder2.getENDFLAG();
            while (true) {
                if (endflag != null && endflag.intValue() == 0) {
                    setSearchWifiReplyOrder(searchWifiReplyOrder2);
                    return searchWifiReplyOrder2;
                }
                Order nextOder2 = searchWifiOrder.getNextOder(getClient());
                if (nextOder2 != null) {
                    SearchWifiReplyOrder searchWifiReplyOrder3 = (SearchWifiReplyOrder) nextOder2;
                    LinkedList<WiFiArr> wiFiArr2 = searchWifiReplyOrder3.getWiFiArr();
                    if (!(wiFiArr2 == null || (wiFiArr = searchWifiReplyOrder2.getWiFiArr()) == null)) {
                        wiFiArr.addAll(wiFiArr2);
                    }
                    endflag = searchWifiReplyOrder3.getENDFLAG();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_socket.connect.order.SearchWifiReplyOrder");
                }
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_socket.connect.order.SearchWifiReplyOrder");
        }
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
    public final ZeroSettingReplyOrder settingWifi(@NotNull WiFiArr wiFiArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(wiFiArr, "wiFiArr");
        Intrinsics.checkNotNullParameter(str, "password");
        if (getSearchWifiReplyOrder() != null) {
            SearchWifiReplyOrder searchWifiReplyOrder2 = getSearchWifiReplyOrder();
            ConnectParameter.INSTANCE.initTicket();
            Order nextOder = searchWifiReplyOrder2.getNextOder(wiFiArr, str);
            nextOder.execute(getClient());
            Order nextOder2 = nextOder.getNextOder(getClient());
            if (nextOder2 != null) {
                setZeroSettingReplyOrder((ZeroSettingReplyOrder) nextOder2);
                ConnectParameter.INSTANCE.setZeroSettingReplyOrder(getZeroSettingReplyOrder());
                return getZeroSettingReplyOrder();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_socket.connect.order.ZeroSettingReplyOrder");
        }
        throw new IllegalArgumentException("尚未连接后或是连接出错");
    }

    @Nullable
    public final NetReplyOrder verifySet() {
        if (getZeroSettingReplyOrder() != null) {
            Order nextOder = getZeroSettingReplyOrder().getNextOder(getClient());
            nextOder.execute(getClient());
            Order nextOder2 = nextOder.getNextOder(getClient());
            if (nextOder2 != null) {
                return (NetReplyOrder) nextOder2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_socket.connect.order.NetReplyOrder");
        }
        throw new IllegalArgumentException("你可能还没有配置wifi或者配置错误");
    }
}
