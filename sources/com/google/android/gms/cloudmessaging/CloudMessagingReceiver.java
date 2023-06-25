package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p275c.C3302g;
import p040c.p200q.p201a.p264c.p275c.C3315t;
import p040c.p200q.p201a.p264c.p276d.p289n.p290r.C3567a;
import p040c.p200q.p201a.p264c.p294g.p299e.C3641e;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final ExecutorService f8149a;

    public CloudMessagingReceiver() {
        C3641e.m9183a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C3567a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8149a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @NonNull
    /* renamed from: a */
    public Executor mo24470a() {
        return this.f8149a;
    }

    @WorkerThread
    /* renamed from: b */
    public abstract int mo24471b(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    @WorkerThread
    /* renamed from: c */
    public void mo24472c(@NonNull Context context, @NonNull Bundle bundle) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo24473d(@NonNull Intent intent, @NonNull Context context, boolean z, @NonNull BroadcastReceiver.PendingResult pendingResult) {
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = mo24475f(context, intent2);
            } else {
                i = mo24474e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @WorkerThread
    /* renamed from: e */
    public final int mo24474e(@NonNull Context context, @NonNull Intent intent) {
        C5771j<Void> jVar;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            jVar = C5777m.m16414f(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            jVar = C3315t.m8391b(context).mo20371c(2, bundle);
        }
        int b = mo24471b(context, new CloudMessage(intent));
        try {
            C5777m.m16410b(jVar, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            sb.toString();
        }
        return b;
    }

    @WorkerThread
    /* renamed from: f */
    public final int mo24475f(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!"com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            return 500;
        }
        mo24472c(context, extras);
        return -1;
    }

    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent != null) {
            mo24470a().execute(new C3302g(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
