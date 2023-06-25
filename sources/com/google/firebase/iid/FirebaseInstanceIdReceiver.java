package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.ExecutionException;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p400x.C6829g0;
import p040c.p200q.p363c.p400x.C6839l0;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    /* renamed from: g */
    public static Intent m22986g(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @WorkerThread
    /* renamed from: b */
    public int mo24471b(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) C5777m.m16409a(new C6829g0(context).mo31609f(cloudMessage.mo24468P()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @WorkerThread
    /* renamed from: c */
    public void mo24472c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent g = m22986g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C6839l0.m19399A(g)) {
            C6839l0.m19419s(g);
        }
    }
}
