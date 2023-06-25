package com.hisense.juconnect.app_device.viewmodel;

import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.juconnect.app_device.R$string;
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
import p040c.p072c.p073a.p074a.C1527w;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$shareDevice$1", mo48701f = "DeviceViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$shareDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ String $userBox;
    public final /* synthetic */ String $wifiId;
    public int label;
    public final /* synthetic */ DeviceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceViewModel$shareDevice$1(String str, String str2, String str3, DeviceViewModel deviceViewModel, Continuation<? super DeviceViewModel$shareDevice$1> continuation) {
        super(2, continuation);
        this.$deviceId = str;
        this.$wifiId = str2;
        this.$userBox = str3;
        this.this$0 = deviceViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceViewModel$shareDevice$1(this.$deviceId, this.$wifiId, this.$userBox, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceViewModel$shareDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
            String str = this.$deviceId;
            String str2 = this.$wifiId;
            String str3 = this.$userBox;
            final DeviceViewModel deviceViewModel = this.this$0;
            C86361 r4 = new Function1<HiResult<HiResponse>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiResult<HiResponse>) (HiResult) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiResult<HiResponse> hiResult) {
                    Intrinsics.checkNotNullParameter(hiResult, LanguageConstKt.f15954it);
                    if (hiResult.getResponse().getResultCode() == 1) {
                        if (hiResult.getResponse().getErrorCode() == 232748) {
                            ToastUtils.m9601y(C1527w.m1063b(R$string.second_share_device_hint), new Object[0]);
                        }
                        if (hiResult.getResponse().getErrorCode() == 232900) {
                            ToastUtils.m9601y(C1527w.m1063b(R$string.share_account_undefined), new Object[0]);
                        }
                    } else {
                        deviceViewModel.getShareList();
                        deviceViewModel.getShareDeviceLiveData().postValue(new Pair(Boolean.TRUE, ""));
                        ToastUtils.m9601y(C1527w.m1063b(R$string.share_success), new Object[0]);
                    }
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("bindDevice success：", hiResult));
                    deviceViewModel.updateLoadingStatus(false);
                }
            };
            final DeviceViewModel deviceViewModel2 = this.this$0;
            deviceService.shareDevices(str, str2, str3, r4, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Throwable th) {
                    deviceViewModel2.getShareDeviceLiveData().postValue(new Pair(Boolean.FALSE, ""));
                    deviceViewModel2.updateLoadingStatus(false);
                    ToastUtils.m9601y(C1527w.m1063b(R$string.share_fail), new Object[0]);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
