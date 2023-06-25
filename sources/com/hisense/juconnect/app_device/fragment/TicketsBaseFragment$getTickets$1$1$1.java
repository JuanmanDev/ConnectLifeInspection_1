package com.hisense.juconnect.app_device.fragment;

import com.hisense.connect_life.hismart.networks.request.wine.model.TicketModel;
import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.sql.ConnectLifeRoom;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.fragment.TicketsBaseFragment$getTickets$1$1$1", mo48701f = "TicketsBaseFragment.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: TicketsBaseFragment.kt */
public final class TicketsBaseFragment$getTickets$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TicketModel $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TicketsBaseFragment$getTickets$1$1$1(TicketModel ticketModel, Continuation<? super TicketsBaseFragment$getTickets$1$1$1> continuation) {
        super(2, continuation);
        this.$it = ticketModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TicketsBaseFragment$getTickets$1$1$1(this.$it, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TicketsBaseFragment$getTickets$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ConnectLifeRoom.Companion.wineInventoryProvider().deleteTicketBean();
            for (TicketBean insertTicketBean : this.$it.getClaimList()) {
                ConnectLifeRoom.Companion.wineInventoryProvider().insertTicketBean(insertTicketBean);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
