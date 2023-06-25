package com.hisense.connect_life.hismart.networks.request.account.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J]\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0010¨\u0006,"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAddress;", "Ljava/io/Serializable;", "addressType", "", "street", "houseNumber", "postalCode", "city", "country", "gpsInfo", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;)V", "getAddressType", "()Ljava/lang/String;", "getCity", "setCity", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getGpsInfo", "()Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;", "setGpsInfo", "(Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;)V", "getHouseNumber", "setHouseNumber", "getPostalCode", "setPostalCode", "getStreet", "setStreet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpAddress.kt */
public final class UpAddress implements Serializable {
    @Nullable
    public final String addressType;
    @Nullable
    public String city;
    @Nullable
    public String country;
    @Nullable
    public UpGps gpsInfo;
    @Nullable
    public String houseNumber;
    @Nullable
    public String postalCode;
    @Nullable
    public String street;

    public UpAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable UpGps upGps) {
        this.addressType = str;
        this.street = str2;
        this.houseNumber = str3;
        this.postalCode = str4;
        this.city = str5;
        this.country = str6;
        this.gpsInfo = upGps;
    }

    public static /* synthetic */ UpAddress copy$default(UpAddress upAddress, String str, String str2, String str3, String str4, String str5, String str6, UpGps upGps, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upAddress.addressType;
        }
        if ((i & 2) != 0) {
            str2 = upAddress.street;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = upAddress.houseNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = upAddress.postalCode;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = upAddress.city;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = upAddress.country;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            upGps = upAddress.gpsInfo;
        }
        return upAddress.copy(str, str7, str8, str9, str10, str11, upGps);
    }

    @Nullable
    public final String component1() {
        return this.addressType;
    }

    @Nullable
    public final String component2() {
        return this.street;
    }

    @Nullable
    public final String component3() {
        return this.houseNumber;
    }

    @Nullable
    public final String component4() {
        return this.postalCode;
    }

    @Nullable
    public final String component5() {
        return this.city;
    }

    @Nullable
    public final String component6() {
        return this.country;
    }

    @Nullable
    public final UpGps component7() {
        return this.gpsInfo;
    }

    @NotNull
    public final UpAddress copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable UpGps upGps) {
        return new UpAddress(str, str2, str3, str4, str5, str6, upGps);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpAddress)) {
            return false;
        }
        UpAddress upAddress = (UpAddress) obj;
        return Intrinsics.areEqual((Object) this.addressType, (Object) upAddress.addressType) && Intrinsics.areEqual((Object) this.street, (Object) upAddress.street) && Intrinsics.areEqual((Object) this.houseNumber, (Object) upAddress.houseNumber) && Intrinsics.areEqual((Object) this.postalCode, (Object) upAddress.postalCode) && Intrinsics.areEqual((Object) this.city, (Object) upAddress.city) && Intrinsics.areEqual((Object) this.country, (Object) upAddress.country) && Intrinsics.areEqual((Object) this.gpsInfo, (Object) upAddress.gpsInfo);
    }

    @Nullable
    public final String getAddressType() {
        return this.addressType;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final UpGps getGpsInfo() {
        return this.gpsInfo;
    }

    @Nullable
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.addressType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.street;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.houseNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postalCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.city;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UpGps upGps = this.gpsInfo;
        if (upGps != null) {
            i = upGps.hashCode();
        }
        return hashCode6 + i;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setGpsInfo(@Nullable UpGps upGps) {
        this.gpsInfo = upGps;
    }

    public final void setHouseNumber(@Nullable String str) {
        this.houseNumber = str;
    }

    public final void setPostalCode(@Nullable String str) {
        this.postalCode = str;
    }

    public final void setStreet(@Nullable String str) {
        this.street = str;
    }

    @NotNull
    public String toString() {
        return "UpAddress(addressType=" + this.addressType + ", street=" + this.street + ", houseNumber=" + this.houseNumber + ", postalCode=" + this.postalCode + ", city=" + this.city + ", country=" + this.country + ", gpsInfo=" + this.gpsInfo + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpAddress(String str, String str2, String str3, String str4, String str5, String str6, UpGps upGps, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? new UpGps((String) null, (String) null, 3, (DefaultConstructorMarker) null) : upGps);
    }
}
