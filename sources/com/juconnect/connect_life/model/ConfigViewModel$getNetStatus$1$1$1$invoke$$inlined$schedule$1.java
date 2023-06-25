package com.juconnect.connect_life.model;

import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo47991d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Timer.kt */
public final class ConfigViewModel$getNetStatus$1$1$1$invoke$$inlined$schedule$1 extends TimerTask {
    public final /* synthetic */ ConfigParsCom $it$inlined;
    public final /* synthetic */ ConfigViewModel this$0;

    public ConfigViewModel$getNetStatus$1$1$1$invoke$$inlined$schedule$1(ConfigViewModel configViewModel, ConfigParsCom configParsCom) {
        this.this$0 = configViewModel;
        this.$it$inlined = configParsCom;
    }

    public void run() {
        this.this$0.writeLog("配网", Intrinsics.stringPlus("获取网络状态成功", this.$it$inlined));
    }
}
