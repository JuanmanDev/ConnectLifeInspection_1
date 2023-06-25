package p648m.p684g.p685d;

import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import p648m.p684g.C9805b;
import p648m.p684g.p686e.C9812c;

/* renamed from: m.g.d.a */
/* compiled from: EventRecodingLogger */
public class C9807a implements C9805b {

    /* renamed from: e */
    public String f19068e;

    /* renamed from: l */
    public C9812c f19069l;

    /* renamed from: m */
    public Queue<C9809c> f19070m;

    public C9807a(C9812c cVar, Queue<C9809c> queue) {
        this.f19069l = cVar;
        this.f19068e = cVar.getName();
        this.f19070m = queue;
    }

    /* renamed from: a */
    public final void mo50708a(Level level, String str, Object[] objArr, Throwable th) {
        mo50709b(level, (Marker) null, str, objArr, th);
    }

    /* renamed from: b */
    public final void mo50709b(Level level, Marker marker, String str, Object[] objArr, Throwable th) {
        C9809c cVar = new C9809c();
        cVar.mo50719j(System.currentTimeMillis());
        cVar.mo50712c(level);
        cVar.mo50713d(this.f19069l);
        cVar.mo50714e(this.f19068e);
        cVar.mo50715f(marker);
        cVar.mo50716g(str);
        cVar.mo50711b(objArr);
        cVar.mo50718i(th);
        cVar.mo50717h(Thread.currentThread().getName());
        this.f19070m.add(cVar);
    }

    public void error(String str) {
        mo50708a(Level.ERROR, str, (Object[]) null, (Throwable) null);
    }

    public String getName() {
        return this.f19068e;
    }

    public boolean isTraceEnabled() {
        return true;
    }

    public void trace(String str) {
        mo50708a(Level.TRACE, str, (Object[]) null, (Throwable) null);
    }

    public void error(String str, Throwable th) {
        mo50708a(Level.ERROR, str, (Object[]) null, th);
    }

    public void trace(String str, Object obj) {
        mo50708a(Level.TRACE, str, new Object[]{obj}, (Throwable) null);
    }

    public void trace(String str, Object obj, Object obj2) {
        mo50708a(Level.TRACE, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    public void trace(String str, Throwable th) {
        mo50708a(Level.TRACE, str, (Object[]) null, th);
    }
}
