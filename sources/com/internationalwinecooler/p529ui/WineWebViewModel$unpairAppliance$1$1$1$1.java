package com.internationalwinecooler.p529ui;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.internationalwinecooler.model.JsResp;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$unpairAppliance$1$1$1$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$unpairAppliance$1$1$1$1 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$unpairAppliance$1$1$1$1(WineWebViewModel wineWebViewModel) {
        super(1);
        this.this$0 = wineWebViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        String str = "";
        JsResp jsResp = new JsResp(str, z ^ true ? 1 : 0, str);
        this.this$0.getUnbindApplianceLiveData().postValue(Boolean.valueOf(z));
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = this.this$0.getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.UNPAIR_APPLIANCE_CALLBACK;
        String json = new Gson().toJson((Object) jsResp);
        if (json != null) {
            str = json;
        }
        evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
    }
}
