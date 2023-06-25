package com.gigya.android.sdk.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p169q.C2178c;

public class RemoteMessageLocalReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final C2178c f7204a;

    public void onReceive(Context context, Intent intent) {
        if (intent.getExtras() == null) {
            C2103f.m3057c("TFARemoteMessageLocalReceiver", "onReceive: extras null!");
            return;
        }
        HashMap hashMap = (HashMap) intent.getExtras().get("extra_remote_message_data");
        if (hashMap == null) {
            C2103f.m3057c("TFARemoteMessageLocalReceiver", "onReceive: remoteMessage null!");
            return;
        }
        C2103f.m3056b("TFARemoteMessageLocalReceiver", "onReceive: routing message to handler");
        this.f7204a.mo17012a(hashMap);
    }
}
