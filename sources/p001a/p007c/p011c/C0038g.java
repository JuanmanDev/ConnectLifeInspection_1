package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.g */
/* compiled from: lambda */
public final /* synthetic */ class C0038g implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f48e;

    /* renamed from: l */
    public final /* synthetic */ Executor f49l;

    /* renamed from: m */
    public final /* synthetic */ int f50m;

    public /* synthetic */ C0038g(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, int i) {
        this.f48e = gpsStatusTransport;
        this.f49l = executor;
        this.f50m = i;
    }

    public final void run() {
        this.f48e.mo6465c(this.f49l, this.f50m);
    }
}
