package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompatJellybean;
import java.util.HashMap;
import p040c.p313b0.p314a.C4221o;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

public class ActionBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Bundle extras = intent.getExtras();
            String string = extras.getString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_UUID");
            int i = extras.getInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID");
            String string2 = extras.getString("android.intent.extra.SUBJECT");
            C9003c cVar = C4221o.f8995c;
            C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_chromesafaribrowser_" + string);
            HashMap hashMap = new HashMap();
            hashMap.put("url", dataString);
            hashMap.put(NotificationCompatJellybean.KEY_TITLE, string2);
            hashMap.put("id", Integer.valueOf(i));
            jVar.mo46573c("onChromeSafariBrowserMenuItemActionPerform", hashMap);
        }
    }
}
