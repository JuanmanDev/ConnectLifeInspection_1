package com.hisense.connect_life.hismart.networks.request.appupdate;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000e¨\u0006)"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/appupdate/AppPolicyModel;", "", "resultCode", "", "needUpdate", "apkVersion", "", "updateDescription", "errorCode", "", "errorDesc", "desc", "(IILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getApkVersion", "()Ljava/lang/String;", "getDesc", "setDesc", "(Ljava/lang/String;)V", "getErrorCode", "()J", "setErrorCode", "(J)V", "getErrorDesc", "setErrorDesc", "getNeedUpdate", "()I", "getResultCode", "getUpdateDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AppPolicyModel.kt */
public final class AppPolicyModel {
    @NotNull
    public final String apkVersion;
    @NotNull
    public String desc;
    public long errorCode;
    @NotNull
    public String errorDesc;
    public final int needUpdate;
    public final int resultCode;
    @NotNull
    public final String updateDescription;

    public AppPolicyModel(int i, int i2, @NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "apkVersion");
        Intrinsics.checkNotNullParameter(str2, "updateDescription");
        Intrinsics.checkNotNullParameter(str3, "errorDesc");
        Intrinsics.checkNotNullParameter(str4, "desc");
        this.resultCode = i;
        this.needUpdate = i2;
        this.apkVersion = str;
        this.updateDescription = str2;
        this.errorCode = j;
        this.errorDesc = str3;
        this.desc = str4;
    }

    public static /* synthetic */ AppPolicyModel copy$default(AppPolicyModel appPolicyModel, int i, int i2, String str, String str2, long j, String str3, String str4, int i3, Object obj) {
        AppPolicyModel appPolicyModel2 = appPolicyModel;
        return appPolicyModel.copy((i3 & 1) != 0 ? appPolicyModel2.resultCode : i, (i3 & 2) != 0 ? appPolicyModel2.needUpdate : i2, (i3 & 4) != 0 ? appPolicyModel2.apkVersion : str, (i3 & 8) != 0 ? appPolicyModel2.updateDescription : str2, (i3 & 16) != 0 ? appPolicyModel2.errorCode : j, (i3 & 32) != 0 ? appPolicyModel2.errorDesc : str3, (i3 & 64) != 0 ? appPolicyModel2.desc : str4);
    }

    public final int component1() {
        return this.resultCode;
    }

    public final int component2() {
        return this.needUpdate;
    }

    @NotNull
    public final String component3() {
        return this.apkVersion;
    }

    @NotNull
    public final String component4() {
        return this.updateDescription;
    }

    public final long component5() {
        return this.errorCode;
    }

    @NotNull
    public final String component6() {
        return this.errorDesc;
    }

    @NotNull
    public final String component7() {
        return this.desc;
    }

    @NotNull
    public final AppPolicyModel copy(int i, int i2, @NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "apkVersion");
        Intrinsics.checkNotNullParameter(str2, "updateDescription");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "errorDesc");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "desc");
        return new AppPolicyModel(i, i2, str, str2, j, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppPolicyModel)) {
            return false;
        }
        AppPolicyModel appPolicyModel = (AppPolicyModel) obj;
        return this.resultCode == appPolicyModel.resultCode && this.needUpdate == appPolicyModel.needUpdate && Intrinsics.areEqual((Object) this.apkVersion, (Object) appPolicyModel.apkVersion) && Intrinsics.areEqual((Object) this.updateDescription, (Object) appPolicyModel.updateDescription) && this.errorCode == appPolicyModel.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) appPolicyModel.errorDesc) && Intrinsics.areEqual((Object) this.desc, (Object) appPolicyModel.desc);
    }

    @NotNull
    public final String getApkVersion() {
        return this.apkVersion;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final long getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getNeedUpdate() {
        return this.needUpdate;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getUpdateDescription() {
        return this.updateDescription;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.resultCode) * 31) + Integer.hashCode(this.needUpdate)) * 31) + this.apkVersion.hashCode()) * 31) + this.updateDescription.hashCode()) * 31) + Long.hashCode(this.errorCode)) * 31) + this.errorDesc.hashCode()) * 31) + this.desc.hashCode();
    }

    public final void setDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc = str;
    }

    public final void setErrorCode(long j) {
        this.errorCode = j;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    @NotNull
    public String toString() {
        return "AppPolicyModel(resultCode=" + this.resultCode + ", needUpdate=" + this.needUpdate + ", apkVersion=" + this.apkVersion + ", updateDescription=" + this.updateDescription + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ", desc=" + this.desc + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppPolicyModel(int i, int i2, String str, String str2, long j, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? -1 : j, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? "" : str4);
    }
}
