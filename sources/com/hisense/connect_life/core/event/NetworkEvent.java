package com.hisense.connect_life.core.event;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/core/event/NetworkEvent;", "", "isValidate", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetworkEvent.kt */
public final class NetworkEvent {
    public final boolean isValidate;

    public NetworkEvent(boolean z) {
        this.isValidate = z;
    }

    public static /* synthetic */ NetworkEvent copy$default(NetworkEvent networkEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkEvent.isValidate;
        }
        return networkEvent.copy(z);
    }

    public final boolean component1() {
        return this.isValidate;
    }

    @NotNull
    public final NetworkEvent copy(boolean z) {
        return new NetworkEvent(z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkEvent) && this.isValidate == ((NetworkEvent) obj).isValidate;
    }

    public int hashCode() {
        boolean z = this.isValidate;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isValidate() {
        return this.isValidate;
    }

    @NotNull
    public String toString() {
        return "NetworkEvent(isValidate=" + this.isValidate + ')';
    }
}
