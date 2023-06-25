package com.hisense.juconnect.app_socket.find;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006)"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/find/DevData;", "", "()V", "Barcode", "", "getBarcode", "()Ljava/lang/String;", "setBarcode", "(Ljava/lang/String;)V", "ConnPort", "", "getConnPort", "()Ljava/lang/Integer;", "setConnPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "DState", "getDState", "setDState", "DevId", "getDevId", "setDevId", "DevProductType", "getDevProductType", "setDevProductType", "DevType", "getDevType", "setDevType", "ExtData", "getExtData", "setExtData", "PDVer", "getPDVer", "setPDVer", "Uri", "getUri", "setUri", "format", "", "deviceData", "Lcom/hisense/juconnect/app_socket/find/BcWifiMessage;", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DevData.kt */
public final class DevData {
    @Nullable
    public String Barcode;
    @Nullable
    public Integer ConnPort;
    @Nullable
    public Integer DState;
    @Nullable
    public String DevId;
    @Nullable
    public String DevProductType;
    @Nullable
    public Integer DevType;
    @Nullable
    public Integer ExtData;
    @Nullable
    public String PDVer;
    @Nullable
    public String Uri;

    public final void format(@NotNull BcWifiMessage bcWifiMessage) {
        Intrinsics.checkNotNullParameter(bcWifiMessage, "deviceData");
    }

    public final void format(@NotNull DevData devData) {
        Intrinsics.checkNotNullParameter(devData, "deviceData");
        if (this.DevId == null) {
            this.DevId = devData.DevId;
        }
        if (this.Barcode == null) {
            this.Barcode = devData.Barcode;
        }
        if (this.DevType == null) {
            this.DevType = devData.DevType;
        }
        if (this.DState == null) {
            this.DState = devData.DState;
        }
        if (this.PDVer == null) {
            this.PDVer = devData.PDVer;
        }
        if (this.Uri == null) {
            this.Uri = devData.Uri;
        }
        if (this.ConnPort == null) {
            this.ConnPort = devData.ConnPort;
        }
        if (this.ExtData == null) {
            this.ExtData = devData.ExtData;
        }
        if (this.DevProductType == null) {
            this.DevProductType = devData.DevProductType;
        }
    }

    @Nullable
    public final String getBarcode() {
        return this.Barcode;
    }

    @Nullable
    public final Integer getConnPort() {
        return this.ConnPort;
    }

    @Nullable
    public final Integer getDState() {
        return this.DState;
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
    public final Integer getDevType() {
        return this.DevType;
    }

    @Nullable
    public final Integer getExtData() {
        return this.ExtData;
    }

    @Nullable
    public final String getPDVer() {
        return this.PDVer;
    }

    @Nullable
    public final String getUri() {
        return this.Uri;
    }

    public final void setBarcode(@Nullable String str) {
        this.Barcode = str;
    }

    public final void setConnPort(@Nullable Integer num) {
        this.ConnPort = num;
    }

    public final void setDState(@Nullable Integer num) {
        this.DState = num;
    }

    public final void setDevId(@Nullable String str) {
        this.DevId = str;
    }

    public final void setDevProductType(@Nullable String str) {
        this.DevProductType = str;
    }

    public final void setDevType(@Nullable Integer num) {
        this.DevType = num;
    }

    public final void setExtData(@Nullable Integer num) {
        this.ExtData = num;
    }

    public final void setPDVer(@Nullable String str) {
        this.PDVer = str;
    }

    public final void setUri(@Nullable String str) {
        this.Uri = str;
    }
}
