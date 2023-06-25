package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p288m.C3548a;

/* renamed from: c.q.a.c.i.b.p8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5604p8 implements ServiceConnection, C3453d.C3454a, C3453d.C3455b {

    /* renamed from: e */
    public volatile boolean f10749e;

    /* renamed from: l */
    public volatile C5467e3 f10750l;

    /* renamed from: m */
    public final /* synthetic */ C5616q8 f10751m;

    public C5604p8(C5616q8 q8Var) {
        this.f10751m = q8Var;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28523b(Intent intent) {
        this.f10751m.mo28029h();
        Context f = this.f10751m.f10699a.mo28490f();
        C3548a b = C3548a.m9034b();
        synchronized (this) {
            if (this.f10749e) {
                this.f10751m.f10699a.mo28487b().mo28343v().mo28259a("Connection attempt already in progress");
                return;
            }
            this.f10751m.f10699a.mo28487b().mo28343v().mo28259a("Using local app measurement service");
            this.f10749e = true;
            b.mo20832a(f, intent, this.f10751m.f10787c, 129);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo28524c() {
        this.f10751m.mo28029h();
        Context f = this.f10751m.f10699a.mo28490f();
        synchronized (this) {
            if (this.f10749e) {
                this.f10751m.f10699a.mo28487b().mo28343v().mo28259a("Connection attempt already in progress");
            } else if (this.f10750l == null || (!this.f10750l.mo20666d() && !this.f10750l.isConnected())) {
                this.f10750l = new C5467e3(f, Looper.getMainLooper(), this, this);
                this.f10751m.f10699a.mo28487b().mo28343v().mo28259a("Connecting to remote service");
                this.f10749e = true;
                C3495o.m8908j(this.f10750l);
                this.f10750l.mo20677o();
            } else {
                this.f10751m.f10699a.mo28487b().mo28343v().mo28259a("Already awaiting connection attempt");
            }
        }
    }

    @MainThread
    /* renamed from: d */
    public final void mo20688d(int i) {
        C3495o.m8903e("MeasurementServiceConnection.onConnectionSuspended");
        this.f10751m.f10699a.mo28487b().mo28338q().mo28259a("Service connection suspended");
        this.f10751m.f10699a.mo28486a().mo28540z(new C5580n8(this));
    }

    @MainThread
    /* renamed from: e */
    public final void mo20690e(@NonNull ConnectionResult connectionResult) {
        C3495o.m8903e("MeasurementServiceConnection.onConnectionFailed");
        C5515i3 E = this.f10751m.f10699a.mo28621E();
        if (E != null) {
            E.mo28344w().mo28260b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f10749e = false;
            this.f10750l = null;
        }
        this.f10751m.f10699a.mo28486a().mo28540z(new C5592o8(this));
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo28525f() {
        if (this.f10750l != null && (this.f10750l.isConnected() || this.f10750l.mo20666d())) {
            this.f10750l.disconnect();
        }
        this.f10750l = null;
    }

    @MainThread
    /* renamed from: g */
    public final void mo20689g(Bundle bundle) {
        C3495o.m8903e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C3495o.m8908j(this.f10750l);
                this.f10751m.f10699a.mo28486a().mo28540z(new C5568m8(this, (C5691x2) this.f10750l.mo20648B()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f10750l = null;
                this.f10749e = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f10751m.f10699a.mo28487b().mo28339r().mo28259a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8903e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f10749e = r4     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.q8 r4 = r3.f10751m     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.t4 r4 = r4.f10699a     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.g3 r4 = r4.mo28339r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo28259a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof p040c.p200q.p201a.p264c.p340i.p342b.C5691x2     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            c.q.a.c.i.b.x2 r1 = (p040c.p200q.p201a.p264c.p340i.p342b.C5691x2) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            c.q.a.c.i.b.v2 r1 = new c.q.a.c.i.b.v2     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            c.q.a.c.i.b.q8 r5 = r3.f10751m     // Catch:{ RemoteException -> 0x0065 }
            c.q.a.c.i.b.t4 r5 = r5.f10699a     // Catch:{ RemoteException -> 0x0065 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ RemoteException -> 0x0065 }
            c.q.a.c.i.b.g3 r5 = r5.mo28343v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo28259a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            c.q.a.c.i.b.q8 r5 = r3.f10751m     // Catch:{ RemoteException -> 0x0065 }
            c.q.a.c.i.b.t4 r5 = r5.f10699a     // Catch:{ RemoteException -> 0x0065 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ RemoteException -> 0x0065 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo28260b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            c.q.a.c.i.b.q8 r5 = r3.f10751m     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.t4 r5 = r5.f10699a     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo28259a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f10749e = r4     // Catch:{ all -> 0x0063 }
            c.q.a.c.d.m.a r4 = p040c.p200q.p201a.p264c.p276d.p288m.C3548a.m9034b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            c.q.a.c.i.b.q8 r5 = r3.f10751m     // Catch:{ IllegalArgumentException -> 0x00a0 }
            c.q.a.c.i.b.t4 r5 = r5.f10699a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo28490f()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            c.q.a.c.i.b.q8 r0 = r3.f10751m     // Catch:{ IllegalArgumentException -> 0x00a0 }
            c.q.a.c.i.b.p8 r0 = r0.f10787c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo20833c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            c.q.a.c.i.b.q8 r4 = r3.f10751m     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.t4 r4 = r4.f10699a     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.q4 r4 = r4.mo28486a()     // Catch:{ all -> 0x0063 }
            c.q.a.c.i.b.k8 r5 = new c.q.a.c.i.b.k8     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo28540z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5604p8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        C3495o.m8903e("MeasurementServiceConnection.onServiceDisconnected");
        this.f10751m.f10699a.mo28487b().mo28338q().mo28259a("Service disconnected");
        this.f10751m.f10699a.mo28486a().mo28540z(new C5556l8(this, componentName));
    }
}
