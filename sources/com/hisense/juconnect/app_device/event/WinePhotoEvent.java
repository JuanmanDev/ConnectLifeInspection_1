package com.hisense.juconnect.app_device.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/WinePhotoEvent;", "", "path", "", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WinePhotoEvent.kt */
public final class WinePhotoEvent {
    @NotNull
    public final String path;

    public WinePhotoEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "path");
        this.path = str;
    }

    public static /* synthetic */ WinePhotoEvent copy$default(WinePhotoEvent winePhotoEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = winePhotoEvent.path;
        }
        return winePhotoEvent.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.path;
    }

    @NotNull
    public final WinePhotoEvent copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "path");
        return new WinePhotoEvent(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinePhotoEvent) && Intrinsics.areEqual((Object) this.path, (Object) ((WinePhotoEvent) obj).path);
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    @NotNull
    public String toString() {
        return "WinePhotoEvent(path=" + this.path + ')';
    }
}
