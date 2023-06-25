package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ItemTouchHelper;

/* renamed from: c.q.a.c.i.b.c9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5449c9 {

    /* renamed from: a */
    public C5437b9 f10370a;

    /* renamed from: b */
    public final /* synthetic */ C5509h9 f10371b;

    public C5449c9(C5509h9 h9Var) {
        this.f10371b = h9Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo28137a(long j) {
        this.f10370a = new C5437b9(this, this.f10371b.f10699a.mo28488c().mo20838a(), j);
        this.f10371b.f10528c.postDelayed(this.f10370a, ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS);
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28138b() {
        this.f10371b.mo28029h();
        C5437b9 b9Var = this.f10370a;
        if (b9Var != null) {
            this.f10371b.f10528c.removeCallbacks(b9Var);
        }
        this.f10371b.f10699a.mo28622F().f11086r.mo28589a(false);
    }
}
