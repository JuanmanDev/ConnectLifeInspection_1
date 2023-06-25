package com.hisense.juconnect.app_device.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfile;
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
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$queryApplianceProfile$1", mo48701f = "DeviceViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$queryApplianceProfile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public final /* synthetic */ String $heidi;
    public int label;
    public final /* synthetic */ DeviceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceViewModel$queryApplianceProfile$1(String str, String str2, DeviceViewModel deviceViewModel, Continuation<? super DeviceViewModel$queryApplianceProfile$1> continuation) {
        super(2, continuation);
        this.$auid = str;
        this.$heidi = str2;
        this.this$0 = deviceViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceViewModel$queryApplianceProfile$1(this.$auid, this.$heidi, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceViewModel$queryApplianceProfile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
            String str = this.$auid;
            String str2 = this.$heidi;
            final DeviceViewModel deviceViewModel = this.this$0;
            C86301 r2 = new Function1<ApplianceProfile, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ApplianceProfile) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void invoke(@org.jetbrains.annotations.Nullable com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfile r6) {
                    /*
                        r5 = this;
                        com.hisense.connect_life.core.utils.LoggerUtil$Companion r0 = com.hisense.connect_life.core.utils.LoggerUtil.Companion
                        java.lang.String r1 = "gaojinbao queryApplianceProfile success："
                        java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r6)
                        r0.mo39146e(r2)
                        com.hisense.connect_life.core.utils.LoggerUtil$Companion r0 = com.hisense.connect_life.core.utils.LoggerUtil.Companion
                        r2 = 0
                        if (r6 != 0) goto L_0x0012
                        r3 = r2
                        goto L_0x0016
                    L_0x0012:
                        java.lang.String r3 = r6.getType()
                    L_0x0016:
                        java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
                        r0.mo39146e(r1)
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r0 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache r0 = r0.getInstance()
                        if (r6 != 0) goto L_0x0027
                        r1 = r2
                        goto L_0x002b
                    L_0x0027:
                        java.lang.String r1 = r6.getAuId()
                    L_0x002b:
                        int r0 = r0.isDeviceType(r1)
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r1 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache r1 = r1.getInstance()
                        int r1 = r1.getSingleZoneDevice()
                        r3 = 0
                        r4 = 1
                        if (r0 == r1) goto L_0x005e
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r0 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache r0 = r0.getInstance()
                        if (r6 != 0) goto L_0x0047
                        r1 = r2
                        goto L_0x004b
                    L_0x0047:
                        java.lang.String r1 = r6.getAuId()
                    L_0x004b:
                        int r0 = r0.isDeviceType(r1)
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r1 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                        com.hisense.connect_life.hismart.networks.request.device.DeviceCache r1 = r1.getInstance()
                        int r1 = r1.getBattleSingleZoneDevice()
                        if (r0 != r1) goto L_0x005c
                        goto L_0x005e
                    L_0x005c:
                        r0 = r3
                        goto L_0x005f
                    L_0x005e:
                        r0 = r4
                    L_0x005f:
                        if (r6 != 0) goto L_0x0062
                        goto L_0x0066
                    L_0x0062:
                        java.lang.String r2 = r6.getType()
                    L_0x0066:
                        java.lang.String r6 = "WINE-COOLER"
                        boolean r6 = kotlin.text.StringsKt__StringsJVMKt.equals(r2, r6, r4)
                        if (r6 != 0) goto L_0x007d
                        if (r0 == 0) goto L_0x0071
                        goto L_0x007d
                    L_0x0071:
                        com.hisense.juconnect.app_device.viewmodel.DeviceViewModel r6 = r3
                        androidx.lifecycle.MutableLiveData r6 = r6.getSingleZoneQrCodeAuidTypeLiveData()
                        java.lang.Boolean r0 = java.lang.Boolean.FALSE
                        r6.postValue(r0)
                        goto L_0x0088
                    L_0x007d:
                        com.hisense.juconnect.app_device.viewmodel.DeviceViewModel r6 = r3
                        androidx.lifecycle.MutableLiveData r6 = r6.getSingleZoneQrCodeAuidTypeLiveData()
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        r6.postValue(r0)
                    L_0x0088:
                        com.hisense.juconnect.app_device.viewmodel.DeviceViewModel r6 = r3
                        r6.updateLoadingStatus(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$queryApplianceProfile$1.C86301.invoke(com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfile):void");
                }
            };
            final DeviceViewModel deviceViewModel2 = this.this$0;
            deviceService.queryApplianceProfile(str, str2, r2, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("queryApplianceProfile failure：", th));
                    deviceViewModel2.getSingleZoneQrCodeAuidTypeLiveData().postValue(Boolean.FALSE);
                    deviceViewModel2.updateLoadingStatus(false);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
