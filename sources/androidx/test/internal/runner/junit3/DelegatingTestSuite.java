package androidx.test.internal.runner.junit3;

import java.util.Enumeration;
import p627i.p629b.C9388f;
import p627i.p629b.C9392j;
import p627i.p629b.C9394k;
import p648m.p668e.C9692h;

@C9692h
public class DelegatingTestSuite extends C9394k {
    public C9394k wrappedSuite;

    public DelegatingTestSuite(C9394k kVar) {
        this.wrappedSuite = kVar;
    }

    public void addTest(C9388f fVar) {
        this.wrappedSuite.addTest(fVar);
    }

    public int countTestCases() {
        return this.wrappedSuite.countTestCases();
    }

    public C9394k getDelegateSuite() {
        return this.wrappedSuite;
    }

    public String getName() {
        return this.wrappedSuite.getName();
    }

    public void run(C9392j jVar) {
        this.wrappedSuite.run(jVar);
    }

    public void runTest(C9388f fVar, C9392j jVar) {
        this.wrappedSuite.runTest(fVar, jVar);
    }

    public void setDelegateSuite(C9394k kVar) {
        this.wrappedSuite = kVar;
    }

    public void setName(String str) {
        this.wrappedSuite.setName(str);
    }

    public C9388f testAt(int i) {
        return this.wrappedSuite.testAt(i);
    }

    public int testCount() {
        return this.wrappedSuite.testCount();
    }

    public Enumeration<C9388f> tests() {
        return this.wrappedSuite.tests();
    }

    public String toString() {
        return this.wrappedSuite.toString();
    }
}
