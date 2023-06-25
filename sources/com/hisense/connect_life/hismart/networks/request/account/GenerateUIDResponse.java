package com.hisense.connect_life.hismart.networks.request.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/GenerateUIDResponse;", "", "resultCode", "", "desc", "", "uid", "(ILjava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getResultCode", "()I", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChinaBeans.kt */
public final class GenerateUIDResponse {
    @NotNull
    public final String desc;
    public final int resultCode;
    @NotNull
    public final String uid;

    public GenerateUIDResponse(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, "uid");
        this.resultCode = i;
        this.desc = str;
        this.uid = str2;
    }

    public static /* synthetic */ GenerateUIDResponse copy$default(GenerateUIDResponse generateUIDResponse, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = generateUIDResponse.resultCode;
        }
        if ((i2 & 2) != 0) {
            str = generateUIDResponse.desc;
        }
        if ((i2 & 4) != 0) {
            str2 = generateUIDResponse.uid;
        }
        return generateUIDResponse.copy(i, str, str2);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.desc;
    }

    @NotNull
    public final String component3() {
        return this.uid;
    }

    @NotNull
    public final GenerateUIDResponse copy(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, "uid");
        return new GenerateUIDResponse(i, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerateUIDResponse)) {
            return false;
        }
        GenerateUIDResponse generateUIDResponse = (GenerateUIDResponse) obj;
        return this.resultCode == generateUIDResponse.resultCode && Intrinsics.areEqual((Object) this.desc, (Object) generateUIDResponse.desc) && Intrinsics.areEqual((Object) this.uid, (Object) generateUIDResponse.uid);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resultCode) * 31) + this.desc.hashCode()) * 31) + this.uid.hashCode();
    }

    @NotNull
    public String toString() {
        return "GenerateUIDResponse(resultCode=" + this.resultCode + ", desc=" + this.desc + ", uid=" + this.uid + ')';
    }
}
