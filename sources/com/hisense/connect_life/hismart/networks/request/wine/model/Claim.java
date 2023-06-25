package com.hisense.connect_life.hismart.networks.request.wine.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003Jw\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019¨\u0006B"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/Claim;", "", "claimId", "", "sagClaimId", "serviceOrderId", "dateOfClaim", "", "dateOfRepair", "source", "userId", "serviceTechnician", "product", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimProduct;", "error", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimError;", "status", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimProduct;Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimError;Ljava/lang/String;)V", "getClaimId", "()J", "setClaimId", "(J)V", "getDateOfClaim", "()Ljava/lang/String;", "setDateOfClaim", "(Ljava/lang/String;)V", "getDateOfRepair", "setDateOfRepair", "getError", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimError;", "setError", "(Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimError;)V", "getProduct", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimProduct;", "setProduct", "(Lcom/hisense/connect_life/hismart/networks/request/wine/model/ClaimProduct;)V", "getSagClaimId", "setSagClaimId", "getServiceOrderId", "setServiceOrderId", "getServiceTechnician", "setServiceTechnician", "getSource", "setSource", "getStatus", "setStatus", "getUserId", "setUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Claim.kt */
public final class Claim {
    public long claimId;
    @NotNull
    public String dateOfClaim;
    @NotNull
    public String dateOfRepair;
    @NotNull
    public ClaimError error;
    @NotNull
    public ClaimProduct product;
    public long sagClaimId;
    public long serviceOrderId;
    @NotNull
    public String serviceTechnician;
    @NotNull
    public String source;
    @NotNull
    public String status;
    @NotNull
    public String userId;

    public Claim(long j, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ClaimProduct claimProduct, @NotNull ClaimError claimError, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "dateOfClaim");
        Intrinsics.checkNotNullParameter(str2, "dateOfRepair");
        Intrinsics.checkNotNullParameter(str3, "source");
        Intrinsics.checkNotNullParameter(str4, "userId");
        Intrinsics.checkNotNullParameter(str5, "serviceTechnician");
        Intrinsics.checkNotNullParameter(claimProduct, "product");
        Intrinsics.checkNotNullParameter(claimError, "error");
        Intrinsics.checkNotNullParameter(str6, NotificationCompat.CATEGORY_STATUS);
        this.claimId = j;
        this.sagClaimId = j2;
        this.serviceOrderId = j3;
        this.dateOfClaim = str;
        this.dateOfRepair = str2;
        this.source = str3;
        this.userId = str4;
        this.serviceTechnician = str5;
        this.product = claimProduct;
        this.error = claimError;
        this.status = str6;
    }

    public static /* synthetic */ Claim copy$default(Claim claim, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, ClaimProduct claimProduct, ClaimError claimError, String str6, int i, Object obj) {
        Claim claim2 = claim;
        int i2 = i;
        return claim.copy((i2 & 1) != 0 ? claim2.claimId : j, (i2 & 2) != 0 ? claim2.sagClaimId : j2, (i2 & 4) != 0 ? claim2.serviceOrderId : j3, (i2 & 8) != 0 ? claim2.dateOfClaim : str, (i2 & 16) != 0 ? claim2.dateOfRepair : str2, (i2 & 32) != 0 ? claim2.source : str3, (i2 & 64) != 0 ? claim2.userId : str4, (i2 & 128) != 0 ? claim2.serviceTechnician : str5, (i2 & 256) != 0 ? claim2.product : claimProduct, (i2 & 512) != 0 ? claim2.error : claimError, (i2 & 1024) != 0 ? claim2.status : str6);
    }

    public final long component1() {
        return this.claimId;
    }

    @NotNull
    public final ClaimError component10() {
        return this.error;
    }

    @NotNull
    public final String component11() {
        return this.status;
    }

    public final long component2() {
        return this.sagClaimId;
    }

    public final long component3() {
        return this.serviceOrderId;
    }

    @NotNull
    public final String component4() {
        return this.dateOfClaim;
    }

    @NotNull
    public final String component5() {
        return this.dateOfRepair;
    }

    @NotNull
    public final String component6() {
        return this.source;
    }

    @NotNull
    public final String component7() {
        return this.userId;
    }

    @NotNull
    public final String component8() {
        return this.serviceTechnician;
    }

    @NotNull
    public final ClaimProduct component9() {
        return this.product;
    }

    @NotNull
    public final Claim copy(long j, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ClaimProduct claimProduct, @NotNull ClaimError claimError, @NotNull String str6) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "dateOfClaim");
        String str8 = str2;
        Intrinsics.checkNotNullParameter(str8, "dateOfRepair");
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "source");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "userId");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "serviceTechnician");
        ClaimProduct claimProduct2 = claimProduct;
        Intrinsics.checkNotNullParameter(claimProduct2, "product");
        ClaimError claimError2 = claimError;
        Intrinsics.checkNotNullParameter(claimError2, "error");
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str12, NotificationCompat.CATEGORY_STATUS);
        return new Claim(j, j2, j3, str7, str8, str9, str10, str11, claimProduct2, claimError2, str12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Claim)) {
            return false;
        }
        Claim claim = (Claim) obj;
        return this.claimId == claim.claimId && this.sagClaimId == claim.sagClaimId && this.serviceOrderId == claim.serviceOrderId && Intrinsics.areEqual((Object) this.dateOfClaim, (Object) claim.dateOfClaim) && Intrinsics.areEqual((Object) this.dateOfRepair, (Object) claim.dateOfRepair) && Intrinsics.areEqual((Object) this.source, (Object) claim.source) && Intrinsics.areEqual((Object) this.userId, (Object) claim.userId) && Intrinsics.areEqual((Object) this.serviceTechnician, (Object) claim.serviceTechnician) && Intrinsics.areEqual((Object) this.product, (Object) claim.product) && Intrinsics.areEqual((Object) this.error, (Object) claim.error) && Intrinsics.areEqual((Object) this.status, (Object) claim.status);
    }

    public final long getClaimId() {
        return this.claimId;
    }

    @NotNull
    public final String getDateOfClaim() {
        return this.dateOfClaim;
    }

    @NotNull
    public final String getDateOfRepair() {
        return this.dateOfRepair;
    }

    @NotNull
    public final ClaimError getError() {
        return this.error;
    }

    @NotNull
    public final ClaimProduct getProduct() {
        return this.product;
    }

    public final long getSagClaimId() {
        return this.sagClaimId;
    }

    public final long getServiceOrderId() {
        return this.serviceOrderId;
    }

    @NotNull
    public final String getServiceTechnician() {
        return this.serviceTechnician;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.claimId) * 31) + Long.hashCode(this.sagClaimId)) * 31) + Long.hashCode(this.serviceOrderId)) * 31) + this.dateOfClaim.hashCode()) * 31) + this.dateOfRepair.hashCode()) * 31) + this.source.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.serviceTechnician.hashCode()) * 31) + this.product.hashCode()) * 31) + this.error.hashCode()) * 31) + this.status.hashCode();
    }

    public final void setClaimId(long j) {
        this.claimId = j;
    }

    public final void setDateOfClaim(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateOfClaim = str;
    }

    public final void setDateOfRepair(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateOfRepair = str;
    }

    public final void setError(@NotNull ClaimError claimError) {
        Intrinsics.checkNotNullParameter(claimError, "<set-?>");
        this.error = claimError;
    }

    public final void setProduct(@NotNull ClaimProduct claimProduct) {
        Intrinsics.checkNotNullParameter(claimProduct, "<set-?>");
        this.product = claimProduct;
    }

    public final void setSagClaimId(long j) {
        this.sagClaimId = j;
    }

    public final void setServiceOrderId(long j) {
        this.serviceOrderId = j;
    }

    public final void setServiceTechnician(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceTechnician = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "Claim(claimId=" + this.claimId + ", sagClaimId=" + this.sagClaimId + ", serviceOrderId=" + this.serviceOrderId + ", dateOfClaim=" + this.dateOfClaim + ", dateOfRepair=" + this.dateOfRepair + ", source=" + this.source + ", userId=" + this.userId + ", serviceTechnician=" + this.serviceTechnician + ", product=" + this.product + ", error=" + this.error + ", status=" + this.status + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Claim(long r20, long r22, long r24, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.hisense.connect_life.hismart.networks.request.wine.model.ClaimProduct r31, com.hisense.connect_life.hismart.networks.request.wine.model.ClaimError r32, java.lang.String r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r19 = this;
            r0 = r34
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r5 = r2
            goto L_0x000c
        L_0x000a:
            r5 = r20
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r7 = r2
            goto L_0x0014
        L_0x0012:
            r7 = r22
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r9 = r2
            goto L_0x001c
        L_0x001a:
            r9 = r24
        L_0x001c:
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0024
            r11 = r2
            goto L_0x0026
        L_0x0024:
            r11 = r26
        L_0x0026:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002c
            r12 = r2
            goto L_0x002e
        L_0x002c:
            r12 = r27
        L_0x002e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0034
            r13 = r2
            goto L_0x0036
        L_0x0034:
            r13 = r28
        L_0x0036:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003c
            r14 = r2
            goto L_0x003e
        L_0x003c:
            r14 = r29
        L_0x003e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0044
            r15 = r2
            goto L_0x0046
        L_0x0044:
            r15 = r30
        L_0x0046:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004d
            r18 = r2
            goto L_0x004f
        L_0x004d:
            r18 = r33
        L_0x004f:
            r4 = r19
            r16 = r31
            r17 = r32
            r4.<init>(r5, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.wine.model.Claim.<init>(long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.hisense.connect_life.hismart.networks.request.wine.model.ClaimProduct, com.hisense.connect_life.hismart.networks.request.wine.model.ClaimError, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
