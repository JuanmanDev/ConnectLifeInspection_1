package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p348d.p349a.p350a.C5821g;

/* renamed from: c.q.a.d.a.a.c.t */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5815t {

    /* renamed from: n */
    public static final Map f11321n = new HashMap();

    /* renamed from: a */
    public final Context f11322a;

    /* renamed from: b */
    public final C5804i f11323b;

    /* renamed from: c */
    public final String f11324c;

    /* renamed from: d */
    public final List f11325d = new ArrayList();
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: e */
    public final Set f11326e = new HashSet();

    /* renamed from: f */
    public final Object f11327f = new Object();

    /* renamed from: g */
    public boolean f11328g;

    /* renamed from: h */
    public final Intent f11329h;

    /* renamed from: i */
    public final WeakReference f11330i;

    /* renamed from: j */
    public final IBinder.DeathRecipient f11331j = new C5807l(this);
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: k */
    public final AtomicInteger f11332k = new AtomicInteger(0);
    @Nullable

    /* renamed from: l */
    public ServiceConnection f11333l;
    @Nullable

    /* renamed from: m */
    public IInterface f11334m;

    public C5815t(Context context, C5804i iVar, String str, Intent intent, C5821g gVar, @Nullable C5810o oVar, byte[] bArr) {
        this.f11322a = context;
        this.f11323b = iVar;
        this.f11324c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.f11329h = intent;
        this.f11330i = new WeakReference((Object) null);
    }

    /* renamed from: h */
    public static /* synthetic */ void m16503h(C5815t tVar) {
        tVar.f11323b.mo28898d("reportBinderDeath", new Object[0]);
        C5810o oVar = (C5810o) tVar.f11330i.get();
        if (oVar != null) {
            tVar.f11323b.mo28898d("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.f11323b.mo28898d("%s : Binder has died.", tVar.f11324c);
            for (C5805j c : tVar.f11325d) {
                c.mo28902c(tVar.mo28913s());
            }
            tVar.f11325d.clear();
        }
        tVar.mo28914t();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m16508m(C5815t tVar, C5805j jVar) {
        if (tVar.f11334m == null && !tVar.f11328g) {
            tVar.f11323b.mo28898d("Initiate binding to the service.", new Object[0]);
            tVar.f11325d.add(jVar);
            C5814s sVar = new C5814s(tVar, (C5813r) null);
            tVar.f11333l = sVar;
            tVar.f11328g = true;
            if (!tVar.f11322a.bindService(tVar.f11329h, sVar, 1)) {
                tVar.f11323b.mo28898d("Failed to bind to the service.", new Object[0]);
                tVar.f11328g = false;
                for (C5805j c : tVar.f11325d) {
                    c.mo28902c(new zzu());
                }
                tVar.f11325d.clear();
            }
        } else if (tVar.f11328g) {
            tVar.f11323b.mo28898d("Waiting to bind to the service.", new Object[0]);
            tVar.f11325d.add(jVar);
        } else {
            jVar.run();
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m16509n(C5815t tVar) {
        tVar.f11323b.mo28898d("linkToDeath", new Object[0]);
        try {
            tVar.f11334m.asBinder().linkToDeath(tVar.f11331j, 0);
        } catch (RemoteException e) {
            tVar.f11323b.mo28897c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m16510o(C5815t tVar) {
        tVar.f11323b.mo28898d("unlinkToDeath", new Object[0]);
        tVar.f11334m.asBinder().unlinkToDeath(tVar.f11331j, 0);
    }

    /* renamed from: c */
    public final Handler mo28908c() {
        Handler handler;
        synchronized (f11321n) {
            if (!f11321n.containsKey(this.f11324c)) {
                HandlerThread handlerThread = new HandlerThread(this.f11324c, 10);
                handlerThread.start();
                f11321n.put(this.f11324c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) f11321n.get(this.f11324c);
        }
        return handler;
    }

    @Nullable
    /* renamed from: e */
    public final IInterface mo28909e() {
        return this.f11334m;
    }

    /* renamed from: p */
    public final void mo28910p(C5805j jVar, @Nullable C5773k kVar) {
        synchronized (this.f11327f) {
            this.f11326e.add(kVar);
            kVar.mo28859a().mo28842c(new C5806k(this, kVar));
        }
        synchronized (this.f11327f) {
            if (this.f11332k.getAndIncrement() > 0) {
                this.f11323b.mo28895a("Already connected to the service.", new Object[0]);
            }
        }
        mo28908c().post(new C5808m(this, jVar.mo28901b(), jVar));
    }

    /* renamed from: q */
    public final /* synthetic */ void mo28911q(C5773k kVar, C5771j jVar) {
        synchronized (this.f11327f) {
            this.f11326e.remove(kVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        mo28908c().post(new p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5809n(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28912r(p040c.p200q.p201a.p264c.p347m.C5773k r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f11327f
            monitor-enter(r0)
            java.util.Set r1 = r3.f11326e     // Catch:{ all -> 0x0039 }
            r1.remove(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r3.f11327f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f11332k     // Catch:{ all -> 0x0036 }
            int r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f11332k     // Catch:{ all -> 0x0036 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            c.q.a.d.a.a.c.i r0 = r3.f11323b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0036 }
            r0.mo28898d(r1, r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            c.q.a.d.a.a.c.n r4 = new c.q.a.d.a.a.c.n
            r4.<init>(r3)
            android.os.Handler r0 = r3.mo28908c()
            r0.post(r4)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5815t.mo28912r(c.q.a.c.m.k):void");
    }

    /* renamed from: s */
    public final RemoteException mo28913s() {
        if (Build.VERSION.SDK_INT < 15) {
            return new RemoteException();
        }
        return new RemoteException(String.valueOf(this.f11324c).concat(" : Binder has died."));
    }

    /* renamed from: t */
    public final void mo28914t() {
        synchronized (this.f11327f) {
            for (C5773k d : this.f11326e) {
                d.mo28862d(mo28913s());
            }
            this.f11326e.clear();
        }
    }
}
