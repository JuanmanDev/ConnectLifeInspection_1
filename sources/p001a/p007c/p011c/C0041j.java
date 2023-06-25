package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* renamed from: a.c.c.j */
/* compiled from: lambda */
public final /* synthetic */ class C0041j implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f57e;

    /* renamed from: l */
    public final /* synthetic */ List f58l;

    public /* synthetic */ C0041j(LocationManagerCompat.LocationListenerTransport locationListenerTransport, List list) {
        this.f57e = locationListenerTransport;
        this.f58l = list;
    }

    public final void run() {
        this.f57e.mo6475c(this.f58l);
    }
}
