package p001a.p007c.p011c;

import androidx.core.location.LocationManagerCompat;
import androidx.core.p028os.CancellationSignal;

/* renamed from: a.c.c.t */
/* compiled from: lambda */
public final /* synthetic */ class C0051t implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f79a;

    public /* synthetic */ C0051t(LocationManagerCompat.CancellableLocationListener cancellableLocationListener) {
        this.f79a = cancellableLocationListener;
    }

    public final void onCancel() {
        this.f79a.cancel();
    }
}
