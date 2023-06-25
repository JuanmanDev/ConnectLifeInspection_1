package p553f.p554a.p556d.p558b.p561g.p566g;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p553f.p554a.C8893a;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p570e.p575e.C9057g;
import p553f.p554a.p589h.C9173d;

/* renamed from: f.a.d.b.g.g.b */
/* compiled from: ShimRegistrar */
public class C8962b implements C9024l.C9027c, C8944a, C8948a {

    /* renamed from: e */
    public final Set<C9024l.C9030f> f17564e = new HashSet();

    /* renamed from: l */
    public final Set<C9024l.C9028d> f17565l = new HashSet();

    /* renamed from: m */
    public final Set<C9024l.C9025a> f17566m = new HashSet();

    /* renamed from: n */
    public final Set<C9024l.C9026b> f17567n = new HashSet();

    /* renamed from: o */
    public final Set<C9024l.C9029e> f17568o = new HashSet();

    /* renamed from: p */
    public C8944a.C8946b f17569p;

    /* renamed from: q */
    public C8950c f17570q;

    public C8962b(@NonNull String str, @NonNull Map<String, Object> map) {
    }

    /* renamed from: a */
    public C9024l.C9027c mo46296a(C9024l.C9025a aVar) {
        this.f17566m.add(aVar);
        C8950c cVar = this.f17570q;
        if (cVar != null) {
            cVar.mo46415a(aVar);
        }
        return this;
    }

    /* renamed from: b */
    public C9024l.C9027c mo46297b(C9024l.C9028d dVar) {
        this.f17565l.add(dVar);
        C8950c cVar = this.f17570q;
        if (cVar != null) {
            cVar.mo46417b(dVar);
        }
        return this;
    }

    /* renamed from: c */
    public Context mo46298c() {
        C8944a.C8946b bVar = this.f17569p;
        if (bVar != null) {
            return bVar.mo46464a();
        }
        return null;
    }

    /* renamed from: d */
    public Activity mo46299d() {
        C8950c cVar = this.f17570q;
        if (cVar != null) {
            return cVar.mo46419d();
        }
        return null;
    }

    /* renamed from: e */
    public String mo46300e(String str) {
        return C8893a.m24024b().mo46256a().mo46454f(str);
    }

    /* renamed from: f */
    public C9003c mo46301f() {
        C8944a.C8946b bVar = this.f17569p;
        if (bVar != null) {
            return bVar.mo46465b();
        }
        return null;
    }

    /* renamed from: g */
    public C9057g mo46302g() {
        C8944a.C8946b bVar = this.f17569p;
        if (bVar != null) {
            return bVar.mo46468e();
        }
        return null;
    }

    /* renamed from: h */
    public final void mo46479h() {
        for (C9024l.C9028d b : this.f17565l) {
            this.f17570q.mo46417b(b);
        }
        for (C9024l.C9025a a : this.f17566m) {
            this.f17570q.mo46415a(a);
        }
        for (C9024l.C9026b c : this.f17567n) {
            this.f17570q.mo46418c(c);
        }
        for (C9024l.C9029e g : this.f17568o) {
            this.f17570q.mo46422g(g);
        }
    }

    public void onAttachedToActivity(@NonNull C8950c cVar) {
        C8896b.m24032d("ShimRegistrar", "Attached to an Activity.");
        this.f17570q = cVar;
        mo46479h();
    }

    public void onAttachedToEngine(@NonNull C8944a.C8946b bVar) {
        C8896b.m24032d("ShimRegistrar", "Attached to FlutterEngine.");
        this.f17569p = bVar;
    }

    public void onDetachedFromActivity() {
        C8896b.m24032d("ShimRegistrar", "Detached from an Activity.");
        this.f17570q = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        C8896b.m24032d("ShimRegistrar", "Detached from an Activity for config changes.");
        this.f17570q = null;
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        C8896b.m24032d("ShimRegistrar", "Detached from FlutterEngine.");
        for (C9024l.C9030f b : this.f17564e) {
            b.mo46289b((C9173d) null);
        }
        this.f17569p = null;
        this.f17570q = null;
    }

    public void onReattachedToActivityForConfigChanges(@NonNull C8950c cVar) {
        C8896b.m24032d("ShimRegistrar", "Reconnected to an Activity after config changes.");
        this.f17570q = cVar;
        mo46479h();
    }
}
