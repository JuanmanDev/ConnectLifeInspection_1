package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/JhlRegisterResult;", "", "resultCode", "", "errorCode", "errorDesc", "", "(IILjava/lang/String;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorDesc", "()Ljava/lang/String;", "setErrorDesc", "(Ljava/lang/String;)V", "getResultCode", "setResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JhlRegisterResult.kt */
public final class JhlRegisterResult {
    public int errorCode;
    @NotNull
    public String errorDesc;
    public int resultCode;

    public JhlRegisterResult() {
        this(0, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public JhlRegisterResult(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        this.resultCode = i;
        this.errorCode = i2;
        this.errorDesc = str;
    }

    public static /* synthetic */ JhlRegisterResult copy$default(JhlRegisterResult jhlRegisterResult, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = jhlRegisterResult.resultCode;
        }
        if ((i3 & 2) != 0) {
            i2 = jhlRegisterResult.errorCode;
        }
        if ((i3 & 4) != 0) {
            str = jhlRegisterResult.errorDesc;
        }
        return jhlRegisterResult.copy(i, i2, str);
    }

    public final int component1() {
        return this.resultCode;
    }

    public final int component2() {
        return this.errorCode;
    }

    @NotNull
    public final String component3() {
        return this.errorDesc;
    }

    @NotNull
    public final JhlRegisterResult copy(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        return new JhlRegisterResult(i, i2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JhlRegisterResult)) {
            return false;
        }
        JhlRegisterResult jhlRegisterResult = (JhlRegisterResult) obj;
        return this.resultCode == jhlRegisterResult.resultCode && this.errorCode == jhlRegisterResult.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) jhlRegisterResult.errorDesc);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resultCode) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorDesc.hashCode();
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "JhlRegisterResult(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JhlRegisterResult(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
