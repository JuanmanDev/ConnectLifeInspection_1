package androidx.test.espresso.action;

import android.database.Cursor;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.test.espresso.action.AdapterViewProtocol;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.collect.Lists;
import androidx.test.espresso.core.internal.deps.guava.collect.Range;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.EspressoOptional;
import java.util.ArrayList;

public final class AdapterViewProtocols {
    public static final int FULLY_RENDERED_PERCENTAGE_CUTOFF = 90;
    public static final AdapterViewProtocol STANDARD_PROTOCOL = new StandardAdapterViewProtocol();

    public static final class StandardAdapterViewProtocol implements AdapterViewProtocol {
        public static final String TAG = "StdAdapterViewProtocol";

        public static final class StandardDataFunction implements AdapterViewProtocol.DataFunction {
            public final Object dataAtPosition;
            public final int position;

            public Object getData() {
                Object obj = this.dataAtPosition;
                if ((obj instanceof Cursor) && !((Cursor) obj).moveToPosition(this.position)) {
                    int i = this.position;
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("Cannot move cursor to position: ");
                    sb.append(i);
                    sb.toString();
                }
                return this.dataAtPosition;
            }

            public StandardDataFunction(Object obj, int i) {
                Preconditions.checkArgument(i >= 0, "position must be >= 0");
                this.dataAtPosition = obj;
                this.position = i;
            }
        }

        private boolean isElementFullyRendered(AdapterView<? extends Adapter> adapterView, int i) {
            return ViewMatchers.isDisplayingAtLeast(90).matches(adapterView.getChildAt(i));
        }

        public Iterable<AdapterViewProtocol.AdaptedData> getDataInAdapterView(AdapterView<? extends Adapter> adapterView) {
            ArrayList newArrayList = Lists.newArrayList();
            for (int i = 0; i < adapterView.getCount(); i++) {
                newArrayList.add(new AdapterViewProtocol.AdaptedData.Builder().withDataFunction(new StandardDataFunction(adapterView.getItemAtPosition(i), i)).withOpaqueToken(Integer.valueOf(i)).build());
            }
            return newArrayList;
        }

        public EspressoOptional<AdapterViewProtocol.AdaptedData> getDataRenderedByView(AdapterView<? extends Adapter> adapterView, View view) {
            int positionForView;
            if (adapterView != view.getParent() || (positionForView = adapterView.getPositionForView(view)) == -1) {
                return EspressoOptional.absent();
            }
            return EspressoOptional.m160of(new AdapterViewProtocol.AdaptedData.Builder().withDataFunction(new StandardDataFunction(adapterView.getItemAtPosition(positionForView), positionForView)).withOpaqueToken(Integer.valueOf(positionForView)).build());
        }

        public boolean isDataRenderedWithinAdapterView(AdapterView<? extends Adapter> adapterView, AdapterViewProtocol.AdaptedData adaptedData) {
            boolean z;
            Preconditions.checkArgument(adaptedData.opaqueToken instanceof Integer, "Not my data: %s", (Object) adaptedData);
            int intValue = ((Integer) adaptedData.opaqueToken).intValue();
            if (Range.closed(Integer.valueOf(adapterView.getFirstVisiblePosition()), Integer.valueOf(adapterView.getLastVisiblePosition())).contains(Integer.valueOf(intValue))) {
                z = adapterView.getFirstVisiblePosition() == adapterView.getLastVisiblePosition() ? true : isElementFullyRendered(adapterView, intValue - adapterView.getFirstVisiblePosition());
            } else {
                z = false;
            }
            if (z) {
                adapterView.setSelection(intValue);
            }
            return z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void makeDataRenderedWithinAdapterView(android.widget.AdapterView<? extends android.widget.Adapter> r6, androidx.test.espresso.action.AdapterViewProtocol.AdaptedData r7) {
            /*
                r5 = this;
                java.lang.Object r0 = r7.opaqueToken
                boolean r0 = r0 instanceof java.lang.Integer
                java.lang.String r1 = "Not my data: %s"
                androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkArgument((boolean) r0, (java.lang.String) r1, (java.lang.Object) r7)
                java.lang.Object r7 = r7.opaqueToken
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 1
                r2 = 0
                r3 = 7
                if (r0 <= r3) goto L_0x004b
                boolean r3 = r6 instanceof android.widget.AbsListView
                r4 = 10
                if (r3 == 0) goto L_0x0032
                if (r0 <= r4) goto L_0x002b
                r0 = r6
                android.widget.AbsListView r0 = (android.widget.AbsListView) r0
                int r3 = r6.getPaddingTop()
                r0.smoothScrollToPositionFromTop(r7, r3, r2)
                goto L_0x0031
            L_0x002b:
                r0 = r6
                android.widget.AbsListView r0 = (android.widget.AbsListView) r0
                r0.smoothScrollToPosition(r7)
            L_0x0031:
                r2 = r1
            L_0x0032:
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 <= r4) goto L_0x004b
                boolean r0 = r6 instanceof android.widget.AdapterViewAnimator
                if (r0 == 0) goto L_0x004b
                boolean r0 = r6 instanceof android.widget.AdapterViewFlipper
                if (r0 == 0) goto L_0x0044
                r0 = r6
                android.widget.AdapterViewFlipper r0 = (android.widget.AdapterViewFlipper) r0
                r0.stopFlipping()
            L_0x0044:
                r0 = r6
                android.widget.AdapterViewAnimator r0 = (android.widget.AdapterViewAnimator) r0
                r0.setDisplayedChild(r7)
                goto L_0x004c
            L_0x004b:
                r1 = r2
            L_0x004c:
                if (r1 != 0) goto L_0x0051
                r6.setSelection(r7)
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.action.AdapterViewProtocols.StandardAdapterViewProtocol.makeDataRenderedWithinAdapterView(android.widget.AdapterView, androidx.test.espresso.action.AdapterViewProtocol$AdaptedData):void");
        }
    }

    public static AdapterViewProtocol standardProtocol() {
        return STANDARD_PROTOCOL;
    }
}
