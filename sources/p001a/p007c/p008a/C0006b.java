package p001a.p007c.p008a;

import android.app.SharedElementCallback;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;

/* renamed from: a.c.a.b */
/* compiled from: lambda */
public final /* synthetic */ class C0006b implements SharedElementCallback.OnSharedElementsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f8a;

    public /* synthetic */ C0006b(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.f8a = onSharedElementsReadyListener;
    }

    public final void onSharedElementsReady() {
        ActivityCompat.Api23Impl.onSharedElementsReady(this.f8a);
    }
}
