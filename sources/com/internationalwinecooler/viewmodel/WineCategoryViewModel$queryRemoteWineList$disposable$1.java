package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.constants.ErrorCodeConst;
import com.hisense.connect_life.hismart.networks.exception.HiNetworkException;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$queryRemoteWineList$disposable$1 extends Lambda implements Function1<QueryCategoryResult, Unit> {
    public final /* synthetic */ Function1<QueryCategoryResult, Unit> $action;
    public final /* synthetic */ Function1<Throwable, Unit> $failure;
    public final /* synthetic */ Function0<Unit> $loadCache;
    public final /* synthetic */ WineCategoryViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.WineCategoryViewModel$queryRemoteWineList$disposable$1$1", mo48701f = "WineCategoryViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.viewmodel.WineCategoryViewModel$queryRemoteWineList$disposable$1$1 */
    /* compiled from: WineCategoryViewModel.kt */
    public static final class C87231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87231(function1, queryCategoryResult, function12, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    function1.invoke(queryCategoryResult);
                } catch (Exception e) {
                    e.printStackTrace();
                    LoggerUtil.Companion.mo39146e("updateWineList== 数据库操作失败");
                    function12.invoke(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$queryRemoteWineList$disposable$1(WineCategoryViewModel wineCategoryViewModel, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Function1<? super QueryCategoryResult, Unit> function12) {
        super(1);
        this.this$0 = wineCategoryViewModel;
        this.$loadCache = function0;
        this.$failure = function1;
        this.$action = function12;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QueryCategoryResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final QueryCategoryResult queryCategoryResult) {
        Intrinsics.checkNotNullParameter(queryCategoryResult, LanguageConstKt.f15954it);
        LoggerUtil.Companion.mo39146e("updateWineList== 远程获取成功");
        long errorCode = queryCategoryResult.getErrorCode();
        if (errorCode == 0) {
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
            CoroutineDispatcher io = Dispatchers.getIO();
            final Function1<QueryCategoryResult, Unit> function1 = this.$action;
            final Function1<Throwable, Unit> function12 = this.$failure;
            Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C87231((Continuation<? super C87231>) null), 2, (Object) null);
        } else if (errorCode == ErrorCodeConst.WINE_DATA_NO_CHANGE) {
            Function0<Unit> function0 = this.$loadCache;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            this.$failure.invoke(new HiNetworkException(queryCategoryResult.toString()));
        }
    }
}
