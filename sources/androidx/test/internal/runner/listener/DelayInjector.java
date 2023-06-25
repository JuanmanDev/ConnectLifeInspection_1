package androidx.test.internal.runner.listener;

import org.junit.runner.Description;
import p648m.p668e.p677l.p679h.C9757a;

public class DelayInjector extends C9757a {
    public final int delayMsec;

    public DelayInjector(int i) {
        this.delayMsec = i;
    }

    private void delay() {
        try {
            Thread.sleep((long) this.delayMsec);
        } catch (InterruptedException unused) {
        }
    }

    public void testFinished(Description description) {
        delay();
    }

    public void testRunStarted(Description description) {
        delay();
    }
}
