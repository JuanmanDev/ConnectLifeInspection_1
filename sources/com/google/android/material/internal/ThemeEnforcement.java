package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C7828R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ThemeEnforcement {
    public static final int[] APPCOMPAT_CHECK_ATTRS = {C7828R.attr.colorPrimary};
    public static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    public static final int[] MATERIAL_CHECK_ATTRS = {C7828R.attr.colorPrimaryVariant};
    public static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";

    public static void checkAppCompatTheme(@NonNull Context context) {
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, APPCOMPAT_THEME_NAME);
    }

    public static void checkCompatibleTheme(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7828R.styleable.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C7828R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C7828R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(@NonNull Context context) {
        checkTheme(context, MATERIAL_CHECK_ATTRS, MATERIAL_THEME_NAME);
    }

    public static void checkTextAppearance(@NonNull Context context, AttributeSet attributeSet, @StyleableRes @NonNull int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes @Nullable int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7828R.styleable.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C7828R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C7828R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = isCustomTextAppearanceValid(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void checkTheme(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (!isTheme(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    public static boolean isAppCompatTheme(@NonNull Context context) {
        return isTheme(context, APPCOMPAT_CHECK_ATTRS);
    }

    public static boolean isCustomTextAppearanceValid(@NonNull Context context, AttributeSet attributeSet, @StyleableRes @NonNull int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes @NonNull int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isMaterialTheme(@NonNull Context context) {
        return isTheme(context, MATERIAL_CHECK_ATTRS);
    }

    public static boolean isTheme(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    public static TypedArray obtainStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @StyleableRes @NonNull int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static TintTypedArray obtainTintedStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @StyleableRes @NonNull int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, i2);
    }
}
