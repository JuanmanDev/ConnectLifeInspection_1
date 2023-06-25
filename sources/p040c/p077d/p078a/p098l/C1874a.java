package p040c.p077d.p078a.p098l;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.l.a */
/* compiled from: ActivityFragmentLifecycle */
public class C1874a implements C1883h {

    /* renamed from: a */
    public final Set<C1884i> f1484a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f1485b;

    /* renamed from: c */
    public boolean f1486c;

    /* renamed from: a */
    public void mo16194a(@NonNull C1884i iVar) {
        this.f1484a.add(iVar);
        if (this.f1486c) {
            iVar.onDestroy();
        } else if (this.f1485b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    /* renamed from: b */
    public void mo16195b(@NonNull C1884i iVar) {
        this.f1484a.remove(iVar);
    }

    /* renamed from: c */
    public void mo16196c() {
        this.f1486c = true;
        for (T onDestroy : C1950j.m2573i(this.f1484a)) {
            onDestroy.onDestroy();
        }
    }

    /* renamed from: d */
    public void mo16197d() {
        this.f1485b = true;
        for (T onStart : C1950j.m2573i(this.f1484a)) {
            onStart.onStart();
        }
    }

    /* renamed from: e */
    public void mo16198e() {
        this.f1485b = false;
        for (T onStop : C1950j.m2573i(this.f1484a)) {
            onStop.onStop();
        }
    }
}
