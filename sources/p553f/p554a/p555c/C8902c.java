package p553f.p554a.p555c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p570e.p575e.C9057g;
import p553f.p554a.p570e.p575e.C9060j;
import p553f.p554a.p589h.C9172c;
import p553f.p554a.p589h.C9173d;
import p630io.flutter.view.FlutterView;

/* renamed from: f.a.c.c */
/* compiled from: FlutterPluginRegistry */
public class C8902c implements C9024l, C9024l.C9028d, C9024l.C9025a, C9024l.C9026b, C9024l.C9029e, C9024l.C9030f {

    /* renamed from: e */
    public Activity f17429e;

    /* renamed from: l */
    public Context f17430l;

    /* renamed from: m */
    public C9173d f17431m;

    /* renamed from: n */
    public final C9060j f17432n;

    /* renamed from: o */
    public final Map<String, Object> f17433o = new LinkedHashMap(0);

    /* renamed from: p */
    public final List<C9024l.C9028d> f17434p = new ArrayList(0);

    /* renamed from: q */
    public final List<C9024l.C9025a> f17435q = new ArrayList(0);

    /* renamed from: r */
    public final List<C9024l.C9026b> f17436r = new ArrayList(0);

    /* renamed from: s */
    public final List<C9024l.C9029e> f17437s = new ArrayList(0);

    /* renamed from: t */
    public final List<C9024l.C9030f> f17438t = new ArrayList(0);

    /* renamed from: f.a.c.c$a */
    /* compiled from: FlutterPluginRegistry */
    public class C8903a implements C9024l.C9027c {
        public C8903a(String str) {
        }

        /* renamed from: a */
        public C9024l.C9027c mo46296a(C9024l.C9025a aVar) {
            C8902c.this.f17435q.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C9024l.C9027c mo46297b(C9024l.C9028d dVar) {
            C8902c.this.f17434p.add(dVar);
            return this;
        }

        /* renamed from: c */
        public Context mo46298c() {
            return C8902c.this.f17430l;
        }

        /* renamed from: d */
        public Activity mo46299d() {
            return C8902c.this.f17429e;
        }

        /* renamed from: e */
        public String mo46300e(String str) {
            return C9172c.m24875c(str);
        }

        /* renamed from: f */
        public C9003c mo46301f() {
            return C8902c.this.f17431m;
        }

        /* renamed from: g */
        public C9057g mo46302g() {
            return C8902c.this.f17432n.mo46693G();
        }
    }

    public C8902c(C9173d dVar, Context context) {
        this.f17431m = dVar;
        this.f17430l = context;
        this.f17432n = new C9060j();
    }

    /* renamed from: a */
    public boolean mo20939a(int i, int i2, Intent intent) {
        for (C9024l.C9025a a : this.f17435q) {
            if (a.mo20939a(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo46289b(C9173d dVar) {
        boolean z = false;
        for (C9024l.C9030f b : this.f17438t) {
            if (b.mo46289b(dVar)) {
                z = true;
            }
        }
        return z;
    }

    public boolean hasPlugin(String str) {
        return this.f17433o.containsKey(str);
    }

    /* renamed from: j */
    public void mo46290j(FlutterView flutterView, Activity activity) {
        this.f17429e = activity;
        this.f17432n.mo46709s(activity, flutterView, flutterView.getDartExecutor());
    }

    /* renamed from: k */
    public void mo46291k() {
        this.f17432n.mo46700N();
    }

    /* renamed from: l */
    public void mo46292l() {
        this.f17432n.mo46687A();
        this.f17432n.mo46700N();
        this.f17429e = null;
    }

    /* renamed from: m */
    public C9060j mo46293m() {
        return this.f17432n;
    }

    /* renamed from: n */
    public void mo46294n() {
        this.f17432n.mo46704R();
    }

    public boolean onNewIntent(Intent intent) {
        for (C9024l.C9026b onNewIntent : this.f17436r) {
            if (onNewIntent.onNewIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        for (C9024l.C9028d onRequestPermissionsResult : this.f17434p) {
            if (onRequestPermissionsResult.onRequestPermissionsResult(i, strArr, iArr)) {
                return true;
            }
        }
        return false;
    }

    public void onUserLeaveHint() {
        for (C9024l.C9029e onUserLeaveHint : this.f17437s) {
            onUserLeaveHint.onUserLeaveHint();
        }
    }

    public C9024l.C9027c registrarFor(String str) {
        if (!this.f17433o.containsKey(str)) {
            this.f17433o.put(str, (Object) null);
            return new C8903a(str);
        }
        throw new IllegalStateException("Plugin key " + str + " is already in use");
    }

    public <T> T valuePublishedByPlugin(String str) {
        return this.f17433o.get(str);
    }
}
