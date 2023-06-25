package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/FailureBean;", "", "resultCode", "", "errorCode", "errorDesc", "", "(IILjava/lang/String;)V", "getErrorCode", "()I", "getErrorDesc", "()Ljava/lang/String;", "getResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FailureBean.kt */
public final class FailureBean {
    public final int errorCode;
    @NotNull
    public final String errorDesc;
    public final int resultCode;

    public FailureBean(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        this.resultCode = i;
        this.errorCode = i2;
        this.errorDesc = str;
    }

    public static /* synthetic */ FailureBean copy$default(FailureBean failureBean, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = failureBean.resultCode;
        }
        if ((i3 & 2) != 0) {
            i2 = failureBean.errorCode;
        }
        if ((i3 & 4) != 0) {
            str = failureBean.errorDesc;
        }
        return failureBean.copy(i, i2, str);
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
    public final FailureBean copy(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        return new FailureBean(i, i2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailureBean)) {
            return false;
        }
        FailureBean failureBean = (FailureBean) obj;
        return this.resultCode == failureBean.resultCode && this.errorCode == failureBean.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) failureBean.errorDesc);
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

    @NotNull
    public String toString() {
        return "FailureBean(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ')';
    }
}
