package androidx.test.espresso.assertion;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.test.espresso.AmbiguousViewMatcherException;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.base.Predicate;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterators;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.HumanReadables;
import androidx.test.espresso.util.TreeIterables;
import java.util.Iterator;
import java.util.Locale;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;
import p648m.p657c.C9626h;

public final class PositionAssertions {
    public static final String TAG = "PositionAssertions";

    /* renamed from: androidx.test.espresso.assertion.PositionAssertions$3 */
    public static /* synthetic */ class C09963 {

        /* renamed from: $SwitchMap$androidx$test$espresso$assertion$PositionAssertions$Position */
        public static final /* synthetic */ int[] f273xe61fedbe;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.test.espresso.assertion.PositionAssertions$Position[] r0 = androidx.test.espresso.assertion.PositionAssertions.Position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f273xe61fedbe = r0
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.COMPLETELY_LEFT_OF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.COMPLETELY_RIGHT_OF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.COMPLETELY_ABOVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.COMPLETELY_BELOW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.PARTIALLY_LEFT_OF     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.PARTIALLY_RIGHT_OF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.PARTIALLY_ABOVE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.PARTIALLY_BELOW     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.LEFT_ALIGNED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.RIGHT_ALIGNED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.TOP_ALIGNED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f273xe61fedbe     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.test.espresso.assertion.PositionAssertions$Position r1 = androidx.test.espresso.assertion.PositionAssertions.Position.BOTTOM_ALIGNED     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.assertion.PositionAssertions.C09963.<clinit>():void");
        }
    }

    public enum Position {
        COMPLETELY_LEFT_OF("completely left of"),
        COMPLETELY_RIGHT_OF("completely right of"),
        COMPLETELY_ABOVE("completely above"),
        COMPLETELY_BELOW("completely below"),
        PARTIALLY_LEFT_OF("partially left of"),
        PARTIALLY_RIGHT_OF("partially right of"),
        PARTIALLY_ABOVE("partially above"),
        PARTIALLY_BELOW("partially below"),
        LEFT_ALIGNED("aligned left with"),
        RIGHT_ALIGNED("aligned right with"),
        TOP_ALIGNED("aligned top with"),
        BOTTOM_ALIGNED("aligned bottom with");
        
        public final String positionValue;

        /* access modifiers changed from: public */
        Position(String str) {
            this.positionValue = str;
        }

        public String toString() {
            return this.positionValue;
        }
    }

    public static View findView(final C9623e<View> eVar, View view) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(view);
        Iterator<View> it = Iterables.filter(TreeIterables.breadthFirstViewTraversal(view), new Predicate<View>() {
            public boolean apply(View view) {
                return C9623e.this.matches(view);
            }
        }).iterator();
        View view2 = null;
        while (it.hasNext()) {
            if (view2 == null) {
                view2 = it.next();
            } else {
                throw new AmbiguousViewMatcherException.Builder().withRootView(view).withViewMatcher(eVar).withView1(view2).withView2(it.next()).withOtherAmbiguousViews((View[]) Iterators.toArray(it, View.class)).build();
            }
        }
        if (view2 != null) {
            return view2;
        }
        throw new NoMatchingViewException.Builder().withViewMatcher(eVar).withRootView(view).build();
    }

    public static ViewGroup getTopViewGroup(View view) {
        ViewGroup viewGroup = null;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
        }
        return viewGroup;
    }

    @Deprecated
    public static ViewAssertion isAbove(C9623e<View> eVar) {
        return isCompletelyAbove(eVar);
    }

    @Deprecated
    public static ViewAssertion isBelow(C9623e<View> eVar) {
        return isCompletelyBelow(eVar);
    }

    public static ViewAssertion isBottomAlignedWith(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.BOTTOM_ALIGNED);
    }

    public static ViewAssertion isCompletelyAbove(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.COMPLETELY_ABOVE);
    }

    public static ViewAssertion isCompletelyBelow(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.COMPLETELY_BELOW);
    }

    public static ViewAssertion isCompletelyLeftOf(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.COMPLETELY_LEFT_OF);
    }

    public static ViewAssertion isCompletelyRightOf(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.COMPLETELY_RIGHT_OF);
    }

    public static ViewAssertion isLeftAlignedWith(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.LEFT_ALIGNED);
    }

    @Deprecated
    public static ViewAssertion isLeftOf(C9623e<View> eVar) {
        return isCompletelyLeftOf(eVar);
    }

    public static ViewAssertion isPartiallyAbove(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.PARTIALLY_ABOVE);
    }

    public static ViewAssertion isPartiallyBelow(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.PARTIALLY_BELOW);
    }

    public static ViewAssertion isPartiallyLeftOf(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.PARTIALLY_LEFT_OF);
    }

    public static ViewAssertion isPartiallyRightOf(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.PARTIALLY_RIGHT_OF);
    }

    public static boolean isRelativePosition(View view, View view2, Position position) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        switch (C09963.f273xe61fedbe[position.ordinal()]) {
            case 1:
                if (iArr[0] + view.getWidth() <= iArr2[0]) {
                    return true;
                }
                return false;
            case 2:
                if (iArr2[0] + view2.getWidth() <= iArr[0]) {
                    return true;
                }
                return false;
            case 3:
                if (iArr[1] + view.getHeight() <= iArr2[1]) {
                    return true;
                }
                return false;
            case 4:
                if (iArr2[1] + view2.getHeight() <= iArr[1]) {
                    return true;
                }
                return false;
            case 5:
                if (iArr[0] >= iArr2[0] || iArr2[0] >= iArr[0] + view.getWidth()) {
                    return false;
                }
                return true;
            case 6:
                if (iArr2[0] >= iArr[0] || iArr[0] >= iArr2[0] + view2.getWidth()) {
                    return false;
                }
                return true;
            case 7:
                if (iArr[1] >= iArr2[1] || iArr2[1] >= iArr[1] + view.getHeight()) {
                    return false;
                }
                return true;
            case 8:
                if (iArr2[1] >= iArr[1] || iArr[1] >= iArr2[1] + view2.getHeight()) {
                    return false;
                }
                return true;
            case 9:
                if (iArr[0] == iArr2[0]) {
                    return true;
                }
                return false;
            case 10:
                if (iArr[0] + view.getWidth() == iArr2[0] + view2.getWidth()) {
                    return true;
                }
                return false;
            case 11:
                if (iArr[1] == iArr2[1]) {
                    return true;
                }
                return false;
            case 12:
                if (iArr[1] + view.getHeight() == iArr2[1] + view2.getHeight()) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static ViewAssertion isRightAlignedWith(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.RIGHT_ALIGNED);
    }

    @Deprecated
    public static ViewAssertion isRightOf(C9623e<View> eVar) {
        return isCompletelyRightOf(eVar);
    }

    public static ViewAssertion isTopAlignedWith(C9623e<View> eVar) {
        return relativePositionOf(eVar, Position.TOP_ALIGNED);
    }

    public static ViewAssertion relativePositionOf(final C9623e<View> eVar, final Position position) {
        Preconditions.checkNotNull(eVar);
        return new ViewAssertion() {
            public void check(View view, NoMatchingViewException noMatchingViewException) {
                C9626h hVar = new C9626h();
                if (noMatchingViewException == null) {
                    hVar.mo50300c("View:");
                    hVar.mo50300c(HumanReadables.describe(view));
                    hVar.mo50300c(" is not ");
                    hVar.mo50300c(Position.this.toString());
                    hVar.mo50300c(" view ");
                    hVar.mo50300c(eVar.toString());
                    ViewMatchers.assertThat(hVar.toString(), Boolean.valueOf(PositionAssertions.isRelativePosition(view, PositionAssertions.findView(eVar, PositionAssertions.getTopViewGroup(view)), Position.this)), C9624f.m25844i(Boolean.TRUE));
                    return;
                }
                hVar.mo50300c(String.format(Locale.ROOT, "' check could not be performed because view '%s' was not found.\n", new Object[]{noMatchingViewException.getViewMatcherDescription()}));
                hVar.toString();
                throw noMatchingViewException;
            }
        };
    }
}
