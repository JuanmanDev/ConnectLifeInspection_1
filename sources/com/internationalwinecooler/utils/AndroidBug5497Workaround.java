package com.internationalwinecooler.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import com.juconnect.vivino.global.UrlConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p482v.p493b.C7643a;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/internationalwinecooler/utils/AndroidBug5497Workaround;", "", "()V", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AndroidBug5497Workaround.kt */
public final class AndroidBug5497Workaround {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static Activity activity;
    public static int contentHeight;
    public static FrameLayout.LayoutParams frameLayoutParams;
    public static boolean isfirst = true;
    public static View mChildOfContent;
    public static int statusBarHeight;
    public static int usableHeightPrevious;

    @Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo47991d2 = {"Lcom/internationalwinecooler/utils/AndroidBug5497Workaround$Companion;", "", "()V", "activity", "Landroid/app/Activity;", "contentHeight", "", "frameLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "isfirst", "", "mChildOfContent", "Landroid/view/View;", "statusBarHeight", "usableHeightPrevious", "AndroidBug5497Workaround", "", "assistActivity", "computeUsableHeight", "possiblyResizeChildOfContent", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: AndroidBug5497Workaround.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void AndroidBug5497Workaround(Activity activity) {
            AndroidBug5497Workaround.statusBarHeight = activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", UrlConstKt.APP_PLATFORM));
            AndroidBug5497Workaround.activity = activity;
            View findViewById = activity.findViewById(16908290);
            if (findViewById != null) {
                View childAt = ((FrameLayout) findViewById).getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt, "content.getChildAt(0)");
                AndroidBug5497Workaround.mChildOfContent = childAt;
                View access$getMChildOfContent$cp = AndroidBug5497Workaround.mChildOfContent;
                View view = null;
                if (access$getMChildOfContent$cp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChildOfContent");
                    access$getMChildOfContent$cp = null;
                }
                access$getMChildOfContent$cp.getViewTreeObserver().addOnGlobalLayoutListener(C7643a.f14377e);
                View access$getMChildOfContent$cp2 = AndroidBug5497Workaround.mChildOfContent;
                if (access$getMChildOfContent$cp2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChildOfContent");
                } else {
                    view = access$getMChildOfContent$cp2;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    AndroidBug5497Workaround.frameLayoutParams = (FrameLayout.LayoutParams) layoutParams;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }

        /* renamed from: AndroidBug5497Workaround$lambda-0  reason: not valid java name */
        public static final void m27225AndroidBug5497Workaround$lambda0() {
            if (AndroidBug5497Workaround.isfirst) {
                Companion companion = AndroidBug5497Workaround.Companion;
                View access$getMChildOfContent$cp = AndroidBug5497Workaround.mChildOfContent;
                if (access$getMChildOfContent$cp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChildOfContent");
                    access$getMChildOfContent$cp = null;
                }
                AndroidBug5497Workaround.contentHeight = access$getMChildOfContent$cp.getHeight();
                Companion companion2 = AndroidBug5497Workaround.Companion;
                AndroidBug5497Workaround.isfirst = false;
            }
            AndroidBug5497Workaround.Companion.possiblyResizeChildOfContent();
        }

        private final int computeUsableHeight() {
            Rect rect = new Rect();
            View access$getMChildOfContent$cp = AndroidBug5497Workaround.mChildOfContent;
            if (access$getMChildOfContent$cp == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChildOfContent");
                access$getMChildOfContent$cp = null;
            }
            access$getMChildOfContent$cp.getWindowVisibleDisplayFrame(rect);
            return rect.bottom - rect.top;
        }

        private final void possiblyResizeChildOfContent() {
            int computeUsableHeight = computeUsableHeight();
            if (computeUsableHeight != AndroidBug5497Workaround.usableHeightPrevious) {
                View access$getMChildOfContent$cp = AndroidBug5497Workaround.mChildOfContent;
                View view = null;
                if (access$getMChildOfContent$cp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChildOfContent");
                    access$getMChildOfContent$cp = null;
                }
                int height = access$getMChildOfContent$cp.getRootView().getHeight();
                int i = height - computeUsableHeight;
                if (i <= height / 4) {
                    FrameLayout.LayoutParams access$getFrameLayoutParams$cp = AndroidBug5497Workaround.frameLayoutParams;
                    if (access$getFrameLayoutParams$cp == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("frameLayoutParams");
                        access$getFrameLayoutParams$cp = null;
                    }
                    access$getFrameLayoutParams$cp.height = AndroidBug5497Workaround.contentHeight;
                } else if (Build.VERSION.SDK_INT >= 19) {
                    FrameLayout.LayoutParams access$getFrameLayoutParams$cp2 = AndroidBug5497Workaround.frameLayoutParams;
                    if (access$getFrameLayoutParams$cp2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("frameLayoutParams");
                        access$getFrameLayoutParams$cp2 = null;
                    }
                    access$getFrameLayoutParams$cp2.height = (height - i) + AndroidBug5497Workaround.statusBarHeight;
                } else {
                    FrameLayout.LayoutParams access$getFrameLayoutParams$cp3 = AndroidBug5497Workaround.frameLayoutParams;
                    if (access$getFrameLayoutParams$cp3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("frameLayoutParams");
                        access$getFrameLayoutParams$cp3 = null;
                    }
                    access$getFrameLayoutParams$cp3.height = height - i;
                }
                View access$getMChildOfContent$cp2 = AndroidBug5497Workaround.mChildOfContent;
                if (access$getMChildOfContent$cp2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChildOfContent");
                } else {
                    view = access$getMChildOfContent$cp2;
                }
                view.requestLayout();
                AndroidBug5497Workaround.usableHeightPrevious = computeUsableHeight;
            }
        }

        public final void assistActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            AndroidBug5497Workaround(activity);
        }
    }
}
