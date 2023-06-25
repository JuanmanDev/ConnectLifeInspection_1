package p040c.p077d.p078a.p081k.p089k;

import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1565a;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

/* renamed from: c.d.a.k.k.t */
/* compiled from: StreamEncoder */
public class C1773t implements C1565a<InputStream> {

    /* renamed from: a */
    public final C1692b f1339a;

    public C1773t(C1692b bVar) {
        this.f1339a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC, Splitter:B:21:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo15605a(@androidx.annotation.NonNull java.io.InputStream r4, @androidx.annotation.NonNull java.io.File r5, @androidx.annotation.NonNull p040c.p077d.p078a.p081k.C1571e r6) {
        /*
            r3 = this;
            c.d.a.k.j.z.b r6 = r3.f1339a
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r6 = r6.mo15901d(r1, r0)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002d }
            r2.<init>(r5)     // Catch:{ IOException -> 0x002d }
        L_0x0013:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r1 = -1
            if (r5 == r1) goto L_0x001e
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            goto L_0x0013
        L_0x001e:
            r2.close()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x0026:
            r4 = move-exception
            r1 = r2
            goto L_0x003f
        L_0x0029:
            r1 = r2
            goto L_0x002d
        L_0x002b:
            r4 = move-exception
            goto L_0x003f
        L_0x002d:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            c.d.a.k.j.z.b r4 = r3.f1339a
            r4.put(r6)
            return r0
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            c.d.a.k.j.z.b r5 = r3.f1339a
            r5.put(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p089k.C1773t.mo15605a(java.io.InputStream, java.io.File, c.d.a.k.e):boolean");
    }
}
