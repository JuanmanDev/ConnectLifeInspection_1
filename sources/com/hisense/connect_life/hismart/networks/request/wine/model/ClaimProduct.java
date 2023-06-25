package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.core.global.KeyConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimProduct;", "", "auid", "", "code", "serialNumber", "serviceIndex", "purchaseDate", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuid", "()Ljava/lang/String;", "setAuid", "(Ljava/lang/String;)V", "getCode", "setCode", "getName", "setName", "getPurchaseDate", "setPurchaseDate", "getSerialNumber", "setSerialNumber", "getServiceIndex", "setServiceIndex", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClaimProduct.kt */
public final class ClaimProduct {
    @NotNull
    public String auid;
    @NotNull
    public String code;
    @NotNull
    public String name;
    @NotNull
    public String purchaseDate;
    @NotNull
    public String serialNumber;
    @NotNull
    public String serviceIndex;

    public ClaimProduct() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public ClaimProduct(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "serialNumber");
        Intrinsics.checkNotNullParameter(str4, "serviceIndex");
        Intrinsics.checkNotNullParameter(str5, "purchaseDate");
        Intrinsics.checkNotNullParameter(str6, "name");
        this.auid = str;
        this.code = str2;
        this.serialNumber = str3;
        this.serviceIndex = str4;
        this.purchaseDate = str5;
        this.name = str6;
    }

    public static /* synthetic */ ClaimProduct copy$default(ClaimProduct claimProduct, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claimProduct.auid;
        }
        if ((i & 2) != 0) {
            str2 = claimProduct.code;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = claimProduct.serialNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = claimProduct.serviceIndex;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = claimProduct.purchaseDate;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = claimProduct.name;
        }
        return claimProduct.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.auid;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final String component3() {
        return this.serialNumber;
    }

    @NotNull
    public final String component4() {
        return this.serviceIndex;
    }

    @NotNull
    public final String component5() {
        return this.purchaseDate;
    }

    @NotNull
    public final String component6() {
        return this.name;
    }

    @NotNull
    public final ClaimProduct copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "serialNumber");
        Intrinsics.checkNotNullParameter(str4, "serviceIndex");
        Intrinsics.checkNotNullParameter(str5, "purchaseDate");
        Intrinsics.checkNotNullParameter(str6, "name");
        return new ClaimProduct(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimProduct)) {
            return false;
        }
        ClaimProduct claimProduct = (ClaimProduct) obj;
        return Intrinsics.areEqual((Object) this.auid, (Object) claimProduct.auid) && Intrinsics.areEqual((Object) this.code, (Object) claimProduct.code) && Intrinsics.areEqual((Object) this.serialNumber, (Object) claimProduct.serialNumber) && Intrinsics.areEqual((Object) this.serviceIndex, (Object) claimProduct.serviceIndex) && Intrinsics.areEqual((Object) this.purchaseDate, (Object) claimProduct.purchaseDate) && Intrinsics.areEqual((Object) this.name, (Object) claimProduct.name);
    }

    @NotNull
    public final String getAuid() {
        return this.auid;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPurchaseDate() {
        return this.purchaseDate;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final String getServiceIndex() {
        return this.serviceIndex;
    }

    public int hashCode() {
        return (((((((((this.auid.hashCode() * 31) + this.code.hashCode()) * 31) + this.serialNumber.hashCode()) * 31) + this.serviceIndex.hashCode()) * 31) + this.purchaseDate.hashCode()) * 31) + this.name.hashCode();
    }

    public final void setAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.auid = str;
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPurchaseDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseDate = str;
    }

    public final void setSerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serialNumber = str;
    }

    public final void setServiceIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceIndex = str;
    }

    @NotNull
    public String toString() {
        return "ClaimProduct(auid=" + this.auid + ", code=" + this.code + ", serialNumber=" + this.serialNumber + ", serviceIndex=" + this.serviceIndex + ", purchaseDate=" + this.purchaseDate + ", name=" + this.name + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ClaimProduct(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            java.lang.String r0 = ""
            if (r13 == 0) goto L_0x0008
            r13 = r0
            goto L_0x0009
        L_0x0008:
            r13 = r6
        L_0x0009:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r7
        L_0x0010:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r9
        L_0x001e:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r10
        L_0x0025:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002b
            r12 = r0
            goto L_0x002c
        L_0x002b:
            r12 = r11
        L_0x002c:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.wine.model.ClaimProduct.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
