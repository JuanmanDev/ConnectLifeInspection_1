package com.hisense.juconnect.app_socket.connect.order;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/connect/order/ReplyOrder;", "Lcom/hisense/juconnect/app_socket/connect/order/Order;", "()V", "Err", "", "getErr", "()I", "setErr", "(I)V", "ExtData", "", "getExtData", "()Ljava/lang/String;", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ReplyOrder.kt */
public class ReplyOrder extends Order {
    public int Err;
    @Nullable
    public final String ExtData;

    public final int getErr() {
        return this.Err;
    }

    @Nullable
    public final String getExtData() {
        return this.ExtData;
    }

    public final void setErr(int i) {
        this.Err = i;
    }
}
