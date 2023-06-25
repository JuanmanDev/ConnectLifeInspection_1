package com.hisense.juconnect.app_socket.fbean;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/WifiList;", "", "json", "", "(Ljava/lang/String;)V", "data", "Ljava/util/LinkedList;", "Lcom/hisense/juconnect/app_socket/fbean/Wifi;", "getData", "()Ljava/util/LinkedList;", "setData", "(Ljava/util/LinkedList;)V", "errorCode", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "errorDes", "getErrorDes", "setErrorDes", "resultCode", "getResultCode", "setResultCode", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiList.kt */
public final class WifiList {
    @Nullable
    public LinkedList<Wifi> data;
    @Nullable
    public String errorCode;
    @Nullable
    public String errorDes;
    @Nullable
    public String resultCode;

    public WifiList(@Nullable String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("WiFiArr");
            this.data = new LinkedList<>();
            if (!(jSONArray == null || jSONArray.length() == 0)) {
                int i = 0;
                int length = jSONArray.length();
                while (i < length) {
                    int i2 = i + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject1");
                    Wifi wifi = new Wifi(jSONObject2);
                    LinkedList<Wifi> linkedList = this.data;
                    Intrinsics.checkNotNull(linkedList);
                    linkedList.add(wifi);
                    i = i2;
                }
            }
            this.errorCode = jSONObject.getString("Err");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final LinkedList<Wifi> getData() {
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

    public final void setData(@Nullable LinkedList<Wifi> linkedList) {
        this.data = linkedList;
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
}
