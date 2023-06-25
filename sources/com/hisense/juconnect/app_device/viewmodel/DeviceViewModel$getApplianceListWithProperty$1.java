package com.hisense.juconnect.app_device.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$getApplianceListWithProperty$1", mo48701f = "DeviceViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$getApplianceListWithProperty$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ DeviceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceViewModel$getApplianceListWithProperty$1(DeviceViewModel deviceViewModel, Continuation<? super DeviceViewModel$getApplianceListWithProperty$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceViewModel$getApplianceListWithProperty$1(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceViewModel$getApplianceListWithProperty$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
            final DeviceViewModel deviceViewModel = this.this$0;
            C86211 r0 = new Function1<List<? extends DeviceInfo>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<DeviceInfo>) (List) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List<DeviceInfo> list) {
                    Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
                    Intrinsics.stringPlus("请求设备列表接口：数量", Integer.valueOf(list.size()));
                    ArrayList arrayList = new ArrayList();
                    for (T next : list) {
                        if (Intrinsics.areEqual((Object) ((DeviceInfo) next).getDeviceTypeCode(), (Object) "001")) {
                            arrayList.add(next);
                        }
                    }
                    deviceViewModel.cacheUserDeviceList(arrayList);
                    deviceViewModel.getApplListLiveData().postValue(new Pair(Boolean.TRUE, arrayList));
                }
            };
            final DeviceViewModel deviceViewModel2 = this.this$0;
            deviceService.getApplianceListWithProperty(r0, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    deviceViewModel2.getApplListLiveData().postValue(new Pair(Boolean.FALSE, CollectionsKt__CollectionsKt.emptyList()));
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
