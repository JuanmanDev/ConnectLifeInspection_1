package androidx.test.espresso.action;

import android.view.View;
import android.widget.EditText;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.remote.annotation.RemoteMsgConstructor;
import androidx.test.espresso.remote.annotation.RemoteMsgField;
import java.util.Locale;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;

public final class ReplaceTextAction implements ViewAction {
    @RemoteMsgField(order = 0)
    public final String stringToBeSet;

    @RemoteMsgConstructor
    public ReplaceTextAction(String str) {
        Preconditions.checkNotNull(str);
        this.stringToBeSet = str;
    }

    public C9623e<View> getConstraints() {
        return C9624f.m25836a(ViewMatchers.isDisplayed(), ViewMatchers.isAssignableFrom(EditText.class));
    }

    public String getDescription() {
        return String.format(Locale.ROOT, "replace text(%s)", new Object[]{this.stringToBeSet});
    }

    public void perform(UiController uiController, View view) {
        ((EditText) view).setText(this.stringToBeSet);
    }
}
