package p040c.p200q.p201a.p264c.p347m;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3381h;

/* renamed from: c.q.a.c.m.m0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5778m0 extends LifecycleCallback {

    /* renamed from: l */
    public final List f11271l = new ArrayList();

    public C5778m0(C3381h hVar) {
        super(hVar);
        this.f8198e.mo20555e("TaskOnStopCallback", this);
    }

    /* renamed from: l */
    public static C5778m0 m16419l(Activity activity) {
        C3381h c = LifecycleCallback.m10884c(activity);
        C5778m0 m0Var = (C5778m0) c.mo20556i("TaskOnStopCallback", C5778m0.class);
        return m0Var == null ? new C5778m0(c) : m0Var;
    }

    @MainThread
    /* renamed from: k */
    public final void mo20581k() {
        synchronized (this.f11271l) {
            for (WeakReference weakReference : this.f11271l) {
                C5768h0 h0Var = (C5768h0) weakReference.get();
                if (h0Var != null) {
                    h0Var.mo28827b();
                }
            }
            this.f11271l.clear();
        }
    }

    /* renamed from: m */
    public final void mo28866m(C5768h0 h0Var) {
        synchronized (this.f11271l) {
            this.f11271l.add(new WeakReference(h0Var));
        }
    }
}
