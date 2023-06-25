package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J|\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006."}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/CheckUpgradeByPackageResponse;", "", "fromVersion", "", "fileSize", "updateDescription", "", "apId", "resultCode", "md5Value", "versionName", "url", "versionCode", "forcedUpdate", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getApId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFileSize", "getForcedUpdate", "getFromVersion", "getMd5Value", "()Ljava/lang/String;", "getResultCode", "()I", "getUpdateDescription", "getUrl", "getVersionCode", "getVersionName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/hisense/connect_life/hismart/model/CheckUpgradeByPackageResponse;", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuResponse.kt */
public final class CheckUpgradeByPackageResponse {
    @Nullable
    public final Integer apId;
    @Nullable
    public final Integer fileSize;
    @Nullable
    public final Integer forcedUpdate;
    @Nullable
    public final Integer fromVersion;
    @NotNull
    public final String md5Value;
    public final int resultCode;
    @Nullable
    public final String updateDescription;
    @NotNull
    public final String url;
    public final int versionCode;
    @NotNull
    public final String versionName;

    public CheckUpgradeByPackageResponse(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(str2, "md5Value");
        Intrinsics.checkNotNullParameter(str3, "versionName");
        Intrinsics.checkNotNullParameter(str4, "url");
        this.fromVersion = num;
        this.fileSize = num2;
        this.updateDescription = str;
        this.apId = num3;
        this.resultCode = i;
        this.md5Value = str2;
        this.versionName = str3;
        this.url = str4;
        this.versionCode = i2;
        this.forcedUpdate = num4;
    }

    public static /* synthetic */ CheckUpgradeByPackageResponse copy$default(CheckUpgradeByPackageResponse checkUpgradeByPackageResponse, Integer num, Integer num2, String str, Integer num3, int i, String str2, String str3, String str4, int i2, Integer num4, int i3, Object obj) {
        CheckUpgradeByPackageResponse checkUpgradeByPackageResponse2 = checkUpgradeByPackageResponse;
        int i4 = i3;
        return checkUpgradeByPackageResponse.copy((i4 & 1) != 0 ? checkUpgradeByPackageResponse2.fromVersion : num, (i4 & 2) != 0 ? checkUpgradeByPackageResponse2.fileSize : num2, (i4 & 4) != 0 ? checkUpgradeByPackageResponse2.updateDescription : str, (i4 & 8) != 0 ? checkUpgradeByPackageResponse2.apId : num3, (i4 & 16) != 0 ? checkUpgradeByPackageResponse2.resultCode : i, (i4 & 32) != 0 ? checkUpgradeByPackageResponse2.md5Value : str2, (i4 & 64) != 0 ? checkUpgradeByPackageResponse2.versionName : str3, (i4 & 128) != 0 ? checkUpgradeByPackageResponse2.url : str4, (i4 & 256) != 0 ? checkUpgradeByPackageResponse2.versionCode : i2, (i4 & 512) != 0 ? checkUpgradeByPackageResponse2.forcedUpdate : num4);
    }

    @Nullable
    public final Integer component1() {
        return this.fromVersion;
    }

    @Nullable
    public final Integer component10() {
        return this.forcedUpdate;
    }

    @Nullable
    public final Integer component2() {
        return this.fileSize;
    }

    @Nullable
    public final String component3() {
        return this.updateDescription;
    }

    @Nullable
    public final Integer component4() {
        return this.apId;
    }

    public final int component5() {
        return this.resultCode;
    }

    @NotNull
    public final String component6() {
        return this.md5Value;
    }

    @NotNull
    public final String component7() {
        return this.versionName;
    }

    @NotNull
    public final String component8() {
        return this.url;
    }

    public final int component9() {
        return this.versionCode;
    }

    @NotNull
    public final CheckUpgradeByPackageResponse copy(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @Nullable Integer num4) {
        String str5 = str2;
        Intrinsics.checkNotNullParameter(str5, "md5Value");
        String str6 = str3;
        Intrinsics.checkNotNullParameter(str6, "versionName");
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "url");
        return new CheckUpgradeByPackageResponse(num, num2, str, num3, i, str5, str6, str7, i2, num4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckUpgradeByPackageResponse)) {
            return false;
        }
        CheckUpgradeByPackageResponse checkUpgradeByPackageResponse = (CheckUpgradeByPackageResponse) obj;
        return Intrinsics.areEqual((Object) this.fromVersion, (Object) checkUpgradeByPackageResponse.fromVersion) && Intrinsics.areEqual((Object) this.fileSize, (Object) checkUpgradeByPackageResponse.fileSize) && Intrinsics.areEqual((Object) this.updateDescription, (Object) checkUpgradeByPackageResponse.updateDescription) && Intrinsics.areEqual((Object) this.apId, (Object) checkUpgradeByPackageResponse.apId) && this.resultCode == checkUpgradeByPackageResponse.resultCode && Intrinsics.areEqual((Object) this.md5Value, (Object) checkUpgradeByPackageResponse.md5Value) && Intrinsics.areEqual((Object) this.versionName, (Object) checkUpgradeByPackageResponse.versionName) && Intrinsics.areEqual((Object) this.url, (Object) checkUpgradeByPackageResponse.url) && this.versionCode == checkUpgradeByPackageResponse.versionCode && Intrinsics.areEqual((Object) this.forcedUpdate, (Object) checkUpgradeByPackageResponse.forcedUpdate);
    }

    @Nullable
    public final Integer getApId() {
        return this.apId;
    }

    @Nullable
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final Integer getForcedUpdate() {
        return this.forcedUpdate;
    }

    @Nullable
    public final Integer getFromVersion() {
        return this.fromVersion;
    }

    @NotNull
    public final String getMd5Value() {
        return this.md5Value;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final String getUpdateDescription() {
        return this.updateDescription;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        Integer num = this.fromVersion;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.fileSize;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.updateDescription;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.apId;
        int hashCode4 = (((((((((((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + Integer.hashCode(this.resultCode)) * 31) + this.md5Value.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31;
        Integer num4 = this.forcedUpdate;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public String toString() {
        return "CheckUpgradeByPackageResponse(fromVersion=" + this.fromVersion + ", fileSize=" + this.fileSize + ", updateDescription=" + this.updateDescription + ", apId=" + this.apId + ", resultCode=" + this.resultCode + ", md5Value=" + this.md5Value + ", versionName=" + this.versionName + ", url=" + this.url + ", versionCode=" + this.versionCode + ", forcedUpdate=" + this.forcedUpdate + ')';
    }
}
