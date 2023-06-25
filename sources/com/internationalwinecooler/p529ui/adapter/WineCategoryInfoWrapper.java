package com.internationalwinecooler.p529ui.adapter;

import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/WineCategoryInfoWrapper;", "", "wineCategoryInfo", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "(Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "getWineCategoryInfo", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.WineCategoryInfoWrapper */
/* compiled from: WineCategoryListAdapter.kt */
public final class WineCategoryInfoWrapper {
    public boolean isSelected;
    @NotNull
    public final WineCategoryInfo wineCategoryInfo;

    public WineCategoryInfoWrapper(@NotNull WineCategoryInfo wineCategoryInfo2) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo2, "wineCategoryInfo");
        this.wineCategoryInfo = wineCategoryInfo2;
    }

    @NotNull
    public final WineCategoryInfo getWineCategoryInfo() {
        return this.wineCategoryInfo;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
