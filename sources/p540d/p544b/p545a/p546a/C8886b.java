package p540d.p544b.p545a.p546a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p553f.p554a.p570e.p571a.C9006d;

/* renamed from: d.b.a.a.b */
/* compiled from: ConnectivityBroadcastReceiver */
public class C8886b extends BroadcastReceiver implements C9006d.C9011d {

    /* renamed from: e */
    public Context f17404e;

    /* renamed from: l */
    public C8885a f17405l;

    /* renamed from: m */
    public C9006d.C9008b f17406m;

    public C8886b(Context context, C8885a aVar) {
        this.f17404e = context;
        this.f17405l = aVar;
    }

    public void onCancel(Object obj) {
        this.f17404e.unregisterReceiver(this);
    }

    public void onListen(Object obj, C9006d.C9008b bVar) {
        this.f17406m = bVar;
        this.f17404e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void onReceive(Context context, Intent intent) {
        C9006d.C9008b bVar = this.f17406m;
        if (bVar != null) {
            bVar.success(this.f17405l.mo46244a());
        }
    }
}
