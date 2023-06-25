package androidx.test.espresso.matcher;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;
import p648m.p657c.C9627i;

public final class LayoutMatchers {
    public static C9623e<View> hasEllipsizedText() {
        return new C9627i<View>(TextView.class) {
            public void describeTo(C9620c cVar) {
                cVar.mo50300c("has ellipsized text");
            }

            public boolean matchesSafely(View view) {
                int lineCount;
                Layout layout = ((TextView) view).getLayout();
                if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
                    return false;
                }
                return true;
            }
        };
    }

    public static C9623e<View> hasMultilineText() {
        return new C9627i<View>(TextView.class) {
            public void describeTo(C9620c cVar) {
                cVar.mo50300c("has more than one line of text");
            }

            public boolean matchesSafely(View view) {
                return ((TextView) view).getLineCount() > 1;
            }
        };
    }
}
