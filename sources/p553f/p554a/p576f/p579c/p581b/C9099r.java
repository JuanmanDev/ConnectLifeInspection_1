package p553f.p554a.p576f.p579c.p581b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p370n.C6467g;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;
import p630io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import p630io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import p630io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;
import p630io.flutter.plugins.firebase.crashlytics.FlutterError;

/* renamed from: f.a.f.c.b.r */
/* compiled from: FlutterFirebaseCrashlyticsPlugin */
public class C9099r implements FlutterFirebasePlugin, C8944a, C9017j.C9021c {

    /* renamed from: e */
    public C9017j f17846e;

    /* renamed from: k */
    public static /* synthetic */ void m24664k() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    /* renamed from: n */
    public static /* synthetic */ Void m24666n() {
        return null;
    }

    /* renamed from: q */
    public static /* synthetic */ void m24668q(C9017j.C9022d dVar, C5771j jVar) {
        if (jVar.mo28856q()) {
            dVar.success(jVar.mo28852m());
            return;
        }
        Exception l = jVar.mo28851l();
        dVar.error("firebase_crashlytics", l != null ? l.getMessage() : "An unknown error occurred", (Object) null);
    }

    /* renamed from: A */
    public final C5771j<Void> mo46776A(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9089h(map));
    }

    /* renamed from: B */
    public final C5771j<Void> mo46777B(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9086e(map));
    }

    /* renamed from: b */
    public final C5771j<Map<String, Object>> mo46778b() {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9082a(this));
    }

    /* renamed from: c */
    public final void mo46779c() {
        new Handler().postDelayed(C9085d.f17831e, 50);
    }

    /* renamed from: d */
    public final C5771j<Void> mo46780d() {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, C9093l.f17840e);
    }

    public C5771j<Void> didReinitializeFirebaseCore() {
        return C5777m.m16411c(C9094m.f17841e);
    }

    /* renamed from: e */
    public final C5771j<Map<String, Object>> mo46782e() {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9090i(this));
    }

    /* renamed from: f */
    public final StackTraceElement mo46783f(Map<String, String> map) {
        try {
            String str = map.get("file");
            String str2 = map.get("line");
            String str3 = map.get("class");
            String str4 = map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            return new StackTraceElement(str3, str4, str, Integer.parseInt((String) Objects.requireNonNull(str2)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final SharedPreferences mo46784g(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public C5771j<Map<String, Object>> getPluginConstantsForFirebaseApp(C6331h hVar) {
        return C5777m.m16411c(new C9091j(this));
    }

    /* renamed from: h */
    public final void mo46786h(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "plugins.flutter.io/firebase_crashlytics");
        this.f17846e = jVar;
        jVar.mo46575e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    /* renamed from: i */
    public final boolean mo46787i(C6331h hVar) {
        SharedPreferences g = mo46784g(hVar.mo30404j());
        if (g.contains("firebase_crashlytics_collection_enabled")) {
            return g.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (!hVar.mo30410u()) {
            return false;
        }
        C6467g.m18085d().mo30620j(true);
        return true;
    }

    /* renamed from: j */
    public /* synthetic */ Map mo46788j() {
        return new C9095n(this, ((Boolean) C5777m.m16409a(C6467g.m18085d().mo30613a())).booleanValue());
    }

    /* renamed from: m */
    public /* synthetic */ Map mo46789m() {
        return new C9096o(this, C6467g.m18085d().mo30615c());
    }

    /* renamed from: o */
    public /* synthetic */ Map mo46790o() {
        return new C9098q(this);
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo46786h(bVar.mo46465b());
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        C9017j jVar = this.f17846e;
        if (jVar != null) {
            jVar.mo46575e((C9017j.C9021c) null);
            this.f17846e = null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r3, @androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9017j.C9022d r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.f17687a
            int r1 = r0.hashCode()
            switch(r1) {
                case -2094964816: goto L_0x0067;
                case -1437158995: goto L_0x005d;
                case -1025128541: goto L_0x0053;
                case -424770276: goto L_0x0049;
                case -108157790: goto L_0x003f;
                case 28093114: goto L_0x0035;
                case 108415030: goto L_0x002a;
                case 213629529: goto L_0x0020;
                case 679831756: goto L_0x0015;
                case 1219454365: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0071
        L_0x000b:
            java.lang.String r1 = "Crashlytics#crash"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 1
            goto L_0x0072
        L_0x0015:
            java.lang.String r1 = "Crashlytics#setUserIdentifier"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 8
            goto L_0x0072
        L_0x0020:
            java.lang.String r1 = "Crashlytics#deleteUnsentReports"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 2
            goto L_0x0072
        L_0x002a:
            java.lang.String r1 = "Crashlytics#setCustomKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 9
            goto L_0x0072
        L_0x0035:
            java.lang.String r1 = "Crashlytics#log"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 5
            goto L_0x0072
        L_0x003f:
            java.lang.String r1 = "Crashlytics#setCrashlyticsCollectionEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 7
            goto L_0x0072
        L_0x0049:
            java.lang.String r1 = "Crashlytics#sendUnsentReports"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 6
            goto L_0x0072
        L_0x0053:
            java.lang.String r1 = "Crashlytics#checkForUnsentReports"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            goto L_0x0072
        L_0x005d:
            java.lang.String r1 = "Crashlytics#recordError"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 4
            goto L_0x0072
        L_0x0067:
            java.lang.String r1 = "Crashlytics#didCrashOnPreviousExecution"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 3
            goto L_0x0072
        L_0x0071:
            r0 = -1
        L_0x0072:
            switch(r0) {
                case 0: goto L_0x00c3;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b5;
                case 4: goto L_0x00aa;
                case 5: goto L_0x009f;
                case 6: goto L_0x009a;
                case 7: goto L_0x008f;
                case 8: goto L_0x0084;
                case 9: goto L_0x0079;
                default: goto L_0x0075;
            }
        L_0x0075:
            r4.notImplemented()
            return
        L_0x0079:
            java.lang.Object r3 = r3.mo46572b()
            java.util.Map r3 = (java.util.Map) r3
            c.q.a.c.m.j r3 = r2.mo46776A(r3)
            goto L_0x00c7
        L_0x0084:
            java.lang.Object r3 = r3.mo46572b()
            java.util.Map r3 = (java.util.Map) r3
            c.q.a.c.m.j r3 = r2.mo46777B(r3)
            goto L_0x00c7
        L_0x008f:
            java.lang.Object r3 = r3.mo46572b()
            java.util.Map r3 = (java.util.Map) r3
            c.q.a.c.m.j r3 = r2.mo46796z(r3)
            goto L_0x00c7
        L_0x009a:
            c.q.a.c.m.j r3 = r2.mo46795y()
            goto L_0x00c7
        L_0x009f:
            java.lang.Object r3 = r3.mo46572b()
            java.util.Map r3 = (java.util.Map) r3
            c.q.a.c.m.j r3 = r2.mo46793w(r3)
            goto L_0x00c7
        L_0x00aa:
            java.lang.Object r3 = r3.mo46572b()
            java.util.Map r3 = (java.util.Map) r3
            c.q.a.c.m.j r3 = r2.mo46794x(r3)
            goto L_0x00c7
        L_0x00b5:
            c.q.a.c.m.j r3 = r2.mo46782e()
            goto L_0x00c7
        L_0x00ba:
            c.q.a.c.m.j r3 = r2.mo46780d()
            goto L_0x00c7
        L_0x00bf:
            r2.mo46779c()
            return
        L_0x00c3:
            c.q.a.c.m.j r3 = r2.mo46778b()
        L_0x00c7:
            f.a.f.c.b.f r0 = new f.a.f.c.b.f
            r0.<init>(r4)
            r3.mo28842c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p579c.p581b.C9099r.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    /* renamed from: r */
    public /* synthetic */ Void mo46791r(Map map) {
        FlutterError flutterError;
        C6467g d = C6467g.m18085d();
        String str = (String) Objects.requireNonNull(map.get("exception"));
        String str2 = (String) map.get("reason");
        String str3 = (String) Objects.requireNonNull(map.get("information"));
        if (str2 != null) {
            d.mo30621k("flutter_error_reason", "thrown " + str2);
            flutterError = new FlutterError(str + ". Error thrown " + str2 + MAPCookie.DOT);
        } else {
            flutterError = new FlutterError(str);
        }
        d.mo30621k("flutter_error_exception", str);
        ArrayList arrayList = new ArrayList();
        for (Map f : (List) Objects.requireNonNull(map.get("stackTraceElements"))) {
            StackTraceElement f2 = mo46783f(f);
            if (f2 != null) {
                arrayList.add(f2);
            }
        }
        flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        if (!str3.isEmpty()) {
            d.mo30616f(str3);
        }
        d.mo30617g(flutterError);
        return null;
    }

    /* renamed from: t */
    public /* synthetic */ Map mo46792t(Map map) {
        C6467g.m18085d().mo30619i((Boolean) Objects.requireNonNull(map.get("enabled")));
        return new C9097p(this);
    }

    /* renamed from: w */
    public final C5771j<Void> mo46793w(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9083b(map));
    }

    /* renamed from: x */
    public final C5771j<Void> mo46794x(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9088g(this, map));
    }

    /* renamed from: y */
    public final C5771j<Void> mo46795y() {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, C9092k.f17839e);
    }

    /* renamed from: z */
    public final C5771j<Map<String, Object>> mo46796z(Map<String, Object> map) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9084c(this, map));
    }
}
