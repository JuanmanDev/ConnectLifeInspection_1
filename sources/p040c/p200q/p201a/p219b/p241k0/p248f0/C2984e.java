package p040c.p200q.p201a.p219b.p241k0.p248f0;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.C2862k;
import p040c.p200q.p201a.p219b.p241k0.C2864a0;
import p040c.p200q.p201a.p219b.p241k0.C2996l;
import p040c.p200q.p201a.p219b.p241k0.C3000o;
import p040c.p200q.p201a.p219b.p241k0.C3001p;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.p248f0.C2981c;
import p040c.p200q.p201a.p219b.p241k0.p248f0.p249f.C2987a;
import p040c.p200q.p201a.p219b.p241k0.p248f0.p249f.C2990b;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3134q;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3136s;
import p040c.p200q.p201a.p219b.p260n0.C3138t;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.f0.e */
/* compiled from: SsMediaSource */
public final class C2984e extends C2996l implements Loader.C4057b<C3138t<C2987a>> {

    /* renamed from: A */
    public C3122h f5123A;

    /* renamed from: B */
    public Loader f5124B;

    /* renamed from: C */
    public C3136s f5125C;
    @Nullable

    /* renamed from: D */
    public C3141v f5126D;

    /* renamed from: E */
    public long f5127E;

    /* renamed from: F */
    public C2987a f5128F;

    /* renamed from: G */
    public Handler f5129G;

    /* renamed from: p */
    public final boolean f5130p;

    /* renamed from: q */
    public final Uri f5131q;

    /* renamed from: r */
    public final C3122h.C3123a f5132r;

    /* renamed from: s */
    public final C2981c.C2982a f5133s;

    /* renamed from: t */
    public final C3000o f5134t;

    /* renamed from: u */
    public final C3135r f5135u;

    /* renamed from: v */
    public final long f5136v;

    /* renamed from: w */
    public final C3017v.C3018a f5137w;

    /* renamed from: x */
    public final C3138t.C3139a<? extends C2987a> f5138x;

    /* renamed from: y */
    public final ArrayList<C2983d> f5139y;
    @Nullable

    /* renamed from: z */
    public final Object f5140z;

    /* renamed from: c.q.a.b.k0.f0.e$b */
    /* compiled from: SsMediaSource */
    public static final class C2986b {

        /* renamed from: a */
        public final C2981c.C2982a f5141a;
        @Nullable

        /* renamed from: b */
        public final C3122h.C3123a f5142b;
        @Nullable

        /* renamed from: c */
        public C3138t.C3139a<? extends C2987a> f5143c;

        /* renamed from: d */
        public C3000o f5144d = new C3001p();

        /* renamed from: e */
        public C3135r f5145e = new C3134q();

        /* renamed from: f */
        public long f5146f = 30000;
        @Nullable

        /* renamed from: g */
        public Object f5147g;

        public C2986b(C2981c.C2982a aVar, @Nullable C3122h.C3123a aVar2) {
            C3151e.m7757e(aVar);
            this.f5141a = aVar;
            this.f5142b = aVar2;
        }

        /* renamed from: a */
        public C2984e mo19461a(Uri uri) {
            if (this.f5143c == null) {
                this.f5143c = new SsManifestParser();
            }
            C3151e.m7757e(uri);
            return new C2984e((C2987a) null, uri, this.f5142b, this.f5143c, this.f5141a, this.f5144d, this.f5145e, this.f5146f, this.f5147g);
        }
    }

    static {
        C2862k.m6234a("goog.exo.smoothstreaming");
    }

    /* renamed from: a */
    public C3012t mo19162a(C3014u.C3015a aVar, C3117d dVar, long j) {
        C2983d dVar2 = new C2983d(this.f5128F, this.f5133s, this.f5126D, this.f5134t, this.f5135u, mo19477j(aVar), this.f5125C, dVar);
        this.f5139y.add(dVar2);
        return dVar2;
    }

    /* renamed from: h */
    public void mo19163h() {
        this.f5125C.mo19182a();
    }

    /* renamed from: i */
    public void mo19164i(C3012t tVar) {
        ((C2983d) tVar).mo19453u();
        this.f5139y.remove(tVar);
    }

    /* renamed from: n */
    public void mo19165n(@Nullable C3141v vVar) {
        this.f5126D = vVar;
        if (this.f5130p) {
            this.f5125C = new C3136s.C3137a();
            mo19458u();
            return;
        }
        this.f5123A = this.f5132r.mo19884a();
        Loader loader = new Loader("Loader:Manifest");
        this.f5124B = loader;
        this.f5125C = loader;
        this.f5129G = new Handler();
        mo19460w();
    }

    /* renamed from: p */
    public void mo19166p() {
        this.f5128F = this.f5130p ? this.f5128F : null;
        this.f5123A = null;
        this.f5127E = 0;
        Loader loader = this.f5124B;
        if (loader != null) {
            loader.mo24274j();
            this.f5124B = null;
        }
        Handler handler = this.f5129G;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f5129G = null;
        }
    }

    /* renamed from: q */
    public void mo19106k(C3138t<C2987a> tVar, long j, long j2, boolean z) {
        C3138t<C2987a> tVar2 = tVar;
        this.f5137w.mo19538p(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), tVar2.f5793b, j, j2, tVar.mo19925b());
    }

    /* renamed from: r */
    public void mo19107l(C3138t<C2987a> tVar, long j, long j2) {
        C3138t<C2987a> tVar2 = tVar;
        this.f5137w.mo19541s(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), tVar2.f5793b, j, j2, tVar.mo19925b());
        this.f5128F = tVar.mo19927d();
        this.f5127E = j - j2;
        mo19458u();
        mo19459v();
    }

    /* renamed from: t */
    public Loader.C4058c mo19109s(C3138t<C2987a> tVar, long j, long j2, IOException iOException, int i) {
        C3138t<C2987a> tVar2 = tVar;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof ParserException;
        this.f5137w.mo19544v(tVar2.f5792a, tVar.mo19928e(), tVar.mo19926c(), tVar2.f5793b, j, j2, tVar.mo19925b(), iOException2, z);
        return z ? Loader.f7922f : Loader.f7920d;
    }

    /* renamed from: u */
    public final void mo19458u() {
        C2864a0 a0Var;
        for (int i = 0; i < this.f5139y.size(); i++) {
            this.f5139y.get(i).mo19454v(this.f5128F);
        }
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (C2987a.C2989b bVar : this.f5128F.f5153f) {
            if (bVar.f5169k > 0) {
                j2 = Math.min(j2, bVar.mo19467e(0));
                j = Math.max(j, bVar.mo19467e(bVar.f5169k - 1) + bVar.mo19465c(bVar.f5169k - 1));
            }
        }
        if (j2 == Long.MAX_VALUE) {
            a0Var = new C2864a0(this.f5128F.f5151d ? -9223372036854775807L : 0, 0, 0, 0, true, this.f5128F.f5151d, this.f5140z);
        } else {
            C2987a aVar = this.f5128F;
            if (aVar.f5151d) {
                long j3 = aVar.f5155h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    j2 = Math.max(j2, j - j3);
                }
                long j4 = j2;
                long j5 = j - j4;
                long a = j5 - C2627d.m5057a(this.f5136v);
                if (a < 5000000) {
                    a = Math.min(5000000, j5 / 2);
                }
                a0Var = new C2864a0(-9223372036854775807L, j5, j4, a, true, true, this.f5140z);
            } else {
                long j6 = aVar.f5154g;
                long j7 = j6 != -9223372036854775807L ? j6 : j - j2;
                a0Var = new C2864a0(j2 + j7, j7, j2, 0, true, false, this.f5140z);
            }
        }
        mo19479o(a0Var, this.f5128F);
    }

    /* renamed from: v */
    public final void mo19459v() {
        if (this.f5128F.f5151d) {
            this.f5129G.postDelayed(new C2977a(this), Math.max(0, (this.f5127E + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: w */
    public final void mo19460w() {
        C3138t tVar = new C3138t(this.f5123A, this.f5131q, 4, this.f5138x);
        this.f5137w.mo19547y(tVar.f5792a, tVar.f5793b, this.f5124B.mo24276l(tVar, this, this.f5135u.mo19924c(tVar.f5793b)));
    }

    public C2984e(C2987a aVar, Uri uri, C3122h.C3123a aVar2, C3138t.C3139a<? extends C2987a> aVar3, C2981c.C2982a aVar4, C3000o oVar, C3135r rVar, long j, @Nullable Object obj) {
        Uri uri2;
        boolean z = false;
        C3151e.m7759g(aVar == null || !aVar.f5151d);
        this.f5128F = aVar;
        if (uri == null) {
            uri2 = null;
        } else {
            uri2 = C2990b.m6907a(uri);
        }
        this.f5131q = uri2;
        this.f5132r = aVar2;
        this.f5138x = aVar3;
        this.f5133s = aVar4;
        this.f5134t = oVar;
        this.f5135u = rVar;
        this.f5136v = j;
        this.f5137w = mo19477j((C3014u.C3015a) null);
        this.f5140z = obj;
        this.f5130p = aVar != null ? true : z;
        this.f5139y = new ArrayList<>();
    }
}
