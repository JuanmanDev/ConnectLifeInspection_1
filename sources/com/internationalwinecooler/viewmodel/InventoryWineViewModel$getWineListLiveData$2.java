package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$getWineListLiveData$2 extends Lambda implements Function0<MutableLiveData<List<? extends List<? extends WineInventoryBean>>>> {
    public static final InventoryWineViewModel$getWineListLiveData$2 INSTANCE = new InventoryWineViewModel$getWineListLiveData$2();

    public InventoryWineViewModel$getWineListLiveData$2() {
        super(0);
    }

    @NotNull
    public final MutableLiveData<List<List<WineInventoryBean>>> invoke() {
        return new MutableLiveData<>();
    }
}
