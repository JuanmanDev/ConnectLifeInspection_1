package p040c.p200q.p363c.p400x;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: c.q.c.x.t */
/* compiled from: lambda */
public final /* synthetic */ class C6855t implements Callable {

    /* renamed from: e */
    public final /* synthetic */ Context f13114e;

    /* renamed from: l */
    public final /* synthetic */ ScheduledExecutorService f13115l;

    /* renamed from: m */
    public final /* synthetic */ FirebaseMessaging f13116m;

    /* renamed from: n */
    public final /* synthetic */ C6841m0 f13117n;

    /* renamed from: o */
    public final /* synthetic */ C6835j0 f13118o;

    public /* synthetic */ C6855t(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C6841m0 m0Var, C6835j0 j0Var) {
        this.f13114e = context;
        this.f13115l = scheduledExecutorService;
        this.f13116m = firebaseMessaging;
        this.f13117n = m0Var;
        this.f13118o = j0Var;
    }

    public final Object call() {
        return C6870z0.m19521h(this.f13114e, this.f13115l, this.f13116m, this.f13117n, this.f13118o);
    }
}
