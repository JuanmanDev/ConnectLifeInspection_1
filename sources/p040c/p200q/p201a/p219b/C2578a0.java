package p040c.p200q.p201a.p219b;

import android.util.Pair;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p241k0.p242b0.C2866a;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.a0 */
/* compiled from: Timeline */
public abstract class C2578a0 {

    /* renamed from: a */
    public static final C2578a0 f3043a = new C2579a();

    /* renamed from: c.q.a.b.a0$a */
    /* compiled from: Timeline */
    public static class C2579a extends C2578a0 {
        /* renamed from: b */
        public int mo18047b(Object obj) {
            return -1;
        }

        /* renamed from: g */
        public C2580b mo18052g(int i, C2580b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: i */
        public int mo18054i() {
            return 0;
        }

        /* renamed from: l */
        public Object mo18057l(int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: o */
        public C2581c mo18060o(int i, C2581c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: p */
        public int mo18061p() {
            return 0;
        }
    }

    /* renamed from: c.q.a.b.a0$b */
    /* compiled from: Timeline */
    public static final class C2580b {

        /* renamed from: a */
        public Object f3044a;

        /* renamed from: b */
        public Object f3045b;

        /* renamed from: c */
        public int f3046c;

        /* renamed from: d */
        public long f3047d;

        /* renamed from: e */
        public long f3048e;

        /* renamed from: f */
        public C2866a f3049f;

        /* renamed from: a */
        public int mo18064a(int i) {
            return this.f3049f.f4536c[i].f4539a;
        }

        /* renamed from: b */
        public long mo18065b(int i, int i2) {
            C2866a.C2867a aVar = this.f3049f.f4536c[i];
            if (aVar.f4539a != -1) {
                return aVar.f4542d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int mo18066c() {
            return this.f3049f.f4534a;
        }

        /* renamed from: d */
        public int mo18067d(long j) {
            return this.f3049f.mo19055a(j);
        }

        /* renamed from: e */
        public int mo18068e(long j) {
            return this.f3049f.mo19056b(j);
        }

        /* renamed from: f */
        public long mo18069f(int i) {
            return this.f3049f.f4535b[i];
        }

        /* renamed from: g */
        public long mo18070g() {
            return this.f3049f.f4537d;
        }

        /* renamed from: h */
        public long mo18071h() {
            return this.f3047d;
        }

        /* renamed from: i */
        public int mo18072i(int i) {
            return this.f3049f.f4536c[i].mo19060a();
        }

        /* renamed from: j */
        public int mo18073j(int i, int i2) {
            return this.f3049f.f4536c[i].mo19061b(i2);
        }

        /* renamed from: k */
        public long mo18074k() {
            return C2627d.m5058b(this.f3048e);
        }

        /* renamed from: l */
        public boolean mo18075l(int i) {
            return !this.f3049f.f4536c[i].mo19062c();
        }

        /* renamed from: m */
        public boolean mo18076m(int i, int i2) {
            C2866a.C2867a aVar = this.f3049f.f4536c[i];
            return (aVar.f4539a == -1 || aVar.f4541c[i2] == 0) ? false : true;
        }

        /* renamed from: n */
        public C2580b mo18077n(Object obj, Object obj2, int i, long j, long j2) {
            mo18078o(obj, obj2, i, j, j2, C2866a.f4533f);
            return this;
        }

        /* renamed from: o */
        public C2580b mo18078o(Object obj, Object obj2, int i, long j, long j2, C2866a aVar) {
            this.f3044a = obj;
            this.f3045b = obj2;
            this.f3046c = i;
            this.f3047d = j;
            this.f3048e = j2;
            this.f3049f = aVar;
            return this;
        }
    }

    /* renamed from: c.q.a.b.a0$c */
    /* compiled from: Timeline */
    public static final class C2581c {
        @Nullable

        /* renamed from: a */
        public Object f3050a;

        /* renamed from: b */
        public boolean f3051b;

        /* renamed from: c */
        public int f3052c;

        /* renamed from: d */
        public int f3053d;

        /* renamed from: e */
        public long f3054e;

        /* renamed from: f */
        public long f3055f;

        /* renamed from: g */
        public long f3056g;

        /* renamed from: a */
        public long mo18079a() {
            return C2627d.m5058b(this.f3054e);
        }

        /* renamed from: b */
        public long mo18080b() {
            return this.f3054e;
        }

        /* renamed from: c */
        public long mo18081c() {
            return C2627d.m5058b(this.f3055f);
        }

        /* renamed from: d */
        public long mo18082d() {
            return this.f3056g;
        }

        /* renamed from: e */
        public C2581c mo18083e(@Nullable Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f3050a = obj;
            this.f3051b = z2;
            this.f3054e = j3;
            this.f3055f = j4;
            this.f3052c = i;
            this.f3053d = i2;
            this.f3056g = j5;
            return this;
        }
    }

    /* renamed from: a */
    public int mo18046a(boolean z) {
        return mo18062q() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo18047b(Object obj);

    /* renamed from: c */
    public int mo18048c(boolean z) {
        if (mo18062q()) {
            return -1;
        }
        return mo18061p() - 1;
    }

    /* renamed from: d */
    public final int mo18049d(int i, C2580b bVar, C2581c cVar, int i2, boolean z) {
        int i3 = mo18051f(i, bVar).f3046c;
        if (mo18058m(i3, cVar).f3053d != i) {
            return i + 1;
        }
        int e = mo18050e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return mo18058m(e, cVar).f3052c;
    }

    /* renamed from: e */
    public int mo18050e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo18048c(z) ? mo18046a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo18048c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: f */
    public final C2580b mo18051f(int i, C2580b bVar) {
        return mo18052g(i, bVar, false);
    }

    /* renamed from: g */
    public abstract C2580b mo18052g(int i, C2580b bVar, boolean z);

    /* renamed from: h */
    public C2580b mo18053h(Object obj, C2580b bVar) {
        return mo18052g(mo18047b(obj), bVar, true);
    }

    /* renamed from: i */
    public abstract int mo18054i();

    /* renamed from: j */
    public final Pair<Object, Long> mo18055j(C2581c cVar, C2580b bVar, int i, long j) {
        return mo18056k(cVar, bVar, i, j, 0);
    }

    /* renamed from: k */
    public final Pair<Object, Long> mo18056k(C2581c cVar, C2580b bVar, int i, long j, long j2) {
        C3151e.m7755c(i, 0, mo18061p());
        mo18060o(i, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.mo18080b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f3052c;
        long d = cVar.mo18082d() + j;
        long h = mo18052g(i2, bVar, true).mo18071h();
        while (h != -9223372036854775807L && d >= h && i2 < cVar.f3053d) {
            d -= h;
            i2++;
            h = mo18052g(i2, bVar, true).mo18071h();
        }
        return Pair.create(bVar.f3045b, Long.valueOf(d));
    }

    /* renamed from: l */
    public abstract Object mo18057l(int i);

    /* renamed from: m */
    public final C2581c mo18058m(int i, C2581c cVar) {
        return mo18059n(i, cVar, false);
    }

    /* renamed from: n */
    public final C2581c mo18059n(int i, C2581c cVar, boolean z) {
        return mo18060o(i, cVar, z, 0);
    }

    /* renamed from: o */
    public abstract C2581c mo18060o(int i, C2581c cVar, boolean z, long j);

    /* renamed from: p */
    public abstract int mo18061p();

    /* renamed from: q */
    public final boolean mo18062q() {
        return mo18061p() == 0;
    }

    /* renamed from: r */
    public final boolean mo18063r(int i, C2580b bVar, C2581c cVar, int i2, boolean z) {
        return mo18049d(i, bVar, cVar, i2, z) == -1;
    }
}
