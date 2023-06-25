package androidx.test.internal.runner.filters;

import java.util.regex.Pattern;
import org.junit.runner.Description;

public final class TestsRegExFilter extends ParentFilter {
    public Pattern pattern = null;

    public String describe() {
        return "tests filter";
    }

    public boolean evaluateTest(Description description) {
        if (this.pattern == null) {
            return true;
        }
        return this.pattern.matcher(String.format("%s#%s", new Object[]{description.getClassName(), description.getMethodName()})).find();
    }

    public void setPattern(String str) {
        this.pattern = Pattern.compile(str);
    }
}
