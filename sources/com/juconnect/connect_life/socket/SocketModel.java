package com.juconnect.connect_life.socket;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo47991d2 = {"Lcom/juconnect/connect_life/socket/SocketModel;", "", "path", "", "pingInterval", "", "(Ljava/lang/String;I)V", "getPath", "()Ljava/lang/String;", "getPingInterval", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SocketModel.kt */
public final class SocketModel {
    @NotNull
    public final String path;
    public final int pingInterval;

    public SocketModel(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        this.path = str;
        this.pingInterval = i;
    }

    public static /* synthetic */ SocketModel copy$default(SocketModel socketModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = socketModel.path;
        }
        if ((i2 & 2) != 0) {
            i = socketModel.pingInterval;
        }
        return socketModel.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.pingInterval;
    }

    @NotNull
    public final SocketModel copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        return new SocketModel(str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocketModel)) {
            return false;
        }
        SocketModel socketModel = (SocketModel) obj;
        return Intrinsics.areEqual((Object) this.path, (Object) socketModel.path) && this.pingInterval == socketModel.pingInterval;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final int getPingInterval() {
        return this.pingInterval;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + Integer.hashCode(this.pingInterval);
    }

    @NotNull
    public String toString() {
        return "SocketModel(path=" + this.path + ", pingInterval=" + this.pingInterval + ')';
    }
}
