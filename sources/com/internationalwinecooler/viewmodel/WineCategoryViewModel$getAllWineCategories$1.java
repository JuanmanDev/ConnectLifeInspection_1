package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.io.PrintStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import p040c.p072c.p073a.p074a.C1524t;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getAllWineCategories$1 extends Lambda implements Function1<QueryCategoryResult, Unit> {
    public final /* synthetic */ MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> $webViewGetWineListLiveData;
    public final /* synthetic */ WineCategoryViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.WineCategoryViewModel$getAllWineCategories$1$1", mo48701f = "WineCategoryViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.viewmodel.WineCategoryViewModel$getAllWineCategories$1$1 */
    /* compiled from: WineCategoryViewModel.kt */
    public static final class C87191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87191(queryCategoryResult, mutableLiveData, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    PrintStream printStream = System.out;
                    List<WineCategoryInfo> categoryList = queryCategoryResult.getCategoryList();
                    printStream.println(Intrinsics.stringPlus("保存酒品类列表数量is", categoryList == null ? null : Boxing.boxInt(categoryList.size())));
                    LoginUserInfoRoom.Companion.wineCategoryProvider().deleteAll();
                    LoginUserInfoRoom.Companion.wineCategoryProvider().insertWineInventories(queryCategoryResult.getCategoryList());
                    C1524t f = C1524t.m1042f(AppConfig.SP_LAST_CHAGE_);
                    String valueOf = String.valueOf(queryCategoryResult.getLastUpdateTime());
                    if (valueOf == null) {
                        valueOf = "-1";
                    }
                    f.mo15424o(KeyConst.KEY_LAST_CHANGE_INVENTORY, valueOf, true);
                    mutableLiveData.postValue(new Pair(Boxing.boxBoolean(true), queryCategoryResult.getCategoryList()));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("保存酒品类列表失败");
                    mutableLiveData.postValue(new Pair(Boxing.boxBoolean(false), queryCategoryResult.getCategoryList()));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$getAllWineCategories$1(WineCategoryViewModel wineCategoryViewModel, MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> mutableLiveData) {
        super(1);
        this.this$0 = wineCategoryViewModel;
        this.$webViewGetWineListLiveData = mutableLiveData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QueryCategoryResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final QueryCategoryResult queryCategoryResult) {
        Intrinsics.checkNotNullParameter(queryCategoryResult, LanguageConstKt.f15954it);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
        CoroutineDispatcher io = Dispatchers.getIO();
        final MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> mutableLiveData = this.$webViewGetWineListLiveData;
        Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C87191((Continuation<? super C87191>) null), 2, (Object) null);
    }
}
