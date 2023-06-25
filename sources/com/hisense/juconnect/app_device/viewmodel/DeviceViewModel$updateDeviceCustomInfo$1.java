package com.hisense.juconnect.app_device.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import kotlin.Metadata;
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
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$updateDeviceCustomInfo$1", mo48701f = "DeviceViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$updateDeviceCustomInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ String $deviceNickName;
    public final /* synthetic */ String $wifiId;
    public int label;
    public final /* synthetic */ DeviceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceViewModel$updateDeviceCustomInfo$1(String str, String str2, String str3, DeviceViewModel deviceViewModel, Continuation<? super DeviceViewModel$updateDeviceCustomInfo$1> continuation) {
        super(2, continuation);
        this.$wifiId = str;
        this.$deviceId = str2;
        this.$deviceNickName = str3;
        this.this$0 = deviceViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceViewModel$updateDeviceCustomInfo$1(this.$wifiId, this.$deviceId, this.$deviceNickName, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceViewModel$updateDeviceCustomInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
            String str = this.$wifiId;
            String str2 = this.$deviceId;
            String str3 = this.$deviceNickName;
            final DeviceViewModel deviceViewModel = this.this$0;
            C86381 r4 = new Function1<Boolean, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    deviceViewModel.getUpdateDeviceLiveData().postValue(Boolean.valueOf(z));
                    deviceViewModel.updateLoadingStatus(false);
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("updateDeviceCustomInfo suc ", Boolean.valueOf(z)));
                }
            };
            final DeviceViewModel deviceViewModel2 = this.this$0;
            deviceService.updateDeviceCustomInfo(str, str2, str3, r4, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    deviceViewModel2.getUpdateDeviceLiveData().postValue(Boolean.FALSE);
                    deviceViewModel2.updateLoadingStatus(false);
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("updateDeviceCustomInfo fail ", th));
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
