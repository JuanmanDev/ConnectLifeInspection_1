package p040c.p200q.p201a.p264c.p275c;

/* renamed from: c.q.a.c.c.j */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C3305j implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3310o f6161e;

    public /* synthetic */ C3305j(C3310o oVar) {
        this.f6161e = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r3 = r0.f6172p.f6180a;
        r4 = r0.f6168l;
        r5 = android.os.Message.obtain();
        r5.what = r1.f6177c;
        r5.arg1 = r1.f6175a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo20367b());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f6178d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.f6169m.mo20365a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009f, code lost:
        r0.mo20356a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            c.q.a.c.c.o r0 = r8.f6161e
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f6167e     // Catch:{ all -> 0x00a8 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x000a:
            java.util.Queue<c.q.a.c.c.r<?>> r1 = r0.f6170n     // Catch:{ all -> 0x00a8 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0017
            r0.mo20361f()     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0017:
            java.util.Queue<c.q.a.c.c.r<?>> r1 = r0.f6170n     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00a8 }
            c.q.a.c.c.r r1 = (p040c.p200q.p201a.p264c.p275c.C3313r) r1     // Catch:{ all -> 0x00a8 }
            android.util.SparseArray<c.q.a.c.c.r<?>> r3 = r0.f6171o     // Catch:{ all -> 0x00a8 }
            int r4 = r1.f6175a     // Catch:{ all -> 0x00a8 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00a8 }
            c.q.a.c.c.t r3 = r0.f6172p     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f6181b     // Catch:{ all -> 0x00a8 }
            c.q.a.c.c.m r4 = new c.q.a.c.c.m     // Catch:{ all -> 0x00a8 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00a8 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a8 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 8
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            r5.toString()
        L_0x0060:
            c.q.a.c.c.t r3 = r0.f6172p
            android.content.Context r3 = r3.f6180a
            android.os.Messenger r4 = r0.f6168l
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f6177c
            r5.what = r6
            int r6 = r1.f6175a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.mo20367b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f6178d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            c.q.a.c.c.p r1 = r0.f6169m     // Catch:{ RemoteException -> 0x009e }
            r1.mo20365a(r5)     // Catch:{ RemoteException -> 0x009e }
            goto L_0x0002
        L_0x009e:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo20356a(r2, r1)
            goto L_0x0002
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p275c.C3305j.run():void");
    }
}