package p040c.p077d.p078a.p098l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p040c.p077d.p078a.p101o.C1909c;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.l.m */
/* compiled from: RequestTracker */
public class C1890m {

    /* renamed from: a */
    public final Set<C1909c> f1502a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List<C1909c> f1503b = new ArrayList();

    /* renamed from: c */
    public boolean f1504c;

    /* renamed from: a */
    public final boolean mo16224a(@Nullable C1909c cVar, boolean z) {
        boolean z2 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f1502a.remove(cVar);
        if (!this.f1503b.remove(cVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            cVar.clear();
            if (z) {
                cVar.mo16323c();
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean mo16225b(@Nullable C1909c cVar) {
        return mo16224a(cVar, true);
    }

    /* renamed from: c */
    public void mo16226c() {
        for (T a : C1950j.m2573i(this.f1502a)) {
            mo16224a(a, false);
        }
        this.f1503b.clear();
    }

    /* renamed from: d */
    public void mo16227d() {
        this.f1504c = true;
        for (T t : C1950j.m2573i(this.f1502a)) {
            if (t.isRunning()) {
                t.clear();
                this.f1503b.add(t);
            }
        }
    }

    /* renamed from: e */
    public void mo16228e() {
        for (T t : C1950j.m2573i(this.f1502a)) {
            if (!t.mo16334l() && !t.mo16329h()) {
                t.clear();
                if (!this.f1504c) {
                    t.mo16332j();
                } else {
                    this.f1503b.add(t);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo16229f() {
        this.f1504c = false;
        for (T t : C1950j.m2573i(this.f1502a)) {
            if (!t.mo16334l() && !t.isRunning()) {
                t.mo16332j();
            }
        }
        this.f1503b.clear();
    }

    /* renamed from: g */
    public void mo16230g(@NonNull C1909c cVar) {
        this.f1502a.add(cVar);
        if (!this.f1504c) {
            cVar.mo16332j();
            return;
        }
        cVar.clear();
        boolean isLoggable = Log.isLoggable("RequestTracker", 2);
        this.f1503b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f1502a.size() + ", isPaused=" + this.f1504c + "}";
    }
}
