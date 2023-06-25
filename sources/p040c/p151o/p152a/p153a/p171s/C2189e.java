package p040c.p151o.p152a.p153a.p171s;

import java.util.Timer;
import p040c.p151o.p152a.p153a.C2103f;

/* renamed from: c.o.a.a.s.e */
/* compiled from: SessionVerificationService */
public class C2189e implements C2185b {

    /* renamed from: a */
    public Timer f2175a;

    public void stop() {
        C2103f.m3056b("SessionVerificationService", "stop: ");
        Timer timer = this.f2175a;
        if (timer != null) {
            timer.cancel();
            this.f2175a.purge();
            this.f2175a = null;
        }
        System.gc();
    }
}
