package p540d.p541a.p542a.p543a;

import android.content.Context;
import java.util.Map;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;
import p620g.p621a.p622d.C9340a;

/* renamed from: d.a.a.a.a */
/* compiled from: E2EPlugin */
public class C8884a implements C9017j.C9021c, C8944a {

    /* renamed from: l */
    public static C9340a<Map<String, String>> f17401l = new C9340a<>();

    /* renamed from: e */
    public C9017j f17402e;

    /* renamed from: b */
    public static void m24009b(C9024l.C9027c cVar) {
        new C8884a().mo46243a(cVar.mo46298c(), cVar.mo46301f());
    }

    /* renamed from: a */
    public final void mo46243a(Context context, C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "plugins.flutter.io/e2e");
        this.f17402e = jVar;
        jVar.mo46575e(this);
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo46243a(bVar.mo46464a(), bVar.mo46465b());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        this.f17402e.mo46575e((C9017j.C9021c) null);
        this.f17402e = null;
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        if (iVar.f17687a.equals("allTestsFinished")) {
            f17401l.mo47183d((Map) iVar.mo46571a("results"));
            dVar.success((Object) null);
            return;
        }
        dVar.notImplemented();
    }
}
