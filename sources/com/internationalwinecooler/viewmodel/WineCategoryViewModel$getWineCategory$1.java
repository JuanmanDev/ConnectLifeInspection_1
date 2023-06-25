package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getWineCategory$1 extends Lambda implements Function1<QueryCategoryResult, Unit> {
    public final /* synthetic */ MutableLiveData<List<WineCategoryInfo>> $getWineListLiveData;
    public final /* synthetic */ WineCategoryViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.WineCategoryViewModel$getWineCategory$1$1", mo48701f = "WineCategoryViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.viewmodel.WineCategoryViewModel$getWineCategory$1$1 */
    /* compiled from: WineCategoryViewModel.kt */
    public static final class C87201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87201(queryCategoryResult, mutableLiveData, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x001f A[Catch:{ Exception -> 0x008a }] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[Catch:{ Exception -> 0x008a }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0079 A[Catch:{ Exception -> 0x008a }] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r4.label
                if (r0 != 0) goto L_0x00a3
                kotlin.ResultKt.throwOnFailure(r5)
                com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r5 = r8     // Catch:{ Exception -> 0x008a }
                java.util.List r5 = r5.getCategoryList()     // Catch:{ Exception -> 0x008a }
                r0 = 1
                if (r5 == 0) goto L_0x001c
                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x008a }
                if (r5 == 0) goto L_0x001a
                goto L_0x001c
            L_0x001a:
                r5 = 0
                goto L_0x001d
            L_0x001c:
                r5 = r0
            L_0x001d:
                if (r5 == 0) goto L_0x0020
                goto L_0x004d
            L_0x0020:
                java.lang.String r5 = "酒品类数量is"
                com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r1 = r8     // Catch:{ Exception -> 0x008a }
                java.util.List r1 = r1.getCategoryList()     // Catch:{ Exception -> 0x008a }
                int r1 = r1.size()     // Catch:{ Exception -> 0x008a }
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ Exception -> 0x008a }
                kotlin.jvm.internal.Intrinsics.stringPlus(r5, r1)     // Catch:{ Exception -> 0x008a }
                com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r5 = r8     // Catch:{ Exception -> 0x008a }
                java.util.List r5 = r5.getCategoryList()     // Catch:{ Exception -> 0x008a }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x008a }
            L_0x003d:
                boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x008a }
                if (r1 == 0) goto L_0x004d
                java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x008a }
                com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo r1 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo) r1     // Catch:{ Exception -> 0x008a }
                java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x008a }
                goto L_0x003d
            L_0x004d:
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r5 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x008a }
                com.hisense.connect_life.hismart.sql.winecategory.WineCategoryProvider r5 = r5.wineCategoryProvider()     // Catch:{ Exception -> 0x008a }
                r5.deleteAll()     // Catch:{ Exception -> 0x008a }
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r5 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x008a }
                com.hisense.connect_life.hismart.sql.winecategory.WineCategoryProvider r5 = r5.wineCategoryProvider()     // Catch:{ Exception -> 0x008a }
                com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r1 = r8     // Catch:{ Exception -> 0x008a }
                java.util.List r1 = r1.getCategoryList()     // Catch:{ Exception -> 0x008a }
                r5.insertWineInventories(r1)     // Catch:{ Exception -> 0x008a }
                java.lang.String r5 = "sp_last_change"
                c.c.a.a.t r5 = p040c.p072c.p073a.p074a.C1524t.m1042f(r5)     // Catch:{ Exception -> 0x008a }
                java.lang.String r1 = "key_last_change_inventory"
                com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r2 = r8     // Catch:{ Exception -> 0x008a }
                long r2 = r2.getLastUpdateTime()     // Catch:{ Exception -> 0x008a }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x008a }
                if (r2 != 0) goto L_0x007b
                java.lang.String r2 = "-1"
            L_0x007b:
                r5.mo15424o(r1, r2, r0)     // Catch:{ Exception -> 0x008a }
                androidx.lifecycle.MutableLiveData<java.util.List<com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo>> r5 = r0     // Catch:{ Exception -> 0x008a }
                com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r0 = r8     // Catch:{ Exception -> 0x008a }
                java.util.List r0 = r0.getCategoryList()     // Catch:{ Exception -> 0x008a }
                r5.postValue(r0)     // Catch:{ Exception -> 0x008a }
                goto L_0x00a0
            L_0x008a:
                r5 = move-exception
                r5.printStackTrace()
                java.io.PrintStream r5 = java.lang.System.out
                java.lang.String r0 = "保存酒品类列表失败"
                r5.println(r0)
                androidx.lifecycle.MutableLiveData<java.util.List<com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo>> r5 = r0
                com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r0 = r8
                java.util.List r0 = r0.getCategoryList()
                r5.postValue(r0)
            L_0x00a0:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L_0x00a3:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.viewmodel.WineCategoryViewModel$getWineCategory$1.C87201.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$getWineCategory$1(WineCategoryViewModel wineCategoryViewModel, MutableLiveData<List<WineCategoryInfo>> mutableLiveData) {
        super(1);
        this.this$0 = wineCategoryViewModel;
        this.$getWineListLiveData = mutableLiveData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QueryCategoryResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final QueryCategoryResult queryCategoryResult) {
        Intrinsics.checkNotNullParameter(queryCategoryResult, LanguageConstKt.f15954it);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
        CoroutineDispatcher io = Dispatchers.getIO();
        final MutableLiveData<List<WineCategoryInfo>> mutableLiveData = this.$getWineListLiveData;
        Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C87201((Continuation<? super C87201>) null), 2, (Object) null);
    }
}
