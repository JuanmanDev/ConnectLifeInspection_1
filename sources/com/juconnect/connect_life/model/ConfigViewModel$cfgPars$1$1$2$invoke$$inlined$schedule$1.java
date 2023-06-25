package com.juconnect.connect_life.model;

import com.hisense.connect_life.hismart.model.FailureBean;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo47991d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Timer.kt */
public final class ConfigViewModel$cfgPars$1$1$2$invoke$$inlined$schedule$1 extends TimerTask {
    public final /* synthetic */ FailureBean $it$inlined;
    public final /* synthetic */ ConfigViewModel this$0;

    public ConfigViewModel$cfgPars$1$1$2$invoke$$inlined$schedule$1(ConfigViewModel configViewModel, FailureBean failureBean) {
        this.this$0 = configViewModel;
        this.$it$inlined = failureBean;
    }

    public void run() {
        this.this$0.writeLog("配网", Intrinsics.stringPlus("配网失败：", this.$it$inlined.getErrorDesc()));
    }
}
