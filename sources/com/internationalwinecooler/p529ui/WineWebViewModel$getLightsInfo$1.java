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
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getLightsInfo$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getLightsInfo$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getLightsInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getLightsInfo$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getLightsInfo$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getLightsInfo$1(this.$model, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getLightsInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x038d  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r0 = "SwitchModeOntime"
            java.lang.String r2 = "SwitchBColour"
            java.lang.String r3 = "SwitchGColour"
            java.lang.String r4 = "SwitchRColour"
            java.lang.String r5 = "SwitchRGBLightIntensity"
            java.lang.String r6 = "SwitchLightsColour"
            java.lang.String r7 = "SwitchLightsIntensity"
            java.lang.String r8 = "FunctionalBcolour"
            java.lang.String r9 = "FunctionalGcolour"
            java.lang.String r10 = "FunctionalRcolour"
            java.lang.String r11 = "FunctionalRGBlightIntensity"
            java.lang.String r12 = "AmbientLightsColour"
            java.lang.String r13 = "FunctionalOntime"
            java.lang.String r14 = "AmbientOntime"
            java.lang.String r15 = "AmbientRcolour"
            r16 = r0
            java.lang.String r0 = "AmbientRGBlightIntensity"
            r17 = r2
            java.lang.String r2 = "AmbientGcolour"
            r18 = r3
            java.lang.String r3 = "AmbientBcolour"
            r19 = r4
            java.lang.String r4 = "FunctionalLightsColour"
            r20 = r5
            java.lang.String r5 = "FunctionalLightsIntensity"
            r21 = r6
            java.lang.String r6 = "AmbientLightsIntensity"
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r22 = r7
            int r7 = r1.label
            if (r7 != 0) goto L_0x0397
            kotlin.ResultKt.throwOnFailure(r26)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0384 }
            r23 = r8
            java.lang.String r8 = r1.$model     // Catch:{ JSONException -> 0x0384 }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r8 = "deviceId"
            java.lang.String r7 = r7.getString(r8)     // Catch:{ JSONException -> 0x0384 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0384 }
            if (r8 == 0) goto L_0x006e
            com.internationalwinecooler.ui.WineWebViewModel r0 = r1.this$0     // Catch:{ JSONException -> 0x0384 }
            r2 = 2131821460(0x7f110394, float:1.9275664E38)
            java.lang.String r2 = p040c.p072c.p073a.p074a.C1527w.m1063b(r2)     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r3 = "getString(R.string.parameter_error)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ JSONException -> 0x0384 }
            com.internationalwinecooler.ui.WebActionEnum r3 = com.internationalwinecooler.p529ui.WebActionEnum.GET_LIGHT_CALLBACK     // Catch:{ JSONException -> 0x0384 }
            r0.executeFailCallback(r2, r3)     // Catch:{ JSONException -> 0x0384 }
            goto L_0x0394
        L_0x006e:
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r8 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion     // Catch:{ JSONException -> 0x0384 }
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r8 = r8.getInstance()     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r1 = "auid"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)     // Catch:{ JSONException -> 0x0380 }
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r1 = r8.getDevice(r7)     // Catch:{ JSONException -> 0x0380 }
            if (r1 != 0) goto L_0x0081
            r8 = 0
            goto L_0x0085
        L_0x0081:
            com.google.gson.JsonObject r8 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
        L_0x0085:
            if (r8 == 0) goto L_0x036a
            if (r1 != 0) goto L_0x008b
            r8 = 0
            goto L_0x008f
        L_0x008b:
            com.google.gson.JsonObject r8 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
        L_0x008f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch:{ JSONException -> 0x0380 }
            int r8 = r8.size()     // Catch:{ JSONException -> 0x0380 }
            if (r8 <= 0) goto L_0x036a
            com.google.gson.JsonObject r8 = new com.google.gson.JsonObject     // Catch:{ JSONException -> 0x0380 }
            r8.<init>()     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r7 = new com.google.gson.JsonObject     // Catch:{ JSONException -> 0x0380 }
            r7.<init>()     // Catch:{ JSONException -> 0x0380 }
            r24 = r8
            com.google.gson.JsonObject r8 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r8 = r8.get(r5)     // Catch:{ JSONException -> 0x0380 }
            if (r8 != 0) goto L_0x00b3
            r8 = 0
            goto L_0x00bb
        L_0x00b3:
            int r8 = r8.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)     // Catch:{ JSONException -> 0x0380 }
        L_0x00bb:
            r7.addProperty((java.lang.String) r5, (java.lang.Number) r8)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r5 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r5 = r5.get(r4)     // Catch:{ JSONException -> 0x0380 }
            if (r5 != 0) goto L_0x00cd
            r5 = 0
            goto L_0x00d5
        L_0x00cd:
            int r5 = r5.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)     // Catch:{ JSONException -> 0x0380 }
        L_0x00d5:
            r7.addProperty((java.lang.String) r4, (java.lang.Number) r5)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r4 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r4 = r4.get(r3)     // Catch:{ JSONException -> 0x0380 }
            if (r4 != 0) goto L_0x00e7
            r4 = 0
            goto L_0x00ef
        L_0x00e7:
            int r4 = r4.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)     // Catch:{ JSONException -> 0x0380 }
        L_0x00ef:
            r7.addProperty((java.lang.String) r3, (java.lang.Number) r4)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r3 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r3 = r3.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r3 != 0) goto L_0x0101
            r3 = 0
            goto L_0x0109
        L_0x0101:
            int r3 = r3.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)     // Catch:{ JSONException -> 0x0380 }
        L_0x0109:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r3)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r2 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r2 = r2.get(r6)     // Catch:{ JSONException -> 0x0380 }
            if (r2 != 0) goto L_0x011b
            r2 = 0
            goto L_0x0123
        L_0x011b:
            int r2 = r2.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch:{ JSONException -> 0x0380 }
        L_0x0123:
            r7.addProperty((java.lang.String) r6, (java.lang.Number) r2)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r2 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r2 = r2.get(r0)     // Catch:{ JSONException -> 0x0380 }
            if (r2 != 0) goto L_0x0135
            r2 = 0
            goto L_0x013d
        L_0x0135:
            int r2 = r2.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch:{ JSONException -> 0x0380 }
        L_0x013d:
            r7.addProperty((java.lang.String) r0, (java.lang.Number) r2)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r15)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x014f
            r0 = 0
            goto L_0x0157
        L_0x014f:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x0157:
            r7.addProperty((java.lang.String) r15, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r14)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x0169
            r0 = 0
            goto L_0x0171
        L_0x0169:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x0171:
            r7.addProperty((java.lang.String) r14, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r13)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x0183
            r0 = 0
            goto L_0x018b
        L_0x0183:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x018b:
            r7.addProperty((java.lang.String) r13, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r6)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x019d
            r0 = 0
            goto L_0x01a5
        L_0x019d:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x01a5:
            r7.addProperty((java.lang.String) r6, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r12)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x01b7
            r0 = 0
            goto L_0x01bf
        L_0x01b7:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x01bf:
            r7.addProperty((java.lang.String) r12, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r11)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x01d1
            r0 = 0
            goto L_0x01d9
        L_0x01d1:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x01d9:
            r7.addProperty((java.lang.String) r11, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r10)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x01eb
            r0 = 0
            goto L_0x01f3
        L_0x01eb:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x01f3:
            r7.addProperty((java.lang.String) r10, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonElement r0 = r0.get(r9)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x0205
            r0 = 0
            goto L_0x020d
        L_0x0205:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x020d:
            r7.addProperty((java.lang.String) r9, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r23
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x0221
            r0 = 0
            goto L_0x0229
        L_0x0221:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x0229:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r22
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x023d
            r0 = 0
            goto L_0x0245
        L_0x023d:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x0245:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r21
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x0259
            r0 = 0
            goto L_0x0261
        L_0x0259:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x0261:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r20
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x0275
            r0 = 0
            goto L_0x027d
        L_0x0275:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x027d:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r19
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x0291
            r0 = 0
            goto L_0x0299
        L_0x0291:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x0299:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r18
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x02ad
            r0 = 0
            goto L_0x02b5
        L_0x02ad:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x02b5:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r17
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x02c9
            r0 = 0
            goto L_0x02d1
        L_0x02c9:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x02d1:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            com.google.gson.JsonObject r0 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ JSONException -> 0x0380 }
            r2 = r16
            com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r0 != 0) goto L_0x02e5
            r0 = 0
            goto L_0x02ed
        L_0x02e5:
            int r0 = r0.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ JSONException -> 0x0380 }
        L_0x02ed:
            r7.addProperty((java.lang.String) r2, (java.lang.Number) r0)     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r0 = "SaveSwitchMode"
            com.google.gson.JsonObject r2 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r3 = "SaveSwitchMode"
            com.google.gson.JsonElement r2 = r2.get(r3)     // Catch:{ JSONException -> 0x0380 }
            if (r2 != 0) goto L_0x0303
            r2 = 0
            goto L_0x030b
        L_0x0303:
            int r2 = r2.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch:{ JSONException -> 0x0380 }
        L_0x030b:
            r7.addProperty((java.lang.String) r0, (java.lang.Number) r2)     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r0 = "RemoteControlMode"
            com.google.gson.JsonObject r1 = r1.getProperties()     // Catch:{ JSONException -> 0x0380 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r2 = "RemoteControlMode"
            com.google.gson.JsonElement r1 = r1.get(r2)     // Catch:{ JSONException -> 0x0380 }
            if (r1 != 0) goto L_0x0321
            r1 = 0
            goto L_0x0329
        L_0x0321:
            int r1 = r1.getAsInt()     // Catch:{ JSONException -> 0x0380 }
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ JSONException -> 0x0380 }
        L_0x0329:
            r7.addProperty((java.lang.String) r0, (java.lang.Number) r1)     // Catch:{ JSONException -> 0x0380 }
            com.hisense.connect_life.core.utils.LoggerUtil$Companion r0 = com.hisense.connect_life.core.utils.LoggerUtil.Companion     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r1 = "jsonData: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r7)     // Catch:{ JSONException -> 0x0380 }
            r0.mo39146e(r1)     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r0 = "resultCode"
            r1 = 0
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ JSONException -> 0x0380 }
            r2 = r24
            r2.addProperty((java.lang.String) r0, (java.lang.Number) r1)     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r0 = "data"
            r2.add(r0, r7)     // Catch:{ JSONException -> 0x0380 }
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r0 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ JSONException -> 0x0380 }
            java.lang.String r1 = "getLightsInfo callback: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)     // Catch:{ JSONException -> 0x0380 }
            r0.mo39138e(r1)     // Catch:{ JSONException -> 0x0380 }
            r1 = r25
            com.internationalwinecooler.ui.WineWebViewModel r0 = r1.this$0     // Catch:{ JSONException -> 0x0384 }
            androidx.lifecycle.MutableLiveData r0 = r0.getEvaluateJsLiveData()     // Catch:{ JSONException -> 0x0384 }
            kotlin.Pair r3 = new kotlin.Pair     // Catch:{ JSONException -> 0x0384 }
            com.internationalwinecooler.ui.WebActionEnum r4 = com.internationalwinecooler.p529ui.WebActionEnum.GET_LIGHT_CALLBACK     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x0384 }
            r3.<init>(r4, r2)     // Catch:{ JSONException -> 0x0384 }
            r0.postValue(r3)     // Catch:{ JSONException -> 0x0384 }
            goto L_0x0394
        L_0x036a:
            r1 = r25
            com.internationalwinecooler.ui.WineWebViewModel r0 = r1.this$0     // Catch:{ JSONException -> 0x0384 }
            r2 = 2131821861(0x7f110525, float:1.9276477E38)
            java.lang.String r2 = p040c.p072c.p073a.p074a.C1527w.m1063b(r2)     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r3 = "getString(R.string.unit_exception)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ JSONException -> 0x0384 }
            com.internationalwinecooler.ui.WebActionEnum r3 = com.internationalwinecooler.p529ui.WebActionEnum.GET_LIGHT_CALLBACK     // Catch:{ JSONException -> 0x0384 }
            r0.executeFailCallback(r2, r3)     // Catch:{ JSONException -> 0x0384 }
            goto L_0x0394
        L_0x0380:
            r0 = move-exception
            r1 = r25
            goto L_0x0385
        L_0x0384:
            r0 = move-exception
        L_0x0385:
            com.internationalwinecooler.ui.WineWebViewModel r2 = r1.this$0
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x038f
            java.lang.String r0 = ""
        L_0x038f:
            com.internationalwinecooler.ui.WebActionEnum r3 = com.internationalwinecooler.p529ui.WebActionEnum.GET_LIGHT_CALLBACK
            r2.executeFailCallback(r0, r3)
        L_0x0394:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0397:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel$getLightsInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
