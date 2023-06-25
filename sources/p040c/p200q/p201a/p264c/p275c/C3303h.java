package p040c.p200q.p201a.p264c.p275c;

import android.os.Handler;

/* renamed from: c.q.a.c.c.h */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C3303h implements Handler.Callback {

    /* renamed from: e */
    public final /* synthetic */ C3310o f6159e;

    public /* synthetic */ C3303h(C3310o oVar) {
        this.f6159e = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r2.mo20368c(new com.google.android.gms.cloudmessaging.zzq(4, "Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r2.mo20366a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            c.q.a.c.c.o r0 = r4.f6159e
            int r1 = r5.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x001f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 41
            r2.<init>(r3)
            java.lang.String r3 = "Received response to request: "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
        L_0x001f:
            monitor-enter(r0)
            android.util.SparseArray<c.q.a.c.c.r<?>> r2 = r0.f6171o     // Catch:{ all -> 0x0066 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0066 }
            c.q.a.c.c.r r2 = (p040c.p200q.p201a.p264c.p275c.C3313r) r2     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x003e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r2 = 50
            r5.<init>(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "Received response for unknown request: "
            r5.append(r2)     // Catch:{ all -> 0x0066 }
            r5.append(r1)     // Catch:{ all -> 0x0066 }
            r5.toString()     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x003e:
            android.util.SparseArray<c.q.a.c.c.r<?>> r3 = r0.f6171o     // Catch:{ all -> 0x0066 }
            r3.remove(r1)     // Catch:{ all -> 0x0066 }
            r0.mo20361f()     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0061
            com.google.android.gms.cloudmessaging.zzq r5 = new com.google.android.gms.cloudmessaging.zzq
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r3 = 0
            r5.<init>(r0, r1, r3)
            r2.mo20368c(r5)
            goto L_0x0064
        L_0x0061:
            r2.mo20366a(r5)
        L_0x0064:
            r5 = 1
            return r5
        L_0x0066:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p275c.C3303h.handleMessage(android.os.Message):boolean");
    }
}
