package p040c.p474u.p475a.p476a.p479c.p480c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p040c.p474u.p475a.p476a.p477a.C7587a;
import p040c.p474u.p475a.p476a.p479c.C7590b;
import p040c.p474u.p475a.p476a.p481d.C7592a;
import p040c.p496x.p497a.p498a.p499a.p500a.C7652d;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7681a;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7682b;
import p040c.p496x.p497a.p498a.p499a.p500a.p507i.C7708a;

/* renamed from: c.u.a.a.c.c.a */
public class C7591a extends C7590b {

    /* renamed from: b */
    public static volatile C7590b f14289b;

    public C7591a(C7652d dVar) {
        super(dVar);
    }

    /* renamed from: e */
    public static C7590b m21575e(C7652d dVar) {
        if (f14289b == null) {
            synchronized (C7591a.class) {
                if (f14289b == null) {
                    f14289b = new C7591a(dVar);
                }
            }
        }
        return f14289b;
    }

    /* renamed from: a */
    public C7587a mo33050a(String str, HashMap<String, String> hashMap, boolean z, C7682b bVar) {
        if (TextUtils.isEmpty(str)) {
            C7708a.m21819c("UniversalService", "url is null");
            return null;
        }
        mo33055h(hashMap);
        if (z) {
            return mo33052d(this.f14288a, str, hashMap, bVar, mo33054g(hashMap));
        }
        return mo33052d(this.f14288a, str, C7681a.m21746b(hashMap, C7681a.m21750f(), "sign"), bVar, (Map<String, String>) null);
    }

    /* renamed from: c */
    public C7587a mo33051c(String str, HashMap<String, String> hashMap, boolean z, C7682b bVar) {
        if (TextUtils.isEmpty(str)) {
            C7708a.m21819c("UniversalService", "url is null");
            return null;
        }
        mo33055h(hashMap);
        if (z) {
            return mo33053f(this.f14288a, str, hashMap, bVar, mo33054g(hashMap));
        }
        return mo33053f(this.f14288a, str, C7681a.m21746b(hashMap, C7681a.m21750f(), "sign"), bVar, (Map<String, String>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x009e A[Catch:{ HttpException -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004b A[Catch:{ HttpException -> 0x00a7 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p474u.p475a.p476a.p477a.C7587a mo33052d(p040c.p496x.p497a.p498a.p499a.p500a.C7652d r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7682b r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r3 = this;
            c.u.a.a.a.a r0 = new c.u.a.a.a.a
            r0.<init>()
            r1 = 0
            if (r8 == 0) goto L_0x002f
            boolean r2 = r8.isEmpty()     // Catch:{ HttpException -> 0x00a7 }
            if (r2 != 0) goto L_0x002f
            c.x.a.a.a.a.e.a r4 = r4.get()     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.b r4 = r4.mo33104f(r5)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.a r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7653a) r4     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.e r4 = r4.mo33107g(r6)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.a r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7653a) r4     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.b r4 = r4.mo33101c(r8)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.a r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7653a) r4     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.b r4 = r4.mo33103e(r7)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.a r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7653a) r4     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.f.d r4 = r4.mo33100a()     // Catch:{ HttpException -> 0x00a7 }
            goto L_0x0049
        L_0x002f:
            c.x.a.a.a.a.e.a r4 = r4.get()     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.b r4 = r4.mo33104f(r5)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.a r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7653a) r4     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.e r4 = r4.mo33107g(r6)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.a r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7653a) r4     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.b r4 = r4.mo33103e(r7)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.e.a r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7653a) r4     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.f.d r4 = r4.mo33100a()     // Catch:{ HttpException -> 0x00a7 }
        L_0x0049:
            if (r4 == 0) goto L_0x009e
            boolean r5 = r4.mo33124d()     // Catch:{ HttpException -> 0x00a7 }
            if (r5 == 0) goto L_0x007b
            r5 = 1
            r0.mo33049f(r5)     // Catch:{ HttpException -> 0x00a7 }
            c.x.a.a.a.a.f.d$b r4 = r4.mo33121a()     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r4 = r4.mo33125a()     // Catch:{ HttpException -> 0x00a7 }
            r0.mo33048e(r4)     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r6 = "UniversalService"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ HttpException -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x00a7 }
            r7.<init>()     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r8 = "result = "
            r7.append(r8)     // Catch:{ HttpException -> 0x00a7 }
            r7.append(r4)     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r4 = r7.toString()     // Catch:{ HttpException -> 0x00a7 }
            r5[r1] = r4     // Catch:{ HttpException -> 0x00a7 }
            p040c.p496x.p497a.p498a.p499a.p500a.p507i.C7708a.m21818b(r6, r5)     // Catch:{ HttpException -> 0x00a7 }
            goto L_0x00d1
        L_0x007b:
            r0.mo33049f(r1)     // Catch:{ HttpException -> 0x00a7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x00a7 }
            r5.<init>()     // Catch:{ HttpException -> 0x00a7 }
            int r6 = r4.mo33122b()     // Catch:{ HttpException -> 0x00a7 }
            r5.append(r6)     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r4 = r4.mo33123c()     // Catch:{ HttpException -> 0x00a7 }
            r5.append(r4)     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r4 = r5.toString()     // Catch:{ HttpException -> 0x00a7 }
            r0.mo33047d(r4)     // Catch:{ HttpException -> 0x00a7 }
            goto L_0x00d1
        L_0x009e:
            r0.mo33049f(r1)     // Catch:{ HttpException -> 0x00a7 }
            java.lang.String r4 = "hiResponse is NULL"
            r0.mo33047d(r4)     // Catch:{ HttpException -> 0x00a7 }
            goto L_0x00d1
        L_0x00a7:
            r4 = move-exception
            r4.printStackTrace()
            r0.mo33049f(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.getMessage()
            r5.append(r6)
            java.lang.String r6 = ":"
            r5.append(r6)
            java.lang.Throwable r4 = r4.getCause()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = p040c.p474u.p475a.p476a.p481d.C7593b.m21585a(r4)
            r0.mo33047d(r4)
        L_0x00d1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p474u.p475a.p476a.p479c.p480c.C7591a.mo33052d(c.x.a.a.a.a.d, java.lang.String, java.util.Map, c.x.a.a.a.a.f.h.b, java.util.Map):c.u.a.a.a.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0098 A[Catch:{ HttpException -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0045 A[Catch:{ HttpException -> 0x00a1 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p474u.p475a.p476a.p477a.C7587a mo33053f(p040c.p496x.p497a.p498a.p499a.p500a.C7652d r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7682b r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r3 = this;
            c.u.a.a.a.a r0 = new c.u.a.a.a.a
            r0.<init>()
            r1 = 0
            if (r8 == 0) goto L_0x002c
            boolean r2 = r8.isEmpty()     // Catch:{ HttpException -> 0x00a1 }
            if (r2 != 0) goto L_0x002c
            c.x.a.a.a.a.e.d r4 = r4.mo33082a()     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.b r4 = r4.mo33104f(r5)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.d r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7656d) r4     // Catch:{ HttpException -> 0x00a1 }
            r4.mo33106h(r6)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.b r4 = r4.mo33101c(r8)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.d r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7656d) r4     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.b r4 = r4.mo33103e(r7)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.d r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7656d) r4     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.f.d r4 = r4.mo33100a()     // Catch:{ HttpException -> 0x00a1 }
            goto L_0x0043
        L_0x002c:
            c.x.a.a.a.a.e.d r4 = r4.mo33082a()     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.b r4 = r4.mo33104f(r5)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.d r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7656d) r4     // Catch:{ HttpException -> 0x00a1 }
            r4.mo33106h(r6)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.b r4 = r4.mo33103e(r7)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.e.d r4 = (p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7656d) r4     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.f.d r4 = r4.mo33100a()     // Catch:{ HttpException -> 0x00a1 }
        L_0x0043:
            if (r4 == 0) goto L_0x0098
            boolean r5 = r4.mo33124d()     // Catch:{ HttpException -> 0x00a1 }
            if (r5 == 0) goto L_0x0075
            r5 = 1
            r0.mo33049f(r5)     // Catch:{ HttpException -> 0x00a1 }
            c.x.a.a.a.a.f.d$b r4 = r4.mo33121a()     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r4 = r4.mo33125a()     // Catch:{ HttpException -> 0x00a1 }
            r0.mo33048e(r4)     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r6 = "UniversalService"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ HttpException -> 0x00a1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x00a1 }
            r7.<init>()     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r8 = "result = "
            r7.append(r8)     // Catch:{ HttpException -> 0x00a1 }
            r7.append(r4)     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r4 = r7.toString()     // Catch:{ HttpException -> 0x00a1 }
            r5[r1] = r4     // Catch:{ HttpException -> 0x00a1 }
            p040c.p496x.p497a.p498a.p499a.p500a.p507i.C7708a.m21818b(r6, r5)     // Catch:{ HttpException -> 0x00a1 }
            goto L_0x00cb
        L_0x0075:
            r0.mo33049f(r1)     // Catch:{ HttpException -> 0x00a1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x00a1 }
            r5.<init>()     // Catch:{ HttpException -> 0x00a1 }
            int r6 = r4.mo33122b()     // Catch:{ HttpException -> 0x00a1 }
            r5.append(r6)     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r4 = r4.mo33123c()     // Catch:{ HttpException -> 0x00a1 }
            r5.append(r4)     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r4 = r5.toString()     // Catch:{ HttpException -> 0x00a1 }
            r0.mo33047d(r4)     // Catch:{ HttpException -> 0x00a1 }
            goto L_0x00cb
        L_0x0098:
            r0.mo33049f(r1)     // Catch:{ HttpException -> 0x00a1 }
            java.lang.String r4 = "hiResponse is NULL"
            r0.mo33047d(r4)     // Catch:{ HttpException -> 0x00a1 }
            goto L_0x00cb
        L_0x00a1:
            r4 = move-exception
            r4.printStackTrace()
            r0.mo33049f(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.getMessage()
            r5.append(r6)
            java.lang.String r6 = ":"
            r5.append(r6)
            java.lang.Throwable r4 = r4.getCause()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = p040c.p474u.p475a.p476a.p481d.C7593b.m21585a(r4)
            r0.mo33047d(r4)
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p474u.p475a.p476a.p479c.p480c.C7591a.mo33053f(c.x.a.a.a.a.d, java.lang.String, java.util.Map, c.x.a.a.a.a.f.h.b, java.util.Map):c.u.a.a.a.a");
    }

    /* renamed from: g */
    public final Map<String, String> mo33054g(HashMap<String, String> hashMap) {
        String a = C7681a.m21745a(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("X-Sign-For", a);
        return hashMap2;
    }

    /* renamed from: h */
    public final HashMap<String, String> mo33055h(HashMap<String, String> hashMap) {
        if (!(hashMap == null || hashMap.size() == 0 || !hashMap.containsKey("appSecret"))) {
            hashMap.put("appSecret", new C7592a().mo33056a(hashMap.get("appSecret"), "D5B6D8584F94B432", "205681D89D731A8F"));
        }
        return hashMap;
    }
}
