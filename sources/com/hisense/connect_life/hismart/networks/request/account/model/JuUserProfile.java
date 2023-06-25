package com.hisense.connect_life.hismart.networks.request.account.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/JuUserProfile;", "", "resultCode", "", "desc", "", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "(ILjava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;)V", "getDesc", "()Ljava/lang/String;", "getResultCode", "()I", "getUserProfile", "()Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuUserProfile.kt */
public final class JuUserProfile {
    @NotNull
    public final String desc;
    public final int resultCode;
    @NotNull
    public final UserProfile userProfile;

    public JuUserProfile(int i, @NotNull String str, @NotNull UserProfile userProfile2) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(userProfile2, "userProfile");
        this.resultCode = i;
        this.desc = str;
        this.userProfile = userProfile2;
    }

    public static /* synthetic */ JuUserProfile copy$default(JuUserProfile juUserProfile, int i, String str, UserProfile userProfile2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = juUserProfile.resultCode;
        }
        if ((i2 & 2) != 0) {
            str = juUserProfile.desc;
        }
        if ((i2 & 4) != 0) {
            userProfile2 = juUserProfile.userProfile;
        }
        return juUserProfile.copy(i, str, userProfile2);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.desc;
    }

    @NotNull
    public final UserProfile component3() {
        return this.userProfile;
    }

    @NotNull
    public final JuUserProfile copy(int i, @NotNull String str, @NotNull UserProfile userProfile2) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(userProfile2, "userProfile");
        return new JuUserProfile(i, str, userProfile2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuUserProfile)) {
            return false;
        }
        JuUserProfile juUserProfile = (JuUserProfile) obj;
        return this.resultCode == juUserProfile.resultCode && Intrinsics.areEqual((Object) this.desc, (Object) juUserProfile.desc) && Intrinsics.areEqual((Object) this.userProfile, (Object) juUserProfile.userProfile);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final UserProfile getUserProfile() {
        return this.userProfile;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resultCode) * 31) + this.desc.hashCode()) * 31) + this.userProfile.hashCode();
    }

    @NotNull
    public String toString() {
        return "JuUserProfile(resultCode=" + this.resultCode + ", desc=" + this.desc + ", userProfile=" + this.userProfile + ')';
    }
}
