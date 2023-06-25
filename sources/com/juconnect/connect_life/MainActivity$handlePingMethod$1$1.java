package com.juconnect.connect_life;

import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo47991d2 = {"com/juconnect/connect_life/MainActivity$handlePingMethod$1$1", "Ljava/util/TimerTask;", "run", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$handlePingMethod$1$1 extends TimerTask {
    public final /* synthetic */ C9017j.C9022d $result;
    public final /* synthetic */ Ref.BooleanRef $uploaded;

    public MainActivity$handlePingMethod$1$1(Ref.BooleanRef booleanRef, C9017j.C9022d dVar) {
        this.$uploaded = booleanRef;
        this.$result = dVar;
    }

    public void run() {
        this.$uploaded.element = true;
        this.$result.success("0");
    }
}
