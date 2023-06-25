package com.hisense.connect_life.hismart.networks.request.device.model;

import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ShareDeviceInfo;", "", "wifiId", "", "deviceId", "deviceTypeCode", "deviceNickName", "userList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "getDeviceNickName", "getDeviceTypeCode", "getUserList", "()Ljava/util/List;", "getWifiId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ShareDeviceInfo.kt */
public final class ShareDeviceInfo {
    @NotNull
    public final String deviceId;
    @NotNull
    public final String deviceNickName;
    @NotNull
    public final String deviceTypeCode;
    @NotNull
    public final List<UserInfo> userList;
    @NotNull
    public final String wifiId;

    public ShareDeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<UserInfo> list) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "deviceTypeCode");
        Intrinsics.checkNotNullParameter(str4, "deviceNickName");
        Intrinsics.checkNotNullParameter(list, "userList");
        this.wifiId = str;
        this.deviceId = str2;
        this.deviceTypeCode = str3;
        this.deviceNickName = str4;
        this.userList = list;
    }

    public static /* synthetic */ ShareDeviceInfo copy$default(ShareDeviceInfo shareDeviceInfo, String str, String str2, String str3, String str4, List<UserInfo> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareDeviceInfo.wifiId;
        }
        if ((i & 2) != 0) {
            str2 = shareDeviceInfo.deviceId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = shareDeviceInfo.deviceTypeCode;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = shareDeviceInfo.deviceNickName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = shareDeviceInfo.userList;
        }
        return shareDeviceInfo.copy(str, str5, str6, str7, list);
    }

    @NotNull
    public final String component1() {
        return this.wifiId;
    }

    @NotNull
    public final String component2() {
        return this.deviceId;
    }

    @NotNull
    public final String component3() {
        return this.deviceTypeCode;
    }

    @NotNull
    public final String component4() {
        return this.deviceNickName;
    }

    @NotNull
    public final List<UserInfo> component5() {
        return this.userList;
    }

    @NotNull
    public final ShareDeviceInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<UserInfo> list) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "deviceTypeCode");
        Intrinsics.checkNotNullParameter(str4, "deviceNickName");
        Intrinsics.checkNotNullParameter(list, "userList");
        return new ShareDeviceInfo(str, str2, str3, str4, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareDeviceInfo)) {
            return false;
        }
        ShareDeviceInfo shareDeviceInfo = (ShareDeviceInfo) obj;
        return Intrinsics.areEqual((Object) this.wifiId, (Object) shareDeviceInfo.wifiId) && Intrinsics.areEqual((Object) this.deviceId, (Object) shareDeviceInfo.deviceId) && Intrinsics.areEqual((Object) this.deviceTypeCode, (Object) shareDeviceInfo.deviceTypeCode) && Intrinsics.areEqual((Object) this.deviceNickName, (Object) shareDeviceInfo.deviceNickName) && Intrinsics.areEqual((Object) this.userList, (Object) shareDeviceInfo.userList);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceNickName() {
        return this.deviceNickName;
    }

    @NotNull
    public final String getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    @NotNull
    public final List<UserInfo> getUserList() {
        return this.userList;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    public int hashCode() {
        return (((((((this.wifiId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.deviceTypeCode.hashCode()) * 31) + this.deviceNickName.hashCode()) * 31) + this.userList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ShareDeviceInfo(wifiId=" + this.wifiId + ", deviceId=" + this.deviceId + ", deviceTypeCode=" + this.deviceTypeCode + ", deviceNickName=" + this.deviceNickName + ", userList=" + this.userList + ')';
    }
}
