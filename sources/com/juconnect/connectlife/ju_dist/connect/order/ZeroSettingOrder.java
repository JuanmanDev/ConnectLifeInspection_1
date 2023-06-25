package com.juconnect.connectlife.ju_dist.connect.order;

import com.google.gson.Gson;
import com.juconnect.connectlife.ju_dist.connect.ConnectParameter;
import com.juconnect.connectlife.ju_dist.connect.TcpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\n¨\u0006\""}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/connect/order/ZeroSettingOrder;", "Lcom/juconnect/connectlife/ju_dist/connect/order/SendOrder;", "wifi", "Lcom/juconnect/connectlife/ju_dist/connect/order/WiFiArr;", "(Lcom/juconnect/connectlife/ju_dist/connect/order/WiFiArr;)V", "BSSID", "", "getBSSID", "()Ljava/lang/String;", "setBSSID", "(Ljava/lang/String;)V", "PWD", "getPWD", "setPWD", "SEQ", "", "getSEQ", "()Ljava/lang/Integer;", "setSEQ", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "SSID", "getSSID", "setSSID", "Ticket", "getTicket", "setTicket", "getNextOrder", "Lcom/juconnect/connectlife/ju_dist/connect/order/Order;", "client", "Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;", "setPassword", "", "passwod", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ZeroSettingOrder.kt */
public class ZeroSettingOrder extends SendOrder {
    @Nullable
    public String BSSID;
    @Nullable
    public String PWD;
    @Nullable
    public Integer SEQ = 2;
    @Nullable
    public String SSID;
    @Nullable
    public String Ticket = ConnectParameter.INSTANCE.getTicket();

    public ZeroSettingOrder(@Nullable WiFiArr wiFiArr) {
        String str;
        setHcmd(4);
        String str2 = null;
        if (wiFiArr == null) {
            str = null;
        } else {
            str = wiFiArr.getSSID();
        }
        this.SSID = str;
        this.BSSID = wiFiArr != null ? wiFiArr.getBSSID() : str2;
    }

    @Nullable
    public final String getBSSID() {
        return this.BSSID;
    }

    @Nullable
    public Order getNextOrder(@NotNull TcpClient tcpClient) {
        Intrinsics.checkNotNullParameter(tcpClient, "client");
        return (Order) new Gson().fromJson(tcpClient.readMessage(), new ZeroSettingOrder$getNextOrder$resultType$1().getType());
    }

    @Nullable
    public final String getPWD() {
        return this.PWD;
    }

    @Nullable
    public final Integer getSEQ() {
        return this.SEQ;
    }

    @Nullable
    public final String getSSID() {
        return this.SSID;
    }

    @Nullable
    public final String getTicket() {
        return this.Ticket;
    }

    public final void setBSSID(@Nullable String str) {
        this.BSSID = str;
    }

    public final void setPWD(@Nullable String str) {
        this.PWD = str;
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "passwod");
        this.PWD = str;
    }

    public final void setSEQ(@Nullable Integer num) {
        this.SEQ = num;
    }

    public final void setSSID(@Nullable String str) {
        this.SSID = str;
    }

    public final void setTicket(@Nullable String str) {
        this.Ticket = str;
    }
}
