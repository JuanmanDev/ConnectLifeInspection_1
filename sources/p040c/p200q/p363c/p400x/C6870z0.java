package p040c.p200q.p363c.p400x;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;

/* renamed from: c.q.c.x.z0 */
/* compiled from: TopicsSubscriber */
public class C6870z0 {

    /* renamed from: i */
    public static final long f13153i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f13154a;

    /* renamed from: b */
    public final C6841m0 f13155b;

    /* renamed from: c */
    public final C6835j0 f13156c;

    /* renamed from: d */
    public final FirebaseMessaging f13157d;
    @GuardedBy("pendingOperations")

    /* renamed from: e */
    public final Map<String, ArrayDeque<C5773k<Void>>> f13158e = new ArrayMap();

    /* renamed from: f */
    public final ScheduledExecutorService f13159f;
    @GuardedBy("this")

    /* renamed from: g */
    public boolean f13160g = false;

    /* renamed from: h */
    public final C6868y0 f13161h;

    public C6870z0(FirebaseMessaging firebaseMessaging, C6841m0 m0Var, C6868y0 y0Var, C6835j0 j0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f13157d = firebaseMessaging;
        this.f13155b = m0Var;
        this.f13161h = y0Var;
        this.f13156c = j0Var;
        this.f13154a = context;
        this.f13159f = scheduledExecutorService;
    }

    @WorkerThread
    /* renamed from: a */
    public static <T> void m19518a(C5771j<T> jVar) {
        try {
            C5777m.m16410b(jVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public static C5771j<C6870z0> m19519d(FirebaseMessaging firebaseMessaging, C6841m0 m0Var, C6835j0 j0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        return C5777m.m16412d(scheduledExecutorService, new C6855t(context, scheduledExecutorService, firebaseMessaging, m0Var, j0Var));
    }

    /* renamed from: f */
    public static boolean m19520f() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: h */
    public static /* synthetic */ C6870z0 m19521h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C6841m0 m0Var, C6835j0 j0Var) {
        return new C6870z0(firebaseMessaging, m0Var, C6868y0.m19514a(context, scheduledExecutorService), j0Var, context, scheduledExecutorService);
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo31712b(String str) {
        m19518a(this.f13156c.mo31628j(this.f13157d.mo37449c(), str));
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo31713c(String str) {
        m19518a(this.f13156c.mo31629k(this.f13157d.mo37449c(), str));
    }

    /* renamed from: e */
    public boolean mo31714e() {
        return this.f13161h.mo31708b() != null;
    }

    /* renamed from: g */
    public synchronized boolean mo31715g() {
        return this.f13160g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31716i(p040c.p200q.p363c.p400x.C6866x0 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<c.q.a.c.m.k<java.lang.Void>>> r0 = r4.f13158e
            monitor-enter(r0)
            java.lang.String r5 = r5.mo31704e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<c.q.a.c.m.k<java.lang.Void>>> r1 = r4.f13158e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<c.q.a.c.m.k<java.lang.Void>>> r1 = r4.f13158e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            c.q.a.c.m.k r2 = (p040c.p200q.p201a.p264c.p347m.C5773k) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo28861c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<c.q.a.c.m.k<java.lang.Void>>> r1 = r4.f13158e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p400x.C6870z0.mo31716i(c.q.c.x.x0):void");
    }

    @WorkerThread
    /* renamed from: j */
    public boolean mo31717j(C6866x0 x0Var) {
        try {
            String b = x0Var.mo31702b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b.equals("U")) {
                        c = 1;
                    }
                }
            } else if (b.equals(ExifInterface.LATITUDE_SOUTH)) {
                c = 0;
            }
            if (c == 0) {
                mo31712b(x0Var.mo31703c());
                if (m19520f()) {
                    "Subscribe to topic: " + x0Var.mo31703c() + " succeeded.";
                }
            } else if (c == 1) {
                mo31713c(x0Var.mo31703c());
                if (m19520f()) {
                    "Unsubscribe from topic: " + x0Var.mo31703c() + " succeeded.";
                }
            } else if (m19520f()) {
                "Unknown topic operation" + x0Var + MAPCookie.DOT;
            }
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.";
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        }
    }

    /* renamed from: k */
    public void mo31718k(Runnable runnable, long j) {
        this.f13159f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: l */
    public synchronized void mo31719l(boolean z) {
        this.f13160g = z;
    }

    /* renamed from: m */
    public final void mo31720m() {
        if (!mo31715g()) {
            mo31723p(0);
        }
    }

    /* renamed from: n */
    public void mo31721n() {
        if (mo31714e()) {
            mo31720m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (mo31717j(r0) != false) goto L_0x0019;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31722o() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            c.q.c.x.y0 r0 = r2.f13161h     // Catch:{ all -> 0x0022 }
            c.q.c.x.x0 r0 = r0.mo31708b()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0010
            boolean r0 = m19520f()     // Catch:{ all -> 0x0022 }
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r0
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            boolean r1 = r2.mo31717j(r0)
            if (r1 != 0) goto L_0x0019
            r0 = 0
            return r0
        L_0x0019:
            c.q.c.x.y0 r1 = r2.f13161h
            r1.mo31710d(r0)
            r2.mo31716i(r0)
            goto L_0x0000
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p400x.C6870z0.mo31722o():boolean");
    }

    /* renamed from: p */
    public void mo31723p(long j) {
        mo31718k(new C6799a1(this, this.f13154a, this.f13155b, Math.min(Math.max(30, 2 * j), f13153i)), j);
        mo31719l(true);
    }
}
