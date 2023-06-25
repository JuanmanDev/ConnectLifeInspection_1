package com.hisense.juconnect.app_device.fragment;

import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.wine.model.TicketModel;
import com.hisense.juconnect.app_device.R$string;
import com.juconnect.connectlife.model.TicketBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/TicketModel;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketsBaseFragment.kt */
public final class TicketsBaseFragment$getTickets$1 extends Lambda implements Function1<TicketModel, Unit> {
    public final /* synthetic */ TicketsBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TicketsBaseFragment$getTickets$1(TicketsBaseFragment ticketsBaseFragment) {
        super(1);
        this.this$0 = ticketsBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TicketModel) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull TicketModel ticketModel) {
        Intrinsics.checkNotNullParameter(ticketModel, LanguageConstKt.f15954it);
        if (ticketModel.getErrorCode() == 232910) {
            ToastUtils.m9600x(R$string.service_ticke_upgrade);
            return;
        }
        TicketsBaseFragment ticketsBaseFragment = this.this$0;
        Job unused = BuildersKt__Builders_commonKt.launch$default(ticketsBaseFragment, Dispatchers.getIO(), (CoroutineStart) null, new TicketsBaseFragment$getTickets$1$1$1(ticketModel, (Continuation<? super TicketsBaseFragment$getTickets$1$1$1>) null), 2, (Object) null);
        ticketsBaseFragment.list_opened.clear();
        ticketsBaseFragment.list_closed.clear();
        for (TicketBean ticketBean : ticketModel.getClaimList()) {
            if (Intrinsics.areEqual((Object) KeyConst.CLAIM_FINISHED, (Object) ticketBean.getStatus())) {
                ticketsBaseFragment.list_closed.add(ticketBean);
            } else {
                ticketsBaseFragment.list_opened.add(ticketBean);
            }
        }
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getTickets List : ", Integer.valueOf(this.this$0.list_opened.size())));
        if (this.this$0.getSwipeRefreshLayout().isRefreshing()) {
            this.this$0.getSwipeRefreshLayout().setRefreshing(false);
        } else {
            this.this$0.getMViewModel().updateLoadingStatus(false);
        }
        this.this$0.refreshData();
        this.this$0.dismissProgressDialog();
    }
}
