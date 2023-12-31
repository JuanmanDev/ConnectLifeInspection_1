package androidx.core.p028os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(22)
@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\fH\u0007¨\u0006\r"}, mo47991d2 = {"Landroidx/core/os/PersistableBundleApi22ImplKt;", "", "()V", "putBoolean", "", "persistableBundle", "Landroid/os/PersistableBundle;", "key", "", "value", "", "putBooleanArray", "", "core-ktx_release"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* renamed from: androidx.core.os.PersistableBundleApi22ImplKt */
/* compiled from: PersistableBundle.kt */
public final class PersistableBundleApi22ImplKt {
    @NotNull
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    @JvmStatic
    @DoNotInline
    public static final void putBoolean(@NotNull PersistableBundle persistableBundle, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @JvmStatic
    @DoNotInline
    public static final void putBooleanArray(@NotNull PersistableBundle persistableBundle, @Nullable String str, @NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        Intrinsics.checkNotNullParameter(zArr, "value");
        persistableBundle.putBooleanArray(str, zArr);
    }
}
