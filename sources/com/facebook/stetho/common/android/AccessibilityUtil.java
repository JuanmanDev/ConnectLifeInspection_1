package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

public final class AccessibilityUtil {
    public static boolean hasFocusableAncestor(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        if (accessibilityNodeInfoCompat == null || view == null) {
            return false;
        }
        ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(view);
        if (!(parentForAccessibility instanceof View)) {
            return false;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        try {
            ViewCompat.onInitializeAccessibilityNodeInfo((View) parentForAccessibility, obtain);
            if (obtain == null) {
                return false;
            }
            if (isAccessibilityFocusable(obtain, (View) parentForAccessibility)) {
                obtain.recycle();
                return true;
            } else if (hasFocusableAncestor(obtain, (View) parentForAccessibility)) {
                obtain.recycle();
                return true;
            } else {
                obtain.recycle();
                return false;
            }
        } finally {
            obtain.recycle();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        if (!(accessibilityNodeInfoCompat == null || view == null || !(view instanceof ViewGroup))) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
                    try {
                        ViewCompat.onInitializeAccessibilityNodeInfo(childAt, obtain);
                        if (!isAccessibilityFocusable(obtain, childAt)) {
                            if (isSpeakingNode(obtain, childAt)) {
                                obtain.recycle();
                                return true;
                            }
                        }
                    } finally {
                        obtain.recycle();
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasText(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        return !TextUtils.isEmpty(accessibilityNodeInfoCompat.getText()) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.getContentDescription());
    }

    public static boolean isAccessibilityFocusable(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.isVisibleToUser()) {
            return false;
        }
        if (isActionableForAccessibility(accessibilityNodeInfoCompat)) {
            return true;
        }
        if (!isTopLevelScrollItem(accessibilityNodeInfoCompat, view) || !isSpeakingNode(accessibilityNodeInfoCompat, view)) {
            return false;
        }
        return true;
    }

    public static boolean isActionableForAccessibility(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        if (accessibilityNodeInfoCompat.isClickable() || accessibilityNodeInfoCompat.isLongClickable() || accessibilityNodeInfoCompat.isFocusable()) {
            return true;
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = accessibilityNodeInfoCompat.getActionList();
        if (actionList.contains(16) || actionList.contains(32) || actionList.contains(1)) {
            return true;
        }
        return false;
    }

    public static boolean isSpeakingNode(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        int importantForAccessibility;
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.isVisibleToUser() || (importantForAccessibility = ViewCompat.getImportantForAccessibility(view)) == 4) {
            return false;
        }
        if (importantForAccessibility == 2 && accessibilityNodeInfoCompat.getChildCount() <= 0) {
            return false;
        }
        if (accessibilityNodeInfoCompat.isCheckable() || hasText(accessibilityNodeInfoCompat) || hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompat, view)) {
            return true;
        }
        return false;
    }

    public static boolean isTopLevelScrollItem(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        View view2;
        if (accessibilityNodeInfoCompat == null || view == null || (view2 = (View) ViewCompat.getParentForAccessibility(view)) == null) {
            return false;
        }
        if (accessibilityNodeInfoCompat.isScrollable()) {
            return true;
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = accessibilityNodeInfoCompat.getActionList();
        if (actionList.contains(4096) || actionList.contains(8192)) {
            return true;
        }
        if (view2 instanceof Spinner) {
            return false;
        }
        if ((view2 instanceof AdapterView) || (view2 instanceof ScrollView) || (view2 instanceof HorizontalScrollView)) {
            return true;
        }
        return false;
    }
}
