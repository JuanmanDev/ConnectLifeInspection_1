package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p224f0.C2661a;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.d0 */
/* compiled from: TsExtractor */
public final class C2777d0 implements C2674g {

    /* renamed from: s */
    public static final long f4063s = ((long) C3152e0.m7764D("AC-3"));

    /* renamed from: t */
    public static final long f4064t = ((long) C3152e0.m7764D("EAC3"));

    /* renamed from: u */
    public static final long f4065u = ((long) C3152e0.m7764D("HEVC"));

    /* renamed from: a */
    public final int f4066a;

    /* renamed from: b */
    public final List<C3146b0> f4067b;

    /* renamed from: c */
    public final C3173t f4068c;

    /* renamed from: d */
    public final SparseIntArray f4069d;

    /* renamed from: e */
    public final C2781e0.C2784c f4070e;

    /* renamed from: f */
    public final SparseArray<C2781e0> f4071f;

    /* renamed from: g */
    public final SparseBooleanArray f4072g;

    /* renamed from: h */
    public final SparseBooleanArray f4073h;

    /* renamed from: i */
    public final C2775c0 f4074i;

    /* renamed from: j */
    public C2772b0 f4075j;

    /* renamed from: k */
    public C2676i f4076k;

    /* renamed from: l */
    public int f4077l;

    /* renamed from: m */
    public boolean f4078m;

    /* renamed from: n */
    public boolean f4079n;

    /* renamed from: o */
    public boolean f4080o;

    /* renamed from: p */
    public C2781e0 f4081p;

    /* renamed from: q */
    public int f4082q;

    /* renamed from: r */
    public int f4083r;

    /* renamed from: c.q.a.b.f0.y.d0$a */
    /* compiled from: TsExtractor */
    public class C2778a implements C2814x {

        /* renamed from: a */
        public final C3172s f4084a = new C3172s(new byte[4]);

        public C2778a() {
        }

        /* renamed from: a */
        public void mo18738a(C3146b0 b0Var, C2676i iVar, C2781e0.C2785d dVar) {
        }

        /* renamed from: b */
        public void mo18739b(C3173t tVar) {
            if (tVar.mo20032y() == 0) {
                tVar.mo20007M(7);
                int a = tVar.mo20008a() / 4;
                for (int i = 0; i < a; i++) {
                    tVar.mo20014g(this.f4084a, 4);
                    int h = this.f4084a.mo19985h(16);
                    this.f4084a.mo19993p(3);
                    if (h == 0) {
                        this.f4084a.mo19993p(13);
                    } else {
                        int h2 = this.f4084a.mo19985h(13);
                        C2777d0.this.f4071f.put(h2, new C2815y(new C2779b(h2)));
                        C2777d0.m5741j(C2777d0.this);
                    }
                }
                if (C2777d0.this.f4066a != 2) {
                    C2777d0.this.f4071f.remove(0);
                }
            }
        }
    }

    /* renamed from: c.q.a.b.f0.y.d0$b */
    /* compiled from: TsExtractor */
    public class C2779b implements C2814x {

        /* renamed from: a */
        public final C3172s f4086a = new C3172s(new byte[5]);

        /* renamed from: b */
        public final SparseArray<C2781e0> f4087b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f4088c = new SparseIntArray();

        /* renamed from: d */
        public final int f4089d;

        public C2779b(int i) {
            this.f4089d = i;
        }

        /* renamed from: a */
        public void mo18738a(C3146b0 b0Var, C2676i iVar, C2781e0.C2785d dVar) {
        }

        /* renamed from: b */
        public void mo18739b(C3173t tVar) {
            C3146b0 b0Var;
            C2781e0 e0Var;
            C3173t tVar2 = tVar;
            if (tVar.mo20032y() == 2) {
                int i = 0;
                if (C2777d0.this.f4066a == 1 || C2777d0.this.f4066a == 2 || C2777d0.this.f4077l == 1) {
                    b0Var = (C3146b0) C2777d0.this.f4067b.get(0);
                } else {
                    b0Var = new C3146b0(((C3146b0) C2777d0.this.f4067b.get(0)).mo19945c());
                    C2777d0.this.f4067b.add(b0Var);
                }
                tVar2.mo20007M(2);
                int E = tVar.mo19999E();
                int i2 = 3;
                tVar2.mo20007M(3);
                tVar2.mo20014g(this.f4086a, 2);
                this.f4086a.mo19993p(3);
                int i3 = 13;
                int unused = C2777d0.this.f4083r = this.f4086a.mo19985h(13);
                tVar2.mo20014g(this.f4086a, 2);
                int i4 = 4;
                this.f4086a.mo19993p(4);
                tVar2.mo20007M(this.f4086a.mo19985h(12));
                if (C2777d0.this.f4066a == 2 && C2777d0.this.f4081p == null) {
                    C2781e0.C2783b bVar = new C2781e0.C2783b(21, (String) null, (List<C2781e0.C2782a>) null, C3152e0.f5824f);
                    C2777d0 d0Var = C2777d0.this;
                    C2781e0 unused2 = d0Var.f4081p = d0Var.f4070e.mo18759a(21, bVar);
                    C2777d0.this.f4081p.mo18756a(b0Var, C2777d0.this.f4076k, new C2781e0.C2785d(E, 21, 8192));
                }
                this.f4087b.clear();
                this.f4088c.clear();
                int a = tVar.mo20008a();
                while (a > 0) {
                    tVar2.mo20014g(this.f4086a, 5);
                    int h = this.f4086a.mo19985h(8);
                    this.f4086a.mo19993p(i2);
                    int h2 = this.f4086a.mo19985h(i3);
                    this.f4086a.mo19993p(i4);
                    int h3 = this.f4086a.mo19985h(12);
                    C2781e0.C2783b c = mo18755c(tVar2, h3);
                    if (h == 6) {
                        h = c.f4098a;
                    }
                    a -= h3 + 5;
                    int i5 = C2777d0.this.f4066a == 2 ? h : h2;
                    if (!C2777d0.this.f4072g.get(i5)) {
                        if (C2777d0.this.f4066a == 2 && h == 21) {
                            e0Var = C2777d0.this.f4081p;
                        } else {
                            e0Var = C2777d0.this.f4070e.mo18759a(h, c);
                        }
                        if (C2777d0.this.f4066a != 2 || h2 < this.f4088c.get(i5, 8192)) {
                            this.f4088c.put(i5, h2);
                            this.f4087b.put(i5, e0Var);
                        }
                    }
                    i2 = 3;
                    i4 = 4;
                    i3 = 13;
                }
                int size = this.f4088c.size();
                for (int i6 = 0; i6 < size; i6++) {
                    int keyAt = this.f4088c.keyAt(i6);
                    int valueAt = this.f4088c.valueAt(i6);
                    C2777d0.this.f4072g.put(keyAt, true);
                    C2777d0.this.f4073h.put(valueAt, true);
                    C2781e0 valueAt2 = this.f4087b.valueAt(i6);
                    if (valueAt2 != null) {
                        if (valueAt2 != C2777d0.this.f4081p) {
                            valueAt2.mo18756a(b0Var, C2777d0.this.f4076k, new C2781e0.C2785d(E, keyAt, 8192));
                        }
                        C2777d0.this.f4071f.put(valueAt, valueAt2);
                    }
                }
                if (C2777d0.this.f4066a != 2) {
                    C2777d0.this.f4071f.remove(this.f4089d);
                    C2777d0 d0Var2 = C2777d0.this;
                    if (d0Var2.f4066a != 1) {
                        i = C2777d0.this.f4077l - 1;
                    }
                    int unused3 = d0Var2.f4077l = i;
                    if (C2777d0.this.f4077l == 0) {
                        C2777d0.this.f4076k.mo18554o();
                        boolean unused4 = C2777d0.this.f4078m = true;
                    }
                } else if (!C2777d0.this.f4078m) {
                    C2777d0.this.f4076k.mo18554o();
                    int unused5 = C2777d0.this.f4077l = 0;
                    boolean unused6 = C2777d0.this.f4078m = true;
                }
            }
        }

        /* renamed from: c */
        public final C2781e0.C2783b mo18755c(C3173t tVar, int i) {
            int c = tVar.mo20010c();
            int i2 = i + c;
            String str = null;
            int i3 = -1;
            ArrayList arrayList = null;
            while (tVar.mo20010c() < i2) {
                int y = tVar.mo20032y();
                int c2 = tVar.mo20010c() + tVar.mo20032y();
                if (y == 5) {
                    long A = tVar.mo19995A();
                    if (A != C2777d0.f4063s) {
                        if (A != C2777d0.f4064t) {
                            if (A == C2777d0.f4065u) {
                                i3 = 36;
                            }
                            tVar.mo20007M(c2 - tVar.mo20010c());
                        }
                        i3 = 135;
                        tVar.mo20007M(c2 - tVar.mo20010c());
                    }
                } else if (y != 106) {
                    if (y != 122) {
                        if (y == 123) {
                            i3 = 138;
                        } else if (y == 10) {
                            str = tVar.mo20029v(3).trim();
                        } else if (y == 89) {
                            arrayList = new ArrayList();
                            while (tVar.mo20010c() < c2) {
                                String trim = tVar.mo20029v(3).trim();
                                int y2 = tVar.mo20032y();
                                byte[] bArr = new byte[4];
                                tVar.mo20015h(bArr, 0, 4);
                                arrayList.add(new C2781e0.C2782a(trim, y2, bArr));
                            }
                            i3 = 89;
                        }
                        tVar.mo20007M(c2 - tVar.mo20010c());
                    }
                    i3 = 135;
                    tVar.mo20007M(c2 - tVar.mo20010c());
                }
                i3 = 129;
                tVar.mo20007M(c2 - tVar.mo20010c());
            }
            tVar.mo20006L(i2);
            return new C2781e0.C2783b(i3, str, arrayList, Arrays.copyOfRange(tVar.f5877a, c, i2));
        }
    }

    static {
        C2776d dVar = C2776d.f4062a;
    }

    public C2777d0() {
        this(0);
    }

    /* renamed from: j */
    public static /* synthetic */ int m5741j(C2777d0 d0Var) {
        int i = d0Var.f4077l;
        d0Var.f4077l = i + 1;
        return i;
    }

    /* renamed from: y */
    public static /* synthetic */ C2674g[] m5754y() {
        return new C2674g[]{new C2777d0()};
    }

    /* renamed from: A */
    public final void mo18750A() {
        this.f4072g.clear();
        this.f4071f.clear();
        SparseArray<C2781e0> b = this.f4070e.mo18760b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f4071f.put(b.keyAt(i), b.valueAt(i));
        }
        this.f4071f.put(0, new C2815y(new C2778a()));
        this.f4081p = null;
    }

    /* renamed from: B */
    public final boolean mo18751B(int i) {
        if (this.f4066a == 2 || this.f4078m || !this.f4073h.get(i, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        boolean z;
        byte[] bArr = this.f4068c.f5877a;
        hVar.mo18531i(bArr, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                hVar.mo18528g(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        C2675h hVar2 = hVar;
        C2681n nVar2 = nVar;
        long e = hVar.mo18526e();
        C2781e0 e0Var = null;
        if (this.f4078m) {
            if (((e == -1 || this.f4066a == 2) ? false : true) && !this.f4074i.mo18744d()) {
                return this.f4074i.mo18745e(hVar2, nVar2, this.f4083r);
            }
            mo18754z(e);
            if (this.f4080o) {
                this.f4080o = false;
                mo18550g(0, 0);
                if (hVar.getPosition() != 0) {
                    nVar2.f3443a = 0;
                    return 1;
                }
            }
            C2772b0 b0Var = this.f4075j;
            if (b0Var != null && b0Var.mo18497d()) {
                return this.f4075j.mo18496c(hVar2, nVar2, (C2661a.C2664c) null);
            }
        }
        if (!mo18752w(hVar)) {
            return -1;
        }
        int x = mo18753x();
        int d = this.f4068c.mo20011d();
        if (x > d) {
            return 0;
        }
        int j = this.f4068c.mo20017j();
        if ((8388608 & j) != 0) {
            this.f4068c.mo20006L(x);
            return 0;
        }
        int i = ((4194304 & j) != 0 ? 1 : 0) | 0;
        int i2 = (2096896 & j) >> 8;
        boolean z = (j & 32) != 0;
        if ((j & 16) != 0) {
            e0Var = this.f4071f.get(i2);
        }
        if (e0Var == null) {
            this.f4068c.mo20006L(x);
            return 0;
        }
        if (this.f4066a != 2) {
            int i3 = j & 15;
            int i4 = this.f4069d.get(i2, i3 - 1);
            this.f4069d.put(i2, i3);
            if (i4 == i3) {
                this.f4068c.mo20006L(x);
                return 0;
            } else if (i3 != ((i4 + 1) & 15)) {
                e0Var.mo18758c();
            }
        }
        if (z) {
            int y = this.f4068c.mo20032y();
            i |= (this.f4068c.mo20032y() & 64) != 0 ? 2 : 0;
            this.f4068c.mo20007M(y - 1);
        }
        boolean z2 = this.f4078m;
        if (mo18751B(i2)) {
            this.f4068c.mo20005K(x);
            e0Var.mo18757b(this.f4068c, i);
            this.f4068c.mo20005K(d);
        }
        if (this.f4066a != 2 && !z2 && this.f4078m && e != -1) {
            this.f4080o = true;
        }
        this.f4068c.mo20006L(x);
        return 0;
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f4076k = iVar;
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        C2772b0 b0Var;
        C3151e.m7759g(this.f4066a != 2);
        int size = this.f4067b.size();
        for (int i = 0; i < size; i++) {
            C3146b0 b0Var2 = this.f4067b.get(i);
            if ((b0Var2.mo19947e() == -9223372036854775807L) || !(b0Var2.mo19947e() == 0 || b0Var2.mo19945c() == j2)) {
                b0Var2.mo19948g();
                b0Var2.mo19949h(j2);
            }
        }
        if (!(j2 == 0 || (b0Var = this.f4075j) == null)) {
            b0Var.mo18501h(j2);
        }
        this.f4068c.mo20001G();
        this.f4069d.clear();
        for (int i2 = 0; i2 < this.f4071f.size(); i2++) {
            this.f4071f.valueAt(i2).mo18758c();
        }
        this.f4082q = 0;
    }

    public void release() {
    }

    /* renamed from: w */
    public final boolean mo18752w(C2675h hVar) {
        C3173t tVar = this.f4068c;
        byte[] bArr = tVar.f5877a;
        if (9400 - tVar.mo20010c() < 188) {
            int a = this.f4068c.mo20008a();
            if (a > 0) {
                System.arraycopy(bArr, this.f4068c.mo20010c(), bArr, 0, a);
            }
            this.f4068c.mo20004J(bArr, a);
        }
        while (this.f4068c.mo20008a() < 188) {
            int d = this.f4068c.mo20011d();
            int read = hVar.read(bArr, d, 9400 - d);
            if (read == -1) {
                return false;
            }
            this.f4068c.mo20005K(d + read);
        }
        return true;
    }

    /* renamed from: x */
    public final int mo18753x() {
        int c = this.f4068c.mo20010c();
        int d = this.f4068c.mo20011d();
        int a = C2787f0.m5791a(this.f4068c.f5877a, c, d);
        this.f4068c.mo20006L(a);
        int i = a + 188;
        if (i > d) {
            int i2 = this.f4082q + (a - c);
            this.f4082q = i2;
            if (this.f4066a == 2 && i2 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f4082q = 0;
        }
        return i;
    }

    /* renamed from: z */
    public final void mo18754z(long j) {
        if (!this.f4079n) {
            this.f4079n = true;
            if (this.f4074i.mo18742b() != -9223372036854775807L) {
                C2772b0 b0Var = new C2772b0(this.f4074i.mo18743c(), this.f4074i.mo18742b(), j, this.f4083r);
                this.f4075j = b0Var;
                this.f4076k.mo18553c(b0Var.mo18495b());
                return;
            }
            this.f4076k.mo18553c(new C2682o.C2684b(this.f4074i.mo18742b()));
        }
    }

    public C2777d0(int i) {
        this(1, i);
    }

    public C2777d0(int i, int i2) {
        this(i, new C3146b0(0), new C2791i(i2));
    }

    public C2777d0(int i, C3146b0 b0Var, C2781e0.C2784c cVar) {
        C3151e.m7757e(cVar);
        this.f4070e = cVar;
        this.f4066a = i;
        if (i == 1 || i == 2) {
            this.f4067b = Collections.singletonList(b0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f4067b = arrayList;
            arrayList.add(b0Var);
        }
        this.f4068c = new C3173t(new byte[9400], 0);
        this.f4072g = new SparseBooleanArray();
        this.f4073h = new SparseBooleanArray();
        this.f4071f = new SparseArray<>();
        this.f4069d = new SparseIntArray();
        this.f4074i = new C2775c0();
        this.f4083r = -1;
        mo18750A();
    }
}
