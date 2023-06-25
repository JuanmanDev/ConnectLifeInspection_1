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
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;

/* renamed from: c.q.c.x.a1 */
/* compiled from: TopicsSyncTask */
public class C6799a1 implements Runnable {

    /* renamed from: p */
    public static final Object f13003p = new Object();
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: q */
    public static Boolean f13004q;
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: r */
    public static Boolean f13005r;

    /* renamed from: e */
    public final Context f13006e;

    /* renamed from: l */
    public final C6841m0 f13007l;

    /* renamed from: m */
    public final PowerManager.WakeLock f13008m;

    /* renamed from: n */
    public final C6870z0 f13009n;

    /* renamed from: o */
    public final long f13010o;

    @VisibleForTesting
    /* renamed from: c.q.c.x.a1$a */
    /* compiled from: TopicsSyncTask */
    public class C6800a extends BroadcastReceiver {
        @GuardedBy("this")
        @Nullable

        /* renamed from: a */
        public C6799a1 f13011a;

        public C6800a(C6799a1 a1Var) {
            this.f13011a = a1Var;
        }

        /* renamed from: a */
        public void mo31572a() {
            boolean b = C6799a1.m19296j();
            C6799a1.this.f13006e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (this.f13011a != null) {
                if (this.f13011a.mo31570i()) {
                    boolean b = C6799a1.m19296j();
                    this.f13011a.f13009n.mo31718k(this.f13011a, 0);
                    context.unregisterReceiver(this);
                    this.f13011a = null;
                }
            }
        }
    }

    public C6799a1(C6870z0 z0Var, Context context, C6841m0 m0Var, long j) {
        this.f13009n = z0Var;
        this.f13006e = context;
        this.f13010o = j;
        this.f13007l = m0Var;
        this.f13008m = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    public static String m19292e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    public static boolean m19293f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f13003p) {
            if (f13005r == null) {
                z = m19294g(context, "android.permission.ACCESS_NETWORK_STATE", f13005r);
            } else {
                z = f13005r.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f13005r = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    public static boolean m19294g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            m19292e(str);
        }
        return z;
    }

    /* renamed from: h */
    public static boolean m19295h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f13003p) {
            if (f13004q == null) {
                z = m19294g(context, "android.permission.WAKE_LOCK", f13004q);
            } else {
                z = f13004q.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f13004q = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: j */
    public static boolean m19296j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: i */
    public final synchronized boolean mo31570i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f13006e.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (m19295h(this.f13006e)) {
            this.f13008m.acquire(C6818e0.f13059a);
        }
        try {
            this.f13009n.mo31719l(true);
            if (!this.f13007l.mo31643g()) {
                this.f13009n.mo31719l(false);
                if (m19295h(this.f13006e)) {
                    try {
                        this.f13008m.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (!m19293f(this.f13006e) || mo31570i()) {
                if (this.f13009n.mo31722o()) {
                    this.f13009n.mo31719l(false);
                } else {
                    this.f13009n.mo31723p(this.f13010o);
                }
                if (!m19295h(this.f13006e)) {
                    return;
                }
                try {
                    this.f13008m.release();
                } catch (RuntimeException unused2) {
                }
            } else {
                new C6800a(this).mo31572a();
                if (m19295h(this.f13006e)) {
                    try {
                        this.f13008m.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            }
        } catch (IOException e) {
            "Failed to sync topics. Won't retry sync. " + e.getMessage();
            this.f13009n.mo31719l(false);
            if (!m19295h(this.f13006e)) {
            }
        } catch (Throwable th) {
            if (m19295h(this.f13006e)) {
                try {
                    this.f13008m.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
