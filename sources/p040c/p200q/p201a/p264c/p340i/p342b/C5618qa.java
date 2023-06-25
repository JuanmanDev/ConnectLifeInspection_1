package p040c.p200q.p201a.p264c.p340i.p342b;

import p040c.p200q.p201a.p264c.p294g.p335i.C5107i4;

/* renamed from: c.q.a.c.i.b.qa */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5618qa {

    /* renamed from: a */
    public C5107i4 f10795a;

    /* renamed from: b */
    public Long f10796b;

    /* renamed from: c */
    public long f10797c;

    /* renamed from: d */
    public final /* synthetic */ C5427b f10798d;

    public /* synthetic */ C5618qa(C5427b bVar, C5606pa paVar) {
        this.f10798d = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e5, code lost:
        if (r14 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ff, code lost:
        if (r14 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p294g.p335i.C5107i4 mo28585a(java.lang.String r18, p040c.p200q.p201a.p264c.p294g.p335i.C5107i4 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo27327K()
            java.util.List r9 = r19.mo27328L()
            c.q.a.c.i.b.b r2 = r1.f10798d
            c.q.a.c.i.b.y9 r2 = r2.f10663b
            r2.mo28743f0()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15497o(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0237
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01eb
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r4)
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.y9 r0 = r0.f10663b
            r0.mo28743f0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15497o(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.t4 r0 = r0.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28341t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo28260b(r2, r4)
            return r5
        L_0x0055:
            c.q.a.c.g.i.i4 r0 = r1.f10795a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f10796b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f10796b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x012c
        L_0x006d:
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.y9 r0 = r0.f10663b
            c.q.a.c.i.b.l r13 = r0.mo28734V()
            r13.mo28029h()
            r13.mo28475i()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo28385P()     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e8 }
            if (r0 != 0) goto L_0x00ac
            c.q.a.c.i.b.t4 r0 = r13.f10699a     // Catch:{ SQLiteException -> 0x00e8 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteException -> 0x00e8 }
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()     // Catch:{ SQLiteException -> 0x00e8 }
            java.lang.String r15 = "Main event not found"
            r0.mo28259a(r15)     // Catch:{ SQLiteException -> 0x00e8 }
            if (r14 == 0) goto L_0x00aa
            r14.close()
        L_0x00aa:
            r0 = r5
            goto L_0x0105
        L_0x00ac:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e8 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e8 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e8 }
            c.q.a.c.g.i.h4 r5 = p040c.p200q.p201a.p264c.p294g.p335i.C5107i4.m14303H()     // Catch:{ IOException -> 0x00d1 }
            p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15490C(r5, r0)     // Catch:{ IOException -> 0x00d1 }
            c.q.a.c.g.i.h4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r5     // Catch:{ IOException -> 0x00d1 }
            c.q.a.c.g.i.t8 r0 = r5.mo27520l()     // Catch:{ IOException -> 0x00d1 }
            c.q.a.c.g.i.i4 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r0     // Catch:{ IOException -> 0x00d1 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e8 }
            if (r14 == 0) goto L_0x0105
            r14.close()
            goto L_0x0105
        L_0x00d1:
            r0 = move-exception
            c.q.a.c.i.b.t4 r5 = r13.f10699a     // Catch:{ SQLiteException -> 0x00e8 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ SQLiteException -> 0x00e8 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ SQLiteException -> 0x00e8 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r18)     // Catch:{ SQLiteException -> 0x00e8 }
            r5.mo28262d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e8 }
            if (r14 == 0) goto L_0x0104
            goto L_0x0101
        L_0x00e8:
            r0 = move-exception
            goto L_0x00f0
        L_0x00ea:
            r0 = move-exception
            r5 = 0
            goto L_0x01e5
        L_0x00ee:
            r0 = move-exception
            r14 = 0
        L_0x00f0:
            c.q.a.c.i.b.t4 r5 = r13.f10699a     // Catch:{ all -> 0x01e3 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ all -> 0x01e3 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x01e3 }
            java.lang.String r12 = "Error selecting main event"
            r5.mo28260b(r12, r0)     // Catch:{ all -> 0x01e3 }
            if (r14 == 0) goto L_0x0104
        L_0x0101:
            r14.close()
        L_0x0104:
            r0 = 0
        L_0x0105:
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x010d
            goto L_0x01d0
        L_0x010d:
            c.q.a.c.g.i.i4 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r5
            r1.f10795a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f10797c = r12
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.y9 r0 = r0.f10663b
            r0.mo28743f0()
            c.q.a.c.g.i.i4 r0 = r1.f10795a
            java.lang.Object r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15497o(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f10796b = r0
        L_0x012c:
            long r12 = r1.f10797c
            r14 = -1
            long r12 = r12 + r14
            r1.f10797c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0171
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.y9 r0 = r0.f10663b
            c.q.a.c.i.b.l r2 = r0.mo28734V()
            r2.mo28029h()
            c.q.a.c.i.b.t4 r0 = r2.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo28260b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo28385P()     // Catch:{ SQLiteException -> 0x0160 }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0160 }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0160 }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x0160 }
            goto L_0x0182
        L_0x0160:
            r0 = move-exception
            c.q.a.c.i.b.t4 r2 = r2.f10699a
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo28260b(r3, r0)
            goto L_0x0182
        L_0x0171:
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.y9 r0 = r0.f10663b
            c.q.a.c.i.b.l r2 = r0.mo28734V()
            long r5 = r1.f10797c
            c.q.a.c.g.i.i4 r7 = r1.f10795a
            r3 = r18
            r2.mo28412v(r3, r4, r5, r7)
        L_0x0182:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c.q.a.c.g.i.i4 r2 = r1.f10795a
            java.util.List r2 = r2.mo27328L()
            java.util.Iterator r2 = r2.iterator()
        L_0x0191:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01b2
            java.lang.Object r3 = r2.next()
            c.q.a.c.g.i.m4 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5170m4) r3
            c.q.a.c.i.b.b r4 = r1.f10798d
            c.q.a.c.i.b.y9 r4 = r4.f10663b
            r4.mo28743f0()
            java.lang.String r4 = r3.mo27418J()
            c.q.a.c.g.i.m4 r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15496n(r8, r4)
            if (r4 != 0) goto L_0x0191
            r0.add(r3)
            goto L_0x0191
        L_0x01b2:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01bd
            r0.addAll(r9)
            r9 = r0
            goto L_0x01ce
        L_0x01bd:
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.t4 r0 = r0.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28341t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo28260b(r2, r10)
        L_0x01ce:
            r0 = r10
            goto L_0x0237
        L_0x01d0:
            c.q.a.c.i.b.b r0 = r1.f10798d
            c.q.a.c.i.b.t4 r0 = r0.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28341t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo28261c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01e3:
            r0 = move-exception
            r5 = r14
        L_0x01e5:
            if (r5 == 0) goto L_0x01ea
            r5.close()
        L_0x01ea:
            throw r0
        L_0x01eb:
            r1.f10796b = r4
            r1.f10795a = r8
            c.q.a.c.i.b.b r2 = r1.f10798d
            c.q.a.c.i.b.y9 r2 = r2.f10663b
            r2.mo28743f0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.m15497o(r8, r5)
            if (r5 == 0) goto L_0x0203
            r2 = r5
        L_0x0203:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f10797c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0221
            c.q.a.c.i.b.b r2 = r1.f10798d
            c.q.a.c.i.b.t4 r2 = r2.f10699a
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()
            c.q.a.c.i.b.g3 r2 = r2.mo28341t()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo28260b(r3, r0)
            goto L_0x0237
        L_0x0221:
            c.q.a.c.i.b.b r2 = r1.f10798d
            c.q.a.c.i.b.y9 r2 = r2.f10663b
            c.q.a.c.i.b.l r2 = r2.mo28734V()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f10797c
            r3 = r18
            r7 = r19
            r2.mo28412v(r3, r4, r5, r7)
        L_0x0237:
            c.q.a.c.g.i.q8 r2 = r19.mo27727z()
            c.q.a.c.g.i.h4 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5091h4) r2
            r2.mo27287E(r0)
            r2.mo27301z()
            r2.mo27298v(r9)
            c.q.a.c.g.i.t8 r0 = r2.mo27520l()
            c.q.a.c.g.i.i4 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5107i4) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5618qa.mo28585a(java.lang.String, c.q.a.c.g.i.i4):c.q.a.c.g.i.i4");
    }
}
