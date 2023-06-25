package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "androidx.room.RoomDatabaseKt", mo48701f = "RoomDatabase.kt", mo48702i = {0, 0}, mo48703l = {50, 51}, mo48704m = "withTransaction", mo48705n = {"$this$withTransaction", "block"}, mo48706s = {"L$0", "L$1"})
/* compiled from: RoomDatabase.kt */
public final class RoomDatabaseKt$withTransaction$1<R> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public RoomDatabaseKt$withTransaction$1(Continuation<? super RoomDatabaseKt$withTransaction$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RoomDatabaseKt.withTransaction((RoomDatabase) null, (Function1) null, this);
    }
}
