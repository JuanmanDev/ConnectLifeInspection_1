package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.o */
/* compiled from: lambda */
public final /* synthetic */ class C0046o implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f68e;

    /* renamed from: l */
    public final /* synthetic */ Executor f69l;

    public /* synthetic */ C0046o(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f68e = preRGnssStatusTransport;
        this.f69l = executor;
    }

    public final void run() {
        this.f68e.mo6490d(this.f69l);
    }
}
