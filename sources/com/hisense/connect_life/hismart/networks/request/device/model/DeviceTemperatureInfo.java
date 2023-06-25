package com.hisense.connect_life.hismart.networks.request.device.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceTemperatureInfo;", "", "deviceId", "", "onlineStatus", "", "Zone1SetTemperature", "Zone2SetTemperature", "Zone3SetTemperature", "Zone1RealHumidity", "Zone2RealHumidity", "Zone3RealHumidity", "temperatureUnit", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getZone1RealHumidity", "()Ljava/lang/String;", "getZone1SetTemperature", "getZone2RealHumidity", "getZone2SetTemperature", "getZone3RealHumidity", "getZone3SetTemperature", "getDeviceId", "getOnlineStatus", "()Z", "getTemperatureUnit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "device_temperature_info")
/* compiled from: DeviceTemperatureInfo.kt */
public final class DeviceTemperatureInfo {
    @NotNull
    public final String Zone1RealHumidity;
    @NotNull
    public final String Zone1SetTemperature;
    @NotNull
    public final String Zone2RealHumidity;
    @NotNull
    public final String Zone2SetTemperature;
    @NotNull
    public final String Zone3RealHumidity;
    @NotNull
    public final String Zone3SetTemperature;
    @NotNull
    @PrimaryKey(autoGenerate = false)
    public final String deviceId;
    public final boolean onlineStatus;
    @NotNull
    public final String temperatureUnit;

    public DeviceTemperatureInfo(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "Zone1SetTemperature");
        Intrinsics.checkNotNullParameter(str3, "Zone2SetTemperature");
        Intrinsics.checkNotNullParameter(str4, "Zone3SetTemperature");
        Intrinsics.checkNotNullParameter(str5, "Zone1RealHumidity");
        Intrinsics.checkNotNullParameter(str6, "Zone2RealHumidity");
        Intrinsics.checkNotNullParameter(str7, "Zone3RealHumidity");
        Intrinsics.checkNotNullParameter(str8, "temperatureUnit");
        this.deviceId = str;
        this.onlineStatus = z;
        this.Zone1SetTemperature = str2;
        this.Zone2SetTemperature = str3;
        this.Zone3SetTemperature = str4;
        this.Zone1RealHumidity = str5;
        this.Zone2RealHumidity = str6;
        this.Zone3RealHumidity = str7;
        this.temperatureUnit = str8;
    }

    public static /* synthetic */ DeviceTemperatureInfo copy$default(DeviceTemperatureInfo deviceTemperatureInfo, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        DeviceTemperatureInfo deviceTemperatureInfo2 = deviceTemperatureInfo;
        int i2 = i;
        return deviceTemperatureInfo.copy((i2 & 1) != 0 ? deviceTemperatureInfo2.deviceId : str, (i2 & 2) != 0 ? deviceTemperatureInfo2.onlineStatus : z, (i2 & 4) != 0 ? deviceTemperatureInfo2.Zone1SetTemperature : str2, (i2 & 8) != 0 ? deviceTemperatureInfo2.Zone2SetTemperature : str3, (i2 & 16) != 0 ? deviceTemperatureInfo2.Zone3SetTemperature : str4, (i2 & 32) != 0 ? deviceTemperatureInfo2.Zone1RealHumidity : str5, (i2 & 64) != 0 ? deviceTemperatureInfo2.Zone2RealHumidity : str6, (i2 & 128) != 0 ? deviceTemperatureInfo2.Zone3RealHumidity : str7, (i2 & 256) != 0 ? deviceTemperatureInfo2.temperatureUnit : str8);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    public final boolean component2() {
        return this.onlineStatus;
    }

    @NotNull
    public final String component3() {
        return this.Zone1SetTemperature;
    }

    @NotNull
    public final String component4() {
        return this.Zone2SetTemperature;
    }

    @NotNull
    public final String component5() {
        return this.Zone3SetTemperature;
    }

    @NotNull
    public final String component6() {
        return this.Zone1RealHumidity;
    }

    @NotNull
    public final String component7() {
        return this.Zone2RealHumidity;
    }

    @NotNull
    public final String component8() {
        return this.Zone3RealHumidity;
    }

    @NotNull
    public final String component9() {
        return this.temperatureUnit;
    }

    @NotNull
    public final DeviceTemperatureInfo copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "Zone1SetTemperature");
        Intrinsics.checkNotNullParameter(str3, "Zone2SetTemperature");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "Zone3SetTemperature");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "Zone1RealHumidity");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "Zone2RealHumidity");
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, "Zone3RealHumidity");
        String str13 = str8;
        Intrinsics.checkNotNullParameter(str13, "temperatureUnit");
        return new DeviceTemperatureInfo(str, z, str2, str3, str9, str10, str11, str12, str13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceTemperatureInfo)) {
            return false;
        }
        DeviceTemperatureInfo deviceTemperatureInfo = (DeviceTemperatureInfo) obj;
        return Intrinsics.areEqual((Object) this.deviceId, (Object) deviceTemperatureInfo.deviceId) && this.onlineStatus == deviceTemperatureInfo.onlineStatus && Intrinsics.areEqual((Object) this.Zone1SetTemperature, (Object) deviceTemperatureInfo.Zone1SetTemperature) && Intrinsics.areEqual((Object) this.Zone2SetTemperature, (Object) deviceTemperatureInfo.Zone2SetTemperature) && Intrinsics.areEqual((Object) this.Zone3SetTemperature, (Object) deviceTemperatureInfo.Zone3SetTemperature) && Intrinsics.areEqual((Object) this.Zone1RealHumidity, (Object) deviceTemperatureInfo.Zone1RealHumidity) && Intrinsics.areEqual((Object) this.Zone2RealHumidity, (Object) deviceTemperatureInfo.Zone2RealHumidity) && Intrinsics.areEqual((Object) this.Zone3RealHumidity, (Object) deviceTemperatureInfo.Zone3RealHumidity) && Intrinsics.areEqual((Object) this.temperatureUnit, (Object) deviceTemperatureInfo.temperatureUnit);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getOnlineStatus() {
        return this.onlineStatus;
    }

    @NotNull
    public final String getTemperatureUnit() {
        return this.temperatureUnit;
    }

    @NotNull
    public final String getZone1RealHumidity() {
        return this.Zone1RealHumidity;
    }

    @NotNull
    public final String getZone1SetTemperature() {
        return this.Zone1SetTemperature;
    }

    @NotNull
    public final String getZone2RealHumidity() {
        return this.Zone2RealHumidity;
    }

    @NotNull
    public final String getZone2SetTemperature() {
        return this.Zone2SetTemperature;
    }

    @NotNull
    public final String getZone3RealHumidity() {
        return this.Zone3RealHumidity;
    }

    @NotNull
    public final String getZone3SetTemperature() {
        return this.Zone3SetTemperature;
    }

    public int hashCode() {
        int hashCode = this.deviceId.hashCode() * 31;
        boolean z = this.onlineStatus;
        if (z) {
            z = true;
        }
        return ((((((((((((((hashCode + (z ? 1 : 0)) * 31) + this.Zone1SetTemperature.hashCode()) * 31) + this.Zone2SetTemperature.hashCode()) * 31) + this.Zone3SetTemperature.hashCode()) * 31) + this.Zone1RealHumidity.hashCode()) * 31) + this.Zone2RealHumidity.hashCode()) * 31) + this.Zone3RealHumidity.hashCode()) * 31) + this.temperatureUnit.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceTemperatureInfo(deviceId=" + this.deviceId + ", onlineStatus=" + this.onlineStatus + ", Zone1SetTemperature=" + this.Zone1SetTemperature + ", Zone2SetTemperature=" + this.Zone2SetTemperature + ", Zone3SetTemperature=" + this.Zone3SetTemperature + ", Zone1RealHumidity=" + this.Zone1RealHumidity + ", Zone2RealHumidity=" + this.Zone2RealHumidity + ", Zone3RealHumidity=" + this.Zone3RealHumidity + ", temperatureUnit=" + this.temperatureUnit + ')';
    }
}
