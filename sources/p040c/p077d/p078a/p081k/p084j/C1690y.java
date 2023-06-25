package p040c.p077d.p078a.p081k.p084j;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.util.Collections;
import java.util.List;
import p040c.p077d.p078a.p081k.C1565a;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p084j.C1643f;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p105q.C1945e;

/* renamed from: c.d.a.k.j.y */
/* compiled from: SourceGenerator */
public class C1690y implements C1643f, C1578d.C1579a<Object>, C1643f.C1644a {

    /* renamed from: e */
    public final C1645g<?> f1214e;

    /* renamed from: l */
    public final C1643f.C1644a f1215l;

    /* renamed from: m */
    public int f1216m;

    /* renamed from: n */
    public C1639c f1217n;

    /* renamed from: o */
    public Object f1218o;

    /* renamed from: p */
    public volatile C1756n.C1757a<?> f1219p;

    /* renamed from: q */
    public C1641d f1220q;

    public C1690y(C1645g<?> gVar, C1643f.C1644a aVar) {
        this.f1214e = gVar;
        this.f1215l = aVar;
    }

    /* renamed from: a */
    public boolean mo15742a() {
        Object obj = this.f1218o;
        if (obj != null) {
            this.f1218o = null;
            mo15892b(obj);
        }
        C1639c cVar = this.f1217n;
        if (cVar != null && cVar.mo15742a()) {
            return true;
        }
        this.f1217n = null;
        this.f1219p = null;
        boolean z = false;
        while (!z && mo15893h()) {
            List<C1756n.C1757a<?>> g = this.f1214e.mo15755g();
            int i = this.f1216m;
            this.f1216m = i + 1;
            this.f1219p = g.get(i);
            if (this.f1219p != null && (this.f1214e.mo15753e().mo15820c(this.f1219p.f1310c.mo15630c()) || this.f1214e.mo15768t(this.f1219p.f1310c.mo15624a()))) {
                this.f1219p.f1310c.mo15633e(this.f1214e.mo15760l(), this);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo15892b(Object obj) {
        long b = C1945e.m2547b();
        try {
            C1565a<X> p = this.f1214e.mo15764p(obj);
            C1642e eVar = new C1642e(p, obj, this.f1214e.mo15759k());
            this.f1220q = new C1641d(this.f1219p.f1308a, this.f1214e.mo15763o());
            this.f1214e.mo15752d().mo15692a(this.f1220q, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                "Finished encoding source to cache, key: " + this.f1220q + ", data: " + obj + ", encoder: " + p + ", duration: " + C1945e.m2546a(b);
            }
            this.f1219p.f1310c.mo15629b();
            this.f1217n = new C1639c(Collections.singletonList(this.f1219p.f1308a), this.f1214e, this);
        } catch (Throwable th) {
            this.f1219p.f1310c.mo15629b();
            throw th;
        }
    }

    /* renamed from: c */
    public void mo15746c(C1567c cVar, Exception exc, C1578d<?> dVar, DataSource dataSource) {
        this.f1215l.mo15746c(cVar, exc, dVar, this.f1219p.f1310c.mo15630c());
    }

    public void cancel() {
        C1756n.C1757a<?> aVar = this.f1219p;
        if (aVar != null) {
            aVar.f1310c.cancel();
        }
    }

    /* renamed from: d */
    public void mo15643d(@NonNull Exception exc) {
        this.f1215l.mo15746c(this.f1220q, exc, this.f1219p.f1310c, this.f1219p.f1310c.mo15630c());
    }

    /* renamed from: e */
    public void mo15747e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public void mo15644f(Object obj) {
        C1657j e = this.f1214e.mo15753e();
        if (obj == null || !e.mo15820c(this.f1219p.f1310c.mo15630c())) {
            this.f1215l.mo15748g(this.f1219p.f1308a, obj, this.f1219p.f1310c, this.f1219p.f1310c.mo15630c(), this.f1220q);
            return;
        }
        this.f1218o = obj;
        this.f1215l.mo15747e();
    }

    /* renamed from: g */
    public void mo15748g(C1567c cVar, Object obj, C1578d<?> dVar, DataSource dataSource, C1567c cVar2) {
        this.f1215l.mo15748g(cVar, obj, dVar, this.f1219p.f1310c.mo15630c(), cVar);
    }

    /* renamed from: h */
    public final boolean mo15893h() {
        return this.f1216m < this.f1214e.mo15755g().size();
    }
}
