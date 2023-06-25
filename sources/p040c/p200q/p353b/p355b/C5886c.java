package p040c.p200q.p353b.p355b;

import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.c */
/* compiled from: AbstractIterator */
public abstract class C5886c<T> extends C5991h3<T> {

    /* renamed from: e */
    public C5888b f11411e = C5888b.NOT_READY;

    /* renamed from: l */
    public T f11412l;

    /* renamed from: c.q.b.b.c$a */
    /* compiled from: AbstractIterator */
    public static /* synthetic */ class C5887a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11413a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                c.q.b.b.c$b[] r0 = p040c.p200q.p353b.p355b.C5886c.C5888b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11413a = r0
                c.q.b.b.c$b r1 = p040c.p200q.p353b.p355b.C5886c.C5888b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11413a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.q.b.b.c$b r1 = p040c.p200q.p353b.p355b.C5886c.C5888b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p355b.C5886c.C5887a.<clinit>():void");
        }
    }

    /* renamed from: c.q.b.b.c$b */
    /* compiled from: AbstractIterator */
    public enum C5888b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo29067a();

    /* renamed from: b */
    public final T mo29068b() {
        this.f11411e = C5888b.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean mo29069c() {
        this.f11411e = C5888b.FAILED;
        this.f11412l = mo29067a();
        if (this.f11411e == C5888b.DONE) {
            return false;
        }
        this.f11411e = C5888b.READY;
        return true;
    }

    public final boolean hasNext() {
        C5850m.m16600u(this.f11411e != C5888b.FAILED);
        int i = C5887a.f11413a[this.f11411e.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return mo29069c();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f11411e = C5888b.NOT_READY;
            T t = this.f11412l;
            this.f11412l = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
