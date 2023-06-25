package p040c.p077d.p078a.p081k.p091l.p094e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: c.d.a.k.l.e.a */
/* compiled from: DrawableDecoderCompat */
public final class C1844a {

    /* renamed from: a */
    public static volatile boolean f1433a = true;

    /* renamed from: a */
    public static Drawable m2144a(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return m2146c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m2145b(Context context, Context context2, @DrawableRes int i) {
        return m2146c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    public static Drawable m2146c(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f1433a) {
                return m2148e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f1433a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.getDrawable(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m2147d(context2, i, theme);
    }

    /* renamed from: d */
    public static Drawable m2147d(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i, theme);
    }

    /* renamed from: e */
    public static Drawable m2148e(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.getDrawable(context, i);
    }
}
