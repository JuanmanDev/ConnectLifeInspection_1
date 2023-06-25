package p040c.p200q.p201a.p219b.p241k0.p246e0.p247q;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.p246e0.C2950g;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2970e;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3138t;
import p040c.p200q.p201a.p219b.p261o0.C3150d0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.e0.q.c */
/* compiled from: DefaultHlsPlaylistTracker */
public final class C2966c implements HlsPlaylistTracker, Loader.C4057b<C3138t<C2972f>> {

    /* renamed from: z */
    public static final HlsPlaylistTracker.C4042a f4997z = C2964a.f4995a;

    /* renamed from: e */
    public final C2950g f4998e;

    /* renamed from: l */
    public final C2975h f4999l;

    /* renamed from: m */
    public final C3135r f5000m;

    /* renamed from: n */
    public final IdentityHashMap<C2968d.C2969a, C2967a> f5001n = new IdentityHashMap<>();

    /* renamed from: o */
    public final List<HlsPlaylistTracker.C4043b> f5002o = new ArrayList();
    @Nullable

    /* renamed from: p */
    public C3138t.C3139a<C2972f> f5003p;
    @Nullable

    /* renamed from: q */
    public C3017v.C3018a f5004q;
    @Nullable

    /* renamed from: r */
    public Loader f5005r;
    @Nullable

    /* renamed from: s */
    public Handler f5006s;
    @Nullable

    /* renamed from: t */
    public HlsPlaylistTracker.C4044c f5007t;
    @Nullable

    /* renamed from: u */
    public C2968d f5008u;
    @Nullable

    /* renamed from: v */
    public C2968d.C2969a f5009v;
    @Nullable

    /* renamed from: w */
    public C2970e f5010w;

    /* renamed from: x */
    public boolean f5011x;

    /* renamed from: y */
    public long f5012y = -9223372036854775807L;

    /* renamed from: c.q.a.b.k0.e0.q.c$a */
    /* compiled from: DefaultHlsPlaylistTracker */
    public final class C2967a implements Loader.C4057b<C3138t<C2972f>>, Runnable {

        /* renamed from: e */
        public final C2968d.C2969a f5013e;

        /* renamed from: l */
        public final Loader f5014l = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: m */
        public final C3138t<C2972f> f5015m;

        /* renamed from: n */
        public C2970e f5016n;

        /* renamed from: o */
        public long f5017o;

        /* renamed from: p */
        public long f5018p;

        /* renamed from: q */
        public long f5019q;

        /* renamed from: r */
        public long f5020r;

        /* renamed from: s */
        public boolean f5021s;

        /* renamed from: t */
        public IOException f5022t;

        public C2967a(C2968d.C2969a aVar) {
            this.f5013e = aVar;
            this.f5015m = new C3138t<>(C2966c.this.f4998e.mo19315a(4), C3150d0.m7752d(C2966c.this.f5008u.f5057a, aVar.f5031a), 4, C2966c.this.f5003p);
        }

        /* renamed from: d */
        public final boolean mo19423d(long j) {
            this.f5020r = SystemClock.elapsedRealtime() + j;
            return C2966c.this.f5009v == this.f5013e && !C2966c.this.mo19403E();
        }

        /* renamed from: e */
        public C2970e mo19424e() {
            return this.f5016n;
        }

        /* renamed from: f */
        public boolean mo19425f() {
            int i;
            if (this.f5016n == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, C2627d.m5058b(this.f5016n.f5045p));
            C2970e eVar = this.f5016n;
            if (eVar.f5041l || (i = eVar.f5033d) == 2 || i == 1 || this.f5017o + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public void mo19426g() {
            this.f5020r = 0;
            if (!this.f5021s && !this.f5014l.mo24272h()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f5019q) {
                    this.f5021s = true;
                    C2966c.this.f5006s.postDelayed(this, this.f5019q - elapsedRealtime);
                    return;
                }
                mo19427h();
            }
        }

        /* renamed from: h */
        public final void mo19427h() {
            long l = this.f5014l.mo24276l(this.f5015m, this, C2966c.this.f5000m.mo19924c(this.f5015m.f5793b));
            C3017v.C3018a w = C2966c.this.f5004q;
            C3138t<C2972f> tVar = this.f5015m;
            w.mo19547y(tVar.f5792a, tVar.f5793b, l);
        }

        /* renamed from: i */
        public void mo19428i() {
            this.f5014l.mo19182a();
            IOException iOException = this.f5022t;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: j */
        public void mo19106k(C3138t<C2972f> tVar, long j, long j2, boolean z) {
            C2966c.this.f5004q.mo19538p(tVar.f5792a, tVar.mo19928e(), tVar.mo19926c(), 4, j, j2, tVar.mo19925b());
        }

        /* renamed from: m */
        public void mo19107l(C3138t<C2972f> tVar, long j, long j2) {
            C2972f d = tVar.mo19927d();
            if (d instanceof C2970e) {
                long j3 = j2;
                mo19432o((C2970e) d, j3);
                C2966c.this.f5004q.mo19541s(tVar.f5792a, tVar.mo19928e(), tVar.mo19926c(), 4, j, j3, tVar.mo19925b());
                return;
            }
            this.f5022t = new ParserException("Loaded playlist has unexpected type.");
        }

        /* renamed from: n */
        public Loader.C4058c mo19109s(C3138t<C2972f> tVar, long j, long j2, IOException iOException, int i) {
            Loader.C4058c cVar;
            C3138t<C2972f> tVar2 = tVar;
            long b = C2966c.this.f5000m.mo19923b(tVar2.f5793b, j2, iOException, i);
            boolean z = b != -9223372036854775807L;
            boolean z2 = C2966c.this.mo19405G(this.f5013e, b) || !z;
            if (z) {
                z2 |= mo19423d(b);
            }
            if (z2) {
                long a = C2966c.this.f5000m.mo19922a(tVar2.f5793b, j2, iOException, i);
                cVar = a != -9223372036854775807L ? Loader.m10672g(false, a) : Loader.f7922f;
            } else {
                cVar = Loader.f7921e;
            }
            C2966c.this.f5004q.mo19544v(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), 4, j, j2, tVar.mo19925b(), iOException, !cVar.mo24277c());
            return cVar;
        }

        /* renamed from: o */
        public final void mo19432o(C2970e eVar, long j) {
            C2970e eVar2 = this.f5016n;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f5017o = elapsedRealtime;
            C2970e n = C2966c.this.mo19400B(eVar2, eVar);
            this.f5016n = n;
            if (n != eVar2) {
                this.f5022t = null;
                this.f5018p = elapsedRealtime;
                C2966c.this.mo19409K(this.f5013e, n);
            } else if (!n.f5041l) {
                C2970e eVar3 = this.f5016n;
                if (eVar.f5038i + ((long) eVar.f5044o.size()) < eVar3.f5038i) {
                    this.f5022t = new HlsPlaylistTracker.PlaylistResetException(this.f5013e.f5031a);
                    boolean unused = C2966c.this.mo19405G(this.f5013e, -9223372036854775807L);
                } else if (((double) (elapsedRealtime - this.f5018p)) > ((double) C2627d.m5058b(eVar3.f5040k)) * 3.5d) {
                    this.f5022t = new HlsPlaylistTracker.PlaylistStuckException(this.f5013e.f5031a);
                    long b = C2966c.this.f5000m.mo19923b(4, j, this.f5022t, 1);
                    boolean unused2 = C2966c.this.mo19405G(this.f5013e, b);
                    if (b != -9223372036854775807L) {
                        mo19423d(b);
                    }
                }
            }
            C2970e eVar4 = this.f5016n;
            this.f5019q = elapsedRealtime + C2627d.m5058b(eVar4 != eVar2 ? eVar4.f5040k : eVar4.f5040k / 2);
            if (this.f5013e == C2966c.this.f5009v && !this.f5016n.f5041l) {
                mo19426g();
            }
        }

        /* renamed from: p */
        public void mo19433p() {
            this.f5014l.mo24274j();
        }

        public void run() {
            this.f5021s = false;
            mo19427h();
        }
    }

    public C2966c(C2950g gVar, C3135r rVar, C2975h hVar) {
        this.f4998e = gVar;
        this.f4999l = hVar;
        this.f5000m = rVar;
    }

    /* renamed from: A */
    public static C2970e.C2971a m6764A(C2970e eVar, C2970e eVar2) {
        int i = (int) (eVar2.f5038i - eVar.f5038i);
        List<C2970e.C2971a> list = eVar.f5044o;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: B */
    public final C2970e mo19400B(C2970e eVar, C2970e eVar2) {
        if (!eVar2.mo19440f(eVar)) {
            return eVar2.f5041l ? eVar.mo19438d() : eVar;
        }
        return eVar2.mo19437c(mo19402D(eVar, eVar2), mo19401C(eVar, eVar2));
    }

    /* renamed from: C */
    public final int mo19401C(C2970e eVar, C2970e eVar2) {
        C2970e.C2971a A;
        if (eVar2.f5036g) {
            return eVar2.f5037h;
        }
        C2970e eVar3 = this.f5010w;
        int i = eVar3 != null ? eVar3.f5037h : 0;
        return (eVar == null || (A = m6764A(eVar, eVar2)) == null) ? i : (eVar.f5037h + A.f5049n) - eVar2.f5044o.get(0).f5049n;
    }

    /* renamed from: D */
    public final long mo19402D(C2970e eVar, C2970e eVar2) {
        if (eVar2.f5042m) {
            return eVar2.f5035f;
        }
        C2970e eVar3 = this.f5010w;
        long j = eVar3 != null ? eVar3.f5035f : 0;
        if (eVar == null) {
            return j;
        }
        int size = eVar.f5044o.size();
        C2970e.C2971a A = m6764A(eVar, eVar2);
        if (A != null) {
            return eVar.f5035f + A.f5050o;
        }
        return ((long) size) == eVar2.f5038i - eVar.f5038i ? eVar.mo19439e() : j;
    }

    /* renamed from: E */
    public final boolean mo19403E() {
        List<C2968d.C2969a> list = this.f5008u.f5025d;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C2967a aVar = this.f5001n.get(list.get(i));
            if (elapsedRealtime > aVar.f5020r) {
                this.f5009v = aVar.f5013e;
                aVar.mo19426g();
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final void mo19404F(C2968d.C2969a aVar) {
        if (aVar != this.f5009v && this.f5008u.f5025d.contains(aVar)) {
            C2970e eVar = this.f5010w;
            if (eVar == null || !eVar.f5041l) {
                this.f5009v = aVar;
                this.f5001n.get(aVar).mo19426g();
            }
        }
    }

    /* renamed from: G */
    public final boolean mo19405G(C2968d.C2969a aVar, long j) {
        int size = this.f5002o.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !this.f5002o.get(i).mo19349k(aVar, j);
        }
        return z;
    }

    /* renamed from: H */
    public void mo19106k(C3138t<C2972f> tVar, long j, long j2, boolean z) {
        C3017v.C3018a aVar = this.f5004q;
        C3125j jVar = tVar.f5792a;
        Uri e = tVar.mo19928e();
        aVar.mo19538p(jVar, e, tVar.mo19926c(), 4, j, j2, tVar.mo19925b());
    }

    /* renamed from: I */
    public void mo19107l(C3138t<C2972f> tVar, long j, long j2) {
        C2968d dVar;
        C2972f d = tVar.mo19927d();
        boolean z = d instanceof C2970e;
        if (z) {
            dVar = C2968d.m6819d(d.f5057a);
        } else {
            dVar = (C2968d) d;
        }
        this.f5008u = dVar;
        this.f5003p = this.f4999l.mo19398a(dVar);
        this.f5009v = dVar.f5025d.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dVar.f5025d);
        arrayList.addAll(dVar.f5026e);
        arrayList.addAll(dVar.f5027f);
        mo19422z(arrayList);
        C2967a aVar = this.f5001n.get(this.f5009v);
        if (z) {
            aVar.mo19432o((C2970e) d, j2);
        } else {
            long j3 = j2;
            aVar.mo19426g();
        }
        this.f5004q.mo19541s(tVar.f5792a, tVar.mo19928e(), tVar.mo19926c(), 4, j, j2, tVar.mo19925b());
    }

    /* renamed from: J */
    public Loader.C4058c mo19109s(C3138t<C2972f> tVar, long j, long j2, IOException iOException, int i) {
        C3138t<C2972f> tVar2 = tVar;
        long a = this.f5000m.mo19922a(tVar2.f5793b, j2, iOException, i);
        boolean z = a == -9223372036854775807L;
        this.f5004q.mo19544v(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), 4, j, j2, tVar.mo19925b(), iOException, z);
        if (z) {
            return Loader.f7922f;
        }
        return Loader.m10672g(false, a);
    }

    /* renamed from: K */
    public final void mo19409K(C2968d.C2969a aVar, C2970e eVar) {
        if (aVar == this.f5009v) {
            if (this.f5010w == null) {
                this.f5011x = !eVar.f5041l;
                this.f5012y = eVar.f5035f;
            }
            this.f5010w = eVar;
            this.f5007t.mo19355c(eVar);
        }
        int size = this.f5002o.size();
        for (int i = 0; i < size; i++) {
            this.f5002o.get(i).mo19347c();
        }
    }

    /* renamed from: a */
    public void mo19410a(HlsPlaylistTracker.C4043b bVar) {
        this.f5002o.remove(bVar);
    }

    /* renamed from: b */
    public long mo19411b() {
        return this.f5012y;
    }

    /* renamed from: c */
    public boolean mo19412c() {
        return this.f5011x;
    }

    /* renamed from: d */
    public void mo19413d(C2968d.C2969a aVar) {
        this.f5001n.get(aVar).mo19426g();
    }

    @Nullable
    /* renamed from: e */
    public C2968d mo19414e() {
        return this.f5008u;
    }

    /* renamed from: f */
    public void mo19415f(Uri uri, C3017v.C3018a aVar, HlsPlaylistTracker.C4044c cVar) {
        this.f5006s = new Handler();
        this.f5004q = aVar;
        this.f5007t = cVar;
        C3138t tVar = new C3138t(this.f4998e.mo19315a(4), uri, 4, this.f4999l.mo19399b());
        C3151e.m7759g(this.f5005r == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f5005r = loader;
        aVar.mo19547y(tVar.f5792a, tVar.f5793b, loader.mo24276l(tVar, this, this.f5000m.mo19924c(tVar.f5793b)));
    }

    /* renamed from: g */
    public void mo19416g() {
        Loader loader = this.f5005r;
        if (loader != null) {
            loader.mo19182a();
        }
        C2968d.C2969a aVar = this.f5009v;
        if (aVar != null) {
            mo19420m(aVar);
        }
    }

    /* renamed from: h */
    public void mo19417h(HlsPlaylistTracker.C4043b bVar) {
        this.f5002o.add(bVar);
    }

    /* renamed from: i */
    public boolean mo19418i(C2968d.C2969a aVar) {
        return this.f5001n.get(aVar).mo19425f();
    }

    /* renamed from: j */
    public C2970e mo19419j(C2968d.C2969a aVar, boolean z) {
        C2970e e = this.f5001n.get(aVar).mo19424e();
        if (e != null && z) {
            mo19404F(aVar);
        }
        return e;
    }

    /* renamed from: m */
    public void mo19420m(C2968d.C2969a aVar) {
        this.f5001n.get(aVar).mo19428i();
    }

    public void stop() {
        this.f5009v = null;
        this.f5010w = null;
        this.f5008u = null;
        this.f5012y = -9223372036854775807L;
        this.f5005r.mo24274j();
        this.f5005r = null;
        for (C2967a p : this.f5001n.values()) {
            p.mo19433p();
        }
        this.f5006s.removeCallbacksAndMessages((Object) null);
        this.f5006s = null;
        this.f5001n.clear();
    }

    /* renamed from: z */
    public final void mo19422z(List<C2968d.C2969a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2968d.C2969a aVar = list.get(i);
            this.f5001n.put(aVar, new C2967a(aVar));
        }
    }
}
