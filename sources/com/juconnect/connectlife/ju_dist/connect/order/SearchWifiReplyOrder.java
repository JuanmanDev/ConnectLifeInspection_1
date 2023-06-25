package com.juconnect.connectlife.ju_dist.connect.order;

import com.juconnect.connectlife.ju_dist.connect.TcpClient;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/connect/order/SearchWifiReplyOrder;", "Lcom/juconnect/connectlife/ju_dist/connect/order/ReplyOrder;", "()V", "ENDFLAG", "", "getENDFLAG", "()Ljava/lang/Integer;", "setENDFLAG", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "RSP", "getRSP", "setRSP", "WiFiArr", "Ljava/util/LinkedList;", "Lcom/juconnect/connectlife/ju_dist/connect/order/WiFiArr;", "getWiFiArr", "()Ljava/util/LinkedList;", "setWiFiArr", "(Ljava/util/LinkedList;)V", "index", "getIndex", "()I", "setIndex", "(I)V", "getNextOder", "Lcom/juconnect/connectlife/ju_dist/connect/order/Order;", "wiFiArr", "password", "", "getNextOrder", "client", "Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SearchWifiReplyOrder.kt */
public class SearchWifiReplyOrder extends ReplyOrder {
    @Nullable
    public Integer ENDFLAG;
    @Nullable
    public Integer RSP = 1;
    @Nullable
    public LinkedList<WiFiArr> WiFiArr;
    public int index;

    public SearchWifiReplyOrder() {
        setHcmd(3);
    }

    @Nullable
    public final Integer getENDFLAG() {
        return this.ENDFLAG;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Order getNextOder(@NotNull WiFiArr wiFiArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(wiFiArr, "wiFiArr");
        Intrinsics.checkNotNullParameter(str, "password");
        ZeroSettingOrder zeroSettingOrder = new ZeroSettingOrder(wiFiArr);
        zeroSettingOrder.setPassword(str);
        return zeroSettingOrder;
    }

    @Nullable
    public Order getNextOrder(@NotNull TcpClient tcpClient) {
        List<T> list;
        int i;
        Intrinsics.checkNotNullParameter(tcpClient, "client");
        LinkedList<WiFiArr> linkedList = this.WiFiArr;
        if (linkedList == null) {
            list = null;
        } else {
            list = CollectionsKt___CollectionsKt.sortedWith(linkedList, new SearchWifiReplyOrder$getNextOrder$$inlined$sortedBy$1());
        }
        if (list == null || list.size() <= (i = this.index)) {
            return null;
        }
        this.index++;
        return new ZeroSettingOrder((WiFiArr) list.get(i));
    }

    @Nullable
    public final Integer getRSP() {
        return this.RSP;
    }

    @Nullable
    public final LinkedList<WiFiArr> getWiFiArr() {
        return this.WiFiArr;
    }

    public final void setENDFLAG(@Nullable Integer num) {
        this.ENDFLAG = num;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setRSP(@Nullable Integer num) {
        this.RSP = num;
    }

    public final void setWiFiArr(@Nullable LinkedList<WiFiArr> linkedList) {
        this.WiFiArr = linkedList;
    }
}
