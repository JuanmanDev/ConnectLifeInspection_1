package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RequiresPermission;
import java.util.HashSet;
import java.util.Set;
import p040c.p072c.p073a.p074a.C1493b0;
import p040c.p072c.p073a.p074a.C1535z;

public final class NetworkUtils {

    public static final class NetworkChangedReceiver extends BroadcastReceiver {

        /* renamed from: a */
        public NetworkType f6973a;

        /* renamed from: b */
        public Set<C3818a> f6974b = new HashSet();

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$a */
        public class C3814a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ C3818a f6975e;

            public C3814a(C3818a aVar) {
                this.f6975e = aVar;
            }

            @SuppressLint({"MissingPermission"})
            public void run() {
                int size = NetworkChangedReceiver.this.f6974b.size();
                NetworkChangedReceiver.this.f6974b.add(this.f6975e);
                if (size == 0 && NetworkChangedReceiver.this.f6974b.size() == 1) {
                    NetworkType unused = NetworkChangedReceiver.this.f6973a = NetworkUtils.m9571b();
                    C1535z.m1079a().registerReceiver(NetworkChangedReceiver.m9577e(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        }

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$b */
        public class C3815b implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ C3818a f6977e;

            public C3815b(C3818a aVar) {
                this.f6977e = aVar;
            }

            public void run() {
                int size = NetworkChangedReceiver.this.f6974b.size();
                NetworkChangedReceiver.this.f6974b.remove(this.f6977e);
                if (size == 1 && NetworkChangedReceiver.this.f6974b.size() == 0) {
                    C1535z.m1079a().unregisterReceiver(NetworkChangedReceiver.m9577e());
                }
            }
        }

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$c */
        public class C3816c implements Runnable {
            public C3816c() {
            }

            public void run() {
                NetworkType b = NetworkUtils.m9571b();
                if (NetworkChangedReceiver.this.f6973a != b) {
                    NetworkType unused = NetworkChangedReceiver.this.f6973a = b;
                    if (b == NetworkType.NETWORK_NO) {
                        for (C3818a b2 : NetworkChangedReceiver.this.f6974b) {
                            b2.mo21593b();
                        }
                        return;
                    }
                    for (C3818a a : NetworkChangedReceiver.this.f6974b) {
                        a.mo21592a(b);
                    }
                }
            }
        }

        /* renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$d */
        public static class C3817d {

            /* renamed from: a */
            public static final NetworkChangedReceiver f6980a = new NetworkChangedReceiver();
        }

        /* renamed from: e */
        public static NetworkChangedReceiver m9577e() {
            return C3817d.f6980a;
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C1493b0.m873C(new C3816c(), 1000);
            }
        }

        public void registerListener(C3818a aVar) {
            if (aVar != null) {
                C1493b0.m872B(new C3814a(aVar));
            }
        }

        public void unregisterListener(C3818a aVar) {
            if (aVar != null) {
                C1493b0.m872B(new C3815b(aVar));
            }
        }
    }

    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    /* renamed from: com.blankj.utilcode.util.NetworkUtils$a */
    public interface C3818a {
        /* renamed from: a */
        void mo21592a(NetworkType networkType);

        /* renamed from: b */
        void mo21593b();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: a */
    public static NetworkInfo m9570a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C1535z.m1079a().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: b */
    public static NetworkType m9571b() {
        if (m9572c()) {
            return NetworkType.NETWORK_ETHERNET;
        }
        NetworkInfo a = m9570a();
        if (a == null || !a.isAvailable()) {
            return NetworkType.NETWORK_NO;
        }
        if (a.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (a.getType() != 0) {
            return NetworkType.NETWORK_UNKNOWN;
        }
        switch (a.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.NETWORK_3G;
            case 13:
            case 18:
                return NetworkType.NETWORK_4G;
            case 20:
                return NetworkType.NETWORK_5G;
            default:
                String subtypeName = a.getSubtypeName();
                if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                    return NetworkType.NETWORK_3G;
                }
                return NetworkType.NETWORK_UNKNOWN;
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: c */
    public static boolean m9572c() {
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) C1535z.m1079a().getSystemService("connectivity");
        if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(9)) == null || (state = networkInfo.getState()) == null) {
            return false;
        }
        if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) {
            return true;
        }
        return false;
    }

    public static void registerNetworkStatusChangedListener(C3818a aVar) {
        NetworkChangedReceiver.m9577e().registerListener(aVar);
    }

    public static void unregisterNetworkStatusChangedListener(C3818a aVar) {
        NetworkChangedReceiver.m9577e().unregisterListener(aVar);
    }
}
