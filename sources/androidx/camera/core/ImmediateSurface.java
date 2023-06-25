package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.futures.Futures;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ImmediateSurface extends DeferrableSurface {
    public final Surface mSurface;

    public ImmediateSurface(Surface surface) {
        this.mSurface = surface;
    }

    public C6316e<Surface> getSurface() {
        return Futures.immediateFuture(this.mSurface);
    }
}
