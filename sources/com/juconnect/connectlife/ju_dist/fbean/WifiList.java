package com.juconnect.connectlife.ju_dist.fbean;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/fbean/WifiList;", "", "json", "", "end", "", "(Ljava/lang/String;Z)V", "data", "Ljava/util/LinkedList;", "Lcom/juconnect/connectlife/ju_dist/fbean/Wifi;", "getData", "()Ljava/util/LinkedList;", "setData", "(Ljava/util/LinkedList;)V", "endFlag", "getEndFlag", "()Ljava/lang/Boolean;", "setEndFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "errorCode", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "errorDesc", "getErrorDesc", "setErrorDesc", "resultCode", "", "getResultCode", "()Ljava/lang/Integer;", "setResultCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiList.kt */
public final class WifiList {
    @Nullable
    public LinkedList<Wifi> data;
    @Nullable
    public Boolean endFlag = Boolean.FALSE;
    @Nullable
    public String errorCode;
    @Nullable
    public String errorDesc;
    @Nullable
    public Integer resultCode;

    public WifiList(@Nullable String str, boolean z) {
        int i = 0;
        this.resultCode = 0;
        this.errorDesc = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("WiFiArr");
            this.data = new LinkedList<>();
            if (!(jSONArray == null || jSONArray.length() == 0)) {
                this.resultCode = 0;
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
            this.endFlag = Boolean.valueOf(z);
        } catch (JSONException e) {
            e.printStackTrace();
            this.errorDesc = e + str;
        }
    }

    @Nullable
    public final LinkedList<Wifi> getData() {
        return this.data;
    }

    @Nullable
    public final Boolean getEndFlag() {
        return this.endFlag;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    @Nullable
    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final void setData(@Nullable LinkedList<Wifi> linkedList) {
        this.data = linkedList;
    }

    public final void setEndFlag(@Nullable Boolean bool) {
        this.endFlag = bool;
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public final void setErrorDesc(@Nullable String str) {
        this.errorDesc = str;
    }

    public final void setResultCode(@Nullable Integer num) {
        this.resultCode = num;
    }
}
