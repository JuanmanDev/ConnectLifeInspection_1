package com.juconnect.connectlife.ju_dist.connect.order;

import com.google.gson.Gson;
import com.juconnect.connectlife.ju_dist.connect.TcpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/connect/order/Order;", "", "()V", "Hcmd", "", "getHcmd", "()I", "setHcmd", "(I)V", "execute", "", "client", "Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;", "getJson", "", "getNextOrder", "Companion", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Order.kt */
public class Order {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int outcomeOrder = 3;
    public static final int searchNetOrder = 15;
    public static final int settingOrder = 4;
    public int Hcmd;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/connect/order/Order$Companion;", "", "()V", "outcomeOrder", "", "getOutcomeOrder", "()I", "searchNetOrder", "getSearchNetOrder", "settingOrder", "getSettingOrder", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Order.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getOutcomeOrder() {
            return Order.outcomeOrder;
        }

        public final int getSearchNetOrder() {
            return Order.searchNetOrder;
        }

        public final int getSettingOrder() {
            return Order.settingOrder;
        }
    }

    public void execute(@NotNull TcpClient tcpClient) {
        Intrinsics.checkNotNullParameter(tcpClient, "client");
    }

    public final int getHcmd() {
        return this.Hcmd;
    }

    @NotNull
    public String getJson() {
        String json = new Gson().toJson((Object) this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }

    @Nullable
    public Order getNextOrder(@NotNull TcpClient tcpClient) {
        Intrinsics.checkNotNullParameter(tcpClient, "client");
        return null;
    }

    public final void setHcmd(int i) {
        this.Hcmd = i;
    }
}
