package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ExecutorService;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p400x.C6797a;
import p040c.p200q.p363c.p400x.C6801b;
import p040c.p200q.p363c.p400x.C6806b1;
import p040c.p200q.p363c.p400x.C6810c1;
import p040c.p200q.p363c.p400x.C6831h0;
import p040c.p200q.p363c.p400x.C6867y;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    public static final String TAG = "EnhancedIntentService";
    public Binder binder;
    @VisibleForTesting
    public final ExecutorService executor = C6831h0.m19375d();
    public int lastStartId;
    public final Object lock = new Object();
    public int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    public class C8293a implements C6810c1.C6811a {
        public C8293a() {
        }

        /* renamed from: a */
        public C5771j<Void> mo31584a(Intent intent) {
            return EnhancedIntentService.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            C6806b1.m19307b(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* access modifiers changed from: private */
    @MainThread
    public C5771j<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C5777m.m16414f(null);
        }
        C5773k kVar = new C5773k();
        this.executor.execute(new C6797a(this, intent, kVar));
        return kVar.mo28859a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo37440a(Intent intent, C5771j jVar) {
        finishTask(intent);
    }

    /* renamed from: b */
    public /* synthetic */ void mo37441b(Intent intent, C5773k kVar) {
        try {
            handleIntent(intent);
        } finally {
            kVar.mo28861c(null);
        }
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable(TAG, 3);
        if (this.binder == null) {
            this.binder = new C6810c1(new C8293a());
        }
        return this.binder;
    }

    @CallSuper
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        C5771j<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.mo28855p()) {
            finishTask(intent);
            return 2;
        }
        processIntent.mo28843d(C6867y.f13147e, new C6801b(this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
