package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import org.xmlpull.p703v1.XmlPullParser;

public final class DrawableCompat {
    public static final String TAG = "DrawableCompat";
    public static Method sGetLayoutDirectionMethod;
    public static boolean sGetLayoutDirectionMethodFetched;
    public static Method sSetLayoutDirectionMethod;
    public static boolean sSetLayoutDirectionMethodFetched;

    @RequiresApi(19)
    public static class Api19Impl {
        @DoNotInline
        public static int getAlpha(Drawable drawable) {
            return drawable.getAlpha();
        }

        @DoNotInline
        public static Drawable getChild(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @DoNotInline
        public static Drawable getDrawable(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @DoNotInline
        public static boolean isAutoMirrored(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @DoNotInline
        public static void setAutoMirrored(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        public static void applyTheme(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        public static boolean canApplyTheme(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        public static ColorFilter getColorFilter(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        public static void setHotspot(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @DoNotInline
        public static void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @DoNotInline
        public static void setTint(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @DoNotInline
        public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @RequiresApi(23)
    public static class Api23Impl {
        @DoNotInline
        public static int getLayoutDirection(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        public static boolean setLayoutDirection(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    public static void applyTheme(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.applyTheme(drawable, theme);
        }
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.canApplyTheme(drawable);
        }
        return false;
    }

    public static void clearColorFilter(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                clearColorFilter(Api19Impl.getDrawable((InsetDrawable) drawable));
            } else if (drawable instanceof WrappedDrawable) {
                clearColorFilter(((WrappedDrawable) drawable).getWrappedDrawable());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = Api19Impl.getChild(drawableContainerState, i2);
                    if (child != null) {
                        clearColorFilter(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static int getAlpha(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.getAlpha(drawable);
        }
        return 0;
    }

    @Nullable
    public static ColorFilter getColorFilter(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getColorFilter(drawable);
        }
        return null;
    }

    public static int getLayoutDirection(@NonNull Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return Api23Impl.getLayoutDirection(drawable);
        }
        if (i >= 17) {
            if (!sGetLayoutDirectionMethodFetched) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    sGetLayoutDirectionMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                sGetLayoutDirectionMethodFetched = true;
            }
            Method method = sGetLayoutDirectionMethod;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    sGetLayoutDirectionMethod = null;
                }
            }
        }
        return 0;
    }

    public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.isAutoMirrored(drawable);
        }
        return false;
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            Api19Impl.setAutoMirrored(drawable, z);
        }
    }

    public static void setHotspot(@NonNull Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setHotspot(drawable, f, f2);
        }
    }

    public static void setHotspotBounds(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setHotspotBounds(drawable, i, i2, i3, i4);
        }
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return Api23Impl.setLayoutDirection(drawable, i);
        }
        if (i2 >= 17) {
            if (!sSetLayoutDirectionMethodFetched) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    sSetLayoutDirectionMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                sSetLayoutDirectionMethodFetched = true;
            }
            Method method = sSetLayoutDirectionMethod;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception unused2) {
                    sSetLayoutDirectionMethod = null;
                }
            }
        }
        return false;
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setTint(drawable, i);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTint(i);
        }
    }

    public static void setTintList(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setTintList(drawable, colorStateList);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintList(colorStateList);
        }
    }

    public static void setTintMode(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setTintMode(drawable, mode);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintMode(mode);
        }
    }

    public static <T extends Drawable> T unwrap(@NonNull Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    @NonNull
    public static Drawable wrap(@NonNull Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof TintAwareDrawable) ? new WrappedDrawableApi21(drawable) : drawable : !(drawable instanceof TintAwareDrawable) ? new WrappedDrawableApi14(drawable) : drawable;
    }
}
