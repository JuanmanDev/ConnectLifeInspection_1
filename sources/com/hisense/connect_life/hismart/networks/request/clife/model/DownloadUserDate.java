package com.hisense.connect_life.hismart.networks.request.clife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/clife/model/DownloadUserDate;", "", "resultCode", "", "url", "", "(ILjava/lang/String;)V", "getResultCode", "()I", "setResultCode", "(I)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DownloadUserDate.kt */
public final class DownloadUserDate {
    public int resultCode;
    @NotNull
    public String url;

    public DownloadUserDate(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.resultCode = i;
        this.url = str;
    }

    public static /* synthetic */ DownloadUserDate copy$default(DownloadUserDate downloadUserDate, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = downloadUserDate.resultCode;
        }
        if ((i2 & 2) != 0) {
            str = downloadUserDate.url;
        }
        return downloadUserDate.copy(i, str);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final DownloadUserDate copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        return new DownloadUserDate(i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadUserDate)) {
            return false;
        }
        DownloadUserDate downloadUserDate = (DownloadUserDate) obj;
        return this.resultCode == downloadUserDate.resultCode && Intrinsics.areEqual((Object) this.url, (Object) downloadUserDate.url);
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (Integer.hashCode(this.resultCode) * 31) + this.url.hashCode();
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "DownloadUserDate(resultCode=" + this.resultCode + ", url=" + this.url + ')';
    }
}
