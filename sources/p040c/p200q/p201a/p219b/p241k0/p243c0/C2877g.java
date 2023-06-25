package p040c.p200q.p201a.p219b.p241k0.p243c0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.C3024x;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p241k0.C3028z;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2880h;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.k0.c0.g */
/* compiled from: ChunkSampleStream */
public class C2877g<T extends C2880h> implements C3027y, C3028z, Loader.C4057b<C2872d>, Loader.C4061f {
    @Nullable

    /* renamed from: A */
    public C2879b<T> f4579A;

    /* renamed from: B */
    public long f4580B;

    /* renamed from: C */
    public long f4581C;

    /* renamed from: D */
    public int f4582D;

    /* renamed from: E */
    public long f4583E;

    /* renamed from: F */
    public boolean f4584F;

    /* renamed from: e */
    public final int f4585e;

    /* renamed from: l */
    public final int[] f4586l;

    /* renamed from: m */
    public final Format[] f4587m;

    /* renamed from: n */
    public final boolean[] f4588n;

    /* renamed from: o */
    public final T f4589o;

    /* renamed from: p */
    public final C3028z.C3029a<C2877g<T>> f4590p;

    /* renamed from: q */
    public final C3017v.C3018a f4591q;

    /* renamed from: r */
    public final C3135r f4592r;

    /* renamed from: s */
    public final Loader f4593s = new Loader("Loader:ChunkSampleStream");

    /* renamed from: t */
    public final C2876f f4594t = new C2876f();

    /* renamed from: u */
    public final ArrayList<C2869a> f4595u;

    /* renamed from: v */
    public final List<C2869a> f4596v;

    /* renamed from: w */
    public final C3024x f4597w;

    /* renamed from: x */
    public final C3024x[] f4598x;

    /* renamed from: y */
    public final C2871c f4599y;

    /* renamed from: z */
    public Format f4600z;

    /* renamed from: c.q.a.b.k0.c0.g$a */
    /* compiled from: ChunkSampleStream */
    public final class C2878a implements C3027y {

        /* renamed from: e */
        public final C2877g<T> f4601e;

        /* renamed from: l */
        public final C3024x f4602l;

        /* renamed from: m */
        public final int f4603m;

        /* renamed from: n */
        public boolean f4604n;

        public C2878a(C2877g<T> gVar, C3024x xVar, int i) {
            this.f4601e = gVar;
            this.f4602l = xVar;
            this.f4603m = i;
        }

        /* renamed from: a */
        public void mo19097a() {
        }

        /* renamed from: b */
        public final void mo19112b() {
            if (!this.f4604n) {
                C2877g.this.f4591q.mo19525c(C2877g.this.f4586l[this.f4603m], C2877g.this.f4587m[this.f4603m], 0, (Object) null, C2877g.this.f4581C);
                this.f4604n = true;
            }
        }

        /* renamed from: c */
        public boolean mo19099c() {
            C2877g gVar = C2877g.this;
            return gVar.f4584F || (!gVar.mo19086F() && this.f4602l.mo19602u());
        }

        /* renamed from: d */
        public void mo19113d() {
            C3151e.m7759g(C2877g.this.f4588n[this.f4603m]);
            C2877g.this.f4588n[this.f4603m] = false;
        }

        /* renamed from: i */
        public int mo19105i(C3030l lVar, C2634e eVar, boolean z) {
            if (C2877g.this.mo19086F()) {
                return -3;
            }
            mo19112b();
            C3024x xVar = this.f4602l;
            C2877g gVar = C2877g.this;
            return xVar.mo19607z(lVar, eVar, z, gVar.f4584F, gVar.f4583E);
        }

        /* renamed from: o */
        public int mo19108o(long j) {
            if (C2877g.this.mo19086F()) {
                return 0;
            }
            mo19112b();
            if (C2877g.this.f4584F && j > this.f4602l.mo19598q()) {
                return this.f4602l.mo19589g();
            }
            int f = this.f4602l.mo19588f(j, true, true);
            if (f == -1) {
                return 0;
            }
            return f;
        }
    }

    /* renamed from: c.q.a.b.k0.c0.g$b */
    /* compiled from: ChunkSampleStream */
    public interface C2879b<T extends C2880h> {
        /* renamed from: c */
        void mo19114c(C2877g<T> gVar);
    }

    public C2877g(int i, int[] iArr, Format[] formatArr, T t, C3028z.C3029a<C2877g<T>> aVar, C3117d dVar, long j, C3135r rVar, C3017v.C3018a aVar2) {
        int i2;
        this.f4585e = i;
        this.f4586l = iArr;
        this.f4587m = formatArr;
        this.f4589o = t;
        this.f4590p = aVar;
        this.f4591q = aVar2;
        this.f4592r = rVar;
        ArrayList<C2869a> arrayList = new ArrayList<>();
        this.f4595u = arrayList;
        this.f4596v = Collections.unmodifiableList(arrayList);
        int i3 = 0;
        if (iArr == null) {
            i2 = 0;
        } else {
            i2 = iArr.length;
        }
        this.f4598x = new C3024x[i2];
        this.f4588n = new boolean[i2];
        int i4 = i2 + 1;
        int[] iArr2 = new int[i4];
        C3024x[] xVarArr = new C3024x[i4];
        C3024x xVar = new C3024x(dVar);
        this.f4597w = xVar;
        iArr2[0] = i;
        xVarArr[0] = xVar;
        while (i3 < i2) {
            C3024x xVar2 = new C3024x(dVar);
            this.f4598x[i3] = xVar2;
            int i5 = i3 + 1;
            xVarArr[i5] = xVar2;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.f4599y = new C2871c(iArr2, xVarArr);
        this.f4580B = j;
        this.f4581C = j;
    }

    /* renamed from: A */
    public final C2869a mo19081A(int i) {
        C2869a aVar = this.f4595u.get(i);
        ArrayList<C2869a> arrayList = this.f4595u;
        C3152e0.m7788a0(arrayList, i, arrayList.size());
        this.f4582D = Math.max(this.f4582D, this.f4595u.size());
        int i2 = 0;
        this.f4597w.mo19595m(aVar.mo19066h(0));
        while (true) {
            C3024x[] xVarArr = this.f4598x;
            if (i2 >= xVarArr.length) {
                return aVar;
            }
            C3024x xVar = xVarArr[i2];
            i2++;
            xVar.mo19595m(aVar.mo19066h(i2));
        }
    }

    /* renamed from: B */
    public T mo19082B() {
        return this.f4589o;
    }

    /* renamed from: C */
    public final C2869a mo19083C() {
        ArrayList<C2869a> arrayList = this.f4595u;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: D */
    public final boolean mo19084D(int i) {
        int r;
        C2869a aVar = this.f4595u.get(i);
        if (this.f4597w.mo19599r() > aVar.mo19066h(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C3024x[] xVarArr = this.f4598x;
            if (i2 >= xVarArr.length) {
                return false;
            }
            r = xVarArr[i2].mo19599r();
            i2++;
        } while (r <= aVar.mo19066h(i2));
        return true;
    }

    /* renamed from: E */
    public final boolean mo19085E(C2872d dVar) {
        return dVar instanceof C2869a;
    }

    /* renamed from: F */
    public boolean mo19086F() {
        return this.f4580B != -9223372036854775807L;
    }

    /* renamed from: G */
    public final void mo19087G() {
        int L = mo19092L(this.f4597w.mo19599r(), this.f4582D - 1);
        while (true) {
            int i = this.f4582D;
            if (i <= L) {
                this.f4582D = i + 1;
                mo19088H(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    public final void mo19088H(int i) {
        C2869a aVar = this.f4595u.get(i);
        Format format = aVar.f4555c;
        if (!format.equals(this.f4600z)) {
            this.f4591q.mo19525c(this.f4585e, format, aVar.f4556d, aVar.f4557e, aVar.f4558f);
        }
        this.f4600z = format;
    }

    /* renamed from: I */
    public void mo19106k(C2872d dVar, long j, long j2, boolean z) {
        C2872d dVar2 = dVar;
        this.f4591q.mo19537o(dVar2.f4553a, dVar.mo19075e(), dVar.mo19074d(), dVar2.f4554b, this.f4585e, dVar2.f4555c, dVar2.f4556d, dVar2.f4557e, dVar2.f4558f, dVar2.f4559g, j, j2, dVar.mo19072b());
        if (!z) {
            this.f4597w.mo19579D();
            for (C3024x D : this.f4598x) {
                D.mo19579D();
            }
            this.f4590p.mo18995i(this);
        }
    }

    /* renamed from: J */
    public void mo19107l(C2872d dVar, long j, long j2) {
        C2872d dVar2 = dVar;
        this.f4589o.mo19119g(dVar2);
        this.f4591q.mo19540r(dVar2.f4553a, dVar.mo19075e(), dVar.mo19074d(), dVar2.f4554b, this.f4585e, dVar2.f4555c, dVar2.f4556d, dVar2.f4557e, dVar2.f4558f, dVar2.f4559g, j, j2, dVar.mo19072b());
        this.f4590p.mo18995i(this);
    }

    /* renamed from: K */
    public Loader.C4058c mo19109s(C2872d dVar, long j, long j2, IOException iOException, int i) {
        C2872d dVar2 = dVar;
        long b = dVar.mo19072b();
        boolean E = mo19085E(dVar);
        int size = this.f4595u.size() - 1;
        boolean z = b == 0 || !E || !mo19084D(size);
        Loader.C4058c cVar = null;
        if (this.f4589o.mo19116c(dVar, z, iOException, z ? this.f4592r.mo19923b(dVar2.f4554b, j2, iOException, i) : -9223372036854775807L)) {
            if (z) {
                cVar = Loader.f7921e;
                if (E) {
                    C3151e.m7759g(mo19081A(size) == dVar2);
                    if (this.f4595u.isEmpty()) {
                        this.f4580B = this.f4581C;
                    }
                }
            } else {
                C3163m.m7880f("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (cVar == null) {
            long a = this.f4592r.mo19922a(dVar2.f4554b, j2, iOException, i);
            cVar = a != -9223372036854775807L ? Loader.m10672g(false, a) : Loader.f7922f;
        }
        Loader.C4058c cVar2 = cVar;
        boolean z2 = !cVar2.mo24277c();
        this.f4591q.mo19543u(dVar2.f4553a, dVar.mo19075e(), dVar.mo19074d(), dVar2.f4554b, this.f4585e, dVar2.f4555c, dVar2.f4556d, dVar2.f4557e, dVar2.f4558f, dVar2.f4559g, j, j2, b, iOException, z2);
        if (z2) {
            this.f4590p.mo18995i(this);
        }
        return cVar2;
    }

    /* renamed from: L */
    public final int mo19092L(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f4595u.size()) {
                return this.f4595u.size() - 1;
            }
        } while (this.f4595u.get(i2).mo19066h(0) <= i);
        return i2 - 1;
    }

    /* renamed from: M */
    public void mo19093M() {
        mo19094N((C2879b) null);
    }

    /* renamed from: N */
    public void mo19094N(@Nullable C2879b<T> bVar) {
        this.f4579A = bVar;
        this.f4597w.mo19593k();
        for (C3024x k : this.f4598x) {
            k.mo19593k();
        }
        this.f4593s.mo24275k(this);
    }

    /* renamed from: O */
    public void mo19095O(long j) {
        boolean z;
        this.f4581C = j;
        if (mo19086F()) {
            this.f4580B = j;
            return;
        }
        C2869a aVar = null;
        int i = 0;
        while (true) {
            if (i >= this.f4595u.size()) {
                break;
            }
            C2869a aVar2 = this.f4595u.get(i);
            int i2 = (aVar2.f4558f > j ? 1 : (aVar2.f4558f == j ? 0 : -1));
            if (i2 == 0 && aVar2.f4547j == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i2 > 0) {
                break;
            } else {
                i++;
            }
        }
        this.f4597w.mo19581F();
        if (aVar != null) {
            z = this.f4597w.mo19582G(aVar.mo19066h(0));
            this.f4583E = 0;
        } else {
            z = this.f4597w.mo19588f(j, true, (j > mo19098b() ? 1 : (j == mo19098b() ? 0 : -1)) < 0) != -1;
            this.f4583E = this.f4581C;
        }
        if (z) {
            this.f4582D = mo19092L(this.f4597w.mo19599r(), 0);
            for (C3024x xVar : this.f4598x) {
                xVar.mo19581F();
                xVar.mo19588f(j, true, false);
            }
            return;
        }
        this.f4580B = j;
        this.f4584F = false;
        this.f4595u.clear();
        this.f4582D = 0;
        if (this.f4593s.mo24272h()) {
            this.f4593s.mo24271f();
            return;
        }
        this.f4597w.mo19579D();
        for (C3024x D : this.f4598x) {
            D.mo19579D();
        }
    }

    /* renamed from: P */
    public C2877g<T>.a mo19096P(long j, int i) {
        for (int i2 = 0; i2 < this.f4598x.length; i2++) {
            if (this.f4586l[i2] == i) {
                C3151e.m7759g(!this.f4588n[i2]);
                this.f4588n[i2] = true;
                this.f4598x[i2].mo19581F();
                this.f4598x[i2].mo19588f(j, true, true);
                return new C2878a(this, this.f4598x[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void mo19097a() {
        this.f4593s.mo19182a();
        if (!this.f4593s.mo24272h()) {
            this.f4589o.mo19115a();
        }
    }

    /* renamed from: b */
    public long mo19098b() {
        if (mo19086F()) {
            return this.f4580B;
        }
        if (this.f4584F) {
            return Long.MIN_VALUE;
        }
        return mo19083C().f4559g;
    }

    /* renamed from: c */
    public boolean mo19099c() {
        return this.f4584F || (!mo19086F() && this.f4597w.mo19602u());
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        long j2;
        List<C2869a> list;
        long j3;
        boolean z = false;
        if (this.f4584F || this.f4593s.mo24272h()) {
            return false;
        }
        boolean F = mo19086F();
        if (F) {
            list = Collections.emptyList();
            j2 = this.f4580B;
        } else {
            list = this.f4596v;
            j2 = mo19083C().f4559g;
        }
        this.f4589o.mo19120h(j, j2, list, this.f4594t);
        C2876f fVar = this.f4594t;
        boolean z2 = fVar.f4578b;
        C2872d dVar = fVar.f4577a;
        fVar.mo19080a();
        if (z2) {
            this.f4580B = -9223372036854775807L;
            this.f4584F = true;
            return true;
        } else if (dVar == null) {
            return false;
        } else {
            if (mo19085E(dVar)) {
                C2869a aVar = (C2869a) dVar;
                if (F) {
                    if (aVar.f4558f == this.f4580B) {
                        z = true;
                    }
                    if (z) {
                        j3 = 0;
                    } else {
                        j3 = this.f4580B;
                    }
                    this.f4583E = j3;
                    this.f4580B = -9223372036854775807L;
                }
                aVar.mo19068j(this.f4599y);
                this.f4595u.add(aVar);
            }
            this.f4591q.mo19546x(dVar.f4553a, dVar.f4554b, this.f4585e, dVar.f4555c, dVar.f4556d, dVar.f4557e, dVar.f4558f, dVar.f4559g, this.f4593s.mo24276l(dVar, this, this.f4592r.mo19924c(dVar.f4554b)));
            return true;
        }
    }

    /* renamed from: e */
    public long mo19101e(long j, C3216y yVar) {
        return this.f4589o.mo19117e(j, yVar);
    }

    /* renamed from: f */
    public long mo19102f() {
        if (this.f4584F) {
            return Long.MIN_VALUE;
        }
        if (mo19086F()) {
            return this.f4580B;
        }
        long j = this.f4581C;
        C2869a C = mo19083C();
        if (!C.mo19123g()) {
            if (this.f4595u.size() > 1) {
                ArrayList<C2869a> arrayList = this.f4595u;
                C = arrayList.get(arrayList.size() - 2);
            } else {
                C = null;
            }
        }
        if (C != null) {
            j = Math.max(j, C.f4559g);
        }
        return Math.max(j, this.f4597w.mo19598q());
    }

    /* renamed from: g */
    public void mo19103g(long j) {
        int size;
        int f;
        if (!this.f4593s.mo24272h() && !mo19086F() && (size = this.f4595u.size()) > (f = this.f4589o.mo19118f(j, this.f4596v))) {
            while (true) {
                if (f >= size) {
                    f = size;
                    break;
                } else if (!mo19084D(f)) {
                    break;
                } else {
                    f++;
                }
            }
            if (f != size) {
                long j2 = mo19083C().f4559g;
                C2869a A = mo19081A(f);
                if (this.f4595u.isEmpty()) {
                    this.f4580B = this.f4581C;
                }
                this.f4584F = false;
                this.f4591q.mo19520E(this.f4585e, A.f4558f, j2);
            }
        }
    }

    /* renamed from: h */
    public void mo19104h() {
        this.f4597w.mo19579D();
        for (C3024x D : this.f4598x) {
            D.mo19579D();
        }
        C2879b<T> bVar = this.f4579A;
        if (bVar != null) {
            bVar.mo19114c(this);
        }
    }

    /* renamed from: i */
    public int mo19105i(C3030l lVar, C2634e eVar, boolean z) {
        if (mo19086F()) {
            return -3;
        }
        mo19087G();
        return this.f4597w.mo19607z(lVar, eVar, z, this.f4584F, this.f4583E);
    }

    /* renamed from: o */
    public int mo19108o(long j) {
        int i = 0;
        if (mo19086F()) {
            return 0;
        }
        if (!this.f4584F || j <= this.f4597w.mo19598q()) {
            int f = this.f4597w.mo19588f(j, true, true);
            if (f != -1) {
                i = f;
            }
        } else {
            i = this.f4597w.mo19589g();
        }
        mo19087G();
        return i;
    }

    /* renamed from: t */
    public void mo19110t(long j, boolean z) {
        if (!mo19086F()) {
            int o = this.f4597w.mo19596o();
            this.f4597w.mo19592j(j, z, true);
            int o2 = this.f4597w.mo19596o();
            if (o2 > o) {
                long p = this.f4597w.mo19597p();
                int i = 0;
                while (true) {
                    C3024x[] xVarArr = this.f4598x;
                    if (i >= xVarArr.length) {
                        break;
                    }
                    xVarArr[i].mo19592j(p, z, this.f4588n[i]);
                    i++;
                }
            }
            mo19111z(o2);
        }
    }

    /* renamed from: z */
    public final void mo19111z(int i) {
        int min = Math.min(mo19092L(i, 0), this.f4582D);
        if (min > 0) {
            C3152e0.m7788a0(this.f4595u, 0, min);
            this.f4582D -= min;
        }
    }
}
