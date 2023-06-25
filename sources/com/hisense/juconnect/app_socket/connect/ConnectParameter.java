package com.hisense.juconnect.app_socket.connect;

import com.hisense.juconnect.app_socket.connect.order.ZeroSettingReplyOrder;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u000b\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/connect/ConnectParameter;", "", "()V", "domain", "", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "ticket", "getTicket", "setTicket", "zeroSettingReplyOrder", "Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;", "getZeroSettingReplyOrder", "()Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;", "setZeroSettingReplyOrder", "(Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;)V", "initTicket", "", "", "date", "Ljava/util/Date;", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectParameter.kt */
public final class ConnectParameter {
    @NotNull
    public static final ConnectParameter INSTANCE = new ConnectParameter();
    public static String domain;
    public static String ticket;
    public static ZeroSettingReplyOrder zeroSettingReplyOrder;

    @NotNull
    public final String getDomain() {
        String str = domain;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("domain");
        return null;
    }

    @NotNull
    public final String getTicket() {
        String str = ticket;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ticket");
        return null;
    }

    @NotNull
    public final ZeroSettingReplyOrder getZeroSettingReplyOrder() {
        ZeroSettingReplyOrder zeroSettingReplyOrder2 = zeroSettingReplyOrder;
        if (zeroSettingReplyOrder2 != null) {
            return zeroSettingReplyOrder2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("zeroSettingReplyOrder");
        return null;
    }

    public final void initTicket() {
        setTicket(String.valueOf(setTicket(new Date())));
        LogUtils.Companion.debug("配网ticket", Intrinsics.stringPlus("配网ticket", getTicket()));
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        domain = str;
    }

    public final void setTicket(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        ticket = str;
    }

    public final void setZeroSettingReplyOrder(@NotNull ZeroSettingReplyOrder zeroSettingReplyOrder2) {
        Intrinsics.checkNotNullParameter(zeroSettingReplyOrder2, "<set-?>");
        zeroSettingReplyOrder = zeroSettingReplyOrder2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r5 = java.lang.String.valueOf(r5.getTime());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int setTicket(java.util.Date r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            long r1 = r5.getTime()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r1 = r5.length()
            r2 = 3
            if (r1 <= r2) goto L_0x002f
            java.lang.String r3 = "timestamp"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            int r1 = r1 - r2
            java.lang.String r5 = r5.substring(r0, r1)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "{\n            Integer.va…0, length - 3))\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            int r0 = r5.intValue()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_socket.connect.ConnectParameter.setTicket(java.util.Date):int");
    }
}
