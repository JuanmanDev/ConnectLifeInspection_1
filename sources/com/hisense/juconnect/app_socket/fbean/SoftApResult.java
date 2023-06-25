package com.hisense.juconnect.app_socket.fbean;

import com.google.gson.Gson;
import com.hisense.juconnect.app_socket.connect.order.ZeroSettingReplyOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0018\u001a\u00020\fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/SoftApResult;", "", "zeroSettingReplyOrder", "Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;", "(Lcom/hisense/juconnect/app_socket/connect/order/ZeroSettingReplyOrder;)V", "data", "Lcom/hisense/juconnect/app_socket/fbean/SoftAp;", "getData", "()Lcom/hisense/juconnect/app_socket/fbean/SoftAp;", "setData", "(Lcom/hisense/juconnect/app_socket/fbean/SoftAp;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "errorDes", "getErrorDes", "setErrorDes", "resultCode", "getResultCode", "setResultCode", "toJson", "toString", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SoftApResult.kt */
public final class SoftApResult {
    @Nullable
    public SoftAp data;
    @Nullable
    public String errorCode;
    @Nullable
    public String errorDes;
    @Nullable
    public String resultCode;

    public SoftApResult(@Nullable ZeroSettingReplyOrder zeroSettingReplyOrder) {
        if (zeroSettingReplyOrder != null) {
            this.errorCode = zeroSettingReplyOrder.getErr() + "";
            this.errorDes = zeroSettingReplyOrder.getExtData();
            this.data = new SoftAp(zeroSettingReplyOrder.getDevInfo());
        }
    }

    @Nullable
    public final SoftAp getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorDes() {
        return this.errorDes;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    public final void setData(@Nullable SoftAp softAp) {
        this.data = softAp;
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public final void setErrorDes(@Nullable String str) {
        this.errorDes = str;
    }

    public final void setResultCode(@Nullable String str) {
        this.resultCode = str;
    }

    @NotNull
    public final String toJson() {
        String json = new Gson().toJson((Object) this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }

    @NotNull
    public String toString() {
        return "SoftApResult(data=" + this.data + ", errorCode=" + this.errorCode + ", errorDes=" + this.errorDes + ", resultCode=" + this.resultCode + ')';
    }
}
