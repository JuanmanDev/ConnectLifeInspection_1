package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p040c.p200q.p201a.p264c.p340i.p342b.C5444c4;
import p040c.p200q.p201a.p264c.p340i.p342b.C5456d4;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C5444c4 {

    /* renamed from: e */
    public C5456d4 f14883e;

    @MainThread
    /* renamed from: a */
    public void mo28133a(@NonNull Context context, @NonNull Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @MainThread
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f14883e == null) {
            this.f14883e = new C5456d4(this);
        }
        this.f14883e.mo28147a(context, intent);
    }
}
