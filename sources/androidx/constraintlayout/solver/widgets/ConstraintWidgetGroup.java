package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConstraintWidgetGroup {
    public List<ConstraintWidget> mConstrainedGroup;
    public final int[] mGroupDimensions = {-1, -1};
    public int mGroupHeight = -1;
    public int mGroupWidth = -1;
    public boolean mSkipSolver = false;
    public List<ConstraintWidget> mStartHorizontalWidgets = new ArrayList();
    public List<ConstraintWidget> mStartVerticalWidgets = new ArrayList();
    public List<ConstraintWidget> mUnresolvedWidgets = new ArrayList();
    public HashSet<ConstraintWidget> mWidgetsToSetHorizontal = new HashSet<>();
    public HashSet<ConstraintWidget> mWidgetsToSetVertical = new HashSet<>();
    public List<ConstraintWidget> mWidgetsToSolve = new ArrayList();

    public ConstraintWidgetGroup(List<ConstraintWidget> list) {
        this.mConstrainedGroup = list;
    }

    private void getWidgetsToSolveTraversal(ArrayList<ConstraintWidget> arrayList, ConstraintWidget constraintWidget) {
        if (!constraintWidget.mGroupsToSolver) {
            arrayList.add(constraintWidget);
            constraintWidget.mGroupsToSolver = true;
            if (!constraintWidget.isFullyResolved()) {
                if (constraintWidget instanceof Helper) {
                    Helper helper = (Helper) constraintWidget;
                    int i = helper.mWidgetsCount;
                    for (int i2 = 0; i2 < i; i2++) {
                        getWidgetsToSolveTraversal(arrayList, helper.mWidgets[i2]);
                    }
                }
                for (ConstraintAnchor constraintAnchor : constraintWidget.mListAnchors) {
                    ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                    if (constraintAnchor2 != null) {
                        ConstraintWidget constraintWidget2 = constraintAnchor2.mOwner;
                        if (!(constraintAnchor2 == null || constraintWidget2 == constraintWidget.getParent())) {
                            getWidgetsToSolveTraversal(arrayList, constraintWidget2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateResolvedDimension(androidx.constraintlayout.solver.widgets.ConstraintWidget r7) {
        /*
            r6 = this;
            boolean r0 = r7.mOptimizerMeasurable
            if (r0 == 0) goto L_0x00de
            boolean r0 = r7.isFullyResolved()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            goto L_0x0021
        L_0x001d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
        L_0x0021:
            if (r3 == 0) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r3.mOwner
            boolean r5 = r4.mOptimizerMeasured
            if (r5 != 0) goto L_0x002c
            r6.updateResolvedDimension(r4)
        L_0x002c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r3.mType
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r4 != r5) goto L_0x003c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.mOwner
            int r4 = r3.f214mX
            int r3 = r3.getWidth()
            int r4 = r4 + r3
            goto L_0x0046
        L_0x003c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r4 != r5) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.mOwner
            int r4 = r3.f214mX
            goto L_0x0046
        L_0x0045:
            r4 = r1
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mRight
            int r0 = r0.getMargin()
            int r4 = r4 - r0
            goto L_0x005c
        L_0x0050:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mLeft
            int r0 = r0.getMargin()
            int r3 = r7.getWidth()
            int r0 = r0 + r3
            int r4 = r4 + r0
        L_0x005c:
            int r0 = r7.getWidth()
            int r0 = r4 - r0
            r7.setHorizontalDimension(r0, r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x0087
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.mOwner
            boolean r3 = r1.mOptimizerMeasured
            if (r3 != 0) goto L_0x0074
            r6.updateResolvedDimension(r1)
        L_0x0074:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mOwner
            int r1 = r0.f215mY
            int r0 = r0.mBaselineDistance
            int r1 = r1 + r0
            int r0 = r7.mBaselineDistance
            int r1 = r1 - r0
            int r0 = r7.mHeight
            int r0 = r0 + r1
            r7.setVerticalDimension(r1, r0)
            r7.mOptimizerMeasured = r2
            return
        L_0x0087:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x008e
            r1 = r2
        L_0x008e:
            if (r1 == 0) goto L_0x0095
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            goto L_0x0099
        L_0x0095:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
        L_0x0099:
            if (r0 == 0) goto L_0x00bd
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            boolean r5 = r3.mOptimizerMeasured
            if (r5 != 0) goto L_0x00a4
            r6.updateResolvedDimension(r3)
        L_0x00a4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = r0.mType
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r5) goto L_0x00b5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mOwner
            int r3 = r0.f215mY
            int r0 = r0.getHeight()
            int r4 = r3 + r0
            goto L_0x00bd
        L_0x00b5:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r3 != r5) goto L_0x00bd
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mOwner
            int r4 = r0.f215mY
        L_0x00bd:
            if (r1 == 0) goto L_0x00c7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mBottom
            int r0 = r0.getMargin()
            int r4 = r4 - r0
            goto L_0x00d3
        L_0x00c7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mTop
            int r0 = r0.getMargin()
            int r1 = r7.getHeight()
            int r0 = r0 + r1
            int r4 = r4 + r0
        L_0x00d3:
            int r0 = r7.getHeight()
            int r0 = r4 - r0
            r7.setVerticalDimension(r0, r4)
            r7.mOptimizerMeasured = r2
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup.updateResolvedDimension(androidx.constraintlayout.solver.widgets.ConstraintWidget):void");
    }

    public void addWidgetsToSet(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            this.mWidgetsToSetHorizontal.add(constraintWidget);
        } else if (i == 1) {
            this.mWidgetsToSetVertical.add(constraintWidget);
        }
    }

    public List<ConstraintWidget> getStartWidgets(int i) {
        if (i == 0) {
            return this.mStartHorizontalWidgets;
        }
        if (i == 1) {
            return this.mStartVerticalWidgets;
        }
        return null;
    }

    public Set<ConstraintWidget> getWidgetsToSet(int i) {
        if (i == 0) {
            return this.mWidgetsToSetHorizontal;
        }
        if (i == 1) {
            return this.mWidgetsToSetVertical;
        }
        return null;
    }

    public List<ConstraintWidget> getWidgetsToSolve() {
        if (!this.mWidgetsToSolve.isEmpty()) {
            return this.mWidgetsToSolve;
        }
        int size = this.mConstrainedGroup.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mConstrainedGroup.get(i);
            if (!constraintWidget.mOptimizerMeasurable) {
                getWidgetsToSolveTraversal((ArrayList) this.mWidgetsToSolve, constraintWidget);
            }
        }
        this.mUnresolvedWidgets.clear();
        this.mUnresolvedWidgets.addAll(this.mConstrainedGroup);
        this.mUnresolvedWidgets.removeAll(this.mWidgetsToSolve);
        return this.mWidgetsToSolve;
    }

    public void updateUnresolvedWidgets() {
        int size = this.mUnresolvedWidgets.size();
        for (int i = 0; i < size; i++) {
            updateResolvedDimension(this.mUnresolvedWidgets.get(i));
        }
    }

    public ConstraintWidgetGroup(List<ConstraintWidget> list, boolean z) {
        this.mConstrainedGroup = list;
        this.mSkipSolver = z;
    }
}
