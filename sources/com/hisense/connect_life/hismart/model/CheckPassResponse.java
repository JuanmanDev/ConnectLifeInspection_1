package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\r¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/CheckPassResponse;", "", "resultCode", "", "desc", "", "isHavePass", "(ILjava/lang/String;I)V", "getDesc", "()Ljava/lang/String;", "()I", "getResultCode", "setResultCode", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuResponse.kt */
public final class CheckPassResponse {
    @NotNull
    public final String desc;
    public final int isHavePass;
    public int resultCode;

    public CheckPassResponse(int i, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "desc");
        this.resultCode = i;
        this.desc = str;
        this.isHavePass = i2;
    }

    public static /* synthetic */ CheckPassResponse copy$default(CheckPassResponse checkPassResponse, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = checkPassResponse.resultCode;
        }
        if ((i3 & 2) != 0) {
            str = checkPassResponse.desc;
        }
        if ((i3 & 4) != 0) {
            i2 = checkPassResponse.isHavePass;
        }
        return checkPassResponse.copy(i, str, i2);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.desc;
    }

    public final int component3() {
        return this.isHavePass;
    }

    @NotNull
    public final CheckPassResponse copy(int i, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "desc");
        return new CheckPassResponse(i, str, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckPassResponse)) {
            return false;
        }
        CheckPassResponse checkPassResponse = (CheckPassResponse) obj;
        return this.resultCode == checkPassResponse.resultCode && Intrinsics.areEqual((Object) this.desc, (Object) checkPassResponse.desc) && this.isHavePass == checkPassResponse.isHavePass;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resultCode) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.isHavePass);
    }

    public final int isHavePass() {
        return this.isHavePass;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "CheckPassResponse(resultCode=" + this.resultCode + ", desc=" + this.desc + ", isHavePass=" + this.isHavePass + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckPassResponse(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, i2);
    }
}
