package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import com.google.gson.reflect.TypeToken;
import p040c.p130j.p131a.C2034a;
import p040c.p130j.p131a.p132c.C2041c;
import p040c.p130j.p131a.p134d.C2051b;

public class ScheduledNotificationReceiver extends BroadcastReceiver {

    /* renamed from: com.dexterous.flutterlocalnotifications.ScheduledNotificationReceiver$a */
    public class C3868a extends TypeToken<C2041c> {
        public C3868a(ScheduledNotificationReceiver scheduledNotificationReceiver) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        String stringExtra = intent.getStringExtra(C2034a.f1772q);
        boolean booleanExtra = intent.getBooleanExtra(C2034a.f1773r, false);
        if (C2051b.m2853a(stringExtra).booleanValue()) {
            Notification notification = (Notification) intent.getParcelableExtra(C2034a.f1771p);
            notification.when = System.currentTimeMillis();
            int intExtra = intent.getIntExtra(C2034a.f1770o, 0);
            from.notify(intExtra, notification);
            if (!booleanExtra) {
                C2034a.m2770E(Integer.valueOf(intExtra), context);
                return;
            }
            return;
        }
        C2041c cVar = (C2041c) C2034a.m2791b().fromJson(stringExtra, new C3868a(this).getType());
        C2034a.m2795e0(context, cVar);
        if (!booleanExtra) {
            C2034a.m2770E(cVar.f1831a, context);
        }
    }
}
