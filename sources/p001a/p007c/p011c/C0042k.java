package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;

/* renamed from: a.c.c.k */
/* compiled from: lambda */
public final /* synthetic */ class C0042k implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f59e;

    /* renamed from: l */
    public final /* synthetic */ int f60l;

    public /* synthetic */ C0042k(LocationManagerCompat.LocationListenerTransport locationListenerTransport, int i) {
        this.f59e = locationListenerTransport;
        this.f60l = i;
    }

    public final void run() {
        this.f59e.mo6473a(this.f60l);
    }
}
