package com.hisense.connect_life.hismart.networks.request.account.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jç\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00072\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020SHÖ\u0001J\b\u0010T\u001a\u00020\u0003H\u0016R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0017\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\u001a\u0010\u0018\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001d¨\u0006U"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "Ljava/io/Serializable;", "userId", "", "firstName", "lastName", "addresses", "", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAddress;", "phoneNumbers", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpPhone;", "language", "photoUrl", "socialAuthProviders", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpSocialProvider;", "birthDate", "gender", "userMedia", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpMedia;", "additionalData", "", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAdditionData;", "source", "addressType", "phoneType", "country", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalData", "()Ljava/util/List;", "setAdditionalData", "(Ljava/util/List;)V", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getAddresses", "setAddresses", "getBirthDate", "getCountry", "setCountry", "getFirstName", "setFirstName", "getGender", "setGender", "getLanguage", "setLanguage", "getLastName", "setLastName", "getPhoneNumbers", "setPhoneNumbers", "getPhoneType", "setPhoneType", "getPhotoUrl", "getSocialAuthProviders", "getSource", "getTitle", "setTitle", "getUserId", "getUserMedia", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfile.kt */
public final class UserProfile implements Serializable {
    @Nullable
    public List<UpAdditionData> additionalData;
    @NotNull
    public String addressType;
    @Nullable
    public List<UpAddress> addresses;
    @Nullable
    public final String birthDate;
    @Nullable
    public String country;
    @NotNull
    public String firstName;
    @Nullable
    public String gender;
    @Nullable
    public String language;
    @NotNull
    public String lastName;
    @Nullable
    public List<UpPhone> phoneNumbers;
    @NotNull
    public String phoneType;
    @Nullable
    public final String photoUrl;
    @Nullable
    public final List<UpSocialProvider> socialAuthProviders;
    @NotNull
    public final String source;
    @Nullable
    public String title;
    @NotNull
    public final String userId;
    @Nullable
    public final List<UpMedia> userMedia;

    public UserProfile() {
        this((String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    public UserProfile(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable List<UpAddress> list, @Nullable List<UpPhone> list2, @Nullable String str4, @Nullable String str5, @Nullable List<UpSocialProvider> list3, @Nullable String str6, @Nullable String str7, @Nullable List<UpMedia> list4, @Nullable List<UpAdditionData> list5, @NotNull String str8, @NotNull String str9, @NotNull String str10, @Nullable String str11, @Nullable String str12) {
        String str13 = str8;
        String str14 = str9;
        String str15 = str10;
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        Intrinsics.checkNotNullParameter(str13, "source");
        Intrinsics.checkNotNullParameter(str14, "addressType");
        Intrinsics.checkNotNullParameter(str15, "phoneType");
        this.userId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.addresses = list;
        this.phoneNumbers = list2;
        this.language = str4;
        this.photoUrl = str5;
        this.socialAuthProviders = list3;
        this.birthDate = str6;
        this.gender = str7;
        this.userMedia = list4;
        this.additionalData = list5;
        this.source = str13;
        this.addressType = str14;
        this.phoneType = str15;
        this.country = str11;
        this.title = str12;
    }

    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, String str2, String str3, List list, List list2, String str4, String str5, List list3, String str6, String str7, List list4, List list5, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        UserProfile userProfile2 = userProfile;
        int i2 = i;
        return userProfile.copy((i2 & 1) != 0 ? userProfile2.userId : str, (i2 & 2) != 0 ? userProfile2.firstName : str2, (i2 & 4) != 0 ? userProfile2.lastName : str3, (i2 & 8) != 0 ? userProfile2.addresses : list, (i2 & 16) != 0 ? userProfile2.phoneNumbers : list2, (i2 & 32) != 0 ? userProfile2.language : str4, (i2 & 64) != 0 ? userProfile2.photoUrl : str5, (i2 & 128) != 0 ? userProfile2.socialAuthProviders : list3, (i2 & 256) != 0 ? userProfile2.birthDate : str6, (i2 & 512) != 0 ? userProfile2.gender : str7, (i2 & 1024) != 0 ? userProfile2.userMedia : list4, (i2 & 2048) != 0 ? userProfile2.additionalData : list5, (i2 & 4096) != 0 ? userProfile2.source : str8, (i2 & 8192) != 0 ? userProfile2.addressType : str9, (i2 & 16384) != 0 ? userProfile2.phoneType : str10, (i2 & 32768) != 0 ? userProfile2.country : str11, (i2 & 65536) != 0 ? userProfile2.title : str12);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    @Nullable
    public final String component10() {
        return this.gender;
    }

    @Nullable
    public final List<UpMedia> component11() {
        return this.userMedia;
    }

    @Nullable
    public final List<UpAdditionData> component12() {
        return this.additionalData;
    }

    @NotNull
    public final String component13() {
        return this.source;
    }

    @NotNull
    public final String component14() {
        return this.addressType;
    }

    @NotNull
    public final String component15() {
        return this.phoneType;
    }

    @Nullable
    public final String component16() {
        return this.country;
    }

    @Nullable
    public final String component17() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.firstName;
    }

    @NotNull
    public final String component3() {
        return this.lastName;
    }

    @Nullable
    public final List<UpAddress> component4() {
        return this.addresses;
    }

    @Nullable
    public final List<UpPhone> component5() {
        return this.phoneNumbers;
    }

    @Nullable
    public final String component6() {
        return this.language;
    }

    @Nullable
    public final String component7() {
        return this.photoUrl;
    }

    @Nullable
    public final List<UpSocialProvider> component8() {
        return this.socialAuthProviders;
    }

    @Nullable
    public final String component9() {
        return this.birthDate;
    }

    @NotNull
    public final UserProfile copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable List<UpAddress> list, @Nullable List<UpPhone> list2, @Nullable String str4, @Nullable String str5, @Nullable List<UpSocialProvider> list3, @Nullable String str6, @Nullable String str7, @Nullable List<UpMedia> list4, @Nullable List<UpAdditionData> list5, @NotNull String str8, @NotNull String str9, @NotNull String str10, @Nullable String str11, @Nullable String str12) {
        String str13 = str;
        Intrinsics.checkNotNullParameter(str13, "userId");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        Intrinsics.checkNotNullParameter(str8, "source");
        Intrinsics.checkNotNullParameter(str9, "addressType");
        Intrinsics.checkNotNullParameter(str10, "phoneType");
        return new UserProfile(str13, str2, str3, list, list2, str4, str5, list3, str6, str7, list4, list5, str8, str9, str10, str11, str12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) userProfile.userId) && Intrinsics.areEqual((Object) this.firstName, (Object) userProfile.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) userProfile.lastName) && Intrinsics.areEqual((Object) this.addresses, (Object) userProfile.addresses) && Intrinsics.areEqual((Object) this.phoneNumbers, (Object) userProfile.phoneNumbers) && Intrinsics.areEqual((Object) this.language, (Object) userProfile.language) && Intrinsics.areEqual((Object) this.photoUrl, (Object) userProfile.photoUrl) && Intrinsics.areEqual((Object) this.socialAuthProviders, (Object) userProfile.socialAuthProviders) && Intrinsics.areEqual((Object) this.birthDate, (Object) userProfile.birthDate) && Intrinsics.areEqual((Object) this.gender, (Object) userProfile.gender) && Intrinsics.areEqual((Object) this.userMedia, (Object) userProfile.userMedia) && Intrinsics.areEqual((Object) this.additionalData, (Object) userProfile.additionalData) && Intrinsics.areEqual((Object) this.source, (Object) userProfile.source) && Intrinsics.areEqual((Object) this.addressType, (Object) userProfile.addressType) && Intrinsics.areEqual((Object) this.phoneType, (Object) userProfile.phoneType) && Intrinsics.areEqual((Object) this.country, (Object) userProfile.country) && Intrinsics.areEqual((Object) this.title, (Object) userProfile.title);
    }

    @Nullable
    public final List<UpAdditionData> getAdditionalData() {
        return this.additionalData;
    }

    @NotNull
    public final String getAddressType() {
        return this.addressType;
    }

    @Nullable
    public final List<UpAddress> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final List<UpPhone> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    @NotNull
    public final String getPhoneType() {
        return this.phoneType;
    }

    @Nullable
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    @Nullable
    public final List<UpSocialProvider> getSocialAuthProviders() {
        return this.socialAuthProviders;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final List<UpMedia> getUserMedia() {
        return this.userMedia;
    }

    public int hashCode() {
        int hashCode = ((((this.userId.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31;
        List<UpAddress> list = this.addresses;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UpPhone> list2 = this.phoneNumbers;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.language;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UpSocialProvider> list3 = this.socialAuthProviders;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.birthDate;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gender;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<UpMedia> list4 = this.userMedia;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UpAdditionData> list5 = this.additionalData;
        int hashCode10 = (((((((hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31) + this.source.hashCode()) * 31) + this.addressType.hashCode()) * 31) + this.phoneType.hashCode()) * 31;
        String str5 = this.country;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode11 + i;
    }

    public final void setAdditionalData(@Nullable List<UpAdditionData> list) {
        this.additionalData = list;
    }

    public final void setAddressType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.addressType = str;
    }

    public final void setAddresses(@Nullable List<UpAddress> list) {
        this.addresses = list;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setGender(@Nullable String str) {
        this.gender = str;
    }

    public final void setLanguage(@Nullable String str) {
        this.language = str;
    }

    public final void setLastName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public final void setPhoneNumbers(@Nullable List<UpPhone> list) {
        this.phoneNumbers = list;
    }

    public final void setPhoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneType = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "UserProfile(userId='" + this.userId + "', firstName='" + this.firstName + "', lastName='" + this.lastName + "', addresses=" + this.addresses + ", phoneNumbers=" + this.phoneNumbers + ", language=" + this.language + ", photoUrl=" + this.photoUrl + ", socialAuthProviders=" + this.socialAuthProviders + ", birthDate=" + this.birthDate + ", gender=" + this.gender + ", userMedia=" + this.userMedia + ", additionalData=" + this.additionalData + ", source='" + this.source + "', addressType='" + this.addressType + "', phoneType='" + this.phoneType + "', country='" + this.country + "')";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserProfile(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List r22, java.util.List r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.String r27, java.lang.String r28, java.util.List r29, java.util.List r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r19
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r20
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r21
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0025
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            goto L_0x0027
        L_0x0025:
            r5 = r22
        L_0x0027:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0030
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            goto L_0x0032
        L_0x0030:
            r6 = r23
        L_0x0032:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0038
            r7 = r2
            goto L_0x003a
        L_0x0038:
            r7 = r24
        L_0x003a:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0040
            r8 = r2
            goto L_0x0042
        L_0x0040:
            r8 = r25
        L_0x0042:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x004b
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            goto L_0x004d
        L_0x004b:
            r9 = r26
        L_0x004d:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0053
            r10 = r2
            goto L_0x0055
        L_0x0053:
            r10 = r27
        L_0x0055:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005b
            r11 = r2
            goto L_0x005d
        L_0x005b:
            r11 = r28
        L_0x005d:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0066
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            goto L_0x0068
        L_0x0066:
            r12 = r29
        L_0x0068:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0072
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto L_0x0074
        L_0x0072:
            r13 = r30
        L_0x0074:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x007b
            java.lang.String r14 = "JUCONNECT"
            goto L_0x007d
        L_0x007b:
            r14 = r31
        L_0x007d:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0084
            java.lang.String r15 = "BILLING"
            goto L_0x0086
        L_0x0084:
            r15 = r32
        L_0x0086:
            r37 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x008f
            java.lang.String r2 = "MOBILE"
            goto L_0x0091
        L_0x008f:
            r2 = r33
        L_0x0091:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x009b
            r16 = r37
            goto L_0x009d
        L_0x009b:
            r16 = r34
        L_0x009d:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x00a6
            r0 = r37
            goto L_0x00a8
        L_0x00a6:
            r0 = r35
        L_0x00a8:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.account.model.UserProfile.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
