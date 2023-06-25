package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceProperty;", "", "Temperature", "", "Turn", "(Ljava/lang/String;Ljava/lang/String;)V", "getTemperature", "()Ljava/lang/String;", "getTurn", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SimpleDeviceProperty.kt */
public final class SimpleDeviceProperty {
    @NotNull
    public final String Temperature;
    @NotNull
    public final String Turn;

    public SimpleDeviceProperty(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "Temperature");
        Intrinsics.checkNotNullParameter(str2, "Turn");
        this.Temperature = str;
        this.Turn = str2;
    }

    public static /* synthetic */ SimpleDeviceProperty copy$default(SimpleDeviceProperty simpleDeviceProperty, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleDeviceProperty.Temperature;
        }
        if ((i & 2) != 0) {
            str2 = simpleDeviceProperty.Turn;
        }
        return simpleDeviceProperty.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.Temperature;
    }

    @NotNull
    public final String component2() {
        return this.Turn;
    }

    @NotNull
    public final SimpleDeviceProperty copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "Temperature");
        Intrinsics.checkNotNullParameter(str2, "Turn");
        return new SimpleDeviceProperty(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDeviceProperty)) {
            return false;
        }
        SimpleDeviceProperty simpleDeviceProperty = (SimpleDeviceProperty) obj;
        return Intrinsics.areEqual((Object) this.Temperature, (Object) simpleDeviceProperty.Temperature) && Intrinsics.areEqual((Object) this.Turn, (Object) simpleDeviceProperty.Turn);
    }

    @NotNull
    public final String getTemperature() {
        return this.Temperature;
    }

    @NotNull
    public final String getTurn() {
        return this.Turn;
    }

    public int hashCode() {
        return (this.Temperature.hashCode() * 31) + this.Turn.hashCode();
    }

    @NotNull
    public String toString() {
        return "SimpleDeviceProperty(Temperature=" + this.Temperature + ", Turn=" + this.Turn + ')';
    }
}
