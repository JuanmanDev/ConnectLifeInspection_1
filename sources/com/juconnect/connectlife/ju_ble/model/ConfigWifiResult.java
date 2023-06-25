package com.juconnect.connectlife.ju_ble.model;

import com.google.gson.Gson;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.juconnect.connectlife.ju_ble.connect.order.DevInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/model/ConfigWifiResult;", "", "wifiId", "", "devType", "(Ljava/lang/String;Ljava/lang/String;)V", "data", "Lcom/juconnect/connectlife/ju_ble/model/SoftAp;", "getData", "()Lcom/juconnect/connectlife/ju_ble/model/SoftAp;", "setData", "(Lcom/juconnect/connectlife/ju_ble/model/SoftAp;)V", "errorCode", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "errorDes", "getErrorDes", "setErrorDes", "resultCode", "getResultCode", "setResultCode", "toJson", "toString", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigWifiResult.kt */
public final class ConfigWifiResult {
    @Nullable
    public SoftAp data;
    @Nullable
    public String errorCode;
    @Nullable
    public String errorDes;
    @Nullable
    public String resultCode;

    public ConfigWifiResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "devType");
        DevInfo devInfo = new DevInfo();
        devInfo.setWifiId(str);
        devInfo.setDevType(str2);
        this.data = new SoftAp(devInfo);
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
