package p040c.p313b0.p314a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import p040c.p313b0.p314a.p319i.C4175d;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p575e.C9057g;
import p630io.flutter.view.FlutterView;

/* renamed from: c.b0.a.j */
/* compiled from: InAppWebViewFlutterPlugin */
public class C4205j implements C8944a, C8948a {

    /* renamed from: e */
    public static C4167h f8961e;

    /* renamed from: l */
    public static C4165f f8962l;

    /* renamed from: m */
    public static C4150b f8963m;

    /* renamed from: n */
    public static C4206k f8964n;

    /* renamed from: o */
    public static C4213m f8965o;

    /* renamed from: p */
    public static C4164e f8966p;

    /* renamed from: q */
    public static C4217n f8967q;

    /* renamed from: r */
    public static ValueCallback<Uri> f8968r;

    /* renamed from: s */
    public static ValueCallback<Uri[]> f8969s;

    /* renamed from: a */
    public final void mo25622a(Context context, C9003c cVar, Activity activity, C9057g gVar, FlutterView flutterView) {
        C4221o.f8993a = context;
        C4221o.f8998f = activity;
        C4221o.f8995c = cVar;
        f8961e = new C4167h(cVar);
        f8962l = new C4165f(cVar);
        f8963m = new C4150b(cVar);
        gVar.mo46682a("com.pichillilorenzo/flutter_inappwebview", new C4175d(cVar, flutterView));
        f8964n = new C4206k(cVar);
        f8965o = new C4213m(cVar);
        f8967q = new C4217n(cVar);
        if (Build.VERSION.SDK_INT >= 26) {
            f8966p = new C4164e(cVar);
        }
    }

    public void onAttachedToActivity(C8950c cVar) {
        C4221o.f8997e = cVar;
        C4221o.f8998f = cVar.mo46419d();
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        C4221o.f8996d = bVar.mo46466c();
        mo25622a(bVar.mo46464a(), bVar.mo46465b(), C4221o.f8998f, bVar.mo46468e(), (FlutterView) null);
    }

    public void onDetachedFromActivity() {
        C4221o.f8997e = null;
        C4221o.f8998f = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        C4221o.f8997e = null;
        C4221o.f8998f = null;
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        C4167h hVar = f8961e;
        if (hVar != null) {
            hVar.mo25515a();
            f8961e = null;
        }
        C4165f fVar = f8962l;
        if (fVar != null) {
            fVar.mo25510b();
            f8962l = null;
        }
        C4150b bVar2 = f8963m;
        if (bVar2 != null) {
            bVar2.mo25478a();
            f8963m = null;
        }
        C4213m mVar = f8965o;
        if (mVar != null) {
            mVar.mo25633d();
            f8965o = null;
        }
        C4217n nVar = f8967q;
        if (nVar != null) {
            nVar.mo25640a();
            f8967q = null;
        }
        if (f8966p != null && Build.VERSION.SDK_INT >= 26) {
            f8966p.mo25508a();
            f8966p = null;
        }
        C4206k kVar = f8964n;
        if (kVar != null) {
            kVar.mo25624b();
            f8964n = null;
        }
        f8968r = null;
        f8969s = null;
    }

    public void onReattachedToActivityForConfigChanges(C8950c cVar) {
        C4221o.f8997e = cVar;
        C4221o.f8998f = cVar.mo46419d();
    }
}
