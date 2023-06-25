package com.juconnect.connectlife.ju_dist.find;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00104\u001a\u00020\u0000J\u0006\u00105\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001e\u0010\"\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001e\u0010%\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001e\u0010+\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\b¨\u00066"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/find/BcWifiMessage;", "", "()V", "CInfo", "", "getCInfo", "()Ljava/lang/String;", "setCInfo", "(Ljava/lang/String;)V", "ConnPort", "", "getConnPort", "()Ljava/lang/Integer;", "setConnPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "DevList", "", "Lcom/juconnect/connectlife/ju_dist/find/DevData;", "getDevList", "()Ljava/util/List;", "setDevList", "(Ljava/util/List;)V", "DevPData", "getDevPData", "()Lcom/juconnect/connectlife/ju_dist/find/DevData;", "setDevPData", "(Lcom/juconnect/connectlife/ju_dist/find/DevData;)V", "ExID", "getExID", "setExID", "HCause", "getHCause", "setHCause", "HState", "getHState", "setHState", "HType", "getHType", "setHType", "PLVer", "getPLVer", "setPLVer", "RID", "getRID", "setRID", "Uri", "getUri", "setUri", "WiFiId", "getWiFiId", "setWiFiId", "formatMessage", "toJson", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BcWifiMessage.kt */
public final class BcWifiMessage {
    @Nullable
    public String CInfo;
    @Nullable
    public Integer ConnPort;
    @Nullable
    public List<DevData> DevList;
    @Nullable
    public DevData DevPData;
    @Nullable
    public Integer ExID;
    @Nullable
    public String HCause;
    @Nullable
    public Integer HState;
    @Nullable
    public Integer HType;
    @Nullable
    public String PLVer;
    @Nullable
    public Integer RID;
    @Nullable
    public String Uri;
    @Nullable
    public String WiFiId;

    @NotNull
    public final BcWifiMessage formatMessage() {
        List<DevData> list;
        if (this.DevPData == null) {
            this.DevPData = new DevData();
        }
        if (this.DevPData != null && this.DevList == null) {
            ArrayList arrayList = new ArrayList();
            DevData devData = this.DevPData;
            Intrinsics.checkNotNull(devData);
            arrayList.add(devData);
            this.DevList = arrayList;
        } else if (!(this.DevPData == null || (list = this.DevList) == null || list == null)) {
            for (DevData devData2 : list) {
                if (devData2 != null) {
                    DevData devPData = getDevPData();
                    Intrinsics.checkNotNull(devPData);
                    devData2.format(devPData);
                }
            }
        }
        return this;
    }

    @Nullable
    public final String getCInfo() {
        return this.CInfo;
    }

    @Nullable
    public final Integer getConnPort() {
        return this.ConnPort;
    }

    @Nullable
    public final List<DevData> getDevList() {
        return this.DevList;
    }

    @Nullable
    public final DevData getDevPData() {
        return this.DevPData;
    }

    @Nullable
    public final Integer getExID() {
        return this.ExID;
    }

    @Nullable
    public final String getHCause() {
        return this.HCause;
    }

    @Nullable
    public final Integer getHState() {
        return this.HState;
    }

    @Nullable
    public final Integer getHType() {
        return this.HType;
    }

    @Nullable
    public final String getPLVer() {
        return this.PLVer;
    }

    @Nullable
    public final Integer getRID() {
        return this.RID;
    }

    @Nullable
    public final String getUri() {
        return this.Uri;
    }

    @Nullable
    public final String getWiFiId() {
        return this.WiFiId;
    }

    public final void setCInfo(@Nullable String str) {
        this.CInfo = str;
    }

    public final void setConnPort(@Nullable Integer num) {
        this.ConnPort = num;
    }

    public final void setDevList(@Nullable List<DevData> list) {
        this.DevList = list;
    }

    public final void setDevPData(@Nullable DevData devData) {
        this.DevPData = devData;
    }

    public final void setExID(@Nullable Integer num) {
        this.ExID = num;
    }

    public final void setHCause(@Nullable String str) {
        this.HCause = str;
    }

    public final void setHState(@Nullable Integer num) {
        this.HState = num;
    }

    public final void setHType(@Nullable Integer num) {
        this.HType = num;
    }

    public final void setPLVer(@Nullable String str) {
        this.PLVer = str;
    }

    public final void setRID(@Nullable Integer num) {
        this.RID = num;
    }

    public final void setUri(@Nullable String str) {
        this.Uri = str;
    }

    public final void setWiFiId(@Nullable String str) {
        this.WiFiId = str;
    }

    @NotNull
    public final String toJson() {
        String json = new Gson().toJson((Object) this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }
}
