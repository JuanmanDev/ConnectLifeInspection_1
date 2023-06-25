package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.q */
/* compiled from: lambda */
public final /* synthetic */ class C0048q implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f73e;

    /* renamed from: l */
    public final /* synthetic */ Executor f74l;

    public /* synthetic */ C0048q(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f73e = preRGnssStatusTransport;
        this.f74l = executor;
    }

    public final void run() {
        this.f73e.mo6489c(this.f74l);
    }
}
