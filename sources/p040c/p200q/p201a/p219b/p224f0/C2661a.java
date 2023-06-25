package p040c.p200q.p201a.p219b.p224f0;

import android.support.p025v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.a */
/* compiled from: BinarySearchSeeker */
public abstract class C2661a {

    /* renamed from: a */
    public final C2662a f3373a;

    /* renamed from: b */
    public final C2668g f3374b;
    @Nullable

    /* renamed from: c */
    public C2665d f3375c;

    /* renamed from: d */
    public final int f3376d;

    /* renamed from: c.q.a.b.f0.a$a */
    /* compiled from: BinarySearchSeeker */
    public static class C2662a implements C2682o {

        /* renamed from: a */
        public final C2666e f3377a;

        /* renamed from: b */
        public final long f3378b;

        /* renamed from: c */
        public final long f3379c;

        /* renamed from: d */
        public final long f3380d;

        /* renamed from: e */
        public final long f3381e;

        /* renamed from: f */
        public final long f3382f;

        /* renamed from: g */
        public final long f3383g;

        public C2662a(C2666e eVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f3377a = eVar;
            this.f3378b = j;
            this.f3379c = j2;
            this.f3380d = j3;
            this.f3381e = j4;
            this.f3382f = j5;
            this.f3383g = j6;
        }

        /* renamed from: d */
        public boolean mo18503d() {
            return true;
        }

        /* renamed from: h */
        public C2682o.C2683a mo18504h(long j) {
            this.f3377a.mo18507a(j);
            return new C2682o.C2683a(new C2685p(j, C2665d.m5218h(j, this.f3379c, this.f3380d, this.f3381e, this.f3382f, this.f3383g)));
        }

        /* renamed from: i */
        public long mo18505i() {
            return this.f3378b;
        }

        /* renamed from: k */
        public long mo18506k(long j) {
            this.f3377a.mo18507a(j);
            return j;
        }
    }

    /* renamed from: c.q.a.b.f0.a$b */
    /* compiled from: BinarySearchSeeker */
    public static final class C2663b implements C2666e {
        /* renamed from: a */
        public long mo18507a(long j) {
            return j;
        }
    }

    /* renamed from: c.q.a.b.f0.a$c */
    /* compiled from: BinarySearchSeeker */
    public static final class C2664c {
    }

    /* renamed from: c.q.a.b.f0.a$d */
    /* compiled from: BinarySearchSeeker */
    public static class C2665d {

        /* renamed from: a */
        public final long f3384a;

        /* renamed from: b */
        public final long f3385b;

        /* renamed from: c */
        public final long f3386c;

        /* renamed from: d */
        public long f3387d;

        /* renamed from: e */
        public long f3388e;

        /* renamed from: f */
        public long f3389f;

        /* renamed from: g */
        public long f3390g;

        /* renamed from: h */
        public long f3391h;

        public C2665d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f3384a = j;
            this.f3385b = j2;
            this.f3387d = j3;
            this.f3388e = j4;
            this.f3389f = j5;
            this.f3390g = j6;
            this.f3386c = j7;
            this.f3391h = m5218h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        public static long m5218h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return C3152e0.m7815o(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* renamed from: i */
        public final long mo18508i() {
            return this.f3390g;
        }

        /* renamed from: j */
        public final long mo18509j() {
            return this.f3389f;
        }

        /* renamed from: k */
        public final long mo18510k() {
            return this.f3391h;
        }

        /* renamed from: l */
        public final long mo18511l() {
            return this.f3384a;
        }

        /* renamed from: m */
        public final long mo18512m() {
            return this.f3385b;
        }

        /* renamed from: n */
        public final void mo18513n() {
            this.f3391h = m5218h(this.f3385b, this.f3387d, this.f3388e, this.f3389f, this.f3390g, this.f3386c);
        }

        /* renamed from: o */
        public final void mo18514o(long j, long j2) {
            this.f3388e = j;
            this.f3390g = j2;
            mo18513n();
        }

        /* renamed from: p */
        public final void mo18515p(long j, long j2) {
            this.f3387d = j;
            this.f3389f = j2;
            mo18513n();
        }
    }

    /* renamed from: c.q.a.b.f0.a$e */
    /* compiled from: BinarySearchSeeker */
    public interface C2666e {
        /* renamed from: a */
        long mo18507a(long j);
    }

    /* renamed from: c.q.a.b.f0.a$f */
    /* compiled from: BinarySearchSeeker */
    public static final class C2667f {

        /* renamed from: d */
        public static final C2667f f3392d = new C2667f(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        public final int f3393a;

        /* renamed from: b */
        public final long f3394b;

        /* renamed from: c */
        public final long f3395c;

        public C2667f(int i, long j, long j2) {
            this.f3393a = i;
            this.f3394b = j;
            this.f3395c = j2;
        }

        /* renamed from: d */
        public static C2667f m5231d(long j, long j2) {
            return new C2667f(-1, j, j2);
        }

        /* renamed from: e */
        public static C2667f m5232e(long j) {
            return new C2667f(0, -9223372036854775807L, j);
        }

        /* renamed from: f */
        public static C2667f m5233f(long j, long j2) {
            return new C2667f(-2, j, j2);
        }
    }

    /* renamed from: c.q.a.b.f0.a$g */
    /* compiled from: BinarySearchSeeker */
    public interface C2668g {
        /* renamed from: a */
        C2667f mo18516a(C2675h hVar, long j, C2664c cVar);

        /* renamed from: b */
        void mo18517b() {
        }
    }

    public C2661a(C2666e eVar, C2668g gVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f3374b = gVar;
        this.f3376d = i;
        this.f3373a = new C2662a(eVar, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    public C2665d mo18494a(long j) {
        long j2 = j;
        this.f3373a.mo18506k(j2);
        return new C2665d(j, j2, this.f3373a.f3379c, this.f3373a.f3380d, this.f3373a.f3381e, this.f3373a.f3382f, this.f3373a.f3383g);
    }

    /* renamed from: b */
    public final C2682o mo18495b() {
        return this.f3373a;
    }

    /* renamed from: c */
    public int mo18496c(C2675h hVar, C2681n nVar, C2664c cVar) {
        C2668g gVar = this.f3374b;
        C3151e.m7757e(gVar);
        C2668g gVar2 = gVar;
        while (true) {
            C2665d dVar = this.f3375c;
            C3151e.m7757e(dVar);
            C2665d dVar2 = dVar;
            long b = dVar2.mo18509j();
            long c = dVar2.mo18508i();
            long d = dVar2.mo18510k();
            if (c - b <= ((long) this.f3376d)) {
                mo18498e(false, b);
                return mo18500g(hVar, b, nVar);
            } else if (!mo18502i(hVar, d)) {
                return mo18500g(hVar, d, nVar);
            } else {
                hVar.mo18527f();
                C2667f a = gVar2.mo18516a(hVar, dVar2.mo18512m(), cVar);
                int a2 = a.f3393a;
                if (a2 == -3) {
                    mo18498e(false, d);
                    return mo18500g(hVar, d, nVar);
                } else if (a2 == -2) {
                    dVar2.mo18515p(a.f3394b, a.f3395c);
                } else if (a2 == -1) {
                    dVar2.mo18514o(a.f3394b, a.f3395c);
                } else if (a2 == 0) {
                    mo18498e(true, a.f3395c);
                    mo18502i(hVar, a.f3395c);
                    return mo18500g(hVar, a.f3395c, nVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo18497d() {
        return this.f3375c != null;
    }

    /* renamed from: e */
    public final void mo18498e(boolean z, long j) {
        this.f3375c = null;
        this.f3374b.mo18517b();
        mo18499f(z, j);
    }

    /* renamed from: f */
    public void mo18499f(boolean z, long j) {
    }

    /* renamed from: g */
    public final int mo18500g(C2675h hVar, long j, C2681n nVar) {
        if (j == hVar.getPosition()) {
            return 0;
        }
        nVar.f3443a = j;
        return 1;
    }

    /* renamed from: h */
    public final void mo18501h(long j) {
        C2665d dVar = this.f3375c;
        if (dVar == null || dVar.mo18511l() != j) {
            this.f3375c = mo18494a(j);
        }
    }

    /* renamed from: i */
    public final boolean mo18502i(C2675h hVar, long j) {
        long position = j - hVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        hVar.mo18528g((int) position);
        return true;
    }
}
