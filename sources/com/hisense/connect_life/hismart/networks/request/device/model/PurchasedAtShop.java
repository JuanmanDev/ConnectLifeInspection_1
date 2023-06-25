package com.hisense.connect_life.hismart.networks.request.device.model;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/PurchasedAtShop;", "", "address", "Lcom/hisense/connect_life/hismart/networks/request/device/model/Address;", "description", "", "name", "type", "(Lcom/hisense/connect_life/hismart/networks/request/device/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/Address;", "getDescription", "()Ljava/lang/String;", "getName", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PurchasedAtShop.kt */
public final class PurchasedAtShop {
    @NotNull
    public final Address address;
    @NotNull
    public final String description;
    @NotNull
    public final String name;
    @NotNull
    public final String type;

    public PurchasedAtShop(@NotNull Address address2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_DESCRIPTION);
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "type");
        this.address = address2;
        this.description = str;
        this.name = str2;
        this.type = str3;
    }

    public static /* synthetic */ PurchasedAtShop copy$default(PurchasedAtShop purchasedAtShop, Address address2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            address2 = purchasedAtShop.address;
        }
        if ((i & 2) != 0) {
            str = purchasedAtShop.description;
        }
        if ((i & 4) != 0) {
            str2 = purchasedAtShop.name;
        }
        if ((i & 8) != 0) {
            str3 = purchasedAtShop.type;
        }
        return purchasedAtShop.copy(address2, str, str2, str3);
    }

    @NotNull
    public final Address component1() {
        return this.address;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final String component4() {
        return this.type;
    }

    @NotNull
    public final PurchasedAtShop copy(@NotNull Address address2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_DESCRIPTION);
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "type");
        return new PurchasedAtShop(address2, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasedAtShop)) {
            return false;
        }
        PurchasedAtShop purchasedAtShop = (PurchasedAtShop) obj;
        return Intrinsics.areEqual((Object) this.address, (Object) purchasedAtShop.address) && Intrinsics.areEqual((Object) this.description, (Object) purchasedAtShop.description) && Intrinsics.areEqual((Object) this.name, (Object) purchasedAtShop.name) && Intrinsics.areEqual((Object) this.type, (Object) purchasedAtShop.type);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.address.hashCode() * 31) + this.description.hashCode()) * 31) + this.name.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "PurchasedAtShop(address=" + this.address + ", description=" + this.description + ", name=" + this.name + ", type=" + this.type + ')';
    }
}
