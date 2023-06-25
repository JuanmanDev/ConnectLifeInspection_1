package p648m.p668e.p677l.p679h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.StoppedByUserException;
import p648m.p668e.p677l.p679h.C9757a;

/* renamed from: m.e.l.h.b */
/* compiled from: RunNotifier */
public class C9759b {

    /* renamed from: a */
    public final List<C9757a> f19026a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public volatile boolean f19027b = false;

    /* renamed from: m.e.l.h.b$a */
    /* compiled from: RunNotifier */
    public class C9760a extends C9767h {

        /* renamed from: c */
        public final /* synthetic */ Description f19028c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9760a(C9759b bVar, Description description) {
            super(bVar);
            this.f19028c = description;
        }

        /* renamed from: a */
        public void mo50592a(C9757a aVar) {
            aVar.testRunStarted(this.f19028c);
        }
    }

    /* renamed from: m.e.l.h.b$b */
    /* compiled from: RunNotifier */
    public class C9761b extends C9767h {

        /* renamed from: c */
        public final /* synthetic */ Result f19029c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9761b(C9759b bVar, Result result) {
            super(bVar);
            this.f19029c = result;
        }

        /* renamed from: a */
        public void mo50592a(C9757a aVar) {
            aVar.testRunFinished(this.f19029c);
        }
    }

    /* renamed from: m.e.l.h.b$c */
    /* compiled from: RunNotifier */
    public class C9762c extends C9767h {

        /* renamed from: c */
        public final /* synthetic */ Description f19030c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9762c(C9759b bVar, Description description) {
            super(bVar);
            this.f19030c = description;
        }

        /* renamed from: a */
        public void mo50592a(C9757a aVar) {
            aVar.testStarted(this.f19030c);
        }
    }

    /* renamed from: m.e.l.h.b$d */
    /* compiled from: RunNotifier */
    public class C9763d extends C9767h {

        /* renamed from: c */
        public final /* synthetic */ List f19031c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9763d(C9759b bVar, List list, List list2) {
            super(list);
            this.f19031c = list2;
        }

        /* renamed from: a */
        public void mo50592a(C9757a aVar) {
            for (Failure testFailure : this.f19031c) {
                aVar.testFailure(testFailure);
            }
        }
    }

    /* renamed from: m.e.l.h.b$e */
    /* compiled from: RunNotifier */
    public class C9764e extends C9767h {

        /* renamed from: c */
        public final /* synthetic */ Failure f19032c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9764e(C9759b bVar, Failure failure) {
            super(bVar);
            this.f19032c = failure;
        }

        /* renamed from: a */
        public void mo50592a(C9757a aVar) {
            aVar.testAssumptionFailure(this.f19032c);
        }
    }

    /* renamed from: m.e.l.h.b$f */
    /* compiled from: RunNotifier */
    public class C9765f extends C9767h {

        /* renamed from: c */
        public final /* synthetic */ Description f19033c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9765f(C9759b bVar, Description description) {
            super(bVar);
            this.f19033c = description;
        }

        /* renamed from: a */
        public void mo50592a(C9757a aVar) {
            aVar.testIgnored(this.f19033c);
        }
    }

    /* renamed from: m.e.l.h.b$g */
    /* compiled from: RunNotifier */
    public class C9766g extends C9767h {

        /* renamed from: c */
        public final /* synthetic */ Description f19034c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9766g(C9759b bVar, Description description) {
            super(bVar);
            this.f19034c = description;
        }

        /* renamed from: a */
        public void mo50592a(C9757a aVar) {
            aVar.testFinished(this.f19034c);
        }
    }

    /* renamed from: m.e.l.h.b$h */
    /* compiled from: RunNotifier */
    public abstract class C9767h {

        /* renamed from: a */
        public final List<C9757a> f19035a;

        public C9767h(C9759b bVar) {
            this(bVar.f19026a);
        }

        /* renamed from: a */
        public abstract void mo50592a(C9757a aVar);

        /* renamed from: b */
        public void mo50593b() {
            int size = this.f19035a.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (C9757a next : this.f19035a) {
                try {
                    mo50592a(next);
                    arrayList.add(next);
                } catch (Exception e) {
                    arrayList2.add(new Failure(Description.TEST_MECHANISM, e));
                }
            }
            C9759b.this.mo50584g(arrayList, arrayList2);
        }

        public C9767h(List<C9757a> list) {
            this.f19035a = list;
        }
    }

    /* renamed from: c */
    public void mo50580c(C9757a aVar) {
        if (aVar != null) {
            this.f19026a.add(0, mo50591n(aVar));
            return;
        }
        throw new NullPointerException("Cannot add a null listener");
    }

    /* renamed from: d */
    public void mo50581d(C9757a aVar) {
        if (aVar != null) {
            this.f19026a.add(mo50591n(aVar));
            return;
        }
        throw new NullPointerException("Cannot add a null listener");
    }

    /* renamed from: e */
    public void mo50582e(Failure failure) {
        new C9764e(this, failure).mo50593b();
    }

    /* renamed from: f */
    public void mo50583f(Failure failure) {
        mo50584g(this.f19026a, Arrays.asList(new Failure[]{failure}));
    }

    /* renamed from: g */
    public final void mo50584g(List<C9757a> list, List<Failure> list2) {
        if (!list2.isEmpty()) {
            new C9763d(this, list, list2).mo50593b();
        }
    }

    /* renamed from: h */
    public void mo50585h(Description description) {
        new C9766g(this, description).mo50593b();
    }

    /* renamed from: i */
    public void mo50586i(Description description) {
        new C9765f(this, description).mo50593b();
    }

    /* renamed from: j */
    public void mo50587j(Result result) {
        new C9761b(this, result).mo50593b();
    }

    /* renamed from: k */
    public void mo50588k(Description description) {
        new C9760a(this, description).mo50593b();
    }

    /* renamed from: l */
    public void mo50589l(Description description) {
        if (!this.f19027b) {
            new C9762c(this, description).mo50593b();
            return;
        }
        throw new StoppedByUserException();
    }

    /* renamed from: m */
    public void mo50590m(C9757a aVar) {
        if (aVar != null) {
            this.f19026a.remove(mo50591n(aVar));
            return;
        }
        throw new NullPointerException("Cannot remove a null listener");
    }

    /* renamed from: n */
    public C9757a mo50591n(C9757a aVar) {
        return aVar.getClass().isAnnotationPresent(C9757a.C9758a.class) ? aVar : new C9768c(aVar, this);
    }
}
