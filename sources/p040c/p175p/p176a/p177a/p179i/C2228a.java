package p040c.p175p.p176a.p177a.p179i;

import android.view.MotionEvent;
import p040c.p175p.p176a.p177a.p178h.C2227b;
import p040c.p175p.p176a.p177a.p180j.C2238a;

/* renamed from: c.p.a.a.i.a */
/* compiled from: Callbacks */
public class C2228a {

    /* renamed from: a */
    public C2231d f2270a;

    /* renamed from: b */
    public C2230c f2271b;

    /* renamed from: c */
    public C2234g f2272c;

    /* renamed from: d */
    public C2236i f2273d;

    /* renamed from: e */
    public C2233f f2274e;

    /* renamed from: f */
    public C2235h f2275f;

    /* renamed from: g */
    public C2229b f2276g;

    /* renamed from: h */
    public C2229b f2277h;

    /* renamed from: i */
    public C2237j f2278i;

    /* renamed from: j */
    public C2232e f2279j;

    /* renamed from: k */
    public C2227b f2280k;

    /* renamed from: a */
    public void mo17169a(C2238a aVar) {
        C2227b bVar = this.f2280k;
        if (bVar != null) {
            bVar.mo17166a(aVar);
        }
    }

    /* renamed from: b */
    public void mo17170b(int i) {
        C2231d dVar = this.f2270a;
        if (dVar != null) {
            dVar.mo17193a(i);
        }
    }

    /* renamed from: c */
    public void mo17171c(MotionEvent motionEvent) {
        C2232e eVar = this.f2279j;
        if (eVar != null) {
            eVar.onLongPress(motionEvent);
        }
    }

    /* renamed from: d */
    public void mo17172d(int i, int i2) {
        C2233f fVar = this.f2274e;
        if (fVar != null) {
            fVar.mo17195a(i, i2);
        }
    }

    /* renamed from: e */
    public boolean mo17173e(int i, Throwable th) {
        C2234g gVar = this.f2272c;
        if (gVar == null) {
            return false;
        }
        gVar.mo17196a(i, th);
        return true;
    }

    /* renamed from: f */
    public void mo17174f(int i, float f) {
        C2235h hVar = this.f2275f;
        if (hVar != null) {
            hVar.mo17197a(i, f);
        }
    }

    /* renamed from: g */
    public void mo17175g(int i) {
        C2236i iVar = this.f2273d;
        if (iVar != null) {
            iVar.mo17198a(i);
        }
    }

    /* renamed from: h */
    public boolean mo17176h(MotionEvent motionEvent) {
        C2237j jVar = this.f2278i;
        return jVar != null && jVar.mo17199a(motionEvent);
    }

    /* renamed from: i */
    public C2229b mo17177i() {
        return this.f2276g;
    }

    /* renamed from: j */
    public C2229b mo17178j() {
        return this.f2277h;
    }

    /* renamed from: k */
    public C2230c mo17179k() {
        return this.f2271b;
    }

    /* renamed from: l */
    public void mo17180l(C2227b bVar) {
        this.f2280k = bVar;
    }

    public void setOnDraw(C2229b bVar) {
        this.f2276g = bVar;
    }

    public void setOnDrawAll(C2229b bVar) {
        this.f2277h = bVar;
    }

    public void setOnError(C2230c cVar) {
        this.f2271b = cVar;
    }

    public void setOnLoadComplete(C2231d dVar) {
        this.f2270a = dVar;
    }

    public void setOnLongPress(C2232e eVar) {
        this.f2279j = eVar;
    }

    public void setOnPageChange(C2233f fVar) {
        this.f2274e = fVar;
    }

    public void setOnPageError(C2234g gVar) {
        this.f2272c = gVar;
    }

    public void setOnPageScroll(C2235h hVar) {
        this.f2275f = hVar;
    }

    public void setOnRender(C2236i iVar) {
        this.f2273d = iVar;
    }

    public void setOnTap(C2237j jVar) {
        this.f2278i = jVar;
    }
}
