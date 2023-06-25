package p040c.p200q.p201a.p219b.p240j0;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.j0.b */
/* compiled from: RequirementsWatcher */
public final class C2856b {

    /* renamed from: a */
    public final Context f4506a;

    /* renamed from: b */
    public final C2860d f4507b;

    /* renamed from: c */
    public final C2855a f4508c;

    /* renamed from: d */
    public C2859c f4509d;

    /* renamed from: e */
    public boolean f4510e;

    /* renamed from: f */
    public C2858b f4511f;

    @RequiresApi(api = 21)
    /* renamed from: c.q.a.b.j0.b$b */
    /* compiled from: RequirementsWatcher */
    public final class C2858b extends ConnectivityManager.NetworkCallback {
        public C2858b() {
        }

        public void onAvailable(Network network) {
            super.onAvailable(network);
            C2856b.m6225d(C2856b.this + " NetworkCallback.onAvailable");
            C2856b.this.mo19040c();
        }

        public void onLost(Network network) {
            super.onLost(network);
            C2856b.m6225d(C2856b.this + " NetworkCallback.onLost");
            C2856b.this.mo19040c();
        }
    }

    /* renamed from: c.q.a.b.j0.b$c */
    /* compiled from: RequirementsWatcher */
    public class C2859c extends BroadcastReceiver {
        public C2859c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                C2856b.m6225d(C2856b.this + " received " + intent.getAction());
                C2856b.this.mo19040c();
            }
        }
    }

    /* renamed from: c.q.a.b.j0.b$d */
    /* compiled from: RequirementsWatcher */
    public interface C2860d {
        /* renamed from: a */
        void mo19049a(C2856b bVar);

        /* renamed from: b */
        void mo19050b(C2856b bVar);
    }

    public C2856b(Context context, C2860d dVar, C2855a aVar) {
        this.f4508c = aVar;
        this.f4507b = dVar;
        this.f4506a = context.getApplicationContext();
        m6225d(this + " created");
    }

    /* renamed from: d */
    public static void m6225d(String str) {
    }

    /* renamed from: c */
    public final void mo19040c() {
        boolean e = this.f4508c.mo19035e(this.f4506a);
        if (e == this.f4510e) {
            m6225d("requirementsAreMet is still " + e);
            return;
        }
        this.f4510e = e;
        if (e) {
            m6225d("start job");
            this.f4507b.mo19049a(this);
            return;
        }
        m6225d("stop job");
        this.f4507b.mo19050b(this);
    }

    @TargetApi(23)
    /* renamed from: e */
    public final void mo19041e() {
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        C2858b bVar = new C2858b();
        this.f4511f = bVar;
        ((ConnectivityManager) this.f4506a.getSystemService("connectivity")).registerNetworkCallback(build, bVar);
    }

    /* renamed from: f */
    public void mo19042f() {
        C3151e.m7757e(Looper.myLooper());
        this.f4510e = this.f4508c.mo19035e(this.f4506a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f4508c.mo19036f() != 0) {
            if (C3152e0.f5819a >= 23) {
                mo19041e();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f4508c.mo19037h()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f4508c.mo19038i()) {
            if (C3152e0.f5819a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        C2859c cVar = new C2859c();
        this.f4509d = cVar;
        this.f4506a.registerReceiver(cVar, intentFilter, (String) null, new Handler());
        m6225d(this + " started");
    }

    /* renamed from: g */
    public void mo19043g() {
        this.f4506a.unregisterReceiver(this.f4509d);
        this.f4509d = null;
        if (this.f4511f != null) {
            mo19044h();
        }
        m6225d(this + " stopped");
    }

    /* renamed from: h */
    public final void mo19044h() {
        if (C3152e0.f5819a >= 21) {
            ((ConnectivityManager) this.f4506a.getSystemService("connectivity")).unregisterNetworkCallback(this.f4511f);
            this.f4511f = null;
        }
    }

    public String toString() {
        return super.toString();
    }
}
