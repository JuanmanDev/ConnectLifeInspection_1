package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.e */
/* compiled from: lambda */
public final /* synthetic */ class C0036e implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f44e;

    /* renamed from: l */
    public final /* synthetic */ Executor f45l;

    public /* synthetic */ C0036e(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f44e = gpsStatusTransport;
        this.f45l = executor;
    }

    public final void run() {
        this.f44e.mo6464b(this.f45l);
    }
}
