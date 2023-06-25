package p040c.p077d.p078a.p098l;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import p040c.p077d.p078a.p098l.C1876c;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.l.e */
/* compiled from: DefaultConnectivityMonitor */
public final class C1879e implements C1876c {

    /* renamed from: a */
    public final Context f1487a;

    /* renamed from: b */
    public final C1876c.C1877a f1488b;

    /* renamed from: c */
    public boolean f1489c;

    /* renamed from: d */
    public boolean f1490d;

    /* renamed from: e */
    public final BroadcastReceiver f1491e = new C1880a();

    /* renamed from: c.d.a.l.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    public class C1880a extends BroadcastReceiver {
        public C1880a() {
        }

        public void onReceive(@NonNull Context context, Intent intent) {
            C1879e eVar = C1879e.this;
            boolean z = eVar.f1489c;
            eVar.f1489c = eVar.mo16200i(context);
            if (z != C1879e.this.f1489c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    "connectivity changed, isConnected: " + C1879e.this.f1489c;
                }
                C1879e eVar2 = C1879e.this;
                eVar2.f1488b.mo15521a(eVar2.f1489c);
            }
        }
    }

    public C1879e(@NonNull Context context, @NonNull C1876c.C1877a aVar) {
        this.f1487a = context.getApplicationContext();
        this.f1488b = aVar;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: i */
    public boolean mo16200i(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C1949i.m2563d(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException unused) {
            boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    /* renamed from: j */
    public final void mo16201j() {
        if (!this.f1490d) {
            this.f1489c = mo16200i(this.f1487a);
            try {
                this.f1487a.registerReceiver(this.f1491e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f1490d = true;
            } catch (SecurityException unused) {
                boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 5);
            }
        }
    }

    /* renamed from: k */
    public final void mo16202k() {
        if (this.f1490d) {
            this.f1487a.unregisterReceiver(this.f1491e);
            this.f1490d = false;
        }
    }

    public void onDestroy() {
    }

    public void onStart() {
        mo16201j();
    }

    public void onStop() {
        mo16202k();
    }
}
