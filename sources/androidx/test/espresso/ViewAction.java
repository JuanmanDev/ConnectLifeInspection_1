package androidx.test.espresso;

import android.view.View;
import p648m.p657c.C9623e;

public interface ViewAction {
    C9623e<View> getConstraints();

    String getDescription();

    void perform(UiController uiController, View view);
}
