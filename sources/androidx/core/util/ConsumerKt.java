package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(24)
@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, mo47991d2 = {"asConsumer", "Ljava/util/function/Consumer;", "T", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: Consumer.kt */
public final class ConsumerKt {
    @RequiresApi(24)
    @NotNull
    public static final <T> Consumer<T> asConsumer(@NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new ContinuationConsumer(continuation);
    }
}
