package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getExpiredWineCategories$3 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> $expiredLiveData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$getExpiredWineCategories$3(MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> mutableLiveData) {
        super(0);
        this.$expiredLiveData = mutableLiveData;
    }

    public final void invoke() {
        this.$expiredLiveData.postValue(new Pair(Boolean.FALSE, CollectionsKt__CollectionsKt.emptyList()));
    }
}
