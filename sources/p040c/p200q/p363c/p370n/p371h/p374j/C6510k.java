package p040c.p200q.p363c.p370n.p371h.p374j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import p040c.p200q.p363c.p370n.p371h.C6479f;

/* renamed from: c.q.c.n.h.j.k */
/* compiled from: BatteryState */
public class C6510k {

    /* renamed from: a */
    public final Float f12226a;

    /* renamed from: b */
    public final boolean f12227b;

    public C6510k(Float f, boolean z) {
        this.f12227b = z;
        this.f12226a = f;
    }

    /* renamed from: a */
    public static C6510k m18205a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m18207e(registerReceiver);
                f = m18206d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C6479f.m18125f().mo30644e("An error occurred getting battery state.", e);
        }
        return new C6510k(f, z);
    }

    /* renamed from: d */
    public static Float m18206d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    public static boolean m18207e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float mo30690b() {
        return this.f12226a;
    }

    /* renamed from: c */
    public int mo30691c() {
        Float f;
        if (!this.f12227b || (f = this.f12226a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
