package p040c.p200q.p363c.p400x;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p276d.p289n.p290r.C3567a;

/* renamed from: c.q.c.x.w0 */
/* compiled from: SyncTask */
public class C6863w0 implements Runnable {

    /* renamed from: e */
    public final long f13138e;

    /* renamed from: l */
    public final PowerManager.WakeLock f13139l;

    /* renamed from: m */
    public final FirebaseMessaging f13140m;

    /* renamed from: c.q.c.x.w0$a */
    /* compiled from: SyncTask */
    public static class C6864a extends BroadcastReceiver {
        @Nullable

        /* renamed from: a */
        public C6863w0 f13141a;

        public C6864a(C6863w0 w0Var) {
            this.f13141a = w0Var;
        }

        /* renamed from: a */
        public void mo31699a() {
            boolean c = C6863w0.m19504c();
            this.f13141a.mo31695b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            C6863w0 w0Var = this.f13141a;
            if (w0Var != null && w0Var.mo31696d()) {
                boolean c = C6863w0.m19504c();
                this.f13141a.f13140m.mo37450d(this.f13141a, 0);
                this.f13141a.mo31695b().unregisterReceiver(this);
                this.f13141a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public C6863w0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C3567a("firebase-iid-executor"));
        this.f13140m = firebaseMessaging;
        this.f13138e = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo31695b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f13139l = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m19504c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    public Context mo31695b() {
        return this.f13140m.mo37451e();
    }

    /* renamed from: d */
    public boolean mo31696d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo31695b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: e */
    public boolean mo31697e() {
        try {
            if (this.f13140m.mo37449c() == null) {
                return false;
            }
            boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            if (C6835j0.m19383f(e.getMessage())) {
                "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval";
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C6856t0.m19479b().mo31678e(mo31695b())) {
            this.f13139l.acquire();
        }
        try {
            this.f13140m.mo37464u(true);
            if (!this.f13140m.mo37457n()) {
                this.f13140m.mo37464u(false);
                if (C6856t0.m19479b().mo31678e(mo31695b())) {
                    this.f13139l.release();
                }
            } else if (!C6856t0.m19479b().mo31677d(mo31695b()) || mo31696d()) {
                if (mo31697e()) {
                    this.f13140m.mo37464u(false);
                } else {
                    this.f13140m.mo37467x(this.f13138e);
                }
                if (!C6856t0.m19479b().mo31678e(mo31695b())) {
                    return;
                }
                this.f13139l.release();
            } else {
                new C6864a(this).mo31699a();
                if (C6856t0.m19479b().mo31678e(mo31695b())) {
                    this.f13139l.release();
                }
            }
        } catch (IOException e) {
            "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.";
            this.f13140m.mo37464u(false);
            if (!C6856t0.m19479b().mo31678e(mo31695b())) {
            }
        } catch (Throwable th) {
            if (C6856t0.m19479b().mo31678e(mo31695b())) {
                this.f13139l.release();
            }
            throw th;
        }
    }
}
