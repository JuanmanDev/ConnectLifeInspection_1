package com.juconnect.connectlife.ju_dist.fbean;

import com.google.gson.Gson;
import com.juconnect.connectlife.ju_dist.connect.order.DevInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0010\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0017\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\tH\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\u0019"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/fbean/SoftAp;", "", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "devInfo", "Lcom/juconnect/connectlife/ju_dist/connect/order/DevInfo;", "(Lcom/juconnect/connectlife/ju_dist/connect/order/DevInfo;)V", "DevId", "", "getDevId", "()Ljava/lang/String;", "setDevId", "(Ljava/lang/String;)V", "DevProductType", "getDevProductType", "setDevProductType", "DevType", "getDevType", "setDevType", "WifiId", "getWifiId", "setWifiId", "toJson", "toString", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SoftAp.kt */
public final class SoftAp {
    @Nullable
    public String DevId;
    @Nullable
    public String DevProductType;
    @Nullable
    public String DevType;
    @Nullable
    public String WifiId;

    public SoftAp(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        try {
            this.WifiId = jSONObject.getString("WifiId");
            this.DevId = jSONObject.getString("DevId");
            this.DevType = jSONObject.getString("DevType");
            this.DevProductType = jSONObject.getString("DevProductType");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final String getDevId() {
        return this.DevId;
    }

    @Nullable
    public final String getDevProductType() {
        return this.DevProductType;
    }

    @Nullable
    public final String getDevType() {
        return this.DevType;
    }

    @Nullable
    public final String getWifiId() {
        return this.WifiId;
    }

    public final void setDevId(@Nullable String str) {
        this.DevId = str;
    }

    public final void setDevProductType(@Nullable String str) {
        this.DevProductType = str;
    }

    public final void setDevType(@Nullable String str) {
        this.DevType = str;
    }

    public final void setWifiId(@Nullable String str) {
        this.WifiId = str;
    }

    @NotNull
    public final String toJson() {
        String json = new Gson().toJson((Object) this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }

    @NotNull
    public String toString() {
        return "SoftAp(WifiId=" + this.WifiId + ", DevId=" + this.DevId + ", DevType=" + this.DevType + ", DevProductType=" + this.DevProductType + ')';
    }

    public SoftAp(@Nullable DevInfo devInfo) {
        if (devInfo != null) {
            this.WifiId = devInfo.getWifiId();
            this.DevId = devInfo.getDevId();
            this.DevType = devInfo.getDevType();
            this.DevProductType = devInfo.getDevProductType();
        }
    }
}
