package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.WorkerThread;
import java.net.URL;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

@WorkerThread
/* renamed from: c.q.a.c.i.b.n3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5575n3 implements Runnable {

    /* renamed from: e */
    public final URL f10691e;

    /* renamed from: l */
    public final byte[] f10692l;

    /* renamed from: m */
    public final C5539k3 f10693m;

    /* renamed from: n */
    public final String f10694n;

    /* renamed from: o */
    public final Map f10695o;

    /* renamed from: p */
    public final /* synthetic */ C5587o3 f10696p;

    public C5575n3(C5587o3 o3Var, String str, URL url, byte[] bArr, Map map, C5539k3 k3Var) {
        this.f10696p = o3Var;
        C3495o.m8904f(str);
        C3495o.m8908j(url);
        C3495o.m8908j(k3Var);
        this.f10691e = url;
        this.f10692l = bArr;
        this.f10693m = k3Var;
        this.f10694n = str;
        this.f10695o = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9 A[SYNTHETIC, Splitter:B:46:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c A[SYNTHETIC, Splitter:B:67:0x012c] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016c A[SYNTHETIC, Splitter:B:79:0x016c] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            c.q.a.c.i.b.o3 r1 = r14.f10696p
            r1.mo28491g()
            r1 = 0
            r2 = 0
            c.q.a.c.i.b.o3 r3 = r14.f10696p     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            java.net.URL r4 = r14.f10691e     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            if (r5 == 0) goto L_0x011d
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            c.q.a.c.i.b.t4 r5 = r3.f10699a     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            r5.mo28649z()     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            c.q.a.c.i.b.t4 r3 = r3.f10699a     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            r3.mo28649z()     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            java.util.Map r5 = r14.f10695o     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            if (r5 == 0) goto L_0x005f
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
        L_0x0043:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            goto L_0x0043
        L_0x005f:
            byte[] r5 = r14.f10692l     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            if (r5 == 0) goto L_0x00ae
            c.q.a.c.i.b.o3 r5 = r14.f10696p     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            c.q.a.c.i.b.y9 r5 = r5.f10663b     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            c.q.a.c.i.b.aa r5 = r5.mo28743f0()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            byte[] r6 = r14.f10692l     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            byte[] r5 = r5.mo28086O(r6)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            c.q.a.c.i.b.o3 r6 = r14.f10696p     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            c.q.a.c.i.b.t4 r6 = r6.f10699a     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            c.q.a.c.i.b.i3 r6 = r6.mo28487b()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            c.q.a.c.i.b.g3 r6 = r6.mo28343v()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            int r7 = r5.length     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            r6.mo28260b(r8, r9)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            r4.connect()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            r3.write(r5)     // Catch:{ IOException -> 0x00a8, all -> 0x00a2 }
            r3.close()     // Catch:{ IOException -> 0x00a8, all -> 0x00a2 }
            goto L_0x00ae
        L_0x00a2:
            r5 = move-exception
            r9 = r1
            r12 = r2
            r2 = r3
            goto L_0x012a
        L_0x00a8:
            r5 = move-exception
            r9 = r1
            r12 = r2
            r2 = r3
            goto L_0x0169
        L_0x00ae:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x010d, all -> 0x0109 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00f5 }
            r3.<init>()     // Catch:{ all -> 0x00f5 }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00f5 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00f3 }
        L_0x00c3:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00f3 }
            if (r7 <= 0) goto L_0x00cd
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00f3 }
            goto L_0x00c3
        L_0x00cd:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00f3 }
            if (r5 == 0) goto L_0x00d6
            r5.close()     // Catch:{ IOException -> 0x0102, all -> 0x00fd }
        L_0x00d6:
            if (r4 == 0) goto L_0x00db
            r4.disconnect()
        L_0x00db:
            c.q.a.c.i.b.o3 r0 = r14.f10696p
            c.q.a.c.i.b.t4 r0 = r0.f10699a
            c.q.a.c.i.b.q4 r0 = r0.mo28486a()
            c.q.a.c.i.b.m3 r1 = new c.q.a.c.i.b.m3
            java.lang.String r6 = r14.f10694n
            c.q.a.c.i.b.k3 r7 = r14.f10693m
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00ef:
            r0.mo28540z(r1)
            return
        L_0x00f3:
            r1 = move-exception
            goto L_0x00f7
        L_0x00f5:
            r1 = move-exception
            r5 = r2
        L_0x00f7:
            if (r5 == 0) goto L_0x00fc
            r5.close()     // Catch:{ IOException -> 0x0102, all -> 0x00fd }
        L_0x00fc:
            throw r1     // Catch:{ IOException -> 0x0102, all -> 0x00fd }
        L_0x00fd:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x012a
        L_0x0102:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x016a
        L_0x0109:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x012a
        L_0x010d:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x016a
        L_0x0113:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r5 = r3
            goto L_0x012a
        L_0x0118:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r10 = r3
            goto L_0x016a
        L_0x011d:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
            throw r3     // Catch:{ IOException -> 0x0164, all -> 0x0125 }
        L_0x0125:
            r3 = move-exception
            r5 = r3
            r9 = r1
            r4 = r2
            r12 = r4
        L_0x012a:
            if (r2 == 0) goto L_0x0146
            r2.close()     // Catch:{ IOException -> 0x0130 }
            goto L_0x0146
        L_0x0130:
            r1 = move-exception
            c.q.a.c.i.b.o3 r2 = r14.f10696p
            c.q.a.c.i.b.t4 r2 = r2.f10699a
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()
            java.lang.String r3 = r14.f10694n
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)
            r2.mo28261c(r0, r3, r1)
        L_0x0146:
            if (r4 == 0) goto L_0x014b
            r4.disconnect()
        L_0x014b:
            c.q.a.c.i.b.o3 r0 = r14.f10696p
            c.q.a.c.i.b.t4 r0 = r0.f10699a
            c.q.a.c.i.b.q4 r0 = r0.mo28486a()
            c.q.a.c.i.b.m3 r1 = new c.q.a.c.i.b.m3
            java.lang.String r7 = r14.f10694n
            c.q.a.c.i.b.k3 r8 = r14.f10693m
            r10 = 0
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.mo28540z(r1)
            throw r5
        L_0x0164:
            r3 = move-exception
            r5 = r3
            r9 = r1
            r4 = r2
            r12 = r4
        L_0x0169:
            r10 = r5
        L_0x016a:
            if (r2 == 0) goto L_0x0186
            r2.close()     // Catch:{ IOException -> 0x0170 }
            goto L_0x0186
        L_0x0170:
            r1 = move-exception
            c.q.a.c.i.b.o3 r2 = r14.f10696p
            c.q.a.c.i.b.t4 r2 = r2.f10699a
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()
            java.lang.String r3 = r14.f10694n
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r3)
            r2.mo28261c(r0, r3, r1)
        L_0x0186:
            if (r4 == 0) goto L_0x018b
            r4.disconnect()
        L_0x018b:
            c.q.a.c.i.b.o3 r0 = r14.f10696p
            c.q.a.c.i.b.t4 r0 = r0.f10699a
            c.q.a.c.i.b.q4 r0 = r0.mo28486a()
            c.q.a.c.i.b.m3 r1 = new c.q.a.c.i.b.m3
            java.lang.String r7 = r14.f10694n
            c.q.a.c.i.b.k3 r8 = r14.f10693m
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5575n3.run():void");
    }
}
