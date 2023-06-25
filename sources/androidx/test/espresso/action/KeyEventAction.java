package androidx.test.espresso.action;

import android.app.Activity;
import android.view.View;
import androidx.test.espresso.UiController;
import p648m.p657c.C9623e;

public final class KeyEventAction extends KeyEventActionBase {
    public KeyEventAction(EspressoKey espressoKey) {
        super(espressoKey);
    }

    public /* bridge */ /* synthetic */ C9623e getConstraints() {
        return super.getConstraints();
    }

    public /* bridge */ /* synthetic */ String getDescription() {
        return super.getDescription();
    }

    public void perform(UiController uiController, View view) {
        Activity currentActivity = KeyEventActionBase.getCurrentActivity();
        super.perform(uiController, view);
        if (this.espressoKey.getKeyCode() == 4) {
            KeyEventActionBase.waitForStageChangeInitialActivity(uiController, currentActivity);
            KeyEventActionBase.waitForPendingForegroundActivities(uiController, true);
        }
    }
}
