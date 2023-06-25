package creativecreatorormaybenot.wakelock;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo47991d2 = {"noActivity", "", "Lio/flutter/plugin/common/MethodChannel$Result;", "wakelock_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Wakelock.kt */
public final class WakelockKt {
    public static final void noActivity(@NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.error("no_activity", "wakelock requires a foreground activity", (Object) null);
    }
}
