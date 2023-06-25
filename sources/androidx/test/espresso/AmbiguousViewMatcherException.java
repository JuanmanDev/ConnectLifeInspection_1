package androidx.test.espresso;

import android.view.View;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet;
import androidx.test.espresso.core.internal.deps.guava.collect.Lists;
import androidx.test.espresso.util.HumanReadables;
import androidx.test.internal.platform.util.TestOutputEmitter;
import java.util.Locale;
import p648m.p657c.C9623e;

public final class AmbiguousViewMatcherException extends RuntimeException implements EspressoException {
    public View[] others;
    public View rootView;
    public View view1;
    public View view2;
    public C9623e<? super View> viewMatcher;

    public static class Builder {
        public boolean includeViewHierarchy = true;
        public View[] others;
        public View rootView;
        public View view1;
        public View view2;
        public C9623e<? super View> viewMatcher;

        public AmbiguousViewMatcherException build() {
            Preconditions.checkNotNull(this.viewMatcher);
            Preconditions.checkNotNull(this.rootView);
            Preconditions.checkNotNull(this.view1);
            Preconditions.checkNotNull(this.view2);
            Preconditions.checkNotNull(this.others);
            return new AmbiguousViewMatcherException(this);
        }

        public Builder from(AmbiguousViewMatcherException ambiguousViewMatcherException) {
            this.viewMatcher = ambiguousViewMatcherException.viewMatcher;
            this.rootView = ambiguousViewMatcherException.rootView;
            this.view1 = ambiguousViewMatcherException.view1;
            this.view2 = ambiguousViewMatcherException.view2;
            this.others = ambiguousViewMatcherException.others;
            return this;
        }

        public Builder includeViewHierarchy(boolean z) {
            this.includeViewHierarchy = z;
            return this;
        }

        public Builder withOtherAmbiguousViews(View... viewArr) {
            this.others = viewArr;
            return this;
        }

        public Builder withRootView(View view) {
            this.rootView = view;
            return this;
        }

        public Builder withView1(View view) {
            this.view1 = view;
            return this;
        }

        public Builder withView2(View view) {
            this.view2 = view;
            return this;
        }

        public Builder withViewMatcher(C9623e<? super View> eVar) {
            this.viewMatcher = eVar;
            return this;
        }
    }

    public static String getErrorMessage(Builder builder) {
        if (builder.includeViewHierarchy) {
            ImmutableSet build = ImmutableSet.builder().add((Object[]) new View[]{builder.view1, builder.view2}).add((Object[]) builder.others).build();
            return HumanReadables.getViewHierarchyErrorMessage(builder.rootView, Lists.newArrayList(build), String.format(Locale.ROOT, "'%s' matches multiple views in the hierarchy.", new Object[]{builder.viewMatcher}), "****MATCHES****");
        }
        return String.format(Locale.ROOT, "Multiple Ambiguous Views found for matcher %s", new Object[]{builder.viewMatcher});
    }

    public AmbiguousViewMatcherException(String str) {
        super(str);
        TestOutputEmitter.dumpThreadStates("ThreadState-AmbiguousViewMatcherException.txt");
    }

    public AmbiguousViewMatcherException(Builder builder) {
        super(getErrorMessage(builder));
        this.viewMatcher = builder.viewMatcher;
        this.rootView = builder.rootView;
        this.view1 = builder.view1;
        this.view2 = builder.view2;
        this.others = builder.others;
    }
}
