package p648m.p668e.p680m;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.model.InitializationError;
import p648m.p668e.C9686b;
import p648m.p668e.C9689e;
import p648m.p668e.C9690f;
import p648m.p668e.p669j.p672f.p673d.C9715a;
import p648m.p668e.p669j.p672f.p674e.C9717a;
import p648m.p668e.p669j.p672f.p675f.C9737e;
import p648m.p668e.p669j.p672f.p675f.C9738f;
import p648m.p668e.p676k.C9740b;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p678g.C9750a;
import p648m.p668e.p677l.p678g.C9754b;
import p648m.p668e.p677l.p678g.C9755c;
import p648m.p668e.p677l.p678g.C9756d;
import p648m.p668e.p677l.p679h.C9759b;
import p648m.p668e.p680m.p681d.C9781d;
import p648m.p668e.p680m.p681d.C9784f;
import p648m.p668e.p680m.p681d.C9785g;
import p648m.p668e.p680m.p681d.C9786h;
import p648m.p668e.p682n.C9792c;
import p648m.p668e.p682n.C9798d;
import p648m.p668e.p682n.C9799e;

/* renamed from: m.e.m.b */
/* compiled from: ParentRunner */
public abstract class C9771b<T> extends C9749f implements C9754b, C9755c {
    public static final List<C9799e> VALIDATORS = Arrays.asList(new C9799e[]{new C9792c(), new C9798d()});
    public final Object childrenLock = new Object();
    public volatile Collection<T> filteredChildren = null;
    public volatile C9784f scheduler = new C9772a(this);
    public final C9786h testClass;

    /* renamed from: m.e.m.b$a */
    /* compiled from: ParentRunner */
    public class C9772a implements C9784f {
        public C9772a(C9771b bVar) {
        }

        /* renamed from: a */
        public void mo50631a(Runnable runnable) {
            runnable.run();
        }

        /* renamed from: b */
        public void mo50632b() {
        }
    }

    /* renamed from: m.e.m.b$b */
    /* compiled from: ParentRunner */
    public class C9773b extends C9785g {

        /* renamed from: a */
        public final /* synthetic */ C9759b f19040a;

        public C9773b(C9759b bVar) {
            this.f19040a = bVar;
        }

        public void evaluate() {
            C9771b.this.runChildren(this.f19040a);
        }
    }

    /* renamed from: m.e.m.b$c */
    /* compiled from: ParentRunner */
    public class C9774c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Object f19042e;

        /* renamed from: l */
        public final /* synthetic */ C9759b f19043l;

        public C9774c(Object obj, C9759b bVar) {
            this.f19042e = obj;
            this.f19043l = bVar;
        }

        public void run() {
            C9771b.this.runChild(this.f19042e, this.f19043l);
        }
    }

    /* renamed from: m.e.m.b$d */
    /* compiled from: ParentRunner */
    public class C9775d implements Comparator<T> {

        /* renamed from: e */
        public final /* synthetic */ C9756d f19045e;

        public C9775d(C9756d dVar) {
            this.f19045e = dVar;
        }

        public int compare(T t, T t2) {
            return this.f19045e.compare(C9771b.this.describeChild(t), C9771b.this.describeChild(t2));
        }
    }

    public C9771b(Class<?> cls) {
        this.testClass = createTestClass(cls);
        validate();
    }

    private void applyValidators(List<Throwable> list) {
        if (getTestClass().mo50676j() != null) {
            for (C9799e a : VALIDATORS) {
                list.addAll(a.mo50690a(getTestClass()));
            }
        }
    }

    private boolean areAllChildrenIgnored() {
        for (Object isIgnored : getFilteredChildren()) {
            if (!isIgnored(isIgnored)) {
                return false;
            }
        }
        return true;
    }

    private Comparator<? super T> comparator(C9756d dVar) {
        return new C9775d(dVar);
    }

    private Collection<T> getFilteredChildren() {
        if (this.filteredChildren == null) {
            synchronized (this.childrenLock) {
                if (this.filteredChildren == null) {
                    this.filteredChildren = Collections.unmodifiableCollection(getChildren());
                }
            }
        }
        return this.filteredChildren;
    }

    /* access modifiers changed from: private */
    public void runChildren(C9759b bVar) {
        C9784f fVar = this.scheduler;
        try {
            for (Object cVar : getFilteredChildren()) {
                fVar.mo50631a(new C9774c(cVar, bVar));
            }
        } finally {
            fVar.mo50632b();
        }
    }

    private boolean shouldRun(C9750a aVar, T t) {
        return aVar.shouldRun(describeChild(t));
    }

    private void validate() {
        ArrayList arrayList = new ArrayList();
        collectInitializationErrors(arrayList);
        if (!arrayList.isEmpty()) {
            throw new InitializationError((List<Throwable>) arrayList);
        }
    }

    private void validateClassRules(List<Throwable> list) {
        C9717a.f18986d.mo50544i(getTestClass(), list);
        C9717a.f18988f.mo50544i(getTestClass(), list);
    }

    private C9785g withClassRules(C9785g gVar) {
        List<C9741c> classRules = classRules();
        return classRules.isEmpty() ? gVar : new C9740b(gVar, classRules, getDescription());
    }

    public C9785g childrenInvoker(C9759b bVar) {
        return new C9773b(bVar);
    }

    public C9785g classBlock(C9759b bVar) {
        C9785g childrenInvoker = childrenInvoker(bVar);
        return !areAllChildrenIgnored() ? withClassRules(withAfterClasses(withBeforeClasses(childrenInvoker))) : childrenInvoker;
    }

    public List<C9741c> classRules() {
        Class<C9741c> cls = C9741c.class;
        List<C9741c> g = this.testClass.mo50672g((Object) null, C9690f.class, cls);
        g.addAll(this.testClass.mo50668c((Object) null, C9690f.class, cls));
        return g;
    }

    public void collectInitializationErrors(List<Throwable> list) {
        validatePublicVoidNoArgMethods(C9689e.class, true, list);
        validatePublicVoidNoArgMethods(C9686b.class, true, list);
        validateClassRules(list);
        applyValidators(list);
    }

    public C9786h createTestClass(Class<?> cls) {
        return new C9786h(cls);
    }

    public abstract Description describeChild(T t);

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void filter(p648m.p668e.p677l.p678g.C9750a r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.childrenLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0042 }
            java.util.Collection r2 = r5.getFilteredChildren()     // Catch:{ all -> 0x0042 }
            r1.<init>(r2)     // Catch:{ all -> 0x0042 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0042 }
        L_0x0010:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0042 }
            boolean r4 = r5.shouldRun(r6, r3)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0028
            r6.apply(r3)     // Catch:{ NoTestsRemainException -> 0x0024 }
            goto L_0x0010
        L_0x0024:
            r2.remove()     // Catch:{ all -> 0x0042 }
            goto L_0x0010
        L_0x0028:
            r2.remove()     // Catch:{ all -> 0x0042 }
            goto L_0x0010
        L_0x002c:
            java.util.Collection r6 = java.util.Collections.unmodifiableCollection(r1)     // Catch:{ all -> 0x0042 }
            r5.filteredChildren = r6     // Catch:{ all -> 0x0042 }
            java.util.Collection<T> r6 = r5.filteredChildren     // Catch:{ all -> 0x0042 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x003c
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x003c:
            org.junit.runner.manipulation.NoTestsRemainException r6 = new org.junit.runner.manipulation.NoTestsRemainException     // Catch:{ all -> 0x0042 }
            r6.<init>()     // Catch:{ all -> 0x0042 }
            throw r6     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p648m.p668e.p680m.C9771b.filter(m.e.l.g.a):void");
    }

    public abstract List<T> getChildren();

    public Description getDescription() {
        Description createSuiteDescription = Description.createSuiteDescription(getName(), getRunnerAnnotations());
        for (Object describeChild : getFilteredChildren()) {
            createSuiteDescription.addChild(describeChild(describeChild));
        }
        return createSuiteDescription;
    }

    public String getName() {
        return this.testClass.mo50677k();
    }

    public Annotation[] getRunnerAnnotations() {
        return this.testClass.getAnnotations();
    }

    public final C9786h getTestClass() {
        return this.testClass;
    }

    public boolean isIgnored(T t) {
        return false;
    }

    public void run(C9759b bVar) {
        C9715a aVar = new C9715a(bVar, getDescription());
        try {
            classBlock(bVar).evaluate();
        } catch (AssumptionViolatedException e) {
            aVar.mo50537a(e);
        } catch (StoppedByUserException e2) {
            throw e2;
        } catch (Throwable th) {
            aVar.mo50538b(th);
        }
    }

    public abstract void runChild(T t, C9759b bVar);

    public final void runLeaf(C9785g gVar, Description description, C9759b bVar) {
        C9715a aVar = new C9715a(bVar, description);
        aVar.mo50541e();
        try {
            gVar.evaluate();
        } catch (AssumptionViolatedException e) {
            aVar.mo50537a(e);
        } catch (Throwable th) {
            aVar.mo50540d();
            throw th;
        }
        aVar.mo50540d();
    }

    public void setScheduler(C9784f fVar) {
        this.scheduler = fVar;
    }

    public void sort(C9756d dVar) {
        synchronized (this.childrenLock) {
            for (Object a : getFilteredChildren()) {
                dVar.mo50577a(a);
            }
            ArrayList arrayList = new ArrayList(getFilteredChildren());
            Collections.sort(arrayList, comparator(dVar));
            this.filteredChildren = Collections.unmodifiableCollection(arrayList);
        }
    }

    public void validatePublicVoidNoArgMethods(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        for (C9781d p : getTestClass().mo50675i(cls)) {
            p.mo50660p(z, list);
        }
    }

    public C9785g withAfterClasses(C9785g gVar) {
        List<C9781d> i = this.testClass.mo50675i(C9686b.class);
        return i.isEmpty() ? gVar : new C9737e(gVar, i, (Object) null);
    }

    public C9785g withBeforeClasses(C9785g gVar) {
        List<C9781d> i = this.testClass.mo50675i(C9689e.class);
        return i.isEmpty() ? gVar : new C9738f(gVar, i, (Object) null);
    }
}
