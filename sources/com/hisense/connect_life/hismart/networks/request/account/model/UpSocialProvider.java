package com.hisense.connect_life.hismart.networks.request.account.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UpSocialProvider;", "Ljava/io/Serializable;", "extendedInfo", "", "socialProviderId", "socialUserProfileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExtendedInfo", "()Ljava/lang/String;", "getSocialProviderId", "getSocialUserProfileId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpSocialProvider.kt */
public final class UpSocialProvider implements Serializable {
    @NotNull
    public final String extendedInfo;
    @NotNull
    public final String socialProviderId;
    @NotNull
    public final String socialUserProfileId;

    public UpSocialProvider(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "extendedInfo");
        Intrinsics.checkNotNullParameter(str2, "socialProviderId");
        Intrinsics.checkNotNullParameter(str3, "socialUserProfileId");
        this.extendedInfo = str;
        this.socialProviderId = str2;
        this.socialUserProfileId = str3;
    }

    public static /* synthetic */ UpSocialProvider copy$default(UpSocialProvider upSocialProvider, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upSocialProvider.extendedInfo;
        }
        if ((i & 2) != 0) {
            str2 = upSocialProvider.socialProviderId;
        }
        if ((i & 4) != 0) {
            str3 = upSocialProvider.socialUserProfileId;
        }
        return upSocialProvider.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.extendedInfo;
    }

    @NotNull
    public final String component2() {
        return this.socialProviderId;
    }

    @NotNull
    public final String component3() {
        return this.socialUserProfileId;
    }

    @NotNull
    public final UpSocialProvider copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "extendedInfo");
        Intrinsics.checkNotNullParameter(str2, "socialProviderId");
        Intrinsics.checkNotNullParameter(str3, "socialUserProfileId");
        return new UpSocialProvider(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpSocialProvider)) {
            return false;
        }
        UpSocialProvider upSocialProvider = (UpSocialProvider) obj;
        return Intrinsics.areEqual((Object) this.extendedInfo, (Object) upSocialProvider.extendedInfo) && Intrinsics.areEqual((Object) this.socialProviderId, (Object) upSocialProvider.socialProviderId) && Intrinsics.areEqual((Object) this.socialUserProfileId, (Object) upSocialProvider.socialUserProfileId);
    }

    @NotNull
    public final String getExtendedInfo() {
        return this.extendedInfo;
    }

    @NotNull
    public final String getSocialProviderId() {
        return this.socialProviderId;
    }

    @NotNull
    public final String getSocialUserProfileId() {
        return this.socialUserProfileId;
    }

    public int hashCode() {
        return (((this.extendedInfo.hashCode() * 31) + this.socialProviderId.hashCode()) * 31) + this.socialUserProfileId.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpSocialProvider(extendedInfo=" + this.extendedInfo + ", socialProviderId=" + this.socialProviderId + ", socialUserProfileId=" + this.socialUserProfileId + ')';
    }
}
