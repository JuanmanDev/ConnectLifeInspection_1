package p040c.p200q.p201a.p219b.p241k0.p248f0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p241k0.C3000o;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p241k0.C3028z;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2877g;
import p040c.p200q.p201a.p219b.p241k0.p248f0.C2981c;
import p040c.p200q.p201a.p219b.p241k0.p248f0.p249f.C2987a;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3136s;
import p040c.p200q.p201a.p219b.p260n0.C3141v;

/* renamed from: c.q.a.b.k0.f0.d */
/* compiled from: SsMediaPeriod */
public final class C2983d implements C3012t, C3028z.C3029a<C2877g<C2981c>> {

    /* renamed from: e */
    public final C2981c.C2982a f5110e;
    @Nullable

    /* renamed from: l */
    public final C3141v f5111l;

    /* renamed from: m */
    public final C3136s f5112m;

    /* renamed from: n */
    public final C3135r f5113n;

    /* renamed from: o */
    public final C3017v.C3018a f5114o;

    /* renamed from: p */
    public final C3117d f5115p;

    /* renamed from: q */
    public final TrackGroupArray f5116q;

    /* renamed from: r */
    public final C3000o f5117r;
    @Nullable

    /* renamed from: s */
    public C3012t.C3013a f5118s;

    /* renamed from: t */
    public C2987a f5119t;

    /* renamed from: u */
    public C2877g<C2981c>[] f5120u;

    /* renamed from: v */
    public C3028z f5121v;

    /* renamed from: w */
    public boolean f5122w;

    public C2983d(C2987a aVar, C2981c.C2982a aVar2, @Nullable C3141v vVar, C3000o oVar, C3135r rVar, C3017v.C3018a aVar3, C3136s sVar, C3117d dVar) {
        this.f5119t = aVar;
        this.f5110e = aVar2;
        this.f5111l = vVar;
        this.f5112m = sVar;
        this.f5113n = rVar;
        this.f5114o = aVar3;
        this.f5115p = dVar;
        this.f5117r = oVar;
        this.f5116q = m6866k(aVar);
        C2877g<C2981c>[] o = m6867o(0);
        this.f5120u = o;
        this.f5121v = oVar.mo19484a(o);
        aVar3.mo19548z();
    }

    /* renamed from: k */
    public static TrackGroupArray m6866k(C2987a aVar) {
        TrackGroup[] trackGroupArr = new TrackGroup[aVar.f5153f.length];
        for (int i = 0; i < aVar.f5153f.length; i++) {
            trackGroupArr[i] = new TrackGroup(aVar.f5153f[i].f5168j);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    /* renamed from: o */
    public static C2877g<C2981c>[] m6867o(int i) {
        return new C2877g[i];
    }

    /* renamed from: b */
    public long mo19098b() {
        return this.f5121v.mo19098b();
    }

    /* renamed from: c */
    public final C2877g<C2981c> mo19451c(C3107e eVar, long j) {
        int b = this.f5116q.mo24211b(eVar.mo19820a());
        return new C2877g(this.f5119t.f5153f[b].f5159a, (int[]) null, (Format[]) null, this.f5110e.mo19450a(this.f5112m, this.f5119t, b, eVar, this.f5111l), this, this.f5115p, j, this.f5113n, this.f5114o);
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        return this.f5121v.mo19100d(j);
    }

    /* renamed from: e */
    public long mo19139e(long j, C3216y yVar) {
        for (C2877g<C2981c> gVar : this.f5120u) {
            if (gVar.f4585e == 2) {
                return gVar.mo19101e(j, yVar);
            }
        }
        return j;
    }

    /* renamed from: f */
    public long mo19102f() {
        return this.f5121v.mo19102f();
    }

    /* renamed from: g */
    public void mo19103g(long j) {
        this.f5121v.mo19103g(j);
    }

    /* renamed from: j */
    public long mo19140j(C3107e[] eVarArr, boolean[] zArr, C3027y[] yVarArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < eVarArr.length; i++) {
            if (yVarArr[i] != null) {
                C2877g gVar = yVarArr[i];
                if (eVarArr[i] == null || !zArr[i]) {
                    gVar.mo19093M();
                    yVarArr[i] = null;
                } else {
                    arrayList.add(gVar);
                }
            }
            if (yVarArr[i] == null && eVarArr[i] != null) {
                C2877g<C2981c> c = mo19451c(eVarArr[i], j);
                arrayList.add(c);
                yVarArr[i] = c;
                zArr2[i] = true;
            }
        }
        C2877g<C2981c>[] o = m6867o(arrayList.size());
        this.f5120u = o;
        arrayList.toArray(o);
        this.f5121v = this.f5117r.mo19484a(this.f5120u);
        return j;
    }

    /* renamed from: m */
    public void mo19141m() {
        this.f5112m.mo19182a();
    }

    /* renamed from: n */
    public long mo19142n(long j) {
        for (C2877g<C2981c> O : this.f5120u) {
            O.mo19095O(j);
        }
        return j;
    }

    /* renamed from: p */
    public long mo19143p() {
        if (this.f5122w) {
            return -9223372036854775807L;
        }
        this.f5114o.mo19518C();
        this.f5122w = true;
        return -9223372036854775807L;
    }

    /* renamed from: q */
    public void mo19144q(C3012t.C3013a aVar, long j) {
        this.f5118s = aVar;
        aVar.mo19001l(this);
    }

    /* renamed from: r */
    public TrackGroupArray mo19145r() {
        return this.f5116q;
    }

    /* renamed from: s */
    public void mo18995i(C2877g<C2981c> gVar) {
        this.f5118s.mo18995i(this);
    }

    /* renamed from: t */
    public void mo19147t(long j, boolean z) {
        for (C2877g<C2981c> t : this.f5120u) {
            t.mo19110t(j, z);
        }
    }

    /* renamed from: u */
    public void mo19453u() {
        for (C2877g<C2981c> M : this.f5120u) {
            M.mo19093M();
        }
        this.f5118s = null;
        this.f5114o.mo19516A();
    }

    /* renamed from: v */
    public void mo19454v(C2987a aVar) {
        this.f5119t = aVar;
        for (C2877g<C2981c> B : this.f5120u) {
            B.mo19082B().mo19448b(aVar);
        }
        this.f5118s.mo18995i(this);
    }
}
