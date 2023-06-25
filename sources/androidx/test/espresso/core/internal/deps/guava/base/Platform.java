package androidx.test.espresso.core.internal.deps.guava.base;

import java.util.Locale;
import java.util.logging.Logger;

public final class Platform {
    public static final Logger logger = Logger.getLogger(Platform.class.getName());
    public static final PatternCompiler patternCompiler = loadPatternCompiler();

    public static final class JdkPatternCompiler implements PatternCompiler {
        public JdkPatternCompiler() {
        }
    }

    public static String formatCompact4Digits(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    public static PatternCompiler loadPatternCompiler() {
        return new JdkPatternCompiler();
    }

    public static long systemNanoTime() {
        return System.nanoTime();
    }
}
