package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getWineCategory$3 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ MutableLiveData<List<WineCategoryInfo>> $getWineListLiveData;
    public final /* synthetic */ WineCategoryViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.WineCategoryViewModel$getWineCategory$3$1", mo48701f = "WineCategoryViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.viewmodel.WineCategoryViewModel$getWineCategory$3$1 */
    /* compiled from: WineCategoryViewModel.kt */
    public static final class C87221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87221(mutableLiveData, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                mutableLiveData.postValue(LoginUserInfoRoom.Companion.wineCategoryProvider().loadAllWineInventories());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$getWineCategory$3(WineCategoryViewModel wineCategoryViewModel, MutableLiveData<List<WineCategoryInfo>> mutableLiveData) {
        super(0);
        this.this$0 = wineCategoryViewModel;
        this.$getWineListLiveData = mutableLiveData;
    }

    public final void invoke() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
        CoroutineDispatcher io = Dispatchers.getIO();
        final MutableLiveData<List<WineCategoryInfo>> mutableLiveData = this.$getWineListLiveData;
        Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C87221((Continuation<? super C87221>) null), 2, (Object) null);
    }
}
