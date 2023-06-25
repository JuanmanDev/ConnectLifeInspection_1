package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001By\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0013HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006HÆ\u0001J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006<"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceProfileHeidi;", "", "additionalData", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApAdditionalData;", "auId", "", "heidi", "characteristics", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApCharacteristic;", "connectable", "", "country", "descriptions", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ApDescription;", "name", "applianceFamily", "photoUrl", "serviceIndex", "", "source", "type", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/device/model/ApCharacteristic;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getAdditionalData", "()Ljava/util/List;", "getApplianceFamily", "()Ljava/lang/String;", "getAuId", "getCharacteristics", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/ApCharacteristic;", "getConnectable", "()Z", "getCountry", "getDescriptions", "getHeidi", "getName", "getPhotoUrl", "getServiceIndex", "()J", "getSource", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceProfileHeidi.kt */
public final class ApplianceProfileHeidi {
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
    public final String heidi;
    @NotNull
    public final String name;
    @NotNull
    public final String photoUrl;
    public final long serviceIndex;
    @NotNull
    public final String source;
    @NotNull
    public final String type;

    public ApplianceProfileHeidi(@NotNull List<ApAdditionalData> list, @NotNull String str, @NotNull String str2, @NotNull ApCharacteristic apCharacteristic, boolean z, @NotNull String str3, @NotNull List<ApDescription> list2, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(list, "additionalData");
        Intrinsics.checkNotNullParameter(str, "auId");
        Intrinsics.checkNotNullParameter(str2, "heidi");
        Intrinsics.checkNotNullParameter(apCharacteristic, "characteristics");
        Intrinsics.checkNotNullParameter(str3, "country");
        Intrinsics.checkNotNullParameter(list2, "descriptions");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "applianceFamily");
        Intrinsics.checkNotNullParameter(str6, "photoUrl");
        Intrinsics.checkNotNullParameter(str7, "source");
        Intrinsics.checkNotNullParameter(str8, "type");
        this.additionalData = list;
        this.auId = str;
        this.heidi = str2;
        this.characteristics = apCharacteristic;
        this.connectable = z;
        this.country = str3;
        this.descriptions = list2;
        this.name = str4;
        this.applianceFamily = str5;
        this.photoUrl = str6;
        this.serviceIndex = j;
        this.source = str7;
        this.type = str8;
    }

    public static /* synthetic */ ApplianceProfileHeidi copy$default(ApplianceProfileHeidi applianceProfileHeidi, List list, String str, String str2, ApCharacteristic apCharacteristic, boolean z, String str3, List list2, String str4, String str5, String str6, long j, String str7, String str8, int i, Object obj) {
        ApplianceProfileHeidi applianceProfileHeidi2 = applianceProfileHeidi;
        int i2 = i;
        return applianceProfileHeidi.copy((i2 & 1) != 0 ? applianceProfileHeidi2.additionalData : list, (i2 & 2) != 0 ? applianceProfileHeidi2.auId : str, (i2 & 4) != 0 ? applianceProfileHeidi2.heidi : str2, (i2 & 8) != 0 ? applianceProfileHeidi2.characteristics : apCharacteristic, (i2 & 16) != 0 ? applianceProfileHeidi2.connectable : z, (i2 & 32) != 0 ? applianceProfileHeidi2.country : str3, (i2 & 64) != 0 ? applianceProfileHeidi2.descriptions : list2, (i2 & 128) != 0 ? applianceProfileHeidi2.name : str4, (i2 & 256) != 0 ? applianceProfileHeidi2.applianceFamily : str5, (i2 & 512) != 0 ? applianceProfileHeidi2.photoUrl : str6, (i2 & 1024) != 0 ? applianceProfileHeidi2.serviceIndex : j, (i2 & 2048) != 0 ? applianceProfileHeidi2.source : str7, (i2 & 4096) != 0 ? applianceProfileHeidi2.type : str8);
    }

    @NotNull
    public final List<ApAdditionalData> component1() {
        return this.additionalData;
    }

    @NotNull
    public final String component10() {
        return this.photoUrl;
    }

    public final long component11() {
        return this.serviceIndex;
    }

    @NotNull
    public final String component12() {
        return this.source;
    }

    @NotNull
    public final String component13() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.auId;
    }

    @NotNull
    public final String component3() {
        return this.heidi;
    }

    @NotNull
    public final ApCharacteristic component4() {
        return this.characteristics;
    }

    public final boolean component5() {
        return this.connectable;
    }

    @NotNull
    public final String component6() {
        return this.country;
    }

    @NotNull
    public final List<ApDescription> component7() {
        return this.descriptions;
    }

    @NotNull
    public final String component8() {
        return this.name;
    }

    @NotNull
    public final String component9() {
        return this.applianceFamily;
    }

    @NotNull
    public final ApplianceProfileHeidi copy(@NotNull List<ApAdditionalData> list, @NotNull String str, @NotNull String str2, @NotNull ApCharacteristic apCharacteristic, boolean z, @NotNull String str3, @NotNull List<ApDescription> list2, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, @NotNull String str7, @NotNull String str8) {
        List<ApAdditionalData> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "additionalData");
        String str9 = str;
        Intrinsics.checkNotNullParameter(str9, "auId");
        String str10 = str2;
        Intrinsics.checkNotNullParameter(str10, "heidi");
        ApCharacteristic apCharacteristic2 = apCharacteristic;
        Intrinsics.checkNotNullParameter(apCharacteristic2, "characteristics");
        String str11 = str3;
        Intrinsics.checkNotNullParameter(str11, "country");
        List<ApDescription> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "descriptions");
        String str12 = str4;
        Intrinsics.checkNotNullParameter(str12, "name");
        String str13 = str5;
        Intrinsics.checkNotNullParameter(str13, "applianceFamily");
        String str14 = str6;
        Intrinsics.checkNotNullParameter(str14, "photoUrl");
        String str15 = str7;
        Intrinsics.checkNotNullParameter(str15, "source");
        String str16 = str8;
        Intrinsics.checkNotNullParameter(str16, "type");
        return new ApplianceProfileHeidi(list3, str9, str10, apCharacteristic2, z, str11, list4, str12, str13, str14, j, str15, str16);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplianceProfileHeidi)) {
            return false;
        }
        ApplianceProfileHeidi applianceProfileHeidi = (ApplianceProfileHeidi) obj;
        return Intrinsics.areEqual((Object) this.additionalData, (Object) applianceProfileHeidi.additionalData) && Intrinsics.areEqual((Object) this.auId, (Object) applianceProfileHeidi.auId) && Intrinsics.areEqual((Object) this.heidi, (Object) applianceProfileHeidi.heidi) && Intrinsics.areEqual((Object) this.characteristics, (Object) applianceProfileHeidi.characteristics) && this.connectable == applianceProfileHeidi.connectable && Intrinsics.areEqual((Object) this.country, (Object) applianceProfileHeidi.country) && Intrinsics.areEqual((Object) this.descriptions, (Object) applianceProfileHeidi.descriptions) && Intrinsics.areEqual((Object) this.name, (Object) applianceProfileHeidi.name) && Intrinsics.areEqual((Object) this.applianceFamily, (Object) applianceProfileHeidi.applianceFamily) && Intrinsics.areEqual((Object) this.photoUrl, (Object) applianceProfileHeidi.photoUrl) && this.serviceIndex == applianceProfileHeidi.serviceIndex && Intrinsics.areEqual((Object) this.source, (Object) applianceProfileHeidi.source) && Intrinsics.areEqual((Object) this.type, (Object) applianceProfileHeidi.type);
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
    public final String getHeidi() {
        return this.heidi;
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
        int hashCode = ((((((this.additionalData.hashCode() * 31) + this.auId.hashCode()) * 31) + this.heidi.hashCode()) * 31) + this.characteristics.hashCode()) * 31;
        boolean z = this.connectable;
        if (z) {
            z = true;
        }
        return ((((((((((((((((hashCode + (z ? 1 : 0)) * 31) + this.country.hashCode()) * 31) + this.descriptions.hashCode()) * 31) + this.name.hashCode()) * 31) + this.applianceFamily.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Long.hashCode(this.serviceIndex)) * 31) + this.source.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplianceProfileHeidi(additionalData=" + this.additionalData + ", auId=" + this.auId + ", heidi=" + this.heidi + ", characteristics=" + this.characteristics + ", connectable=" + this.connectable + ", country=" + this.country + ", descriptions=" + this.descriptions + ", name=" + this.name + ", applianceFamily=" + this.applianceFamily + ", photoUrl=" + this.photoUrl + ", serviceIndex=" + this.serviceIndex + ", source=" + this.source + ", type=" + this.type + ')';
    }
}
