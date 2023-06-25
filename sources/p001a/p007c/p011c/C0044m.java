package p001a.p007c.p011c;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;

/* renamed from: a.c.c.m */
/* compiled from: lambda */
public final /* synthetic */ class C0044m implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f63e;

    /* renamed from: l */
    public final /* synthetic */ Location f64l;

    public /* synthetic */ C0044m(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Location location) {
        this.f63e = locationListenerTransport;
        this.f64l = location;
    }

    public final void run() {
        this.f63e.mo6474b(this.f64l);
    }
}
