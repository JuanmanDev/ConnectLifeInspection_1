package androidx.room;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "androidx.room.RoomDatabaseKt$withTransaction$2", mo48701f = "RoomDatabase.kt", mo48702i = {0}, mo48703l = {58}, mo48704m = "invokeSuspend", mo48705n = {"transactionElement"}, mo48706s = {"L$0"})
/* compiled from: RoomDatabase.kt */
public final class RoomDatabaseKt$withTransaction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    public final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
    public final /* synthetic */ RoomDatabase $this_withTransaction;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$withTransaction$2(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super RoomDatabaseKt$withTransaction$2> continuation) {
        super(2, continuation);
        this.$this_withTransaction = roomDatabase;
        this.$block = function1;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(this.$this_withTransaction, this.$block, continuation);
        roomDatabaseKt$withTransaction$2.L$0 = obj;
        return roomDatabaseKt$withTransaction$2;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super R> continuation) {
        return ((RoomDatabaseKt$withTransaction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TransactionElement transactionElement;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(TransactionElement.Key);
            Intrinsics.checkNotNull(element);
            TransactionElement transactionElement2 = (TransactionElement) element;
            transactionElement2.acquire();
            try {
                this.$this_withTransaction.beginTransaction();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                transactionElement = transactionElement2;
                th = th3;
                transactionElement.release();
                throw th;
            }
            try {
                Function1<Continuation<? super R>, Object> function1 = this.$block;
                this.L$0 = transactionElement2;
                this.label = 1;
                Object invoke = function1.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                transactionElement = transactionElement2;
                obj = invoke;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                transactionElement = transactionElement2;
                th = th5;
                this.$this_withTransaction.endTransaction();
                throw th;
            }
        } else if (i == 1) {
            transactionElement = (TransactionElement) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$this_withTransaction.setTransactionSuccessful();
        try {
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th7) {
            th = th7;
            transactionElement.release();
            throw th;
        }
    }
}
