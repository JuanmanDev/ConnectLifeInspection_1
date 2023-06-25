package androidx.test.espresso.base;

import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import androidx.test.espresso.AmbiguousViewMatcherException;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewFinder;
import androidx.test.espresso.core.internal.deps.guava.base.Joiner;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.base.Predicate;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterators;
import androidx.test.espresso.core.internal.deps.guava.collect.Lists;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.EspressoOptional;
import androidx.test.espresso.util.TreeIterables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p625h.p626a.C9381a;
import p648m.p657c.C9623e;

public final class ViewFinderImpl implements ViewFinder {
    public final C9381a<View> rootViewProvider;
    public final C9623e<View> viewMatcher;

    public static class MatcherPredicateAdapter<T> implements Predicate<T> {
        public final C9623e<? super T> matcher;

        public boolean apply(T t) {
            return this.matcher.matches(t);
        }

        public MatcherPredicateAdapter(C9623e<? super T> eVar) {
            this.matcher = (C9623e) Preconditions.checkNotNull(eVar);
        }
    }

    public ViewFinderImpl(C9623e<View> eVar, C9381a<View> aVar) {
        this.viewMatcher = eVar;
        this.rootViewProvider = aVar;
    }

    private void checkMainThread() {
        Preconditions.checkState(Thread.currentThread().equals(Looper.getMainLooper().getThread()), "Executing a query on the view hierarchy outside of the main thread (on: %s)", (Object) Thread.currentThread().getName());
    }

    public View getView() {
        checkMainThread();
        MatcherPredicateAdapter matcherPredicateAdapter = new MatcherPredicateAdapter((C9623e) Preconditions.checkNotNull(this.viewMatcher));
        View view = this.rootViewProvider.get();
        Iterator<View> it = Iterables.filter(TreeIterables.breadthFirstViewTraversal(view), matcherPredicateAdapter).iterator();
        View view2 = null;
        while (it.hasNext()) {
            if (view2 == null) {
                view2 = it.next();
            } else {
                throw new AmbiguousViewMatcherException.Builder().withViewMatcher(this.viewMatcher).withRootView(view).withView1(view2).withView2(it.next()).withOtherAmbiguousViews((View[]) Iterators.toArray(it, View.class)).build();
            }
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> newArrayList = Lists.newArrayList(Iterables.filter(TreeIterables.breadthFirstViewTraversal(view), new MatcherPredicateAdapter(ViewMatchers.isAssignableFrom(AdapterView.class))).iterator());
        if (newArrayList.isEmpty()) {
            throw new NoMatchingViewException.Builder().withViewMatcher(this.viewMatcher).withRootView(view).build();
        }
        throw new NoMatchingViewException.Builder().withViewMatcher(this.viewMatcher).withRootView(view).withAdapterViews(newArrayList).withAdapterViewWarning(EspressoOptional.m160of(String.format(Locale.ROOT, "\nIf the target view is not part of the view hierarchy, you may need to use Espresso.onData to load it from one of the following AdapterViews:%s", new Object[]{Joiner.m142on("\n- ").join((Iterable<?>) newArrayList)}))).build();
    }
}
