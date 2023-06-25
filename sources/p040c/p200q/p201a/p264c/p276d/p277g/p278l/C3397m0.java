package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3498p;
import p040c.p200q.p201a.p264c.p276d.p289n.C3551b;
import p040c.p200q.p201a.p264c.p347m.C5761e;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* renamed from: c.q.a.c.d.g.l.m0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3397m0<T> implements C5761e<T> {

    /* renamed from: a */
    public final C3375f f6332a;

    /* renamed from: b */
    public final int f6333b;

    /* renamed from: c */
    public final C3362b<?> f6334c;

    /* renamed from: d */
    public final long f6335d;

    /* renamed from: e */
    public final long f6336e;

    public C3397m0(C3375f fVar, int i, C3362b<?> bVar, long j, long j2, @Nullable String str, @Nullable String str2) {
        this.f6332a = fVar;
        this.f6333b = i;
        this.f6334c = bVar;
        this.f6335d = j;
        this.f6336e = j2;
    }

    @Nullable
    /* renamed from: a */
    public static <T> C3397m0<T> m8685a(C3375f fVar, int i, C3362b<?> bVar) {
        boolean z;
        if (!fVar.mo20537g()) {
            return null;
        }
        RootTelemetryConfiguration a = C3498p.m8924b().mo20773a();
        if (a == null) {
            z = true;
        } else if (!a.mo24600R()) {
            return null;
        } else {
            z = a.mo24601S();
            C3373e0 x = fVar.mo20545x(bVar);
            if (x != null) {
                if (!(x.mo20526v() instanceof C3453d)) {
                    return null;
                }
                C3453d dVar = (C3453d) x.mo20526v();
                if (dVar.mo20652H() && !dVar.mo20666d()) {
                    ConnectionTelemetryConfiguration b = m8686b(x, dVar, i);
                    if (b == null) {
                        return null;
                    }
                    x.mo20499G();
                    z = b.mo24592T();
                }
            }
        }
        return new C3397m0(fVar, i, bVar, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    @Nullable
    /* renamed from: b */
    public static ConnectionTelemetryConfiguration m8686b(C3373e0<?> e0Var, C3453d<?> dVar, int i) {
        int[] Q;
        int[] R;
        ConnectionTelemetryConfiguration F = dVar.mo20650F();
        if (F == null || !F.mo24591S() || ((Q = F.mo24589Q()) != null ? !C3551b.m9045b(Q, i) : !((R = F.mo24590R()) == null || !C3551b.m9045b(R, i))) || e0Var.mo20524s() >= F.mo24588P()) {
            return null;
        }
        return F;
    }

    @WorkerThread
    public final void onComplete(@NonNull C5771j<T> jVar) {
        C3373e0 x;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.f6332a.mo20537g()) {
            RootTelemetryConfiguration a = C3498p.m8924b().mo20773a();
            if ((a == null || a.mo24600R()) && (x = this.f6332a.mo20545x(this.f6334c)) != null && (x.mo20526v() instanceof C3453d)) {
                C3453d dVar = (C3453d) x.mo20526v();
                boolean z = true;
                int i7 = 0;
                boolean z2 = this.f6335d > 0;
                int x2 = dVar.mo20685x();
                if (a != null) {
                    boolean S = z2 & a.mo24601S();
                    int P = a.mo24598P();
                    int Q = a.mo24599Q();
                    i3 = a.getVersion();
                    if (dVar.mo20652H() && !dVar.mo20666d()) {
                        ConnectionTelemetryConfiguration b = m8686b(x, dVar, this.f6333b);
                        if (b != null) {
                            if (!b.mo24592T() || this.f6335d <= 0) {
                                z = false;
                            }
                            Q = b.mo24588P();
                            S = z;
                        } else {
                            return;
                        }
                    }
                    i2 = P;
                    i = Q;
                } else {
                    i3 = 0;
                    i = 100;
                    i2 = 5000;
                }
                C3375f fVar = this.f6332a;
                if (jVar.mo28856q()) {
                    i4 = 0;
                } else {
                    if (jVar.mo28854o()) {
                        i7 = 100;
                    } else {
                        Exception l = jVar.mo28851l();
                        if (l instanceof ApiException) {
                            Status status = ((ApiException) l).getStatus();
                            int R = status.mo24533R();
                            ConnectionResult P2 = status.mo24531P();
                            if (P2 == null) {
                                i6 = -1;
                            } else {
                                i6 = P2.mo24483P();
                            }
                            i4 = i6;
                            i7 = R;
                        } else {
                            i7 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.f6335d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f6336e);
                    j2 = j3;
                    j = currentTimeMillis;
                } else {
                    j2 = 0;
                    j = 0;
                    i5 = -1;
                }
                fVar.mo20531G(new MethodInvocation(this.f6333b, i7, i4, j2, j, (String) null, (String) null, x2, i5), i3, (long) i2, i);
            }
        }
    }
}
