package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, mo47991d2 = {"LTextContextWrapper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Companion", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: TextContextWrapper */
/* compiled from: TextContextWrapper.kt */
public final class TextContextWrapper extends ContextWrapper {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo47991d2 = {"LTextContextWrapper$Companion;", "", "()V", "wrap", "Landroid/content/ContextWrapper;", "context", "Landroid/content/Context;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: TextContextWrapper$Companion */
    /* compiled from: TextContextWrapper.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        @NonNull
        public final ContextWrapper wrap(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Resources resources = context.getResources();
            Configuration configuration = new Configuration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration.setToDefaults();
            configuration.densityDpi = displayMetrics.densityDpi;
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "context.createConfigurationContext(newConfig)");
            return new TextContextWrapper(createConfigurationContext);
        }
    }

    public TextContextWrapper(@Nullable Context context) {
        super(context);
    }
}
