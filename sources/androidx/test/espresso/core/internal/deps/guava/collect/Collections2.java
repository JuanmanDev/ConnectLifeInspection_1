package androidx.test.espresso.core.internal.deps.guava.collect;

import androidx.test.internal.runner.RunnerArgs;
import java.util.Collection;

public final class Collections2 {
    public static <T> Collection<T> cast(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    public static StringBuilder newStringBuilderForCollection(int i) {
        CollectPreconditions.checkNonnegative(i, RunnerArgs.ARGUMENT_TEST_SIZE);
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }
}
