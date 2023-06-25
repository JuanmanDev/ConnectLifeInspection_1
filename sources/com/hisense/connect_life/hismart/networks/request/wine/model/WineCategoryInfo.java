package com.hisense.connect_life.hismart.networks.request.wine.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0017J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003JÌ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0007HÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010#R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0019R\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010#R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0019¨\u0006L"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "", "id", "", "vivinoId", "", "categoryId", "", "photoUrl", "wineFactoryName", "wineName", "produceYear", "favorite", "inPosition", "inCell", "wineCount", "deviceIdList", "", "wineType", "area", "country", "grapes", "filtered", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getArea", "()Ljava/lang/String;", "getCategoryId", "()I", "getCountry", "getDeviceIdList", "()Ljava/util/List;", "setDeviceIdList", "(Ljava/util/List;)V", "getFavorite", "setFavorite", "(I)V", "getFiltered", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGrapes", "getId", "()J", "getInCell", "getInPosition", "getPhotoUrl", "getProduceYear", "getVivinoId", "getWineCount", "setWineCount", "getWineFactoryName", "getWineName", "getWineType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "wine_category")
@TypeConverters({StrListToStrConverter.class})
/* compiled from: QueryCategory.kt */
public final class WineCategoryInfo {
    @ColumnInfo(defaultValue = "", name = "area")
    @NotNull
    public final String area;
    @ColumnInfo(name = "categoryId")
    public final int categoryId;
    @ColumnInfo(defaultValue = "", name = "country")
    @NotNull
    public final String country;
    @ColumnInfo(name = "deviceIdList")
    @Nullable
    public List<String> deviceIdList;
    @ColumnInfo(defaultValue = "0", name = "favorite")
    public int favorite;
    @ColumnInfo(defaultValue = "0", name = "filtered")
    @Nullable
    public final Integer filtered;
    @ColumnInfo(name = "grapes")
    @Nullable
    public final List<String> grapes;
    @ColumnInfo(name = "id_id")
    @PrimaryKey(autoGenerate = true)

    /* renamed from: id */
    public final long f15977id;
    @ColumnInfo(defaultValue = "1", name = "inCell")
    public final int inCell;
    @ColumnInfo(defaultValue = "1", name = "inPosition")
    public final int inPosition;
    @ColumnInfo(defaultValue = "", name = "photoUrl")
    @NotNull
    public final String photoUrl;
    @ColumnInfo(defaultValue = "", name = "produceYear")
    @NotNull
    public final String produceYear;
    @ColumnInfo(name = "vivino_id")
    @Nullable
    public final String vivinoId;
    @ColumnInfo(defaultValue = "0", name = "wineCount")
    public int wineCount;
    @ColumnInfo(defaultValue = "", name = "wineFactoryName")
    @NotNull
    public final String wineFactoryName;
    @ColumnInfo(defaultValue = "", name = "wineName")
    @NotNull
    public final String wineName;
    @ColumnInfo(defaultValue = "", name = "wineType")
    @NotNull
    public final String wineType;

    public WineCategoryInfo(long j, @Nullable String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2, int i3, int i4, int i5, @Nullable List<String> list, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable List<String> list2, @Nullable Integer num) {
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        Intrinsics.checkNotNullParameter(str2, "photoUrl");
        Intrinsics.checkNotNullParameter(str9, "wineFactoryName");
        Intrinsics.checkNotNullParameter(str10, "wineName");
        Intrinsics.checkNotNullParameter(str11, "produceYear");
        Intrinsics.checkNotNullParameter(str12, "wineType");
        Intrinsics.checkNotNullParameter(str13, "area");
        Intrinsics.checkNotNullParameter(str14, "country");
        this.f15977id = j;
        this.vivinoId = str;
        this.categoryId = i;
        this.photoUrl = str2;
        this.wineFactoryName = str9;
        this.wineName = str10;
        this.produceYear = str11;
        this.favorite = i2;
        this.inPosition = i3;
        this.inCell = i4;
        this.wineCount = i5;
        this.deviceIdList = list;
        this.wineType = str12;
        this.area = str13;
        this.country = str14;
        this.grapes = list2;
        this.filtered = num;
    }

    public static /* synthetic */ WineCategoryInfo copy$default(WineCategoryInfo wineCategoryInfo, long j, String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, int i4, int i5, List list, String str6, String str7, String str8, List list2, Integer num, int i6, Object obj) {
        WineCategoryInfo wineCategoryInfo2 = wineCategoryInfo;
        int i7 = i6;
        return wineCategoryInfo.copy((i7 & 1) != 0 ? wineCategoryInfo2.f15977id : j, (i7 & 2) != 0 ? wineCategoryInfo2.vivinoId : str, (i7 & 4) != 0 ? wineCategoryInfo2.categoryId : i, (i7 & 8) != 0 ? wineCategoryInfo2.photoUrl : str2, (i7 & 16) != 0 ? wineCategoryInfo2.wineFactoryName : str3, (i7 & 32) != 0 ? wineCategoryInfo2.wineName : str4, (i7 & 64) != 0 ? wineCategoryInfo2.produceYear : str5, (i7 & 128) != 0 ? wineCategoryInfo2.favorite : i2, (i7 & 256) != 0 ? wineCategoryInfo2.inPosition : i3, (i7 & 512) != 0 ? wineCategoryInfo2.inCell : i4, (i7 & 1024) != 0 ? wineCategoryInfo2.wineCount : i5, (i7 & 2048) != 0 ? wineCategoryInfo2.deviceIdList : list, (i7 & 4096) != 0 ? wineCategoryInfo2.wineType : str6, (i7 & 8192) != 0 ? wineCategoryInfo2.area : str7, (i7 & 16384) != 0 ? wineCategoryInfo2.country : str8, (i7 & 32768) != 0 ? wineCategoryInfo2.grapes : list2, (i7 & 65536) != 0 ? wineCategoryInfo2.filtered : num);
    }

    public final long component1() {
        return this.f15977id;
    }

    public final int component10() {
        return this.inCell;
    }

    public final int component11() {
        return this.wineCount;
    }

    @Nullable
    public final List<String> component12() {
        return this.deviceIdList;
    }

    @NotNull
    public final String component13() {
        return this.wineType;
    }

    @NotNull
    public final String component14() {
        return this.area;
    }

    @NotNull
    public final String component15() {
        return this.country;
    }

    @Nullable
    public final List<String> component16() {
        return this.grapes;
    }

    @Nullable
    public final Integer component17() {
        return this.filtered;
    }

    @Nullable
    public final String component2() {
        return this.vivinoId;
    }

    public final int component3() {
        return this.categoryId;
    }

    @NotNull
    public final String component4() {
        return this.photoUrl;
    }

    @NotNull
    public final String component5() {
        return this.wineFactoryName;
    }

    @NotNull
    public final String component6() {
        return this.wineName;
    }

    @NotNull
    public final String component7() {
        return this.produceYear;
    }

    public final int component8() {
        return this.favorite;
    }

    public final int component9() {
        return this.inPosition;
    }

    @NotNull
    public final WineCategoryInfo copy(long j, @Nullable String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2, int i3, int i4, int i5, @Nullable List<String> list, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable List<String> list2, @Nullable Integer num) {
        long j2 = j;
        Intrinsics.checkNotNullParameter(str2, "photoUrl");
        Intrinsics.checkNotNullParameter(str3, "wineFactoryName");
        Intrinsics.checkNotNullParameter(str4, "wineName");
        Intrinsics.checkNotNullParameter(str5, "produceYear");
        Intrinsics.checkNotNullParameter(str6, "wineType");
        Intrinsics.checkNotNullParameter(str7, "area");
        Intrinsics.checkNotNullParameter(str8, "country");
        return new WineCategoryInfo(j, str, i, str2, str3, str4, str5, i2, i3, i4, i5, list, str6, str7, str8, list2, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineCategoryInfo)) {
            return false;
        }
        WineCategoryInfo wineCategoryInfo = (WineCategoryInfo) obj;
        return this.f15977id == wineCategoryInfo.f15977id && Intrinsics.areEqual((Object) this.vivinoId, (Object) wineCategoryInfo.vivinoId) && this.categoryId == wineCategoryInfo.categoryId && Intrinsics.areEqual((Object) this.photoUrl, (Object) wineCategoryInfo.photoUrl) && Intrinsics.areEqual((Object) this.wineFactoryName, (Object) wineCategoryInfo.wineFactoryName) && Intrinsics.areEqual((Object) this.wineName, (Object) wineCategoryInfo.wineName) && Intrinsics.areEqual((Object) this.produceYear, (Object) wineCategoryInfo.produceYear) && this.favorite == wineCategoryInfo.favorite && this.inPosition == wineCategoryInfo.inPosition && this.inCell == wineCategoryInfo.inCell && this.wineCount == wineCategoryInfo.wineCount && Intrinsics.areEqual((Object) this.deviceIdList, (Object) wineCategoryInfo.deviceIdList) && Intrinsics.areEqual((Object) this.wineType, (Object) wineCategoryInfo.wineType) && Intrinsics.areEqual((Object) this.area, (Object) wineCategoryInfo.area) && Intrinsics.areEqual((Object) this.country, (Object) wineCategoryInfo.country) && Intrinsics.areEqual((Object) this.grapes, (Object) wineCategoryInfo.grapes) && Intrinsics.areEqual((Object) this.filtered, (Object) wineCategoryInfo.filtered);
    }

    @NotNull
    public final String getArea() {
        return this.area;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

    public final int getFavorite() {
        return this.favorite;
    }

    @Nullable
    public final Integer getFiltered() {
        return this.filtered;
    }

    @Nullable
    public final List<String> getGrapes() {
        return this.grapes;
    }

    public final long getId() {
        return this.f15977id;
    }

    public final int getInCell() {
        return this.inCell;
    }

    public final int getInPosition() {
        return this.inPosition;
    }

    @NotNull
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    @NotNull
    public final String getProduceYear() {
        return this.produceYear;
    }

    @Nullable
    public final String getVivinoId() {
        return this.vivinoId;
    }

    public final int getWineCount() {
        return this.wineCount;
    }

    @NotNull
    public final String getWineFactoryName() {
        return this.wineFactoryName;
    }

    @NotNull
    public final String getWineName() {
        return this.wineName;
    }

    @NotNull
    public final String getWineType() {
        return this.wineType;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f15977id) * 31;
        String str = this.vivinoId;
        int i = 0;
        int hashCode2 = (((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.categoryId)) * 31) + this.photoUrl.hashCode()) * 31) + this.wineFactoryName.hashCode()) * 31) + this.wineName.hashCode()) * 31) + this.produceYear.hashCode()) * 31) + Integer.hashCode(this.favorite)) * 31) + Integer.hashCode(this.inPosition)) * 31) + Integer.hashCode(this.inCell)) * 31) + Integer.hashCode(this.wineCount)) * 31;
        List<String> list = this.deviceIdList;
        int hashCode3 = (((((((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.wineType.hashCode()) * 31) + this.area.hashCode()) * 31) + this.country.hashCode()) * 31;
        List<String> list2 = this.grapes;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.filtered;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setDeviceIdList(@Nullable List<String> list) {
        this.deviceIdList = list;
    }

    public final void setFavorite(int i) {
        this.favorite = i;
    }

    public final void setWineCount(int i) {
        this.wineCount = i;
    }

    @NotNull
    public String toString() {
        return "WineCategoryInfo(id=" + this.f15977id + ", vivinoId=" + this.vivinoId + ", categoryId=" + this.categoryId + ", photoUrl=" + this.photoUrl + ", wineFactoryName=" + this.wineFactoryName + ", wineName=" + this.wineName + ", produceYear=" + this.produceYear + ", favorite=" + this.favorite + ", inPosition=" + this.inPosition + ", inCell=" + this.inCell + ", wineCount=" + this.wineCount + ", deviceIdList=" + this.deviceIdList + ", wineType=" + this.wineType + ", area=" + this.area + ", country=" + this.country + ", grapes=" + this.grapes + ", filtered=" + this.filtered + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WineCategoryInfo(long r23, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, int r32, int r33, int r34, java.util.List r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.util.List r39, java.lang.Integer r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r8 = r2
            goto L_0x000c
        L_0x000a:
            r8 = r27
        L_0x000c:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0012
            r9 = r2
            goto L_0x0014
        L_0x0012:
            r9 = r28
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001a
            r10 = r2
            goto L_0x001c
        L_0x001a:
            r10 = r29
        L_0x001c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0022
            r11 = r2
            goto L_0x0024
        L_0x0022:
            r11 = r30
        L_0x0024:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r3 = 0
            if (r1 == 0) goto L_0x002b
            r12 = r3
            goto L_0x002d
        L_0x002b:
            r12 = r31
        L_0x002d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r4 = 1
            if (r1 == 0) goto L_0x0034
            r13 = r4
            goto L_0x0036
        L_0x0034:
            r13 = r32
        L_0x0036:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003c
            r14 = r4
            goto L_0x003e
        L_0x003c:
            r14 = r33
        L_0x003e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0044
            r15 = r3
            goto L_0x0046
        L_0x0044:
            r15 = r34
        L_0x0046:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x004d
            r17 = r2
            goto L_0x004f
        L_0x004d:
            r17 = r36
        L_0x004f:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0056
            r18 = r2
            goto L_0x0058
        L_0x0056:
            r18 = r37
        L_0x0058:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x005f
            r19 = r2
            goto L_0x0061
        L_0x005f:
            r19 = r38
        L_0x0061:
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r16 = r35
            r20 = r39
            r21 = r40
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo.<init>(long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
