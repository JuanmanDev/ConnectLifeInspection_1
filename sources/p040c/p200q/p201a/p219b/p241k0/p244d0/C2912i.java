package p040c.p200q.p201a.p219b.p241k0.p244d0;

import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p235h0.p236f.C2835b;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2922e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.d0.i */
/* compiled from: EventSampleStream */
public final class C2912i implements C3027y {

    /* renamed from: e */
    public final Format f4738e;

    /* renamed from: l */
    public final C2835b f4739l = new C2835b();

    /* renamed from: m */
    public long[] f4740m;

    /* renamed from: n */
    public boolean f4741n;

    /* renamed from: o */
    public C2922e f4742o;

    /* renamed from: p */
    public boolean f4743p;

    /* renamed from: q */
    public int f4744q;

    /* renamed from: r */
    public long f4745r = -9223372036854775807L;

    public C2912i(C2922e eVar, Format format, boolean z) {
        this.f4738e = format;
        this.f4742o = eVar;
        this.f4740m = eVar.f4796b;
        mo19214e(eVar, z);
    }

    /* renamed from: a */
    public void mo19097a() {
    }

    /* renamed from: b */
    public String mo19212b() {
        return this.f4742o.mo19279a();
    }

    /* renamed from: c */
    public boolean mo19099c() {
        return true;
    }

    /* renamed from: d */
    public void mo19213d(long j) {
        boolean z = true;
        int c = C3152e0.m7791c(this.f4740m, j, true, false);
        this.f4744q = c;
        if (!this.f4741n || c != this.f4740m.length) {
            z = false;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f4745r = j;
    }

    /* renamed from: e */
    public void mo19214e(C2922e eVar, boolean z) {
        int i = this.f4744q;
        long j = i == 0 ? -9223372036854775807L : this.f4740m[i - 1];
        this.f4741n = z;
        this.f4742o = eVar;
        long[] jArr = eVar.f4796b;
        this.f4740m = jArr;
        long j2 = this.f4745r;
        if (j2 != -9223372036854775807L) {
            mo19213d(j2);
        } else if (j != -9223372036854775807L) {
            this.f4744q = C3152e0.m7791c(jArr, j, false, false);
        }
    }

    /* renamed from: i */
    public int mo19105i(C3030l lVar, C2634e eVar, boolean z) {
        if (z || !this.f4743p) {
            lVar.f5333a = this.f4738e;
            this.f4743p = true;
            return -5;
        }
        int i = this.f4744q;
        if (i != this.f4740m.length) {
            this.f4744q = i + 1;
            byte[] a = this.f4739l.mo18907a(this.f4742o.f4795a[i]);
            if (a == null) {
                return -3;
            }
            eVar.mo18405t(a.length);
            eVar.mo18392q(1);
            eVar.f3307m.put(a);
            eVar.f3308n = this.f4740m[i];
            return -4;
        } else if (this.f4741n) {
            return -3;
        } else {
            eVar.mo18392q(4);
            return -4;
        }
    }

    /* renamed from: o */
    public int mo19108o(long j) {
        int max = Math.max(this.f4744q, C3152e0.m7791c(this.f4740m, j, true, false));
        int i = max - this.f4744q;
        this.f4744q = max;
        return i;
    }
}
