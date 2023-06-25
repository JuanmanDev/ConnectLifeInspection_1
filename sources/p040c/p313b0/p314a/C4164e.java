package p040c.p313b0.p314a;

import androidx.annotation.RequiresApi;
import p040c.p313b0.p314a.p317d.C4160c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

@RequiresApi(api = 26)
/* renamed from: c.b0.a.e */
/* compiled from: CredentialDatabaseHandler */
public class C4164e implements C9017j.C9021c {

    /* renamed from: e */
    public static C9017j f8776e;

    /* renamed from: l */
    public static C4160c f8777l;

    public C4164e(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_inappwebview_credential_database");
        f8776e = jVar;
        jVar.mo46575e(this);
        f8777l = C4160c.m11406c(C4221o.f8993a);
    }

    /* renamed from: a */
    public void mo25508a() {
        f8776e.mo46575e((C9017j.C9021c) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r21, p553f.p554a.p570e.p571a.C9017j.C9022d r22) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = r0.f17687a
            int r3 = r2.hashCode()
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r3) {
                case -1851697792: goto L_0x0045;
                case -410271914: goto L_0x003b;
                case 589173355: goto L_0x0031;
                case 998955721: goto L_0x0027;
                case 1084504936: goto L_0x001d;
                case 1930845769: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x004f
        L_0x0013:
            java.lang.String r3 = "getAllAuthCredentials"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004f
            r2 = 0
            goto L_0x0050
        L_0x001d:
            java.lang.String r3 = "removeHttpAuthCredentials"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004f
            r2 = r5
            goto L_0x0050
        L_0x0027:
            java.lang.String r3 = "setHttpAuthCredential"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004f
            r2 = r7
            goto L_0x0050
        L_0x0031:
            java.lang.String r3 = "removeHttpAuthCredential"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004f
            r2 = r6
            goto L_0x0050
        L_0x003b:
            java.lang.String r3 = "getHttpAuthCredentials"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004f
            r2 = r8
            goto L_0x0050
        L_0x0045:
            java.lang.String r3 = "clearAllAuthCredentials"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004f
            r2 = r4
            goto L_0x0050
        L_0x004f:
            r2 = -1
        L_0x0050:
            if (r2 == 0) goto L_0x0159
            java.lang.String r3 = "port"
            java.lang.String r9 = "realm"
            java.lang.String r10 = "protocol"
            java.lang.String r11 = "host"
            if (r2 == r8) goto L_0x011a
            java.lang.String r8 = "password"
            java.lang.String r12 = "username"
            if (r2 == r7) goto L_0x00e0
            if (r2 == r6) goto L_0x00a6
            if (r2 == r5) goto L_0x0082
            if (r2 == r4) goto L_0x006d
            r22.notImplemented()
            goto L_0x01b7
        L_0x006d:
            c.b0.a.d.c r0 = f8777l
            r0.mo25494a()
            android.content.Context r0 = p040c.p313b0.p314a.C4221o.f8993a
            android.webkit.WebViewDatabase r0 = android.webkit.WebViewDatabase.getInstance(r0)
            r0.clearHttpAuthUsernamePassword()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.success(r0)
            goto L_0x01b7
        L_0x0082:
            java.lang.Object r2 = r0.mo46571a(r11)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.mo46571a(r10)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.mo46571a(r9)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.mo46571a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            c.b0.a.d.c r3 = f8777l
            r3.mo25497e(r2, r4, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.success(r0)
            goto L_0x01b7
        L_0x00a6:
            java.lang.Object r2 = r0.mo46571a(r11)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.mo46571a(r10)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r2 = r0.mo46571a(r9)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            java.lang.Object r2 = r0.mo46571a(r3)
            r17 = r2
            java.lang.Integer r17 = (java.lang.Integer) r17
            java.lang.Object r2 = r0.mo46571a(r12)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            java.lang.Object r0 = r0.mo46571a(r8)
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            c.b0.a.d.c r13 = f8777l
            r13.mo25496d(r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.success(r0)
            goto L_0x01b7
        L_0x00e0:
            java.lang.Object r2 = r0.mo46571a(r11)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.mo46571a(r10)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r2 = r0.mo46571a(r9)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            java.lang.Object r2 = r0.mo46571a(r3)
            r17 = r2
            java.lang.Integer r17 = (java.lang.Integer) r17
            java.lang.Object r2 = r0.mo46571a(r12)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            java.lang.Object r0 = r0.mo46571a(r8)
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            c.b0.a.d.c r13 = f8777l
            r13.mo25498f(r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.success(r0)
            goto L_0x01b7
        L_0x011a:
            java.lang.Object r2 = r0.mo46571a(r11)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.mo46571a(r10)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.mo46571a(r9)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.mo46571a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            c.b0.a.d.c r6 = f8777l
            java.util.List r0 = r6.mo25495b(r2, r4, r5, r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0141:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0155
            java.lang.Object r2 = r0.next()
            c.b0.a.d.a r2 = (p040c.p313b0.p314a.p317d.C4158a) r2
            java.util.Map r2 = r2.mo25488a()
            r3.add(r2)
            goto L_0x0141
        L_0x0155:
            r1.success(r3)
            goto L_0x01b7
        L_0x0159:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c.b0.a.d.c r2 = f8777l
            c.b0.a.d.f r2 = r2.f8766a
            java.util.List r2 = r2.mo25506c()
            java.util.Iterator r2 = r2.iterator()
        L_0x016a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01b4
            java.lang.Object r3 = r2.next()
            c.b0.a.d.e r3 = (p040c.p313b0.p314a.p317d.C4162e) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            c.b0.a.d.c r5 = f8777l
            c.b0.a.d.b r5 = r5.f8767b
            java.lang.Long r6 = r3.f8769a
            java.util.List r5 = r5.mo25491c(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x0189:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x019d
            java.lang.Object r6 = r5.next()
            c.b0.a.d.a r6 = (p040c.p313b0.p314a.p317d.C4158a) r6
            java.util.Map r6 = r6.mo25488a()
            r4.add(r6)
            goto L_0x0189
        L_0x019d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Map r3 = r3.mo25503a()
            java.lang.String r6 = "protectionSpace"
            r5.put(r6, r3)
            java.lang.String r3 = "credentials"
            r5.put(r3, r4)
            r0.add(r5)
            goto L_0x016a
        L_0x01b4:
            r1.success(r0)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.C4164e.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
