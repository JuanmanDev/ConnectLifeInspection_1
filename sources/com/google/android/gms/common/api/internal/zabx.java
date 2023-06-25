package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3391k0;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zabx extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    public Context f8199a;

    /* renamed from: b */
    public final C3391k0 f8200b;

    public zabx(C3391k0 k0Var) {
        this.f8200b = k0Var;
    }

    /* renamed from: a */
    public final void mo24555a(Context context) {
        this.f8199a = context;
    }

    /* renamed from: b */
    public final synchronized void mo24556b() {
        Context context = this.f8199a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f8199a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f8200b.mo20568a();
            mo24556b();
        }
    }
}
