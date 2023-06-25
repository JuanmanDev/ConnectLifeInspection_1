package p040c.p048b.p049a.p050a.p051a.p067t;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.t.j */
/* compiled from: ThirdPartyResourceParser */
public class C1481j {

    /* renamed from: d */
    public static final String f658d = "c.b.a.a.a.t.j";

    /* renamed from: a */
    public final String f659a;

    /* renamed from: b */
    public final Context f660b;

    /* renamed from: c */
    public final String f661c = mo15351f();

    public C1481j(Context context, String str) {
        this.f659a = str;
        this.f660b = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098 A[SYNTHETIC, Splitter:B:34:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7 A[SYNTHETIC, Splitter:B:39:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc A[SYNTHETIC, Splitter:B:47:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fb A[SYNTHETIC, Splitter:B:52:0x00fb] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m820g(java.io.InputStream r9) {
        /*
            java.lang.String r0 = "Unable to close BufferedReader: "
            java.lang.String r1 = "Unable to close InputStreamReader: "
            r2 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0070, all -> 0x006a }
            r9.<init>(r3)     // Catch:{ IOException -> 0x0070, all -> 0x006a }
            java.lang.String r2 = r9.readLine()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            if (r2 == 0) goto L_0x0025
            java.lang.String r4 = "﻿"
            boolean r4 = r2.startsWith(r4)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            if (r4 == 0) goto L_0x0025
            r4 = 1
            java.lang.String r2 = r2.substring(r4)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
        L_0x0025:
            r3.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0042
        L_0x0029:
            r3 = move-exception
            java.lang.String r4 = f658d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r3.getMessage()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m838k(r4, r1)
        L_0x0042:
            r9.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x00d5
        L_0x0047:
            r9 = move-exception
            java.lang.String r1 = f658d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r9 = r9.getMessage()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m838k(r1, r9)
            goto L_0x00d5
        L_0x0062:
            r2 = move-exception
            goto L_0x00da
        L_0x0065:
            r4 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x007c
        L_0x006a:
            r9 = move-exception
            r8 = r2
            r2 = r9
            r9 = r8
            goto L_0x00da
        L_0x0070:
            r4 = move-exception
            r9 = r2
            r2 = r3
            goto L_0x007b
        L_0x0074:
            r9 = move-exception
            r3 = r2
            r2 = r9
            r9 = r3
            goto L_0x00da
        L_0x0079:
            r4 = move-exception
            r9 = r2
        L_0x007b:
            r3 = r9
        L_0x007c:
            java.lang.String r5 = f658d     // Catch:{ all -> 0x00d6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r6.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r7 = "Unable read from asset: "
            r6.append(r7)     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00d6 }
            r6.append(r4)     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00d6 }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(r5, r4)     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x00b5
            r2.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x00b5
        L_0x009c:
            r2 = move-exception
            java.lang.String r4 = f658d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r2.getMessage()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m838k(r4, r1)
        L_0x00b5:
            if (r9 == 0) goto L_0x00d4
            r9.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00d4
        L_0x00bb:
            r9 = move-exception
            java.lang.String r1 = f658d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r9 = r9.getMessage()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m838k(r1, r9)
        L_0x00d4:
            r2 = r3
        L_0x00d5:
            return r2
        L_0x00d6:
            r3 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
        L_0x00da:
            if (r3 == 0) goto L_0x00f9
            r3.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00f9
        L_0x00e0:
            r3 = move-exception
            java.lang.String r4 = f658d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r3.getMessage()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m838k(r4, r1)
        L_0x00f9:
            if (r9 == 0) goto L_0x0118
            r9.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x0118
        L_0x00ff:
            r9 = move-exception
            java.lang.String r1 = f658d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r9 = r9.getMessage()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m838k(r1, r9)
        L_0x0118:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p067t.C1481j.m820g(java.io.InputStream):java.lang.String");
    }

    /* renamed from: a */
    public String mo15346a() {
        if (mo15350e()) {
            return this.f661c;
        }
        C1485a.m838k(f658d, "Unable to get API Key from Assests");
        String d = mo15349d("APIKey");
        if (d != null) {
            return d;
        }
        return mo15349d("AmazonAPIKey");
    }

    /* renamed from: b */
    public String mo15347b() {
        return "api_key.txt";
    }

    /* renamed from: c */
    public String mo15348c() {
        return this.f659a;
    }

    /* renamed from: d */
    public final String mo15349d(String str) {
        if (this.f660b == null) {
            return null;
        }
        C1485a.m832e(f658d, "Attempting to parse API Key from meta data in Android manifest");
        try {
            ApplicationInfo applicationInfo = this.f660b.getPackageManager().getApplicationInfo(this.f659a, 128);
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getString(str);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = f658d;
            C1485a.m838k(str2, "(key=" + str + ") " + e.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo15350e() {
        return this.f661c != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[Catch:{ IOException -> 0x0054, NameNotFoundException -> 0x003a }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15351f() {
        /*
            r5 = this;
            java.lang.String r0 = "Unable to get api key asset document: "
            android.content.Context r1 = r5.f660b
            r2 = 0
            if (r1 == 0) goto L_0x006d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = r5.mo15348c()     // Catch:{ all -> 0x0032 }
            android.content.res.Resources r1 = r1.getResourcesForApplication(r3)     // Catch:{ all -> 0x0032 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = r5.mo15347b()     // Catch:{ all -> 0x0032 }
            java.io.InputStream r1 = r1.open(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = f658d     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = "Attempting to parse API Key from assets directory"
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(r3, r4)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = m820g(r1)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x0054, NameNotFoundException -> 0x003a }
        L_0x002f:
            return r3
        L_0x0030:
            r3 = move-exception
            goto L_0x0034
        L_0x0032:
            r3 = move-exception
            r1 = r2
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0054, NameNotFoundException -> 0x003a }
        L_0x0039:
            throw r3     // Catch:{ IOException -> 0x0054, NameNotFoundException -> 0x003a }
        L_0x003a:
            r1 = move-exception
            java.lang.String r3 = f658d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r1.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(r3, r0)
            goto L_0x006d
        L_0x0054:
            r1 = move-exception
            java.lang.String r3 = f658d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r1.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(r3, r0)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p067t.C1481j.mo15351f():java.lang.String");
    }
}
