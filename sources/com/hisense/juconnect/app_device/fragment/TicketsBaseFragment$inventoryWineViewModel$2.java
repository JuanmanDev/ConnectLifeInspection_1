package com.hisense.juconnect.app_device.fragment;

import androidx.lifecycle.ViewModelProviders;
import com.hisense.juconnect.app_device.model.TicketViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lcom/hisense/juconnect/app_device/model/TicketViewModel;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketsBaseFragment.kt */
public final class TicketsBaseFragment$inventoryWineViewModel$2 extends Lambda implements Function0<TicketViewModel> {
    public final /* synthetic */ TicketsBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TicketsBaseFragment$inventoryWineViewModel$2(TicketsBaseFragment ticketsBaseFragment) {
        super(0);
        this.this$0 = ticketsBaseFragment;
    }

    @NotNull
    public final TicketViewModel invoke() {
        return (TicketViewModel) ViewModelProviders.m97of(this.this$0.requireActivity()).get(TicketViewModel.class);
    }
}
