package com.juconnect.connectlife.ju_dist;

import com.google.gson.Gson;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.juconnect.connectlife.ju_dist.connect.order.ZeroSettingOrder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuDistPlugin.kt */
public final class JuDistPlugin$settingWifi$1$1$settingWifi$1 extends Lambda implements Function1<String, Unit> {
    public final /* synthetic */ JuDistPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JuDistPlugin$settingWifi$1$1$settingWifi$1(JuDistPlugin juDistPlugin) {
        super(1);
        this.this$0 = juDistPlugin;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, LanguageConstKt.f15954it);
        try {
            ZeroSettingOrder zeroSettingOrder = (ZeroSettingOrder) new Gson().fromJson(str, ZeroSettingOrder.class);
            zeroSettingOrder.setPWD("");
            this.this$0.sendCmdCallback("wifi_config", zeroSettingOrder.getJson());
        } catch (Exception e) {
            Intrinsics.stringPlus("softAp sendCmdCallback Exception=", e.getMessage());
        }
    }
}
