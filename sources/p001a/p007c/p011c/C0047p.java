package p001a.p007c.p011c;

import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.p */
/* compiled from: lambda */
public final /* synthetic */ class C0047p implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f70e;

    /* renamed from: l */
    public final /* synthetic */ Executor f71l;

    /* renamed from: m */
    public final /* synthetic */ GnssStatus f72m;

    public /* synthetic */ C0047p(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, GnssStatus gnssStatus) {
        this.f70e = preRGnssStatusTransport;
        this.f71l = executor;
        this.f72m = gnssStatus;
    }

    public final void run() {
        this.f70e.mo6488b(this.f71l, this.f72m);
    }
}
