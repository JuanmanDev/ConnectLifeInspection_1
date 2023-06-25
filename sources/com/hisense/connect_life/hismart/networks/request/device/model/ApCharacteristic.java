package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u000fHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00061"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApCharacteristic;", "", "color", "", "country", "dimensions", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApDimension;", "energyClass", "inputVoltage", "material", "maxConnectingPower", "", "purchasingAndWarrantyData", "Lcom/hisense/connect_life/hismart/networks/request/device/model/PurchasingAndWarrantyData;", "weight", "", "weightUnitOfMeasure", "(Ljava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/device/model/ApDimension;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/hisense/connect_life/hismart/networks/request/device/model/PurchasingAndWarrantyData;ILjava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getCountry", "getDimensions", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/ApDimension;", "getEnergyClass", "getInputVoltage", "getMaterial", "getMaxConnectingPower", "()J", "getPurchasingAndWarrantyData", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/PurchasingAndWarrantyData;", "getWeight", "()I", "getWeightUnitOfMeasure", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApCharacteristic.kt */
public final class ApCharacteristic {
    @NotNull
    public final String color;
    @NotNull
    public final String country;
    @NotNull
    public final ApDimension dimensions;
    @NotNull
    public final String energyClass;
    @NotNull
    public final String inputVoltage;
    @NotNull
    public final String material;
    public final long maxConnectingPower;
    @NotNull
    public final PurchasingAndWarrantyData purchasingAndWarrantyData;
    public final int weight;
    @NotNull
    public final String weightUnitOfMeasure;

    public ApCharacteristic(@NotNull String str, @NotNull String str2, @NotNull ApDimension apDimension, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull PurchasingAndWarrantyData purchasingAndWarrantyData2, int i, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "color");
        Intrinsics.checkNotNullParameter(str2, "country");
        Intrinsics.checkNotNullParameter(apDimension, "dimensions");
        Intrinsics.checkNotNullParameter(str3, "energyClass");
        Intrinsics.checkNotNullParameter(str4, "inputVoltage");
        Intrinsics.checkNotNullParameter(str5, "material");
        Intrinsics.checkNotNullParameter(purchasingAndWarrantyData2, "purchasingAndWarrantyData");
        Intrinsics.checkNotNullParameter(str6, "weightUnitOfMeasure");
        this.color = str;
        this.country = str2;
        this.dimensions = apDimension;
        this.energyClass = str3;
        this.inputVoltage = str4;
        this.material = str5;
        this.maxConnectingPower = j;
        this.purchasingAndWarrantyData = purchasingAndWarrantyData2;
        this.weight = i;
        this.weightUnitOfMeasure = str6;
    }

    public static /* synthetic */ ApCharacteristic copy$default(ApCharacteristic apCharacteristic, String str, String str2, ApDimension apDimension, String str3, String str4, String str5, long j, PurchasingAndWarrantyData purchasingAndWarrantyData2, int i, String str6, int i2, Object obj) {
        ApCharacteristic apCharacteristic2 = apCharacteristic;
        int i3 = i2;
        return apCharacteristic.copy((i3 & 1) != 0 ? apCharacteristic2.color : str, (i3 & 2) != 0 ? apCharacteristic2.country : str2, (i3 & 4) != 0 ? apCharacteristic2.dimensions : apDimension, (i3 & 8) != 0 ? apCharacteristic2.energyClass : str3, (i3 & 16) != 0 ? apCharacteristic2.inputVoltage : str4, (i3 & 32) != 0 ? apCharacteristic2.material : str5, (i3 & 64) != 0 ? apCharacteristic2.maxConnectingPower : j, (i3 & 128) != 0 ? apCharacteristic2.purchasingAndWarrantyData : purchasingAndWarrantyData2, (i3 & 256) != 0 ? apCharacteristic2.weight : i, (i3 & 512) != 0 ? apCharacteristic2.weightUnitOfMeasure : str6);
    }

    @NotNull
    public final String component1() {
        return this.color;
    }

    @NotNull
    public final String component10() {
        return this.weightUnitOfMeasure;
    }

    @NotNull
    public final String component2() {
        return this.country;
    }

    @NotNull
    public final ApDimension component3() {
        return this.dimensions;
    }

    @NotNull
    public final String component4() {
        return this.energyClass;
    }

    @NotNull
    public final String component5() {
        return this.inputVoltage;
    }

    @NotNull
    public final String component6() {
        return this.material;
    }

    public final long component7() {
        return this.maxConnectingPower;
    }

    @NotNull
    public final PurchasingAndWarrantyData component8() {
        return this.purchasingAndWarrantyData;
    }

    public final int component9() {
        return this.weight;
    }

    @NotNull
    public final ApCharacteristic copy(@NotNull String str, @NotNull String str2, @NotNull ApDimension apDimension, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull PurchasingAndWarrantyData purchasingAndWarrantyData2, int i, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "color");
        Intrinsics.checkNotNullParameter(str2, "country");
        ApDimension apDimension2 = apDimension;
        Intrinsics.checkNotNullParameter(apDimension2, "dimensions");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "energyClass");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "inputVoltage");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, "material");
        PurchasingAndWarrantyData purchasingAndWarrantyData3 = purchasingAndWarrantyData2;
        Intrinsics.checkNotNullParameter(purchasingAndWarrantyData3, "purchasingAndWarrantyData");
        String str10 = str6;
        Intrinsics.checkNotNullParameter(str10, "weightUnitOfMeasure");
        return new ApCharacteristic(str, str2, apDimension2, str7, str8, str9, j, purchasingAndWarrantyData3, i, str10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApCharacteristic)) {
            return false;
        }
        ApCharacteristic apCharacteristic = (ApCharacteristic) obj;
        return Intrinsics.areEqual((Object) this.color, (Object) apCharacteristic.color) && Intrinsics.areEqual((Object) this.country, (Object) apCharacteristic.country) && Intrinsics.areEqual((Object) this.dimensions, (Object) apCharacteristic.dimensions) && Intrinsics.areEqual((Object) this.energyClass, (Object) apCharacteristic.energyClass) && Intrinsics.areEqual((Object) this.inputVoltage, (Object) apCharacteristic.inputVoltage) && Intrinsics.areEqual((Object) this.material, (Object) apCharacteristic.material) && this.maxConnectingPower == apCharacteristic.maxConnectingPower && Intrinsics.areEqual((Object) this.purchasingAndWarrantyData, (Object) apCharacteristic.purchasingAndWarrantyData) && this.weight == apCharacteristic.weight && Intrinsics.areEqual((Object) this.weightUnitOfMeasure, (Object) apCharacteristic.weightUnitOfMeasure);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final ApDimension getDimensions() {
        return this.dimensions;
    }

    @NotNull
    public final String getEnergyClass() {
        return this.energyClass;
    }

    @NotNull
    public final String getInputVoltage() {
        return this.inputVoltage;
    }

    @NotNull
    public final String getMaterial() {
        return this.material;
    }

    public final long getMaxConnectingPower() {
        return this.maxConnectingPower;
    }

    @NotNull
    public final PurchasingAndWarrantyData getPurchasingAndWarrantyData() {
        return this.purchasingAndWarrantyData;
    }

    public final int getWeight() {
        return this.weight;
    }

    @NotNull
    public final String getWeightUnitOfMeasure() {
        return this.weightUnitOfMeasure;
    }

    public int hashCode() {
        return (((((((((((((((((this.color.hashCode() * 31) + this.country.hashCode()) * 31) + this.dimensions.hashCode()) * 31) + this.energyClass.hashCode()) * 31) + this.inputVoltage.hashCode()) * 31) + this.material.hashCode()) * 31) + Long.hashCode(this.maxConnectingPower)) * 31) + this.purchasingAndWarrantyData.hashCode()) * 31) + Integer.hashCode(this.weight)) * 31) + this.weightUnitOfMeasure.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApCharacteristic(color=" + this.color + ", country=" + this.country + ", dimensions=" + this.dimensions + ", energyClass=" + this.energyClass + ", inputVoltage=" + this.inputVoltage + ", material=" + this.material + ", maxConnectingPower=" + this.maxConnectingPower + ", purchasingAndWarrantyData=" + this.purchasingAndWarrantyData + ", weight=" + this.weight + ", weightUnitOfMeasure=" + this.weightUnitOfMeasure + ')';
    }
}
