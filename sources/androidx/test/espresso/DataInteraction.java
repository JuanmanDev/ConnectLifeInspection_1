package androidx.test.espresso;

import android.view.View;
import android.view.ViewParent;
import android.widget.AdapterView;
import androidx.test.espresso.action.AdapterDataLoaderAction;
import androidx.test.espresso.action.AdapterViewProtocol;
import androidx.test.espresso.action.AdapterViewProtocols;
import androidx.test.espresso.core.internal.deps.guava.base.Function;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.matcher.RootMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.remote.ConstructorInvocation;
import androidx.test.espresso.remote.annotation.RemoteMsgConstructor;
import androidx.test.espresso.remote.annotation.RemoteMsgField;
import androidx.test.espresso.util.EspressoOptional;
import java.lang.annotation.Annotation;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;
import p648m.p657c.C9627i;

public class DataInteraction {
    public C9623e<View> adapterMatcher = ViewMatchers.isAssignableFrom(AdapterView.class);
    public AdapterViewProtocol adapterViewProtocol = AdapterViewProtocols.standardProtocol();
    public EspressoOptional<Integer> atPosition = EspressoOptional.absent();
    public EspressoOptional<C9623e<View>> childViewMatcher = EspressoOptional.absent();
    public final C9623e<? extends Object> dataMatcher;
    public C9623e<Root> rootMatcher = RootMatchers.DEFAULT;

    public static final class DisplayDataMatcher extends C9627i<View> {
        public static final String TAG = "DisplayDataMatcher";
        @RemoteMsgField(order = 3)
        public final AdapterDataLoaderAction adapterDataLoaderAction;
        @RemoteMsgField(order = 0)
        public final C9623e<View> adapterMatcher;
        public final AdapterViewProtocol adapterViewProtocol;
        @RemoteMsgField(order = 2)
        public final Class<? extends AdapterViewProtocol> adapterViewProtocolClass;
        @RemoteMsgField(order = 1)
        public final C9623e<? extends Object> dataMatcher;

        @RemoteMsgConstructor
        public DisplayDataMatcher(C9623e<View> eVar, C9623e<? extends Object> eVar2, Class<? extends AdapterViewProtocol> cls, AdapterDataLoaderAction adapterDataLoaderAction2) {
            this(eVar, eVar2, RootMatchers.DEFAULT, (AdapterViewProtocol) cls.cast(new ConstructorInvocation(cls, (Class<? extends Annotation>) null, new Class[0]).invokeConstructor(new Object[0])), adapterDataLoaderAction2);
        }

        public static DisplayDataMatcher displayDataMatcher(C9623e<View> eVar, C9623e<? extends Object> eVar2, C9623e<Root> eVar3, EspressoOptional<Integer> espressoOptional, AdapterViewProtocol adapterViewProtocol2) {
            return new DisplayDataMatcher(eVar, eVar2, eVar3, adapterViewProtocol2, new AdapterDataLoaderAction(eVar2, espressoOptional, adapterViewProtocol2));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c(" displaying data matching: ");
            this.dataMatcher.describeTo(cVar);
            cVar.mo50300c(" within adapter view matching: ");
            this.adapterMatcher.describeTo(cVar);
        }

        public boolean matchesSafely(View view) {
            Preconditions.checkState(this.adapterViewProtocol != null, "adapterViewProtocol cannot be null!");
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof AdapterView)) {
                parent = parent.getParent();
            }
            if (parent != null && this.adapterMatcher.matches(parent)) {
                EspressoOptional<AdapterViewProtocol.AdaptedData> dataRenderedByView = this.adapterViewProtocol.getDataRenderedByView((AdapterView) parent, view);
                if (dataRenderedByView.isPresent()) {
                    return dataRenderedByView.get().opaqueToken.equals(this.adapterDataLoaderAction.getAdaptedData().opaqueToken);
                }
            }
            return false;
        }

        public DisplayDataMatcher(final C9623e<View> eVar, C9623e<? extends Object> eVar2, final C9623e<Root> eVar3, AdapterViewProtocol adapterViewProtocol2, AdapterDataLoaderAction adapterDataLoaderAction2) {
            this(eVar, eVar2, adapterViewProtocol2, adapterDataLoaderAction2, (Function<AdapterDataLoaderAction, ViewInteraction>) new Function<AdapterDataLoaderAction, ViewInteraction>() {
                public ViewInteraction apply(AdapterDataLoaderAction adapterDataLoaderAction) {
                    return Espresso.onView(C9623e.this).inRoot(eVar3).perform(adapterDataLoaderAction);
                }
            });
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [m.c.e<android.view.View>, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, androidx.test.espresso.core.internal.deps.guava.base.Function<androidx.test.espresso.action.AdapterDataLoaderAction, androidx.test.espresso.ViewInteraction>] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DisplayDataMatcher(p648m.p657c.C9623e<android.view.View> r1, p648m.p657c.C9623e<? extends java.lang.Object> r2, androidx.test.espresso.action.AdapterViewProtocol r3, androidx.test.espresso.action.AdapterDataLoaderAction r4, androidx.test.espresso.core.internal.deps.guava.base.Function<androidx.test.espresso.action.AdapterDataLoaderAction, androidx.test.espresso.ViewInteraction> r5) {
            /*
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r1)
                m.c.e r1 = (p648m.p657c.C9623e) r1
                r0.adapterMatcher = r1
                java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
                m.c.e r1 = (p648m.p657c.C9623e) r1
                r0.dataMatcher = r1
                java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r3)
                androidx.test.espresso.action.AdapterViewProtocol r1 = (androidx.test.espresso.action.AdapterViewProtocol) r1
                r0.adapterViewProtocol = r1
                java.lang.Class r1 = r3.getClass()
                r0.adapterViewProtocolClass = r1
                java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r4)
                androidx.test.espresso.action.AdapterDataLoaderAction r1 = (androidx.test.espresso.action.AdapterDataLoaderAction) r1
                r0.adapterDataLoaderAction = r1
                java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r5)
                androidx.test.espresso.core.internal.deps.guava.base.Function r1 = (androidx.test.espresso.core.internal.deps.guava.base.Function) r1
                r1.apply(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.DataInteraction.DisplayDataMatcher.<init>(m.c.e, m.c.e, androidx.test.espresso.action.AdapterViewProtocol, androidx.test.espresso.action.AdapterDataLoaderAction, androidx.test.espresso.core.internal.deps.guava.base.Function):void");
        }
    }

    public DataInteraction(C9623e<? extends Object> eVar) {
        this.dataMatcher = (C9623e) Preconditions.checkNotNull(eVar);
    }

    private C9623e<View> makeTargetMatcher() {
        DisplayDataMatcher displayDataMatcher = DisplayDataMatcher.displayDataMatcher(this.adapterMatcher, this.dataMatcher, this.rootMatcher, this.atPosition, this.adapterViewProtocol);
        return this.childViewMatcher.isPresent() ? C9624f.m25836a(this.childViewMatcher.get(), ViewMatchers.isDescendantOfA(displayDataMatcher)) : displayDataMatcher;
    }

    public DataInteraction atPosition(Integer num) {
        this.atPosition = EspressoOptional.m160of((Integer) Preconditions.checkNotNull(num));
        return this;
    }

    public ViewInteraction check(ViewAssertion viewAssertion) {
        return Espresso.onView(makeTargetMatcher()).inRoot(this.rootMatcher).check(viewAssertion);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.test.espresso.DataInteraction inAdapterView(p648m.p657c.C9623e<android.view.View> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r1)
            m.c.e r1 = (p648m.p657c.C9623e) r1
            r0.adapterMatcher = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.DataInteraction.inAdapterView(m.c.e):androidx.test.espresso.DataInteraction");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [m.c.e<androidx.test.espresso.Root>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.test.espresso.DataInteraction inRoot(p648m.p657c.C9623e<androidx.test.espresso.Root> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r1)
            m.c.e r1 = (p648m.p657c.C9623e) r1
            r0.rootMatcher = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.DataInteraction.inRoot(m.c.e):androidx.test.espresso.DataInteraction");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.test.espresso.DataInteraction onChildView(p648m.p657c.C9623e<android.view.View> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r1)
            m.c.e r1 = (p648m.p657c.C9623e) r1
            androidx.test.espresso.util.EspressoOptional r1 = androidx.test.espresso.util.EspressoOptional.m160of(r1)
            r0.childViewMatcher = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.DataInteraction.onChildView(m.c.e):androidx.test.espresso.DataInteraction");
    }

    public ViewInteraction perform(ViewAction... viewActionArr) {
        return Espresso.onView(makeTargetMatcher()).inRoot(this.rootMatcher).perform(viewActionArr);
    }

    public DataInteraction usingAdapterViewProtocol(AdapterViewProtocol adapterViewProtocol2) {
        this.adapterViewProtocol = (AdapterViewProtocol) Preconditions.checkNotNull(adapterViewProtocol2);
        return this;
    }
}
