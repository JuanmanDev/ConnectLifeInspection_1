package p553f.p554a.p576f.p585g;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p576f.p585g.C9115b;

/* renamed from: f.a.f.g.a */
/* compiled from: MethodCallHandlerImpl */
public final class C9114a implements C9017j.C9021c {

    /* renamed from: e */
    public final C9115b f17867e;
    @Nullable

    /* renamed from: l */
    public C9017j f17868l;

    public C9114a(C9115b bVar) {
        this.f17867e = bVar;
    }

    /* renamed from: a */
    public static Bundle m24715a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo46827b(C9017j.C9022d dVar, String str) {
        dVar.success(Boolean.valueOf(this.f17867e.mo46832a(str)));
    }

    /* renamed from: c */
    public final void mo46828c(C9017j.C9022d dVar) {
        this.f17867e.mo46833b();
        dVar.success((Object) null);
    }

    /* renamed from: d */
    public final void mo46829d(C9016i iVar, C9017j.C9022d dVar, String str) {
        boolean booleanValue = ((Boolean) iVar.mo46571a("useWebView")).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.mo46571a("enableJavaScript")).booleanValue();
        boolean booleanValue3 = ((Boolean) iVar.mo46571a("enableDomStorage")).booleanValue();
        C9115b.C9116a c = this.f17867e.mo46834c(str, m24715a((Map) iVar.mo46571a("headers")), booleanValue, booleanValue2, booleanValue3);
        if (c == C9115b.C9116a.NO_ACTIVITY) {
            dVar.error("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        } else if (c == C9115b.C9116a.ACTIVITY_NOT_FOUND) {
            dVar.error("ACTIVITY_NOT_FOUND", String.format("No Activity found to handle intent { %s }", new Object[]{str}), (Object) null);
        } else {
            dVar.success(Boolean.TRUE);
        }
    }

    /* renamed from: e */
    public void mo46830e(C9003c cVar) {
        if (this.f17868l != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            mo46831f();
        }
        C9017j jVar = new C9017j(cVar, "plugins.flutter.io/url_launcher");
        this.f17868l = jVar;
        jVar.mo46575e(this);
    }

    /* renamed from: f */
    public void mo46831f() {
        C9017j jVar = this.f17868l;
        if (jVar != null) {
            jVar.mo46575e((C9017j.C9021c) null);
            this.f17868l = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r7, p553f.p554a.p570e.p571a.C9017j.C9022d r8) {
        /*
            r6 = this;
            java.lang.String r0 = "url"
            java.lang.Object r0 = r7.mo46571a(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r7.f17687a
            int r2 = r1.hashCode()
            r3 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0034
            r3 = -185306205(0xfffffffff4f473a3, float:-1.5493968E32)
            if (r2 == r3) goto L_0x002a
            r3 = -121617663(0xfffffffff8c04301, float:-3.119625E34)
            if (r2 == r3) goto L_0x0020
            goto L_0x003e
        L_0x0020:
            java.lang.String r2 = "closeWebView"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003e
            r1 = r4
            goto L_0x003f
        L_0x002a:
            java.lang.String r2 = "canLaunch"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003e
            r1 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r2 = "launch"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003e
            r1 = r5
            goto L_0x003f
        L_0x003e:
            r1 = -1
        L_0x003f:
            if (r1 == 0) goto L_0x0051
            if (r1 == r5) goto L_0x004d
            if (r1 == r4) goto L_0x0049
            r8.notImplemented()
            goto L_0x0054
        L_0x0049:
            r6.mo46828c(r8)
            goto L_0x0054
        L_0x004d:
            r6.mo46829d(r7, r8, r0)
            goto L_0x0054
        L_0x0051:
            r6.mo46827b(r8, r0)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p585g.C9114a.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
