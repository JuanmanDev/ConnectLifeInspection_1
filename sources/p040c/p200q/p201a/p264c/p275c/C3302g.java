package p040c.p200q.p201a.p264c.p275c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;

/* renamed from: c.q.a.c.c.g */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C3302g implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ CloudMessagingReceiver f6154e;

    /* renamed from: l */
    public final /* synthetic */ Intent f6155l;

    /* renamed from: m */
    public final /* synthetic */ Context f6156m;

    /* renamed from: n */
    public final /* synthetic */ boolean f6157n;

    /* renamed from: o */
    public final /* synthetic */ BroadcastReceiver.PendingResult f6158o;

    public /* synthetic */ C3302g(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f6154e = cloudMessagingReceiver;
        this.f6155l = intent;
        this.f6156m = context;
        this.f6157n = z;
        this.f6158o = pendingResult;
    }

    public final void run() {
        this.f6154e.mo24473d(this.f6155l, this.f6156m, this.f6157n, this.f6158o);
    }
}
