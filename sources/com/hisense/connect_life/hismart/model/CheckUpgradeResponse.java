package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J<\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/CheckUpgradeResponse;", "", "apkVersion", "", "updateDescription", "", "needUpdate", "resultCode", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;I)V", "getApkVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNeedUpdate", "getResultCode", "()I", "getUpdateDescription", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;I)Lcom/hisense/connect_life/hismart/model/CheckUpgradeResponse;", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuResponse.kt */
public final class CheckUpgradeResponse {
    @Nullable
    public final Integer apkVersion;
    @Nullable
    public final Integer needUpdate;
    public final int resultCode;
    @Nullable
    public final String updateDescription;

    public CheckUpgradeResponse(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, int i) {
        this.apkVersion = num;
        this.updateDescription = str;
        this.needUpdate = num2;
        this.resultCode = i;
    }

    public static /* synthetic */ CheckUpgradeResponse copy$default(CheckUpgradeResponse checkUpgradeResponse, Integer num, String str, Integer num2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = checkUpgradeResponse.apkVersion;
        }
        if ((i2 & 2) != 0) {
            str = checkUpgradeResponse.updateDescription;
        }
        if ((i2 & 4) != 0) {
            num2 = checkUpgradeResponse.needUpdate;
        }
        if ((i2 & 8) != 0) {
            i = checkUpgradeResponse.resultCode;
        }
        return checkUpgradeResponse.copy(num, str, num2, i);
    }

    @Nullable
    public final Integer component1() {
        return this.apkVersion;
    }

    @Nullable
    public final String component2() {
        return this.updateDescription;
    }

    @Nullable
    public final Integer component3() {
        return this.needUpdate;
    }

    public final int component4() {
        return this.resultCode;
    }

    @NotNull
    public final CheckUpgradeResponse copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, int i) {
        return new CheckUpgradeResponse(num, str, num2, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckUpgradeResponse)) {
            return false;
        }
        CheckUpgradeResponse checkUpgradeResponse = (CheckUpgradeResponse) obj;
        return Intrinsics.areEqual((Object) this.apkVersion, (Object) checkUpgradeResponse.apkVersion) && Intrinsics.areEqual((Object) this.updateDescription, (Object) checkUpgradeResponse.updateDescription) && Intrinsics.areEqual((Object) this.needUpdate, (Object) checkUpgradeResponse.needUpdate) && this.resultCode == checkUpgradeResponse.resultCode;
    }

    @Nullable
    public final Integer getApkVersion() {
        return this.apkVersion;
    }

    @Nullable
    public final Integer getNeedUpdate() {
        return this.needUpdate;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final String getUpdateDescription() {
        return this.updateDescription;
    }

    public int hashCode() {
        Integer num = this.apkVersion;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.updateDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.needUpdate;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.hashCode(this.resultCode);
    }

    @NotNull
    public String toString() {
        return "CheckUpgradeResponse(apkVersion=" + this.apkVersion + ", updateDescription=" + this.updateDescription + ", needUpdate=" + this.needUpdate + ", resultCode=" + this.resultCode + ')';
    }
}
