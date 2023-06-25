package p553f.p554a.p576f.p577a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import p553f.p554a.p570e.p571a.C9006d;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: f.a.f.a.a */
/* compiled from: ConnectivityPlugin */
public class C9068a implements C9017j.C9021c, C9006d.C9011d {

    /* renamed from: e */
    public final C9024l.C9027c f17805e;

    /* renamed from: l */
    public final ConnectivityManager f17806l;

    /* renamed from: m */
    public BroadcastReceiver f17807m;

    /* renamed from: f.a.f.a.a$a */
    /* compiled from: ConnectivityPlugin */
    public class C9069a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C9006d.C9008b f17808a;

        public C9069a(C9006d.C9008b bVar) {
            this.f17808a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            this.f17808a.success(C9068a.this.mo46733b());
        }
    }

    public C9068a(C9024l.C9027c cVar) {
        this.f17805e = cVar;
        this.f17806l = (ConnectivityManager) cVar.mo46298c().getApplicationContext().getSystemService("connectivity");
    }

    /* renamed from: k */
    public static void m24635k(C9024l.C9027c cVar) {
        C9017j jVar = new C9017j(cVar.mo46301f(), "plugins.flutter.io/connectivity");
        C9006d dVar = new C9006d(cVar.mo46301f(), "plugins.flutter.io/connectivity_status");
        C9068a aVar = new C9068a(cVar);
        jVar.mo46575e(aVar);
        dVar.mo46556d(aVar);
    }

    /* renamed from: b */
    public final String mo46733b() {
        return mo46735d(this.f17806l);
    }

    /* renamed from: c */
    public final BroadcastReceiver mo46734c(C9006d.C9008b bVar) {
        return new C9069a(bVar);
    }

    /* renamed from: d */
    public final String mo46735d(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
        }
        return mo46736e(connectivityManager);
    }

    /* renamed from: e */
    public final String mo46736e(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return "mobile";
        }
        if (type == 1) {
            return "wifi";
        }
        if (type == 4 || type == 5) {
            return "mobile";
        }
        if (type == 6 || type == 9) {
            return "wifi";
        }
        return "none";
    }

    /* renamed from: f */
    public final WifiInfo mo46737f() {
        WifiManager wifiManager = (WifiManager) this.f17805e.mo46298c().getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    /* renamed from: g */
    public final void mo46738g(C9016i iVar, C9017j.C9022d dVar) {
        WifiInfo f = mo46737f();
        dVar.success(f != null ? f.getBSSID() : null);
    }

    /* renamed from: h */
    public final void mo46739h(C9016i iVar, C9017j.C9022d dVar) {
        dVar.success(mo46733b());
    }

    /* renamed from: i */
    public final void mo46740i(C9016i iVar, C9017j.C9022d dVar) {
        WifiManager wifiManager = (WifiManager) this.f17805e.mo46298c().getApplicationContext().getSystemService("wifi");
        String str = null;
        WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
        int ipAddress = connectionInfo != null ? connectionInfo.getIpAddress() : 0;
        if (ipAddress != 0) {
            str = String.format("%d.%d.%d.%d", new Object[]{Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255)});
        }
        dVar.success(str);
    }

    /* renamed from: j */
    public final void mo46741j(C9016i iVar, C9017j.C9022d dVar) {
        WifiInfo f = mo46737f();
        String ssid = f != null ? f.getSSID() : null;
        if (ssid != null) {
            ssid = ssid.replaceAll("\"", "");
        }
        dVar.success(ssid);
    }

    public void onCancel(Object obj) {
        this.f17805e.mo46298c().unregisterReceiver(this.f17807m);
        this.f17807m = null;
    }

    public void onListen(Object obj, C9006d.C9008b bVar) {
        this.f17807m = mo46734c(bVar);
        this.f17805e.mo46298c().registerReceiver(this.f17807m, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r6, p553f.p554a.p570e.p571a.C9017j.C9022d r7) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f17687a
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1340798144: goto L_0x002b;
                case 94627080: goto L_0x0021;
                case 1373405384: goto L_0x0017;
                case 1756715352: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r1 = "wifiIPAddress"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0036
        L_0x0017:
            java.lang.String r1 = "wifiBSSID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r3
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "check"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "wifiName"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r4
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x004e
            if (r0 == r4) goto L_0x004a
            if (r0 == r3) goto L_0x0046
            if (r0 == r2) goto L_0x0042
            r7.notImplemented()
            goto L_0x0051
        L_0x0042:
            r5.mo46740i(r6, r7)
            goto L_0x0051
        L_0x0046:
            r5.mo46738g(r6, r7)
            goto L_0x0051
        L_0x004a:
            r5.mo46741j(r6, r7)
            goto L_0x0051
        L_0x004e:
            r5.mo46739h(r6, r7)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p577a.C9068a.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
