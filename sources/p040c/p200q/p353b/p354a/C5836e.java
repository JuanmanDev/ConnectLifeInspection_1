package p040c.p200q.p353b.p354a;

/* renamed from: c.q.b.a.e */
/* compiled from: Converter */
public abstract class C5836e<A, B> implements C5838g<A, B> {

    /* renamed from: e */
    public final boolean f11362e;

    public C5836e() {
        this(true);
    }

    /* renamed from: a */
    public final B mo28941a(A a) {
        return mo28943b(a);
    }

    @Deprecated
    public final B apply(A a) {
        return mo28941a(a);
    }

    /* renamed from: b */
    public B mo28943b(A a) {
        if (!this.f11362e) {
            return mo28944c(a);
        }
        if (a == null) {
            return null;
        }
        B c = mo28944c(a);
        C5850m.m16594o(c);
        return c;
    }

    /* renamed from: c */
    public abstract B mo28944c(A a);

    public C5836e(boolean z) {
        this.f11362e = z;
    }
}
