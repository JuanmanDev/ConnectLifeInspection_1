package com.internationalwinecooler.p529ui.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/model/UserFilerWineCondition;", "", "wineTypeList", "", "", "areaList", "countryList", "grapeList", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAreaList", "()Ljava/util/List;", "getCountryList", "getGrapeList", "getWineTypeList", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.model.UserFilerWineCondition */
/* compiled from: UserFilerWineCondition.kt */
public final class UserFilerWineCondition {
    @NotNull
    public final List<String> areaList;
    @NotNull
    public final List<String> countryList;
    @NotNull
    public final List<String> grapeList;
    @NotNull
    public final List<String> wineTypeList;

    public UserFilerWineCondition(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(list, "wineTypeList");
        Intrinsics.checkNotNullParameter(list2, "areaList");
        Intrinsics.checkNotNullParameter(list3, "countryList");
        Intrinsics.checkNotNullParameter(list4, "grapeList");
        this.wineTypeList = list;
        this.areaList = list2;
        this.countryList = list3;
        this.grapeList = list4;
    }

    @NotNull
    public final List<String> getAreaList() {
        return this.areaList;
    }

    @NotNull
    public final List<String> getCountryList() {
        return this.countryList;
    }

    @NotNull
    public final List<String> getGrapeList() {
        return this.grapeList;
    }

    @NotNull
    public final List<String> getWineTypeList() {
        return this.wineTypeList;
    }
}
