package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: c.q.a.c.g.i.b1 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C4992b1 {

    /* renamed from: a */
    public final C5199o3 f9813a;

    /* renamed from: b */
    public C5215p4 f9814b;

    /* renamed from: c */
    public final C5006c f9815c = new C5006c();

    /* renamed from: d */
    public final C5149ke f9816d = new C5149ke();

    public C4992b1() {
        C5199o3 o3Var = new C5199o3();
        this.f9813a = o3Var;
        this.f9814b = o3Var.f10027b.mo27495a();
        C5199o3 o3Var2 = this.f9813a;
        o3Var2.f10029d.mo27515a("internal.registerCallback", new C4974a(this));
        C5199o3 o3Var3 = this.f9813a;
        o3Var3.f10029d.mo27515a("internal.eventLogger", new C4991b0(this));
    }

    /* renamed from: a */
    public final C5006c mo26965a() {
        return this.f9815c;
    }

    /* renamed from: b */
    public final /* synthetic */ C5118j mo26966b() {
        return new C5085ge(this.f9816d);
    }

    /* renamed from: c */
    public final void mo26967c(C5124j5 j5Var) {
        C5118j jVar;
        try {
            this.f9814b = this.f9813a.f10027b.mo27495a();
            if (!(this.f9813a.mo27479a(this.f9814b, (C5186n5[]) j5Var.mo27341F().toArray(new C5186n5[0])) instanceof C5086h)) {
                for (C5092h5 h5Var : j5Var.mo27340D().mo27228G()) {
                    List F = h5Var.mo27303F();
                    String E = h5Var.mo27302E();
                    Iterator it = F.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C5225q a = this.f9813a.mo27479a(this.f9814b, (C5186n5) it.next());
                            if (a instanceof C5180n) {
                                C5215p4 p4Var = this.f9814b;
                                if (!p4Var.mo27502h(E)) {
                                    jVar = null;
                                } else {
                                    C5225q d = p4Var.mo27498d(E);
                                    if (d instanceof C5118j) {
                                        jVar = (C5118j) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(E)));
                                    }
                                }
                                if (jVar != null) {
                                    jVar.mo27025a(this.f9814b, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(E)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void mo26968d(String str, Callable callable) {
        this.f9813a.f10029d.mo27515a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo26969e(C4990b bVar) {
        try {
            this.f9815c.mo27030d(bVar);
            this.f9813a.f10028c.mo27501g("runtime.counter", new C5102i(Double.valueOf(0.0d)));
            this.f9816d.mo27380b(this.f9814b.mo27495a(), this.f9815c);
            return mo26971g() || mo26970f();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean mo26970f() {
        return !this.f9815c.mo27028c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo26971g() {
        C5006c cVar = this.f9815c;
        return !cVar.mo27027b().equals(cVar.mo27026a());
    }
}
