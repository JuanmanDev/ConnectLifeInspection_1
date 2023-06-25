package p553f.p594c.p602s.p612g;

import java.util.concurrent.ThreadFactory;
import p553f.p594c.C9194k;
import p630io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: f.c.s.g.d */
/* compiled from: NewThreadScheduler */
public final class C9298d extends C9194k {

    /* renamed from: b */
    public static final RxThreadFactory f18222b = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: a */
    public final ThreadFactory f18223a;

    public C9298d() {
        this(f18222b);
    }

    /* renamed from: a */
    public C9194k.C9196b mo47013a() {
        return new C9299e(this.f18223a);
    }

    public C9298d(ThreadFactory threadFactory) {
        this.f18223a = threadFactory;
    }
}
