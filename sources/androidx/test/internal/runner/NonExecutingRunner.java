package androidx.test.internal.runner;

import java.util.ArrayList;
import org.junit.runner.Description;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p678g.C9750a;
import p648m.p668e.p677l.p678g.C9754b;
import p648m.p668e.p677l.p678g.C9755c;
import p648m.p668e.p677l.p678g.C9756d;
import p648m.p668e.p677l.p679h.C9759b;

public class NonExecutingRunner extends C9749f implements C9755c, C9754b {
    public final C9749f runner;

    public NonExecutingRunner(C9749f fVar) {
        this.runner = fVar;
    }

    private void generateListOfTests(C9759b bVar, Description description) {
        ArrayList<Description> children = description.getChildren();
        if (children.isEmpty()) {
            bVar.mo50589l(description);
            bVar.mo50585h(description);
            return;
        }
        for (Description generateListOfTests : children) {
            generateListOfTests(bVar, generateListOfTests);
        }
    }

    public void filter(C9750a aVar) {
        aVar.apply(this.runner);
    }

    public Description getDescription() {
        return this.runner.getDescription();
    }

    public void run(C9759b bVar) {
        generateListOfTests(bVar, getDescription());
    }

    public void sort(C9756d dVar) {
        dVar.mo50577a(this.runner);
    }
}
