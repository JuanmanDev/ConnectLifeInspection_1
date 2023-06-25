package p040c.p200q.p353b.p355b;

/* renamed from: c.q.b.b.c0 */
/* compiled from: ComparisonChain */
public abstract class C5889c0 {

    /* renamed from: a */
    public static final C5889c0 f11419a = new C5890a();

    /* renamed from: b */
    public static final C5889c0 f11420b = new C5891b(-1);

    /* renamed from: c */
    public static final C5889c0 f11421c = new C5891b(1);

    /* renamed from: c.q.b.b.c0$a */
    /* compiled from: ComparisonChain */
    public static class C5890a extends C5889c0 {
        public C5890a() {
            super((C5890a) null);
        }

        /* renamed from: d */
        public C5889c0 mo29072d(Comparable comparable, Comparable comparable2) {
            return mo29074g(comparable.compareTo(comparable2));
        }

        /* renamed from: e */
        public int mo29073e() {
            return 0;
        }

        /* renamed from: g */
        public C5889c0 mo29074g(int i) {
            if (i < 0) {
                return C5889c0.f11420b;
            }
            return i > 0 ? C5889c0.f11421c : C5889c0.f11419a;
        }
    }

    /* renamed from: c.q.b.b.c0$b */
    /* compiled from: ComparisonChain */
    public static final class C5891b extends C5889c0 {

        /* renamed from: d */
        public final int f11422d;

        public C5891b(int i) {
            super((C5890a) null);
            this.f11422d = i;
        }

        /* renamed from: d */
        public C5889c0 mo29072d(Comparable comparable, Comparable comparable2) {
            return this;
        }

        /* renamed from: e */
        public int mo29073e() {
            return this.f11422d;
        }
    }

    public /* synthetic */ C5889c0(C5890a aVar) {
        this();
    }

    /* renamed from: f */
    public static C5889c0 m16656f() {
        return f11419a;
    }

    /* renamed from: d */
    public abstract C5889c0 mo29072d(Comparable<?> comparable, Comparable<?> comparable2);

    /* renamed from: e */
    public abstract int mo29073e();

    public C5889c0() {
    }
}
