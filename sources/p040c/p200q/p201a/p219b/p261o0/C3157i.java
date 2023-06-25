package p040c.p200q.p201a.p219b.p261o0;

/* renamed from: c.q.a.b.o0.i */
/* compiled from: ConditionVariable */
public final class C3157i {

    /* renamed from: a */
    public boolean f5836a;

    /* renamed from: a */
    public synchronized void mo19956a() {
        while (!this.f5836a) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean mo19957b() {
        boolean z;
        z = this.f5836a;
        this.f5836a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo19958c() {
        if (this.f5836a) {
            return false;
        }
        this.f5836a = true;
        notifyAll();
        return true;
    }
}
