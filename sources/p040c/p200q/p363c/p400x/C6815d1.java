package p040c.p200q.p363c.p400x;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p200q.p201a.p264c.p276d.p288m.C3548a;
import p040c.p200q.p201a.p264c.p276d.p289n.p290r.C3567a;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.c.x.d1 */
/* compiled from: WithinAppServiceConnection */
public class C6815d1 implements ServiceConnection {

    /* renamed from: e */
    public final Context f13049e;

    /* renamed from: l */
    public final Intent f13050l;

    /* renamed from: m */
    public final ScheduledExecutorService f13051m;

    /* renamed from: n */
    public final Queue<C6816a> f13052n;
    @Nullable

    /* renamed from: o */
    public C6810c1 f13053o;
    @GuardedBy("this")

    /* renamed from: p */
    public boolean f13054p;

    /* renamed from: c.q.c.x.d1$a */
    /* compiled from: WithinAppServiceConnection */
    public static class C6816a {

        /* renamed from: a */
        public final Intent f13055a;

        /* renamed from: b */
        public final C5773k<Void> f13056b = new C5773k<>();

        public C6816a(Intent intent) {
            this.f13055a = intent;
        }

        /* renamed from: a */
        public void mo31591a(ScheduledExecutorService scheduledExecutorService) {
            mo31593c().mo28843d(scheduledExecutorService, new C6862w(scheduledExecutorService.schedule(new C6865x(this), (this.f13055a.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY) != 0 ? C6806b1.f13036a : 9000, TimeUnit.MILLISECONDS)));
        }

        /* renamed from: b */
        public void mo31592b() {
            this.f13056b.mo28863e(null);
        }

        /* renamed from: c */
        public C5771j<Void> mo31593c() {
            return this.f13056b.mo28859a();
        }

        /* renamed from: d */
        public /* synthetic */ void mo31594d() {
            "Service took too long to process intent: " + this.f13055a.getAction() + " Releasing WakeLock.";
            mo31592b();
        }
    }

    public C6815d1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C3567a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @GuardedBy("this")
    /* renamed from: a */
    public final void mo31585a() {
        while (!this.f13052n.isEmpty()) {
            this.f13052n.poll().mo31592b();
        }
    }

    /* renamed from: b */
    public final synchronized void mo31586b() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        while (!this.f13052n.isEmpty()) {
            boolean isLoggable2 = Log.isLoggable("FirebaseMessaging", 3);
            if (this.f13053o == null || !this.f13053o.isBinderAlive()) {
                mo31588d();
                return;
            }
            boolean isLoggable3 = Log.isLoggable("FirebaseMessaging", 3);
            this.f13053o.mo31583b(this.f13052n.poll());
        }
    }

    /* renamed from: c */
    public synchronized C5771j<Void> mo31587c(Intent intent) {
        C6816a aVar;
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        aVar = new C6816a(intent);
        aVar.mo31591a(this.f13051m);
        this.f13052n.add(aVar);
        mo31586b();
        return aVar.mo31593c();
    }

    @GuardedBy("this")
    /* renamed from: d */
    public final void mo31588d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f13054p);
            sb.toString();
        }
        if (!this.f13054p) {
            this.f13054p = true;
            try {
                if (C3548a.m9034b().mo20832a(this.f13049e, this.f13050l, this, 65)) {
                    return;
                }
            } catch (SecurityException unused) {
            }
            this.f13054p = false;
            mo31585a();
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            "onServiceConnected: " + componentName;
        }
        this.f13054p = false;
        if (!(iBinder instanceof C6810c1)) {
            "Invalid service connection: " + iBinder;
            mo31585a();
            return;
        }
        this.f13053o = (C6810c1) iBinder;
        mo31586b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            "onServiceDisconnected: " + componentName;
        }
        mo31586b();
    }

    @VisibleForTesting
    public C6815d1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f13052n = new ArrayDeque();
        this.f13054p = false;
        this.f13049e = context.getApplicationContext();
        this.f13050l = new Intent(str).setPackage(this.f13049e.getPackageName());
        this.f13051m = scheduledExecutorService;
    }
}
