package p648m.p668e.p677l.p679h;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import p648m.p668e.p677l.p679h.C9757a;

@C9757a.C9758a
/* renamed from: m.e.l.h.c */
/* compiled from: SynchronizedRunListener */
public final class C9768c extends C9757a {

    /* renamed from: a */
    public final C9757a f19037a;

    /* renamed from: b */
    public final Object f19038b;

    public C9768c(C9757a aVar, Object obj) {
        this.f19037a = aVar;
        this.f19038b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9768c)) {
            return false;
        }
        return this.f19037a.equals(((C9768c) obj).f19037a);
    }

    public int hashCode() {
        return this.f19037a.hashCode();
    }

    public void testAssumptionFailure(Failure failure) {
        synchronized (this.f19038b) {
            this.f19037a.testAssumptionFailure(failure);
        }
    }

    public void testFailure(Failure failure) {
        synchronized (this.f19038b) {
            this.f19037a.testFailure(failure);
        }
    }

    public void testFinished(Description description) {
        synchronized (this.f19038b) {
            this.f19037a.testFinished(description);
        }
    }

    public void testIgnored(Description description) {
        synchronized (this.f19038b) {
            this.f19037a.testIgnored(description);
        }
    }

    public void testRunFinished(Result result) {
        synchronized (this.f19038b) {
            this.f19037a.testRunFinished(result);
        }
    }

    public void testRunStarted(Description description) {
        synchronized (this.f19038b) {
            this.f19037a.testRunStarted(description);
        }
    }

    public void testStarted(Description description) {
        synchronized (this.f19038b) {
            this.f19037a.testStarted(description);
        }
    }

    public String toString() {
        return this.f19037a.toString() + " (with synchronization wrapper)";
    }
}
