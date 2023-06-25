package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p040c.p200q.p201a.p264c.p340i.p342b.C5686w8;
import p040c.p200q.p201a.p264c.p340i.p342b.C5697x8;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementService extends Service implements C5686w8 {

    /* renamed from: e */
    public C5697x8 f14884e;

    /* renamed from: a */
    public final boolean mo28675a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: b */
    public final void mo28676b(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* renamed from: d */
    public final void mo28677d(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final C5697x8 mo33647e() {
        if (this.f14884e == null) {
            this.f14884e = new C5697x8(this);
        }
        return this.f14884e;
    }

    @MainThread
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return mo33647e().mo28692b(intent);
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        mo33647e().mo28695e();
    }

    @MainThread
    public void onDestroy() {
        mo33647e().mo28696f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        mo33647e().mo28697g(intent);
    }

    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        mo33647e().mo28691a(intent, i, i2);
        return 2;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        mo33647e().mo28700j(intent);
        return true;
    }
}
