package p630io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9216d;
import p553f.p594c.p617v.C9323a;

/* renamed from: io.reactivex.internal.disposables.CancellableDisposable */
public final class CancellableDisposable extends AtomicReference<C9216d> implements C9207b {
    public static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(C9216d dVar) {
        super(dVar);
    }

    public void dispose() {
        C9216d dVar;
        if (get() != null && (dVar = (C9216d) getAndSet((Object) null)) != null) {
            try {
                dVar.cancel();
            } catch (Exception e) {
                C9211a.m24971b(e);
                C9323a.m25169p(e);
            }
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
