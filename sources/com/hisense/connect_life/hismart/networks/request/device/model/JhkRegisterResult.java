package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/JhkRegisterResult;", "", "resultCode", "", "errorCode", "errorDesc", "", "(IILjava/lang/String;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorDesc", "()Ljava/lang/String;", "setErrorDesc", "(Ljava/lang/String;)V", "getResultCode", "setResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JhkRegisterResult.kt */
public final class JhkRegisterResult {
    public int errorCode;
    @NotNull
    public String errorDesc;
    public int resultCode;

    public JhkRegisterResult() {
        this(0, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public JhkRegisterResult(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        this.resultCode = i;
        this.errorCode = i2;
        this.errorDesc = str;
    }

    public static /* synthetic */ JhkRegisterResult copy$default(JhkRegisterResult jhkRegisterResult, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = jhkRegisterResult.resultCode;
        }
        if ((i3 & 2) != 0) {
            i2 = jhkRegisterResult.errorCode;
        }
        if ((i3 & 4) != 0) {
            str = jhkRegisterResult.errorDesc;
        }
        return jhkRegisterResult.copy(i, i2, str);
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
    public final JhkRegisterResult copy(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        return new JhkRegisterResult(i, i2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JhkRegisterResult)) {
            return false;
        }
        JhkRegisterResult jhkRegisterResult = (JhkRegisterResult) obj;
        return this.resultCode == jhkRegisterResult.resultCode && this.errorCode == jhkRegisterResult.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) jhkRegisterResult.errorDesc);
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
        return "JhkRegisterResult(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JhkRegisterResult(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
