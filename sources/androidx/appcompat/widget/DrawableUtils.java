package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.WrappedDrawable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DrawableUtils {
    public static final int[] CHECKED_STATE_SET = {16842912};
    public static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    @RequiresApi(18)
    public static class Api18Impl {
        public static final Field sBottom;
        public static final Method sGetOpticalInsets;
        public static final Field sLeft;
        public static final boolean sReflectionSuccessful;
        public static final Field sRight;
        public static final Field sTop;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r2
                goto L_0x0047
            L_0x002f:
                r6 = r2
                goto L_0x0046
            L_0x0031:
                r6 = r2
                goto L_0x0046
            L_0x0033:
                r6 = r2
                goto L_0x0046
            L_0x0035:
                r5 = r2
                goto L_0x003d
            L_0x0037:
                r5 = r2
                goto L_0x0041
            L_0x0039:
                r5 = r2
                goto L_0x0045
            L_0x003b:
                r4 = r2
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r2
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r2
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r8 = r1
                r3 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                sGetOpticalInsets = r4
                sLeft = r5
                sTop = r6
                sRight = r7
                sBottom = r3
                sReflectionSuccessful = r0
                goto L_0x0064
            L_0x0058:
                sGetOpticalInsets = r2
                sLeft = r2
                sTop = r2
                sRight = r2
                sBottom = r2
                sReflectionSuccessful = r1
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.Api18Impl.<clinit>():void");
        }

        @NonNull
        public static Rect getOpticalInsets(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && sReflectionSuccessful) {
                try {
                    Object invoke = sGetOpticalInsets.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(sLeft.getInt(invoke), sTop.getInt(invoke), sRight.getInt(invoke), sBottom.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.INSETS_NONE;
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        @DoNotInline
        public static Insets getOpticalInsets(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable canSafelyMutateDrawable : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!canSafelyMutateDrawable(canSafelyMutateDrawable)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof WrappedDrawable) {
            return canSafelyMutateDrawable(((WrappedDrawable) drawable).getWrappedDrawable());
        } else {
            if (drawable instanceof DrawableWrapper) {
                return canSafelyMutateDrawable(((DrawableWrapper) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return canSafelyMutateDrawable(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static void fixDrawable(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT != 21 || !ResourceManagerInternal.PLATFORM_VD_CLAZZ.equals(name)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                forceDrawableStateChange(drawable);
                return;
            }
            return;
        }
        forceDrawableStateChange(drawable);
    }

    public static void forceDrawableStateChange(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    @NonNull
    public static Rect getOpticalBounds(@NonNull Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets opticalInsets = Api29Impl.getOpticalInsets(drawable);
            return new Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        } else if (i >= 18) {
            return Api18Impl.getOpticalInsets(DrawableCompat.unwrap(drawable));
        } else {
            return INSETS_NONE;
        }
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
