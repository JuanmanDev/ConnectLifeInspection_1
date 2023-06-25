package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0010¢\u0006\u0002\u0010\u001aR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001c¨\u00067"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategory;", "", "deviceId", "", "wifiId", "categoryId", "", "photo", "Ljava/io/File;", "wineFactoryName", "wineName", "wineType", "produceYear", "area", "country", "grapes", "", "autoAdd", "", "vivinoId", "score", "scoreCount", "foodMatch", "alcohol", "wineInventoryInfo", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineInventoryInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getAlcohol", "()Ljava/lang/String;", "getArea", "getAutoAdd", "()I", "getCategoryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCountry", "getDeviceId", "getFoodMatch", "()Ljava/util/List;", "getGrapes", "getPhoto", "()Ljava/io/File;", "setPhoto", "(Ljava/io/File;)V", "getProduceYear", "getScore", "getScoreCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVivinoId", "getWifiId", "getWineFactoryName", "getWineInventoryInfo", "getWineName", "getWineType", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWineCategory.kt */
public final class AddWineCategory {
    @Nullable
    public final String alcohol;
    @Nullable
    public final String area;
    public final int autoAdd;
    @Nullable
    public final Long categoryId;
    @Nullable
    public final String country;
    @NotNull
    public final String deviceId;
    @Nullable
    public final List<String> foodMatch;
    @Nullable
    public final List<String> grapes;
    @Nullable
    public File photo;
    @Nullable
    public final String produceYear;
    @Nullable
    public final String score;
    @Nullable
    public final Integer scoreCount;
    @Nullable
    public final String vivinoId;
    @NotNull
    public final String wifiId;
    @Nullable
    public final String wineFactoryName;
    @Nullable
    public final List<WineInventoryInfo> wineInventoryInfo;
    @NotNull
    public final String wineName;
    @Nullable
    public final String wineType;

    public AddWineCategory(@NotNull String str, @NotNull String str2, @Nullable Long l, @Nullable File file, @Nullable String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable List<String> list, int i, @Nullable String str9, @Nullable String str10, @Nullable Integer num, @Nullable List<String> list2, @Nullable String str11, @Nullable List<WineInventoryInfo> list3) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str4, "wineName");
        this.deviceId = str;
        this.wifiId = str2;
        this.categoryId = l;
        this.photo = file;
        this.wineFactoryName = str3;
        this.wineName = str4;
        this.wineType = str5;
        this.produceYear = str6;
        this.area = str7;
        this.country = str8;
        this.grapes = list;
        this.autoAdd = i;
        this.vivinoId = str9;
        this.score = str10;
        this.scoreCount = num;
        this.foodMatch = list2;
        this.alcohol = str11;
        this.wineInventoryInfo = list3;
    }

    @Nullable
    public final String getAlcohol() {
        return this.alcohol;
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    public final int getAutoAdd() {
        return this.autoAdd;
    }

    @Nullable
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final List<String> getFoodMatch() {
        return this.foodMatch;
    }

    @Nullable
    public final List<String> getGrapes() {
        return this.grapes;
    }

    @Nullable
    public final File getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getProduceYear() {
        return this.produceYear;
    }

    @Nullable
    public final String getScore() {
        return this.score;
    }

    @Nullable
    public final Integer getScoreCount() {
        return this.scoreCount;
    }

    @Nullable
    public final String getVivinoId() {
        return this.vivinoId;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    @Nullable
    public final String getWineFactoryName() {
        return this.wineFactoryName;
    }

    @Nullable
    public final List<WineInventoryInfo> getWineInventoryInfo() {
        return this.wineInventoryInfo;
    }

    @NotNull
    public final String getWineName() {
        return this.wineName;
    }

    @Nullable
    public final String getWineType() {
        return this.wineType;
    }

    public final void setPhoto(@Nullable File file) {
        this.photo = file;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddWineCategory(String str, String str2, Long l, File file, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, String str9, String str10, Integer num, List list2, String str11, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l, file, str3, str4, str5, str6, str7, str8, list, (i2 & 2048) != 0 ? 0 : i, str9, str10, num, list2, str11, list3);
    }
}
