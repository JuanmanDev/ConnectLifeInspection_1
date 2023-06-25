package com.juconnect.connectlife.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/InsTicketResult;", "", "claimId", "", "requestErrors", "", "Lcom/juconnect/connectlife/model/ConnTicketError;", "(ILjava/util/List;)V", "getClaimId", "()I", "getRequestErrors", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InsTicketResult.kt */
public final class InsTicketResult {
    @SerializedName("claim_id")
    public final int claimId;
    @SerializedName("RequestErrors")
    @NotNull
    public final List<ConnTicketError> requestErrors;

    public InsTicketResult(int i, @NotNull List<ConnTicketError> list) {
        Intrinsics.checkNotNullParameter(list, "requestErrors");
        this.claimId = i;
        this.requestErrors = list;
    }

    public static /* synthetic */ InsTicketResult copy$default(InsTicketResult insTicketResult, int i, List<ConnTicketError> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = insTicketResult.claimId;
        }
        if ((i2 & 2) != 0) {
            list = insTicketResult.requestErrors;
        }
        return insTicketResult.copy(i, list);
    }

    public final int component1() {
        return this.claimId;
    }

    @NotNull
    public final List<ConnTicketError> component2() {
        return this.requestErrors;
    }

    @NotNull
    public final InsTicketResult copy(int i, @NotNull List<ConnTicketError> list) {
        Intrinsics.checkNotNullParameter(list, "requestErrors");
        return new InsTicketResult(i, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsTicketResult)) {
            return false;
        }
        InsTicketResult insTicketResult = (InsTicketResult) obj;
        return this.claimId == insTicketResult.claimId && Intrinsics.areEqual((Object) this.requestErrors, (Object) insTicketResult.requestErrors);
    }

    public final int getClaimId() {
        return this.claimId;
    }

    @NotNull
    public final List<ConnTicketError> getRequestErrors() {
        return this.requestErrors;
    }

    public int hashCode() {
        return (Integer.hashCode(this.claimId) * 31) + this.requestErrors.hashCode();
    }

    @NotNull
    public String toString() {
        return "InsTicketResult(claimId=" + this.claimId + ", requestErrors=" + this.requestErrors + ')';
    }
}
