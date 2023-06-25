package p040c.p077d.p078a.p098l;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p040c.p077d.p078a.p101o.p102j.C1925h;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.l.n */
/* compiled from: TargetTracker */
public final class C1891n implements C1884i {

    /* renamed from: a */
    public final Set<C1925h<?>> f1505a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    public void mo16232i() {
        this.f1505a.clear();
    }

    @NonNull
    /* renamed from: j */
    public List<C1925h<?>> mo16233j() {
        return C1950j.m2573i(this.f1505a);
    }

    /* renamed from: k */
    public void mo16234k(@NonNull C1925h<?> hVar) {
        this.f1505a.add(hVar);
    }

    /* renamed from: l */
    public void mo16235l(@NonNull C1925h<?> hVar) {
        this.f1505a.remove(hVar);
    }

    public void onDestroy() {
        for (T onDestroy : C1950j.m2573i(this.f1505a)) {
            onDestroy.onDestroy();
        }
    }

    public void onStart() {
        for (T onStart : C1950j.m2573i(this.f1505a)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        for (T onStop : C1950j.m2573i(this.f1505a)) {
            onStop.onStop();
        }
    }
}
