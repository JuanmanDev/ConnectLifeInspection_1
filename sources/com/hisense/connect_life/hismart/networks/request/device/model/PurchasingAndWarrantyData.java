package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006)"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/PurchasingAndWarrantyData;", "", "address", "Lcom/hisense/connect_life/hismart/networks/request/device/model/Address;", "appliancesMedia", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceMedia;", "durationOfWarranty", "", "durationUnitOfMeasure", "", "purchaseDate", "purchasedAtShop", "Lcom/hisense/connect_life/hismart/networks/request/device/model/PurchasedAtShop;", "warrantyEndDate", "(Lcom/hisense/connect_life/hismart/networks/request/device/model/Address;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/device/model/PurchasedAtShop;Ljava/lang/String;)V", "getAddress", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/Address;", "getAppliancesMedia", "()Ljava/util/List;", "getDurationOfWarranty", "()I", "getDurationUnitOfMeasure", "()Ljava/lang/String;", "getPurchaseDate", "getPurchasedAtShop", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/PurchasedAtShop;", "getWarrantyEndDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PurchasingAndWarrantyData.kt */
public final class PurchasingAndWarrantyData {
    @NotNull
    public final Address address;
    @NotNull
    public final List<ApplianceMedia> appliancesMedia;
    public final int durationOfWarranty;
    @NotNull
    public final String durationUnitOfMeasure;
    @NotNull
    public final String purchaseDate;
    @NotNull
    public final PurchasedAtShop purchasedAtShop;
    @NotNull
    public final String warrantyEndDate;

    public PurchasingAndWarrantyData(@NotNull Address address2, @NotNull List<ApplianceMedia> list, int i, @NotNull String str, @NotNull String str2, @NotNull PurchasedAtShop purchasedAtShop2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(list, "appliancesMedia");
        Intrinsics.checkNotNullParameter(str, "durationUnitOfMeasure");
        Intrinsics.checkNotNullParameter(str2, "purchaseDate");
        Intrinsics.checkNotNullParameter(purchasedAtShop2, "purchasedAtShop");
        Intrinsics.checkNotNullParameter(str3, "warrantyEndDate");
        this.address = address2;
        this.appliancesMedia = list;
        this.durationOfWarranty = i;
        this.durationUnitOfMeasure = str;
        this.purchaseDate = str2;
        this.purchasedAtShop = purchasedAtShop2;
        this.warrantyEndDate = str3;
    }

    public static /* synthetic */ PurchasingAndWarrantyData copy$default(PurchasingAndWarrantyData purchasingAndWarrantyData, Address address2, List<ApplianceMedia> list, int i, String str, String str2, PurchasedAtShop purchasedAtShop2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            address2 = purchasingAndWarrantyData.address;
        }
        if ((i2 & 2) != 0) {
            list = purchasingAndWarrantyData.appliancesMedia;
        }
        List<ApplianceMedia> list2 = list;
        if ((i2 & 4) != 0) {
            i = purchasingAndWarrantyData.durationOfWarranty;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = purchasingAndWarrantyData.durationUnitOfMeasure;
        }
        String str4 = str;
        if ((i2 & 16) != 0) {
            str2 = purchasingAndWarrantyData.purchaseDate;
        }
        String str5 = str2;
        if ((i2 & 32) != 0) {
            purchasedAtShop2 = purchasingAndWarrantyData.purchasedAtShop;
        }
        PurchasedAtShop purchasedAtShop3 = purchasedAtShop2;
        if ((i2 & 64) != 0) {
            str3 = purchasingAndWarrantyData.warrantyEndDate;
        }
        return purchasingAndWarrantyData.copy(address2, list2, i3, str4, str5, purchasedAtShop3, str3);
    }

    @NotNull
    public final Address component1() {
        return this.address;
    }

    @NotNull
    public final List<ApplianceMedia> component2() {
        return this.appliancesMedia;
    }

    public final int component3() {
        return this.durationOfWarranty;
    }

    @NotNull
    public final String component4() {
        return this.durationUnitOfMeasure;
    }

    @NotNull
    public final String component5() {
        return this.purchaseDate;
    }

    @NotNull
    public final PurchasedAtShop component6() {
        return this.purchasedAtShop;
    }

    @NotNull
    public final String component7() {
        return this.warrantyEndDate;
    }

    @NotNull
    public final PurchasingAndWarrantyData copy(@NotNull Address address2, @NotNull List<ApplianceMedia> list, int i, @NotNull String str, @NotNull String str2, @NotNull PurchasedAtShop purchasedAtShop2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(list, "appliancesMedia");
        Intrinsics.checkNotNullParameter(str, "durationUnitOfMeasure");
        Intrinsics.checkNotNullParameter(str2, "purchaseDate");
        Intrinsics.checkNotNullParameter(purchasedAtShop2, "purchasedAtShop");
        String str4 = str3;
        Intrinsics.checkNotNullParameter(str4, "warrantyEndDate");
        return new PurchasingAndWarrantyData(address2, list, i, str, str2, purchasedAtShop2, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasingAndWarrantyData)) {
            return false;
        }
        PurchasingAndWarrantyData purchasingAndWarrantyData = (PurchasingAndWarrantyData) obj;
        return Intrinsics.areEqual((Object) this.address, (Object) purchasingAndWarrantyData.address) && Intrinsics.areEqual((Object) this.appliancesMedia, (Object) purchasingAndWarrantyData.appliancesMedia) && this.durationOfWarranty == purchasingAndWarrantyData.durationOfWarranty && Intrinsics.areEqual((Object) this.durationUnitOfMeasure, (Object) purchasingAndWarrantyData.durationUnitOfMeasure) && Intrinsics.areEqual((Object) this.purchaseDate, (Object) purchasingAndWarrantyData.purchaseDate) && Intrinsics.areEqual((Object) this.purchasedAtShop, (Object) purchasingAndWarrantyData.purchasedAtShop) && Intrinsics.areEqual((Object) this.warrantyEndDate, (Object) purchasingAndWarrantyData.warrantyEndDate);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final List<ApplianceMedia> getAppliancesMedia() {
        return this.appliancesMedia;
    }

    public final int getDurationOfWarranty() {
        return this.durationOfWarranty;
    }

    @NotNull
    public final String getDurationUnitOfMeasure() {
        return this.durationUnitOfMeasure;
    }

    @NotNull
    public final String getPurchaseDate() {
        return this.purchaseDate;
    }

    @NotNull
    public final PurchasedAtShop getPurchasedAtShop() {
        return this.purchasedAtShop;
    }

    @NotNull
    public final String getWarrantyEndDate() {
        return this.warrantyEndDate;
    }

    public int hashCode() {
        return (((((((((((this.address.hashCode() * 31) + this.appliancesMedia.hashCode()) * 31) + Integer.hashCode(this.durationOfWarranty)) * 31) + this.durationUnitOfMeasure.hashCode()) * 31) + this.purchaseDate.hashCode()) * 31) + this.purchasedAtShop.hashCode()) * 31) + this.warrantyEndDate.hashCode();
    }

    @NotNull
    public String toString() {
        return "PurchasingAndWarrantyData(address=" + this.address + ", appliancesMedia=" + this.appliancesMedia + ", durationOfWarranty=" + this.durationOfWarranty + ", durationUnitOfMeasure=" + this.durationUnitOfMeasure + ", purchaseDate=" + this.purchaseDate + ", purchasedAtShop=" + this.purchasedAtShop + ", warrantyEndDate=" + this.warrantyEndDate + ')';
    }
}
