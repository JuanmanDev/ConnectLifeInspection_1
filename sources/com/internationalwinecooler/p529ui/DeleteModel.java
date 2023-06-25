package com.internationalwinecooler.p529ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/DeleteModel;", "", "list", "", "", "categoryType", "", "(Ljava/util/List;Z)V", "getCategoryType", "()Z", "setCategoryType", "(Z)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.DeleteModel */
/* compiled from: DeleteModel.kt */
public final class DeleteModel {
    public boolean categoryType;
    @NotNull
    public List<String> list;

    public DeleteModel(@NotNull List<String> list2, boolean z) {
        Intrinsics.checkNotNullParameter(list2, "list");
        this.list = list2;
        this.categoryType = z;
    }

    public static /* synthetic */ DeleteModel copy$default(DeleteModel deleteModel, List<String> list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list2 = deleteModel.list;
        }
        if ((i & 2) != 0) {
            z = deleteModel.categoryType;
        }
        return deleteModel.copy(list2, z);
    }

    @NotNull
    public final List<String> component1() {
        return this.list;
    }

    public final boolean component2() {
        return this.categoryType;
    }

    @NotNull
    public final DeleteModel copy(@NotNull List<String> list2, boolean z) {
        Intrinsics.checkNotNullParameter(list2, "list");
        return new DeleteModel(list2, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteModel)) {
            return false;
        }
        DeleteModel deleteModel = (DeleteModel) obj;
        return Intrinsics.areEqual((Object) this.list, (Object) deleteModel.list) && this.categoryType == deleteModel.categoryType;
    }

    public final boolean getCategoryType() {
        return this.categoryType;
    }

    @NotNull
    public final List<String> getList() {
        return this.list;
    }

    public int hashCode() {
        int hashCode = this.list.hashCode() * 31;
        boolean z = this.categoryType;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final void setCategoryType(boolean z) {
        this.categoryType = z;
    }

    public final void setList(@NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list2, "<set-?>");
        this.list = list2;
    }

    @NotNull
    public String toString() {
        return "DeleteModel(list=" + this.list + ", categoryType=" + this.categoryType + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeleteModel(List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list2, (i & 2) != 0 ? false : z);
    }
}
