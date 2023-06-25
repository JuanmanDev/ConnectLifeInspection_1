package com.hisense.connect_life.hismart.networks.request.wine.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryOneCategory;", "", "autoAdd", "", "vivinoId", "", "wineFactoryName", "wineName", "wineType", "area", "country", "grapes", "", "produceYear", "deviceId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getArea", "()Ljava/lang/String;", "getAutoAdd", "()I", "getCountry", "getDeviceId", "getGrapes", "()Ljava/util/List;", "getProduceYear", "getVivinoId", "getWineFactoryName", "getWineName", "getWineType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryOneCategory.kt */
public final class QueryOneCategory {
    @Nullable
    public final String area;
    public final int autoAdd;
    @Nullable
    public final String country;
    @Nullable
    public final String deviceId;
    @Nullable
    public final List<String> grapes;
    @Nullable
    public final String produceYear;
    @Nullable
    public final String vivinoId;
    @Nullable
    public final String wineFactoryName;
    @Nullable
    public final String wineName;
    @Nullable
    public final String wineType;

    public QueryOneCategory(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list, @Nullable String str7, @Nullable String str8) {
        this.autoAdd = i;
        this.vivinoId = str;
        this.wineFactoryName = str2;
        this.wineName = str3;
        this.wineType = str4;
        this.area = str5;
        this.country = str6;
        this.grapes = list;
        this.produceYear = str7;
        this.deviceId = str8;
    }

    public static /* synthetic */ QueryOneCategory copy$default(QueryOneCategory queryOneCategory, int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, int i2, Object obj) {
        QueryOneCategory queryOneCategory2 = queryOneCategory;
        int i3 = i2;
        return queryOneCategory.copy((i3 & 1) != 0 ? queryOneCategory2.autoAdd : i, (i3 & 2) != 0 ? queryOneCategory2.vivinoId : str, (i3 & 4) != 0 ? queryOneCategory2.wineFactoryName : str2, (i3 & 8) != 0 ? queryOneCategory2.wineName : str3, (i3 & 16) != 0 ? queryOneCategory2.wineType : str4, (i3 & 32) != 0 ? queryOneCategory2.area : str5, (i3 & 64) != 0 ? queryOneCategory2.country : str6, (i3 & 128) != 0 ? queryOneCategory2.grapes : list, (i3 & 256) != 0 ? queryOneCategory2.produceYear : str7, (i3 & 512) != 0 ? queryOneCategory2.deviceId : str8);
    }

    public final int component1() {
        return this.autoAdd;
    }

    @Nullable
    public final String component10() {
        return this.deviceId;
    }

    @Nullable
    public final String component2() {
        return this.vivinoId;
    }

    @Nullable
    public final String component3() {
        return this.wineFactoryName;
    }

    @Nullable
    public final String component4() {
        return this.wineName;
    }

    @Nullable
    public final String component5() {
        return this.wineType;
    }

    @Nullable
    public final String component6() {
        return this.area;
    }

    @Nullable
    public final String component7() {
        return this.country;
    }

    @Nullable
    public final List<String> component8() {
        return this.grapes;
    }

    @Nullable
    public final String component9() {
        return this.produceYear;
    }

    @NotNull
    public final QueryOneCategory copy(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<String> list, @Nullable String str7, @Nullable String str8) {
        return new QueryOneCategory(i, str, str2, str3, str4, str5, str6, list, str7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryOneCategory)) {
            return false;
        }
        QueryOneCategory queryOneCategory = (QueryOneCategory) obj;
        return this.autoAdd == queryOneCategory.autoAdd && Intrinsics.areEqual((Object) this.vivinoId, (Object) queryOneCategory.vivinoId) && Intrinsics.areEqual((Object) this.wineFactoryName, (Object) queryOneCategory.wineFactoryName) && Intrinsics.areEqual((Object) this.wineName, (Object) queryOneCategory.wineName) && Intrinsics.areEqual((Object) this.wineType, (Object) queryOneCategory.wineType) && Intrinsics.areEqual((Object) this.area, (Object) queryOneCategory.area) && Intrinsics.areEqual((Object) this.country, (Object) queryOneCategory.country) && Intrinsics.areEqual((Object) this.grapes, (Object) queryOneCategory.grapes) && Intrinsics.areEqual((Object) this.produceYear, (Object) queryOneCategory.produceYear) && Intrinsics.areEqual((Object) this.deviceId, (Object) queryOneCategory.deviceId);
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    public final int getAutoAdd() {
        return this.autoAdd;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final List<String> getGrapes() {
        return this.grapes;
    }

    @Nullable
    public final String getProduceYear() {
        return this.produceYear;
    }

    @Nullable
    public final String getVivinoId() {
        return this.vivinoId;
    }

    @Nullable
    public final String getWineFactoryName() {
        return this.wineFactoryName;
    }

    @Nullable
    public final String getWineName() {
        return this.wineName;
    }

    @Nullable
    public final String getWineType() {
        return this.wineType;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.autoAdd) * 31;
        String str = this.vivinoId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wineFactoryName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wineName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.wineType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.area;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.grapes;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.produceYear;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceId;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public String toString() {
        return "QueryOneCategory(autoAdd=" + this.autoAdd + ", vivinoId=" + this.vivinoId + ", wineFactoryName=" + this.wineFactoryName + ", wineName=" + this.wineName + ", wineType=" + this.wineType + ", area=" + this.area + ", country=" + this.country + ", grapes=" + this.grapes + ", produceYear=" + this.produceYear + ", deviceId=" + this.deviceId + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ QueryOneCategory(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r2 = r20
        L_0x0046:
            r12 = r10
            r13 = r11
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
