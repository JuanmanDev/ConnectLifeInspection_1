package p040c.p325e0.p326a.p327b.p328a.p329a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.p028os.EnvironmentCompat;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p325e0.p326a.p332c.C4270g;

/* renamed from: c.e0.a.b.a.a.c */
/* compiled from: BUGLY */
public class C4261c {
    /* renamed from: a */
    public static String m11609a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (C4270g.m11650c(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static String m11610b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (C4270g.m11650c(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: c */
    public static int m11611c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (C4270g.m11650c(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: d */
    public static String m11612d(Context context) {
        TelephonyManager telephonyManager;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0 || (telephonyManager = (TelephonyManager) context.getSystemService(EventBusConstKt.PHONE)) == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            int networkType = telephonyManager.getNetworkType();
            switch (networkType) {
                case 1:
                    return "GPRS";
                case 2:
                    return "EDGE";
                case 3:
                    return "UMTS";
                case 4:
                    return "CDMA";
                case 5:
                    return "EVDO_0";
                case 6:
                    return "EVDO_A";
                case 7:
                    return "1xRTT";
                case 8:
                    return "HSDPA";
                case 9:
                    return "HSUPA";
                case 10:
                    return "HSPA";
                case 11:
                    return "iDen";
                case 12:
                    return "EVDO_B";
                case 13:
                    return "LTE";
                case 14:
                    return "eHRPD";
                case 15:
                    return "HSPA+";
                default:
                    return "MOBILE(" + networkType + ")";
            }
        } catch (Exception e) {
            if (C4270g.m11650c(e)) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            e.printStackTrace();
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: e */
    public static String m11613e() {
        try {
            return Build.BRAND;
        } catch (Throwable th) {
            if (!C4270g.m11650c(th)) {
                th.printStackTrace();
            }
            return "fail";
        }
    }
}
