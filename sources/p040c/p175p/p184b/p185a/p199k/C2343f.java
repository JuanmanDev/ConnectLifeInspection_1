package p040c.p175p.p184b.p185a.p199k;

import p040c.p175p.p184b.p185a.p199k.C2343f.C2344a;

/* renamed from: c.p.b.a.k.f */
/* compiled from: ObjectPool */
public class C2343f<T extends C2344a> {

    /* renamed from: g */
    public static int f2540g;

    /* renamed from: a */
    public int f2541a;

    /* renamed from: b */
    public int f2542b;

    /* renamed from: c */
    public Object[] f2543c;

    /* renamed from: d */
    public int f2544d;

    /* renamed from: e */
    public T f2545e;

    /* renamed from: f */
    public float f2546f;

    /* renamed from: c.p.b.a.k.f$a */
    /* compiled from: ObjectPool */
    public static abstract class C2344a {

        /* renamed from: b */
        public static int f2547b = -1;

        /* renamed from: a */
        public int f2548a = f2547b;

        /* renamed from: a */
        public abstract C2344a mo17577a();
    }

    public C2343f(int i, T t) {
        if (i > 0) {
            this.f2542b = i;
            this.f2543c = new Object[i];
            this.f2544d = 0;
            this.f2545e = t;
            this.f2546f = 1.0f;
            mo17584d();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    /* renamed from: a */
    public static synchronized C2343f m3929a(int i, C2344a aVar) {
        C2343f fVar;
        synchronized (C2343f.class) {
            fVar = new C2343f(i, aVar);
            fVar.f2541a = f2540g;
            f2540g++;
        }
        return fVar;
    }

    /* renamed from: b */
    public synchronized T mo17582b() {
        T t;
        if (this.f2544d == -1 && this.f2546f > 0.0f) {
            mo17584d();
        }
        t = (C2344a) this.f2543c[this.f2544d];
        t.f2548a = C2344a.f2547b;
        this.f2544d--;
        return t;
    }

    /* renamed from: c */
    public synchronized void mo17583c(T t) {
        if (t.f2548a == C2344a.f2547b) {
            int i = this.f2544d + 1;
            this.f2544d = i;
            if (i >= this.f2543c.length) {
                mo17586f();
            }
            t.f2548a = this.f2541a;
            this.f2543c[this.f2544d] = t;
        } else if (t.f2548a == this.f2541a) {
            throw new IllegalArgumentException("The object passed is already stored in this pool!");
        } else {
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.f2548a + ".  Object cannot belong to two different pool instances simultaneously!");
        }
    }

    /* renamed from: d */
    public final void mo17584d() {
        mo17585e(this.f2546f);
    }

    /* renamed from: e */
    public final void mo17585e(float f) {
        int i = this.f2542b;
        int i2 = (int) (((float) i) * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f2543c[i3] = this.f2545e.mo17577a();
        }
        this.f2544d = i - 1;
    }

    /* renamed from: f */
    public final void mo17586f() {
        int i = this.f2542b;
        int i2 = i * 2;
        this.f2542b = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.f2543c[i3];
        }
        this.f2543c = objArr;
    }

    /* renamed from: g */
    public void mo17587g(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.f2546f = f;
    }
}
