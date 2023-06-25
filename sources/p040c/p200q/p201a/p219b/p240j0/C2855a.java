package p040c.p200q.p201a.p219b.p240j0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.j0.a */
/* compiled from: Requirements */
public final class C2855a {

    /* renamed from: a */
    public final int f4505a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2855a(int i, boolean z, boolean z2) {
        this(i | (z ? 16 : 0) | (z2 ? 8 : 0));
    }

    /* renamed from: c */
    public static boolean m6213c(ConnectivityManager connectivityManager) {
        if (C3152e0.f5819a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean z = false;
        if (activeNetwork == null) {
            m6215j("No active network.");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
            z = true;
        }
        m6215j("Network capability validated: " + z);
        return !z;
    }

    /* renamed from: g */
    public static boolean m6214g(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (C3152e0.f5819a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    /* renamed from: j */
    public static void m6215j(String str) {
    }

    /* renamed from: a */
    public final boolean mo19032a(Context context) {
        if (!mo19037h()) {
            return true;
        }
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo19033b(Context context) {
        if (!mo19038i()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i = C3152e0.f5819a;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo19034d(Context context) {
        int f = mo19036f();
        if (f == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            m6215j("No network info or no connection.");
            return false;
        } else if (!m6213c(connectivityManager)) {
            return false;
        } else {
            if (f == 1) {
                return true;
            }
            if (f == 3) {
                boolean isRoaming = activeNetworkInfo.isRoaming();
                m6215j("Roaming: " + isRoaming);
                return !isRoaming;
            }
            boolean g = m6214g(connectivityManager, activeNetworkInfo);
            m6215j("Metered network: " + g);
            if (f == 2) {
                return !g;
            }
            if (f == 4) {
                return g;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public boolean mo19035e(Context context) {
        return mo19034d(context) && mo19032a(context) && mo19033b(context);
    }

    /* renamed from: f */
    public int mo19036f() {
        return this.f4505a & 7;
    }

    /* renamed from: h */
    public boolean mo19037h() {
        return (this.f4505a & 16) != 0;
    }

    /* renamed from: i */
    public boolean mo19038i() {
        return (this.f4505a & 8) != 0;
    }

    public String toString() {
        return super.toString();
    }

    public C2855a(int i) {
        this.f4505a = i;
    }
}
