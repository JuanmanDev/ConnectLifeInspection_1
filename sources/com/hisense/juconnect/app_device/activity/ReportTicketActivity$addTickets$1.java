package com.hisense.juconnect.app_device.activity;

import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.juconnect.app_device.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ReportTicketActivity.kt */
public final class ReportTicketActivity$addTickets$1 extends Lambda implements Function1<HiResult<HiResponse>, Unit> {
    public final /* synthetic */ ReportTicketActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportTicketActivity$addTickets$1(ReportTicketActivity reportTicketActivity) {
        super(1);
        this.this$0 = reportTicketActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HiResult<HiResponse>) (HiResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull HiResult<HiResponse> hiResult) {
        Intrinsics.checkNotNullParameter(hiResult, LanguageConstKt.f15954it);
        if (hiResult.getResponse().getErrorCode() == 232910) {
            ToastUtils.m9600x(R$string.service_ticke_upgrade);
        }
        this.this$0.hideLoading();
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("insertTicket==", hiResult));
        this.this$0.setResult(-1);
    }
}
