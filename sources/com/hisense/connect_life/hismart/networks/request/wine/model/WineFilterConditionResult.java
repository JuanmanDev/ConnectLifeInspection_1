package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineFilterConditionResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "wineTypeList", "", "", "areaList", "countryList", "grapeList", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAreaList", "()Ljava/util/List;", "getCountryList", "getGrapeList", "getWineTypeList", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineFilterConditionResult.kt */
public final class WineFilterConditionResult extends HiResponse {
    @Nullable
    public final List<String> areaList;
    @Nullable
    public final List<String> countryList;
    @Nullable
    public final List<String> grapeList;
    @Nullable
    public final List<String> wineTypeList;

    public WineFilterConditionResult(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        this.wineTypeList = list;
        this.areaList = list2;
        this.countryList = list3;
        this.grapeList = list4;
    }

    @Nullable
    public final List<String> getAreaList() {
        return this.areaList;
    }

    @Nullable
    public final List<String> getCountryList() {
        return this.countryList;
    }

    @Nullable
    public final List<String> getGrapeList() {
        return this.grapeList;
    }

    @Nullable
    public final List<String> getWineTypeList() {
        return this.wineTypeList;
    }
}
