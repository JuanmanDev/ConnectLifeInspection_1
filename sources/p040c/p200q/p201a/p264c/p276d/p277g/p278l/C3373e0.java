package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a.C3338d;
import p040c.p200q.p201a.p264c.p276d.p277g.C3345c;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p283v.C3522e;
import p040c.p200q.p201a.p264c.p276d.p289n.C3551b;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.e0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3373e0<O extends C3334a.C3338d> implements C3348d.C3349a, C3348d.C3350b {

    /* renamed from: e */
    public final Queue<C3377f1> f6257e = new LinkedList();
    @NotOnlyInitialized

    /* renamed from: l */
    public final C3334a.C3342f f6258l;

    /* renamed from: m */
    public final C3362b<O> f6259m;

    /* renamed from: n */
    public final C3417u f6260n;

    /* renamed from: o */
    public final Set<C3380g1> f6261o = new HashSet();

    /* renamed from: p */
    public final Map<C3384i<?>, C3412r0> f6262p = new HashMap();

    /* renamed from: q */
    public final int f6263q;
    @Nullable

    /* renamed from: r */
    public final C3420v0 f6264r;

    /* renamed from: s */
    public boolean f6265s;

    /* renamed from: t */
    public final List<C3379g0> f6266t = new ArrayList();
    @Nullable

    /* renamed from: u */
    public ConnectionResult f6267u = null;

    /* renamed from: v */
    public int f6268v = 0;

    /* renamed from: w */
    public final /* synthetic */ C3375f f6269w;

    @WorkerThread
    public C3373e0(C3375f fVar, C3345c<O> cVar) {
        this.f6269w = fVar;
        this.f6258l = cVar.mo20444l(fVar.f6291z.getLooper(), this);
        this.f6259m = cVar.mo20434b();
        this.f6260n = new C3417u();
        this.f6263q = cVar.mo20443k();
        if (this.f6258l.mo20433m()) {
            this.f6264r = cVar.mo20445m(fVar.f6282q, fVar.f6291z);
        } else {
            this.f6264r = null;
        }
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m8538B(C3373e0 e0Var, C3379g0 g0Var) {
        if (!e0Var.f6266t.contains(g0Var) || e0Var.f6265s) {
            return;
        }
        if (!e0Var.f6258l.isConnected()) {
            e0Var.mo20497E();
        } else {
            e0Var.mo20514i();
        }
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m8539C(C3373e0 e0Var, C3379g0 g0Var) {
        Feature[] g;
        if (e0Var.f6266t.remove(g0Var)) {
            e0Var.f6269w.f6291z.removeMessages(15, g0Var);
            e0Var.f6269w.f6291z.removeMessages(16, g0Var);
            Feature a = g0Var.f6295b;
            ArrayList arrayList = new ArrayList(e0Var.f6257e.size());
            for (C3377f1 f1Var : e0Var.f6257e) {
                if ((f1Var instanceof C3394l0) && (g = ((C3394l0) f1Var).mo20493g(e0Var)) != null && C3551b.m9046c(g, a)) {
                    arrayList.add(f1Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3377f1 f1Var2 = (C3377f1) arrayList.get(i);
                e0Var.f6257e.remove(f1Var2);
                f1Var2.mo20484b(new UnsupportedApiCallException(a));
            }
        }
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo20496D() {
        C3495o.m8902d(this.f6269w.f6291z);
        this.f6267u = null;
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo20497E() {
        C3495o.m8902d(this.f6269w.f6291z);
        if (!this.f6258l.isConnected() && !this.f6258l.mo20424d()) {
            try {
                C3375f fVar = this.f6269w;
                int b = fVar.f6284s.mo20733b(fVar.f6282q, this.f6258l);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f6258l.getClass().getName();
                    String connectionResult2 = connectionResult.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + connectionResult2.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(connectionResult2);
                    sb.toString();
                    mo20500H(connectionResult, (Exception) null);
                    return;
                }
                C3375f fVar2 = this.f6269w;
                C3334a.C3342f fVar3 = this.f6258l;
                C3385i0 i0Var = new C3385i0(fVar2, fVar3, this.f6259m);
                if (fVar3.mo20433m()) {
                    C3420v0 v0Var = this.f6264r;
                    C3495o.m8908j(v0Var);
                    v0Var.mo20620a0(i0Var);
                }
                try {
                    this.f6258l.mo20427f(i0Var);
                } catch (SecurityException e) {
                    mo20500H(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo20500H(new ConnectionResult(10), e2);
            }
        }
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo20498F(C3377f1 f1Var) {
        C3495o.m8902d(this.f6269w.f6291z);
        if (!this.f6258l.isConnected()) {
            this.f6257e.add(f1Var);
            ConnectionResult connectionResult = this.f6267u;
            if (connectionResult == null || !connectionResult.mo24486S()) {
                mo20497E();
            } else {
                mo20500H(this.f6267u, (Exception) null);
            }
        } else if (mo20520o(f1Var)) {
            mo20517l();
        } else {
            this.f6257e.add(f1Var);
        }
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo20499G() {
        this.f6268v++;
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo20500H(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        C3495o.m8902d(this.f6269w.f6291z);
        C3420v0 v0Var = this.f6264r;
        if (v0Var != null) {
            v0Var.mo20621b0();
        }
        mo20496D();
        this.f6269w.f6284s.mo20734c();
        mo20510c(connectionResult);
        if ((this.f6258l instanceof C3522e) && connectionResult.mo24483P() != 24) {
            this.f6269w.f6279n = true;
            C3375f fVar = this.f6269w;
            fVar.f6291z.sendMessageDelayed(fVar.f6291z.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (connectionResult.mo24483P() == 4) {
            mo20512f(C3375f.f6272C);
        } else if (this.f6257e.isEmpty()) {
            this.f6267u = connectionResult;
        } else if (exc != null) {
            C3495o.m8902d(this.f6269w.f6291z);
            mo20513h((Status) null, exc, false);
        } else if (this.f6269w.f6275A) {
            mo20513h(C3375f.m8589i(this.f6259m, connectionResult), (Exception) null, true);
            if (!this.f6257e.isEmpty() && !mo20521p(connectionResult) && !this.f6269w.mo20538h(connectionResult, this.f6263q)) {
                if (connectionResult.mo24483P() == 18) {
                    this.f6265s = true;
                }
                if (this.f6265s) {
                    C3375f fVar2 = this.f6269w;
                    fVar2.f6291z.sendMessageDelayed(Message.obtain(fVar2.f6291z, 9, this.f6259m), this.f6269w.f6276e);
                    return;
                }
                mo20512f(C3375f.m8589i(this.f6259m, connectionResult));
            }
        } else {
            mo20512f(C3375f.m8589i(this.f6259m, connectionResult));
        }
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo20501I(@NonNull ConnectionResult connectionResult) {
        C3495o.m8902d(this.f6269w.f6291z);
        C3334a.C3342f fVar = this.f6258l;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.mo20423c(sb.toString());
        mo20500H(connectionResult, (Exception) null);
    }

    @WorkerThread
    /* renamed from: J */
    public final void mo20502J(C3380g1 g1Var) {
        C3495o.m8902d(this.f6269w.f6291z);
        this.f6261o.add(g1Var);
    }

    @WorkerThread
    /* renamed from: K */
    public final void mo20503K() {
        C3495o.m8902d(this.f6269w.f6291z);
        if (this.f6265s) {
            mo20497E();
        }
    }

    @WorkerThread
    /* renamed from: L */
    public final void mo20504L() {
        C3495o.m8902d(this.f6269w.f6291z);
        mo20512f(C3375f.f6271B);
        this.f6260n.mo20613f();
        for (C3384i e1Var : (C3384i[]) this.f6262p.keySet().toArray(new C3384i[0])) {
            mo20498F(new C3374e1(e1Var, new C5773k()));
        }
        mo20510c(new ConnectionResult(4));
        if (this.f6258l.isConnected()) {
            this.f6258l.mo20428g(new C3370d0(this));
        }
    }

    @WorkerThread
    /* renamed from: M */
    public final void mo20505M() {
        Status status;
        C3495o.m8902d(this.f6269w.f6291z);
        if (this.f6265s) {
            mo20519n();
            C3375f fVar = this.f6269w;
            if (fVar.f6283r.mo20388g(fVar.f6282q) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            mo20512f(status);
            this.f6258l.mo20423c("Timing out connection while resuming.");
        }
    }

    /* renamed from: O */
    public final boolean mo20506O() {
        return this.f6258l.isConnected();
    }

    /* renamed from: P */
    public final boolean mo20507P() {
        return this.f6258l.mo20433m();
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo20508a() {
        return mo20522q(true);
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    public final Feature mo20509b(@Nullable Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] k = this.f6258l.mo20431k();
            if (k == null) {
                k = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(r3);
            for (Feature feature : k) {
                arrayMap.put(feature.mo24495P(), Long.valueOf(feature.mo24496Q()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) arrayMap.get(feature2.mo24495P());
                if (l == null || l.longValue() < feature2.mo24496Q()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo20510c(ConnectionResult connectionResult) {
        for (C3380g1 b : this.f6261o) {
            b.mo20554b(this.f6259m, connectionResult, C3487m.m8886a(connectionResult, ConnectionResult.f8152o) ? this.f6258l.mo20426e() : null);
        }
        this.f6261o.clear();
    }

    /* renamed from: d */
    public final void mo20494d(int i) {
        if (Looper.myLooper() == this.f6269w.f6291z.getLooper()) {
            mo20516k(i);
        } else {
            this.f6269w.f6291z.post(new C3363b0(this, i));
        }
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo20511e(@NonNull ConnectionResult connectionResult) {
        mo20500H(connectionResult, (Exception) null);
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo20512f(Status status) {
        C3495o.m8902d(this.f6269w.f6291z);
        mo20513h(status, (Exception) null, false);
    }

    /* renamed from: g */
    public final void mo20495g(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.f6269w.f6291z.getLooper()) {
            mo20515j();
        } else {
            this.f6269w.f6291z.post(new C3360a0(this));
        }
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo20513h(@Nullable Status status, @Nullable Exception exc, boolean z) {
        C3495o.m8902d(this.f6269w.f6291z);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f6257e.iterator();
            while (it.hasNext()) {
                C3377f1 f1Var = (C3377f1) it.next();
                if (!z || f1Var.f6292a == 2) {
                    if (status != null) {
                        f1Var.mo20483a(status);
                    } else {
                        f1Var.mo20484b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo20514i() {
        ArrayList arrayList = new ArrayList(this.f6257e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3377f1 f1Var = (C3377f1) arrayList.get(i);
            if (this.f6258l.isConnected()) {
                if (mo20520o(f1Var)) {
                    this.f6257e.remove(f1Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo20515j() {
        mo20496D();
        mo20510c(ConnectionResult.f8152o);
        mo20519n();
        Iterator<C3412r0> it = this.f6262p.values().iterator();
        while (it.hasNext()) {
            C3412r0 next = it.next();
            if (mo20509b(next.f6361a.mo20589b()) != null) {
                it.remove();
            } else {
                try {
                    next.f6361a.mo20590c(this.f6258l, new C5773k());
                } catch (DeadObjectException unused) {
                    mo20494d(3);
                    this.f6258l.mo20423c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        mo20514i();
        mo20517l();
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo20516k(int i) {
        mo20496D();
        this.f6265s = true;
        this.f6260n.mo20612e(i, this.f6258l.mo20432l());
        C3375f fVar = this.f6269w;
        fVar.f6291z.sendMessageDelayed(Message.obtain(fVar.f6291z, 9, this.f6259m), this.f6269w.f6276e);
        C3375f fVar2 = this.f6269w;
        fVar2.f6291z.sendMessageDelayed(Message.obtain(fVar2.f6291z, 11, this.f6259m), this.f6269w.f6277l);
        this.f6269w.f6284s.mo20734c();
        for (C3412r0 r0Var : this.f6262p.values()) {
            r0Var.f6363c.run();
        }
    }

    /* renamed from: l */
    public final void mo20517l() {
        this.f6269w.f6291z.removeMessages(12, this.f6259m);
        C3375f fVar = this.f6269w;
        fVar.f6291z.sendMessageDelayed(fVar.f6291z.obtainMessage(12, this.f6259m), this.f6269w.f6278m);
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo20518m(C3377f1 f1Var) {
        f1Var.mo20486d(this.f6260n, mo20507P());
        try {
            f1Var.mo20485c(this);
        } catch (DeadObjectException unused) {
            mo20494d(1);
            this.f6258l.mo20423c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo20519n() {
        if (this.f6265s) {
            this.f6269w.f6291z.removeMessages(11, this.f6259m);
            this.f6269w.f6291z.removeMessages(9, this.f6259m);
            this.f6265s = false;
        }
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo20520o(C3377f1 f1Var) {
        if (!(f1Var instanceof C3394l0)) {
            mo20518m(f1Var);
            return true;
        }
        C3394l0 l0Var = (C3394l0) f1Var;
        Feature b = mo20509b(l0Var.mo20493g(this));
        if (b == null) {
            mo20518m(f1Var);
            return true;
        }
        String name = this.f6258l.getClass().getName();
        String P = b.mo24495P();
        long Q = b.mo24496Q();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(P).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(P);
        sb.append(", ");
        sb.append(Q);
        sb.append(").");
        sb.toString();
        if (!this.f6269w.f6275A || !l0Var.mo20492f(this)) {
            l0Var.mo20484b(new UnsupportedApiCallException(b));
            return true;
        }
        C3379g0 g0Var = new C3379g0(this.f6259m, b, (C3376f0) null);
        int indexOf = this.f6266t.indexOf(g0Var);
        if (indexOf >= 0) {
            C3379g0 g0Var2 = this.f6266t.get(indexOf);
            this.f6269w.f6291z.removeMessages(15, g0Var2);
            C3375f fVar = this.f6269w;
            fVar.f6291z.sendMessageDelayed(Message.obtain(fVar.f6291z, 15, g0Var2), this.f6269w.f6276e);
            return false;
        }
        this.f6266t.add(g0Var);
        C3375f fVar2 = this.f6269w;
        fVar2.f6291z.sendMessageDelayed(Message.obtain(fVar2.f6291z, 15, g0Var), this.f6269w.f6276e);
        C3375f fVar3 = this.f6269w;
        fVar3.f6291z.sendMessageDelayed(Message.obtain(fVar3.f6291z, 16, g0Var), this.f6269w.f6277l);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (mo20521p(connectionResult)) {
            return false;
        }
        this.f6269w.mo20538h(connectionResult, this.f6263q);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20521p(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3375f.f6273D
            monitor-enter(r0)
            c.q.a.c.d.g.l.f r1 = r3.f6269w     // Catch:{ all -> 0x002a }
            c.q.a.c.d.g.l.v r2 = r1.f6288w     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f6289x     // Catch:{ all -> 0x002a }
            c.q.a.c.d.g.l.b<O> r2 = r3.f6259m     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            c.q.a.c.d.g.l.f r1 = r3.f6269w     // Catch:{ all -> 0x002a }
            c.q.a.c.d.g.l.v r1 = r1.f6288w     // Catch:{ all -> 0x002a }
            int r2 = r3.f6263q     // Catch:{ all -> 0x002a }
            r1.mo20587s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3373e0.mo20521p(com.google.android.gms.common.ConnectionResult):boolean");
    }

    @WorkerThread
    /* renamed from: q */
    public final boolean mo20522q(boolean z) {
        C3495o.m8902d(this.f6269w.f6291z);
        if (!this.f6258l.isConnected() || this.f6262p.size() != 0) {
            return false;
        }
        if (this.f6260n.mo20614g()) {
            if (z) {
                mo20517l();
            }
            return false;
        }
        this.f6258l.mo20423c("Timing out service connection.");
        return true;
    }

    /* renamed from: r */
    public final int mo20523r() {
        return this.f6263q;
    }

    @WorkerThread
    /* renamed from: s */
    public final int mo20524s() {
        return this.f6268v;
    }

    @WorkerThread
    @Nullable
    /* renamed from: t */
    public final ConnectionResult mo20525t() {
        C3495o.m8902d(this.f6269w.f6291z);
        return this.f6267u;
    }

    /* renamed from: v */
    public final C3334a.C3342f mo20526v() {
        return this.f6258l;
    }

    /* renamed from: x */
    public final Map<C3384i<?>, C3412r0> mo20527x() {
        return this.f6262p;
    }
}
