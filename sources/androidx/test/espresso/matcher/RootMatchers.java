package androidx.test.espresso.matcher;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import android.view.View;
import androidx.test.espresso.Root;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.collect.Lists;
import androidx.test.espresso.remote.annotation.RemoteMsgConstructor;
import androidx.test.espresso.remote.annotation.RemoteMsgField;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.Stage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;
import p648m.p657c.C9627i;

public final class RootMatchers {
    public static final C9623e<Root> DEFAULT = C9624f.m25836a(hasWindowLayoutParams(), C9624f.m25836a(C9624f.m25840e(C9624f.m25836a(isDialog(), withDecorView(hasWindowFocus())), isSubwindowOfCurrentActivity()), isFocusable()));
    public static final String TAG = "RootMatchers";

    public static final class HasWindowFocus extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has window focus");
        }

        public boolean matchesSafely(View view) {
            return view.hasWindowFocus();
        }
    }

    public static final class HasWindowLayoutParams extends C9627i<Root> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has window layout params");
        }

        public boolean matchesSafely(Root root) {
            return root.getWindowLayoutParams().isPresent();
        }
    }

    public static final class IsDialog extends C9627i<Root> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is dialog");
        }

        public boolean matchesSafely(Root root) {
            int i = root.getWindowLayoutParams().get().type;
            if (i == 1 || i >= 99 || root.getDecorView().getWindowToken() != root.getDecorView().getApplicationWindowToken()) {
                return false;
            }
            return true;
        }
    }

    public static final class IsFocusable extends C9627i<Root> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is focusable");
        }

        public boolean matchesSafely(Root root) {
            return (root.getWindowLayoutParams().get().flags & 8) != 8;
        }
    }

    public static final class IsPlatformPopup extends C9627i<Root> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with decor view of type PopupWindow$PopupViewContainer");
        }

        public boolean matchesSafely(Root root) {
            return RootMatchers.withDecorView(ViewMatchers.withClassName(C9624f.m25844i(Build.VERSION.SDK_INT >= 23 ? "android.widget.PopupWindow$PopupDecorView" : "android.widget.PopupWindow$PopupViewContainer"))).matches(root);
        }
    }

    public static final class IsSubwindowOfCurrentActivity extends C9627i<Root> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is subwindow of current activity");
        }

        public boolean matchesSafely(Root root) {
            return RootMatchers.getResumedActivityTokens().contains(root.getDecorView().getApplicationWindowToken());
        }
    }

    public static final class IsSystemAlertWindow extends C9627i<Root> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is system alert window");
        }

        public boolean matchesSafely(Root root) {
            int i = root.getWindowLayoutParams().get().type;
            return 2000 < i && 2999 > i && root.getDecorView().getWindowToken() == root.getDecorView().getApplicationWindowToken();
        }
    }

    public static final class IsTouchable extends C9627i<Root> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is touchable");
        }

        public boolean matchesSafely(Root root) {
            return (root.getWindowLayoutParams().get().flags & 16) != 16;
        }
    }

    public static final class WithDecorView extends C9627i<Root> {
        @RemoteMsgField(order = 0)
        public final C9623e<View> decorViewMatcher;

        @RemoteMsgConstructor
        public WithDecorView(C9623e<View> eVar) {
            this.decorViewMatcher = eVar;
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with decor view ");
            this.decorViewMatcher.describeTo(cVar);
        }

        public boolean matchesSafely(Root root) {
            return this.decorViewMatcher.matches(root.getDecorView());
        }
    }

    public static List<IBinder> getResumedActivityTokens() {
        Collection<Activity> activitiesInStage = ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(Stage.RESUMED);
        boolean isEmpty = activitiesInStage.isEmpty();
        ArrayList newArrayList = Lists.newArrayList();
        for (Activity window : activitiesInStage) {
            newArrayList.add(window.getWindow().getDecorView().getApplicationWindowToken());
        }
        return newArrayList;
    }

    public static C9623e<View> hasWindowFocus() {
        return new HasWindowFocus();
    }

    public static C9623e<Root> hasWindowLayoutParams() {
        return new HasWindowLayoutParams();
    }

    public static C9623e<Root> isDialog() {
        return new IsDialog();
    }

    public static C9623e<Root> isFocusable() {
        return new IsFocusable();
    }

    public static C9623e<Root> isPlatformPopup() {
        return new IsPlatformPopup();
    }

    public static C9623e<Root> isSubwindowOfCurrentActivity() {
        return new IsSubwindowOfCurrentActivity();
    }

    public static C9623e<Root> isSystemAlertWindow() {
        return new IsSystemAlertWindow();
    }

    public static C9623e<Root> isTouchable() {
        return new IsTouchable();
    }

    public static C9623e<Root> withDecorView(C9623e<View> eVar) {
        Preconditions.checkNotNull(eVar);
        return new WithDecorView(eVar);
    }
}
