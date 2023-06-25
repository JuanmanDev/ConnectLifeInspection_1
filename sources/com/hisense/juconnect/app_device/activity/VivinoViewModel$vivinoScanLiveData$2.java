package com.hisense.juconnect.app_device.activity;

import androidx.lifecycle.MutableLiveData;
import com.juconnect.vivino.model.HiVintage;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/juconnect/vivino/model/HiVintage;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: VivinoViewModel.kt */
public final class VivinoViewModel$vivinoScanLiveData$2 extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends HiVintage>>> {
    public static final VivinoViewModel$vivinoScanLiveData$2 INSTANCE = new VivinoViewModel$vivinoScanLiveData$2();

    public VivinoViewModel$vivinoScanLiveData$2() {
        super(0);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, HiVintage>> invoke() {
        return new MutableLiveData<>();
    }
}
