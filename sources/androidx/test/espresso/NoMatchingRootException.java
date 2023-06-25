package androidx.test.espresso;

import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.internal.platform.util.TestOutputEmitter;
import java.util.List;
import java.util.Locale;
import p648m.p657c.C9623e;

public final class NoMatchingRootException extends RuntimeException implements EspressoException {
    public NoMatchingRootException(String str) {
        super(str);
        TestOutputEmitter.dumpThreadStates("ThreadState-NoMatchingRootException.txt");
    }

    public static NoMatchingRootException create(C9623e<Root> eVar, List<Root> list) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(list);
        return new NoMatchingRootException(String.format(Locale.ROOT, "Matcher '%s' did not match any of the following roots: %s", new Object[]{eVar, list}));
    }
}
