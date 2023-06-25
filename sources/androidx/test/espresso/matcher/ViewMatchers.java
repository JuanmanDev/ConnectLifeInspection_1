package androidx.test.espresso.matcher;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.test.annotation.Beta;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.base.Predicate;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables;
import androidx.test.espresso.remote.annotation.RemoteMsgConstructor;
import androidx.test.espresso.remote.annotation.RemoteMsgField;
import androidx.test.espresso.util.HumanReadables;
import androidx.test.espresso.util.TreeIterables;
import com.juconnect.vivino.global.UrlConstKt;
import java.util.Locale;
import junit.framework.AssertionFailedError;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;
import p648m.p657c.C9626h;
import p648m.p657c.C9627i;

public final class ViewMatchers {

    /* renamed from: androidx.test.espresso.matcher.ViewMatchers$2 */
    public static /* synthetic */ class C10972 {

        /* renamed from: $SwitchMap$androidx$test$espresso$matcher$ViewMatchers$WithCharSequenceMatcher$TextViewMethod */
        public static final /* synthetic */ int[] f290x6a05bebb;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.test.espresso.matcher.ViewMatchers$WithCharSequenceMatcher$TextViewMethod[] r0 = androidx.test.espresso.matcher.ViewMatchers.WithCharSequenceMatcher.TextViewMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f290x6a05bebb = r0
                androidx.test.espresso.matcher.ViewMatchers$WithCharSequenceMatcher$TextViewMethod r1 = androidx.test.espresso.matcher.ViewMatchers.WithCharSequenceMatcher.TextViewMethod.GET_TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f290x6a05bebb     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.test.espresso.matcher.ViewMatchers$WithCharSequenceMatcher$TextViewMethod r1 = androidx.test.espresso.matcher.ViewMatchers.WithCharSequenceMatcher.TextViewMethod.GET_HINT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.C10972.<clinit>():void");
        }
    }

    public static final class HasChildCountMatcher extends BoundedMatcher<View, ViewGroup> {
        @RemoteMsgField(order = 0)
        public final int childCount;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has child count: ").mo50301d(Integer.valueOf(this.childCount));
        }

        @RemoteMsgConstructor
        public HasChildCountMatcher(int i) {
            super(ViewGroup.class);
            this.childCount = i;
        }

        public boolean matchesSafely(ViewGroup viewGroup) {
            return viewGroup.getChildCount() == this.childCount;
        }
    }

    public static final class HasContentDescriptionMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has content description");
        }

        @RemoteMsgConstructor
        public HasContentDescriptionMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.getContentDescription() != null;
        }
    }

    public static final class HasDescendantMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<View> descendantMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has descendant: ");
            this.descendantMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public HasDescendantMatcher(C9623e<View> eVar) {
            this.descendantMatcher = eVar;
        }

        public boolean matchesSafely(final View view) {
            return Iterables.filter(TreeIterables.breadthFirstViewTraversal(view), new Predicate<View>() {
                public boolean apply(View view) {
                    return view != view && HasDescendantMatcher.this.descendantMatcher.matches(view);
                }
            }).iterator().hasNext();
        }
    }

    public static final class HasErrorTextMatcher extends BoundedMatcher<View, EditText> {
        @RemoteMsgField(order = 0)
        public C9623e<String> stringMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with error: ");
            this.stringMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public HasErrorTextMatcher(C9623e<String> eVar) {
            super(EditText.class);
            this.stringMatcher = eVar;
        }

        public boolean matchesSafely(EditText editText) {
            return this.stringMatcher.matches(editText.getError());
        }
    }

    public static final class HasFocusMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has focus on the screen to the user");
        }

        @RemoteMsgConstructor
        public HasFocusMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.hasFocus();
        }
    }

    public static final class HasImeActionMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<Integer> imeActionMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has ime action: ");
            this.imeActionMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public HasImeActionMatcher(C9623e<Integer> eVar) {
            this.imeActionMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            EditorInfo editorInfo = new EditorInfo();
            if (view.onCreateInputConnection(editorInfo) == null) {
                return false;
            }
            int i = editorInfo.actionId;
            if (i == 0) {
                i = editorInfo.imeOptions & 255;
            }
            return this.imeActionMatcher.matches(Integer.valueOf(i));
        }
    }

    public static final class HasLinksMatcher extends BoundedMatcher<View, TextView> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has links");
        }

        @RemoteMsgConstructor
        public HasLinksMatcher() {
            super(TextView.class);
        }

        public boolean matchesSafely(TextView textView) {
            return textView.getUrls().length > 0;
        }
    }

    public static final class HasMinimumChildCountMatcher extends BoundedMatcher<View, ViewGroup> {
        @RemoteMsgField(order = 0)
        public final int minChildCount;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has minimum child count: ").mo50301d(Integer.valueOf(this.minChildCount));
        }

        @RemoteMsgConstructor
        public HasMinimumChildCountMatcher(int i) {
            super(ViewGroup.class);
            this.minChildCount = i;
        }

        public boolean matchesSafely(ViewGroup viewGroup) {
            return viewGroup.getChildCount() >= this.minChildCount;
        }
    }

    public static final class HasSiblingMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<View> siblingMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has sibling: ");
            this.siblingMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public HasSiblingMatcher(C9623e<View> eVar) {
            this.siblingMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (this.siblingMatcher.matches(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class IsAssignableFromMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final Class<?> clazz;

        public void describeTo(C9620c cVar) {
            String valueOf = String.valueOf(this.clazz);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("is assignable from class: ");
            sb.append(valueOf);
            cVar.mo50300c(sb.toString());
        }

        @RemoteMsgConstructor
        public IsAssignableFromMatcher(Class<?> cls) {
            this.clazz = (Class) Preconditions.checkNotNull(cls);
        }

        public boolean matchesSafely(View view) {
            return this.clazz.isAssignableFrom(view.getClass());
        }
    }

    public static final class IsClickableMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is clickable");
        }

        @RemoteMsgConstructor
        public IsClickableMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.isClickable();
        }
    }

    public static final class IsDescendantOfAMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<View> ancestorMatcher;

        private boolean checkAncestors(ViewParent viewParent, C9623e<View> eVar) {
            if (!(viewParent instanceof View)) {
                return false;
            }
            if (eVar.matches(viewParent)) {
                return true;
            }
            return checkAncestors(viewParent.getParent(), eVar);
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is descendant of a: ");
            this.ancestorMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public IsDescendantOfAMatcher(C9623e<View> eVar) {
            this.ancestorMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            return checkAncestors(view.getParent(), this.ancestorMatcher);
        }
    }

    public static final class IsDisplayedMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is displayed on the screen to the user");
        }

        @RemoteMsgConstructor
        public IsDisplayedMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.getGlobalVisibleRect(new Rect()) && ViewMatchers.withEffectiveVisibility(Visibility.VISIBLE).matches(view);
        }
    }

    public static final class IsDisplayingAtLeastMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final int areaPercentage;

        private Rect getScreenWithoutStatusBarActionBar(View view) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int identifier = view.getContext().getResources().getIdentifier("status_bar_height", "dimen", UrlConstKt.APP_PLATFORM);
            int dimensionPixelSize = identifier > 0 ? view.getContext().getResources().getDimensionPixelSize(identifier) : 0;
            TypedValue typedValue = new TypedValue();
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels - (dimensionPixelSize + (view.getContext().getTheme().resolveAttribute(16843499, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, view.getContext().getResources().getDisplayMetrics()) : 0)));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c(String.format(Locale.ROOT, "at least %s percent of the view's area is displayed to the user.", new Object[]{Integer.valueOf(this.areaPercentage)}));
        }

        @RemoteMsgConstructor
        public IsDisplayingAtLeastMatcher(int i) {
            this.areaPercentage = i;
        }

        public boolean matchesSafely(View view) {
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                return false;
            }
            Rect screenWithoutStatusBarActionBar = getScreenWithoutStatusBarActionBar(view);
            float height = (float) (view.getHeight() > screenWithoutStatusBarActionBar.height() ? screenWithoutStatusBarActionBar.height() : view.getHeight());
            float width = (float) (view.getWidth() > screenWithoutStatusBarActionBar.width() ? screenWithoutStatusBarActionBar.width() : view.getWidth());
            if (Build.VERSION.SDK_INT >= 11) {
                height = Math.min(((float) view.getHeight()) * view.getScaleY(), (float) screenWithoutStatusBarActionBar.height());
                width = Math.min(((float) view.getWidth()) * view.getScaleX(), (float) screenWithoutStatusBarActionBar.width());
            }
            if (((int) ((((double) (rect.height() * rect.width())) / ((double) (height * width))) * 100.0d)) < this.areaPercentage || !ViewMatchers.withEffectiveVisibility(Visibility.VISIBLE).matches(view)) {
                return false;
            }
            return true;
        }
    }

    public static final class IsEnabledMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is enabled");
        }

        @RemoteMsgConstructor
        public IsEnabledMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.isEnabled();
        }
    }

    public static final class IsFocusableMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is focusable");
        }

        @RemoteMsgConstructor
        public IsFocusableMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.isFocusable();
        }
    }

    public static final class IsJavascriptEnabledMatcher extends BoundedMatcher<View, WebView> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("WebView with JS enabled");
        }

        @RemoteMsgConstructor
        public IsJavascriptEnabledMatcher() {
            super(WebView.class);
        }

        public boolean matchesSafely(WebView webView) {
            return webView.getSettings().getJavaScriptEnabled();
        }
    }

    public static final class IsRootMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is a root view.");
        }

        @RemoteMsgConstructor
        public IsRootMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.getRootView().equals(view);
        }
    }

    public static final class IsSelectedMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is selected");
        }

        @RemoteMsgConstructor
        public IsSelectedMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.isSelected();
        }
    }

    public static final class SupportsInputMethodsMatcher extends C9627i<View> {
        public void describeTo(C9620c cVar) {
            cVar.mo50300c("supports input methods");
        }

        @RemoteMsgConstructor
        public SupportsInputMethodsMatcher() {
        }

        public boolean matchesSafely(View view) {
            return view.onCreateInputConnection(new EditorInfo()) != null;
        }
    }

    public enum Visibility {
        VISIBLE(0),
        INVISIBLE(4),
        GONE(8);
        
        public final int value;

        /* access modifiers changed from: public */
        Visibility(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static final class WithAlphaMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final float alpha;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has alpha: ").mo50301d(Float.valueOf(this.alpha));
        }

        @RemoteMsgConstructor
        public WithAlphaMatcher(float f) {
            this.alpha = f;
        }

        public boolean matchesSafely(View view) {
            return view.getAlpha() == this.alpha;
        }
    }

    public static final class WithCharSequenceMatcher extends BoundedMatcher<View, TextView> {
        public String expectedText;
        @RemoteMsgField(order = 1)
        public final TextViewMethod method;
        @RemoteMsgField(order = 0)
        public final int resourceId;
        public String resourceName;

        public enum TextViewMethod {
            GET_TEXT,
            GET_HINT
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with string from resource id: ").mo50301d(Integer.valueOf(this.resourceId));
            if (this.resourceName != null) {
                cVar.mo50300c("[").mo50300c(this.resourceName).mo50300c("]");
            }
            if (this.expectedText != null) {
                cVar.mo50300c(" value: ").mo50300c(this.expectedText);
            }
        }

        @RemoteMsgConstructor
        public WithCharSequenceMatcher(int i, TextViewMethod textViewMethod) {
            super(TextView.class);
            this.resourceId = i;
            this.method = textViewMethod;
        }

        public boolean matchesSafely(TextView textView) {
            CharSequence charSequence;
            if (this.expectedText == null) {
                try {
                    this.expectedText = textView.getResources().getString(this.resourceId);
                    this.resourceName = textView.getResources().getResourceEntryName(this.resourceId);
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i = C10972.f290x6a05bebb[this.method.ordinal()];
            if (i == 1) {
                charSequence = textView.getText();
            } else if (i != 2) {
                String valueOf = String.valueOf(this.method.toString());
                throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected TextView method: ".concat(valueOf) : new String("Unexpected TextView method: "));
            } else {
                charSequence = textView.getHint();
            }
            String str = this.expectedText;
            if (str == null || charSequence == null || !str.equals(charSequence.toString())) {
                return false;
            }
            return true;
        }
    }

    public static final class WithCheckBoxStateMatcher<E extends View & Checkable> extends BoundedMatcher<View, E> {
        @RemoteMsgField(order = 0)
        public final C9623e<Boolean> checkStateMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with checkbox state: ");
            this.checkStateMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithCheckBoxStateMatcher(C9623e<Boolean> eVar) {
            super(View.class, Checkable.class, new Class[0]);
            this.checkStateMatcher = eVar;
        }

        public boolean matchesSafely(E e) {
            return this.checkStateMatcher.matches(Boolean.valueOf(((Checkable) e).isChecked()));
        }
    }

    public static final class WithChildMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<View> childMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has child: ");
            this.childMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithChildMatcher(C9623e<View> eVar) {
            this.childMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            if (!(view instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (this.childMatcher.matches(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class WithClassNameMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<String> classNameMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with class name: ");
            this.classNameMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithClassNameMatcher(C9623e<String> eVar) {
            this.classNameMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            return this.classNameMatcher.matches(view.getClass().getName());
        }
    }

    public static final class WithContentDescriptionFromIdMatcher extends C9627i<View> {
        public String expectedText;
        @RemoteMsgField(order = 0)
        public final int resourceId;
        public String resourceName;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with content description from resource id: ");
            cVar.mo50301d(Integer.valueOf(this.resourceId));
            if (this.resourceName != null) {
                cVar.mo50300c("[");
                cVar.mo50300c(this.resourceName);
                cVar.mo50300c("]");
            }
            if (this.expectedText != null) {
                cVar.mo50300c(" value: ");
                cVar.mo50300c(this.expectedText);
            }
        }

        @RemoteMsgConstructor
        public WithContentDescriptionFromIdMatcher(int i) {
            this.resourceName = null;
            this.expectedText = null;
            this.resourceId = i;
        }

        public boolean matchesSafely(View view) {
            if (this.expectedText == null) {
                try {
                    this.expectedText = view.getResources().getString(this.resourceId);
                    this.resourceName = view.getResources().getResourceEntryName(this.resourceId);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (this.expectedText == null || view.getContentDescription() == null) {
                return false;
            }
            return this.expectedText.equals(view.getContentDescription().toString());
        }
    }

    public static final class WithContentDescriptionMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<? extends CharSequence> charSequenceMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with content description: ");
            this.charSequenceMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithContentDescriptionMatcher(C9623e<? extends CharSequence> eVar) {
            this.charSequenceMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            return this.charSequenceMatcher.matches(view.getContentDescription());
        }
    }

    public static final class WithContentDescriptionTextMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<String> textMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with content description text: ");
            this.textMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithContentDescriptionTextMatcher(C9623e<String> eVar) {
            this.textMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            return this.textMatcher.matches(view.getContentDescription() != null ? view.getContentDescription().toString() : null);
        }
    }

    public static final class WithEffectiveVisibilityMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final Visibility visibility;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c(String.format(Locale.ROOT, "view has effective visibility=%s", new Object[]{this.visibility}));
        }

        @RemoteMsgConstructor
        public WithEffectiveVisibilityMatcher(Visibility visibility2) {
            this.visibility = visibility2;
        }

        public boolean matchesSafely(View view) {
            if (this.visibility.getValue() == 0) {
                if (view.getVisibility() != this.visibility.getValue()) {
                    return false;
                }
                while (view.getParent() != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                    if (view.getVisibility() != this.visibility.getValue()) {
                        return false;
                    }
                }
                return true;
            } else if (view.getVisibility() == this.visibility.getValue()) {
                return true;
            } else {
                while (view.getParent() != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                    if (view.getVisibility() == this.visibility.getValue()) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public static final class WithHintMatcher extends BoundedMatcher<View, TextView> {
        @RemoteMsgField(order = 0)
        public final C9623e<String> stringMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with hint: ");
            this.stringMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithHintMatcher(C9623e<String> eVar) {
            super(TextView.class);
            this.stringMatcher = eVar;
        }

        public boolean matchesSafely(TextView textView) {
            return this.stringMatcher.matches(textView.getHint());
        }
    }

    public static final class WithIdMatcher extends C9627i<View> {
        public Resources resources;
        @RemoteMsgField(order = 0)
        public C9623e<Integer> viewIdMatcher;

        public void describeTo(C9620c cVar) {
            String replaceAll = this.viewIdMatcher.toString().replaceAll("\\D+", "");
            int parseInt = Integer.parseInt(replaceAll);
            Resources resources2 = this.resources;
            if (resources2 != null) {
                try {
                    replaceAll = resources2.getResourceName(parseInt);
                } catch (Resources.NotFoundException unused) {
                    replaceAll = String.format(Locale.ROOT, "%s (resource name not found)", new Object[]{replaceAll});
                }
            }
            String valueOf = String.valueOf(replaceAll);
            cVar.mo50300c(valueOf.length() != 0 ? "with id: ".concat(valueOf) : new String("with id: "));
        }

        @RemoteMsgConstructor
        public WithIdMatcher(C9623e<Integer> eVar) {
            this.viewIdMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            this.resources = view.getResources();
            return this.viewIdMatcher.matches(Integer.valueOf(view.getId()));
        }
    }

    public static final class WithInputTypeMatcher extends BoundedMatcher<View, EditText> {
        @RemoteMsgField(order = 0)
        public int inputType;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("is view input type equal to: ");
            cVar.mo50300c(Integer.toString(this.inputType));
        }

        @RemoteMsgConstructor
        public WithInputTypeMatcher(int i) {
            super(EditText.class);
            this.inputType = i;
        }

        public boolean matchesSafely(EditText editText) {
            return editText.getInputType() == this.inputType;
        }
    }

    public static final class WithParentIndexMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final int index;

        public void describeTo(C9620c cVar) {
            int i = this.index;
            StringBuilder sb = new StringBuilder(30);
            sb.append("with parent index: ");
            sb.append(i);
            cVar.mo50300c(sb.toString());
        }

        @RemoteMsgConstructor
        public WithParentIndexMatcher(int i) {
            this.index = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = (android.view.ViewGroup) r0;
            r1 = r0.getChildCount();
            r2 = r3.index;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean matchesSafely(android.view.View r4) {
            /*
                r3 = this;
                android.view.ViewParent r0 = r4.getParent()
                boolean r1 = r0 instanceof android.view.ViewGroup
                if (r1 == 0) goto L_0x001a
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r1 = r0.getChildCount()
                int r2 = r3.index
                if (r1 <= r2) goto L_0x001a
                android.view.View r0 = r0.getChildAt(r2)
                if (r0 != r4) goto L_0x001a
                r4 = 1
                goto L_0x001b
            L_0x001a:
                r4 = 0
            L_0x001b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.WithParentIndexMatcher.matchesSafely(android.view.View):boolean");
        }
    }

    public static final class WithParentMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<View> parentMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("has parent matching: ");
            this.parentMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithParentMatcher(C9623e<View> eVar) {
            this.parentMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            return this.parentMatcher.matches(view.getParent());
        }
    }

    public static final class WithResourceNameMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<String> stringMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with res-name that ");
            this.stringMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithResourceNameMatcher(C9623e<String> eVar) {
            this.stringMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            if (!(view.getId() == -1 || view.getResources() == null || ViewMatchers.isViewIdGenerated(view.getId()))) {
                try {
                    return this.stringMatcher.matches(view.getResources().getResourceEntryName(view.getId()));
                } catch (Resources.NotFoundException unused) {
                }
            }
            return false;
        }
    }

    public static final class WithSpinnerTextIdMatcher extends BoundedMatcher<View, Spinner> {
        public String expectedText;
        @RemoteMsgField(order = 0)
        public int resourceId;
        public String resourceName;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with string from resource id: ");
            cVar.mo50301d(Integer.valueOf(this.resourceId));
            if (this.resourceName != null) {
                cVar.mo50300c("[");
                cVar.mo50300c(this.resourceName);
                cVar.mo50300c("]");
            }
            if (this.expectedText != null) {
                cVar.mo50300c(" value: ");
                cVar.mo50300c(this.expectedText);
            }
        }

        @RemoteMsgConstructor
        public WithSpinnerTextIdMatcher(int i) {
            super(Spinner.class);
            this.resourceName = null;
            this.expectedText = null;
            this.resourceId = i;
        }

        public boolean matchesSafely(Spinner spinner) {
            if (this.expectedText == null) {
                try {
                    this.expectedText = spinner.getResources().getString(this.resourceId);
                    this.resourceName = spinner.getResources().getResourceEntryName(this.resourceId);
                } catch (Resources.NotFoundException unused) {
                }
            }
            String str = this.expectedText;
            if (str != null) {
                return str.equals(spinner.getSelectedItem().toString());
            }
            return false;
        }
    }

    public static final class WithSpinnerTextMatcher extends BoundedMatcher<View, Spinner> {
        @RemoteMsgField(order = 0)
        public C9623e<String> stringMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with text: ");
            this.stringMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithSpinnerTextMatcher(C9623e<String> eVar) {
            super(Spinner.class);
            this.stringMatcher = eVar;
        }

        public boolean matchesSafely(Spinner spinner) {
            return this.stringMatcher.matches(spinner.getSelectedItem().toString());
        }
    }

    public static final class WithTagKeyMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final int key;
        @RemoteMsgField(order = 1)
        public final C9623e<?> objectMatcher;

        public void describeTo(C9620c cVar) {
            int i = this.key;
            StringBuilder sb = new StringBuilder(21);
            sb.append("with key: ");
            sb.append(i);
            cVar.mo50300c(sb.toString());
            this.objectMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithTagKeyMatcher(int i, C9623e<?> eVar) {
            this.key = i;
            this.objectMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            return this.objectMatcher.matches(view.getTag(this.key));
        }
    }

    public static final class WithTagValueMatcher extends C9627i<View> {
        @RemoteMsgField(order = 0)
        public final C9623e<Object> tagValueMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with tag value: ");
            this.tagValueMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithTagValueMatcher(C9623e<Object> eVar) {
            this.tagValueMatcher = eVar;
        }

        public boolean matchesSafely(View view) {
            return this.tagValueMatcher.matches(view.getTag());
        }
    }

    public static final class WithTextMatcher extends BoundedMatcher<View, TextView> {
        @RemoteMsgField(order = 0)
        public final C9623e<String> stringMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with text: ");
            this.stringMatcher.describeTo(cVar);
        }

        @RemoteMsgConstructor
        public WithTextMatcher(C9623e<String> eVar) {
            super(TextView.class);
            this.stringMatcher = eVar;
        }

        public boolean matchesSafely(TextView textView) {
            CharSequence transformation;
            String charSequence = textView.getText().toString();
            if (this.stringMatcher.matches(charSequence)) {
                return true;
            }
            if (textView.getTransformationMethod() == null || (transformation = textView.getTransformationMethod().getTransformation(charSequence, textView)) == null) {
                return false;
            }
            return this.stringMatcher.matches(transformation.toString());
        }
    }

    public static <T> void assertThat(T t, C9623e<T> eVar) {
        assertThat("", t, eVar);
    }

    @Beta
    public static C9623e<View> hasBackground(int i) {
        return new HasBackgroundMatcher(i);
    }

    public static C9623e<View> hasChildCount(int i) {
        return new HasChildCountMatcher(i);
    }

    public static C9623e<View> hasContentDescription() {
        return new HasContentDescriptionMatcher();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> hasDescendant(p648m.p657c.C9623e<android.view.View> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$HasDescendantMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$HasDescendantMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.hasDescendant(m.c.e):m.c.e");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> hasErrorText(p648m.p657c.C9623e<java.lang.String> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$HasErrorTextMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$HasErrorTextMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.hasErrorText(m.c.e):m.c.e");
    }

    public static C9623e<View> hasFocus() {
        return new HasFocusMatcher();
    }

    public static C9623e<View> hasImeAction(int i) {
        return hasImeAction((C9623e<Integer>) C9624f.m25844i(Integer.valueOf(i)));
    }

    public static C9623e<View> hasLinks() {
        return new HasLinksMatcher();
    }

    public static C9623e<View> hasMinimumChildCount(int i) {
        return new HasMinimumChildCountMatcher(i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> hasSibling(p648m.p657c.C9623e<android.view.View> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$HasSiblingMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$HasSiblingMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.hasSibling(m.c.e):m.c.e");
    }

    @Beta
    public static C9623e<View> hasTextColor(final int i) {
        return new BoundedMatcher<View, TextView>(TextView.class) {
            public Context context;

            public void describeTo(C9620c cVar) {
                String valueOf = String.valueOf(i);
                Context context2 = this.context;
                if (context2 != null) {
                    valueOf = context2.getResources().getResourceName(i);
                }
                String valueOf2 = String.valueOf(valueOf);
                cVar.mo50300c(valueOf2.length() != 0 ? "has color with ID ".concat(valueOf2) : new String("has color with ID "));
            }

            public boolean matchesSafely(TextView textView) {
                int i;
                this.context = textView.getContext();
                int currentTextColor = textView.getCurrentTextColor();
                if (Build.VERSION.SDK_INT <= 22) {
                    i = this.context.getResources().getColor(i);
                } else {
                    i = this.context.getColor(i);
                }
                return currentTextColor == i;
            }
        };
    }

    public static C9623e<View> isAssignableFrom(Class<? extends View> cls) {
        return new IsAssignableFromMatcher(cls);
    }

    public static C9623e<View> isChecked() {
        return withCheckBoxState(C9624f.m25844i(Boolean.TRUE));
    }

    public static C9623e<View> isClickable() {
        return new IsClickableMatcher();
    }

    public static C9623e<View> isCompletelyDisplayed() {
        return isDisplayingAtLeast(100);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> isDescendantOfA(p648m.p657c.C9623e<android.view.View> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$IsDescendantOfAMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$IsDescendantOfAMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA(m.c.e):m.c.e");
    }

    public static C9623e<View> isDisplayed() {
        return new IsDisplayedMatcher();
    }

    public static C9623e<View> isDisplayingAtLeast(int i) {
        boolean z = true;
        Preconditions.checkState(i <= 100, "Cannot have over 100 percent: %s", i);
        if (i <= 0) {
            z = false;
        }
        Preconditions.checkState(z, "Must have a positive, non-zero value: %s", i);
        return new IsDisplayingAtLeastMatcher(i);
    }

    public static C9623e<View> isEnabled() {
        return new IsEnabledMatcher();
    }

    public static C9623e<View> isFocusable() {
        return new IsFocusableMatcher();
    }

    public static C9623e<View> isJavascriptEnabled() {
        return new IsJavascriptEnabledMatcher();
    }

    public static C9623e<View> isNotChecked() {
        return withCheckBoxState(C9624f.m25844i(Boolean.FALSE));
    }

    public static C9623e<View> isRoot() {
        return new IsRootMatcher();
    }

    public static C9623e<View> isSelected() {
        return new IsSelectedMatcher();
    }

    public static boolean isViewIdGenerated(int i) {
        return (-16777216 & i) == 0 && (i & ViewCompat.MEASURED_SIZE_MASK) != 0;
    }

    public static C9623e<View> supportsInputMethods() {
        return new SupportsInputMethodsMatcher();
    }

    public static C9623e<View> withAlpha(float f) {
        return new WithAlphaMatcher(f);
    }

    public static <E extends View & Checkable> C9623e<View> withCheckBoxState(C9623e<Boolean> eVar) {
        return new WithCheckBoxStateMatcher(eVar);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withChild(p648m.p657c.C9623e<android.view.View> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithChildMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithChildMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withChild(m.c.e):m.c.e");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withClassName(p648m.p657c.C9623e<java.lang.String> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithClassNameMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithClassNameMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withClassName(m.c.e):m.c.e");
    }

    public static C9623e<View> withContentDescription(int i) {
        return new WithContentDescriptionFromIdMatcher(i);
    }

    public static C9623e<View> withEffectiveVisibility(Visibility visibility) {
        return new WithEffectiveVisibilityMatcher(visibility);
    }

    public static C9623e<View> withHint(String str) {
        return withHint((C9623e<String>) C9624f.m25844i((String) Preconditions.checkNotNull(str)));
    }

    public static C9623e<View> withId(int i) {
        return withId((C9623e<Integer>) C9624f.m25844i(Integer.valueOf(i)));
    }

    public static C9623e<View> withInputType(int i) {
        return new WithInputTypeMatcher(i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withParent(p648m.p657c.C9623e<android.view.View> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithParentMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithParentMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withParent(m.c.e):m.c.e");
    }

    public static C9623e<View> withParentIndex(int i) {
        Preconditions.checkArgument(i >= 0, "Index %s must be >= 0", i);
        return new WithParentIndexMatcher(i);
    }

    public static C9623e<View> withResourceName(String str) {
        return withResourceName((C9623e<String>) C9624f.m25844i(str));
    }

    public static C9623e<View> withSpinnerText(int i) {
        return new WithSpinnerTextIdMatcher(i);
    }

    public static C9623e<View> withSubstring(String str) {
        return withText(C9624f.m25842g(str));
    }

    public static C9623e<View> withTagKey(int i) {
        return withTagKey(i, C9624f.m25846k());
    }

    public static C9623e<View> withTagValue(C9623e<Object> eVar) {
        return new WithTagValueMatcher((C9623e) Preconditions.checkNotNull(eVar));
    }

    public static C9623e<View> withText(String str) {
        return withText((C9623e<String>) C9624f.m25844i(str));
    }

    public static <T> void assertThat(String str, T t, C9623e<T> eVar) {
        if (!eVar.matches(t)) {
            C9626h hVar = new C9626h();
            hVar.mo50300c(str);
            hVar.mo50300c("\nExpected: ");
            hVar.mo50299b(eVar);
            hVar.mo50300c("\n     Got: ");
            if (t instanceof View) {
                hVar.mo50301d(HumanReadables.describe((View) t));
            } else {
                hVar.mo50301d(t);
            }
            hVar.mo50300c("\n");
            throw new AssertionFailedError(hVar.toString());
        }
    }

    public static C9623e<View> hasErrorText(String str) {
        return hasErrorText((C9623e<String>) C9624f.m25844i(str));
    }

    public static C9623e<View> hasImeAction(C9623e<Integer> eVar) {
        return new HasImeActionMatcher(eVar);
    }

    public static C9623e<View> withContentDescription(String str) {
        return new WithContentDescriptionTextMatcher(C9624f.m25844i(str));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withHint(p648m.p657c.C9623e<java.lang.String> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithHintMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithHintMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withHint(m.c.e):m.c.e");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withId(p648m.p657c.C9623e<java.lang.Integer> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithIdMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithIdMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withId(m.c.e):m.c.e");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withResourceName(p648m.p657c.C9623e<java.lang.String> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithResourceNameMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithResourceNameMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withResourceName(m.c.e):m.c.e");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withSpinnerText(p648m.p657c.C9623e<java.lang.String> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithSpinnerTextMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithSpinnerTextMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withSpinnerText(m.c.e):m.c.e");
    }

    public static C9623e<View> withTagKey(int i, C9623e<?> eVar) {
        return new WithTagKeyMatcher(i, (C9623e) Preconditions.checkNotNull(eVar));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p648m.p657c.C9623e<android.view.View> withText(p648m.p657c.C9623e<java.lang.String> r2) {
        /*
            androidx.test.espresso.matcher.ViewMatchers$WithTextMatcher r0 = new androidx.test.espresso.matcher.ViewMatchers$WithTextMatcher
            java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
            m.c.e r2 = (p648m.p657c.C9623e) r2
            r1 = 0
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.ViewMatchers.withText(m.c.e):m.c.e");
    }

    public static C9623e<View> withContentDescription(C9623e<? extends CharSequence> eVar) {
        return new WithContentDescriptionMatcher((C9623e) Preconditions.checkNotNull(eVar));
    }

    public static C9623e<View> withHint(int i) {
        return new WithCharSequenceMatcher(i, WithCharSequenceMatcher.TextViewMethod.GET_HINT);
    }

    public static C9623e<View> withSpinnerText(String str) {
        return withSpinnerText((C9623e<String>) C9624f.m25844i(str));
    }

    public static C9623e<View> withText(int i) {
        return new WithCharSequenceMatcher(i, WithCharSequenceMatcher.TextViewMethod.GET_TEXT);
    }
}
