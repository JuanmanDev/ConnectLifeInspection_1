package p634k.p635a.p636b;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* renamed from: k.a.b.b */
/* compiled from: lambda */
public final /* synthetic */ class C9490b implements Choreographer.FrameCallback {

    /* renamed from: e */
    public final /* synthetic */ CancellableContinuation f18797e;

    public /* synthetic */ C9490b(CancellableContinuation cancellableContinuation) {
        this.f18797e = cancellableContinuation;
    }

    public final void doFrame(long j) {
        HandlerDispatcherKt.m28781postFrameCallback$lambda6(this.f18797e, j);
    }
}
