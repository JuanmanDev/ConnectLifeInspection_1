package com.hisense.juconnect.app_device.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/UnbindMsg;", "", "deviceId", "", "warning", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getWarning", "setWarning", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UnbindMsg.kt */
public final class UnbindMsg {
    @NotNull
    public String deviceId;
    @NotNull
    public String warning;

    public UnbindMsg(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "warning");
        this.deviceId = str;
        this.warning = str2;
    }

    public static /* synthetic */ UnbindMsg copy$default(UnbindMsg unbindMsg, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unbindMsg.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = unbindMsg.warning;
        }
        return unbindMsg.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    @NotNull
    public final String component2() {
        return this.warning;
    }

    @NotNull
    public final UnbindMsg copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "warning");
        return new UnbindMsg(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnbindMsg)) {
            return false;
        }
        UnbindMsg unbindMsg = (UnbindMsg) obj;
        return Intrinsics.areEqual((Object) this.deviceId, (Object) unbindMsg.deviceId) && Intrinsics.areEqual((Object) this.warning, (Object) unbindMsg.warning);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getWarning() {
        return this.warning;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.warning.hashCode();
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setWarning(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.warning = str;
    }

    @NotNull
    public String toString() {
        return "UnbindMsg(deviceId=" + this.deviceId + ", warning=" + this.warning + ')';
    }
}
