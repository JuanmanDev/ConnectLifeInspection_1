package p040c.p200q.p201a.p219b.p241k0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p222d0.C2629b;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p241k0.C3022w;
import p040c.p200q.p201a.p219b.p260n0.C3116c;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.k0.x */
/* compiled from: SampleQueue */
public class C3024x implements C2686q {

    /* renamed from: a */
    public final C3117d f5313a;

    /* renamed from: b */
    public final int f5314b;

    /* renamed from: c */
    public final C3022w f5315c = new C3022w();

    /* renamed from: d */
    public final C3022w.C3023a f5316d = new C3022w.C3023a();

    /* renamed from: e */
    public final C3173t f5317e = new C3173t(32);

    /* renamed from: f */
    public C3025a f5318f;

    /* renamed from: g */
    public C3025a f5319g;

    /* renamed from: h */
    public C3025a f5320h;

    /* renamed from: i */
    public Format f5321i;

    /* renamed from: j */
    public boolean f5322j;

    /* renamed from: k */
    public Format f5323k;

    /* renamed from: l */
    public long f5324l;

    /* renamed from: m */
    public long f5325m;

    /* renamed from: n */
    public boolean f5326n;

    /* renamed from: o */
    public C3026b f5327o;

    /* renamed from: c.q.a.b.k0.x$a */
    /* compiled from: SampleQueue */
    public static final class C3025a {

        /* renamed from: a */
        public final long f5328a;

        /* renamed from: b */
        public final long f5329b;

        /* renamed from: c */
        public boolean f5330c;
        @Nullable

        /* renamed from: d */
        public C3116c f5331d;
        @Nullable

        /* renamed from: e */
        public C3025a f5332e;

        public C3025a(long j, int i) {
            this.f5328a = j;
            this.f5329b = j + ((long) i);
        }

        /* renamed from: a */
        public C3025a mo19608a() {
            this.f5331d = null;
            C3025a aVar = this.f5332e;
            this.f5332e = null;
            return aVar;
        }

        /* renamed from: b */
        public void mo19609b(C3116c cVar, C3025a aVar) {
            this.f5331d = cVar;
            this.f5332e = aVar;
            this.f5330c = true;
        }

        /* renamed from: c */
        public int mo19610c(long j) {
            return ((int) (j - this.f5328a)) + this.f5331d.f5706b;
        }
    }

    /* renamed from: c.q.a.b.k0.x$b */
    /* compiled from: SampleQueue */
    public interface C3026b {
        /* renamed from: i */
        void mo19384i(Format format);
    }

    public C3024x(C3117d dVar) {
        this.f5313a = dVar;
        this.f5314b = dVar.mo19875e();
        C3025a aVar = new C3025a(0, this.f5314b);
        this.f5318f = aVar;
        this.f5319g = aVar;
        this.f5320h = aVar;
    }

    /* renamed from: n */
    public static Format m7110n(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j == 0) {
            return format;
        }
        long j2 = format.f7570u;
        return j2 != Long.MAX_VALUE ? format.mo23922h(j2 + j) : format;
    }

    /* renamed from: A */
    public final void mo19576A(long j, ByteBuffer byteBuffer, int i) {
        mo19587e(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f5319g.f5329b - j));
            C3025a aVar = this.f5319g;
            byteBuffer.put(aVar.f5331d.f5705a, aVar.mo19610c(j), min);
            i -= min;
            j += (long) min;
            C3025a aVar2 = this.f5319g;
            if (j == aVar2.f5329b) {
                this.f5319g = aVar2.f5332e;
            }
        }
    }

    /* renamed from: B */
    public final void mo19577B(long j, byte[] bArr, int i) {
        mo19587e(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f5319g.f5329b - j));
            C3025a aVar = this.f5319g;
            System.arraycopy(aVar.f5331d.f5705a, aVar.mo19610c(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            C3025a aVar2 = this.f5319g;
            if (j == aVar2.f5329b) {
                this.f5319g = aVar2.f5332e;
            }
        }
    }

    /* renamed from: C */
    public final void mo19578C(C2634e eVar, C3022w.C3023a aVar) {
        C2634e eVar2 = eVar;
        C3022w.C3023a aVar2 = aVar;
        long j = aVar2.f5311b;
        int i = 1;
        this.f5317e.mo20002H(1);
        mo19577B(j, this.f5317e.f5877a, 1);
        long j2 = j + 1;
        byte b = this.f5317e.f5877a[0];
        boolean z = (b & ByteCompanionObject.MIN_VALUE) != 0;
        byte b2 = b & ByteCompanionObject.MAX_VALUE;
        C2629b bVar = eVar2.f3306l;
        if (bVar.f3285a == null) {
            bVar.f3285a = new byte[16];
        }
        mo19577B(j2, eVar2.f3306l.f3285a, b2);
        long j3 = j2 + ((long) b2);
        if (z) {
            this.f5317e.mo20002H(2);
            mo19577B(j3, this.f5317e.f5877a, 2);
            j3 += 2;
            i = this.f5317e.mo19999E();
        }
        int i2 = i;
        int[] iArr = eVar2.f3306l.f3288d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = eVar2.f3306l.f3289e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            this.f5317e.mo20002H(i3);
            mo19577B(j3, this.f5317e.f5877a, i3);
            j3 += (long) i3;
            this.f5317e.mo20006L(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = this.f5317e.mo19999E();
                iArr4[i4] = this.f5317e.mo19997C();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f5310a - ((int) (j3 - aVar2.f5311b));
        }
        C2686q.C2687a aVar3 = aVar2.f5312c;
        C2629b bVar2 = eVar2.f3306l;
        bVar2.mo18395c(i2, iArr2, iArr4, aVar3.f3452b, bVar2.f3285a, aVar3.f3451a, aVar3.f3453c, aVar3.f3454d);
        long j4 = aVar2.f5311b;
        int i5 = (int) (j3 - j4);
        aVar2.f5311b = j4 + ((long) i5);
        aVar2.f5310a -= i5;
    }

    /* renamed from: D */
    public void mo19579D() {
        mo19580E(false);
    }

    /* renamed from: E */
    public void mo19580E(boolean z) {
        this.f5315c.mo19573x(z);
        mo19590h(this.f5318f);
        C3025a aVar = new C3025a(0, this.f5314b);
        this.f5318f = aVar;
        this.f5319g = aVar;
        this.f5320h = aVar;
        this.f5325m = 0;
        this.f5313a.mo19873c();
    }

    /* renamed from: F */
    public void mo19581F() {
        this.f5315c.mo19574y();
        this.f5319g = this.f5318f;
    }

    /* renamed from: G */
    public boolean mo19582G(int i) {
        return this.f5315c.mo19575z(i);
    }

    /* renamed from: H */
    public void mo19583H(long j) {
        if (this.f5324l != j) {
            this.f5324l = j;
            this.f5322j = true;
        }
    }

    /* renamed from: I */
    public void mo19584I(C3026b bVar) {
        this.f5327o = bVar;
    }

    /* renamed from: J */
    public void mo19585J(int i) {
        this.f5315c.mo19549A(i);
    }

    /* renamed from: K */
    public void mo19586K() {
        this.f5326n = true;
    }

    /* renamed from: a */
    public int mo18543a(C2675h hVar, int i, boolean z) {
        int y = mo19606y(i);
        C3025a aVar = this.f5320h;
        int read = hVar.read(aVar.f5331d.f5705a, aVar.mo19610c(this.f5325m), y);
        if (read != -1) {
            mo19605x(read);
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public void mo18544b(C3173t tVar, int i) {
        while (i > 0) {
            int y = mo19606y(i);
            C3025a aVar = this.f5320h;
            tVar.mo20015h(aVar.f5331d.f5705a, aVar.mo19610c(this.f5325m), y);
            i -= y;
            mo19605x(y);
        }
    }

    /* renamed from: c */
    public void mo18545c(long j, int i, int i2, int i3, @Nullable C2686q.C2687a aVar) {
        if (this.f5322j) {
            mo18546d(this.f5323k);
        }
        long j2 = j + this.f5324l;
        if (this.f5326n) {
            if ((i & 1) != 0 && this.f5315c.mo19552c(j2)) {
                this.f5326n = false;
            } else {
                return;
            }
        }
        int i4 = i2;
        this.f5315c.mo19553d(j2, i, (this.f5325m - ((long) i4)) - ((long) i3), i4, aVar);
    }

    /* renamed from: d */
    public void mo18546d(Format format) {
        Format n = m7110n(format, this.f5324l);
        boolean k = this.f5315c.mo19560k(n);
        this.f5323k = format;
        this.f5322j = false;
        C3026b bVar = this.f5327o;
        if (bVar != null && k) {
            bVar.mo19384i(n);
        }
    }

    /* renamed from: e */
    public final void mo19587e(long j) {
        while (true) {
            C3025a aVar = this.f5319g;
            if (j >= aVar.f5329b) {
                this.f5319g = aVar.f5332e;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public int mo19588f(long j, boolean z, boolean z2) {
        return this.f5315c.mo19550a(j, z, z2);
    }

    /* renamed from: g */
    public int mo19589g() {
        return this.f5315c.mo19551b();
    }

    /* renamed from: h */
    public final void mo19590h(C3025a aVar) {
        if (aVar.f5330c) {
            C3025a aVar2 = this.f5320h;
            int i = (aVar2.f5330c ? 1 : 0) + (((int) (aVar2.f5328a - aVar.f5328a)) / this.f5314b);
            C3116c[] cVarArr = new C3116c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = aVar.f5331d;
                aVar = aVar.mo19608a();
            }
            this.f5313a.mo19874d(cVarArr);
        }
    }

    /* renamed from: i */
    public final void mo19591i(long j) {
        C3025a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f5318f;
                if (j < aVar.f5329b) {
                    break;
                }
                this.f5313a.mo19871a(aVar.f5331d);
                this.f5318f = this.f5318f.mo19608a();
            }
            if (this.f5319g.f5328a < aVar.f5328a) {
                this.f5319g = aVar;
            }
        }
    }

    /* renamed from: j */
    public void mo19592j(long j, boolean z, boolean z2) {
        mo19591i(this.f5315c.mo19555f(j, z, z2));
    }

    /* renamed from: k */
    public void mo19593k() {
        mo19591i(this.f5315c.mo19556g());
    }

    /* renamed from: l */
    public void mo19594l() {
        mo19591i(this.f5315c.mo19557h());
    }

    /* renamed from: m */
    public void mo19595m(int i) {
        long i2 = this.f5315c.mo19558i(i);
        this.f5325m = i2;
        if (i2 != 0) {
            C3025a aVar = this.f5318f;
            if (i2 != aVar.f5328a) {
                while (this.f5325m > aVar.f5329b) {
                    aVar = aVar.f5332e;
                }
                C3025a aVar2 = aVar.f5332e;
                mo19590h(aVar2);
                C3025a aVar3 = new C3025a(aVar.f5329b, this.f5314b);
                aVar.f5332e = aVar3;
                if (this.f5325m != aVar.f5329b) {
                    aVar3 = aVar;
                }
                this.f5320h = aVar3;
                if (this.f5319g == aVar2) {
                    this.f5319g = aVar.f5332e;
                    return;
                }
                return;
            }
        }
        mo19590h(this.f5318f);
        C3025a aVar4 = new C3025a(this.f5325m, this.f5314b);
        this.f5318f = aVar4;
        this.f5319g = aVar4;
        this.f5320h = aVar4;
    }

    /* renamed from: o */
    public int mo19596o() {
        return this.f5315c.mo19561l();
    }

    /* renamed from: p */
    public long mo19597p() {
        return this.f5315c.mo19562m();
    }

    /* renamed from: q */
    public long mo19598q() {
        return this.f5315c.mo19563n();
    }

    /* renamed from: r */
    public int mo19599r() {
        return this.f5315c.mo19565p();
    }

    /* renamed from: s */
    public Format mo19600s() {
        return this.f5315c.mo19567r();
    }

    /* renamed from: t */
    public int mo19601t() {
        return this.f5315c.mo19568s();
    }

    /* renamed from: u */
    public boolean mo19602u() {
        return this.f5315c.mo19569t();
    }

    /* renamed from: v */
    public boolean mo19603v() {
        return this.f5315c.mo19570u();
    }

    /* renamed from: w */
    public int mo19604w() {
        return this.f5315c.mo19571v();
    }

    /* renamed from: x */
    public final void mo19605x(int i) {
        long j = this.f5325m + ((long) i);
        this.f5325m = j;
        C3025a aVar = this.f5320h;
        if (j == aVar.f5329b) {
            this.f5320h = aVar.f5332e;
        }
    }

    /* renamed from: y */
    public final int mo19606y(int i) {
        C3025a aVar = this.f5320h;
        if (!aVar.f5330c) {
            aVar.mo19609b(this.f5313a.mo19872b(), new C3025a(this.f5320h.f5329b, this.f5314b));
        }
        return Math.min(i, (int) (this.f5320h.f5329b - this.f5325m));
    }

    /* renamed from: z */
    public int mo19607z(C3030l lVar, C2634e eVar, boolean z, boolean z2, long j) {
        int w = this.f5315c.mo19572w(lVar, eVar, z, z2, this.f5321i, this.f5316d);
        if (w == -5) {
            this.f5321i = lVar.f5333a;
            return -5;
        } else if (w == -4) {
            if (!eVar.mo18390n()) {
                if (eVar.f3308n < j) {
                    eVar.mo18385h(Integer.MIN_VALUE);
                }
                if (eVar.mo18407v()) {
                    mo19578C(eVar, this.f5316d);
                }
                eVar.mo18405t(this.f5316d.f5310a);
                C3022w.C3023a aVar = this.f5316d;
                mo19576A(aVar.f5311b, eVar.f3307m, aVar.f5310a);
            }
            return -4;
        } else if (w == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }
}
