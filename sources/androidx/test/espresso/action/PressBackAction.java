package androidx.test.espresso.action;

import android.app.Activity;
import android.view.View;
import androidx.test.espresso.UiController;
import androidx.test.espresso.action.EspressoKey;
import p648m.p657c.C9623e;

public final class PressBackAction extends KeyEventActionBase {
    public final boolean conditional;

    public PressBackAction(boolean z) {
        this(z, new EspressoKey.Builder().withKeyCode(4).build());
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
        KeyEventActionBase.waitForStageChangeInitialActivity(uiController, currentActivity);
        KeyEventActionBase.waitForPendingForegroundActivities(uiController, this.conditional);
    }

    public PressBackAction(boolean z, EspressoKey espressoKey) {
        super(espressoKey);
        this.conditional = z;
    }
}
