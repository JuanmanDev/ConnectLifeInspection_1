package p553f.p554a.p576f.p586h;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import java.util.Objects;
import p553f.p554a.p556d.p558b.p560f.C8938c;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9006d;
import p553f.p554a.p576f.p586h.C9120c;
import p553f.p554a.p589h.C9177f;

/* renamed from: f.a.f.h.g */
/* compiled from: VideoPlayerPlugin */
public class C9146g implements C8944a, C9120c.C9126f {

    /* renamed from: e */
    public final LongSparseArray<C9142e> f17917e = new LongSparseArray<>();

    /* renamed from: l */
    public C9147a f17918l;

    /* renamed from: m */
    public C9145f f17919m = new C9145f();

    /* renamed from: f.a.f.h.g$a */
    /* compiled from: VideoPlayerPlugin */
    public static final class C9147a {

        /* renamed from: a */
        public final Context f17920a;

        /* renamed from: b */
        public final C9003c f17921b;

        /* renamed from: c */
        public final C9149c f17922c;

        /* renamed from: d */
        public final C9148b f17923d;

        /* renamed from: e */
        public final C9177f f17924e;

        public C9147a(Context context, C9003c cVar, C9149c cVar2, C9148b bVar, C9177f fVar) {
            this.f17920a = context;
            this.f17921b = cVar;
            this.f17922c = cVar2;
            this.f17923d = bVar;
            this.f17924e = fVar;
        }

        /* renamed from: f */
        public void mo46879f(C9146g gVar, C9003c cVar) {
            C9120c.C9126f.m24747e(cVar, gVar);
        }

        /* renamed from: g */
        public void mo46880g(C9003c cVar) {
            C9120c.C9126f.m24747e(cVar, (C9120c.C9126f) null);
        }
    }

    /* renamed from: f.a.f.h.g$b */
    /* compiled from: VideoPlayerPlugin */
    public interface C9148b {
        /* renamed from: a */
        String mo46836a(String str, String str2);
    }

    /* renamed from: f.a.f.h.g$c */
    /* compiled from: VideoPlayerPlugin */
    public interface C9149c {
        String get(String str);
    }

    /* renamed from: a */
    public void mo46852a() {
        mo46878l();
    }

    /* renamed from: b */
    public void mo46853b(C9120c.C9122b bVar) {
        this.f17917e.get(bVar.mo46843c().longValue()).mo46875o(bVar.mo46842b().booleanValue());
    }

    /* renamed from: c */
    public C9120c.C9124d mo46854c(C9120c.C9125e eVar) {
        C9142e eVar2 = this.f17917e.get(eVar.mo46849b().longValue());
        C9120c.C9124d dVar = new C9120c.C9124d();
        dVar.mo46847d(Long.valueOf(eVar2.mo46869g()));
        eVar2.mo46873l();
        return dVar;
    }

    /* renamed from: d */
    public void mo46855d(C9120c.C9125e eVar) {
        this.f17917e.get(eVar.mo46849b().longValue()).mo46868f();
        this.f17917e.remove(eVar.mo46849b().longValue());
    }

    /* renamed from: f */
    public C9120c.C9125e mo46856f(C9120c.C9121a aVar) {
        String str;
        C9177f.C9178a e = this.f17918l.f17924e.mo46480e();
        C9003c b = this.f17918l.f17921b;
        C9006d dVar = new C9006d(b, "flutter.io/videoPlayer/videoEvents" + e.mo46496id());
        if (aVar.mo46838b() != null) {
            if (aVar.mo46840d() != null) {
                str = this.f17918l.f17923d.mo46836a(aVar.mo46838b(), aVar.mo46840d());
            } else {
                str = this.f17918l.f17922c.get(aVar.mo46838b());
            }
            Context e2 = this.f17918l.f17920a;
            this.f17917e.put(e.mo46496id(), new C9142e(e2, dVar, e, "asset:///" + str, (String) null, this.f17919m));
        } else {
            this.f17917e.put(e.mo46496id(), new C9142e(this.f17918l.f17920a, dVar, e, aVar.mo46841e(), aVar.mo46839c(), this.f17919m));
        }
        C9120c.C9125e eVar = new C9120c.C9125e();
        eVar.mo46850c(Long.valueOf(e.mo46496id()));
        return eVar;
    }

    /* renamed from: g */
    public void mo46857g(C9120c.C9137g gVar) {
        this.f17917e.get(gVar.mo46862b().longValue()).mo46876p(gVar.mo46863c().doubleValue());
    }

    /* renamed from: h */
    public void mo46858h(C9120c.C9123c cVar) {
        this.f17919m.f17916a = cVar.mo46844b().booleanValue();
    }

    /* renamed from: i */
    public void mo46859i(C9120c.C9124d dVar) {
        this.f17917e.get(dVar.mo46846c().longValue()).mo46872k(dVar.mo46845b().intValue());
    }

    /* renamed from: j */
    public void mo46860j(C9120c.C9125e eVar) {
        this.f17917e.get(eVar.mo46849b().longValue()).mo46871j();
    }

    /* renamed from: k */
    public void mo46861k(C9120c.C9125e eVar) {
        this.f17917e.get(eVar.mo46849b().longValue()).mo46870i();
    }

    /* renamed from: l */
    public final void mo46878l() {
        for (int i = 0; i < this.f17917e.size(); i++) {
            this.f17917e.valueAt(i).mo46868f();
        }
        this.f17917e.clear();
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        C8938c e = C8938c.m24226e();
        Context a = bVar.mo46464a();
        C9003c b = bVar.mo46465b();
        Objects.requireNonNull(e);
        C9119b bVar2 = new C9119b(e);
        Objects.requireNonNull(e);
        C9147a aVar = new C9147a(a, b, bVar2, new C9118a(e), bVar.mo46469f());
        this.f17918l = aVar;
        aVar.mo46879f(this, bVar.mo46465b());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        if (this.f17918l == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        this.f17918l.mo46880g(bVar.mo46465b());
        this.f17918l = null;
    }
}
