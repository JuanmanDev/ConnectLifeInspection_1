package androidx.test.espresso.action;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.HumanReadables;
import java.util.Locale;
import p648m.p657c.C9623e;

public final class EditorAction implements ViewAction {
    public C9623e<View> getConstraints() {
        return ViewMatchers.isDisplayed();
    }

    public String getDescription() {
        return "input method editor";
    }

    public void perform(UiController uiController, View view) {
        EditorInfo editorInfo = new EditorInfo();
        InputConnection onCreateInputConnection = view.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            int i = editorInfo.actionId;
            if (i == 0) {
                i = editorInfo.imeOptions & 255;
            }
            if (i == 1) {
                throw new PerformException.Builder().withActionDescription(getDescription()).withViewDescription(HumanReadables.describe(view)).withCause(new IllegalStateException("No available action on view")).build();
            } else if (!onCreateInputConnection.performEditorAction(i)) {
                throw new PerformException.Builder().withActionDescription(getDescription()).withViewDescription(HumanReadables.describe(view)).withCause(new RuntimeException(String.format(Locale.ROOT, "Failed to perform action %#x. Input connection no longer valid", new Object[]{Integer.valueOf(i)}))).build();
            }
        } else {
            throw new PerformException.Builder().withActionDescription(toString()).withViewDescription(HumanReadables.describe(view)).withCause(new IllegalStateException("View does not support input methods")).build();
        }
    }
}
