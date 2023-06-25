package com.juconnect.connectlife.model;

import com.hisense.connect_life.core.global.KeyConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/TicketRequestBean;", "", "auid", "", "purchase_date", "error", "Lcom/juconnect/connectlife/model/ClaimError;", "dateOfClaim", "warranty", "", "externalServiceEmail", "(Ljava/lang/String;Ljava/lang/String;Lcom/juconnect/connectlife/model/ClaimError;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAuid", "()Ljava/lang/String;", "getDateOfClaim", "getError", "()Lcom/juconnect/connectlife/model/ClaimError;", "getExternalServiceEmail", "getPurchase_date", "getWarranty", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/juconnect/connectlife/model/ClaimError;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/juconnect/connectlife/model/TicketRequestBean;", "equals", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketRequestBean.kt */
public final class TicketRequestBean {
    @NotNull
    public final String auid;
    @NotNull
    public final String dateOfClaim;
    @NotNull
    public final ClaimError error;
    @NotNull
    public final String externalServiceEmail;
    @NotNull
    public final String purchase_date;
    @Nullable
    public final Boolean warranty;

    public TicketRequestBean(@NotNull String str, @NotNull String str2, @NotNull ClaimError claimError, @NotNull String str3, @Nullable Boolean bool, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "purchase_date");
        Intrinsics.checkNotNullParameter(claimError, "error");
        Intrinsics.checkNotNullParameter(str3, "dateOfClaim");
        Intrinsics.checkNotNullParameter(str4, "externalServiceEmail");
        this.auid = str;
        this.purchase_date = str2;
        this.error = claimError;
        this.dateOfClaim = str3;
        this.warranty = bool;
        this.externalServiceEmail = str4;
    }

    public static /* synthetic */ TicketRequestBean copy$default(TicketRequestBean ticketRequestBean, String str, String str2, ClaimError claimError, String str3, Boolean bool, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketRequestBean.auid;
        }
        if ((i & 2) != 0) {
            str2 = ticketRequestBean.purchase_date;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            claimError = ticketRequestBean.error;
        }
        ClaimError claimError2 = claimError;
        if ((i & 8) != 0) {
            str3 = ticketRequestBean.dateOfClaim;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            bool = ticketRequestBean.warranty;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            str4 = ticketRequestBean.externalServiceEmail;
        }
        return ticketRequestBean.copy(str, str5, claimError2, str6, bool2, str4);
    }

    @NotNull
    public final String component1() {
        return this.auid;
    }

    @NotNull
    public final String component2() {
        return this.purchase_date;
    }

    @NotNull
    public final ClaimError component3() {
        return this.error;
    }

    @NotNull
    public final String component4() {
        return this.dateOfClaim;
    }

    @Nullable
    public final Boolean component5() {
        return this.warranty;
    }

    @NotNull
    public final String component6() {
        return this.externalServiceEmail;
    }

    @NotNull
    public final TicketRequestBean copy(@NotNull String str, @NotNull String str2, @NotNull ClaimError claimError, @NotNull String str3, @Nullable Boolean bool, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "purchase_date");
        Intrinsics.checkNotNullParameter(claimError, "error");
        Intrinsics.checkNotNullParameter(str3, "dateOfClaim");
        Intrinsics.checkNotNullParameter(str4, "externalServiceEmail");
        return new TicketRequestBean(str, str2, claimError, str3, bool, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketRequestBean)) {
            return false;
        }
        TicketRequestBean ticketRequestBean = (TicketRequestBean) obj;
        return Intrinsics.areEqual((Object) this.auid, (Object) ticketRequestBean.auid) && Intrinsics.areEqual((Object) this.purchase_date, (Object) ticketRequestBean.purchase_date) && Intrinsics.areEqual((Object) this.error, (Object) ticketRequestBean.error) && Intrinsics.areEqual((Object) this.dateOfClaim, (Object) ticketRequestBean.dateOfClaim) && Intrinsics.areEqual((Object) this.warranty, (Object) ticketRequestBean.warranty) && Intrinsics.areEqual((Object) this.externalServiceEmail, (Object) ticketRequestBean.externalServiceEmail);
    }

    @NotNull
    public final String getAuid() {
        return this.auid;
    }

    @NotNull
    public final String getDateOfClaim() {
        return this.dateOfClaim;
    }

    @NotNull
    public final ClaimError getError() {
        return this.error;
    }

    @NotNull
    public final String getExternalServiceEmail() {
        return this.externalServiceEmail;
    }

    @NotNull
    public final String getPurchase_date() {
        return this.purchase_date;
    }

    @Nullable
    public final Boolean getWarranty() {
        return this.warranty;
    }

    public int hashCode() {
        int hashCode = ((((((this.auid.hashCode() * 31) + this.purchase_date.hashCode()) * 31) + this.error.hashCode()) * 31) + this.dateOfClaim.hashCode()) * 31;
        Boolean bool = this.warranty;
        return ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.externalServiceEmail.hashCode();
    }

    @NotNull
    public String toString() {
        return "TicketRequestBean(auid=" + this.auid + ", purchase_date=" + this.purchase_date + ", error=" + this.error + ", dateOfClaim=" + this.dateOfClaim + ", warranty=" + this.warranty + ", externalServiceEmail=" + this.externalServiceEmail + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TicketRequestBean(String str, String str2, ClaimError claimError, String str3, Boolean bool, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, claimError, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? "" : str4);
    }
}
