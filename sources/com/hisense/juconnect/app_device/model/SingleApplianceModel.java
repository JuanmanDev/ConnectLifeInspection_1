package com.hisense.juconnect.app_device.model;

import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/model/SingleApplianceModel;", "", "wifiId", "", "devId", "devType", "devProductType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevId", "()Ljava/lang/String;", "getDevProductType", "getDevType", "getWifiId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleApplianceModel.kt */
public final class SingleApplianceModel {
    @NotNull
    public final String devId;
    @NotNull
    public final String devProductType;
    @NotNull
    public final String devType;
    @NotNull
    public final String wifiId;

    public SingleApplianceModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "devId");
        Intrinsics.checkNotNullParameter(str3, "devType");
        Intrinsics.checkNotNullParameter(str4, "devProductType");
        this.wifiId = str;
        this.devId = str2;
        this.devType = str3;
        this.devProductType = str4;
    }

    public static /* synthetic */ SingleApplianceModel copy$default(SingleApplianceModel singleApplianceModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleApplianceModel.wifiId;
        }
        if ((i & 2) != 0) {
            str2 = singleApplianceModel.devId;
        }
        if ((i & 4) != 0) {
            str3 = singleApplianceModel.devType;
        }
        if ((i & 8) != 0) {
            str4 = singleApplianceModel.devProductType;
        }
        return singleApplianceModel.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.wifiId;
    }

    @NotNull
    public final String component2() {
        return this.devId;
    }

    @NotNull
    public final String component3() {
        return this.devType;
    }

    @NotNull
    public final String component4() {
        return this.devProductType;
    }

    @NotNull
    public final SingleApplianceModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "devId");
        Intrinsics.checkNotNullParameter(str3, "devType");
        Intrinsics.checkNotNullParameter(str4, "devProductType");
        return new SingleApplianceModel(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleApplianceModel)) {
            return false;
        }
        SingleApplianceModel singleApplianceModel = (SingleApplianceModel) obj;
        return Intrinsics.areEqual((Object) this.wifiId, (Object) singleApplianceModel.wifiId) && Intrinsics.areEqual((Object) this.devId, (Object) singleApplianceModel.devId) && Intrinsics.areEqual((Object) this.devType, (Object) singleApplianceModel.devType) && Intrinsics.areEqual((Object) this.devProductType, (Object) singleApplianceModel.devProductType);
    }

    @NotNull
    public final String getDevId() {
        return this.devId;
    }

    @NotNull
    public final String getDevProductType() {
        return this.devProductType;
    }

    @NotNull
    public final String getDevType() {
        return this.devType;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    public int hashCode() {
        return (((((this.wifiId.hashCode() * 31) + this.devId.hashCode()) * 31) + this.devType.hashCode()) * 31) + this.devProductType.hashCode();
    }

    @NotNull
    public String toString() {
        return "SingleApplianceModel(wifiId=" + this.wifiId + ", devId=" + this.devId + ", devType=" + this.devType + ", devProductType=" + this.devProductType + ')';
    }
}
