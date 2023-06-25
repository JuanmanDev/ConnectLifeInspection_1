package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import com.google.android.exoplayer2.Format;
import java.util.List;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.d0.k.j */
/* compiled from: SegmentBase */
public abstract class C2930j {

    /* renamed from: a */
    public final C2925h f4822a;

    /* renamed from: b */
    public final long f4823b;

    /* renamed from: c */
    public final long f4824c;

    /* renamed from: c.q.a.b.k0.d0.k.j$a */
    /* compiled from: SegmentBase */
    public static abstract class C2931a extends C2930j {

        /* renamed from: d */
        public final long f4825d;

        /* renamed from: e */
        public final long f4826e;

        /* renamed from: f */
        public final List<C2934d> f4827f;

        public C2931a(C2925h hVar, long j, long j2, long j3, long j4, List<C2934d> list) {
            super(hVar, j, j2);
            this.f4825d = j3;
            this.f4826e = j4;
            this.f4827f = list;
        }

        /* renamed from: c */
        public long mo19295c() {
            return this.f4825d;
        }

        /* renamed from: d */
        public abstract int mo19296d(long j);

        /* renamed from: e */
        public final long mo19297e(long j, long j2) {
            List<C2934d> list = this.f4827f;
            if (list != null) {
                return (list.get((int) (j - this.f4825d)).f4832b * EventLoop_commonKt.MS_TO_NS) / this.f4823b;
            }
            int d = mo19296d(j2);
            return (d == -1 || j != (mo19295c() + ((long) d)) - 1) ? (this.f4826e * EventLoop_commonKt.MS_TO_NS) / this.f4823b : j2 - mo19299g(j);
        }

        /* renamed from: f */
        public long mo19298f(long j, long j2) {
            long c = mo19295c();
            long d = (long) mo19296d(j2);
            if (d == 0) {
                return c;
            }
            if (this.f4827f == null) {
                long j3 = this.f4825d + (j / ((this.f4826e * EventLoop_commonKt.MS_TO_NS) / this.f4823b));
                if (j3 < c) {
                    return c;
                }
                if (d == -1) {
                    return j3;
                }
                return Math.min(j3, (c + d) - 1);
            }
            long j4 = (d + c) - 1;
            long j5 = c;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                int i = (mo19299g(j6) > j ? 1 : (mo19299g(j6) == j ? 0 : -1));
                if (i < 0) {
                    j5 = j6 + 1;
                } else if (i <= 0) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            return j5 == c ? j5 : j4;
        }

        /* renamed from: g */
        public final long mo19299g(long j) {
            long j2;
            List<C2934d> list = this.f4827f;
            if (list != null) {
                j2 = list.get((int) (j - this.f4825d)).f4831a - this.f4824c;
            } else {
                j2 = (j - this.f4825d) * this.f4826e;
            }
            return C3152e0.m7792c0(j2, EventLoop_commonKt.MS_TO_NS, this.f4823b);
        }

        /* renamed from: h */
        public abstract C2925h mo19300h(C2926i iVar, long j);

        /* renamed from: i */
        public boolean mo19301i() {
            return this.f4827f != null;
        }
    }

    /* renamed from: c.q.a.b.k0.d0.k.j$b */
    /* compiled from: SegmentBase */
    public static class C2932b extends C2931a {

        /* renamed from: g */
        public final List<C2925h> f4828g;

        public C2932b(C2925h hVar, long j, long j2, long j3, long j4, List<C2934d> list, List<C2925h> list2) {
            super(hVar, j, j2, j3, j4, list);
            this.f4828g = list2;
        }

        /* renamed from: d */
        public int mo19296d(long j) {
            return this.f4828g.size();
        }

        /* renamed from: h */
        public C2925h mo19300h(C2926i iVar, long j) {
            return this.f4828g.get((int) (j - this.f4825d));
        }

        /* renamed from: i */
        public boolean mo19301i() {
            return true;
        }
    }

    /* renamed from: c.q.a.b.k0.d0.k.j$c */
    /* compiled from: SegmentBase */
    public static class C2933c extends C2931a {

        /* renamed from: g */
        public final C2937l f4829g;

        /* renamed from: h */
        public final C2937l f4830h;

        public C2933c(C2925h hVar, long j, long j2, long j3, long j4, List<C2934d> list, C2937l lVar, C2937l lVar2) {
            super(hVar, j, j2, j3, j4, list);
            this.f4829g = lVar;
            this.f4830h = lVar2;
        }

        /* renamed from: a */
        public C2925h mo19293a(C2926i iVar) {
            C2937l lVar = this.f4829g;
            if (lVar == null) {
                return C2930j.super.mo19293a(iVar);
            }
            Format format = iVar.f4812a;
            return new C2925h(lVar.mo19303a(format.f7560e, 0, format.f7562m, 0), 0, -1);
        }

        /* renamed from: d */
        public int mo19296d(long j) {
            List<C2934d> list = this.f4827f;
            if (list != null) {
                return list.size();
            }
            if (j != -9223372036854775807L) {
                return (int) C3152e0.m7803i(j, (this.f4826e * EventLoop_commonKt.MS_TO_NS) / this.f4823b);
            }
            return -1;
        }

        /* renamed from: h */
        public C2925h mo19300h(C2926i iVar, long j) {
            long j2;
            List<C2934d> list = this.f4827f;
            if (list != null) {
                j2 = list.get((int) (j - this.f4825d)).f4831a;
            } else {
                j2 = (j - this.f4825d) * this.f4826e;
            }
            long j3 = j2;
            C2937l lVar = this.f4830h;
            Format format = iVar.f4812a;
            return new C2925h(lVar.mo19303a(format.f7560e, j, format.f7562m, j3), 0, -1);
        }
    }

    /* renamed from: c.q.a.b.k0.d0.k.j$d */
    /* compiled from: SegmentBase */
    public static class C2934d {

        /* renamed from: a */
        public final long f4831a;

        /* renamed from: b */
        public final long f4832b;

        public C2934d(long j, long j2) {
            this.f4831a = j;
            this.f4832b = j2;
        }
    }

    public C2930j(C2925h hVar, long j, long j2) {
        this.f4822a = hVar;
        this.f4823b = j;
        this.f4824c = j2;
    }

    /* renamed from: a */
    public C2925h mo19293a(C2926i iVar) {
        return this.f4822a;
    }

    /* renamed from: b */
    public long mo19294b() {
        return C3152e0.m7792c0(this.f4824c, EventLoop_commonKt.MS_TO_NS, this.f4823b);
    }

    /* renamed from: c.q.a.b.k0.d0.k.j$e */
    /* compiled from: SegmentBase */
    public static class C2935e extends C2930j {

        /* renamed from: d */
        public final long f4833d;

        /* renamed from: e */
        public final long f4834e;

        public C2935e(C2925h hVar, long j, long j2, long j3, long j4) {
            super(hVar, j, j2);
            this.f4833d = j3;
            this.f4834e = j4;
        }

        /* renamed from: c */
        public C2925h mo19302c() {
            long j = this.f4834e;
            if (j <= 0) {
                return null;
            }
            return new C2925h((String) null, this.f4833d, j);
        }

        public C2935e() {
            this((C2925h) null, 1, 0, 0, 0);
        }
    }
}
