package p553f.p554a.p576f.p579c.p580a;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.C6338j;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9017j;
import p630io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import p630io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;

/* renamed from: f.a.f.c.a.j */
/* compiled from: FlutterFirebaseCorePlugin */
public class C9081j implements C8944a, C9017j.C9021c {

    /* renamed from: e */
    public C9017j f17824e;

    /* renamed from: l */
    public Context f17825l;

    /* renamed from: m */
    public boolean f17826m = false;

    /* renamed from: e */
    public static /* synthetic */ Void m24650e(Map map) {
        try {
            C6331h.m17786m((String) Objects.requireNonNull(map.get("appName"))).mo30401g();
            return null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ Map m24651f(C6331h hVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C6338j o = hVar.mo30406o();
        hashMap2.put("apiKey", o.mo30419b());
        hashMap2.put("appId", o.mo30420c());
        if (o.mo30424f() != null) {
            hashMap2.put("messagingSenderId", o.mo30424f());
        }
        if (o.mo30425g() != null) {
            hashMap2.put("projectId", o.mo30425g());
        }
        if (o.mo30421d() != null) {
            hashMap2.put("databaseURL", o.mo30421d());
        }
        if (o.mo30426h() != null) {
            hashMap2.put("storageBucket", o.mo30426h());
        }
        if (o.mo30422e() != null) {
            hashMap2.put("trackingId", o.mo30422e());
        }
        hashMap.put("name", hVar.mo30405n());
        hashMap.put("options", hashMap2);
        hashMap.put("isAutomaticDataCollectionEnabled", Boolean.valueOf(hVar.mo30410u()));
        hashMap.put("pluginConstants", C5777m.m16409a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(hVar)));
        return hashMap;
    }

    /* renamed from: i */
    public static /* synthetic */ void m24652i(C9017j.C9022d dVar, C5771j jVar) {
        if (jVar.mo28856q()) {
            dVar.success(jVar.mo28852m());
            return;
        }
        Exception l = jVar.mo28851l();
        dVar.error("firebase_core", l != null ? l.getMessage() : null, (Object) null);
    }

    /* renamed from: a */
    public final C5771j<Void> mo46756a(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9074c(map));
    }

    /* renamed from: b */
    public final C5771j<Map<String, Object>> mo46757b(C6331h hVar) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9072a(hVar));
    }

    /* renamed from: c */
    public final C5771j<Map<String, Object>> mo46758c(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9077f(this, map));
    }

    /* renamed from: d */
    public final C5771j<List<Map<String, Object>>> mo46759d() {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9073b(this));
    }

    /* renamed from: g */
    public /* synthetic */ Map mo46760g(Map map) {
        Map map2 = (Map) Objects.requireNonNull(map.get("options"));
        C6338j.C6340b bVar = new C6338j.C6340b();
        bVar.mo30430b((String) Objects.requireNonNull((String) map2.get("apiKey")));
        bVar.mo30431c((String) Objects.requireNonNull((String) map2.get("appId")));
        bVar.mo30432d((String) map2.get("databaseURL"));
        bVar.mo30434f((String) map2.get("messagingSenderId"));
        bVar.mo30435g((String) map2.get("projectId"));
        bVar.mo30436h((String) map2.get("storageBucket"));
        bVar.mo30433e((String) map2.get("trackingId"));
        C6338j a = bVar.mo30429a();
        return (Map) C5777m.m16409a(mo46757b(C6331h.m17789t(this.f17825l, a, (String) Objects.requireNonNull(map.get("appName")))));
    }

    /* renamed from: h */
    public /* synthetic */ List mo46761h() {
        if (!this.f17826m) {
            this.f17826m = true;
        } else {
            C5777m.m16409a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
        }
        List<C6331h> k = C6331h.m17784k(this.f17825l);
        ArrayList arrayList = new ArrayList(k.size());
        for (C6331h b : k) {
            arrayList.add((Map) C5777m.m16409a(mo46757b(b)));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final C5771j<Void> mo46762l(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9075d(map));
    }

    /* renamed from: m */
    public final C5771j<Void> mo46763m(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9076e(map));
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        this.f17825l = bVar.mo46464a();
        C9017j jVar = new C9017j(bVar.mo46465b(), "plugins.flutter.io/firebase_core");
        this.f17824e = jVar;
        jVar.mo46575e(this);
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        this.f17824e.mo46575e((C9017j.C9021c) null);
        this.f17825l = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r7, @androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9017j.C9022d r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f17687a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1428757205: goto L_0x0036;
                case -746799097: goto L_0x002c;
                case -738827499: goto L_0x0022;
                case 145005524: goto L_0x0018;
                case 1633364958: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "FirebaseApp#setAutomaticResourceManagementEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r3
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "FirebaseApp#delete"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r2
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "Firebase#initializeApp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "FirebaseApp#setAutomaticDataCollectionEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r4
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "Firebase#initializeCore"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r5
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0075
            if (r0 == r5) goto L_0x0070
            if (r0 == r4) goto L_0x0065
            if (r0 == r3) goto L_0x005a
            if (r0 == r2) goto L_0x004f
            r8.notImplemented()
            return
        L_0x004f:
            java.lang.Object r7 = r7.mo46572b()
            java.util.Map r7 = (java.util.Map) r7
            c.q.a.c.m.j r7 = r6.mo46756a(r7)
            goto L_0x007f
        L_0x005a:
            java.lang.Object r7 = r7.mo46572b()
            java.util.Map r7 = (java.util.Map) r7
            c.q.a.c.m.j r7 = r6.mo46763m(r7)
            goto L_0x007f
        L_0x0065:
            java.lang.Object r7 = r7.mo46572b()
            java.util.Map r7 = (java.util.Map) r7
            c.q.a.c.m.j r7 = r6.mo46762l(r7)
            goto L_0x007f
        L_0x0070:
            c.q.a.c.m.j r7 = r6.mo46759d()
            goto L_0x007f
        L_0x0075:
            java.lang.Object r7 = r7.mo46572b()
            java.util.Map r7 = (java.util.Map) r7
            c.q.a.c.m.j r7 = r6.mo46758c(r7)
        L_0x007f:
            f.a.f.c.a.g r0 = new f.a.f.c.a.g
            r0.<init>(r8)
            r7.mo28842c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p579c.p580a.C9081j.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
