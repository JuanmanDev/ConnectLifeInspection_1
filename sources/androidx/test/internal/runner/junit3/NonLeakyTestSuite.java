package androidx.test.internal.runner.junit3;

import org.junit.runner.Description;
import p627i.p629b.C9388f;
import p627i.p629b.C9392j;
import p627i.p629b.C9394k;
import p648m.p668e.C9692h;
import p648m.p668e.p677l.C9744b;

@C9692h
public class NonLeakyTestSuite extends C9394k {

    public static class NonLeakyTest implements C9388f, C9744b {
        public C9388f delegate;
        public final Description desc;

        public NonLeakyTest(C9388f fVar) {
            this.delegate = fVar;
            this.desc = JUnit38ClassRunner.makeDescription(fVar);
        }

        public int countTestCases() {
            C9388f fVar = this.delegate;
            if (fVar != null) {
                return fVar.countTestCases();
            }
            return 0;
        }

        public Description getDescription() {
            return this.desc;
        }

        public void run(C9392j jVar) {
            this.delegate.run(jVar);
            this.delegate = null;
        }

        public String toString() {
            C9388f fVar = this.delegate;
            if (fVar != null) {
                return fVar.toString();
            }
            return this.desc.toString();
        }
    }

    public NonLeakyTestSuite(Class<?> cls) {
        super(cls);
    }

    public void addTest(C9388f fVar) {
        super.addTest(new NonLeakyTest(fVar));
    }
}
