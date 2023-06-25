package p040c.p200q.p201a.p219b.p224f0.p230w;

import com.google.android.exoplayer2.Format;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.i */
/* compiled from: StreamReader */
public abstract class C2756i {

    /* renamed from: a */
    public final C2752e f4001a = new C2752e();

    /* renamed from: b */
    public C2686q f4002b;

    /* renamed from: c */
    public C2676i f4003c;

    /* renamed from: d */
    public C2754g f4004d;

    /* renamed from: e */
    public long f4005e;

    /* renamed from: f */
    public long f4006f;

    /* renamed from: g */
    public long f4007g;

    /* renamed from: h */
    public int f4008h;

    /* renamed from: i */
    public int f4009i;

    /* renamed from: j */
    public C2758b f4010j;

    /* renamed from: k */
    public long f4011k;

    /* renamed from: l */
    public boolean f4012l;

    /* renamed from: m */
    public boolean f4013m;

    /* renamed from: c.q.a.b.f0.w.i$b */
    /* compiled from: StreamReader */
    public static class C2758b {

        /* renamed from: a */
        public Format f4014a;

        /* renamed from: b */
        public C2754g f4015b;
    }

    /* renamed from: c.q.a.b.f0.w.i$c */
    /* compiled from: StreamReader */
    public static final class C2759c implements C2754g {
        public C2759c() {
        }

        /* renamed from: b */
        public long mo18693b(C2675h hVar) {
            return -1;
        }

        /* renamed from: e */
        public C2682o mo18694e() {
            return new C2682o.C2684b(-9223372036854775807L);
        }

        /* renamed from: f */
        public long mo18695f(long j) {
            return 0;
        }
    }

    /* renamed from: a */
    public long mo18721a(long j) {
        return (j * EventLoop_commonKt.MS_TO_NS) / ((long) this.f4009i);
    }

    /* renamed from: b */
    public long mo18722b(long j) {
        return (((long) this.f4009i) * j) / EventLoop_commonKt.MS_TO_NS;
    }

    /* renamed from: c */
    public void mo18723c(C2676i iVar, C2686q qVar) {
        this.f4003c = iVar;
        this.f4002b = qVar;
        mo18706j(true);
    }

    /* renamed from: d */
    public void mo18724d(long j) {
        this.f4007g = j;
    }

    /* renamed from: e */
    public abstract long mo18704e(C3173t tVar);

    /* renamed from: f */
    public final int mo18725f(C2675h hVar, C2681n nVar) {
        int i = this.f4008h;
        if (i == 0) {
            return mo18726g(hVar);
        }
        if (i == 1) {
            hVar.mo18528g((int) this.f4006f);
            this.f4008h = 2;
            return 0;
        } else if (i == 2) {
            return mo18727i(hVar, nVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: g */
    public final int mo18726g(C2675h hVar) {
        boolean z = true;
        while (z) {
            if (!this.f4001a.mo18714d(hVar)) {
                this.f4008h = 3;
                return -1;
            }
            this.f4011k = hVar.getPosition() - this.f4006f;
            z = mo18705h(this.f4001a.mo18713c(), this.f4006f, this.f4010j);
            if (z) {
                this.f4006f = hVar.getPosition();
            }
        }
        C2675h hVar2 = hVar;
        Format format = this.f4010j.f4014a;
        this.f4009i = format.f7552E;
        if (!this.f4013m) {
            this.f4002b.mo18546d(format);
            this.f4013m = true;
        }
        C2754g gVar = this.f4010j.f4015b;
        if (gVar != null) {
            this.f4004d = gVar;
        } else if (hVar.mo18526e() == -1) {
            this.f4004d = new C2759c();
        } else {
            C2753f b = this.f4001a.mo18712b();
            this.f4004d = new C2746b(this.f4006f, hVar.mo18526e(), this, (long) (b.f3994e + b.f3995f), b.f3992c, (b.f3991b & 4) != 0);
        }
        this.f4010j = null;
        this.f4008h = 2;
        this.f4001a.mo18716f();
        return 0;
    }

    /* renamed from: h */
    public abstract boolean mo18705h(C3173t tVar, long j, C2758b bVar);

    /* renamed from: i */
    public final int mo18727i(C2675h hVar, C2681n nVar) {
        C2675h hVar2 = hVar;
        long b = this.f4004d.mo18693b(hVar2);
        if (b >= 0) {
            nVar.f3443a = b;
            return 1;
        }
        if (b < -1) {
            mo18724d(-(b + 2));
        }
        if (!this.f4012l) {
            this.f4003c.mo18553c(this.f4004d.mo18694e());
            this.f4012l = true;
        }
        if (this.f4011k > 0 || this.f4001a.mo18714d(hVar2)) {
            this.f4011k = 0;
            C3173t c = this.f4001a.mo18713c();
            long e = mo18704e(c);
            if (e >= 0) {
                long j = this.f4007g;
                if (j + e >= this.f4005e) {
                    long a = mo18721a(j);
                    this.f4002b.mo18544b(c, c.mo20011d());
                    this.f4002b.mo18545c(a, 1, c.mo20011d(), 0, (C2686q.C2687a) null);
                    this.f4005e = -1;
                }
            }
            this.f4007g += e;
            return 0;
        }
        this.f4008h = 3;
        return -1;
    }

    /* renamed from: j */
    public void mo18706j(boolean z) {
        if (z) {
            this.f4010j = new C2758b();
            this.f4006f = 0;
            this.f4008h = 0;
        } else {
            this.f4008h = 1;
        }
        this.f4005e = -1;
        this.f4007g = 0;
    }

    /* renamed from: k */
    public final void mo18728k(long j, long j2) {
        this.f4001a.mo18715e();
        if (j == 0) {
            mo18706j(!this.f4012l);
        } else if (this.f4008h != 0) {
            this.f4005e = this.f4004d.mo18695f(j2);
            this.f4008h = 2;
        }
    }
}
