package com.hisense.juconnect.app_socket.connect.order;

import com.hisense.juconnect.app_socket.connect.TcpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/connect/order/SendOrder;", "Lcom/hisense/juconnect/app_socket/connect/order/Order;", "()V", "execute", "", "client", "Lcom/hisense/juconnect/app_socket/connect/TcpClient;", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SendOrder.kt */
public class SendOrder extends Order {
    public void execute(@NotNull TcpClient tcpClient) {
        Intrinsics.checkNotNullParameter(tcpClient, "client");
        tcpClient.sendMessage(getJson());
    }
}
