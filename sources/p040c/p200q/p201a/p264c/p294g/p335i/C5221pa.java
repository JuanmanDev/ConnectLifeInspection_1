package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.pa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5221pa implements Iterator {

    /* renamed from: e */
    public int f10061e = -1;

    /* renamed from: l */
    public boolean f10062l;

    /* renamed from: m */
    public Iterator f10063m;

    /* renamed from: n */
    public final /* synthetic */ C5281ta f10064n;

    public /* synthetic */ C5221pa(C5281ta taVar, C5206oa oaVar) {
        this.f10064n = taVar;
    }

    /* renamed from: a */
    public final Iterator mo27505a() {
        if (this.f10063m == null) {
            this.f10063m = this.f10064n.f10156m.entrySet().iterator();
        }
        return this.f10063m;
    }

    public final boolean hasNext() {
        if (this.f10061e + 1 < this.f10064n.f10155l.size()) {
            return true;
        }
        if (!this.f10064n.f10156m.isEmpty()) {
            return mo27505a().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f10062l = true;
        int i = this.f10061e + 1;
        this.f10061e = i;
        if (i < this.f10064n.f10155l.size()) {
            return (Map.Entry) this.f10064n.f10155l.get(this.f10061e);
        }
        return (Map.Entry) mo27505a().next();
    }

    public final void remove() {
        if (this.f10062l) {
            this.f10062l = false;
            this.f10064n.mo27742n();
            if (this.f10061e < this.f10064n.f10155l.size()) {
                C5281ta taVar = this.f10064n;
                int i = this.f10061e;
                this.f10061e = i - 1;
                Object unused = taVar.mo27740l(i);
                return;
            }
            mo27505a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
