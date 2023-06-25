package p553f.p594c.p602s.p614i;

import p553f.p594c.p602s.p605c.C9234g;
import p553f.p594c.p602s.p611f.C9288a;
import p630io.reactivex.internal.queue.SpscArrayQueue;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.i.g */
/* compiled from: QueueDrainHelper */
public final class C9320g {
    /* renamed from: a */
    public static <T> C9234g<T> m25152a(int i) {
        if (i < 0) {
            return new C9288a(-i);
        }
        return new SpscArrayQueue(i);
    }

    /* renamed from: b */
    public static void m25153b(C9803c cVar, int i) {
        cVar.request(i < 0 ? Long.MAX_VALUE : (long) i);
    }
}
