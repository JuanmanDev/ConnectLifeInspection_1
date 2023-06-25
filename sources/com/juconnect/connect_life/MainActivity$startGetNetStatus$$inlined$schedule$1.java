package com.juconnect.connect_life;

import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo47991d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Timer.kt */
public final class MainActivity$startGetNetStatus$$inlined$schedule$1 extends TimerTask {
    public final /* synthetic */ String $cmd$inlined;
    public final /* synthetic */ MainActivity this$0;

    public MainActivity$startGetNetStatus$$inlined$schedule$1(MainActivity mainActivity, String str) {
        this.this$0 = mainActivity;
        this.$cmd$inlined = str;
    }

    public void run() {
        this.this$0.writeLog("配网", Intrinsics.stringPlus("获取配网状态信息：", this.$cmd$inlined));
    }
}
