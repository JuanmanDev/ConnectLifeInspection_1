package p040c.p313b0.p314a;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.n */
/* compiled from: MyWebStorage */
public class C4217n implements C9017j.C9021c {

    /* renamed from: e */
    public static C9017j f8988e;

    /* renamed from: l */
    public static WebStorage f8989l;

    /* renamed from: c.b0.a.n$a */
    /* compiled from: MyWebStorage */
    public class C4218a implements ValueCallback<Map> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8990a;

        public C4218a(C4217n nVar, C9017j.C9022d dVar) {
            this.f8990a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Map map) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : map.keySet()) {
                WebStorage.Origin origin = (WebStorage.Origin) map.get(obj);
                HashMap hashMap = new HashMap();
                hashMap.put(EventBusConstKt.ORIGIN, origin.getOrigin());
                hashMap.put("quota", Long.valueOf(origin.getQuota()));
                hashMap.put("usage", Long.valueOf(origin.getUsage()));
                arrayList.add(hashMap);
            }
            this.f8990a.success(arrayList);
        }
    }

    /* renamed from: c.b0.a.n$b */
    /* compiled from: MyWebStorage */
    public class C4219b implements ValueCallback<Long> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8991a;

        public C4219b(C4217n nVar, C9017j.C9022d dVar) {
            this.f8991a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Long l) {
            this.f8991a.success(l);
        }
    }

    /* renamed from: c.b0.a.n$c */
    /* compiled from: MyWebStorage */
    public class C4220c implements ValueCallback<Long> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8992a;

        public C4220c(C4217n nVar, C9017j.C9022d dVar) {
            this.f8992a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Long l) {
            this.f8992a.success(l);
        }
    }

    public C4217n(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_inappwebview_webstoragemanager");
        f8988e = jVar;
        jVar.mo46575e(this);
        f8989l = WebStorage.getInstance();
    }

    /* renamed from: a */
    public void mo25640a() {
        f8988e.mo46575e((C9017j.C9021c) null);
    }

    /* renamed from: b */
    public void mo25641b(C9017j.C9022d dVar) {
        f8989l.getOrigins(new C4218a(this, dVar));
    }

    /* renamed from: c */
    public void mo25642c(String str, C9017j.C9022d dVar) {
        f8989l.getQuotaForOrigin(str, new C4219b(this, dVar));
    }

    /* renamed from: d */
    public void mo25643d(String str, C9017j.C9022d dVar) {
        f8989l.getUsageForOrigin(str, new C4220c(this, dVar));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r7, p553f.p554a.p570e.p571a.C9017j.C9022d r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f17687a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1308548435: goto L_0x0036;
                case -1117417280: goto L_0x002c;
                case -876677967: goto L_0x0022;
                case -165580329: goto L_0x0018;
                case 843309476: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "getUsageForOrigin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r2
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "getOrigins"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "deleteOrigin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "deleteAllData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r5
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "getQuotaForOrigin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0081
            if (r0 == r5) goto L_0x0076
            java.lang.String r1 = "origin"
            if (r0 == r4) goto L_0x0065
            if (r0 == r3) goto L_0x005b
            if (r0 == r2) goto L_0x0051
            r8.notImplemented()
            goto L_0x0084
        L_0x0051:
            java.lang.Object r7 = r7.mo46571a(r1)
            java.lang.String r7 = (java.lang.String) r7
            r6.mo25643d(r7, r8)
            goto L_0x0084
        L_0x005b:
            java.lang.Object r7 = r7.mo46571a(r1)
            java.lang.String r7 = (java.lang.String) r7
            r6.mo25642c(r7, r8)
            goto L_0x0084
        L_0x0065:
            java.lang.Object r7 = r7.mo46571a(r1)
            java.lang.String r7 = (java.lang.String) r7
            android.webkit.WebStorage r0 = f8989l
            r0.deleteOrigin(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8.success(r7)
            goto L_0x0084
        L_0x0076:
            android.webkit.WebStorage r7 = f8989l
            r7.deleteAllData()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8.success(r7)
            goto L_0x0084
        L_0x0081:
            r6.mo25641b(r8)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.C4217n.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
