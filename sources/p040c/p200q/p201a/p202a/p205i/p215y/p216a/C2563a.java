package p040c.p200q.p201a.p202a.p205i.p215y.p216a;

import p625h.p626a.C9381a;

/* renamed from: c.q.a.a.i.y.a.a */
/* compiled from: DoubleCheck */
public final class C2563a<T> implements C9381a<T> {

    /* renamed from: c */
    public static final Object f3015c = new Object();

    /* renamed from: a */
    public volatile C9381a<T> f3016a;

    /* renamed from: b */
    public volatile Object f3017b = f3015c;

    public C2563a(C9381a<T> aVar) {
        this.f3016a = aVar;
    }

    /* renamed from: a */
    public static <P extends C9381a<T>, T> C9381a<T> m4595a(P p) {
        C2566d.m4599b(p);
        if (p instanceof C2563a) {
            return p;
        }
        return new C2563a(p);
    }

    /* renamed from: b */
    public static Object m4596b(Object obj, Object obj2) {
        if (!(obj != f3015c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f3017b;
        if (t == f3015c) {
            synchronized (this) {
                t = this.f3017b;
                if (t == f3015c) {
                    t = this.f3016a.get();
                    m4596b(this.f3017b, t);
                    this.f3017b = t;
                    this.f3016a = null;
                }
            }
        }
        return t;
    }
}
