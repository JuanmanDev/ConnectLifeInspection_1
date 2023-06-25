package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/Address;", "", "addressType", "", "city", "gpsInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/GpsInfo;", "country", "houseNumber", "", "postalCode", "street", "(Ljava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/device/model/GpsInfo;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAddressType", "()Ljava/lang/String;", "getCity", "getCountry", "getGpsInfo", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/GpsInfo;", "getHouseNumber", "()I", "getPostalCode", "getStreet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Address.kt */
public final class Address {
    @NotNull
    public final String addressType;
    @NotNull
    public final String city;
    @NotNull
    public final String country;
    @NotNull
    public final GpsInfo gpsInfo;
    public final int houseNumber;
    @NotNull
    public final String postalCode;
    @NotNull
    public final String street;

    public Address(@NotNull String str, @NotNull String str2, @NotNull GpsInfo gpsInfo2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "addressType");
        Intrinsics.checkNotNullParameter(str2, "city");
        Intrinsics.checkNotNullParameter(gpsInfo2, "gpsInfo");
        Intrinsics.checkNotNullParameter(str3, "country");
        Intrinsics.checkNotNullParameter(str4, "postalCode");
        Intrinsics.checkNotNullParameter(str5, "street");
        this.addressType = str;
        this.city = str2;
        this.gpsInfo = gpsInfo2;
        this.country = str3;
        this.houseNumber = i;
        this.postalCode = str4;
        this.street = str5;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, GpsInfo gpsInfo2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = address.addressType;
        }
        if ((i2 & 2) != 0) {
            str2 = address.city;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            gpsInfo2 = address.gpsInfo;
        }
        GpsInfo gpsInfo3 = gpsInfo2;
        if ((i2 & 8) != 0) {
            str3 = address.country;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            i = address.houseNumber;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str4 = address.postalCode;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            str5 = address.street;
        }
        return address.copy(str, str6, gpsInfo3, str7, i3, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.addressType;
    }

    @NotNull
    public final String component2() {
        return this.city;
    }

    @NotNull
    public final GpsInfo component3() {
        return this.gpsInfo;
    }

    @NotNull
    public final String component4() {
        return this.country;
    }

    public final int component5() {
        return this.houseNumber;
    }

    @NotNull
    public final String component6() {
        return this.postalCode;
    }

    @NotNull
    public final String component7() {
        return this.street;
    }

    @NotNull
    public final Address copy(@NotNull String str, @NotNull String str2, @NotNull GpsInfo gpsInfo2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "addressType");
        Intrinsics.checkNotNullParameter(str2, "city");
        Intrinsics.checkNotNullParameter(gpsInfo2, "gpsInfo");
        Intrinsics.checkNotNullParameter(str3, "country");
        Intrinsics.checkNotNullParameter(str4, "postalCode");
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "street");
        return new Address(str, str2, gpsInfo2, str3, i, str4, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual((Object) this.addressType, (Object) address.addressType) && Intrinsics.areEqual((Object) this.city, (Object) address.city) && Intrinsics.areEqual((Object) this.gpsInfo, (Object) address.gpsInfo) && Intrinsics.areEqual((Object) this.country, (Object) address.country) && this.houseNumber == address.houseNumber && Intrinsics.areEqual((Object) this.postalCode, (Object) address.postalCode) && Intrinsics.areEqual((Object) this.street, (Object) address.street);
    }

    @NotNull
    public final String getAddressType() {
        return this.addressType;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final GpsInfo getGpsInfo() {
        return this.gpsInfo;
    }

    public final int getHouseNumber() {
        return this.houseNumber;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        return (((((((((((this.addressType.hashCode() * 31) + this.city.hashCode()) * 31) + this.gpsInfo.hashCode()) * 31) + this.country.hashCode()) * 31) + Integer.hashCode(this.houseNumber)) * 31) + this.postalCode.hashCode()) * 31) + this.street.hashCode();
    }

    @NotNull
    public String toString() {
        return "Address(addressType=" + this.addressType + ", city=" + this.city + ", gpsInfo=" + this.gpsInfo + ", country=" + this.country + ", houseNumber=" + this.houseNumber + ", postalCode=" + this.postalCode + ", street=" + this.street + ')';
    }
}
