package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: a.c.c.n */
/* compiled from: lambda */
public final /* synthetic */ class C0045n implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f65e;

    /* renamed from: l */
    public final /* synthetic */ Executor f66l;

    /* renamed from: m */
    public final /* synthetic */ int f67m;

    public /* synthetic */ C0045n(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f65e = preRGnssStatusTransport;
        this.f66l = executor;
        this.f67m = i;
    }

    public final void run() {
        this.f65e.mo6487a(this.f66l, this.f67m);
    }
}
