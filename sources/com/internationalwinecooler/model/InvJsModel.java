package com.internationalwinecooler.model;

import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo47991d2 = {"Lcom/internationalwinecooler/model/InvJsModel;", "", "pageIndex", "", "isLastPage", "", "wineList", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "(Ljava/lang/String;ZLjava/util/List;)V", "()Z", "getPageIndex", "()Ljava/lang/String;", "getWineList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InvJsModel.kt */
public final class InvJsModel {
    public final boolean isLastPage;
    @NotNull
    public final String pageIndex;
    @NotNull
    public final List<List<WineInventoryBean>> wineList;

    public InvJsModel(@NotNull String str, boolean z, @NotNull List<? extends List<WineInventoryBean>> list) {
        Intrinsics.checkNotNullParameter(str, "pageIndex");
        Intrinsics.checkNotNullParameter(list, "wineList");
        this.pageIndex = str;
        this.isLastPage = z;
        this.wineList = list;
    }

    public static /* synthetic */ InvJsModel copy$default(InvJsModel invJsModel, String str, boolean z, List<List<WineInventoryBean>> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invJsModel.pageIndex;
        }
        if ((i & 2) != 0) {
            z = invJsModel.isLastPage;
        }
        if ((i & 4) != 0) {
            list = invJsModel.wineList;
        }
        return invJsModel.copy(str, z, list);
    }

    @NotNull
    public final String component1() {
        return this.pageIndex;
    }

    public final boolean component2() {
        return this.isLastPage;
    }

    @NotNull
    public final List<List<WineInventoryBean>> component3() {
        return this.wineList;
    }

    @NotNull
    public final InvJsModel copy(@NotNull String str, boolean z, @NotNull List<? extends List<WineInventoryBean>> list) {
        Intrinsics.checkNotNullParameter(str, "pageIndex");
        Intrinsics.checkNotNullParameter(list, "wineList");
        return new InvJsModel(str, z, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvJsModel)) {
            return false;
        }
        InvJsModel invJsModel = (InvJsModel) obj;
        return Intrinsics.areEqual((Object) this.pageIndex, (Object) invJsModel.pageIndex) && this.isLastPage == invJsModel.isLastPage && Intrinsics.areEqual((Object) this.wineList, (Object) invJsModel.wineList);
    }

    @NotNull
    public final String getPageIndex() {
        return this.pageIndex;
    }

    @NotNull
    public final List<List<WineInventoryBean>> getWineList() {
        return this.wineList;
    }

    public int hashCode() {
        int hashCode = this.pageIndex.hashCode() * 31;
        boolean z = this.isLastPage;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.wineList.hashCode();
    }

    public final boolean isLastPage() {
        return this.isLastPage;
    }

    @NotNull
    public String toString() {
        return "InvJsModel(pageIndex=" + this.pageIndex + ", isLastPage=" + this.isLastPage + ", wineList=" + this.wineList + ')';
    }
}
