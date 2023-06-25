package com.hisense.juconnect.app_device.model;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.juconnect.connectlife.model.TicketBean;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/model/TicketViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "ticketListData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/juconnect/connectlife/model/TicketBean;", "getTicketListData", "()Landroidx/lifecycle/MutableLiveData;", "ticketListData$delegate", "Lkotlin/Lazy;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketViewModel.kt */
public final class TicketViewModel extends BaseViewModel {
    @NotNull
    public final Lazy ticketListData$delegate = LazyKt__LazyJVMKt.lazy(TicketViewModel$ticketListData$2.INSTANCE);

    @NotNull
    public final MutableLiveData<List<TicketBean>> getTicketListData() {
        return (MutableLiveData) this.ticketListData$delegate.getValue();
    }
}
