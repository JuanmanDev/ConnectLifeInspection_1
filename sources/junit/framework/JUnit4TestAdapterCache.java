package junit.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import p627i.p629b.C9385c;
import p627i.p629b.C9386d;
import p627i.p629b.C9388f;
import p627i.p629b.C9392j;
import p627i.p629b.C9394k;
import p648m.p668e.p677l.p679h.C9757a;
import p648m.p668e.p677l.p679h.C9759b;

public class JUnit4TestAdapterCache extends HashMap<Description, C9388f> {
    public static final JUnit4TestAdapterCache fInstance = new JUnit4TestAdapterCache();
    public static final long serialVersionUID = 1;

    /* renamed from: junit.framework.JUnit4TestAdapterCache$a */
    public class C9487a extends C9757a {

        /* renamed from: a */
        public final /* synthetic */ C9392j f18790a;

        public C9487a(C9392j jVar) {
            this.f18790a = jVar;
        }

        public void testFailure(Failure failure) {
            this.f18790a.addError(JUnit4TestAdapterCache.this.asTest(failure.getDescription()), failure.getException());
        }

        public void testFinished(Description description) {
            this.f18790a.endTest(JUnit4TestAdapterCache.this.asTest(description));
        }

        public void testStarted(Description description) {
            this.f18790a.startTest(JUnit4TestAdapterCache.this.asTest(description));
        }
    }

    public static JUnit4TestAdapterCache getDefault() {
        return fInstance;
    }

    public C9388f asTest(Description description) {
        if (description.isSuite()) {
            return createTest(description);
        }
        if (!containsKey(description)) {
            put(description, createTest(description));
        }
        return (C9388f) get(description);
    }

    public List<C9388f> asTestList(Description description) {
        if (description.isTest()) {
            return Arrays.asList(new C9388f[]{asTest(description)});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            arrayList.add(asTest(it.next()));
        }
        return arrayList;
    }

    public C9388f createTest(Description description) {
        if (description.isTest()) {
            return new C9386d(description);
        }
        C9394k kVar = new C9394k(description.getDisplayName());
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            kVar.addTest(asTest(it.next()));
        }
        return kVar;
    }

    public C9759b getNotifier(C9392j jVar, C9385c cVar) {
        C9759b bVar = new C9759b();
        bVar.mo50581d(new C9487a(jVar));
        return bVar;
    }
}
