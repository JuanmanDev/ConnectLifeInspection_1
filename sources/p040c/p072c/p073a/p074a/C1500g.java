package p040c.p072c.p073a.p074a;

/* renamed from: c.c.a.a.g */
/* compiled from: FileIOUtils */
public final class C1500g {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048 A[SYNTHETIC, Splitter:B:27:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053 A[SYNTHETIC, Splitter:B:33:0x0053] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m916a(java.io.File r4, java.lang.String r5, boolean r6) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x005c
            if (r5 != 0) goto L_0x0006
            goto L_0x005c
        L_0x0006:
            boolean r1 = p040c.p072c.p073a.p074a.C1493b0.m879c(r4)
            if (r1 != 0) goto L_0x0022
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "create file <"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "> failed."
            r5.append(r4)
            r5.toString()
            return r0
        L_0x0022:
            r1 = 0
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0042 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x0042 }
            r3.<init>(r4, r6)     // Catch:{ IOException -> 0x0042 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0042 }
            r2.write(r5)     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r4 = 1
            r2.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0039:
            return r4
        L_0x003a:
            r4 = move-exception
            r1 = r2
            goto L_0x0051
        L_0x003d:
            r4 = move-exception
            r1 = r2
            goto L_0x0043
        L_0x0040:
            r4 = move-exception
            goto L_0x0051
        L_0x0042:
            r4 = move-exception
        L_0x0043:
            r4.printStackTrace()     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0050:
            return r0
        L_0x0051:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r5 = move-exception
            r5.printStackTrace()
        L_0x005b:
            throw r4
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p072c.p073a.p074a.C1500g.m916a(java.io.File, java.lang.String, boolean):boolean");
    }

    /* renamed from: b */
    public static boolean m917b(String str, String str2, boolean z) {
        return m916a(C1493b0.m888l(str), str2, z);
    }
}
