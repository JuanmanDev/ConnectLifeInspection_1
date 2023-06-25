package androidx.test.rule;

import android.test.UiThreadTest;
import androidx.test.internal.runner.junit4.statement.UiThreadStatement;
import org.junit.runner.Description;
import p648m.p668e.p669j.p672f.p675f.C9732c;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9785g;

@Deprecated
public class UiThreadTestRule implements C9741c {
    public static final String TAG = "UiThreadTestRule";

    public C9785g apply(C9785g gVar, Description description) {
        return ((gVar instanceof C9732c) || ((gVar instanceof UiThreadStatement) && !((UiThreadStatement) gVar).isRunOnUiThread())) ? gVar : new UiThreadStatement(gVar, shouldRunOnUiThread(description));
    }

    public void runOnUiThread(Runnable runnable) {
        UiThreadStatement.runOnUiThread(runnable);
    }

    public boolean shouldRunOnUiThread(Description description) {
        if (description.getAnnotation(UiThreadTest.class) == null && description.getAnnotation(androidx.test.annotation.UiThreadTest.class) == null) {
            return false;
        }
        return true;
    }
}
