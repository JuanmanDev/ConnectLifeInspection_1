package androidx.test.internal.runner.filters;

import java.util.Iterator;
import org.junit.runner.Description;
import p648m.p668e.p677l.p678g.C9750a;

public abstract class ParentFilter extends C9750a {
    public abstract boolean evaluateTest(Description description);

    public boolean shouldRun(Description description) {
        if (description.isTest()) {
            return evaluateTest(description);
        }
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            if (shouldRun(it.next())) {
                return true;
            }
        }
        return false;
    }
}
