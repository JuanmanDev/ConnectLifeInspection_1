package p040c.p301y.p302b.p305b;

import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import com.juconnect.connectlife.ju_dist.JuDistPlugin$checkAndReconnectSocket$1;

/* renamed from: c.y.b.b.o */
/* compiled from: lambda */
public final /* synthetic */ class C3721o implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ JuDistPlugin f6740e;

    /* renamed from: l */
    public final /* synthetic */ String f6741l;

    public /* synthetic */ C3721o(JuDistPlugin juDistPlugin, String str) {
        this.f6740e = juDistPlugin;
        this.f6741l = str;
    }

    public final void run() {
        JuDistPlugin$checkAndReconnectSocket$1.m26793invoke$lambda0(this.f6740e, this.f6741l);
    }
}
