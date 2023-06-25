package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p340i.p342b.C5686w8;
import p040c.p200q.p201a.p264c.p340i.p342b.C5697x8;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementJobService extends JobService implements C5686w8 {

    /* renamed from: e */
    public C5697x8 f14882e;

    /* renamed from: a */
    public final boolean mo28675a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo28676b(@NonNull Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: d */
    public final void mo28677d(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: e */
    public final C5697x8 mo33639e() {
        if (this.f14882e == null) {
            this.f14882e = new C5697x8(this);
        }
        return this.f14882e;
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        mo33639e().mo28695e();
    }

    @MainThread
    public void onDestroy() {
        mo33639e().mo28696f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        mo33639e().mo28697g(intent);
    }

    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        mo33639e().mo28699i(jobParameters);
        return true;
    }

    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        mo33639e().mo28700j(intent);
        return true;
    }
}
