package p040c.p301y.p302b.p305b;

import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import com.juconnect.connectlife.ju_dist.JuDistPlugin$findDevice$2;
import com.juconnect.connectlife.ju_dist.find.BcWifiMessage;

/* renamed from: c.y.b.b.f */
/* compiled from: lambda */
public final /* synthetic */ class C3712f implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ BcWifiMessage f6725e;

    /* renamed from: l */
    public final /* synthetic */ JuDistPlugin f6726l;

    public /* synthetic */ C3712f(BcWifiMessage bcWifiMessage, JuDistPlugin juDistPlugin) {
        this.f6725e = bcWifiMessage;
        this.f6726l = juDistPlugin;
    }

    public final void run() {
        JuDistPlugin$findDevice$2.m26795onListenSuccess$lambda1(this.f6725e, this.f6726l);
    }
}
