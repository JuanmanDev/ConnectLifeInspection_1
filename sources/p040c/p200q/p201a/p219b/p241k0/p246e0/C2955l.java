package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import java.util.List;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.C2862k;
import p040c.p200q.p201a.p219b.p241k0.C2864a0;
import p040c.p200q.p201a.p219b.p241k0.C2996l;
import p040c.p200q.p201a.p219b.p241k0.C3000o;
import p040c.p200q.p201a.p219b.p241k0.C3001p;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2965b;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2966c;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2970e;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2975h;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3134q;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.e0.l */
/* compiled from: HlsMediaSource */
public final class C2955l extends C2996l implements HlsPlaylistTracker.C4044c {

    /* renamed from: p */
    public final C2951h f4922p;

    /* renamed from: q */
    public final Uri f4923q;

    /* renamed from: r */
    public final C2950g f4924r;

    /* renamed from: s */
    public final C3000o f4925s;

    /* renamed from: t */
    public final C3135r f4926t;

    /* renamed from: u */
    public final boolean f4927u;

    /* renamed from: v */
    public final HlsPlaylistTracker f4928v;
    @Nullable

    /* renamed from: w */
    public final Object f4929w;
    @Nullable

    /* renamed from: x */
    public C3141v f4930x;

    /* renamed from: c.q.a.b.k0.e0.l$b */
    /* compiled from: HlsMediaSource */
    public static final class C2957b {

        /* renamed from: a */
        public final C2950g f4931a;

        /* renamed from: b */
        public C2951h f4932b;

        /* renamed from: c */
        public C2975h f4933c;

        /* renamed from: d */
        public HlsPlaylistTracker.C4042a f4934d;

        /* renamed from: e */
        public C3000o f4935e;

        /* renamed from: f */
        public C3135r f4936f;

        /* renamed from: g */
        public boolean f4937g;
        @Nullable

        /* renamed from: h */
        public Object f4938h;

        public C2957b(C3122h.C3123a aVar) {
            this((C2950g) new C2943d(aVar));
        }

        /* renamed from: a */
        public C2955l mo19356a(Uri uri) {
            C2950g gVar = this.f4931a;
            C2951h hVar = this.f4932b;
            C3000o oVar = this.f4935e;
            C3135r rVar = this.f4936f;
            return new C2955l(uri, gVar, hVar, oVar, rVar, this.f4934d.mo19397a(gVar, rVar, this.f4933c), this.f4937g, this.f4938h);
        }

        public C2957b(C2950g gVar) {
            C3151e.m7757e(gVar);
            this.f4931a = gVar;
            this.f4933c = new C2965b();
            this.f4934d = C2966c.f4997z;
            this.f4932b = C2951h.f4879a;
            this.f4936f = new C3134q();
            this.f4935e = new C3001p();
        }
    }

    static {
        C2862k.m6234a("goog.exo.hls");
    }

    /* renamed from: a */
    public C3012t mo19162a(C3014u.C3015a aVar, C3117d dVar, long j) {
        return new C2954k(this.f4922p, this.f4928v, this.f4924r, this.f4930x, this.f4926t, mo19477j(aVar), dVar, this.f4925s, this.f4927u);
    }

    /* renamed from: c */
    public void mo19355c(C2970e eVar) {
        C2864a0 a0Var;
        long j;
        long j2;
        C2970e eVar2 = eVar;
        long b = eVar2.f5042m ? C2627d.m5058b(eVar2.f5035f) : -9223372036854775807L;
        int i = eVar2.f5033d;
        long j3 = (i == 2 || i == 1) ? b : -9223372036854775807L;
        long j4 = eVar2.f5034e;
        if (this.f4928v.mo19412c()) {
            long b2 = eVar2.f5035f - this.f4928v.mo19411b();
            long j5 = eVar2.f5041l ? b2 + eVar2.f5045p : -9223372036854775807L;
            List<C2970e.C2971a> list = eVar2.f5044o;
            if (j4 == -9223372036854775807L) {
                if (list.isEmpty()) {
                    j2 = 0;
                } else {
                    j2 = list.get(Math.max(0, list.size() - 3)).f5050o;
                }
                j = j2;
            } else {
                j = j4;
            }
            a0Var = new C2864a0(j3, b, j5, eVar2.f5045p, b2, j, true, !eVar2.f5041l, this.f4929w);
        } else {
            long j6 = j4 == -9223372036854775807L ? 0 : j4;
            long j7 = eVar2.f5045p;
            a0Var = new C2864a0(j3, b, j7, j7, 0, j6, true, false, this.f4929w);
        }
        mo19479o(a0Var, new C2952i(this.f4928v.mo19414e(), eVar2));
    }

    /* renamed from: h */
    public void mo19163h() {
        this.f4928v.mo19416g();
    }

    /* renamed from: i */
    public void mo19164i(C3012t tVar) {
        ((C2954k) tVar).mo19354y();
    }

    /* renamed from: n */
    public void mo19165n(@Nullable C3141v vVar) {
        this.f4930x = vVar;
        this.f4928v.mo19415f(this.f4923q, mo19477j((C3014u.C3015a) null), this);
    }

    /* renamed from: p */
    public void mo19166p() {
        this.f4928v.stop();
    }

    public C2955l(Uri uri, C2950g gVar, C2951h hVar, C3000o oVar, C3135r rVar, HlsPlaylistTracker hlsPlaylistTracker, boolean z, @Nullable Object obj) {
        this.f4923q = uri;
        this.f4924r = gVar;
        this.f4922p = hVar;
        this.f4925s = oVar;
        this.f4926t = rVar;
        this.f4928v = hlsPlaylistTracker;
        this.f4927u = z;
        this.f4929w = obj;
    }
}
