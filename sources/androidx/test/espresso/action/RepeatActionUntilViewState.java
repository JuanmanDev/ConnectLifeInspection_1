package androidx.test.espresso.action;

import android.view.View;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.util.HumanReadables;
import java.util.Locale;
import p648m.p657c.C9623e;
import p648m.p657c.C9626h;

public final class RepeatActionUntilViewState implements ViewAction {
    public final ViewAction mAction;
    public final C9623e<View> mDesiredStateMatcher;
    public final int mMaxAttempts;

    public RepeatActionUntilViewState(ViewAction viewAction, C9623e<View> eVar, int i) {
        Preconditions.checkNotNull(viewAction);
        Preconditions.checkNotNull(eVar);
        Preconditions.checkState(i <= 1 ? false : true, "maxAttempts should be greater than 1");
        this.mAction = viewAction;
        this.mDesiredStateMatcher = eVar;
        this.mMaxAttempts = i;
    }

    public C9623e<View> getConstraints() {
        return this.mAction.getConstraints();
    }

    public String getDescription() {
        C9626h hVar = new C9626h();
        this.mDesiredStateMatcher.describeTo(hVar);
        return String.format(Locale.ROOT, "%s until: %s", new Object[]{this.mAction.getDescription(), hVar});
    }

    public void perform(UiController uiController, View view) {
        int i = 1;
        while (!this.mDesiredStateMatcher.matches(view) && i <= this.mMaxAttempts) {
            this.mAction.perform(uiController, view);
            uiController.loopMainThreadUntilIdle();
            i++;
        }
        if (i > this.mMaxAttempts) {
            throw new PerformException.Builder().withActionDescription(getDescription()).withViewDescription(HumanReadables.describe(view)).withCause(new RuntimeException(String.format(Locale.ROOT, "Failed to achieve view state after %d attempts", new Object[]{Integer.valueOf(this.mMaxAttempts)}))).build();
        }
    }
}
