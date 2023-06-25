package com.amazon.identity.auth.device.authorization;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p040c.p048b.p049a.p050a.p051a.p056j.C1406o;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public class PackageIntentReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f6900a = PackageIntentReceiver.class.getName();

    public void onReceive(Context context, Intent intent) {
        String str = f6900a;
        C1485a.m832e(str, "Package Intent Received. Clearing Service Data. action=" + intent.getAction());
        C1406o.m455c(context);
    }
}
