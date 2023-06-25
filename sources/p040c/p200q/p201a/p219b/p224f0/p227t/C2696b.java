package p040c.p200q.p201a.p219b.p224f0.p227t;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.f0.t.b */
/* compiled from: DefaultEbmlReader */
public final class C2696b implements C2699c {

    /* renamed from: a */
    public final byte[] f3504a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque<C2698b> f3505b = new ArrayDeque<>();

    /* renamed from: c */
    public final C2707g f3506c = new C2707g();

    /* renamed from: d */
    public C2700d f3507d;

    /* renamed from: e */
    public int f3508e;

    /* renamed from: f */
    public int f3509f;

    /* renamed from: g */
    public long f3510g;

    /* renamed from: c.q.a.b.f0.t.b$b */
    /* compiled from: DefaultEbmlReader */
    public static final class C2698b {

        /* renamed from: a */
        public final int f3511a;

        /* renamed from: b */
        public final long f3512b;

        public C2698b(int i, long j) {
            this.f3511a = i;
            this.f3512b = j;
        }
    }

    /* renamed from: a */
    public void mo18589a() {
        this.f3508e = 0;
        this.f3505b.clear();
        this.f3506c.mo18633e();
    }

    /* renamed from: b */
    public boolean mo18590b(C2675h hVar) {
        C3151e.m7759g(this.f3507d != null);
        while (true) {
            if (this.f3505b.isEmpty() || hVar.getPosition() < this.f3505b.peek().f3512b) {
                if (this.f3508e == 0) {
                    long d = this.f3506c.mo18632d(hVar, true, false, 4);
                    if (d == -2) {
                        d = mo18592d(hVar);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f3509f = (int) d;
                    this.f3508e = 1;
                }
                if (this.f3508e == 1) {
                    this.f3510g = this.f3506c.mo18632d(hVar, false, true, 8);
                    this.f3508e = 2;
                }
                int b = this.f3507d.mo18597b(this.f3509f);
                if (b == 0) {
                    hVar.mo18528g((int) this.f3510g);
                    this.f3508e = 0;
                } else if (b == 1) {
                    long position = hVar.getPosition();
                    this.f3505b.push(new C2698b(this.f3509f, this.f3510g + position));
                    this.f3507d.mo18602g(this.f3509f, position, this.f3510g);
                    this.f3508e = 0;
                    return true;
                } else if (b == 2) {
                    long j = this.f3510g;
                    if (j <= 8) {
                        this.f3507d.mo18603h(this.f3509f, mo18594f(hVar, (int) j));
                        this.f3508e = 0;
                        return true;
                    }
                    throw new ParserException("Invalid integer size: " + this.f3510g);
                } else if (b == 3) {
                    long j2 = this.f3510g;
                    if (j2 <= 2147483647L) {
                        this.f3507d.mo18600e(this.f3509f, mo18595g(hVar, (int) j2));
                        this.f3508e = 0;
                        return true;
                    }
                    throw new ParserException("String element size: " + this.f3510g);
                } else if (b == 4) {
                    this.f3507d.mo18599d(this.f3509f, (int) this.f3510g, hVar);
                    this.f3508e = 0;
                    return true;
                } else if (b == 5) {
                    long j3 = this.f3510g;
                    if (j3 == 4 || j3 == 8) {
                        this.f3507d.mo18601f(this.f3509f, mo18593e(hVar, (int) this.f3510g));
                        this.f3508e = 0;
                        return true;
                    }
                    throw new ParserException("Invalid float size: " + this.f3510g);
                } else {
                    throw new ParserException("Invalid element type " + b);
                }
            } else {
                this.f3507d.mo18596a(this.f3505b.pop().f3511a);
                return true;
            }
        }
    }

    /* renamed from: c */
    public void mo18591c(C2700d dVar) {
        this.f3507d = dVar;
    }

    /* renamed from: d */
    public final long mo18592d(C2675h hVar) {
        hVar.mo18527f();
        while (true) {
            hVar.mo18531i(this.f3504a, 0, 4);
            int c = C2707g.m5419c(this.f3504a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) C2707g.m5418a(this.f3504a, c, false);
                if (this.f3507d.mo18598c(a)) {
                    hVar.mo18528g(c);
                    return (long) a;
                }
            }
            hVar.mo18528g(1);
        }
    }

    /* renamed from: e */
    public final double mo18593e(C2675h hVar, int i) {
        long f = mo18594f(hVar, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) f);
        }
        return Double.longBitsToDouble(f);
    }

    /* renamed from: f */
    public final long mo18594f(C2675h hVar, int i) {
        hVar.readFully(this.f3504a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f3504a[i2] & 255));
        }
        return j;
    }

    /* renamed from: g */
    public final String mo18595g(C2675h hVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        hVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }
}
