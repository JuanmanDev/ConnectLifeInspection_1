package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.WorkerThread;
import java.net.URL;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

@WorkerThread
/* renamed from: c.q.a.c.i.b.e7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5471e7 implements Runnable {

    /* renamed from: e */
    public final URL f10435e;

    /* renamed from: l */
    public final String f10436l;

    /* renamed from: m */
    public final /* synthetic */ C5483f7 f10437m;

    /* renamed from: n */
    public final C5624r4 f10438n;

    public C5471e7(C5483f7 f7Var, String str, URL url, byte[] bArr, Map map, C5624r4 r4Var, byte[] bArr2) {
        this.f10437m = f7Var;
        C3495o.m8904f(str);
        C3495o.m8908j(url);
        C3495o.m8908j(r4Var);
        this.f10435e = url;
        this.f10438n = r4Var;
        this.f10436l = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28217a(int i, Exception exc, byte[] bArr, Map map) {
        C5624r4 r4Var = this.f10438n;
        r4Var.f10818a.mo28635h(this.f10436l, i, exc, bArr, map);
    }

    /* renamed from: b */
    public final void mo28218b(int i, Exception exc, byte[] bArr, Map map) {
        this.f10437m.f10699a.mo28486a().mo28540z(new C5447c7(this, i, exc, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC, Splitter:B:29:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            c.q.a.c.i.b.f7 r0 = r10.f10437m
            r0.mo28491g()
            r0 = 0
            r1 = 0
            c.q.a.c.i.b.f7 r2 = r10.f10437m     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            java.net.URL r3 = r10.f10435e     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            if (r4 == 0) goto L_0x0080
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            c.q.a.c.i.b.t4 r4 = r2.f10699a     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r4.mo28649z()     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            c.q.a.c.i.b.t4 r2 = r2.f10699a     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r2.mo28649z()     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x0077, all -> 0x0074 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0068 }
            r5.<init>()     // Catch:{ all -> 0x0068 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x0068 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0066 }
        L_0x004a:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0066 }
            if (r8 <= 0) goto L_0x0054
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x0066 }
            goto L_0x004a
        L_0x0054:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x005d
            r6.close()     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
        L_0x005d:
            if (r3 == 0) goto L_0x0062
            r3.disconnect()
        L_0x0062:
            r10.mo28218b(r2, r1, r0, r4)
            return
        L_0x0066:
            r0 = move-exception
            goto L_0x006a
        L_0x0068:
            r0 = move-exception
            r6 = r1
        L_0x006a:
            if (r6 == 0) goto L_0x006f
            r6.close()     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
        L_0x006f:
            throw r0     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            goto L_0x008e
        L_0x0072:
            r0 = move-exception
            goto L_0x009d
        L_0x0074:
            r0 = move-exception
            r4 = r1
            goto L_0x008e
        L_0x0077:
            r0 = move-exception
            r4 = r1
            goto L_0x009d
        L_0x007a:
            r2 = move-exception
            r4 = r1
            goto L_0x008b
        L_0x007d:
            r2 = move-exception
            r4 = r1
            goto L_0x009a
        L_0x0080:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
        L_0x0088:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x008b:
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            r3.disconnect()
        L_0x0093:
            r10.mo28218b(r2, r1, r1, r4)
            throw r0
        L_0x0097:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x009a:
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x009d:
            if (r3 == 0) goto L_0x00a2
            r3.disconnect()
        L_0x00a2:
            r10.mo28218b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5471e7.run():void");
    }
}
