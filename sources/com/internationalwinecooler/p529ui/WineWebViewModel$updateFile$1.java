package com.internationalwinecooler.p529ui;

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
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$updateFile$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateFile$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$updateFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$updateFile$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$updateFile$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$updateFile$1(this.$model, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$updateFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r0 = r0.toString();
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            if (r0 != 0) goto L_0x00b0
            kotlin.ResultKt.throwOnFailure(r10)
            org.json.JSONObject r10 = new org.json.JSONObject
            java.lang.String r0 = r9.$model
            r10.<init>(r0)
            java.lang.String r0 = "wifiId"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x001d
        L_0x001b:
            r3 = r1
            goto L_0x0025
        L_0x001d:
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            r3 = r0
        L_0x0025:
            java.lang.String r0 = "deviceId"
            java.lang.Object r0 = r10.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            r4 = r1
            goto L_0x0037
        L_0x002f:
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0036
            goto L_0x002d
        L_0x0036:
            r4 = r0
        L_0x0037:
            java.lang.String r0 = "uploadFile"
            java.lang.Object r0 = r10.get(r0)
            if (r0 != 0) goto L_0x0041
        L_0x003f:
            r0 = r1
            goto L_0x0048
        L_0x0041:
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0048
            goto L_0x003f
        L_0x0048:
            java.lang.String r2 = "fileType"
            java.lang.Object r10 = r10.get(r2)
            if (r10 != 0) goto L_0x0052
        L_0x0050:
            r6 = r1
            goto L_0x005a
        L_0x0052:
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L_0x0059
            goto L_0x0050
        L_0x0059:
            r6 = r10
        L_0x005a:
            com.hisense.connect_life.core.utils.FileUtils$Companion r10 = com.hisense.connect_life.core.utils.FileUtils.Companion
            java.io.File r5 = r10.decoderBase64ToFile(r0)
            if (r5 == 0) goto L_0x008a
            boolean r10 = r5.isFile()
            if (r10 == 0) goto L_0x008a
            boolean r10 = r5.exists()
            if (r10 == 0) goto L_0x008a
            com.hisense.connect_life.hismart.core.HiSmart$Companion r10 = com.hisense.connect_life.hismart.core.HiSmart.Companion
            com.hisense.connect_life.hismart.core.HiSmart r10 = r10.getInstance()
            com.hisense.connect_life.hismart.networks.request.device.IDeviceService r2 = r10.deviceService()
            com.internationalwinecooler.ui.WineWebViewModel$updateFile$1$1 r7 = new com.internationalwinecooler.ui.WineWebViewModel$updateFile$1$1
            com.internationalwinecooler.ui.WineWebViewModel r10 = r9.this$0
            r7.<init>(r10)
            com.internationalwinecooler.ui.WineWebViewModel$updateFile$1$2 r8 = new com.internationalwinecooler.ui.WineWebViewModel$updateFile$1$2
            com.internationalwinecooler.ui.WineWebViewModel r10 = r9.this$0
            r8.<init>(r10)
            r2.updateFile(r3, r4, r5, r6, r7, r8)
            goto L_0x00ad
        L_0x008a:
            com.internationalwinecooler.model.JsResp r10 = new com.internationalwinecooler.model.JsResp
            r0 = 1
            r10.<init>(r1, r0, r1)
            com.internationalwinecooler.ui.WineWebViewModel r0 = r9.this$0
            androidx.lifecycle.MutableLiveData r0 = r0.getEvaluateJsLiveData()
            kotlin.Pair r2 = new kotlin.Pair
            com.internationalwinecooler.ui.WebActionEnum r3 = com.internationalwinecooler.p529ui.WebActionEnum.UPDATE_FILE_CALLBACK
            com.google.gson.Gson r4 = new com.google.gson.Gson
            r4.<init>()
            java.lang.String r10 = r4.toJson((java.lang.Object) r10)
            if (r10 != 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r1 = r10
        L_0x00a7:
            r2.<init>(r3, r1)
            r0.postValue(r2)
        L_0x00ad:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00b0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel$updateFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
