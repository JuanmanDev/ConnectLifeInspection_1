package p040c.p200q.p353b.p356c;

import java.util.concurrent.atomic.AtomicLong;
import p040c.p200q.p353b.p354a.C5865r;

/* renamed from: c.q.b.c.j */
/* compiled from: LongAddables */
public final class C6222j {

    /* renamed from: a */
    public static final C5865r<C6221i> f11833a;

    /* renamed from: c.q.b.c.j$a */
    /* compiled from: LongAddables */
    public static class C6223a implements C5865r<C6221i> {
        /* renamed from: a */
        public C6221i get() {
            return new C6226k();
        }
    }

    /* renamed from: c.q.b.c.j$b */
    /* compiled from: LongAddables */
    public static class C6224b implements C5865r<C6221i> {
        /* renamed from: a */
        public C6221i get() {
            return new C6225c((C6223a) null);
        }
    }

    /* renamed from: c.q.b.c.j$c */
    /* compiled from: LongAddables */
    public static final class C6225c extends AtomicLong implements C6221i {
        public C6225c() {
        }

        /* renamed from: a */
        public long mo30204a() {
            return get();
        }

        public void add(long j) {
            getAndAdd(j);
        }

        public void increment() {
            getAndIncrement();
        }

        public /* synthetic */ C6225c(C6223a aVar) {
            this();
        }
    }

    static {
        C5865r<C6221i> rVar;
        try {
            new C6226k();
            rVar = new C6223a();
        } catch (Throwable unused) {
            rVar = new C6224b();
        }
        f11833a = rVar;
    }

    /* renamed from: a */
    public static C6221i m17508a() {
        return f11833a.get();
    }
}
