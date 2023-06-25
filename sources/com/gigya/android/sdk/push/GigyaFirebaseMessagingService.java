package com.gigya.android.sdk.push;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;
import p040c.p151o.p152a.p153a.C2103f;

public class GigyaFirebaseMessagingService extends FirebaseMessagingService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.mo37476P() == null) {
            C2103f.m3056b("GigyaMessagingService", "onMessageReceived: data null!");
            return;
        }
        C2103f.m3056b("GigyaMessagingService", "onMessageReceived: " + remoteMessage.mo37476P().toString());
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("intent_action_remote_message").putExtra("extra_remote_message_data", new HashMap(remoteMessage.mo37476P())));
    }

    public void onNewToken(String str) {
        C2103f.m3056b("GigyaMessagingService", "onNewToken: " + str);
        getSharedPreferences("GSLIB", 0).edit().putString("GS_PUSH_TOKEN", str).apply();
    }
}
