package com.hisense.juconnect.app_device.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.device.model.BindDeviceSuccessData;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$bindDevice$1", mo48701f = "DeviceViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$bindDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $applianceType;
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ String $nickName;
    public final /* synthetic */ String $wifiId;
    public int label;
    public final /* synthetic */ DeviceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceViewModel$bindDevice$1(String str, String str2, String str3, String str4, DeviceViewModel deviceViewModel, Continuation<? super DeviceViewModel$bindDevice$1> continuation) {
        super(2, continuation);
        this.$wifiId = str;
        this.$deviceId = str2;
        this.$nickName = str3;
        this.$applianceType = str4;
        this.this$0 = deviceViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceViewModel$bindDevice$1(this.$wifiId, this.$deviceId, this.$nickName, this.$applianceType, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceViewModel$bindDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
            String str = this.$wifiId;
            String str2 = this.$deviceId;
            String str3 = this.$nickName;
            String str4 = this.$applianceType;
            final DeviceViewModel deviceViewModel = this.this$0;
            C86151 r5 = new Function1<BindDeviceSuccessData, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((BindDeviceSuccessData) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull BindDeviceSuccessData bindDeviceSuccessData) {
                    Intrinsics.checkNotNullParameter(bindDeviceSuccessData, LanguageConstKt.f15954it);
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("bindDevice success：", bindDeviceSuccessData));
                    deviceViewModel.getBindDeviceIdLiveData().postValue(new Pair(Boolean.TRUE, bindDeviceSuccessData.getDeviceId()));
                    deviceViewModel.getBindDeviceLiveData().postValue(new Pair(Boolean.TRUE, bindDeviceSuccessData.getDeviceId()));
                    deviceViewModel.updateLoadingStatus(false);
                }
            };
            final DeviceViewModel deviceViewModel2 = this.this$0;
            deviceService.bindAppliance(str, str2, str3, str4, r5, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    deviceViewModel2.getBindDeviceLiveData().postValue(new Pair(Boolean.FALSE, ""));
                    deviceViewModel2.updateLoadingStatus(false);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
