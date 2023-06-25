package p040c.p200q.p201a.p264c.p275c;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.zzq;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p288m.C3548a;
import p040c.p200q.p201a.p264c.p294g.p299e.C3642f;

/* renamed from: c.q.a.c.c.o */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3310o implements ServiceConnection {

    /* renamed from: e */
    public int f6167e = 0;

    /* renamed from: l */
    public final Messenger f6168l = new Messenger(new C3642f(Looper.getMainLooper(), new C3303h(this)));

    /* renamed from: m */
    public C3311p f6169m;

    /* renamed from: n */
    public final Queue<C3313r<?>> f6170n = new ArrayDeque();

    /* renamed from: o */
    public final SparseArray<C3313r<?>> f6171o = new SparseArray<>();

    /* renamed from: p */
    public final /* synthetic */ C3315t f6172p;

    public /* synthetic */ C3310o(C3315t tVar, C3309n nVar) {
        this.f6172p = tVar;
    }

    /* renamed from: a */
    public final synchronized void mo20356a(int i, @Nullable String str) {
        mo20357b(i, str, (Throwable) null);
    }

    /* renamed from: b */
    public final synchronized void mo20357b(int i, @Nullable String str, @Nullable Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i2 = this.f6167e;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f6167e = 4;
            C3548a.m9034b().mo20833c(this.f6172p.f6180a, this);
            zzq zzq = new zzq(i, str, th);
            for (C3313r c : this.f6170n) {
                c.mo20368c(zzq);
            }
            this.f6170n.clear();
            for (int i3 = 0; i3 < this.f6171o.size(); i3++) {
                this.f6171o.valueAt(i3).mo20368c(zzq);
            }
            this.f6171o.clear();
        } else if (i2 == 3) {
            this.f6167e = 4;
        }
    }

    /* renamed from: c */
    public final void mo20358c() {
        this.f6172p.f6181b.execute(new C3305j(this));
    }

    /* renamed from: d */
    public final synchronized void mo20359d() {
        if (this.f6167e == 1) {
            mo20356a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void mo20360e(int i) {
        C3313r rVar = this.f6171o.get(i);
        if (rVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            sb.toString();
            this.f6171o.remove(i);
            rVar.mo20368c(new zzq(3, "Timed out waiting for response", (Throwable) null));
            mo20361f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20361f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f6167e     // Catch:{ all -> 0x0030 }
            r1 = 2
            if (r0 != r1) goto L_0x002e
            java.util.Queue<c.q.a.c.c.r<?>> r0 = r2.f6170n     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002e
            android.util.SparseArray<c.q.a.c.c.r<?>> r0 = r2.f6171o     // Catch:{ all -> 0x0030 }
            int r0 = r0.size()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0030 }
            r0 = 3
            r2.f6167e = r0     // Catch:{ all -> 0x0030 }
            c.q.a.c.d.m.a r0 = p040c.p200q.p201a.p264c.p276d.p288m.C3548a.m9034b()     // Catch:{ all -> 0x0030 }
            c.q.a.c.c.t r1 = r2.f6172p     // Catch:{ all -> 0x0030 }
            android.content.Context r1 = r1.f6180a     // Catch:{ all -> 0x0030 }
            r0.mo20833c(r1, r2)     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            return
        L_0x002e:
            monitor-exit(r2)
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p275c.C3310o.mo20361f():void");
    }

    /* renamed from: g */
    public final synchronized boolean mo20362g(C3313r<?> rVar) {
        int i = this.f6167e;
        if (i == 0) {
            this.f6170n.add(rVar);
            C3495o.m8911m(this.f6167e == 0);
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f6167e = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!C3548a.m9034b().mo20832a(this.f6172p.f6180a, intent, this, 1)) {
                    mo20356a(0, "Unable to bind to service");
                } else {
                    this.f6172p.f6181b.schedule(new C3306k(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo20357b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f6170n.add(rVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f6170n.add(rVar);
            mo20358c();
            return true;
        }
        return true;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        this.f6172p.f6181b.execute(new C3307l(this, iBinder));
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        this.f6172p.f6181b.execute(new C3304i(this));
    }
}
