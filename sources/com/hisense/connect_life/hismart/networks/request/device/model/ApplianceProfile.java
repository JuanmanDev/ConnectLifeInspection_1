package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bq\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0012HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u0001\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019¨\u00069"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfile;", "", "additionalData", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApAdditionalData;", "auId", "", "characteristics", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApCharacteristic;", "connectable", "", "country", "descriptions", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApDescription;", "name", "applianceFamily", "photoUrl", "serviceIndex", "", "source", "type", "(Ljava/util/List;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/device/model/ApCharacteristic;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getAdditionalData", "()Ljava/util/List;", "getApplianceFamily", "()Ljava/lang/String;", "getAuId", "getCharacteristics", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/ApCharacteristic;", "getConnectable", "()Z", "getCountry", "getDescriptions", "getName", "getPhotoUrl", "getServiceIndex", "()J", "getSource", "getType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceProfile.kt */
public final class ApplianceProfile {
    @NotNull
    public final List<ApAdditionalData> additionalData;
    @NotNull
    public final String applianceFamily;
    @NotNull
    public final String auId;
    @NotNull
    public final ApCharacteristic characteristics;
    public final boolean connectable;
    @NotNull
    public final String country;
    @NotNull
    public final List<ApDescription> descriptions;
    @NotNull
    public final String name;
    @NotNull
    public final String photoUrl;
    public final long serviceIndex;
    @NotNull
    public final String source;
    @NotNull
    public final String type;

    public ApplianceProfile(@NotNull List<ApAdditionalData> list, @NotNull String str, @NotNull ApCharacteristic apCharacteristic, boolean z, @NotNull String str2, @NotNull List<ApDescription> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(list, "additionalData");
        Intrinsics.checkNotNullParameter(str, "auId");
        Intrinsics.checkNotNullParameter(apCharacteristic, "characteristics");
        Intrinsics.checkNotNullParameter(str2, "country");
        Intrinsics.checkNotNullParameter(list2, "descriptions");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "applianceFamily");
        Intrinsics.checkNotNullParameter(str5, "photoUrl");
        Intrinsics.checkNotNullParameter(str6, "source");
        Intrinsics.checkNotNullParameter(str7, "type");
        this.additionalData = list;
        this.auId = str;
        this.characteristics = apCharacteristic;
        this.connectable = z;
        this.country = str2;
        this.descriptions = list2;
        this.name = str3;
        this.applianceFamily = str4;
        this.photoUrl = str5;
        this.serviceIndex = j;
        this.source = str6;
        this.type = str7;
    }

    public static /* synthetic */ ApplianceProfile copy$default(ApplianceProfile applianceProfile, List list, String str, ApCharacteristic apCharacteristic, boolean z, String str2, List list2, String str3, String str4, String str5, long j, String str6, String str7, int i, Object obj) {
        ApplianceProfile applianceProfile2 = applianceProfile;
        int i2 = i;
        return applianceProfile.copy((i2 & 1) != 0 ? applianceProfile2.additionalData : list, (i2 & 2) != 0 ? applianceProfile2.auId : str, (i2 & 4) != 0 ? applianceProfile2.characteristics : apCharacteristic, (i2 & 8) != 0 ? applianceProfile2.connectable : z, (i2 & 16) != 0 ? applianceProfile2.country : str2, (i2 & 32) != 0 ? applianceProfile2.descriptions : list2, (i2 & 64) != 0 ? applianceProfile2.name : str3, (i2 & 128) != 0 ? applianceProfile2.applianceFamily : str4, (i2 & 256) != 0 ? applianceProfile2.photoUrl : str5, (i2 & 512) != 0 ? applianceProfile2.serviceIndex : j, (i2 & 1024) != 0 ? applianceProfile2.source : str6, (i2 & 2048) != 0 ? applianceProfile2.type : str7);
    }

    @NotNull
    public final List<ApAdditionalData> component1() {
        return this.additionalData;
    }

    public final long component10() {
        return this.serviceIndex;
    }

    @NotNull
    public final String component11() {
        return this.source;
    }

    @NotNull
    public final String component12() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.auId;
    }

    @NotNull
    public final ApCharacteristic component3() {
        return this.characteristics;
    }

    public final boolean component4() {
        return this.connectable;
    }

    @NotNull
    public final String component5() {
        return this.country;
    }

    @NotNull
    public final List<ApDescription> component6() {
        return this.descriptions;
    }

    @NotNull
    public final String component7() {
        return this.name;
    }

    @NotNull
    public final String component8() {
        return this.applianceFamily;
    }

    @NotNull
    public final String component9() {
        return this.photoUrl;
    }

    @NotNull
    public final ApplianceProfile copy(@NotNull List<ApAdditionalData> list, @NotNull String str, @NotNull ApCharacteristic apCharacteristic, boolean z, @NotNull String str2, @NotNull List<ApDescription> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull String str6, @NotNull String str7) {
        List<ApAdditionalData> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "additionalData");
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "auId");
        ApCharacteristic apCharacteristic2 = apCharacteristic;
        Intrinsics.checkNotNullParameter(apCharacteristic2, "characteristics");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "country");
        List<ApDescription> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "descriptions");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "name");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "applianceFamily");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "photoUrl");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "source");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, "type");
        return new ApplianceProfile(list3, str8, apCharacteristic2, z, str9, list4, str10, str11, str12, j, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplianceProfile)) {
            return false;
        }
        ApplianceProfile applianceProfile = (ApplianceProfile) obj;
        return Intrinsics.areEqual((Object) this.additionalData, (Object) applianceProfile.additionalData) && Intrinsics.areEqual((Object) this.auId, (Object) applianceProfile.auId) && Intrinsics.areEqual((Object) this.characteristics, (Object) applianceProfile.characteristics) && this.connectable == applianceProfile.connectable && Intrinsics.areEqual((Object) this.country, (Object) applianceProfile.country) && Intrinsics.areEqual((Object) this.descriptions, (Object) applianceProfile.descriptions) && Intrinsics.areEqual((Object) this.name, (Object) applianceProfile.name) && Intrinsics.areEqual((Object) this.applianceFamily, (Object) applianceProfile.applianceFamily) && Intrinsics.areEqual((Object) this.photoUrl, (Object) applianceProfile.photoUrl) && this.serviceIndex == applianceProfile.serviceIndex && Intrinsics.areEqual((Object) this.source, (Object) applianceProfile.source) && Intrinsics.areEqual((Object) this.type, (Object) applianceProfile.type);
    }

    @NotNull
    public final List<ApAdditionalData> getAdditionalData() {
        return this.additionalData;
    }

    @NotNull
    public final String getApplianceFamily() {
        return this.applianceFamily;
    }

    @NotNull
    public final String getAuId() {
        return this.auId;
    }

    @NotNull
    public final ApCharacteristic getCharacteristics() {
        return this.characteristics;
    }

    public final boolean getConnectable() {
        return this.connectable;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final List<ApDescription> getDescriptions() {
        return this.descriptions;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final long getServiceIndex() {
        return this.serviceIndex;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.additionalData.hashCode() * 31) + this.auId.hashCode()) * 31) + this.characteristics.hashCode()) * 31;
        boolean z = this.connectable;
        if (z) {
            z = true;
        }
        return ((((((((((((((((hashCode + (z ? 1 : 0)) * 31) + this.country.hashCode()) * 31) + this.descriptions.hashCode()) * 31) + this.name.hashCode()) * 31) + this.applianceFamily.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Long.hashCode(this.serviceIndex)) * 31) + this.source.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplianceProfile(additionalData=" + this.additionalData + ", auId=" + this.auId + ", characteristics=" + this.characteristics + ", connectable=" + this.connectable + ", country=" + this.country + ", descriptions=" + this.descriptions + ", name=" + this.name + ", applianceFamily=" + this.applianceFamily + ", photoUrl=" + this.photoUrl + ", serviceIndex=" + this.serviceIndex + ", source=" + this.source + ", type=" + this.type + ')';
    }
}
