package p040c.p200q.p201a.p219b.p224f0.p230w;

import java.io.EOFException;
import java.io.IOException;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2685p;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.f0.w.b */
/* compiled from: DefaultOggSeeker */
public final class C2746b implements C2754g {

    /* renamed from: a */
    public final C2753f f3961a = new C2753f();

    /* renamed from: b */
    public final long f3962b;

    /* renamed from: c */
    public final long f3963c;

    /* renamed from: d */
    public final C2756i f3964d;

    /* renamed from: e */
    public int f3965e;

    /* renamed from: f */
    public long f3966f;

    /* renamed from: g */
    public long f3967g;

    /* renamed from: h */
    public long f3968h;

    /* renamed from: i */
    public long f3969i;

    /* renamed from: j */
    public long f3970j;

    /* renamed from: k */
    public long f3971k;

    /* renamed from: l */
    public long f3972l;

    /* renamed from: c.q.a.b.f0.w.b$b */
    /* compiled from: DefaultOggSeeker */
    public class C2748b implements C2682o {
        public C2748b() {
        }

        /* renamed from: d */
        public boolean mo18503d() {
            return true;
        }

        /* renamed from: h */
        public C2682o.C2683a mo18504h(long j) {
            if (j == 0) {
                return new C2682o.C2683a(new C2685p(0, C2746b.this.f3962b));
            }
            long b = C2746b.this.f3964d.mo18722b(j);
            C2746b bVar = C2746b.this;
            return new C2682o.C2683a(new C2685p(j, bVar.mo18697i(bVar.f3962b, b, 30000)));
        }

        /* renamed from: i */
        public long mo18505i() {
            return C2746b.this.f3964d.mo18721a(C2746b.this.f3966f);
        }
    }

    public C2746b(long j, long j2, C2756i iVar, long j3, long j4, boolean z) {
        C3151e.m7753a(j >= 0 && j2 > j);
        this.f3964d = iVar;
        this.f3962b = j;
        this.f3963c = j2;
        if (j3 == j2 - j || z) {
            this.f3966f = j4;
            this.f3965e = 3;
            return;
        }
        this.f3965e = 0;
    }

    /* renamed from: b */
    public long mo18693b(C2675h hVar) {
        int i = this.f3965e;
        if (i == 0) {
            long position = hVar.getPosition();
            this.f3967g = position;
            this.f3965e = 1;
            long j = this.f3963c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.f3968h;
                long j3 = 0;
                if (j2 != 0) {
                    long j4 = mo18698j(j2, hVar);
                    if (j4 >= 0) {
                        return j4;
                    }
                    j3 = mo18703o(hVar, this.f3968h, -(j4 + 2));
                }
                this.f3965e = 3;
                return -(j3 + 2);
            } else if (i == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f3966f = mo18699k(hVar);
        this.f3965e = 3;
        return this.f3967g;
    }

    /* renamed from: f */
    public long mo18695f(long j) {
        int i = this.f3965e;
        C3151e.m7753a(i == 3 || i == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.f3964d.mo18722b(j);
        }
        this.f3968h = j2;
        this.f3965e = 2;
        mo18700l();
        return this.f3968h;
    }

    /* renamed from: h */
    public C2748b mo18694e() {
        if (this.f3966f != 0) {
            return new C2748b();
        }
        return null;
    }

    /* renamed from: i */
    public final long mo18697i(long j, long j2, long j3) {
        long j4 = this.f3963c;
        long j5 = this.f3962b;
        long j6 = j + (((j2 * (j4 - j5)) / this.f3966f) - j3);
        if (j6 >= j5) {
            j5 = j6;
        }
        long j7 = this.f3963c;
        return j5 >= j7 ? j7 - 1 : j5;
    }

    /* renamed from: j */
    public long mo18698j(long j, C2675h hVar) {
        long j2 = 2;
        if (this.f3969i == this.f3970j) {
            return -(this.f3971k + 2);
        }
        long position = hVar.getPosition();
        if (!mo18702n(hVar, this.f3970j)) {
            long j3 = this.f3969i;
            if (j3 != position) {
                return j3;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f3961a.mo18717a(hVar, false);
        hVar.mo18527f();
        C2753f fVar = this.f3961a;
        long j4 = j - fVar.f3992c;
        int i = fVar.f3994e + fVar.f3995f;
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i2 < 0 || j4 > 72000) {
            if (i2 < 0) {
                this.f3970j = position;
                this.f3972l = this.f3961a.f3992c;
            } else {
                long j5 = (long) i;
                long position2 = hVar.getPosition() + j5;
                this.f3969i = position2;
                this.f3971k = this.f3961a.f3992c;
                if ((this.f3970j - position2) + j5 < 100000) {
                    hVar.mo18528g(i);
                    return -(this.f3971k + 2);
                }
            }
            long j6 = this.f3970j;
            long j7 = this.f3969i;
            if (j6 - j7 < 100000) {
                this.f3970j = j7;
                return j7;
            }
            long j8 = (long) i;
            if (i2 > 0) {
                j2 = 1;
            }
            long position3 = hVar.getPosition();
            long j9 = this.f3970j;
            long j10 = this.f3969i;
            return Math.min(Math.max((position3 - (j8 * j2)) + ((j4 * (j9 - j10)) / (this.f3972l - this.f3971k)), j10), this.f3970j - 1);
        }
        hVar.mo18528g(i);
        return -(this.f3961a.f3992c + 2);
    }

    /* renamed from: k */
    public long mo18699k(C2675h hVar) {
        mo18701m(hVar);
        this.f3961a.mo18718b();
        while ((this.f3961a.f3991b & 4) != 4 && hVar.getPosition() < this.f3963c) {
            this.f3961a.mo18717a(hVar, false);
            C2753f fVar = this.f3961a;
            hVar.mo18528g(fVar.f3994e + fVar.f3995f);
        }
        return this.f3961a.f3992c;
    }

    /* renamed from: l */
    public void mo18700l() {
        this.f3969i = this.f3962b;
        this.f3970j = this.f3963c;
        this.f3971k = 0;
        this.f3972l = this.f3966f;
    }

    /* renamed from: m */
    public void mo18701m(C2675h hVar) {
        if (!mo18702n(hVar, this.f3963c)) {
            throw new EOFException();
        }
    }

    /* renamed from: n */
    public boolean mo18702n(C2675h hVar, long j) {
        int i;
        long min = Math.min(j + 3, this.f3963c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (hVar.getPosition() + ((long) i2) <= min || (i2 = (int) (min - hVar.getPosition())) >= 4) {
                hVar.mo18523b(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        hVar.mo18528g(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            hVar.mo18528g(i);
        }
    }

    /* renamed from: o */
    public long mo18703o(C2675h hVar, long j, long j2) {
        this.f3961a.mo18717a(hVar, false);
        while (true) {
            C2753f fVar = this.f3961a;
            if (fVar.f3992c < j) {
                hVar.mo18528g(fVar.f3994e + fVar.f3995f);
                C2753f fVar2 = this.f3961a;
                long j3 = fVar2.f3992c;
                fVar2.mo18717a(hVar, false);
                j2 = j3;
            } else {
                hVar.mo18527f();
                return j2;
            }
        }
    }
}
