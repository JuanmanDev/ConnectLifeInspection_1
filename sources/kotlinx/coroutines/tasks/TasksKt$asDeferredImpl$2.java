package kotlinx.coroutines.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p347m.C5755b;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Tasks.kt */
public final class TasksKt$asDeferredImpl$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ C5755b $cancellationTokenSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TasksKt$asDeferredImpl$2(C5755b bVar) {
        super(1);
        this.$cancellationTokenSource = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        this.$cancellationTokenSource.mo28829a();
    }
}
