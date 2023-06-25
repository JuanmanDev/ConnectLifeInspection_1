package androidx.test.espresso;

import android.view.View;
import androidx.core.p028os.EnvironmentCompat;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.collect.Lists;
import androidx.test.espresso.util.EspressoOptional;
import androidx.test.espresso.util.HumanReadables;
import java.util.List;
import java.util.Locale;
import p648m.p657c.C9623e;

public final class NoMatchingViewException extends RuntimeException implements EspressoException {
    public EspressoOptional<String> adapterViewWarning;
    public List<View> adapterViews;
    public boolean includeViewHierarchy;
    public View rootView;
    public C9623e<? super View> viewMatcher;

    public static class Builder {
        public EspressoOptional<String> adapterViewWarning = EspressoOptional.absent();
        public List<View> adapterViews = Lists.newArrayList();
        public Throwable cause;
        public boolean includeViewHierarchy = true;
        public View rootView;
        public C9623e<? super View> viewMatcher;

        public NoMatchingViewException build() {
            Preconditions.checkNotNull(this.viewMatcher);
            Preconditions.checkNotNull(this.rootView);
            Preconditions.checkNotNull(this.adapterViews);
            Preconditions.checkNotNull(this.adapterViewWarning);
            return new NoMatchingViewException(this);
        }

        public Builder from(NoMatchingViewException noMatchingViewException) {
            this.viewMatcher = noMatchingViewException.viewMatcher;
            this.rootView = noMatchingViewException.rootView;
            this.adapterViews = noMatchingViewException.adapterViews;
            this.adapterViewWarning = noMatchingViewException.adapterViewWarning;
            this.includeViewHierarchy = noMatchingViewException.includeViewHierarchy;
            return this;
        }

        public Builder includeViewHierarchy(boolean z) {
            this.includeViewHierarchy = z;
            return this;
        }

        public Builder withAdapterViewWarning(EspressoOptional<String> espressoOptional) {
            this.adapterViewWarning = espressoOptional;
            return this;
        }

        public Builder withAdapterViews(List<View> list) {
            this.adapterViews = list;
            return this;
        }

        public Builder withCause(Throwable th) {
            this.cause = th;
            return this;
        }

        public Builder withRootView(View view) {
            this.rootView = view;
            return this;
        }

        public Builder withViewMatcher(C9623e<? super View> eVar) {
            this.viewMatcher = eVar;
            return this;
        }
    }

    public static String getErrorMessage(Builder builder) {
        if (builder.includeViewHierarchy) {
            String format = String.format(Locale.ROOT, "No views in hierarchy found matching: %s", new Object[]{builder.viewMatcher});
            if (builder.adapterViewWarning.isPresent()) {
                String valueOf = String.valueOf(format);
                String valueOf2 = String.valueOf((String) builder.adapterViewWarning.get());
                format = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            return HumanReadables.getViewHierarchyErrorMessage(builder.rootView, (List<View>) null, format, (String) null);
        }
        return String.format(Locale.ROOT, "Could not find a view that matches %s", new Object[]{builder.viewMatcher});
    }

    public String getViewMatcherDescription() {
        C9623e<? super View> eVar = this.viewMatcher;
        return eVar != null ? eVar.toString() : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public NoMatchingViewException(String str) {
        super(str);
        this.adapterViews = Lists.newArrayList();
        this.includeViewHierarchy = true;
        this.adapterViewWarning = EspressoOptional.absent();
    }

    public NoMatchingViewException(Builder builder) {
        super(getErrorMessage(builder), builder.cause);
        this.adapterViews = Lists.newArrayList();
        this.includeViewHierarchy = true;
        this.adapterViewWarning = EspressoOptional.absent();
        this.viewMatcher = builder.viewMatcher;
        this.rootView = builder.rootView;
        this.adapterViews = builder.adapterViews;
        this.adapterViewWarning = builder.adapterViewWarning;
        this.includeViewHierarchy = builder.includeViewHierarchy;
    }
}
