package p040c.p200q.p201a.p219b.p241k0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.l */
/* compiled from: BaseMediaSource */
public abstract class C2996l implements C3014u {

    /* renamed from: e */
    public final ArrayList<C3014u.C3016b> f5189e = new ArrayList<>(1);

    /* renamed from: l */
    public final C3017v.C3018a f5190l = new C3017v.C3018a();
    @Nullable

    /* renamed from: m */
    public Looper f5191m;
    @Nullable

    /* renamed from: n */
    public C2578a0 f5192n;
    @Nullable

    /* renamed from: o */
    public Object f5193o;

    /* renamed from: b */
    public final void mo19473b(C3014u.C3016b bVar, @Nullable C3141v vVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f5191m;
        C3151e.m7753a(looper == null || looper == myLooper);
        this.f5189e.add(bVar);
        if (this.f5191m == null) {
            this.f5191m = myLooper;
            mo19165n(vVar);
            return;
        }
        C2578a0 a0Var = this.f5192n;
        if (a0Var != null) {
            bVar.mo18985d(this, a0Var, this.f5193o);
        }
    }

    /* renamed from: d */
    public final void mo19474d(Handler handler, C3017v vVar) {
        this.f5190l.mo19523a(handler, vVar);
    }

    /* renamed from: e */
    public final void mo19475e(C3017v vVar) {
        this.f5190l.mo19519D(vVar);
    }

    /* renamed from: g */
    public final void mo19476g(C3014u.C3016b bVar) {
        this.f5189e.remove(bVar);
        if (this.f5189e.isEmpty()) {
            this.f5191m = null;
            this.f5192n = null;
            this.f5193o = null;
            mo19166p();
        }
    }

    /* renamed from: j */
    public final C3017v.C3018a mo19477j(@Nullable C3014u.C3015a aVar) {
        return this.f5190l.mo19522G(0, aVar, 0);
    }

    /* renamed from: m */
    public final C3017v.C3018a mo19478m(C3014u.C3015a aVar, long j) {
        C3151e.m7753a(aVar != null);
        return this.f5190l.mo19522G(0, aVar, j);
    }

    /* renamed from: n */
    public abstract void mo19165n(@Nullable C3141v vVar);

    /* renamed from: o */
    public final void mo19479o(C2578a0 a0Var, @Nullable Object obj) {
        this.f5192n = a0Var;
        this.f5193o = obj;
        Iterator<C3014u.C3016b> it = this.f5189e.iterator();
        while (it.hasNext()) {
            it.next().mo18985d(this, a0Var, obj);
        }
    }

    /* renamed from: p */
    public abstract void mo19166p();
}
