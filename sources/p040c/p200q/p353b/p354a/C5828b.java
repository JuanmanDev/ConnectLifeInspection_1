package p040c.p200q.p353b.p354a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.q.b.a.b */
/* compiled from: AbstractIterator */
public abstract class C5828b<T> implements Iterator<T> {

    /* renamed from: e */
    public C5830b f11351e = C5830b.NOT_READY;

    /* renamed from: l */
    public T f11352l;

    /* renamed from: c.q.b.a.b$a */
    /* compiled from: AbstractIterator */
    public static /* synthetic */ class C5829a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11353a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                c.q.b.a.b$b[] r0 = p040c.p200q.p353b.p354a.C5828b.C5830b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11353a = r0
                c.q.b.a.b$b r1 = p040c.p200q.p353b.p354a.C5828b.C5830b.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11353a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.q.b.a.b$b r1 = p040c.p200q.p353b.p354a.C5828b.C5830b.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p354a.C5828b.C5829a.<clinit>():void");
        }
    }

    /* renamed from: c.q.b.a.b$b */
    /* compiled from: AbstractIterator */
    public enum C5830b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo28929a();

    /* renamed from: b */
    public final T mo28930b() {
        this.f11351e = C5830b.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean mo28931c() {
        this.f11351e = C5830b.FAILED;
        this.f11352l = mo28929a();
        if (this.f11351e == C5830b.DONE) {
            return false;
        }
        this.f11351e = C5830b.READY;
        return true;
    }

    public final boolean hasNext() {
        C5850m.m16600u(this.f11351e != C5830b.FAILED);
        int i = C5829a.f11353a[this.f11351e.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return mo28931c();
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            this.f11351e = C5830b.NOT_READY;
            T t = this.f11352l;
            this.f11352l = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
