package p040c.p200q.p201a.p219b.p260n0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.n0.f */
/* compiled from: BaseDataSource */
public abstract class C3120f implements C3122h {

    /* renamed from: a */
    public final boolean f5707a;

    /* renamed from: b */
    public final ArrayList<C3141v> f5708b = new ArrayList<>(1);

    /* renamed from: c */
    public int f5709c;
    @Nullable

    /* renamed from: d */
    public C3125j f5710d;

    public C3120f(boolean z) {
        this.f5707a = z;
    }

    /* renamed from: b */
    public final void mo19308b(C3141v vVar) {
        if (!this.f5708b.contains(vVar)) {
            this.f5708b.add(vVar);
            this.f5709c++;
        }
    }

    /* renamed from: f */
    public final void mo19880f(int i) {
        C3125j jVar = this.f5710d;
        C3152e0.m7797f(jVar);
        C3125j jVar2 = jVar;
        for (int i2 = 0; i2 < this.f5709c; i2++) {
            this.f5708b.get(i2).mo19901f(this, jVar2, this.f5707a, i);
        }
    }

    /* renamed from: g */
    public final void mo19881g() {
        C3125j jVar = this.f5710d;
        C3152e0.m7797f(jVar);
        C3125j jVar2 = jVar;
        for (int i = 0; i < this.f5709c; i++) {
            this.f5708b.get(i).mo19899a(this, jVar2, this.f5707a);
        }
        this.f5710d = null;
    }

    /* renamed from: h */
    public final void mo19882h(C3125j jVar) {
        for (int i = 0; i < this.f5709c; i++) {
            this.f5708b.get(i).mo19902h(this, jVar, this.f5707a);
        }
    }

    /* renamed from: i */
    public final void mo19883i(C3125j jVar) {
        this.f5710d = jVar;
        for (int i = 0; i < this.f5709c; i++) {
            this.f5708b.get(i).mo19900b(this, jVar, this.f5707a);
        }
    }
}
