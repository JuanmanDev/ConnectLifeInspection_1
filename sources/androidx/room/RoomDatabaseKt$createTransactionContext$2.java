package androidx.room;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RoomDatabase.kt */
public final class RoomDatabaseKt$createTransactionContext$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ CompletableJob $controlJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$createTransactionContext$2(CompletableJob completableJob) {
        super(1);
        this.$controlJob = completableJob;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        Job.DefaultImpls.cancel$default((Job) this.$controlJob, (CancellationException) null, 1, (Object) null);
    }
}
