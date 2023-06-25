package p540d.p544b.p545a.p546a;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: d.b.a.a.a */
/* compiled from: Connectivity */
public class C8885a {

    /* renamed from: a */
    public ConnectivityManager f17403a;

    public C8885a(ConnectivityManager connectivityManager) {
        this.f17403a = connectivityManager;
    }

    /* renamed from: a */
    public String mo46244a() {
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = this.f17403a.getNetworkCapabilities(this.f17403a.getActiveNetwork());
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
        return mo46245b();
    }

    /* renamed from: b */
    public final String mo46245b() {
        NetworkInfo activeNetworkInfo = this.f17403a.getActiveNetworkInfo();
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
}
