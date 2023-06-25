package com.hisense.juconnect.app_device.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel$getLocalWineList$1", mo48701f = "WineLabelScannerSuccessViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: WineLabelScannerSuccessViewModel.kt */
public final class WineLabelScannerSuccessViewModel$getLocalWineList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $vivinoId;
    public int label;
    public final /* synthetic */ WineLabelScannerSuccessViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineLabelScannerSuccessViewModel$getLocalWineList$1(String str, WineLabelScannerSuccessViewModel wineLabelScannerSuccessViewModel, Continuation<? super WineLabelScannerSuccessViewModel$getLocalWineList$1> continuation) {
        super(2, continuation);
        this.$vivinoId = str;
        this.this$0 = wineLabelScannerSuccessViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineLabelScannerSuccessViewModel$getLocalWineList$1(this.$vivinoId, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineLabelScannerSuccessViewModel$getLocalWineList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d A[Catch:{ Exception -> 0x0091 }] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getLocalWineList vivioId is  "
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            if (r1 != 0) goto L_0x00ac
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r1 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x0091 }
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r1 = r1.loginUserInfoProvider()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r6.$vivinoId     // Catch:{ Exception -> 0x0091 }
            java.util.List r1 = r1.queryByVivinoId(r2)     // Catch:{ Exception -> 0x0091 }
            r2 = 1
            if (r1 == 0) goto L_0x0025
            boolean r3 = r1.isEmpty()     // Catch:{ Exception -> 0x0091 }
            if (r3 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r3 = r7
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            if (r3 != 0) goto L_0x006d
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r3 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x0091 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
            r4.<init>()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r5 = "getLocalWineList 数量 "
            r4.append(r5)     // Catch:{ Exception -> 0x0091 }
            int r5 = r1.size()     // Catch:{ Exception -> 0x0091 }
            r4.append(r5)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r5 = "  vivioId is  "
            r4.append(r5)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r5 = r6.$vivinoId     // Catch:{ Exception -> 0x0091 }
            r4.append(r5)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0091 }
            r3.mo39138e(r4)     // Catch:{ Exception -> 0x0091 }
            com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel r3 = r6.this$0     // Catch:{ Exception -> 0x0091 }
            androidx.lifecycle.MutableLiveData r3 = r3.getCategoryIdLiveData()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ Exception -> 0x0091 }
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r1 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r1     // Catch:{ Exception -> 0x0091 }
            java.lang.String r1 = r1.getCategoryId()     // Catch:{ Exception -> 0x0091 }
            r3.postValue(r1)     // Catch:{ Exception -> 0x0091 }
            com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel r1 = r6.this$0     // Catch:{ Exception -> 0x0091 }
            androidx.lifecycle.MutableLiveData r1 = r1.isInventoryLiveData()     // Catch:{ Exception -> 0x0091 }
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch:{ Exception -> 0x0091 }
            r1.postValue(r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x00a9
        L_0x006d:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r1 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r6.$vivinoId     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)     // Catch:{ Exception -> 0x0091 }
            r1.mo39138e(r2)     // Catch:{ Exception -> 0x0091 }
            com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel r1 = r6.this$0     // Catch:{ Exception -> 0x0091 }
            androidx.lifecycle.MutableLiveData r1 = r1.getCategoryIdLiveData()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = "0"
            r1.postValue(r2)     // Catch:{ Exception -> 0x0091 }
            com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel r1 = r6.this$0     // Catch:{ Exception -> 0x0091 }
            androidx.lifecycle.MutableLiveData r1 = r1.isInventoryLiveData()     // Catch:{ Exception -> 0x0091 }
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)     // Catch:{ Exception -> 0x0091 }
            r1.postValue(r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x00a9
        L_0x0091:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r1 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion
            java.lang.String r2 = r6.$vivinoId
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            r1.mo39138e(r0)
            com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel r0 = r6.this$0
            androidx.lifecycle.MutableLiveData r0 = r0.isInventoryLiveData()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            r0.postValue(r7)
        L_0x00a9:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00ac:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel$getLocalWineList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
