package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;

/* renamed from: a.c.c.l */
/* compiled from: lambda */
public final /* synthetic */ class C0043l implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f61e;

    /* renamed from: l */
    public final /* synthetic */ String f62l;

    public /* synthetic */ C0043l(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f61e = locationListenerTransport;
        this.f62l = str;
    }

    public final void run() {
        this.f61e.mo6476d(this.f62l);
    }
}
