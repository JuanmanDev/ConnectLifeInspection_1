package com.hisense.connect_life.hismart.networks.request.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/ValidateUIDResponse;", "", "resultCode", "", "desc", "", "errorCode", "validStatus", "(ILjava/lang/String;II)V", "getDesc", "()Ljava/lang/String;", "getErrorCode", "()I", "getResultCode", "getValidStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChinaBeans.kt */
public final class ValidateUIDResponse {
    @NotNull
    public final String desc;
    public final int errorCode;
    public final int resultCode;
    public final int validStatus;

    public ValidateUIDResponse(int i, @NotNull String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "desc");
        this.resultCode = i;
        this.desc = str;
        this.errorCode = i2;
        this.validStatus = i3;
    }

    public static /* synthetic */ ValidateUIDResponse copy$default(ValidateUIDResponse validateUIDResponse, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = validateUIDResponse.resultCode;
        }
        if ((i4 & 2) != 0) {
            str = validateUIDResponse.desc;
        }
        if ((i4 & 4) != 0) {
            i2 = validateUIDResponse.errorCode;
        }
        if ((i4 & 8) != 0) {
            i3 = validateUIDResponse.validStatus;
        }
        return validateUIDResponse.copy(i, str, i2, i3);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.desc;
    }

    public final int component3() {
        return this.errorCode;
    }

    public final int component4() {
        return this.validStatus;
    }

    @NotNull
    public final ValidateUIDResponse copy(int i, @NotNull String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "desc");
        return new ValidateUIDResponse(i, str, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateUIDResponse)) {
            return false;
        }
        ValidateUIDResponse validateUIDResponse = (ValidateUIDResponse) obj;
        return this.resultCode == validateUIDResponse.resultCode && Intrinsics.areEqual((Object) this.desc, (Object) validateUIDResponse.desc) && this.errorCode == validateUIDResponse.errorCode && this.validStatus == validateUIDResponse.validStatus;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final int getValidStatus() {
        return this.validStatus;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.resultCode) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.errorCode)) * 31) + Integer.hashCode(this.validStatus);
    }

    @NotNull
    public String toString() {
        return "ValidateUIDResponse(resultCode=" + this.resultCode + ", desc=" + this.desc + ", errorCode=" + this.errorCode + ", validStatus=" + this.validStatus + ')';
    }
}
