package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;

public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    public static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    public static final int DIMENSION_HORIZONTAL = 0;
    public static final int DIMENSION_VERTICAL = 1;
    public static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    public static final int WRAP = -2;
    public ArrayList<ConstraintAnchor> mAnchors;
    public ConstraintAnchor mBaseline;
    public int mBaselineDistance;
    public ConstraintWidgetGroup mBelongingGroup;
    public ConstraintAnchor mBottom;
    public boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    public ConstraintAnchor mCenterX;
    public ConstraintAnchor mCenterY;
    public float mCircleConstraintAngle;
    public Object mCompanionWidget;
    public int mContainerItemSkip;
    public String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public int mDistToBottom;
    public int mDistToLeft;
    public int mDistToRight;
    public int mDistToTop;
    public int mDrawHeight;
    public int mDrawWidth;
    public int mDrawX;
    public int mDrawY;
    public boolean mGroupsToSolver;
    public int mHeight;
    public float mHorizontalBiasPercent;
    public boolean mHorizontalChainFixedPosition;
    public int mHorizontalChainStyle;
    public ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    public boolean mHorizontalWrapVisited;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    public boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    public ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    public int[] mMaxDimension;
    public int mMinHeight;
    public int mMinWidth;
    public ConstraintWidget[] mNextChainWidget;
    public int mOffsetX;
    public int mOffsetY;
    public boolean mOptimizerMeasurable;
    public boolean mOptimizerMeasured;
    public ConstraintWidget mParent;
    public int mRelX;
    public int mRelY;
    public ResolutionDimension mResolutionHeight;
    public ResolutionDimension mResolutionWidth;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    public boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    public boolean mTopHasCentered;
    public String mType;
    public float mVerticalBiasPercent;
    public boolean mVerticalChainFixedPosition;
    public int mVerticalChainStyle;
    public ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    public boolean mVerticalWrapVisited;
    public int mVisibility;
    public float[] mWeight;
    public int mWidth;
    public int mWrapHeight;
    public int mWrapWidth;

    /* renamed from: mX */
    public int f214mX;

    /* renamed from: mY */
    public int f215mY;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1 */
    public static /* synthetic */ class C04821 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type */
        public static final /* synthetic */ int[] f216x4c44d048;

        /* renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour */
        public static final /* synthetic */ int[] f217xdde91696;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f217xdde91696 = r0
                r1 = 1
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f217xdde91696     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f217xdde91696     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f217xdde91696     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f216x4c44d048 = r4
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f216x4c44d048     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.C04821.<clinit>():void");
        }
    }

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mBelongingGroup = null;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f214mX = 0;
        this.f215mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cc A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyConstraints(androidx.constraintlayout.solver.LinearSystem r24, boolean r25, androidx.constraintlayout.solver.SolverVariable r26, androidx.constraintlayout.solver.SolverVariable r27, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r28, boolean r29, androidx.constraintlayout.solver.widgets.ConstraintAnchor r30, androidx.constraintlayout.solver.widgets.ConstraintAnchor r31, int r32, int r33, int r34, int r35, float r36, boolean r37, boolean r38, int r39, int r40, int r41, float r42, boolean r43) {
        /*
            r23 = this;
            r0 = r23
            r10 = r24
            r11 = r26
            r12 = r27
            r13 = r30
            r14 = r31
            r1 = r34
            r2 = r35
            androidx.constraintlayout.solver.SolverVariable r15 = r10.createObjectVariable(r13)
            androidx.constraintlayout.solver.SolverVariable r9 = r10.createObjectVariable(r14)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r30.getTarget()
            androidx.constraintlayout.solver.SolverVariable r8 = r10.createObjectVariable(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r31.getTarget()
            androidx.constraintlayout.solver.SolverVariable r7 = r10.createObjectVariable(r3)
            boolean r3 = r10.graphOptimizer
            r6 = 1
            r4 = 6
            r5 = 0
            if (r3 == 0) goto L_0x0066
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r3 = r30.getResolutionNode()
            int r3 = r3.state
            if (r3 != r6) goto L_0x0066
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r3 = r31.getResolutionNode()
            int r3 = r3.state
            if (r3 != r6) goto L_0x0066
            androidx.constraintlayout.solver.Metrics r1 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            if (r1 == 0) goto L_0x0050
            androidx.constraintlayout.solver.Metrics r1 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            long r2 = r1.resolvedWidgets
            r6 = 1
            long r2 = r2 + r6
            r1.resolvedWidgets = r2
        L_0x0050:
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r1 = r30.getResolutionNode()
            r1.addResolvedValue(r10)
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r1 = r31.getResolutionNode()
            r1.addResolvedValue(r10)
            if (r38 != 0) goto L_0x0065
            if (r25 == 0) goto L_0x0065
            r10.addGreaterThan(r12, r9, r5, r4)
        L_0x0065:
            return
        L_0x0066:
            androidx.constraintlayout.solver.Metrics r3 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            if (r3 == 0) goto L_0x0078
            androidx.constraintlayout.solver.Metrics r3 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            long r4 = r3.nonresolvedWidgets
            r16 = 1
            long r4 = r4 + r16
            r3.nonresolvedWidgets = r4
        L_0x0078:
            boolean r16 = r30.isConnected()
            boolean r17 = r31.isConnected()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mCenter
            boolean r19 = r3.isConnected()
            if (r16 == 0) goto L_0x008a
            r3 = r6
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r17 == 0) goto L_0x008f
            int r3 = r3 + 1
        L_0x008f:
            if (r19 == 0) goto L_0x0093
            int r3 = r3 + 1
        L_0x0093:
            r5 = r3
            if (r37 == 0) goto L_0x0098
            r3 = 3
            goto L_0x009a
        L_0x0098:
            r3 = r39
        L_0x009a:
            int[] r20 = androidx.constraintlayout.solver.widgets.ConstraintWidget.C04821.f217xdde91696
            int r21 = r28.ordinal()
            r4 = r20[r21]
            r14 = 2
            r13 = 4
            if (r4 == r6) goto L_0x00ad
            if (r4 == r14) goto L_0x00ad
            r14 = 3
            if (r4 == r14) goto L_0x00ad
            if (r4 == r13) goto L_0x00af
        L_0x00ad:
            r4 = 0
            goto L_0x00b3
        L_0x00af:
            if (r3 != r13) goto L_0x00b2
            goto L_0x00ad
        L_0x00b2:
            r4 = r6
        L_0x00b3:
            int r14 = r0.mVisibility
            r13 = 8
            if (r14 != r13) goto L_0x00bc
            r4 = 0
            r13 = 0
            goto L_0x00bf
        L_0x00bc:
            r13 = r4
            r4 = r33
        L_0x00bf:
            if (r43 == 0) goto L_0x00da
            if (r16 != 0) goto L_0x00cd
            if (r17 != 0) goto L_0x00cd
            if (r19 != 0) goto L_0x00cd
            r14 = r32
            r10.addEquality(r15, r14)
            goto L_0x00da
        L_0x00cd:
            if (r16 == 0) goto L_0x00da
            if (r17 != 0) goto L_0x00da
            int r14 = r30.getMargin()
            r6 = 6
            r10.addEquality(r15, r8, r14, r6)
            goto L_0x00db
        L_0x00da:
            r6 = 6
        L_0x00db:
            if (r13 != 0) goto L_0x0107
            if (r29 == 0) goto L_0x00f4
            r6 = 0
            r14 = 3
            r10.addEquality(r9, r15, r6, r14)
            r4 = 6
            if (r1 <= 0) goto L_0x00ea
            r10.addGreaterThan(r9, r15, r1, r4)
        L_0x00ea:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r6) goto L_0x00f2
            r10.addLowerThan(r9, r15, r2, r4)
        L_0x00f2:
            r6 = r4
            goto L_0x00f8
        L_0x00f4:
            r14 = 3
            r10.addEquality(r9, r15, r4, r6)
        L_0x00f8:
            r14 = r40
            r29 = r3
            r0 = r5
            r1 = r7
            r22 = r8
            r21 = r13
            r2 = 2
            r13 = r41
            goto L_0x01e3
        L_0x0107:
            r14 = 3
            r2 = -2
            r14 = r40
            r6 = r41
            if (r14 != r2) goto L_0x0110
            r14 = r4
        L_0x0110:
            if (r6 != r2) goto L_0x0113
            r6 = r4
        L_0x0113:
            r2 = 6
            if (r14 <= 0) goto L_0x011d
            r10.addGreaterThan(r9, r15, r14, r2)
            int r4 = java.lang.Math.max(r4, r14)
        L_0x011d:
            if (r6 <= 0) goto L_0x0126
            r10.addLowerThan(r9, r15, r6, r2)
            int r4 = java.lang.Math.min(r4, r6)
        L_0x0126:
            r2 = 1
            if (r3 != r2) goto L_0x014f
            if (r25 == 0) goto L_0x013b
            r2 = 6
            r10.addEquality(r9, r15, r4, r2)
            r29 = r3
            r0 = r5
            r1 = r7
            r22 = r8
            r33 = r13
            r8 = r4
            r13 = r6
            goto L_0x01c7
        L_0x013b:
            r2 = 6
            if (r38 == 0) goto L_0x0146
            r33 = r13
            r13 = 4
            r10.addEquality(r9, r15, r4, r13)
            goto L_0x01bf
        L_0x0146:
            r33 = r13
            r2 = 1
            r13 = 4
            r10.addEquality(r9, r15, r4, r2)
            goto L_0x01bf
        L_0x014f:
            r33 = r13
            r2 = 2
            r13 = 4
            if (r3 != r2) goto L_0x01bf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = r30.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r2 == r13) goto L_0x0181
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = r30.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r2 != r13) goto L_0x0166
            goto L_0x0181
        L_0x0166:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getAnchor(r13)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.createObjectVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r0.mParent
            r29 = r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r13.getAnchor(r2)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.createObjectVariable(r2)
            goto L_0x019b
        L_0x0181:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getAnchor(r13)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.createObjectVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r0.mParent
            r29 = r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r13.getAnchor(r2)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.createObjectVariable(r2)
        L_0x019b:
            r21 = r29
            r13 = r2
            androidx.constraintlayout.solver.ArrayRow r2 = r24.createRow()
            r18 = 1
            r20 = 6
            r0 = r3
            r3 = r9
            r22 = r8
            r8 = r4
            r4 = r15
            r29 = r0
            r0 = r5
            r5 = r13
            r13 = r6
            r6 = r21
            r1 = r7
            r7 = r42
            androidx.constraintlayout.solver.ArrayRow r2 = r2.createRowDimensionRatio(r3, r4, r5, r6, r7)
            r10.addConstraint(r2)
            r5 = 0
            goto L_0x01c9
        L_0x01bf:
            r29 = r3
            r0 = r5
            r13 = r6
            r1 = r7
            r22 = r8
            r8 = r4
        L_0x01c7:
            r5 = r33
        L_0x01c9:
            r2 = 2
            if (r5 == 0) goto L_0x01e1
            if (r0 == r2) goto L_0x01e1
            if (r37 != 0) goto L_0x01e1
            int r3 = java.lang.Math.max(r14, r8)
            if (r13 <= 0) goto L_0x01da
            int r3 = java.lang.Math.min(r13, r3)
        L_0x01da:
            r4 = 6
            r10.addEquality(r9, r15, r3, r4)
            r21 = 0
            goto L_0x01e3
        L_0x01e1:
            r21 = r5
        L_0x01e3:
            if (r43 == 0) goto L_0x0320
            if (r38 == 0) goto L_0x01e9
            goto L_0x0320
        L_0x01e9:
            r0 = 5
            if (r16 != 0) goto L_0x01fd
            if (r17 != 0) goto L_0x01fd
            if (r19 != 0) goto L_0x01fd
            if (r25 == 0) goto L_0x01f8
            r2 = 0
            r10.addGreaterThan(r12, r9, r2, r0)
            goto L_0x0314
        L_0x01f8:
            r12 = r9
            r0 = 6
            r1 = 0
            goto L_0x0317
        L_0x01fd:
            r2 = 0
            if (r16 == 0) goto L_0x0209
            if (r17 != 0) goto L_0x0209
            if (r25 == 0) goto L_0x0314
            r10.addGreaterThan(r12, r9, r2, r0)
            goto L_0x0314
        L_0x0209:
            if (r16 != 0) goto L_0x021d
            if (r17 == 0) goto L_0x021d
            int r3 = r31.getMargin()
            int r3 = -r3
            r4 = 6
            r10.addEquality(r9, r1, r3, r4)
            if (r25 == 0) goto L_0x0314
            r10.addGreaterThan(r15, r11, r2, r0)
            goto L_0x0314
        L_0x021d:
            if (r16 == 0) goto L_0x0314
            if (r17 == 0) goto L_0x0314
            if (r21 == 0) goto L_0x028d
            r8 = r1
            r7 = 6
            if (r25 == 0) goto L_0x022c
            if (r34 != 0) goto L_0x022c
            r10.addGreaterThan(r9, r15, r2, r7)
        L_0x022c:
            if (r29 != 0) goto L_0x0258
            if (r13 > 0) goto L_0x0236
            if (r14 <= 0) goto L_0x0233
            goto L_0x0236
        L_0x0233:
            r4 = r7
            r6 = 0
            goto L_0x0238
        L_0x0236:
            r4 = 4
            r6 = 1
        L_0x0238:
            int r1 = r30.getMargin()
            r5 = r22
            r10.addEquality(r15, r5, r1, r4)
            int r1 = r31.getMargin()
            int r1 = -r1
            r10.addEquality(r9, r8, r1, r4)
            if (r13 > 0) goto L_0x0250
            if (r14 <= 0) goto L_0x024e
            goto L_0x0250
        L_0x024e:
            r1 = 0
            goto L_0x0251
        L_0x0250:
            r1 = 1
        L_0x0251:
            r16 = r0
            r13 = r6
            r14 = 1
            r6 = r23
            goto L_0x0298
        L_0x0258:
            r4 = r29
            r5 = r22
            r14 = 1
            if (r4 != r14) goto L_0x0266
            r6 = r23
            r16 = r7
        L_0x0263:
            r1 = r14
            r13 = r1
            goto L_0x0298
        L_0x0266:
            r1 = 3
            r6 = r23
            if (r4 != r1) goto L_0x0289
            if (r37 != 0) goto L_0x0276
            int r1 = r6.mResolvedDimensionRatioSide
            r2 = -1
            if (r1 == r2) goto L_0x0276
            if (r13 > 0) goto L_0x0276
            r4 = r7
            goto L_0x0277
        L_0x0276:
            r4 = 4
        L_0x0277:
            int r1 = r30.getMargin()
            r10.addEquality(r15, r5, r1, r4)
            int r1 = r31.getMargin()
            int r1 = -r1
            r10.addEquality(r9, r8, r1, r4)
            r16 = r0
            goto L_0x0263
        L_0x0289:
            r16 = r0
            r1 = 0
            goto L_0x0297
        L_0x028d:
            r6 = r23
            r8 = r1
            r5 = r22
            r7 = 6
            r14 = 1
            r16 = r0
            r1 = r14
        L_0x0297:
            r13 = 0
        L_0x0298:
            if (r1 == 0) goto L_0x02e0
            int r4 = r30.getMargin()
            int r17 = r31.getMargin()
            r1 = r24
            r2 = r15
            r3 = r5
            r18 = r5
            r5 = r36
            r6 = r8
            r19 = r7
            r7 = r9
            r14 = r8
            r0 = r18
            r12 = r19
            r8 = r17
            r12 = r9
            r9 = r16
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r30
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mOwner
            boolean r2 = r2 instanceof androidx.constraintlayout.solver.widgets.Barrier
            r3 = r31
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.mOwner
            boolean r4 = r4 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r2 == 0) goto L_0x02d6
            if (r4 != 0) goto L_0x02d6
            r6 = r25
            r2 = 6
            r4 = 5
            r18 = 1
            goto L_0x02ed
        L_0x02d6:
            if (r2 != 0) goto L_0x02e7
            if (r4 == 0) goto L_0x02e7
            r18 = r25
            r2 = 5
            r4 = 6
            r6 = 1
            goto L_0x02ed
        L_0x02e0:
            r1 = r30
            r3 = r31
            r0 = r5
            r14 = r8
            r12 = r9
        L_0x02e7:
            r6 = r25
            r18 = r6
            r2 = 5
            r4 = 5
        L_0x02ed:
            if (r13 == 0) goto L_0x02f1
            r2 = 6
            r4 = 6
        L_0x02f1:
            if (r21 != 0) goto L_0x02f5
            if (r6 != 0) goto L_0x02f7
        L_0x02f5:
            if (r13 == 0) goto L_0x02fe
        L_0x02f7:
            int r1 = r30.getMargin()
            r10.addGreaterThan(r15, r0, r1, r4)
        L_0x02fe:
            if (r21 != 0) goto L_0x0302
            if (r18 != 0) goto L_0x0304
        L_0x0302:
            if (r13 == 0) goto L_0x030c
        L_0x0304:
            int r0 = r31.getMargin()
            int r0 = -r0
            r10.addLowerThan(r12, r14, r0, r2)
        L_0x030c:
            r0 = 6
            r1 = 0
            if (r25 == 0) goto L_0x0317
            r10.addGreaterThan(r15, r11, r1, r0)
            goto L_0x0317
        L_0x0314:
            r1 = r2
            r12 = r9
            r0 = 6
        L_0x0317:
            if (r25 == 0) goto L_0x031f
            r2 = r27
            r3 = r0
            r10.addGreaterThan(r2, r12, r1, r3)
        L_0x031f:
            return
        L_0x0320:
            r4 = r2
            r2 = r12
            r1 = 0
            r3 = 6
            r12 = r9
            if (r0 >= r4) goto L_0x032f
            if (r25 == 0) goto L_0x032f
            r10.addGreaterThan(r15, r11, r1, r3)
            r10.addGreaterThan(r2, r12, r1, r3)
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.applyConstraints(androidx.constraintlayout.solver.LinearSystem, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        if (!(constraintAnchorArr[i2].mTarget == null || constraintAnchorArr[i2].mTarget.mTarget == constraintAnchorArr[i2])) {
            int i3 = i2 + 1;
            return constraintAnchorArr[i3].mTarget != null && constraintAnchorArr[i3].mTarget.mTarget == constraintAnchorArr[i3];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x024c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem r39) {
        /*
            r38 = this;
            r15 = r38
            r14 = r39
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mLeft
            androidx.constraintlayout.solver.SolverVariable r21 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mRight
            androidx.constraintlayout.solver.SolverVariable r10 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mTop
            androidx.constraintlayout.solver.SolverVariable r6 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.solver.SolverVariable r4 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.solver.SolverVariable r3 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00b0
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r5) goto L_0x0036
            r0 = r2
            goto L_0x0037
        L_0x0036:
            r0 = r13
        L_0x0037:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r15.mParent
            if (r5 == 0) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r5.mListDimensionBehaviors
            r5 = r5[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r7) goto L_0x0045
            r5 = r2
            goto L_0x0046
        L_0x0045:
            r5 = r13
        L_0x0046:
            boolean r7 = r15.isChainHead(r13)
            if (r7 == 0) goto L_0x0055
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r7
            r7.addChain(r15, r13)
            r7 = r2
            goto L_0x0059
        L_0x0055:
            boolean r7 = r38.isInHorizontalChain()
        L_0x0059:
            boolean r8 = r15.isChainHead(r2)
            if (r8 == 0) goto L_0x0068
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r8
            r8.addChain(r15, r2)
            r8 = r2
            goto L_0x006c
        L_0x0068:
            boolean r8 = r38.isInVerticalChain()
        L_0x006c:
            if (r0 == 0) goto L_0x0089
            int r9 = r15.mVisibility
            if (r9 == r1) goto L_0x0089
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x0089
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x0089
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mRight
            androidx.constraintlayout.solver.SolverVariable r9 = r14.createObjectVariable(r9)
            r14.addGreaterThan(r9, r10, r13, r2)
        L_0x0089:
            if (r5 == 0) goto L_0x00aa
            int r9 = r15.mVisibility
            if (r9 == r1) goto L_0x00aa
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x00aa
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x00aa
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.mBaseline
            if (r9 != 0) goto L_0x00aa
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mBottom
            androidx.constraintlayout.solver.SolverVariable r9 = r14.createObjectVariable(r9)
            r14.addGreaterThan(r9, r4, r13, r2)
        L_0x00aa:
            r12 = r5
            r16 = r7
            r22 = r8
            goto L_0x00b6
        L_0x00b0:
            r0 = r13
            r12 = r0
            r16 = r12
            r22 = r16
        L_0x00b6:
            int r5 = r15.mWidth
            int r7 = r15.mMinWidth
            if (r5 >= r7) goto L_0x00bd
            r5 = r7
        L_0x00bd:
            int r7 = r15.mHeight
            int r8 = r15.mMinHeight
            if (r7 >= r8) goto L_0x00c4
            r7 = r8
        L_0x00c4:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.mListDimensionBehaviors
            r8 = r8[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x00ce
            r8 = r2
            goto L_0x00cf
        L_0x00ce:
            r8 = r13
        L_0x00cf:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r15.mListDimensionBehaviors
            r9 = r9[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 == r11) goto L_0x00d9
            r9 = r2
            goto L_0x00da
        L_0x00d9:
            r9 = r13
        L_0x00da:
            int r11 = r15.mDimensionRatioSide
            r15.mResolvedDimensionRatioSide = r11
            float r11 = r15.mDimensionRatio
            r15.mResolvedDimensionRatio = r11
            int r2 = r15.mMatchConstraintDefaultWidth
            int r13 = r15.mMatchConstraintDefaultHeight
            r18 = 0
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            r18 = 4
            if (r11 <= 0) goto L_0x018f
            int r11 = r15.mVisibility
            r1 = 8
            if (r11 == r1) goto L_0x018f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.mListDimensionBehaviors
            r11 = 0
            r1 = r1[r11]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r24 = r3
            if (r1 != r11) goto L_0x0102
            if (r2 != 0) goto L_0x0102
            r2 = 3
        L_0x0102:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.mListDimensionBehaviors
            r11 = 1
            r1 = r1[r11]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r11) goto L_0x010e
            if (r13 != 0) goto L_0x010e
            r13 = 3
        L_0x010e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.mListDimensionBehaviors
            r11 = 0
            r3 = r1[r11]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r11) goto L_0x0125
            r3 = 1
            r1 = r1[r3]
            if (r1 != r11) goto L_0x0125
            r1 = 3
            if (r2 != r1) goto L_0x0126
            if (r13 != r1) goto L_0x0126
            r15.setupDimensionRatio(r0, r12, r8, r9)
            goto L_0x0184
        L_0x0125:
            r1 = 3
        L_0x0126:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.mListDimensionBehaviors
            r8 = 0
            r9 = r3[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x0151
            if (r2 != r1) goto L_0x0151
            r15.mResolvedDimensionRatioSide = r8
            float r1 = r15.mResolvedDimensionRatio
            int r5 = r15.mHeight
            float r5 = (float) r5
            float r1 = r1 * r5
            int r1 = (int) r1
            r8 = 1
            r3 = r3[r8]
            r25 = r1
            if (r3 == r11) goto L_0x0148
            r26 = r7
            r29 = r13
            r28 = r18
            goto L_0x0199
        L_0x0148:
            r28 = r2
            r26 = r7
            r27 = r8
            r29 = r13
            goto L_0x019b
        L_0x0151:
            r8 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.mListDimensionBehaviors
            r1 = r1[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x0184
            r1 = 3
            if (r13 != r1) goto L_0x0184
            r15.mResolvedDimensionRatioSide = r8
            int r1 = r15.mDimensionRatioSide
            r3 = -1
            if (r1 != r3) goto L_0x016b
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r15.mResolvedDimensionRatio
            float r1 = r1 / r3
            r15.mResolvedDimensionRatio = r1
        L_0x016b:
            float r1 = r15.mResolvedDimensionRatio
            int r3 = r15.mWidth
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.mListDimensionBehaviors
            r7 = 0
            r3 = r3[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r26 = r1
            r28 = r2
            r25 = r5
            if (r3 == r7) goto L_0x018a
            r29 = r18
            goto L_0x0199
        L_0x0184:
            r28 = r2
            r25 = r5
            r26 = r7
        L_0x018a:
            r29 = r13
            r27 = 1
            goto L_0x019b
        L_0x018f:
            r24 = r3
            r28 = r2
            r25 = r5
            r26 = r7
            r29 = r13
        L_0x0199:
            r27 = 0
        L_0x019b:
            int[] r1 = r15.mResolvedMatchConstraintDefault
            r2 = 0
            r1[r2] = r28
            r2 = 1
            r1[r2] = r29
            if (r27 == 0) goto L_0x01af
            int r1 = r15.mResolvedDimensionRatioSide
            r2 = -1
            if (r1 == 0) goto L_0x01ac
            if (r1 != r2) goto L_0x01b0
        L_0x01ac:
            r23 = 1
            goto L_0x01b2
        L_0x01af:
            r2 = -1
        L_0x01b0:
            r23 = 0
        L_0x01b2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.mListDimensionBehaviors
            r3 = 0
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r3) goto L_0x01c2
            boolean r1 = r15 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L_0x01c2
            r30 = 1
            goto L_0x01c4
        L_0x01c2:
            r30 = 0
        L_0x01c4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mCenter
            boolean r1 = r1.isConnected()
            r3 = 1
            r31 = r1 ^ 1
            int r1 = r15.mHorizontalResolution
            r13 = 2
            r32 = 0
            if (r1 == r13) goto L_0x023b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r15.mParent
            if (r1 == 0) goto L_0x01e1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mRight
            androidx.constraintlayout.solver.SolverVariable r1 = r14.createObjectVariable(r1)
            r20 = r1
            goto L_0x01e3
        L_0x01e1:
            r20 = r32
        L_0x01e3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r15.mParent
            if (r1 == 0) goto L_0x01f0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mLeft
            androidx.constraintlayout.solver.SolverVariable r1 = r14.createObjectVariable(r1)
            r33 = r1
            goto L_0x01f2
        L_0x01f0:
            r33 = r32
        L_0x01f2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.mListDimensionBehaviors
            r17 = 0
            r5 = r1[r17]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.mRight
            int r9 = r15.f214mX
            int r11 = r15.mMinWidth
            int[] r1 = r15.mMaxDimension
            r1 = r1[r17]
            r34 = r12
            r12 = r1
            float r1 = r15.mHorizontalBiasPercent
            r13 = r1
            int r1 = r15.mMatchConstraintMinWidth
            r17 = r1
            int r1 = r15.mMatchConstraintMaxWidth
            r18 = r1
            float r1 = r15.mMatchConstraintPercentWidth
            r19 = r1
            r35 = r0
            r0 = r38
            r1 = r39
            r3 = r2
            r2 = r35
            r36 = r24
            r3 = r33
            r24 = r4
            r4 = r20
            r37 = r6
            r6 = r30
            r30 = r10
            r10 = r25
            r14 = r23
            r15 = r16
            r16 = r28
            r20 = r31
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0245
        L_0x023b:
            r37 = r6
            r30 = r10
            r34 = r12
            r36 = r24
            r24 = r4
        L_0x0245:
            r15 = r38
            int r0 = r15.mVerticalResolution
            r1 = 2
            if (r0 != r1) goto L_0x024d
            return
        L_0x024d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r14 = 1
            r0 = r0[r14]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r1) goto L_0x025c
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x025c
            r6 = r14
            goto L_0x025d
        L_0x025c:
            r6 = 0
        L_0x025d:
            if (r27 == 0) goto L_0x0269
            int r0 = r15.mResolvedDimensionRatioSide
            if (r0 == r14) goto L_0x0266
            r1 = -1
            if (r0 != r1) goto L_0x0269
        L_0x0266:
            r16 = r14
            goto L_0x026b
        L_0x0269:
            r16 = 0
        L_0x026b:
            int r0 = r15.mBaselineDistance
            if (r0 <= 0) goto L_0x02a4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r0 = r0.getResolutionNode()
            int r0 = r0.state
            if (r0 != r14) goto L_0x0285
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r0 = r0.getResolutionNode()
            r10 = r39
            r0.addResolvedValue(r10)
            goto L_0x02a6
        L_0x0285:
            r10 = r39
            int r0 = r38.getBaselineDistance()
            r1 = 6
            r2 = r36
            r4 = r37
            r10.addEquality(r2, r4, r0, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x02a8
            androidx.constraintlayout.solver.SolverVariable r0 = r10.createObjectVariable(r0)
            r3 = 0
            r10.addEquality(r2, r0, r3, r1)
            r20 = r3
            goto L_0x02aa
        L_0x02a4:
            r10 = r39
        L_0x02a6:
            r4 = r37
        L_0x02a8:
            r20 = r31
        L_0x02aa:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x02b7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.solver.SolverVariable r0 = r10.createObjectVariable(r0)
            r23 = r0
            goto L_0x02b9
        L_0x02b7:
            r23 = r32
        L_0x02b9:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x02c5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.solver.SolverVariable r0 = r10.createObjectVariable(r0)
            r3 = r0
            goto L_0x02c7
        L_0x02c5:
            r3 = r32
        L_0x02c7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r5 = r0[r14]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.mBottom
            int r9 = r15.f215mY
            int r11 = r15.mMinHeight
            int[] r0 = r15.mMaxDimension
            r12 = r0[r14]
            float r13 = r15.mVerticalBiasPercent
            int r0 = r15.mMatchConstraintMinHeight
            r17 = r0
            int r0 = r15.mMatchConstraintMaxHeight
            r18 = r0
            float r0 = r15.mMatchConstraintPercentHeight
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r34
            r25 = r4
            r4 = r23
            r10 = r26
            r14 = r16
            r15 = r22
            r16 = r29
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r27 == 0) goto L_0x0325
            r6 = 6
            r7 = r38
            int r0 = r7.mResolvedDimensionRatioSide
            r1 = 1
            if (r0 != r1) goto L_0x0314
            float r5 = r7.mResolvedDimensionRatio
            r0 = r39
            r1 = r24
            r2 = r25
            r3 = r30
            r4 = r21
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L_0x0327
        L_0x0314:
            float r5 = r7.mResolvedDimensionRatio
            r6 = 6
            r0 = r39
            r1 = r30
            r2 = r21
            r3 = r24
            r4 = r25
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L_0x0327
        L_0x0325:
            r7 = r38
        L_0x0327:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mCenter
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x034f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mCenter
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getOwner()
            float r1 = r7.mCircleConstraintAngle
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r7.mCenter
            int r2 = r2.getMargin()
            r3 = r39
            r3.addCenterPoint(r7, r0, r1, r2)
        L_0x034f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.addToSolver(androidx.constraintlayout.solver.LinearSystem):void");
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void analyze(int i) {
        Optimizer.analyze(i, this);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2) {
        connect(constraintAnchor, constraintAnchor2, i, ConstraintAnchor.Strength.STRONG, i2);
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public void connectedTo(ConstraintWidget constraintWidget) {
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public void disconnectUnlockedWidget(ConstraintWidget constraintWidget) {
        ArrayList<ConstraintAnchor> anchors = getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = anchors.get(i);
            if (constraintAnchor.isConnected() && constraintAnchor.getTarget().getOwner() == constraintWidget && constraintAnchor.getConnectionCreator() == 2) {
                constraintAnchor.reset();
            }
        }
    }

    public void disconnectWidget(ConstraintWidget constraintWidget) {
        ArrayList<ConstraintAnchor> anchors = getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = anchors.get(i);
            if (constraintAnchor.isConnected() && constraintAnchor.getTarget().getOwner() == constraintWidget) {
                constraintAnchor.reset();
            }
        }
    }

    public void forceUpdateDrawPosition() {
        int i = this.f214mX;
        int i2 = this.f215mY;
        this.mDrawX = i;
        this.mDrawY = i2;
        this.mDrawWidth = (this.mWidth + i) - i;
        this.mDrawHeight = (this.mHeight + i2) - i2;
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (C04821.f216x4c44d048[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public int getDrawBottom() {
        return getDrawY() + this.mDrawHeight;
    }

    public int getDrawHeight() {
        return this.mDrawHeight;
    }

    public int getDrawRight() {
        return getDrawX() + this.mDrawWidth;
    }

    public int getDrawWidth() {
        return this.mDrawWidth;
    }

    public int getDrawX() {
        return this.mDrawX + this.mOffsetX;
    }

    public int getDrawY() {
        return this.mDrawY + this.mOffsetY;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor2;
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget2 = this;
        ConstraintWidget constraintWidget3 = null;
        while (constraintWidget3 == null && constraintWidget2 != null) {
            ConstraintAnchor anchor = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT);
            if (anchor == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = anchor.getTarget();
            }
            if (constraintAnchor == null) {
                constraintWidget = null;
            } else {
                constraintWidget = constraintAnchor.getOwner();
            }
            if (constraintWidget == getParent()) {
                return constraintWidget2;
            }
            if (constraintWidget == null) {
                constraintAnchor2 = null;
            } else {
                constraintAnchor2 = constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            }
            if (constraintAnchor2 == null || constraintAnchor2.getOwner() == constraintWidget2) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget3 = constraintWidget2;
            }
        }
        return constraintWidget3;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getInternalDrawBottom() {
        return this.mDrawY + this.mDrawHeight;
    }

    public int getInternalDrawRight() {
        return this.mDrawX + this.mDrawWidth;
    }

    public int getInternalDrawX() {
        return this.mDrawX;
    }

    public int getInternalDrawY() {
        return this.mDrawY;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizerWrapHeight() {
        int i;
        int i2 = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i = Math.max(this.mMatchConstraintMinHeight, i2);
        } else {
            i = this.mMatchConstraintMinHeight;
            if (i > 0) {
                this.mHeight = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxHeight;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    public int getOptimizerWrapWidth() {
        int i;
        int i2 = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i = Math.max(this.mMatchConstraintMinWidth, i2);
        } else {
            i = this.mMatchConstraintMinWidth;
            if (i > 0) {
                this.mWidth = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxWidth;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public ResolutionDimension getResolutionHeight() {
        if (this.mResolutionHeight == null) {
            this.mResolutionHeight = new ResolutionDimension();
        }
        return this.mResolutionHeight;
    }

    public ResolutionDimension getResolutionWidth() {
        if (this.mResolutionWidth == null) {
            this.mResolutionWidth = new ResolutionDimension();
        }
        return this.mResolutionWidth;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public WidgetContainer getRootWidgetContainer() {
        ConstraintWidget constraintWidget = this;
        while (constraintWidget.getParent() != null) {
            constraintWidget = constraintWidget.getParent();
        }
        if (constraintWidget instanceof WidgetContainer) {
            return (WidgetContainer) constraintWidget;
        }
        return null;
    }

    public int getRootX() {
        return this.f214mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.f215mY + this.mOffsetY;
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor2;
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget2 = this;
        ConstraintWidget constraintWidget3 = null;
        while (constraintWidget3 == null && constraintWidget2 != null) {
            ConstraintAnchor anchor = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP);
            if (anchor == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = anchor.getTarget();
            }
            if (constraintAnchor == null) {
                constraintWidget = null;
            } else {
                constraintWidget = constraintAnchor.getOwner();
            }
            if (constraintWidget == getParent()) {
                return constraintWidget2;
            }
            if (constraintWidget == null) {
                constraintAnchor2 = null;
            } else {
                constraintAnchor2 = constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            }
            if (constraintAnchor2 == null || constraintAnchor2.getOwner() == constraintWidget2) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget3 = constraintWidget2;
            }
        }
        return constraintWidget3;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getWrapHeight() {
        return this.mWrapHeight;
    }

    public int getWrapWidth() {
        return this.mWrapWidth;
    }

    public int getX() {
        return this.f214mX;
    }

    public int getY() {
        return this.f215mY;
    }

    public boolean hasAncestor(ConstraintWidget constraintWidget) {
        ConstraintWidget parent = getParent();
        if (parent == constraintWidget) {
            return true;
        }
        if (parent == constraintWidget.getParent()) {
            return false;
        }
        while (parent != null) {
            if (parent == constraintWidget || parent == constraintWidget.getParent()) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public boolean hasBaseline() {
        return this.mBaselineDistance > 0;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, ConstraintAnchor.Strength.STRONG, 0, true);
    }

    public boolean isFullyResolved() {
        if (this.mLeft.getResolutionNode().state == 1 && this.mRight.getResolutionNode().state == 1 && this.mTop.getResolutionNode().state == 1 && this.mBottom.getResolutionNode().state == 1) {
            return true;
        }
        return false;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInsideConstraintLayout() {
        ConstraintWidget parent = getParent();
        if (parent == null) {
            return false;
        }
        while (parent != null) {
            if (parent instanceof ConstraintWidgetContainer) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.mParent;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isRootContainer() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x000e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mParent
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.isRootContainer():boolean");
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f214mX = 0;
        this.f215mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mWrapWidth = 0;
        this.mWrapHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        ResolutionDimension resolutionDimension = this.mResolutionWidth;
        if (resolutionDimension != null) {
            resolutionDimension.reset();
        }
        ResolutionDimension resolutionDimension2 = this.mResolutionHeight;
        if (resolutionDimension2 != null) {
            resolutionDimension2.reset();
        }
        this.mBelongingGroup = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
        if (!(this instanceof ConstraintWidgetContainer)) {
            if (getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                if (getWidth() == getWrapWidth()) {
                    setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                } else if (getWidth() > getMinWidth()) {
                    setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                }
            }
            if (getVerticalDimensionBehaviour() != DimensionBehaviour.MATCH_CONSTRAINT) {
                return;
            }
            if (getHeight() == getWrapHeight()) {
                setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
            } else if (getHeight() > getMinHeight()) {
                setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
            }
        }
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() == null || !(getParent() instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
            ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
            if (constraintAnchor == anchor5) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor.reset();
                    anchor2.reset();
                }
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor6) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                    anchor.reset();
                    anchor2.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor7) {
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
                if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor5.reset();
                }
            } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor5.reset();
            }
            constraintAnchor.reset();
        }
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i = 0; i < size; i++) {
                this.mAnchors.get(i).reset();
            }
        }
    }

    public void resetResolutionNodes() {
        for (int i = 0; i < 6; i++) {
            this.mListAnchors[i].getResolutionNode().reset();
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    public void resolve() {
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        if (this.mBaselineDistance > 0) {
            SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
            createObjectVariable5.setName(str + ".baseline");
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDimensionRatio(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = r4
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = r5
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = r0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.mDimensionRatio = r9
            r8.mDimensionRatioSide = r1
        L_0x008d:
            return
        L_0x008e:
            r8.mDimensionRatio = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.setDimensionRatio(java.lang.String):void");
    }

    public void setDrawHeight(int i) {
        this.mDrawHeight = i;
    }

    public void setDrawOrigin(int i, int i2) {
        int i3 = i - this.mOffsetX;
        this.mDrawX = i3;
        int i4 = i2 - this.mOffsetY;
        this.mDrawY = i4;
        this.f214mX = i3;
        this.f215mY = i4;
    }

    public void setDrawWidth(int i) {
        this.mDrawWidth = i;
    }

    public void setDrawX(int i) {
        int i2 = i - this.mOffsetX;
        this.mDrawX = i2;
        this.f214mX = i2;
    }

    public void setDrawY(int i) {
        int i2 = i - this.mOffsetY;
        this.mDrawY = i2;
        this.f215mY = i2;
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f214mX = i;
        this.f215mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mWidth;
        int i11 = this.mMinWidth;
        if (i10 < i11) {
            this.mWidth = i11;
        }
        this.mOptimizerMeasured = true;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = C04821.f216x4c44d048[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
        } else if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else if (i2 == 4) {
            this.mBottom.mGoneMargin = i;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.f214mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            setWidth(this.mWrapWidth);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.f214mX = i;
        this.f215mY = i2;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalDimension(int i, int i2) {
        this.f215mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            setHeight(this.mWrapHeight);
        }
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setWrapHeight(int i) {
        this.mWrapHeight = i;
    }

    public void setWrapWidth(int i) {
        this.mWrapWidth = i;
    }

    public void setX(int i) {
        this.f214mX = i;
    }

    public void setY(int i) {
        this.f215mY = i;
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z && !z2) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z && z2) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            if (this.mMatchConstraintMinWidth > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMinHeight > 0) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1 && z && z2) {
            this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f214mX);
        sb.append(", ");
        sb.append(this.f215mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(") wrap: (");
        sb.append(this.mWrapWidth);
        sb.append(" x ");
        sb.append(this.mWrapHeight);
        sb.append(")");
        return sb.toString();
    }

    public void updateDrawPosition() {
        int i = this.f214mX;
        int i2 = this.f215mY;
        this.mDrawX = i;
        this.mDrawY = i2;
        this.mDrawWidth = (this.mWidth + i) - i;
        this.mDrawHeight = (this.mHeight + i2) - i2;
    }

    public void updateFromSolver(LinearSystem linearSystem) {
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue4 = 0;
            objectVariableValue = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void updateResolutionNodes() {
        for (int i = 0; i < 6; i++) {
            this.mListAnchors[i].getResolutionNode().update();
        }
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        connect(constraintAnchor, constraintAnchor2, i, ConstraintAnchor.Strength.STRONG, 0);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, ConstraintAnchor.Strength strength, int i2) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i, strength, i2);
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        connect(type, constraintWidget, type2, i, ConstraintAnchor.Strength.STRONG);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0, ConstraintAnchor.Strength.STRONG);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, ConstraintAnchor.Strength strength) {
        connect(type, constraintWidget, type2, i, strength, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, ConstraintAnchor.Strength strength, int i2) {
        boolean z;
        ConstraintAnchor.Type type3 = type;
        ConstraintWidget constraintWidget2 = constraintWidget;
        ConstraintAnchor.Type type4 = type2;
        int i3 = i2;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        int i4 = 0;
        if (type3 == type5) {
            if (type4 == type5) {
                ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                    ConstraintWidget constraintWidget3 = constraintWidget;
                    ConstraintAnchor.Strength strength2 = strength;
                    int i5 = i2;
                    connect(type6, constraintWidget3, type6, 0, strength2, i5);
                    ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                    connect(type7, constraintWidget3, type7, 0, strength2, i5);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                    ConstraintWidget constraintWidget4 = constraintWidget;
                    ConstraintAnchor.Strength strength3 = strength;
                    int i6 = i2;
                    connect(type8, constraintWidget4, type8, 0, strength3, i6);
                    ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                    connect(type9, constraintWidget4, type9, 0, strength3, i6);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.CENTER), 0, i3);
                } else if (z) {
                    getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.CENTER_X), 0, i3);
                } else if (z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0, i3);
                }
            } else if (type4 == ConstraintAnchor.Type.LEFT || type4 == ConstraintAnchor.Type.RIGHT) {
                ConstraintWidget constraintWidget5 = constraintWidget;
                ConstraintAnchor.Type type10 = type2;
                ConstraintAnchor.Strength strength4 = strength;
                int i7 = i2;
                connect(ConstraintAnchor.Type.LEFT, constraintWidget5, type10, 0, strength4, i7);
                connect(ConstraintAnchor.Type.RIGHT, constraintWidget5, type10, 0, strength4, i7);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0, i3);
            } else if (type4 == ConstraintAnchor.Type.TOP || type4 == ConstraintAnchor.Type.BOTTOM) {
                ConstraintWidget constraintWidget6 = constraintWidget;
                ConstraintAnchor.Type type11 = type2;
                ConstraintAnchor.Strength strength5 = strength;
                int i8 = i2;
                connect(ConstraintAnchor.Type.TOP, constraintWidget6, type11, 0, strength5, i8);
                connect(ConstraintAnchor.Type.BOTTOM, constraintWidget6, type11, 0, strength5, i8);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0, i3);
            }
        } else if (type3 == ConstraintAnchor.Type.CENTER_X && (type4 == ConstraintAnchor.Type.LEFT || type4 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0, i3);
            anchor7.connect(anchor6, 0, i3);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0, i3);
        } else if (type3 == ConstraintAnchor.Type.CENTER_Y && (type4 == ConstraintAnchor.Type.TOP || type4 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(ConstraintAnchor.Type.TOP).connect(anchor8, 0, i3);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0, i3);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0, i3);
        } else {
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
            if (type3 == type12 && type4 == type12) {
                getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT), 0, i3);
                getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT), 0, i3);
                getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0, i3);
                return;
            }
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
            if (type3 == type13 && type4 == type13) {
                getAnchor(ConstraintAnchor.Type.TOP).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP), 0, i3);
                getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM), 0, i3);
                getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0, i3);
                return;
            }
            ConstraintAnchor anchor9 = getAnchor(type);
            ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
            if (anchor9.isValidConnection(anchor10)) {
                if (type3 == ConstraintAnchor.Type.BASELINE) {
                    ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                    if (anchor11 != null) {
                        anchor11.reset();
                    }
                    if (anchor12 != null) {
                        anchor12.reset();
                    }
                } else {
                    if (type3 == ConstraintAnchor.Type.TOP || type3 == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor anchor13 = getAnchor(ConstraintAnchor.Type.BASELINE);
                        if (anchor13 != null) {
                            anchor13.reset();
                        }
                        ConstraintAnchor anchor14 = getAnchor(ConstraintAnchor.Type.CENTER);
                        if (anchor14.getTarget() != anchor10) {
                            anchor14.reset();
                        }
                        ConstraintAnchor opposite = getAnchor(type).getOpposite();
                        ConstraintAnchor anchor15 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
                        if (anchor15.isConnected()) {
                            opposite.reset();
                            anchor15.reset();
                        }
                    } else if (type3 == ConstraintAnchor.Type.LEFT || type3 == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor anchor16 = getAnchor(ConstraintAnchor.Type.CENTER);
                        if (anchor16.getTarget() != anchor10) {
                            anchor16.reset();
                        }
                        ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                        ConstraintAnchor anchor17 = getAnchor(ConstraintAnchor.Type.CENTER_X);
                        if (anchor17.isConnected()) {
                            opposite2.reset();
                            anchor17.reset();
                        }
                    }
                    i4 = i;
                }
                anchor9.connect(anchor10, i4, strength, i3);
                anchor10.getOwner().connectedTo(anchor9.getOwner());
            }
        }
    }

    public void resetAnchors(int i) {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintAnchor constraintAnchor = this.mAnchors.get(i2);
                if (i == constraintAnchor.getConnectionCreator()) {
                    if (constraintAnchor.isVerticalAnchor()) {
                        setVerticalBiasPercent(DEFAULT_BIAS);
                    } else {
                        setHorizontalBiasPercent(DEFAULT_BIAS);
                    }
                    constraintAnchor.reset();
                }
            }
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
        this.mOptimizerMeasured = true;
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mBelongingGroup = null;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f214mX = 0;
        this.f215mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.f214mX = i;
        this.f215mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
        forceUpdateDrawPosition();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }
}
