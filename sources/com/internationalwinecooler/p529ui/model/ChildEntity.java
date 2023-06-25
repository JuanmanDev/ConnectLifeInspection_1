package com.internationalwinecooler.p529ui.model;

import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0002\u0010\u000fJ\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001d\u0010'\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010+\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010,\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010.\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u0002\u0010/\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0007HÖ\u0001R.\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R.\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR.\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R.\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R.\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R.\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R.\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013¨\u00066"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/model/ChildEntity;", "", "sortList", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "unplacedMap", "", "", "zoneAMapSingle", "zoneAMap", "zoneBMap", "zoneCMap", "battleMapSingle", "battleAMap", "battleBMap", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getBattleAMap", "()Ljava/util/Map;", "setBattleAMap", "(Ljava/util/Map;)V", "getBattleBMap", "setBattleBMap", "getBattleMapSingle", "setBattleMapSingle", "getSortList", "()Ljava/util/List;", "setSortList", "(Ljava/util/List;)V", "getUnplacedMap", "setUnplacedMap", "getZoneAMap", "setZoneAMap", "getZoneAMapSingle", "setZoneAMapSingle", "getZoneBMap", "setZoneBMap", "getZoneCMap", "setZoneCMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.model.ChildEntity */
/* compiled from: ChildEntity.kt */
public final class ChildEntity {
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> battleAMap;
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> battleBMap;
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> battleMapSingle;
    @NotNull
    public List<WineInventoryBean> sortList;
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> unplacedMap;
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> zoneAMap;
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> zoneAMapSingle;
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> zoneBMap;
    @NotNull
    public Map<String, ? extends List<WineInventoryBean>> zoneCMap;

    public ChildEntity(@NotNull List<WineInventoryBean> list, @NotNull Map<String, ? extends List<WineInventoryBean>> map, @NotNull Map<String, ? extends List<WineInventoryBean>> map2, @NotNull Map<String, ? extends List<WineInventoryBean>> map3, @NotNull Map<String, ? extends List<WineInventoryBean>> map4, @NotNull Map<String, ? extends List<WineInventoryBean>> map5, @NotNull Map<String, ? extends List<WineInventoryBean>> map6, @NotNull Map<String, ? extends List<WineInventoryBean>> map7, @NotNull Map<String, ? extends List<WineInventoryBean>> map8) {
        Intrinsics.checkNotNullParameter(list, "sortList");
        Intrinsics.checkNotNullParameter(map, "unplacedMap");
        Intrinsics.checkNotNullParameter(map2, "zoneAMapSingle");
        Intrinsics.checkNotNullParameter(map3, "zoneAMap");
        Intrinsics.checkNotNullParameter(map4, "zoneBMap");
        Intrinsics.checkNotNullParameter(map5, "zoneCMap");
        Intrinsics.checkNotNullParameter(map6, "battleMapSingle");
        Intrinsics.checkNotNullParameter(map7, "battleAMap");
        Intrinsics.checkNotNullParameter(map8, "battleBMap");
        this.sortList = list;
        this.unplacedMap = map;
        this.zoneAMapSingle = map2;
        this.zoneAMap = map3;
        this.zoneBMap = map4;
        this.zoneCMap = map5;
        this.battleMapSingle = map6;
        this.battleAMap = map7;
        this.battleBMap = map8;
    }

    public static /* synthetic */ ChildEntity copy$default(ChildEntity childEntity, List list, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, int i, Object obj) {
        ChildEntity childEntity2 = childEntity;
        int i2 = i;
        return childEntity.copy((i2 & 1) != 0 ? childEntity2.sortList : list, (i2 & 2) != 0 ? childEntity2.unplacedMap : map, (i2 & 4) != 0 ? childEntity2.zoneAMapSingle : map2, (i2 & 8) != 0 ? childEntity2.zoneAMap : map3, (i2 & 16) != 0 ? childEntity2.zoneBMap : map4, (i2 & 32) != 0 ? childEntity2.zoneCMap : map5, (i2 & 64) != 0 ? childEntity2.battleMapSingle : map6, (i2 & 128) != 0 ? childEntity2.battleAMap : map7, (i2 & 256) != 0 ? childEntity2.battleBMap : map8);
    }

    @NotNull
    public final List<WineInventoryBean> component1() {
        return this.sortList;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component2() {
        return this.unplacedMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component3() {
        return this.zoneAMapSingle;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component4() {
        return this.zoneAMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component5() {
        return this.zoneBMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component6() {
        return this.zoneCMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component7() {
        return this.battleMapSingle;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component8() {
        return this.battleAMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> component9() {
        return this.battleBMap;
    }

    @NotNull
    public final ChildEntity copy(@NotNull List<WineInventoryBean> list, @NotNull Map<String, ? extends List<WineInventoryBean>> map, @NotNull Map<String, ? extends List<WineInventoryBean>> map2, @NotNull Map<String, ? extends List<WineInventoryBean>> map3, @NotNull Map<String, ? extends List<WineInventoryBean>> map4, @NotNull Map<String, ? extends List<WineInventoryBean>> map5, @NotNull Map<String, ? extends List<WineInventoryBean>> map6, @NotNull Map<String, ? extends List<WineInventoryBean>> map7, @NotNull Map<String, ? extends List<WineInventoryBean>> map8) {
        Intrinsics.checkNotNullParameter(list, "sortList");
        Intrinsics.checkNotNullParameter(map, "unplacedMap");
        Intrinsics.checkNotNullParameter(map2, "zoneAMapSingle");
        Intrinsics.checkNotNullParameter(map3, "zoneAMap");
        Map<String, ? extends List<WineInventoryBean>> map9 = map4;
        Intrinsics.checkNotNullParameter(map9, "zoneBMap");
        Map<String, ? extends List<WineInventoryBean>> map10 = map5;
        Intrinsics.checkNotNullParameter(map10, "zoneCMap");
        Map<String, ? extends List<WineInventoryBean>> map11 = map6;
        Intrinsics.checkNotNullParameter(map11, "battleMapSingle");
        Map<String, ? extends List<WineInventoryBean>> map12 = map7;
        Intrinsics.checkNotNullParameter(map12, "battleAMap");
        Map<String, ? extends List<WineInventoryBean>> map13 = map8;
        Intrinsics.checkNotNullParameter(map13, "battleBMap");
        return new ChildEntity(list, map, map2, map3, map9, map10, map11, map12, map13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildEntity)) {
            return false;
        }
        ChildEntity childEntity = (ChildEntity) obj;
        return Intrinsics.areEqual((Object) this.sortList, (Object) childEntity.sortList) && Intrinsics.areEqual((Object) this.unplacedMap, (Object) childEntity.unplacedMap) && Intrinsics.areEqual((Object) this.zoneAMapSingle, (Object) childEntity.zoneAMapSingle) && Intrinsics.areEqual((Object) this.zoneAMap, (Object) childEntity.zoneAMap) && Intrinsics.areEqual((Object) this.zoneBMap, (Object) childEntity.zoneBMap) && Intrinsics.areEqual((Object) this.zoneCMap, (Object) childEntity.zoneCMap) && Intrinsics.areEqual((Object) this.battleMapSingle, (Object) childEntity.battleMapSingle) && Intrinsics.areEqual((Object) this.battleAMap, (Object) childEntity.battleAMap) && Intrinsics.areEqual((Object) this.battleBMap, (Object) childEntity.battleBMap);
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getBattleAMap() {
        return this.battleAMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getBattleBMap() {
        return this.battleBMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getBattleMapSingle() {
        return this.battleMapSingle;
    }

    @NotNull
    public final List<WineInventoryBean> getSortList() {
        return this.sortList;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getUnplacedMap() {
        return this.unplacedMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getZoneAMap() {
        return this.zoneAMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getZoneAMapSingle() {
        return this.zoneAMapSingle;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getZoneBMap() {
        return this.zoneBMap;
    }

    @NotNull
    public final Map<String, List<WineInventoryBean>> getZoneCMap() {
        return this.zoneCMap;
    }

    public int hashCode() {
        return (((((((((((((((this.sortList.hashCode() * 31) + this.unplacedMap.hashCode()) * 31) + this.zoneAMapSingle.hashCode()) * 31) + this.zoneAMap.hashCode()) * 31) + this.zoneBMap.hashCode()) * 31) + this.zoneCMap.hashCode()) * 31) + this.battleMapSingle.hashCode()) * 31) + this.battleAMap.hashCode()) * 31) + this.battleBMap.hashCode();
    }

    public final void setBattleAMap(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.battleAMap = map;
    }

    public final void setBattleBMap(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.battleBMap = map;
    }

    public final void setBattleMapSingle(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.battleMapSingle = map;
    }

    public final void setSortList(@NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sortList = list;
    }

    public final void setUnplacedMap(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.unplacedMap = map;
    }

    public final void setZoneAMap(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.zoneAMap = map;
    }

    public final void setZoneAMapSingle(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.zoneAMapSingle = map;
    }

    public final void setZoneBMap(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.zoneBMap = map;
    }

    public final void setZoneCMap(@NotNull Map<String, ? extends List<WineInventoryBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.zoneCMap = map;
    }

    @NotNull
    public String toString() {
        return "ChildEntity(sortList=" + this.sortList + ", unplacedMap=" + this.unplacedMap + ", zoneAMapSingle=" + this.zoneAMapSingle + ", zoneAMap=" + this.zoneAMap + ", zoneBMap=" + this.zoneBMap + ", zoneCMap=" + this.zoneCMap + ", battleMapSingle=" + this.battleMapSingle + ", battleAMap=" + this.battleAMap + ", battleBMap=" + this.battleBMap + ')';
    }
}
