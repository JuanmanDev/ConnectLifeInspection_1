package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, mo47991d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getWineListLiveData$2 extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends List<? extends WineCategoryInfo>>>> {
    public static final WineCategoryViewModel$getWineListLiveData$2 INSTANCE = new WineCategoryViewModel$getWineListLiveData$2();

    public WineCategoryViewModel$getWineListLiveData$2() {
        super(0);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> invoke() {
        return new MutableLiveData<>();
    }
}
