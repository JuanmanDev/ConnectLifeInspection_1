package com.hisense.juconnect.app_device.event;

import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/GoNotification;", "", "wifiId", "", "deviceId", "refresh", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getRefresh", "setRefresh", "getWifiId", "setWifiId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GoNotification.kt */
public final class GoNotification {
    @NotNull
    public String deviceId;
    @NotNull
    public String refresh;
    @NotNull
    public String wifiId;

    public GoNotification(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "refresh");
        this.wifiId = str;
        this.deviceId = str2;
        this.refresh = str3;
    }

    public static /* synthetic */ GoNotification copy$default(GoNotification goNotification, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goNotification.wifiId;
        }
        if ((i & 2) != 0) {
            str2 = goNotification.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = goNotification.refresh;
        }
        return goNotification.copy(str, str2, str3);
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
        return this.refresh;
    }

    @NotNull
    public final GoNotification copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "refresh");
        return new GoNotification(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoNotification)) {
            return false;
        }
        GoNotification goNotification = (GoNotification) obj;
        return Intrinsics.areEqual((Object) this.wifiId, (Object) goNotification.wifiId) && Intrinsics.areEqual((Object) this.deviceId, (Object) goNotification.deviceId) && Intrinsics.areEqual((Object) this.refresh, (Object) goNotification.refresh);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getRefresh() {
        return this.refresh;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    public int hashCode() {
        return (((this.wifiId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.refresh.hashCode();
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setRefresh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refresh = str;
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }

    @NotNull
    public String toString() {
        return "GoNotification(wifiId=" + this.wifiId + ", deviceId=" + this.deviceId + ", refresh=" + this.refresh + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoNotification(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "1" : str3);
    }
}
