package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.AsyncTaskLoader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3399n;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzd extends AsyncTaskLoader<Void> implements C3399n {

    /* renamed from: a */
    public Semaphore f8146a = new Semaphore(0);

    /* renamed from: b */
    public Set<C3348d> f8147b;

    public zzd(Context context, Set<C3348d> set) {
        super(context);
        this.f8147b = set;
    }

    /* renamed from: a */
    public final Void loadInBackground() {
        Iterator<C3348d> it = this.f8147b.iterator();
        if (!it.hasNext()) {
            try {
                this.f8146a.tryAcquire(0, 5, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
        it.next().mo20452d(this);
        throw null;
    }

    public final void onStartLoading() {
        this.f8146a.drainPermits();
        forceLoad();
    }
}
