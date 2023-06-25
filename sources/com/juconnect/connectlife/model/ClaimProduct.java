package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/ClaimProduct;", "", "auid", "", "code", "name", "purchaseDate", "serialNumber", "serviceIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuid", "()Ljava/lang/String;", "setAuid", "(Ljava/lang/String;)V", "getCode", "setCode", "getName", "setName", "getPurchaseDate", "setPurchaseDate", "getSerialNumber", "setSerialNumber", "getServiceIndex", "setServiceIndex", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClaimProduct.kt */
public final class ClaimProduct {
    @Nullable
    public String auid;
    @Nullable
    public String code;
    @Nullable
    public String name;
    @Nullable
    public String purchaseDate;
    @Nullable
    public String serialNumber;
    @Nullable
    public String serviceIndex;

    public ClaimProduct() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public ClaimProduct(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.auid = str;
        this.code = str2;
        this.name = str3;
        this.purchaseDate = str4;
        this.serialNumber = str5;
        this.serviceIndex = str6;
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
            str3 = claimProduct.name;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = claimProduct.purchaseDate;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = claimProduct.serialNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = claimProduct.serviceIndex;
        }
        return claimProduct.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.auid;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final String component4() {
        return this.purchaseDate;
    }

    @Nullable
    public final String component5() {
        return this.serialNumber;
    }

    @Nullable
    public final String component6() {
        return this.serviceIndex;
    }

    @NotNull
    public final ClaimProduct copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
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
        return Intrinsics.areEqual((Object) this.auid, (Object) claimProduct.auid) && Intrinsics.areEqual((Object) this.code, (Object) claimProduct.code) && Intrinsics.areEqual((Object) this.name, (Object) claimProduct.name) && Intrinsics.areEqual((Object) this.purchaseDate, (Object) claimProduct.purchaseDate) && Intrinsics.areEqual((Object) this.serialNumber, (Object) claimProduct.serialNumber) && Intrinsics.areEqual((Object) this.serviceIndex, (Object) claimProduct.serviceIndex);
    }

    @Nullable
    public final String getAuid() {
        return this.auid;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPurchaseDate() {
        return this.purchaseDate;
    }

    @Nullable
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @Nullable
    public final String getServiceIndex() {
        return this.serviceIndex;
    }

    public int hashCode() {
        String str = this.auid;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.purchaseDate;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.serialNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.serviceIndex;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final void setAuid(@Nullable String str) {
        this.auid = str;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPurchaseDate(@Nullable String str) {
        this.purchaseDate = str;
    }

    public final void setSerialNumber(@Nullable String str) {
        this.serialNumber = str;
    }

    public final void setServiceIndex(@Nullable String str) {
        this.serviceIndex = str;
    }

    @NotNull
    public String toString() {
        return "ClaimProduct(auid=" + this.auid + ", code=" + this.code + ", name=" + this.name + ", purchaseDate=" + this.purchaseDate + ", serialNumber=" + this.serialNumber + ", serviceIndex=" + this.serviceIndex + ')';
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
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.model.ClaimProduct.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
