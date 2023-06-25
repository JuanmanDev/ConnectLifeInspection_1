package p001a.p007c.p011c;

import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.d */
/* compiled from: lambda */
public final /* synthetic */ class C0035d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f41e;

    /* renamed from: l */
    public final /* synthetic */ Executor f42l;

    /* renamed from: m */
    public final /* synthetic */ GnssStatusCompat f43m;

    public /* synthetic */ C0035d(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, GnssStatusCompat gnssStatusCompat) {
        this.f41e = gpsStatusTransport;
        this.f42l = executor;
        this.f43m = gnssStatusCompat;
    }

    public final void run() {
        this.f41e.mo6466d(this.f42l, this.f43m);
    }
}
