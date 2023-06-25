package com.juconnect.connectlife.ju_dist.connect.order;

import com.juconnect.connectlife.ju_dist.connect.TcpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/connect/order/ZeroSettingReplyOrder;", "Lcom/juconnect/connectlife/ju_dist/connect/order/ReplyOrder;", "()V", "DevInfo", "Lcom/juconnect/connectlife/ju_dist/connect/order/DevInfo;", "getDevInfo", "()Lcom/juconnect/connectlife/ju_dist/connect/order/DevInfo;", "setDevInfo", "(Lcom/juconnect/connectlife/ju_dist/connect/order/DevInfo;)V", "getNextOrder", "Lcom/juconnect/connectlife/ju_dist/connect/order/Order;", "tcpClient", "Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ZeroSettingReplyOrder.kt */
public class ZeroSettingReplyOrder extends ReplyOrder {
    @Nullable
    public DevInfo DevInfo;

    @Nullable
    public final DevInfo getDevInfo() {
        return this.DevInfo;
    }

    @NotNull
    public Order getNextOrder(@NotNull TcpClient tcpClient) {
        Intrinsics.checkNotNullParameter(tcpClient, "tcpClient");
        return new NetOrder(this.DevInfo);
    }

    public final void setDevInfo(@Nullable DevInfo devInfo) {
        this.DevInfo = devInfo;
    }
}
