package p648m.p668e.p677l;

import org.junit.runner.Result;
import p648m.p668e.p677l.p679h.C9757a;
import p648m.p668e.p677l.p679h.C9759b;

/* renamed from: m.e.l.c */
/* compiled from: JUnitCore */
public class C9745c {

    /* renamed from: a */
    public final C9759b f19020a = new C9759b();

    /* renamed from: b */
    public static C9742a m26229b() {
        return new C9742a();
    }

    /* renamed from: a */
    public void mo50566a(C9757a aVar) {
        this.f19020a.mo50581d(aVar);
    }

    /* renamed from: c */
    public void mo50567c(C9757a aVar) {
        this.f19020a.mo50590m(aVar);
    }

    /* renamed from: d */
    public Result mo50568d(C9746d dVar) {
        return mo50569e(dVar.getRunner());
    }

    /* renamed from: e */
    public Result mo50569e(C9749f fVar) {
        Result result = new Result();
        C9757a createListener = result.createListener();
        this.f19020a.mo50580c(createListener);
        try {
            this.f19020a.mo50588k(fVar.getDescription());
            fVar.run(this.f19020a);
            this.f19020a.mo50587j(result);
            return result;
        } finally {
            mo50567c(createListener);
        }
    }
}
