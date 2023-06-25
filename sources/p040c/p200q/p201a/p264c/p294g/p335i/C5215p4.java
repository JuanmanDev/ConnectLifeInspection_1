package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.p4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5215p4 {

    /* renamed from: a */
    public final C5215p4 f10056a;

    /* renamed from: b */
    public final C5345y f10057b;

    /* renamed from: c */
    public final Map f10058c = new HashMap();

    /* renamed from: d */
    public final Map f10059d = new HashMap();

    public C5215p4(C5215p4 p4Var, C5345y yVar) {
        this.f10056a = p4Var;
        this.f10057b = yVar;
    }

    /* renamed from: a */
    public final C5215p4 mo27495a() {
        return new C5215p4(this, this.f10057b);
    }

    /* renamed from: b */
    public final C5225q mo27496b(C5225q qVar) {
        return this.f10057b.mo27938a(this, qVar);
    }

    /* renamed from: c */
    public final C5225q mo27497c(C5054f fVar) {
        C5225q qVar = C5225q.f10068c;
        Iterator y = fVar.mo27222y();
        while (y.hasNext()) {
            qVar = this.f10057b.mo27938a(this, fVar.mo27220v(((Integer) y.next()).intValue()));
            if (qVar instanceof C5086h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C5225q mo27498d(String str) {
        if (this.f10058c.containsKey(str)) {
            return (C5225q) this.f10058c.get(str);
        }
        C5215p4 p4Var = this.f10056a;
        if (p4Var != null) {
            return p4Var.mo27498d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo27499e(String str, C5225q qVar) {
        if (!this.f10059d.containsKey(str)) {
            if (qVar == null) {
                this.f10058c.remove(str);
            } else {
                this.f10058c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo27500f(String str, C5225q qVar) {
        mo27499e(str, qVar);
        this.f10059d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo27501g(String str, C5225q qVar) {
        C5215p4 p4Var;
        if (!this.f10058c.containsKey(str) && (p4Var = this.f10056a) != null && p4Var.mo27502h(str)) {
            this.f10056a.mo27501g(str, qVar);
        } else if (!this.f10059d.containsKey(str)) {
            if (qVar == null) {
                this.f10058c.remove(str);
            } else {
                this.f10058c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo27502h(String str) {
        if (this.f10058c.containsKey(str)) {
            return true;
        }
        C5215p4 p4Var = this.f10056a;
        if (p4Var != null) {
            return p4Var.mo27502h(str);
        }
        return false;
    }
}
