package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/UserDNameModel;", "", "resultCode", "", "svcDname", "", "pushDname", "region", "numericCode", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getNumericCode", "()I", "getPushDname", "()Ljava/lang/String;", "getRegion", "getResultCode", "getSvcDname", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserDNameModel.kt */
public final class UserDNameModel {
    public final int numericCode;
    @NotNull
    public final String pushDname;
    @NotNull
    public final String region;
    public final int resultCode;
    @NotNull
    public final String svcDname;

    public UserDNameModel(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "svcDname");
        Intrinsics.checkNotNullParameter(str2, "pushDname");
        Intrinsics.checkNotNullParameter(str3, "region");
        this.resultCode = i;
        this.svcDname = str;
        this.pushDname = str2;
        this.region = str3;
        this.numericCode = i2;
    }

    public static /* synthetic */ UserDNameModel copy$default(UserDNameModel userDNameModel, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = userDNameModel.resultCode;
        }
        if ((i3 & 2) != 0) {
            str = userDNameModel.svcDname;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = userDNameModel.pushDname;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = userDNameModel.region;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = userDNameModel.numericCode;
        }
        return userDNameModel.copy(i, str4, str5, str6, i2);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.svcDname;
    }

    @NotNull
    public final String component3() {
        return this.pushDname;
    }

    @NotNull
    public final String component4() {
        return this.region;
    }

    public final int component5() {
        return this.numericCode;
    }

    @NotNull
    public final UserDNameModel copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "svcDname");
        Intrinsics.checkNotNullParameter(str2, "pushDname");
        Intrinsics.checkNotNullParameter(str3, "region");
        return new UserDNameModel(i, str, str2, str3, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDNameModel)) {
            return false;
        }
        UserDNameModel userDNameModel = (UserDNameModel) obj;
        return this.resultCode == userDNameModel.resultCode && Intrinsics.areEqual((Object) this.svcDname, (Object) userDNameModel.svcDname) && Intrinsics.areEqual((Object) this.pushDname, (Object) userDNameModel.pushDname) && Intrinsics.areEqual((Object) this.region, (Object) userDNameModel.region) && this.numericCode == userDNameModel.numericCode;
    }

    public final int getNumericCode() {
        return this.numericCode;
    }

    @NotNull
    public final String getPushDname() {
        return this.pushDname;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getSvcDname() {
        return this.svcDname;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.resultCode) * 31) + this.svcDname.hashCode()) * 31) + this.pushDname.hashCode()) * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.numericCode);
    }

    @NotNull
    public String toString() {
        return "UserDNameModel(resultCode=" + this.resultCode + ", svcDname=" + this.svcDname + ", pushDname=" + this.pushDname + ", region=" + this.region + ", numericCode=" + this.numericCode + ')';
    }
}
