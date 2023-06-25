package p040c.p200q.p201a.p264c.p294g.p335i;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: c.q.a.c.g.i.u2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C5288u2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e */
    public final /* synthetic */ C5303v2 f10168e;

    public C5288u2(C5303v2 v2Var) {
        this.f10168e = v2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f10168e.mo27807n(new C5168m2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f10168e.mo27807n(new C5273t2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f10168e.mo27807n(new C5228q2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f10168e.mo27807n(new C5198o2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C4976a1 a1Var = new C4976a1();
        this.f10168e.mo27807n(new C5258s2(this, activity, a1Var));
        Bundle e = a1Var.mo26911e(50);
        if (e != null) {
            bundle.putAll(e);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f10168e.mo27807n(new C5183n2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f10168e.mo27807n(new C5243r2(this, activity));
    }
}
