package p001a.p022e;

import androidx.room.InvalidationTracker;

/* renamed from: a.e.b */
/* compiled from: lambda */
public final /* synthetic */ class C0083b implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ InvalidationTracker f122e;

    public /* synthetic */ C0083b(InvalidationTracker invalidationTracker) {
        this.f122e = invalidationTracker;
    }

    public final void run() {
        this.f122e.onAutoCloseCallback();
    }
}
