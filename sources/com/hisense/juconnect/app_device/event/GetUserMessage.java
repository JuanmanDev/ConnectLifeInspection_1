package com.hisense.juconnect.app_device.event;

import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/GetUserMessage;", "", "wifiId", "", "deviceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getWifiId", "setWifiId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GetUserMessage.kt */
public final class GetUserMessage {
    @NotNull
    public String deviceId;
    @NotNull
    public String wifiId;

    public GetUserMessage(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        this.wifiId = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ GetUserMessage copy$default(GetUserMessage getUserMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUserMessage.wifiId;
        }
        if ((i & 2) != 0) {
            str2 = getUserMessage.deviceId;
        }
        return getUserMessage.copy(str, str2);
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
    public final GetUserMessage copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        return new GetUserMessage(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserMessage)) {
            return false;
        }
        GetUserMessage getUserMessage = (GetUserMessage) obj;
        return Intrinsics.areEqual((Object) this.wifiId, (Object) getUserMessage.wifiId) && Intrinsics.areEqual((Object) this.deviceId, (Object) getUserMessage.deviceId);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    public int hashCode() {
        return (this.wifiId.hashCode() * 31) + this.deviceId.hashCode();
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }

    @NotNull
    public String toString() {
        return "GetUserMessage(wifiId=" + this.wifiId + ", deviceId=" + this.deviceId + ')';
    }
}
