package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;
import p040c.p313b0.p314a.p315a.C4149d;

public class ServiceConnection extends CustomTabsServiceConnection {

    /* renamed from: e */
    public WeakReference<C4149d> f16772e;

    public ServiceConnection(C4149d dVar) {
        this.f16772e = new WeakReference<>(dVar);
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        C4149d dVar = (C4149d) this.f16772e.get();
        if (dVar != null) {
            dVar.mo25469b(customTabsClient);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C4149d dVar = (C4149d) this.f16772e.get();
        if (dVar != null) {
            dVar.mo25468a();
        }
    }
}
