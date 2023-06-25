package com.internationalwinecooler.viewmodel;

import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.wine.IWineCategoryManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$wineManager$2 extends Lambda implements Function0<IWineCategoryManager> {
    public static final WineCategoryViewModel$wineManager$2 INSTANCE = new WineCategoryViewModel$wineManager$2();

    public WineCategoryViewModel$wineManager$2() {
        super(0);
    }

    @NotNull
    public final IWineCategoryManager invoke() {
        return HiSmart.Companion.getInstance().wineCategoryService();
    }
}
