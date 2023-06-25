package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.C2543u;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2422c;
import p040c.p200q.p201a.p202a.p205i.p213f0.C2523a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static /* synthetic */ void m10212a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C2543u.m4549f(context);
        C2538q.C2539a a = C2538q.m4531a();
        a.mo17949b(queryParameter);
        a.mo17951d(C2523a.m4482b(intValue));
        if (queryParameter2 != null) {
            a.mo17950c(Base64.decode(queryParameter2, 0));
        }
        C2543u.m4547c().mo17985e().mo17843m(a.mo17948a(), i, C2422c.f2771e);
    }
}
