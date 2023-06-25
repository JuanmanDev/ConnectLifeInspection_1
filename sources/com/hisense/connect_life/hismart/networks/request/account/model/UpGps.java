package com.hisense.connect_life.hismart.networks.request.account.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;", "Ljava/io/Serializable;", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/String;", "setLatitude", "(Ljava/lang/String;)V", "getLongitude", "setLongitude", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpGps.kt */
public final class UpGps implements Serializable {
    @NotNull
    public String latitude;
    @NotNull
    public String longitude;

    public UpGps() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public UpGps(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "latitude");
        Intrinsics.checkNotNullParameter(str2, "longitude");
        this.latitude = str;
        this.longitude = str2;
    }

    public static /* synthetic */ UpGps copy$default(UpGps upGps, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upGps.latitude;
        }
        if ((i & 2) != 0) {
            str2 = upGps.longitude;
        }
        return upGps.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.latitude;
    }

    @NotNull
    public final String component2() {
        return this.longitude;
    }

    @NotNull
    public final UpGps copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "latitude");
        Intrinsics.checkNotNullParameter(str2, "longitude");
        return new UpGps(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpGps)) {
            return false;
        }
        UpGps upGps = (UpGps) obj;
        return Intrinsics.areEqual((Object) this.latitude, (Object) upGps.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) upGps.longitude);
    }

    @NotNull
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final String getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (this.latitude.hashCode() * 31) + this.longitude.hashCode();
    }

    public final void setLatitude(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.latitude = str;
    }

    public final void setLongitude(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.longitude = str;
    }

    @NotNull
    public String toString() {
        return "UpGps(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpGps(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0.0" : str, (i & 2) != 0 ? "0.0" : str2);
    }
}
