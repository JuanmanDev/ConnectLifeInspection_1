package com.internationalwinecooler.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.hisense.connect_life.core.global.KeyConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 R2\u00020\u0001:\u0001RB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0002\u0010\u0016J\t\u00108\u001a\u00020\u0006HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0013HÆ\u0003J\t\u0010<\u001a\u00020\u0013HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003Jº\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u0010FJ\b\u0010G\u001a\u00020HH\u0016J\u0013\u0010I\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020HHÖ\u0001J\u0006\u0010M\u001a\u00020\tJ\t\u0010N\u001a\u00020\u0006HÖ\u0001J\u0018\u0010O\u001a\u00020P2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020HH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b\b\u0010+\"\u0004\b,\u0010-R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b\n\u0010+\"\u0004\b/\u0010-R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010$\"\u0004\b7\u0010&¨\u0006S"}, mo47991d2 = {"Lcom/internationalwinecooler/model/WineFilterModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "auid", "", "bestToServe", "isFavourite", "", "isInInventory", "showDeletedItems", "vintage", "grapeType", "", "country", "region", "wineType", "expried", "", "bestDrinkYearFrom", "bestDrinkYearTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJJ)V", "getAuid", "()Ljava/lang/String;", "setAuid", "(Ljava/lang/String;)V", "getBestDrinkYearFrom", "()J", "setBestDrinkYearFrom", "(J)V", "getBestDrinkYearTo", "setBestDrinkYearTo", "getBestToServe", "setBestToServe", "getCountry", "()Ljava/util/List;", "setCountry", "(Ljava/util/List;)V", "getExpried", "setExpried", "getGrapeType", "setGrapeType", "()Ljava/lang/Boolean;", "setFavourite", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setInInventory", "getRegion", "setRegion", "getShowDeletedItems", "setShowDeletedItems", "getVintage", "setVintage", "getWineType", "setWineType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJJ)Lcom/internationalwinecooler/model/WineFilterModel;", "describeContents", "", "equals", "other", "", "hashCode", "isFullRequest", "toString", "writeToParcel", "", "flags", "CREATOR", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineFilterModel.kt */
public final class WineFilterModel implements Parcelable {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
    @NotNull
    public String auid;
    public long bestDrinkYearFrom;
    public long bestDrinkYearTo;
    @Nullable
    public String bestToServe;
    @Nullable
    public List<String> country;
    public long expried;
    @Nullable
    public List<String> grapeType;
    @Nullable
    public Boolean isFavourite;
    @Nullable
    public Boolean isInInventory;
    @Nullable
    public List<String> region;
    @Nullable
    public Boolean showDeletedItems;
    @Nullable
    public String vintage;
    @Nullable
    public List<String> wineType;

    @Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo47991d2 = {"Lcom/internationalwinecooler/model/WineFilterModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/internationalwinecooler/model/WineFilterModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/internationalwinecooler/model/WineFilterModel;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WineFilterModel.kt */
    public static final class CREATOR implements Parcelable.Creator<WineFilterModel> {
        public CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public WineFilterModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WineFilterModel(parcel);
        }

        @NotNull
        public WineFilterModel[] newArray(int i) {
            return new WineFilterModel[i];
        }
    }

    public WineFilterModel(@NotNull String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        this.auid = str;
        this.bestToServe = str2;
        this.isFavourite = bool;
        this.isInInventory = bool2;
        this.showDeletedItems = bool3;
        this.vintage = str3;
        this.grapeType = list;
        this.country = list2;
        this.region = list3;
        this.wineType = list4;
        this.expried = j;
        this.bestDrinkYearFrom = j2;
        this.bestDrinkYearTo = j3;
    }

    public static /* synthetic */ WineFilterModel copy$default(WineFilterModel wineFilterModel, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, List list, List list2, List list3, List list4, long j, long j2, long j3, int i, Object obj) {
        WineFilterModel wineFilterModel2 = wineFilterModel;
        int i2 = i;
        return wineFilterModel.copy((i2 & 1) != 0 ? wineFilterModel2.auid : str, (i2 & 2) != 0 ? wineFilterModel2.bestToServe : str2, (i2 & 4) != 0 ? wineFilterModel2.isFavourite : bool, (i2 & 8) != 0 ? wineFilterModel2.isInInventory : bool2, (i2 & 16) != 0 ? wineFilterModel2.showDeletedItems : bool3, (i2 & 32) != 0 ? wineFilterModel2.vintage : str3, (i2 & 64) != 0 ? wineFilterModel2.grapeType : list, (i2 & 128) != 0 ? wineFilterModel2.country : list2, (i2 & 256) != 0 ? wineFilterModel2.region : list3, (i2 & 512) != 0 ? wineFilterModel2.wineType : list4, (i2 & 1024) != 0 ? wineFilterModel2.expried : j, (i2 & 2048) != 0 ? wineFilterModel2.bestDrinkYearFrom : j2, (i2 & 4096) != 0 ? wineFilterModel2.bestDrinkYearTo : j3);
    }

    @NotNull
    public final String component1() {
        return this.auid;
    }

    @Nullable
    public final List<String> component10() {
        return this.wineType;
    }

    public final long component11() {
        return this.expried;
    }

    public final long component12() {
        return this.bestDrinkYearFrom;
    }

    public final long component13() {
        return this.bestDrinkYearTo;
    }

    @Nullable
    public final String component2() {
        return this.bestToServe;
    }

    @Nullable
    public final Boolean component3() {
        return this.isFavourite;
    }

    @Nullable
    public final Boolean component4() {
        return this.isInInventory;
    }

    @Nullable
    public final Boolean component5() {
        return this.showDeletedItems;
    }

    @Nullable
    public final String component6() {
        return this.vintage;
    }

    @Nullable
    public final List<String> component7() {
        return this.grapeType;
    }

    @Nullable
    public final List<String> component8() {
        return this.country;
    }

    @Nullable
    public final List<String> component9() {
        return this.region;
    }

    @NotNull
    public final WineFilterModel copy(@NotNull String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, long j, long j2, long j3) {
        String str4 = str;
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str4, KeyConst.KEY_AUIT);
        return new WineFilterModel(str4, str2, bool, bool2, bool3, str3, list, list2, list3, list4, j, j2, j3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineFilterModel)) {
            return false;
        }
        WineFilterModel wineFilterModel = (WineFilterModel) obj;
        return Intrinsics.areEqual((Object) this.auid, (Object) wineFilterModel.auid) && Intrinsics.areEqual((Object) this.bestToServe, (Object) wineFilterModel.bestToServe) && Intrinsics.areEqual((Object) this.isFavourite, (Object) wineFilterModel.isFavourite) && Intrinsics.areEqual((Object) this.isInInventory, (Object) wineFilterModel.isInInventory) && Intrinsics.areEqual((Object) this.showDeletedItems, (Object) wineFilterModel.showDeletedItems) && Intrinsics.areEqual((Object) this.vintage, (Object) wineFilterModel.vintage) && Intrinsics.areEqual((Object) this.grapeType, (Object) wineFilterModel.grapeType) && Intrinsics.areEqual((Object) this.country, (Object) wineFilterModel.country) && Intrinsics.areEqual((Object) this.region, (Object) wineFilterModel.region) && Intrinsics.areEqual((Object) this.wineType, (Object) wineFilterModel.wineType) && this.expried == wineFilterModel.expried && this.bestDrinkYearFrom == wineFilterModel.bestDrinkYearFrom && this.bestDrinkYearTo == wineFilterModel.bestDrinkYearTo;
    }

    @NotNull
    public final String getAuid() {
        return this.auid;
    }

    public final long getBestDrinkYearFrom() {
        return this.bestDrinkYearFrom;
    }

    public final long getBestDrinkYearTo() {
        return this.bestDrinkYearTo;
    }

    @Nullable
    public final String getBestToServe() {
        return this.bestToServe;
    }

    @Nullable
    public final List<String> getCountry() {
        return this.country;
    }

    public final long getExpried() {
        return this.expried;
    }

    @Nullable
    public final List<String> getGrapeType() {
        return this.grapeType;
    }

    @Nullable
    public final List<String> getRegion() {
        return this.region;
    }

    @Nullable
    public final Boolean getShowDeletedItems() {
        return this.showDeletedItems;
    }

    @Nullable
    public final String getVintage() {
        return this.vintage;
    }

    @Nullable
    public final List<String> getWineType() {
        return this.wineType;
    }

    public int hashCode() {
        int hashCode = this.auid.hashCode() * 31;
        String str = this.bestToServe;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isFavourite;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isInInventory;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showDeletedItems;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.vintage;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.grapeType;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.country;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.region;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.wineType;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return ((((((hashCode9 + i) * 31) + Long.hashCode(this.expried)) * 31) + Long.hashCode(this.bestDrinkYearFrom)) * 31) + Long.hashCode(this.bestDrinkYearTo);
    }

    @Nullable
    public final Boolean isFavourite() {
        return this.isFavourite;
    }

    public final boolean isFullRequest() {
        String str = this.auid;
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        String str2 = this.bestToServe;
        if (!(str2 == null || str2.length() == 0) || !Intrinsics.areEqual((Object) this.isFavourite, (Object) Boolean.FALSE) || !Intrinsics.areEqual((Object) this.isInInventory, (Object) Boolean.TRUE)) {
            return false;
        }
        String str3 = this.vintage;
        if (!(str3 == null || str3.length() == 0)) {
            return false;
        }
        List<String> list = this.grapeType;
        if (!(list == null || list.isEmpty())) {
            return false;
        }
        List<String> list2 = this.country;
        if (!(list2 == null || list2.isEmpty())) {
            return false;
        }
        List<String> list3 = this.region;
        if (!(list3 == null || list3.isEmpty())) {
            return false;
        }
        List<String> list4 = this.wineType;
        if (list4 == null || list4.isEmpty()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Boolean isInInventory() {
        return this.isInInventory;
    }

    public final void setAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.auid = str;
    }

    public final void setBestDrinkYearFrom(long j) {
        this.bestDrinkYearFrom = j;
    }

    public final void setBestDrinkYearTo(long j) {
        this.bestDrinkYearTo = j;
    }

    public final void setBestToServe(@Nullable String str) {
        this.bestToServe = str;
    }

    public final void setCountry(@Nullable List<String> list) {
        this.country = list;
    }

    public final void setExpried(long j) {
        this.expried = j;
    }

    public final void setFavourite(@Nullable Boolean bool) {
        this.isFavourite = bool;
    }

    public final void setGrapeType(@Nullable List<String> list) {
        this.grapeType = list;
    }

    public final void setInInventory(@Nullable Boolean bool) {
        this.isInInventory = bool;
    }

    public final void setRegion(@Nullable List<String> list) {
        this.region = list;
    }

    public final void setShowDeletedItems(@Nullable Boolean bool) {
        this.showDeletedItems = bool;
    }

    public final void setVintage(@Nullable String str) {
        this.vintage = str;
    }

    public final void setWineType(@Nullable List<String> list) {
        this.wineType = list;
    }

    @NotNull
    public String toString() {
        return "WineFilterModel(auid=" + this.auid + ", bestToServe=" + this.bestToServe + ", isFavourite=" + this.isFavourite + ", isInInventory=" + this.isInInventory + ", showDeletedItems=" + this.showDeletedItems + ", vintage=" + this.vintage + ", grapeType=" + this.grapeType + ", country=" + this.country + ", region=" + this.region + ", wineType=" + this.wineType + ", expried=" + this.expried + ", bestDrinkYearFrom=" + this.bestDrinkYearFrom + ", bestDrinkYearTo=" + this.bestDrinkYearTo + ')';
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.auid);
        parcel.writeString(this.bestToServe);
        parcel.writeValue(this.isFavourite);
        parcel.writeValue(this.isInInventory);
        parcel.writeValue(this.showDeletedItems);
        parcel.writeString(this.vintage);
        parcel.writeStringList(this.grapeType);
        parcel.writeStringList(this.country);
        parcel.writeStringList(this.region);
        parcel.writeStringList(this.wineType);
        parcel.writeLong(this.expried);
        parcel.writeLong(this.bestDrinkYearFrom);
        parcel.writeLong(this.bestDrinkYearTo);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WineFilterModel(java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.String r27, java.util.List r28, java.util.List r29, java.util.List r30, java.util.List r31, long r32, long r34, long r36, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r21 = this;
            r0 = r38
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = -1
            if (r1 == 0) goto L_0x000a
            r15 = r2
            goto L_0x000c
        L_0x000a:
            r15 = r32
        L_0x000c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0013
            r17 = r2
            goto L_0x0015
        L_0x0013:
            r17 = r34
        L_0x0015:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x001c
            r19 = r2
            goto L_0x001e
        L_0x001c:
            r19 = r36
        L_0x001e:
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.model.WineFilterModel.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WineFilterModel(@org.jetbrains.annotations.NotNull android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r3 = r20.readString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.String r1 = "parcel.readString()!!"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            java.lang.String r4 = r20.readString()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Boolean
            r5 = 0
            if (r2 == 0) goto L_0x0029
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x002a
        L_0x0029:
            r1 = r5
        L_0x002a:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Object r2 = r0.readValue(r2)
            boolean r6 = r2 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x003c
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r6 = r2
            goto L_0x003d
        L_0x003c:
            r6 = r5
        L_0x003d:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Object r2 = r0.readValue(r2)
            boolean r7 = r2 instanceof java.lang.Boolean
            if (r7 == 0) goto L_0x004f
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r7 = r2
            goto L_0x0050
        L_0x004f:
            r7 = r5
        L_0x0050:
            java.lang.String r8 = r20.readString()
            java.util.ArrayList r9 = r20.createStringArrayList()
            java.util.ArrayList r10 = r20.createStringArrayList()
            java.util.ArrayList r11 = r20.createStringArrayList()
            java.util.ArrayList r12 = r20.createStringArrayList()
            long r13 = r20.readLong()
            long r15 = r20.readLong()
            long r17 = r20.readLong()
            r2 = r19
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.model.WineFilterModel.<init>(android.os.Parcel):void");
    }
}
