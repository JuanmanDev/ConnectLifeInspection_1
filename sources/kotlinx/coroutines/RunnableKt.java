package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\b*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0006"}, mo47991d2 = {"Runnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/Function0;", "", "kotlinx-coroutines-core"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Runnable.kt */
public final class RunnableKt {
    @NotNull
    public static final Runnable Runnable(@NotNull Function0<Unit> function0) {
        return new RunnableKt$Runnable$1(function0);
    }
}
