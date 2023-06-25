package p648m.p668e.p669j;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import p648m.p668e.p677l.p679h.C9757a;

/* renamed from: m.e.j.b */
/* compiled from: TextListener */
public class C9697b extends C9757a {

    /* renamed from: a */
    public final PrintStream f18970a;

    public C9697b(PrintStream printStream) {
        this.f18970a = printStream;
    }

    /* renamed from: a */
    public String mo50519a(long j) {
        return NumberFormat.getInstance().format(((double) j) / 1000.0d);
    }

    /* renamed from: b */
    public final PrintStream mo50520b() {
        return this.f18970a;
    }

    /* renamed from: c */
    public void mo50521c(Failure failure, String str) {
        PrintStream b = mo50520b();
        b.println(str + ") " + failure.getTestHeader());
        mo50520b().print(failure.getTrace());
    }

    /* renamed from: d */
    public void mo50522d(Result result) {
        List<Failure> failures = result.getFailures();
        if (failures.size() != 0) {
            int i = 1;
            if (failures.size() == 1) {
                PrintStream b = mo50520b();
                b.println("There was " + failures.size() + " failure:");
            } else {
                PrintStream b2 = mo50520b();
                b2.println("There were " + failures.size() + " failures:");
            }
            for (Failure c : failures) {
                mo50521c(c, "" + i);
                i++;
            }
        }
    }

    /* renamed from: e */
    public void mo50523e(Result result) {
        if (result.wasSuccessful()) {
            mo50520b().println();
            mo50520b().print("OK");
            PrintStream b = mo50520b();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(result.getRunCount());
            sb.append(" test");
            sb.append(result.getRunCount() == 1 ? "" : "s");
            sb.append(")");
            b.println(sb.toString());
        } else {
            mo50520b().println();
            mo50520b().println("FAILURES!!!");
            PrintStream b2 = mo50520b();
            b2.println("Tests run: " + result.getRunCount() + ",  Failures: " + result.getFailureCount());
        }
        mo50520b().println();
    }

    /* renamed from: f */
    public void mo50524f(long j) {
        mo50520b().println();
        PrintStream b = mo50520b();
        b.println("Time: " + mo50519a(j));
    }

    public void testFailure(Failure failure) {
        this.f18970a.append('E');
    }

    public void testIgnored(Description description) {
        this.f18970a.append('I');
    }

    public void testRunFinished(Result result) {
        mo50524f(result.getRunTime());
        mo50522d(result);
        mo50523e(result);
    }

    public void testStarted(Description description) {
        this.f18970a.append('.');
    }
}
