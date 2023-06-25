package com.internationalwinecooler.p529ui.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003JM\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/model/ExpandableGroupEntity;", "", "isExpand", "", "bottlesCount", "", "filterBottlesCount", "auid", "children", "Ljava/util/ArrayList;", "Lcom/internationalwinecooler/ui/model/ChildEntity;", "Lkotlin/collections/ArrayList;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAuid", "()Ljava/lang/String;", "setAuid", "(Ljava/lang/String;)V", "getBottlesCount", "setBottlesCount", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "getFilterBottlesCount", "setFilterBottlesCount", "()Z", "setExpand", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.model.ExpandableGroupEntity */
/* compiled from: ExpandableGroupEntity.kt */
public final class ExpandableGroupEntity {
    @Nullable
    public String auid;
    @NotNull
    public String bottlesCount;
    @NotNull
    public ArrayList<ChildEntity> children;
    @NotNull
    public String filterBottlesCount;
    public boolean isExpand;

    public ExpandableGroupEntity(boolean z, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull ArrayList<ChildEntity> arrayList) {
        Intrinsics.checkNotNullParameter(str, "bottlesCount");
        Intrinsics.checkNotNullParameter(str2, "filterBottlesCount");
        Intrinsics.checkNotNullParameter(arrayList, "children");
        this.isExpand = z;
        this.bottlesCount = str;
        this.filterBottlesCount = str2;
        this.auid = str3;
        this.children = arrayList;
    }

    public static /* synthetic */ ExpandableGroupEntity copy$default(ExpandableGroupEntity expandableGroupEntity, boolean z, String str, String str2, String str3, ArrayList<ChildEntity> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = expandableGroupEntity.isExpand;
        }
        if ((i & 2) != 0) {
            str = expandableGroupEntity.bottlesCount;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = expandableGroupEntity.filterBottlesCount;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = expandableGroupEntity.auid;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            arrayList = expandableGroupEntity.children;
        }
        return expandableGroupEntity.copy(z, str4, str5, str6, arrayList);
    }

    public final boolean component1() {
        return this.isExpand;
    }

    @NotNull
    public final String component2() {
        return this.bottlesCount;
    }

    @NotNull
    public final String component3() {
        return this.filterBottlesCount;
    }

    @Nullable
    public final String component4() {
        return this.auid;
    }

    @NotNull
    public final ArrayList<ChildEntity> component5() {
        return this.children;
    }

    @NotNull
    public final ExpandableGroupEntity copy(boolean z, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull ArrayList<ChildEntity> arrayList) {
        Intrinsics.checkNotNullParameter(str, "bottlesCount");
        Intrinsics.checkNotNullParameter(str2, "filterBottlesCount");
        Intrinsics.checkNotNullParameter(arrayList, "children");
        return new ExpandableGroupEntity(z, str, str2, str3, arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandableGroupEntity)) {
            return false;
        }
        ExpandableGroupEntity expandableGroupEntity = (ExpandableGroupEntity) obj;
        return this.isExpand == expandableGroupEntity.isExpand && Intrinsics.areEqual((Object) this.bottlesCount, (Object) expandableGroupEntity.bottlesCount) && Intrinsics.areEqual((Object) this.filterBottlesCount, (Object) expandableGroupEntity.filterBottlesCount) && Intrinsics.areEqual((Object) this.auid, (Object) expandableGroupEntity.auid) && Intrinsics.areEqual((Object) this.children, (Object) expandableGroupEntity.children);
    }

    @Nullable
    public final String getAuid() {
        return this.auid;
    }

    @NotNull
    public final String getBottlesCount() {
        return this.bottlesCount;
    }

    @NotNull
    public final ArrayList<ChildEntity> getChildren() {
        return this.children;
    }

    @NotNull
    public final String getFilterBottlesCount() {
        return this.filterBottlesCount;
    }

    public int hashCode() {
        boolean z = this.isExpand;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + this.bottlesCount.hashCode()) * 31) + this.filterBottlesCount.hashCode()) * 31;
        String str = this.auid;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.children.hashCode();
    }

    public final boolean isExpand() {
        return this.isExpand;
    }

    public final void setAuid(@Nullable String str) {
        this.auid = str;
    }

    public final void setBottlesCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bottlesCount = str;
    }

    public final void setChildren(@NotNull ArrayList<ChildEntity> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.children = arrayList;
    }

    public final void setExpand(boolean z) {
        this.isExpand = z;
    }

    public final void setFilterBottlesCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filterBottlesCount = str;
    }

    @NotNull
    public String toString() {
        return "ExpandableGroupEntity(isExpand=" + this.isExpand + ", bottlesCount=" + this.bottlesCount + ", filterBottlesCount=" + this.filterBottlesCount + ", auid=" + this.auid + ", children=" + this.children + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpandableGroupEntity(boolean z, String str, String str2, String str3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, str2, str3, arrayList);
    }
}
