package androidx.test.espresso.assertion;

import android.view.View;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.base.Predicate;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.remote.annotation.RemoteMsgConstructor;
import androidx.test.espresso.remote.annotation.RemoteMsgField;
import androidx.test.espresso.util.HumanReadables;
import androidx.test.espresso.util.TreeIterables;
import java.util.ArrayList;
import java.util.Locale;
import junit.framework.AssertionFailedError;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;
import p648m.p657c.C9626h;

public final class ViewAssertions {
    public static final String TAG = "ViewAssertions";

    public static class DoesNotExistViewAssertion implements ViewAssertion {
        public void check(View view, NoMatchingViewException noMatchingViewException) {
            if (view != null) {
                String valueOf = String.valueOf(HumanReadables.describe(view));
                ViewMatchers.assertThat(valueOf.length() != 0 ? "View is present in the hierarchy: ".concat(valueOf) : new String("View is present in the hierarchy: "), Boolean.TRUE, C9624f.m25844i(Boolean.FALSE));
            }
        }

        @RemoteMsgConstructor
        public DoesNotExistViewAssertion() {
        }
    }

    public static class MatchesViewAssertion implements ViewAssertion {
        @RemoteMsgField(order = 0)
        public final C9623e<? super View> viewMatcher;

        public void check(View view, NoMatchingViewException noMatchingViewException) {
            C9626h hVar = new C9626h();
            hVar.mo50300c("'");
            this.viewMatcher.describeTo(hVar);
            if (noMatchingViewException == null) {
                hVar.mo50300c("' doesn't match the selected view.");
                ViewMatchers.assertThat(hVar.toString(), view, this.viewMatcher);
                return;
            }
            hVar.mo50300c(String.format(Locale.ROOT, "' check could not be performed because view '%s' was not found.\n", new Object[]{noMatchingViewException.getViewMatcherDescription()}));
            String unused = ViewAssertions.TAG;
            hVar.toString();
            throw noMatchingViewException;
        }

        public String toString() {
            return String.format(Locale.ROOT, "MatchesViewAssertion{viewMatcher=%s}", new Object[]{this.viewMatcher});
        }

        @RemoteMsgConstructor
        public MatchesViewAssertion(C9623e<? super View> eVar) {
            this.viewMatcher = eVar;
        }
    }

    public static class SelectedDescendantsMatchViewAssertion implements ViewAssertion {
        @RemoteMsgField(order = 1)
        public final C9623e<View> matcher;
        @RemoteMsgField(order = 0)
        public final C9623e<View> selector;

        public void check(View view, NoMatchingViewException noMatchingViewException) {
            Preconditions.checkNotNull(view);
            ArrayList arrayList = new ArrayList();
            for (View next : Iterables.filter(TreeIterables.breadthFirstViewTraversal(view), new Predicate<View>() {
                public boolean apply(View view) {
                    return SelectedDescendantsMatchViewAssertion.this.selector.matches(view);
                }
            })) {
                if (!this.matcher.matches(next)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() > 0) {
                throw new AssertionFailedError(HumanReadables.getViewHierarchyErrorMessage(view, arrayList, String.format(Locale.ROOT, "At least one view did not match the required matcher: %s", new Object[]{this.matcher}), "****DOES NOT MATCH****"));
            }
        }

        public String toString() {
            return String.format(Locale.ROOT, "SelectedDescendantsMatchViewAssertion{selector=%s, matcher=%s}", new Object[]{this.selector, this.matcher});
        }

        @RemoteMsgConstructor
        public SelectedDescendantsMatchViewAssertion(C9623e<View> eVar, C9623e<View> eVar2) {
            this.selector = eVar;
            this.matcher = eVar2;
        }
    }

    public static ViewAssertion doesNotExist() {
        return new DoesNotExistViewAssertion();
    }

    public static ViewAssertion matches(C9623e<? super View> eVar) {
        return new MatchesViewAssertion((C9623e) Preconditions.checkNotNull(eVar));
    }

    public static ViewAssertion selectedDescendantsMatch(C9623e<View> eVar, C9623e<View> eVar2) {
        return new SelectedDescendantsMatchViewAssertion(eVar, eVar2);
    }
}
