package com.internationalwinecooler.p529ui;

import com.juconnect.connectlife.model.WineInventoryBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/DeletedWine;", "", "wineInventoryBean", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "(Lcom/juconnect/connectlife/model/WineInventoryBean;)V", "getWineInventoryBean", "()Lcom/juconnect/connectlife/model/WineInventoryBean;", "setWineInventoryBean", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.DeletedWine */
/* compiled from: DeletedWine.kt */
public final class DeletedWine {
    @NotNull
    public WineInventoryBean wineInventoryBean;

    public DeletedWine(@NotNull WineInventoryBean wineInventoryBean2) {
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "wineInventoryBean");
        this.wineInventoryBean = wineInventoryBean2;
    }

    public static /* synthetic */ DeletedWine copy$default(DeletedWine deletedWine, WineInventoryBean wineInventoryBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            wineInventoryBean2 = deletedWine.wineInventoryBean;
        }
        return deletedWine.copy(wineInventoryBean2);
    }

    @NotNull
    public final WineInventoryBean component1() {
        return this.wineInventoryBean;
    }

    @NotNull
    public final DeletedWine copy(@NotNull WineInventoryBean wineInventoryBean2) {
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "wineInventoryBean");
        return new DeletedWine(wineInventoryBean2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeletedWine) && Intrinsics.areEqual((Object) this.wineInventoryBean, (Object) ((DeletedWine) obj).wineInventoryBean);
    }

    @NotNull
    public final WineInventoryBean getWineInventoryBean() {
        return this.wineInventoryBean;
    }

    public int hashCode() {
        return this.wineInventoryBean.hashCode();
    }

    public final void setWineInventoryBean(@NotNull WineInventoryBean wineInventoryBean2) {
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "<set-?>");
        this.wineInventoryBean = wineInventoryBean2;
    }

    @NotNull
    public String toString() {
        return "DeletedWine(wineInventoryBean=" + this.wineInventoryBean + ')';
    }
}
