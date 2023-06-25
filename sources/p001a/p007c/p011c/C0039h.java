package p001a.p007c.p011c;

import android.os.Bundle;
import androidx.core.location.LocationManagerCompat;

/* renamed from: a.c.c.h */
/* compiled from: lambda */
public final /* synthetic */ class C0039h implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f51e;

    /* renamed from: l */
    public final /* synthetic */ String f52l;

    /* renamed from: m */
    public final /* synthetic */ int f53m;

    /* renamed from: n */
    public final /* synthetic */ Bundle f54n;

    public /* synthetic */ C0039h(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i, Bundle bundle) {
        this.f51e = locationListenerTransport;
        this.f52l = str;
        this.f53m = i;
        this.f54n = bundle;
    }

    public final void run() {
        this.f51e.mo6478f(this.f52l, this.f53m, this.f54n);
    }
}
