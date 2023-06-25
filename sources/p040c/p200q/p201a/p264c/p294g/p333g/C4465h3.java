package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.h3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4465h3 implements Iterator {

    /* renamed from: e */
    public int f9262e = -1;

    /* renamed from: l */
    public boolean f9263l;

    /* renamed from: m */
    public Iterator f9264m;

    /* renamed from: n */
    public final /* synthetic */ C4573l3 f9265n;

    public /* synthetic */ C4465h3(C4573l3 l3Var, C4438g3 g3Var) {
        this.f9265n = l3Var;
    }

    /* renamed from: a */
    public final Iterator mo26057a() {
        if (this.f9264m == null) {
            this.f9264m = this.f9265n.f9373m.entrySet().iterator();
        }
        return this.f9264m;
    }

    public final boolean hasNext() {
        if (this.f9262e + 1 < this.f9265n.f9372l.size()) {
            return true;
        }
        if (!this.f9265n.f9373m.isEmpty()) {
            return mo26057a().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f9263l = true;
        int i = this.f9262e + 1;
        this.f9262e = i;
        if (i < this.f9265n.f9372l.size()) {
            return (Map.Entry) this.f9265n.f9372l.get(this.f9262e);
        }
        return (Map.Entry) mo26057a().next();
    }

    public final void remove() {
        if (this.f9263l) {
            this.f9263l = false;
            this.f9265n.mo26247n();
            if (this.f9262e < this.f9265n.f9372l.size()) {
                C4573l3 l3Var = this.f9265n;
                int i = this.f9262e;
                this.f9262e = i - 1;
                Object unused = l3Var.mo26245l(i);
                return;
            }
            mo26057a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
