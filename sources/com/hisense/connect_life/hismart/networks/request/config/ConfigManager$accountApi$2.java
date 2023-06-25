package com.hisense.connect_life.hismart.networks.request.config;

import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo47991d2 = {"<anonymous>", "Lcom/hisense/connect_life/hismart/networks/request/config/JuConfigApi;", "kotlin.jvm.PlatformType", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigManager.kt */
public final class ConfigManager$accountApi$2 extends Lambda implements Function0<JuConfigApi> {
    public final /* synthetic */ ConfigManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigManager$accountApi$2(ConfigManager configManager) {
        super(0);
        this.this$0 = configManager;
    }

    public final JuConfigApi invoke() {
        return (JuConfigApi) RetrofitUtils.INSTANCE.getRetrofit(this.this$0.getAccountUrl()).mo51323b(JuConfigApi.class);
    }
}
