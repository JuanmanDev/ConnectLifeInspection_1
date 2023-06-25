package androidx.test.espresso.action;

import android.os.Build;
import android.view.View;
import android.widget.SearchView;
import androidx.test.espresso.InjectEventSecurityException;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.remote.annotation.RemoteMsgConstructor;
import androidx.test.espresso.remote.annotation.RemoteMsgField;
import androidx.test.espresso.util.HumanReadables;
import java.util.Locale;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;

public final class TypeTextAction implements ViewAction {
    public static final String TAG = "TypeTextAction";
    @RemoteMsgField(order = 0)
    public final String stringToBeTyped;
    @RemoteMsgField(order = 1)
    public final boolean tapToFocus;

    public TypeTextAction(String str) {
        this(str, true);
    }

    public C9623e<View> getConstraints() {
        C9623e<View> c = C9624f.m25838c(ViewMatchers.isDisplayed());
        if (!this.tapToFocus) {
            c = C9624f.m25836a(c, ViewMatchers.hasFocus());
        }
        if (Build.VERSION.SDK_INT < 11) {
            return C9624f.m25836a(c, ViewMatchers.supportsInputMethods());
        }
        return C9624f.m25836a(c, C9624f.m25840e(ViewMatchers.supportsInputMethods(), ViewMatchers.isAssignableFrom(SearchView.class)));
    }

    public String getDescription() {
        return String.format(Locale.ROOT, "type text(%s)", new Object[]{this.stringToBeTyped});
    }

    public void perform(UiController uiController, View view) {
        if (this.stringToBeTyped.length() != 0) {
            if (this.tapToFocus) {
                new GeneralClickAction(Tap.SINGLE, GeneralLocation.CENTER, Press.FINGER).perform(uiController, view);
                uiController.loopMainThreadUntilIdle();
            }
            try {
                if (!uiController.injectString(this.stringToBeTyped)) {
                    String valueOf = String.valueOf(this.stringToBeTyped);
                    if (valueOf.length() != 0) {
                        "Failed to type text: ".concat(valueOf);
                    } else {
                        new String("Failed to type text: ");
                    }
                    PerformException.Builder withViewDescription = new PerformException.Builder().withActionDescription(getDescription()).withViewDescription(HumanReadables.describe(view));
                    String valueOf2 = String.valueOf(this.stringToBeTyped);
                    throw withViewDescription.withCause(new RuntimeException(valueOf2.length() != 0 ? "Failed to type text: ".concat(valueOf2) : new String("Failed to type text: "))).build();
                }
            } catch (InjectEventSecurityException e) {
                String valueOf3 = String.valueOf(this.stringToBeTyped);
                if (valueOf3.length() != 0) {
                    "Failed to type text: ".concat(valueOf3);
                } else {
                    new String("Failed to type text: ");
                }
                throw new PerformException.Builder().withActionDescription(getDescription()).withViewDescription(HumanReadables.describe(view)).withCause(e).build();
            }
        }
    }

    @RemoteMsgConstructor
    public TypeTextAction(String str, boolean z) {
        Preconditions.checkNotNull(str);
        this.stringToBeTyped = str;
        this.tapToFocus = z;
    }
}
