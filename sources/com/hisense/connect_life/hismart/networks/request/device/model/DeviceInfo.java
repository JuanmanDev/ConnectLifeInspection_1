package com.hisense.connect_life.hismart.networks.request.device.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B©\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0013HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0013HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003JÍ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\b\u0010N\u001a\u00020\u0013H\u0016J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\b\u0010S\u001a\u00020\u0013H\u0016J\b\u0010T\u001a\u00020\u0007H\u0016J\u0018\u0010U\u001a\u00020V2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0013H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010*R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u001a\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010*\"\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001f¨\u0006Y"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "bindDate", "", "brandCode", "brandName", "deviceCode", "deviceId", "deviceName", "deviceNickName", "deviceSubTypeCode", "deviceTypeCode", "deviceTypeName", "featureCode", "isAdmin", "", "ownerId", "roomId", "roomName", "wifiId", "showErrorIcon", "properties", "Lcom/google/gson/JsonObject;", "onlineStatus", "Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/google/gson/JsonObject;Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;)V", "getBindDate", "()Ljava/lang/String;", "getBrandCode", "getBrandName", "getDeviceCode", "getDeviceId", "getDeviceName", "getDeviceNickName", "getDeviceSubTypeCode", "getDeviceTypeCode", "getDeviceTypeName", "getFeatureCode", "()I", "getOnlineStatus", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;", "setOnlineStatus", "(Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;)V", "getOwnerId", "getProperties", "()Lcom/google/gson/JsonObject;", "setProperties", "(Lcom/google/gson/JsonObject;)V", "getRoomId", "getRoomName", "getShowErrorIcon", "setShowErrorIcon", "(I)V", "getWifiId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceInfo.kt */
public final class DeviceInfo implements Parcelable {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
    @NotNull
    public final String bindDate;
    @NotNull
    public final String brandCode;
    @NotNull
    public final String brandName;
    @NotNull
    public final String deviceCode;
    @NotNull
    public final String deviceId;
    @NotNull
    public final String deviceName;
    @NotNull
    public final String deviceNickName;
    @NotNull
    public final String deviceSubTypeCode;
    @NotNull
    public final String deviceTypeCode;
    @NotNull
    public final String deviceTypeName;
    @Nullable
    public final String featureCode;
    public final int isAdmin;
    @Nullable
    public OnlineStatus onlineStatus;
    @NotNull
    public final String ownerId;
    @Nullable
    public JsonObject properties;
    public final int roomId;
    @NotNull
    public final String roomName;
    public int showErrorIcon;
    @NotNull
    public final String wifiId;

    @Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DeviceInfo.kt */
    public static final class CREATOR implements Parcelable.Creator<DeviceInfo> {
        public CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public DeviceInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceInfo(parcel);
        }

        @NotNull
        public DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    }

    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @Nullable String str11, int i, @NotNull String str12, int i2, @NotNull String str13, @NotNull String str14, int i3, @Nullable JsonObject jsonObject, @Nullable OnlineStatus onlineStatus2) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str12;
        String str26 = str13;
        String str27 = str14;
        Intrinsics.checkNotNullParameter(str15, "bindDate");
        Intrinsics.checkNotNullParameter(str16, "brandCode");
        Intrinsics.checkNotNullParameter(str17, "brandName");
        Intrinsics.checkNotNullParameter(str18, "deviceCode");
        Intrinsics.checkNotNullParameter(str19, "deviceId");
        Intrinsics.checkNotNullParameter(str20, "deviceName");
        Intrinsics.checkNotNullParameter(str21, "deviceNickName");
        Intrinsics.checkNotNullParameter(str22, "deviceSubTypeCode");
        Intrinsics.checkNotNullParameter(str23, "deviceTypeCode");
        Intrinsics.checkNotNullParameter(str24, "deviceTypeName");
        Intrinsics.checkNotNullParameter(str25, "ownerId");
        Intrinsics.checkNotNullParameter(str26, "roomName");
        Intrinsics.checkNotNullParameter(str27, EventBusConstKt.WIFIID);
        this.bindDate = str15;
        this.brandCode = str16;
        this.brandName = str17;
        this.deviceCode = str18;
        this.deviceId = str19;
        this.deviceName = str20;
        this.deviceNickName = str21;
        this.deviceSubTypeCode = str22;
        this.deviceTypeCode = str23;
        this.deviceTypeName = str24;
        this.featureCode = str11;
        this.isAdmin = i;
        this.ownerId = str25;
        this.roomId = i2;
        this.roomName = str26;
        this.wifiId = str27;
        this.showErrorIcon = i3;
        this.properties = jsonObject;
        this.onlineStatus = onlineStatus2;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12, int i2, String str13, String str14, int i3, JsonObject jsonObject, OnlineStatus onlineStatus2, int i4, Object obj) {
        DeviceInfo deviceInfo2 = deviceInfo;
        int i5 = i4;
        return deviceInfo.copy((i5 & 1) != 0 ? deviceInfo2.bindDate : str, (i5 & 2) != 0 ? deviceInfo2.brandCode : str2, (i5 & 4) != 0 ? deviceInfo2.brandName : str3, (i5 & 8) != 0 ? deviceInfo2.deviceCode : str4, (i5 & 16) != 0 ? deviceInfo2.deviceId : str5, (i5 & 32) != 0 ? deviceInfo2.deviceName : str6, (i5 & 64) != 0 ? deviceInfo2.deviceNickName : str7, (i5 & 128) != 0 ? deviceInfo2.deviceSubTypeCode : str8, (i5 & 256) != 0 ? deviceInfo2.deviceTypeCode : str9, (i5 & 512) != 0 ? deviceInfo2.deviceTypeName : str10, (i5 & 1024) != 0 ? deviceInfo2.featureCode : str11, (i5 & 2048) != 0 ? deviceInfo2.isAdmin : i, (i5 & 4096) != 0 ? deviceInfo2.ownerId : str12, (i5 & 8192) != 0 ? deviceInfo2.roomId : i2, (i5 & 16384) != 0 ? deviceInfo2.roomName : str13, (i5 & 32768) != 0 ? deviceInfo2.wifiId : str14, (i5 & 65536) != 0 ? deviceInfo2.showErrorIcon : i3, (i5 & 131072) != 0 ? deviceInfo2.properties : jsonObject, (i5 & 262144) != 0 ? deviceInfo2.onlineStatus : onlineStatus2);
    }

    @NotNull
    public final String component1() {
        return this.bindDate;
    }

    @NotNull
    public final String component10() {
        return this.deviceTypeName;
    }

    @Nullable
    public final String component11() {
        return this.featureCode;
    }

    public final int component12() {
        return this.isAdmin;
    }

    @NotNull
    public final String component13() {
        return this.ownerId;
    }

    public final int component14() {
        return this.roomId;
    }

    @NotNull
    public final String component15() {
        return this.roomName;
    }

    @NotNull
    public final String component16() {
        return this.wifiId;
    }

    public final int component17() {
        return this.showErrorIcon;
    }

    @Nullable
    public final JsonObject component18() {
        return this.properties;
    }

    @Nullable
    public final OnlineStatus component19() {
        return this.onlineStatus;
    }

    @NotNull
    public final String component2() {
        return this.brandCode;
    }

    @NotNull
    public final String component3() {
        return this.brandName;
    }

    @NotNull
    public final String component4() {
        return this.deviceCode;
    }

    @NotNull
    public final String component5() {
        return this.deviceId;
    }

    @NotNull
    public final String component6() {
        return this.deviceName;
    }

    @NotNull
    public final String component7() {
        return this.deviceNickName;
    }

    @NotNull
    public final String component8() {
        return this.deviceSubTypeCode;
    }

    @NotNull
    public final String component9() {
        return this.deviceTypeCode;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @Nullable String str11, int i, @NotNull String str12, int i2, @NotNull String str13, @NotNull String str14, int i3, @Nullable JsonObject jsonObject, @Nullable OnlineStatus onlineStatus2) {
        String str15 = str;
        Intrinsics.checkNotNullParameter(str15, "bindDate");
        Intrinsics.checkNotNullParameter(str2, "brandCode");
        Intrinsics.checkNotNullParameter(str3, "brandName");
        Intrinsics.checkNotNullParameter(str4, "deviceCode");
        Intrinsics.checkNotNullParameter(str5, "deviceId");
        Intrinsics.checkNotNullParameter(str6, "deviceName");
        Intrinsics.checkNotNullParameter(str7, "deviceNickName");
        Intrinsics.checkNotNullParameter(str8, "deviceSubTypeCode");
        Intrinsics.checkNotNullParameter(str9, "deviceTypeCode");
        Intrinsics.checkNotNullParameter(str10, "deviceTypeName");
        Intrinsics.checkNotNullParameter(str12, "ownerId");
        Intrinsics.checkNotNullParameter(str13, "roomName");
        Intrinsics.checkNotNullParameter(str14, EventBusConstKt.WIFIID);
        return new DeviceInfo(str15, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, i, str12, i2, str13, str14, i3, jsonObject, onlineStatus2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) DeviceInfo.class, (Object) obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            return Intrinsics.areEqual((Object) this.deviceId, (Object) ((DeviceInfo) obj).deviceId);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo");
    }

    @NotNull
    public final String getBindDate() {
        return this.bindDate;
    }

    @NotNull
    public final String getBrandCode() {
        return this.brandCode;
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    public final String getDeviceCode() {
        return this.deviceCode;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getDeviceNickName() {
        return this.deviceNickName;
    }

    @NotNull
    public final String getDeviceSubTypeCode() {
        return this.deviceSubTypeCode;
    }

    @NotNull
    public final String getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    @NotNull
    public final String getDeviceTypeName() {
        return this.deviceTypeName;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final OnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @NotNull
    public final String getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final JsonObject getProperties() {
        return this.properties;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    public final int getShowErrorIcon() {
        return this.showErrorIcon;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    public int hashCode() {
        return this.deviceId.hashCode();
    }

    public final int isAdmin() {
        return this.isAdmin;
    }

    public final void setOnlineStatus(@Nullable OnlineStatus onlineStatus2) {
        this.onlineStatus = onlineStatus2;
    }

    public final void setProperties(@Nullable JsonObject jsonObject) {
        this.properties = jsonObject;
    }

    public final void setShowErrorIcon(int i) {
        this.showErrorIcon = i;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(bindDate='" + this.bindDate + "', brandCode='" + this.brandCode + "', brandName='" + this.brandName + "', deviceCode='" + this.deviceCode + "', deviceId='" + this.deviceId + "', deviceName='" + this.deviceName + "', deviceNickName='" + this.deviceNickName + "', deviceSubTypeCode='" + this.deviceSubTypeCode + "', deviceTypeCode='" + this.deviceTypeCode + "', deviceTypeName='" + this.deviceTypeName + "', isAdmin=" + this.isAdmin + ", ownerId=" + this.ownerId + ", roomId=" + this.roomId + ", roomName='" + this.roomName + "', wifiId='" + this.wifiId + "', properties=" + this.properties + ", featureCode=" + this.featureCode + ", onlineStatus=" + this.onlineStatus + ')';
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.bindDate);
        parcel.writeString(this.brandCode);
        parcel.writeString(this.brandName);
        parcel.writeString(this.deviceCode);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceNickName);
        parcel.writeString(this.deviceSubTypeCode);
        parcel.writeString(this.deviceTypeCode);
        parcel.writeString(this.deviceTypeName);
        parcel.writeString(this.featureCode);
        parcel.writeInt(this.isAdmin);
        parcel.writeString(this.ownerId);
        parcel.writeInt(this.roomId);
        parcel.writeString(this.roomName);
        parcel.writeString(this.wifiId);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12, int i2, String str13, String str14, int i3, JsonObject jsonObject, OnlineStatus onlineStatus2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, i, str12, i2, str13, str14, (i4 & 65536) != 0 ? 0 : i3, (i4 & 131072) != 0 ? null : jsonObject, (i4 & 262144) != 0 ? OnlineStatus.OFFLINE : onlineStatus2);
    }

    public DeviceInfo() {
        this("", "", "", "", "", "", "", "", "", "", "", 0, "", 0, "", "", 0, (JsonObject) null, (OnlineStatus) null, 458752, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeviceInfo(@org.jetbrains.annotations.NotNull android.os.Parcel r26) {
        /*
            r25 = this;
            java.lang.String r0 = "parcel"
            r1 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r26.readString()
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0011
            r4 = r2
            goto L_0x0012
        L_0x0011:
            r4 = r0
        L_0x0012:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x001a
            r5 = r2
            goto L_0x001b
        L_0x001a:
            r5 = r0
        L_0x001b:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0023
            r6 = r2
            goto L_0x0024
        L_0x0023:
            r6 = r0
        L_0x0024:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r0
        L_0x002d:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0035
            r8 = r2
            goto L_0x0036
        L_0x0035:
            r8 = r0
        L_0x0036:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x003e
            r9 = r2
            goto L_0x003f
        L_0x003e:
            r9 = r0
        L_0x003f:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0047
            r10 = r2
            goto L_0x0048
        L_0x0047:
            r10 = r0
        L_0x0048:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0050
            r11 = r2
            goto L_0x0051
        L_0x0050:
            r11 = r0
        L_0x0051:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0059
            r12 = r2
            goto L_0x005a
        L_0x0059:
            r12 = r0
        L_0x005a:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0062
            r13 = r2
            goto L_0x0063
        L_0x0062:
            r13 = r0
        L_0x0063:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x006b
            r14 = r2
            goto L_0x006c
        L_0x006b:
            r14 = r0
        L_0x006c:
            int r15 = r26.readInt()
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0079
            r16 = r2
            goto L_0x007b
        L_0x0079:
            r16 = r0
        L_0x007b:
            int r17 = r26.readInt()
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0088
            r18 = r2
            goto L_0x008a
        L_0x0088:
            r18 = r0
        L_0x008a:
            java.lang.String r0 = r26.readString()
            if (r0 != 0) goto L_0x0093
            r19 = r2
            goto L_0x0095
        L_0x0093:
            r19 = r0
        L_0x0095:
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 458752(0x70000, float:6.42848E-40)
            r24 = 0
            r3 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo.<init>(android.os.Parcel):void");
    }
}
