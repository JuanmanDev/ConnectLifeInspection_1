package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.juconnect.connectlife.model.WineInventoryBean;
import com.juconnect.connectlife.sql.ConnectLifeRoom;
import com.juconnect.connectlife.sql.inventory.WineInventoryEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
import p040c.p072c.p073a.p074a.C1524t;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "it", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$queryRemoteWineList$disposable$1 extends Lambda implements Function1<List<? extends WineInventoryBean>, Unit> {
    public final /* synthetic */ Function0<Unit> $action;
    public final /* synthetic */ Function1<String, Unit> $failure;
    public final /* synthetic */ String $lastChange;
    public final /* synthetic */ boolean $returnRemoved;
    public final /* synthetic */ InventoryWineViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.InventoryWineViewModel$queryRemoteWineList$disposable$1$1", mo48701f = "InventoryWineViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.viewmodel.InventoryWineViewModel$queryRemoteWineList$disposable$1$1 */
    /* compiled from: InventoryWineViewModel.kt */
    public static final class C87161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87161(list2, str, z, function0, function1, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (!list2.isEmpty()) {
                    C1524t.m1042f(AppConfig.SP_LAST_CHAGE_).mo15424o(KeyConst.KEY_LAST_CHANGE_INVENTORY, str, true);
                }
                List<WineInventoryBean> list = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (WineInventoryBean fromWineInventoryBean : list) {
                    arrayList.add(WineInventoryEntity.Companion.fromWineInventoryBean(fromWineInventoryBean));
                }
                try {
                    ConnectLifeRoom.Companion.wineInventoryProvider().deleteAll();
                    ConnectLifeRoom.Companion.wineInventoryProvider().insertWineInventories(arrayList);
                    if (z) {
                        C1524t.m1042f(AppConfig.SP_LAST_CHAGE_).mo15423n(KeyConst.KEY_INVENTORY_CATEGORY, "1");
                    } else {
                        C1524t.m1042f(AppConfig.SP_LAST_CHAGE_).mo15423n(KeyConst.KEY_INVENTORY_CATEGORY, "0");
                    }
                    function0.invoke();
                } catch (Exception e) {
                    e.printStackTrace();
                    LoggerUtil.Companion.mo39146e("updateWineList== 数据库操作失败");
                    function1.invoke("数据库操作失败");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWineViewModel$queryRemoteWineList$disposable$1(InventoryWineViewModel inventoryWineViewModel, Function1<? super String, Unit> function1, String str, boolean z, Function0<Unit> function0) {
        super(1);
        this.this$0 = inventoryWineViewModel;
        this.$failure = function1;
        this.$lastChange = str;
        this.$returnRemoved = z;
        this.$action = function0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<WineInventoryBean>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable List<WineInventoryBean> list) {
        LoggerUtil.Companion.mo39146e("updateWineList== 远程获取成功");
        if (list != null) {
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
            CoroutineDispatcher io = Dispatchers.getIO();
            final String str = this.$lastChange;
            final boolean z = this.$returnRemoved;
            final Function0<Unit> function0 = this.$action;
            final Function1<String, Unit> function1 = this.$failure;
            final List<WineInventoryBean> list2 = list;
            Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C87161((Continuation<? super C87161>) null), 2, (Object) null);
            return;
        }
        LoggerUtil.Companion.mo39146e("updateWineList== 有远程获取列表==null");
        this.$failure.invoke("");
    }
}
