package com.juconnect.connectlife.ju_dist;

import com.google.gson.Gson;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.juconnect.connectlife.ju_dist.connect.order.SearchWifiReplyOrder;
import com.juconnect.connectlife.ju_dist.fbean.WifiList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p040c.p301y.p302b.p305b.C3723q;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/juconnect/connectlife/ju_dist/connect/order/SearchWifiReplyOrder;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuDistPlugin.kt */
public final class JuDistPlugin$searchWifi$1$searchWifi$1 extends Lambda implements Function1<SearchWifiReplyOrder, Unit> {
    public final /* synthetic */ JuDistPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JuDistPlugin$searchWifi$1$searchWifi$1(JuDistPlugin juDistPlugin) {
        super(1);
        this.this$0 = juDistPlugin;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m26798invoke$lambda0(String str) {
        C9017j channel = JuDistPlugin.Companion.getChannel();
        if (channel != null) {
            channel.mo46573c("getWiFiListCallback", str);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SearchWifiReplyOrder) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull SearchWifiReplyOrder searchWifiReplyOrder) {
        Intrinsics.checkNotNullParameter(searchWifiReplyOrder, LanguageConstKt.f15954it);
        String json = new Gson().toJson((Object) new WifiList(searchWifiReplyOrder.getJson(), false));
        this.this$0.logE(Intrinsics.stringPlus("准备发送给flutter的数据:", json));
        this.this$0.threadUtils.mainRun(new C3723q(json));
    }
}
