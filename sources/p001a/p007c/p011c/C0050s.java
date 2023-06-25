package p001a.p007c.p011c;

import android.location.LocationManager;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Callable;

/* renamed from: a.c.c.s */
/* compiled from: lambda */
public final /* synthetic */ class C0050s implements Callable {

    /* renamed from: e */
    public final /* synthetic */ LocationManager f77e;

    /* renamed from: l */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f78l;

    public /* synthetic */ C0050s(LocationManager locationManager, LocationManagerCompat.GpsStatusTransport gpsStatusTransport) {
        this.f77e = locationManager;
        this.f78l = gpsStatusTransport;
    }

    public final Object call() {
        return Boolean.valueOf(this.f77e.addGpsStatusListener(this.f78l));
    }
}
