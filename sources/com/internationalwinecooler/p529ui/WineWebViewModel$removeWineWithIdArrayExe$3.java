package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.wine.inventory.manager.WineInventoryService;
import com.hisense.connect_life.hismart.networks.request.wine.model.DeleteWineMessage;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.juconnect.app_device.event.DeleteInvenMessage;
import com.internationalwinecooler.model.JsResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$removeWineWithIdArrayExe$3", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$removeWineWithIdArrayExe$3 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$removeWineWithIdArrayExe$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ WebActionEnum $actionEnum;
    public final /* synthetic */ String $identityPage;
    public final /* synthetic */ List<Long> $inventoryIdList;
    public final /* synthetic */ List<String> $listId;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$removeWineWithIdArrayExe$3(List<Long> list, List<String> list2, WineWebViewModel wineWebViewModel, String str, WebActionEnum webActionEnum, Continuation<? super WineWebViewModel$removeWineWithIdArrayExe$3> continuation) {
        super(2, continuation);
        this.$inventoryIdList = list;
        this.$listId = list2;
        this.this$0 = wineWebViewModel;
        this.$identityPage = str;
        this.$actionEnum = webActionEnum;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$removeWineWithIdArrayExe$3(this.$inventoryIdList, this.$listId, this.this$0, this.$identityPage, this.$actionEnum, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$removeWineWithIdArrayExe$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            WineInventoryService wineWineInventoryManagerSerivce = HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce();
            List<Long> list = this.$inventoryIdList;
            final List<String> list2 = this.$listId;
            final WineWebViewModel wineWebViewModel = this.this$0;
            final String str = this.$identityPage;
            final WebActionEnum webActionEnum = this.$actionEnum;
            wineWineInventoryManagerSerivce.deleteWindInWentory(list, new Function1<Boolean, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    if (z) {
                        ArrayList arrayList = new ArrayList();
                        for (String queryWineInventoryByInventoryId : list2) {
                            WineBaseInfo queryWineInventoryByInventoryId2 = LoginUserInfoRoom.Companion.loginUserInfoProvider().queryWineInventoryByInventoryId(queryWineInventoryByInventoryId);
                            if (queryWineInventoryByInventoryId2 != null) {
                                arrayList.add(queryWineInventoryByInventoryId2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            wineWebViewModel.getRemoveWineSucLiveData().postValue(new Pair(arrayList, Boolean.valueOf(TextUtils.equals(str, "AddPosition"))));
                            wineWebViewModel.modifyWineCategoryCount(arrayList, list2.size());
                            String deviceId = ((WineBaseInfo) arrayList.get(0)).getDeviceId();
                            DeleteInvenMessage deleteInvenMessage = new DeleteInvenMessage();
                            deleteInvenMessage.setWarning("Delete wine");
                            deleteInvenMessage.setInfo(deviceId + Typography.amp + "Delete wine");
                            EventBus.getDefault().post(deleteInvenMessage);
                        }
                        LoginUserInfoRoom.Companion.loginUserInfoProvider().deleteWineInventoryByInventoryIdList(list2);
                        EventBus.getDefault().post(new DeleteWineMessage());
                        wineWebViewModel.getEvaluateJsLiveData().setValue(new Pair(webActionEnum, new Gson().toJson((Object) new JsResp(list2, 0, (String) null, 6, (DefaultConstructorMarker) null))));
                    }
                }
            }, C86862.INSTANCE);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
