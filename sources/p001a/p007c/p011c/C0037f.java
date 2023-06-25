package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.f */
/* compiled from: lambda */
public final /* synthetic */ class C0037f implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f46e;

    /* renamed from: l */
    public final /* synthetic */ Executor f47l;

    public /* synthetic */ C0037f(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f46e = gpsStatusTransport;
        this.f47l = executor;
    }

    public final void run() {
        this.f46e.mo6463a(this.f47l);
    }
}
