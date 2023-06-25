package com.internationalwinecooler.p529ui;

import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.JsResp;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateApplianceProfile$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$updateApplianceProfile$1 extends Lambda implements Function1<HiResult<HiResponse>, Unit> {
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$updateApplianceProfile$1(WineWebViewModel wineWebViewModel) {
        super(1);
        this.this$0 = wineWebViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HiResult<HiResponse>) (HiResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull HiResult<HiResponse> hiResult) {
        Intrinsics.checkNotNullParameter(hiResult, LanguageConstKt.f15954it);
        if (hiResult.getResponse().getErrorCode() == 232911) {
            ToastUtils.m9600x(R.string.service_warranty_maintain_tips);
        }
        String str = "";
        JsResp jsResp = new JsResp(str, hiResult.getResponse().getResultCode() == 0 ? 0 : 1, str);
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = this.this$0.getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.UPDATE_APPLIANCE_PROFILE_CALLBACK;
        String json = new Gson().toJson((Object) jsResp);
        if (json != null) {
            str = json;
        }
        evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
    }
}
