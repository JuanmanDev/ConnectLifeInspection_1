package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;

/* renamed from: a.c.c.i */
/* compiled from: lambda */
public final /* synthetic */ class C0040i implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f55e;

    /* renamed from: l */
    public final /* synthetic */ String f56l;

    public /* synthetic */ C0040i(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f55e = locationListenerTransport;
        this.f56l = str;
    }

    public final void run() {
        this.f55e.mo6477e(this.f56l);
    }
}
