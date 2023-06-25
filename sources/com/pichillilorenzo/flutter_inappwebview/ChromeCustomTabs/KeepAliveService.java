package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class KeepAliveService extends Service {

    /* renamed from: e */
    public static final Binder f16771e = new Binder();

    public IBinder onBind(Intent intent) {
        return f16771e;
    }
}
