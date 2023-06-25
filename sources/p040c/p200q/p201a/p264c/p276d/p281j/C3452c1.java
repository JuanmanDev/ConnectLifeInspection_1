package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Looper;
import android.os.Message;
import p040c.p200q.p201a.p264c.p294g.p300f.C3656n;

/* renamed from: c.q.a.c.d.j.c1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3452c1 extends C3656n {

    /* renamed from: a */
    public final /* synthetic */ C3453d f6406a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3452c1(C3453d dVar, Looper looper) {
        super(looper);
        this.f6406a = dVar;
    }

    /* renamed from: a */
    public static final void m8755a(Message message) {
        C3460d1 d1Var = (C3460d1) message.obj;
        d1Var.mo20692b();
        d1Var.mo20695e();
    }

    /* renamed from: b */
    public static final boolean m8756b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            c.q.a.c.d.j.d r0 = r7.f6406a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f6414G
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m8756b(r8)
            if (r0 == 0) goto L_0x0015
            m8755a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            c.q.a.c.d.j.d r0 = r7.f6406a
            boolean r0 = r0.mo20679r()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            c.q.a.c.d.j.d r0 = r7.f6406a
            boolean r0 = r0.mo20666d()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            c.q.a.c.d.j.d r0 = r7.f6406a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f6411D = r1
            c.q.a.c.d.j.d r8 = r7.f6406a
            boolean r8 = p040c.p200q.p201a.p264c.p276d.p281j.C3453d.m8769f0(r8)
            if (r8 == 0) goto L_0x005f
            c.q.a.c.d.j.d r8 = r7.f6406a
            boolean r0 = r8.f6412E
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.mo20671g0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            c.q.a.c.d.j.d r8 = r7.f6406a
            com.google.android.gms.common.ConnectionResult r0 = r8.f6411D
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.ConnectionResult r8 = r8.f6411D
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0071:
            c.q.a.c.d.j.d r0 = r7.f6406a
            c.q.a.c.d.j.d$c r0 = r0.f6424t
            r0.mo20564a(r8)
            c.q.a.c.d.j.d r0 = r7.f6406a
            r0.mo20654J(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            c.q.a.c.d.j.d r8 = r7.f6406a
            com.google.android.gms.common.ConnectionResult r0 = r8.f6411D
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.ConnectionResult r8 = r8.f6411D
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0092:
            c.q.a.c.d.j.d r0 = r7.f6406a
            c.q.a.c.d.j.d$c r0 = r0.f6424t
            r0.mo20564a(r8)
            c.q.a.c.d.j.d r0 = r7.f6406a
            r0.mo20654J(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            c.q.a.c.d.j.d r8 = r7.f6406a
            c.q.a.c.d.j.d$c r8 = r8.f6424t
            r8.mo20564a(r0)
            c.q.a.c.d.j.d r8 = r7.f6406a
            r8.mo20654J(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            c.q.a.c.d.j.d r0 = r7.f6406a
            r0.mo20671g0(r3, (android.os.IInterface) null)
            c.q.a.c.d.j.d r0 = r7.f6406a
            c.q.a.c.d.j.d$a r1 = r0.f6429y
            if (r1 == 0) goto L_0x00d7
            c.q.a.c.d.j.d$a r0 = r0.f6429y
            int r1 = r8.arg2
            r0.mo20688d(r1)
        L_0x00d7:
            c.q.a.c.d.j.d r0 = r7.f6406a
            int r8 = r8.arg2
            r0.mo20655K(r8)
            c.q.a.c.d.j.d r8 = r7.f6406a
            p040c.p200q.p201a.p264c.p276d.p281j.C3453d.m8768e0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            c.q.a.c.d.j.d r0 = r7.f6406a
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            m8755a(r8)
            return
        L_0x00f4:
            boolean r0 = m8756b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            c.q.a.c.d.j.d1 r8 = (p040c.p200q.p201a.p264c.p276d.p281j.C3460d1) r8
            r8.mo20693c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0120:
            m8755a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p281j.C3452c1.handleMessage(android.os.Message):void");
    }
}
