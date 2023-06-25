package p040c.p200q.p201a.p219b.p241k0;

import android.net.Uri;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p224f0.C2672e;
import p040c.p200q.p201a.p219b.p224f0.C2677j;
import p040c.p200q.p201a.p219b.p241k0.C3003r;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3134q;
import p040c.p200q.p201a.p219b.p260n0.C3135r;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.s */
/* compiled from: ExtractorMediaSource */
public final class C3009s extends C2996l implements C3003r.C3006c {

    /* renamed from: p */
    public final Uri f5260p;

    /* renamed from: q */
    public final C3122h.C3123a f5261q;

    /* renamed from: r */
    public final C2677j f5262r;

    /* renamed from: s */
    public final C3135r f5263s;

    /* renamed from: t */
    public final String f5264t;

    /* renamed from: u */
    public final int f5265u;
    @Nullable

    /* renamed from: v */
    public final Object f5266v;

    /* renamed from: w */
    public long f5267w;

    /* renamed from: x */
    public boolean f5268x;
    @Nullable

    /* renamed from: y */
    public C3141v f5269y;

    /* renamed from: c.q.a.b.k0.s$b */
    /* compiled from: ExtractorMediaSource */
    public static final class C3011b {

        /* renamed from: a */
        public final C3122h.C3123a f5270a;
        @Nullable

        /* renamed from: b */
        public C2677j f5271b;
        @Nullable

        /* renamed from: c */
        public String f5272c;
        @Nullable

        /* renamed from: d */
        public Object f5273d;

        /* renamed from: e */
        public C3135r f5274e = new C3134q();

        /* renamed from: f */
        public int f5275f = 1048576;

        /* renamed from: g */
        public boolean f5276g;

        public C3011b(C3122h.C3123a aVar) {
            this.f5270a = aVar;
        }

        /* renamed from: a */
        public C3009s mo19511a(Uri uri) {
            this.f5276g = true;
            if (this.f5271b == null) {
                this.f5271b = new C2672e();
            }
            return new C3009s(uri, this.f5270a, this.f5271b, this.f5274e, this.f5272c, this.f5275f, this.f5273d);
        }

        /* renamed from: b */
        public C3011b mo19512b(C2677j jVar) {
            C3151e.m7759g(!this.f5276g);
            this.f5271b = jVar;
            return this;
        }
    }

    /* renamed from: a */
    public C3012t mo19162a(C3014u.C3015a aVar, C3117d dVar, long j) {
        C3122h a = this.f5261q.mo19884a();
        C3141v vVar = this.f5269y;
        if (vVar != null) {
            a.mo19308b(vVar);
        }
        return new C3003r(this.f5260p, a, this.f5262r.mo18542a(), this.f5263s, mo19477j(aVar), this, dVar, this.f5264t, this.f5265u);
    }

    /* renamed from: f */
    public void mo19509f(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f5267w;
        }
        if (this.f5267w != j || this.f5268x != z) {
            mo19510q(j, z);
        }
    }

    /* renamed from: h */
    public void mo19163h() {
    }

    /* renamed from: i */
    public void mo19164i(C3012t tVar) {
        ((C3003r) tVar).mo19499O();
    }

    /* renamed from: n */
    public void mo19165n(@Nullable C3141v vVar) {
        this.f5269y = vVar;
        mo19510q(this.f5267w, this.f5268x);
    }

    /* renamed from: p */
    public void mo19166p() {
    }

    /* renamed from: q */
    public final void mo19510q(long j, boolean z) {
        this.f5267w = j;
        this.f5268x = z;
        mo19479o(new C2864a0(this.f5267w, this.f5268x, false, this.f5266v), (Object) null);
    }

    public C3009s(Uri uri, C3122h.C3123a aVar, C2677j jVar, C3135r rVar, @Nullable String str, int i, @Nullable Object obj) {
        this.f5260p = uri;
        this.f5261q = aVar;
        this.f5262r = jVar;
        this.f5263s = rVar;
        this.f5264t = str;
        this.f5265u = i;
        this.f5267w = -9223372036854775807L;
        this.f5266v = obj;
    }
}
