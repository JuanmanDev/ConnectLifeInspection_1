package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import p040c.p200q.p201a.p264c.p276d.C3324b;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.l.v */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3419v extends C3392k1 {

    /* renamed from: p */
    public final ArraySet<C3362b<?>> f6373p = new ArraySet<>();

    /* renamed from: q */
    public final C3375f f6374q;

    public C3419v(C3381h hVar, C3375f fVar, C3324b bVar) {
        super(hVar, bVar);
        this.f6374q = fVar;
        this.f8198e.mo20555e("ConnectionlessLifecycleHelper", this);
    }

    @MainThread
    /* renamed from: u */
    public static void m8711u(Activity activity, C3375f fVar, C3362b<?> bVar) {
        C3381h c = LifecycleCallback.m10884c(activity);
        C3419v vVar = (C3419v) c.mo20556i("ConnectionlessLifecycleHelper", C3419v.class);
        if (vVar == null) {
            vVar = new C3419v(c, fVar, C3324b.m8405m());
        }
        C3495o.m8909k(bVar, "ApiKey cannot be null");
        vVar.f6373p.add(bVar);
        fVar.mo20535d(vVar);
    }

    /* renamed from: h */
    public final void mo20616h() {
        super.mo20616h();
        mo20618v();
    }

    /* renamed from: j */
    public final void mo20580j() {
        super.mo20580j();
        mo20618v();
    }

    /* renamed from: k */
    public final void mo20581k() {
        super.mo20581k();
        this.f6374q.mo20536e(this);
    }

    /* renamed from: m */
    public final void mo20583m(ConnectionResult connectionResult, int i) {
        this.f6374q.mo20532H(connectionResult, i);
    }

    /* renamed from: n */
    public final void mo20584n() {
        this.f6374q.mo20533b();
    }

    /* renamed from: t */
    public final ArraySet<C3362b<?>> mo20617t() {
        return this.f6373p;
    }

    /* renamed from: v */
    public final void mo20618v() {
        if (!this.f6373p.isEmpty()) {
            this.f6374q.mo20535d(this);
        }
    }
}
