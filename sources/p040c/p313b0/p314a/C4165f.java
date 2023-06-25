package p040c.p313b0.p314a;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p040c.p313b0.p314a.p319i.C4171c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.f */
/* compiled from: HeadlessInAppWebViewManager */
public class C4165f implements C9017j.C9021c {

    /* renamed from: e */
    public C9017j f8778e;

    /* renamed from: l */
    public Map<String, C4171c> f8779l = new HashMap();

    public C4165f(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_headless_inappwebview");
        this.f8778e = jVar;
        jVar.mo46575e(this);
    }

    /* renamed from: a */
    public void mo25509a(Activity activity, String str, HashMap<String, Object> hashMap) {
        this.f8779l.put(str, new C4171c(C4221o.f8995c, activity, str, hashMap, (View) null));
    }

    /* renamed from: b */
    public void mo25510b() {
        this.f8778e.mo46575e((C9017j.C9021c) null);
    }

    /* renamed from: c */
    public void mo25511c(String str) {
        if (this.f8779l.containsKey(str)) {
            this.f8779l.get(str).dispose();
            this.f8779l.remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r7, p553f.p554a.p570e.p571a.C9017j.C9022d r8) {
        /*
            r6 = this;
            android.app.Activity r0 = p040c.p313b0.p314a.C4221o.f8998f
            java.lang.String r1 = "uuid"
            java.lang.Object r1 = r7.mo46571a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r7.f17687a
            int r3 = r2.hashCode()
            r4 = 368876996(0x15fc9dc4, float:1.020309E-25)
            r5 = 1
            if (r3 == r4) goto L_0x0026
            r4 = 454282817(0x1b13ce41, float:1.2226199E-22)
            if (r3 == r4) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.String r3 = "disposeHeadlessWebView"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0030
            r2 = r5
            goto L_0x0031
        L_0x0026:
            java.lang.String r3 = "createHeadlessWebView"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0030
            r2 = 0
            goto L_0x0031
        L_0x0030:
            r2 = -1
        L_0x0031:
            if (r2 == 0) goto L_0x0042
            if (r2 == r5) goto L_0x0039
            r8.notImplemented()
            goto L_0x0052
        L_0x0039:
            r6.mo25511c(r1)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8.success(r7)
            goto L_0x0052
        L_0x0042:
            java.lang.String r2 = "params"
            java.lang.Object r7 = r7.mo46571a(r2)
            java.util.HashMap r7 = (java.util.HashMap) r7
            r6.mo25509a(r0, r1, r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8.success(r7)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.C4165f.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
