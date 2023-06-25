package p648m.p668e.p669j.p672f.p673d;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runners.model.MultipleFailureException;
import p648m.p668e.p677l.p679h.C9759b;

/* renamed from: m.e.j.f.d.a */
/* compiled from: EachTestNotifier */
public class C9715a {

    /* renamed from: a */
    public final C9759b f18984a;

    /* renamed from: b */
    public final Description f18985b;

    public C9715a(C9759b bVar, Description description) {
        this.f18984a = bVar;
        this.f18985b = description;
    }

    /* renamed from: a */
    public void mo50537a(AssumptionViolatedException assumptionViolatedException) {
        this.f18984a.mo50582e(new Failure(this.f18985b, assumptionViolatedException));
    }

    /* renamed from: b */
    public void mo50538b(Throwable th) {
        if (th instanceof MultipleFailureException) {
            mo50539c((MultipleFailureException) th);
        } else {
            this.f18984a.mo50583f(new Failure(this.f18985b, th));
        }
    }

    /* renamed from: c */
    public final void mo50539c(MultipleFailureException multipleFailureException) {
        for (Throwable b : multipleFailureException.getFailures()) {
            mo50538b(b);
        }
    }

    /* renamed from: d */
    public void mo50540d() {
        this.f18984a.mo50585h(this.f18985b);
    }

    /* renamed from: e */
    public void mo50541e() {
        this.f18984a.mo50589l(this.f18985b);
    }
}
