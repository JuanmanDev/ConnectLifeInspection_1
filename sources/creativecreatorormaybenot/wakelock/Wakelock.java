package creativecreatorormaybenot.wakelock;

import android.app.Activity;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, mo47991d2 = {"Lcreativecreatorormaybenot/wakelock/Wakelock;", "", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "enabled", "", "getEnabled", "()Z", "isEnabled", "", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "toggle", "enable", "wakelock_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Wakelock.kt */
public final class Wakelock {
    @Nullable
    public Activity activity;

    private final boolean getEnabled() {
        Activity activity2 = this.activity;
        Intrinsics.checkNotNull(activity2);
        return (activity2.getWindow().getAttributes().flags & 128) != 0;
    }

    @Nullable
    public final Activity getActivity() {
        return this.activity;
    }

    public final void isEnabled(@NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        if (this.activity == null) {
            WakelockKt.noActivity(dVar);
        } else {
            dVar.success(Boolean.valueOf(getEnabled()));
        }
    }

    public final void setActivity(@Nullable Activity activity2) {
        this.activity = activity2;
    }

    public final void toggle(boolean z, @NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        Activity activity2 = this.activity;
        if (activity2 == null) {
            WakelockKt.noActivity(dVar);
            return;
        }
        Intrinsics.checkNotNull(activity2);
        boolean enabled = getEnabled();
        if (z) {
            if (!enabled) {
                activity2.getWindow().addFlags(128);
            }
        } else if (enabled) {
            activity2.getWindow().clearFlags(128);
        }
        dVar.success((Object) null);
    }
}
