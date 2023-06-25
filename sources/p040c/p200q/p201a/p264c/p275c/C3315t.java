package p040c.p200q.p201a.p264c.p275c;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p040c.p200q.p201a.p264c.p276d.p289n.p290r.C3567a;
import p040c.p200q.p201a.p264c.p294g.p299e.C3641e;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* renamed from: c.q.a.c.c.t */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3315t {
    @Nullable

    /* renamed from: e */
    public static C3315t f6179e;

    /* renamed from: a */
    public final Context f6180a;

    /* renamed from: b */
    public final ScheduledExecutorService f6181b;

    /* renamed from: c */
    public C3310o f6182c = new C3310o(this, (C3309n) null);

    /* renamed from: d */
    public int f6183d = 1;

    @VisibleForTesting
    public C3315t(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f6181b = scheduledExecutorService;
        this.f6180a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C3315t m8391b(Context context) {
        C3315t tVar;
        synchronized (C3315t.class) {
            if (f6179e == null) {
                C3641e.m9183a();
                f6179e = new C3315t(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C3567a("MessengerIpcClient"))));
            }
            tVar = f6179e;
        }
        return tVar;
    }

    /* renamed from: c */
    public final C5771j<Void> mo20371c(int i, Bundle bundle) {
        return mo20374g(new C3312q(mo20373f(), 2, bundle));
    }

    /* renamed from: d */
    public final C5771j<Bundle> mo20372d(int i, Bundle bundle) {
        return mo20374g(new C3314s(mo20373f(), 1, bundle));
    }

    /* renamed from: f */
    public final synchronized int mo20373f() {
        int i;
        i = this.f6183d;
        this.f6183d = i + 1;
        return i;
    }

    /* renamed from: g */
    public final synchronized <T> C5771j<T> mo20374g(C3313r<T> rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(rVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.f6182c.mo20362g(rVar)) {
            C3310o oVar = new C3310o(this, (C3309n) null);
            this.f6182c = oVar;
            oVar.mo20362g(rVar);
        }
        return rVar.f6176b.mo28859a();
    }
}
