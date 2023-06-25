package com.juconnect.connectlife.model;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\b\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010F\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010J\u001a\u00020\u0016HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J¼\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\u00132\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u0007HÖ\u0001J\t\u0010X\u001a\u00020\tHÖ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006Y"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/TicketBean;", "", "product", "Lcom/juconnect/connectlife/model/ClaimProduct;", "id", "", "claimId", "", "dateOfClaim", "", "dateOfRepair", "source", "userId", "serviceTechnician", "sagClaimId", "serviceOrderId", "service_technician", "status", "warranty", "", "externalServiceEmail", "error", "Lcom/juconnect/connectlife/model/ClaimError;", "(Lcom/juconnect/connectlife/model/ClaimProduct;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/juconnect/connectlife/model/ClaimError;)V", "getClaimId", "()Ljava/lang/Integer;", "setClaimId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDateOfClaim", "()Ljava/lang/String;", "setDateOfClaim", "(Ljava/lang/String;)V", "getDateOfRepair", "setDateOfRepair", "getError", "()Lcom/juconnect/connectlife/model/ClaimError;", "setError", "(Lcom/juconnect/connectlife/model/ClaimError;)V", "getExternalServiceEmail", "setExternalServiceEmail", "getId", "()J", "setId", "(J)V", "getProduct", "()Lcom/juconnect/connectlife/model/ClaimProduct;", "setProduct", "(Lcom/juconnect/connectlife/model/ClaimProduct;)V", "getSagClaimId", "setSagClaimId", "getServiceOrderId", "setServiceOrderId", "getServiceTechnician", "setServiceTechnician", "getService_technician", "setService_technician", "getSource", "setSource", "getStatus", "setStatus", "getUserId", "setUserId", "getWarranty", "()Ljava/lang/Boolean;", "setWarranty", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/juconnect/connectlife/model/ClaimProduct;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/juconnect/connectlife/model/ClaimError;)Lcom/juconnect/connectlife/model/TicketBean;", "equals", "other", "hashCode", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "ticket_bean")
/* compiled from: TicketBean.kt */
public final class TicketBean {
    @Nullable
    public Integer claimId;
    @Nullable
    public String dateOfClaim;
    @Nullable
    public String dateOfRepair;
    @NotNull
    @Embedded
    public ClaimError error;
    @Nullable
    public String externalServiceEmail;
    @PrimaryKey(autoGenerate = true)

    /* renamed from: id */
    public long f16718id;
    @NotNull
    @Embedded
    public ClaimProduct product;
    @Nullable
    public Integer sagClaimId;
    @Nullable
    public Integer serviceOrderId;
    @Nullable
    public String serviceTechnician;
    @Nullable
    public String service_technician;
    @Nullable
    public String source;
    @Nullable
    public String status;
    @Nullable
    public String userId;
    @Nullable
    public Boolean warranty;

    public TicketBean(@NotNull ClaimProduct claimProduct, long j, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable String str8, @NotNull ClaimError claimError) {
        ClaimError claimError2 = claimError;
        Intrinsics.checkNotNullParameter(claimProduct, "product");
        Intrinsics.checkNotNullParameter(claimError2, "error");
        this.product = claimProduct;
        this.f16718id = j;
        this.claimId = num;
        this.dateOfClaim = str;
        this.dateOfRepair = str2;
        this.source = str3;
        this.userId = str4;
        this.serviceTechnician = str5;
        this.sagClaimId = num2;
        this.serviceOrderId = num3;
        this.service_technician = str6;
        this.status = str7;
        this.warranty = bool;
        this.externalServiceEmail = str8;
        this.error = claimError2;
    }

    public static /* synthetic */ TicketBean copy$default(TicketBean ticketBean, ClaimProduct claimProduct, long j, Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Integer num3, String str6, String str7, Boolean bool, String str8, ClaimError claimError, int i, Object obj) {
        TicketBean ticketBean2 = ticketBean;
        int i2 = i;
        return ticketBean.copy((i2 & 1) != 0 ? ticketBean2.product : claimProduct, (i2 & 2) != 0 ? ticketBean2.f16718id : j, (i2 & 4) != 0 ? ticketBean2.claimId : num, (i2 & 8) != 0 ? ticketBean2.dateOfClaim : str, (i2 & 16) != 0 ? ticketBean2.dateOfRepair : str2, (i2 & 32) != 0 ? ticketBean2.source : str3, (i2 & 64) != 0 ? ticketBean2.userId : str4, (i2 & 128) != 0 ? ticketBean2.serviceTechnician : str5, (i2 & 256) != 0 ? ticketBean2.sagClaimId : num2, (i2 & 512) != 0 ? ticketBean2.serviceOrderId : num3, (i2 & 1024) != 0 ? ticketBean2.service_technician : str6, (i2 & 2048) != 0 ? ticketBean2.status : str7, (i2 & 4096) != 0 ? ticketBean2.warranty : bool, (i2 & 8192) != 0 ? ticketBean2.externalServiceEmail : str8, (i2 & 16384) != 0 ? ticketBean2.error : claimError);
    }

    @NotNull
    public final ClaimProduct component1() {
        return this.product;
    }

    @Nullable
    public final Integer component10() {
        return this.serviceOrderId;
    }

    @Nullable
    public final String component11() {
        return this.service_technician;
    }

    @Nullable
    public final String component12() {
        return this.status;
    }

    @Nullable
    public final Boolean component13() {
        return this.warranty;
    }

    @Nullable
    public final String component14() {
        return this.externalServiceEmail;
    }

    @NotNull
    public final ClaimError component15() {
        return this.error;
    }

    public final long component2() {
        return this.f16718id;
    }

    @Nullable
    public final Integer component3() {
        return this.claimId;
    }

    @Nullable
    public final String component4() {
        return this.dateOfClaim;
    }

    @Nullable
    public final String component5() {
        return this.dateOfRepair;
    }

    @Nullable
    public final String component6() {
        return this.source;
    }

    @Nullable
    public final String component7() {
        return this.userId;
    }

    @Nullable
    public final String component8() {
        return this.serviceTechnician;
    }

    @Nullable
    public final Integer component9() {
        return this.sagClaimId;
    }

    @NotNull
    public final TicketBean copy(@NotNull ClaimProduct claimProduct, long j, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable String str8, @NotNull ClaimError claimError) {
        ClaimProduct claimProduct2 = claimProduct;
        Intrinsics.checkNotNullParameter(claimProduct2, "product");
        Intrinsics.checkNotNullParameter(claimError, "error");
        return new TicketBean(claimProduct2, j, num, str, str2, str3, str4, str5, num2, num3, str6, str7, bool, str8, claimError);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketBean)) {
            return false;
        }
        TicketBean ticketBean = (TicketBean) obj;
        return Intrinsics.areEqual((Object) this.product, (Object) ticketBean.product) && this.f16718id == ticketBean.f16718id && Intrinsics.areEqual((Object) this.claimId, (Object) ticketBean.claimId) && Intrinsics.areEqual((Object) this.dateOfClaim, (Object) ticketBean.dateOfClaim) && Intrinsics.areEqual((Object) this.dateOfRepair, (Object) ticketBean.dateOfRepair) && Intrinsics.areEqual((Object) this.source, (Object) ticketBean.source) && Intrinsics.areEqual((Object) this.userId, (Object) ticketBean.userId) && Intrinsics.areEqual((Object) this.serviceTechnician, (Object) ticketBean.serviceTechnician) && Intrinsics.areEqual((Object) this.sagClaimId, (Object) ticketBean.sagClaimId) && Intrinsics.areEqual((Object) this.serviceOrderId, (Object) ticketBean.serviceOrderId) && Intrinsics.areEqual((Object) this.service_technician, (Object) ticketBean.service_technician) && Intrinsics.areEqual((Object) this.status, (Object) ticketBean.status) && Intrinsics.areEqual((Object) this.warranty, (Object) ticketBean.warranty) && Intrinsics.areEqual((Object) this.externalServiceEmail, (Object) ticketBean.externalServiceEmail) && Intrinsics.areEqual((Object) this.error, (Object) ticketBean.error);
    }

    @Nullable
    public final Integer getClaimId() {
        return this.claimId;
    }

    @Nullable
    public final String getDateOfClaim() {
        return this.dateOfClaim;
    }

    @Nullable
    public final String getDateOfRepair() {
        return this.dateOfRepair;
    }

    @NotNull
    public final ClaimError getError() {
        return this.error;
    }

    @Nullable
    public final String getExternalServiceEmail() {
        return this.externalServiceEmail;
    }

    public final long getId() {
        return this.f16718id;
    }

    @NotNull
    public final ClaimProduct getProduct() {
        return this.product;
    }

    @Nullable
    public final Integer getSagClaimId() {
        return this.sagClaimId;
    }

    @Nullable
    public final Integer getServiceOrderId() {
        return this.serviceOrderId;
    }

    @Nullable
    public final String getServiceTechnician() {
        return this.serviceTechnician;
    }

    @Nullable
    public final String getService_technician() {
        return this.service_technician;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final Boolean getWarranty() {
        return this.warranty;
    }

    public int hashCode() {
        int hashCode = ((this.product.hashCode() * 31) + Long.hashCode(this.f16718id)) * 31;
        Integer num = this.claimId;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.dateOfClaim;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dateOfRepair;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.serviceTechnician;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.sagClaimId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.serviceOrderId;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.service_technician;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.status;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.warranty;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.externalServiceEmail;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((hashCode12 + i) * 31) + this.error.hashCode();
    }

    public final void setClaimId(@Nullable Integer num) {
        this.claimId = num;
    }

    public final void setDateOfClaim(@Nullable String str) {
        this.dateOfClaim = str;
    }

    public final void setDateOfRepair(@Nullable String str) {
        this.dateOfRepair = str;
    }

    public final void setError(@NotNull ClaimError claimError) {
        Intrinsics.checkNotNullParameter(claimError, "<set-?>");
        this.error = claimError;
    }

    public final void setExternalServiceEmail(@Nullable String str) {
        this.externalServiceEmail = str;
    }

    public final void setId(long j) {
        this.f16718id = j;
    }

    public final void setProduct(@NotNull ClaimProduct claimProduct) {
        Intrinsics.checkNotNullParameter(claimProduct, "<set-?>");
        this.product = claimProduct;
    }

    public final void setSagClaimId(@Nullable Integer num) {
        this.sagClaimId = num;
    }

    public final void setServiceOrderId(@Nullable Integer num) {
        this.serviceOrderId = num;
    }

    public final void setServiceTechnician(@Nullable String str) {
        this.serviceTechnician = str;
    }

    public final void setService_technician(@Nullable String str) {
        this.service_technician = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    public final void setWarranty(@Nullable Boolean bool) {
        this.warranty = bool;
    }

    @NotNull
    public String toString() {
        return "TicketBean(product=" + this.product + ", id=" + this.f16718id + ", claimId=" + this.claimId + ", dateOfClaim=" + this.dateOfClaim + ", dateOfRepair=" + this.dateOfRepair + ", source=" + this.source + ", userId=" + this.userId + ", serviceTechnician=" + this.serviceTechnician + ", sagClaimId=" + this.sagClaimId + ", serviceOrderId=" + this.serviceOrderId + ", service_technician=" + this.service_technician + ", status=" + this.status + ", warranty=" + this.warranty + ", externalServiceEmail=" + this.externalServiceEmail + ", error=" + this.error + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TicketBean(com.juconnect.connectlife.model.ClaimProduct r27, long r28, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.String r38, java.lang.String r39, java.lang.Boolean r40, java.lang.String r41, com.juconnect.connectlife.model.ClaimError r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r26 = this;
            r0 = r43
            r1 = r0 & 1
            if (r1 == 0) goto L_0x001a
            com.juconnect.connectlife.model.ClaimProduct r1 = new com.juconnect.connectlife.model.ClaimProduct
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = r1
            goto L_0x001c
        L_0x001a:
            r10 = r27
        L_0x001c:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0027
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r13 = r1
            goto L_0x0029
        L_0x0027:
            r13 = r30
        L_0x0029:
            r1 = r0 & 8
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0031
            r14 = r3
            goto L_0x0033
        L_0x0031:
            r14 = r31
        L_0x0033:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0039
            r15 = r3
            goto L_0x003b
        L_0x0039:
            r15 = r32
        L_0x003b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0042
            r16 = r3
            goto L_0x0044
        L_0x0042:
            r16 = r33
        L_0x0044:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x004b
            r17 = r3
            goto L_0x004d
        L_0x004b:
            r17 = r34
        L_0x004d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0054
            r18 = r3
            goto L_0x0056
        L_0x0054:
            r18 = r35
        L_0x0056:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0061
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r19 = r1
            goto L_0x0063
        L_0x0061:
            r19 = r36
        L_0x0063:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x006e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r20 = r1
            goto L_0x0070
        L_0x006e:
            r20 = r37
        L_0x0070:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0077
            r21 = r3
            goto L_0x0079
        L_0x0077:
            r21 = r38
        L_0x0079:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0080
            r22 = r3
            goto L_0x0082
        L_0x0080:
            r22 = r39
        L_0x0082:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x008b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r23 = r1
            goto L_0x008d
        L_0x008b:
            r23 = r40
        L_0x008d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0094
            r24 = r3
            goto L_0x0096
        L_0x0094:
            r24 = r41
        L_0x0096:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00a2
            com.juconnect.connectlife.model.ClaimError r0 = new com.juconnect.connectlife.model.ClaimError
            r0.<init>(r3, r3, r3, r3)
            r25 = r0
            goto L_0x00a4
        L_0x00a2:
            r25 = r42
        L_0x00a4:
            r9 = r26
            r11 = r28
            r9.<init>(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.model.TicketBean.<init>(com.juconnect.connectlife.model.ClaimProduct, long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, com.juconnect.connectlife.model.ClaimError, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
