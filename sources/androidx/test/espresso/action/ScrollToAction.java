package androidx.test.espresso.action;

import android.graphics.Rect;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.HumanReadables;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;

public final class ScrollToAction implements ViewAction {
    public static final String TAG = "ScrollToAction";

    public C9623e<View> getConstraints() {
        return C9624f.m25836a(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE), ViewMatchers.isDescendantOfA(C9624f.m25841f(ViewMatchers.isAssignableFrom(ScrollView.class), ViewMatchers.isAssignableFrom(HorizontalScrollView.class), ViewMatchers.isAssignableFrom(ListView.class))));
    }

    public String getDescription() {
        return "scroll to";
    }

    public void perform(UiController uiController, View view) {
        if (!ViewMatchers.isDisplayingAtLeast(90).matches(view)) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            boolean requestRectangleOnScreen = view.requestRectangleOnScreen(rect, true);
            uiController.loopMainThreadUntilIdle();
            if (!ViewMatchers.isDisplayingAtLeast(90).matches(view)) {
                throw new PerformException.Builder().withActionDescription(getDescription()).withViewDescription(HumanReadables.describe(view)).withCause(new RuntimeException("Scrolling to view was attempted, but the view is not displayed")).build();
            }
        }
    }
}
