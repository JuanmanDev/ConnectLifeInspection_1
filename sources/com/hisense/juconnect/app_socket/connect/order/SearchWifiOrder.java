package com.hisense.juconnect.app_socket.connect.order;

import com.google.gson.Gson;
import com.hisense.juconnect.app_socket.connect.TcpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/connect/order/SearchWifiOrder;", "Lcom/hisense/juconnect/app_socket/connect/order/SendOrder;", "()V", "CC", "", "getCC", "()Ljava/lang/Integer;", "setCC", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "DN", "", "getDN", "()Ljava/lang/String;", "setDN", "(Ljava/lang/String;)V", "SEQ", "getSEQ", "setSEQ", "getNextOder", "Lcom/hisense/juconnect/app_socket/connect/order/Order;", "client", "Lcom/hisense/juconnect/app_socket/connect/TcpClient;", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SearchWifiOrder.kt */
public class SearchWifiOrder extends SendOrder {
    @Nullable

    /* renamed from: CC */
    public Integer f16434CC;
    @Nullable

    /* renamed from: DN */
    public String f16435DN;
    @Nullable
    public Integer SEQ = 1;

    public SearchWifiOrder() {
        setHcmd(15);
    }

    @Nullable
    public final Integer getCC() {
        return this.f16434CC;
    }

    @Nullable
    public final String getDN() {
        return this.f16435DN;
    }

    @Nullable
    public Order getNextOder(@NotNull TcpClient tcpClient) {
        Intrinsics.checkNotNullParameter(tcpClient, "client");
        return (Order) new Gson().fromJson(tcpClient.readMessage(), new SearchWifiOrder$getNextOder$resultType$1().getType());
    }

    @Nullable
    public final Integer getSEQ() {
        return this.SEQ;
    }

    public final void setCC(@Nullable Integer num) {
        this.f16434CC = num;
    }

    public final void setDN(@Nullable String str) {
        this.f16435DN = str;
    }

    public final void setSEQ(@Nullable Integer num) {
        this.SEQ = num;
    }
}
