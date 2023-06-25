package com.hisense.connect_life.hismart.networks.request.message.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "", "status", "", "wifiid", "deviceid", "properties", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;)V", "getDeviceid", "()Ljava/lang/String;", "getProperties", "()Lcom/google/gson/JsonObject;", "getStatus", "getWifiid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceStatusMessage.kt */
public final class DeviceStatusMessage {
    @NotNull
    public final String deviceid;
    @NotNull
    public final JsonObject properties;
    @NotNull
    public final String status;
    @NotNull
    public final String wifiid;

    public DeviceStatusMessage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        Intrinsics.checkNotNullParameter(str3, "deviceid");
        Intrinsics.checkNotNullParameter(jsonObject, "properties");
        this.status = str;
        this.wifiid = str2;
        this.deviceid = str3;
        this.properties = jsonObject;
    }

    public static /* synthetic */ DeviceStatusMessage copy$default(DeviceStatusMessage deviceStatusMessage, String str, String str2, String str3, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceStatusMessage.status;
        }
        if ((i & 2) != 0) {
            str2 = deviceStatusMessage.wifiid;
        }
        if ((i & 4) != 0) {
            str3 = deviceStatusMessage.deviceid;
        }
        if ((i & 8) != 0) {
            jsonObject = deviceStatusMessage.properties;
        }
        return deviceStatusMessage.copy(str, str2, str3, jsonObject);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.wifiid;
    }

    @NotNull
    public final String component3() {
        return this.deviceid;
    }

    @NotNull
    public final JsonObject component4() {
        return this.properties;
    }

    @NotNull
    public final DeviceStatusMessage copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        Intrinsics.checkNotNullParameter(str3, "deviceid");
        Intrinsics.checkNotNullParameter(jsonObject, "properties");
        return new DeviceStatusMessage(str, str2, str3, jsonObject);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceStatusMessage)) {
            return false;
        }
        DeviceStatusMessage deviceStatusMessage = (DeviceStatusMessage) obj;
        return Intrinsics.areEqual((Object) this.status, (Object) deviceStatusMessage.status) && Intrinsics.areEqual((Object) this.wifiid, (Object) deviceStatusMessage.wifiid) && Intrinsics.areEqual((Object) this.deviceid, (Object) deviceStatusMessage.deviceid) && Intrinsics.areEqual((Object) this.properties, (Object) deviceStatusMessage.properties);
    }

    @NotNull
    public final String getDeviceid() {
        return this.deviceid;
    }

    @NotNull
    public final JsonObject getProperties() {
        return this.properties;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getWifiid() {
        return this.wifiid;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.wifiid.hashCode()) * 31) + this.deviceid.hashCode()) * 31) + this.properties.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceStatusMessage(status=" + this.status + ", wifiid=" + this.wifiid + ", deviceid=" + this.deviceid + ", properties=" + this.properties + ')';
    }
}
