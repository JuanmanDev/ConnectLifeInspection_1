package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.wine.inventory.manager.WineInventoryService;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$updateZoneBWine$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateZoneBWine$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$updateZoneBWine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$updateZoneBWine$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$updateZoneBWine$1> continuation) {
        super(2, continuation);
        this.$auid = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$updateZoneBWine$1(this.$auid, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$updateZoneBWine$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<WineBaseInfo> allWineInventoryByDeviceId = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAllWineInventoryByDeviceId(this.$auid);
            ArrayList arrayList = new ArrayList();
            for (T next : allWineInventoryByDeviceId) {
                if (!TextUtils.isEmpty(((WineBaseInfo) next).getZoneName())) {
                    arrayList.add(next);
                }
            }
            final ArrayList<WineBaseInfo> arrayList2 = new ArrayList<>();
            for (Object next2 : arrayList) {
                String zoneName = ((WineBaseInfo) next2).getZoneName();
                Intrinsics.checkNotNull(zoneName);
                if (StringsKt__StringsKt.contains$default((CharSequence) zoneName, (CharSequence) "B", false, 2, (Object) null)) {
                    arrayList2.add(next2);
                }
            }
            for (WineBaseInfo wineBaseInfo : arrayList2) {
                wineBaseInfo.setZoneName("N");
                wineBaseInfo.setCellNum(-1);
                wineBaseInfo.setPositionNum(-1);
            }
            WineInventoryService wineWineInventoryManagerSerivce = HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce();
            WineWebViewModel wineWebViewModel = this.this$0;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            for (WineBaseInfo winePositionModel : arrayList2) {
                arrayList3.add(wineWebViewModel.toWinePositionModel(winePositionModel));
            }
            final WineWebViewModel wineWebViewModel2 = this.this$0;
            wineWineInventoryManagerSerivce.upDateWindInventory(arrayList3, new Function1<Boolean, Unit>() {

                @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
                @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$updateZoneBWine$1$3$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
                /* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateZoneBWine$1$3$1 */
                /* compiled from: WineWebViewModel.kt */
                public static final class C87061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int label;

                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C87061(list, continuation);
                    }

                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C87061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            LoginUserInfoRoom.Companion.loginUserInfoProvider().updateWineInventoryNewList(list);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(wineWebViewModel2);
                    CoroutineDispatcher io = Dispatchers.getIO();
                    final List<WineBaseInfo> list = arrayList2;
                    Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C87061((Continuation<? super C87061>) null), 2, (Object) null);
                }
            }, C87074.INSTANCE);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
