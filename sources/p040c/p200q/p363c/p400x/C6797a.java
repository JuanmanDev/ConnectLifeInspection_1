package p040c.p200q.p363c.p400x;

import android.content.Intent;
import com.google.firebase.messaging.EnhancedIntentService;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.c.x.a */
/* compiled from: lambda */
public final /* synthetic */ class C6797a implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ EnhancedIntentService f12999e;

    /* renamed from: l */
    public final /* synthetic */ Intent f13000l;

    /* renamed from: m */
    public final /* synthetic */ C5773k f13001m;

    public /* synthetic */ C6797a(EnhancedIntentService enhancedIntentService, Intent intent, C5773k kVar) {
        this.f12999e = enhancedIntentService;
        this.f13000l = intent;
        this.f13001m = kVar;
    }

    public final void run() {
        this.f12999e.mo37441b(this.f13000l, this.f13001m);
    }
}
