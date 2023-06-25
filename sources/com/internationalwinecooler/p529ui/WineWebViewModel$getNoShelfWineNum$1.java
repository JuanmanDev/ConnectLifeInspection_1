package com.internationalwinecooler.p529ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getNoShelfWineNum$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getNoShelfWineNum$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getNoShelfWineNum$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public final /* synthetic */ Ref.IntRef $inventoryType;
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getNoShelfWineNum$1(String str, String str2, Ref.IntRef intRef, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getNoShelfWineNum$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.$auid = str2;
        this.$inventoryType = intRef;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getNoShelfWineNum$1(this.$model, this.$auid, this.$inventoryType, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getNoShelfWineNum$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00bd A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ca A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d1 A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e9 A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6 A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f9 A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018a A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0197 A[Catch:{ all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0110 A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r11.label
            if (r0 != 0) goto L_0x01b2
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = r11.$model     // Catch:{ all -> 0x01a6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "wineInfo"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x01a6 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "photo"
            r1.remove(r2)     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r2 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r3.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "getNoShelfWineNum auid:"
            r3.append(r4)     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = r11.$auid     // Catch:{ all -> 0x01a6 }
            r3.append(r4)     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = ",  model:"
            r3.append(r4)     // Catch:{ all -> 0x01a6 }
            r3.append(r1)     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01a6 }
            r2.mo39138e(r1)     // Catch:{ all -> 0x01a6 }
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ all -> 0x01a6 }
            r1.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.Class<com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo> r2 = com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo.class
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, r2)     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r0 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r0     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r1 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "getNoShelfWineNum categoryId:"
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = r0.getCategoryId()     // Catch:{ all -> 0x01a6 }
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = ",  vivino:"
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = r0.getVivinoId()     // Catch:{ all -> 0x01a6 }
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.mo39138e(r2)     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r1 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r1 = r1.loginUserInfoProvider()     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = r0.getDeviceId()     // Catch:{ all -> 0x01a6 }
            java.util.List r1 = r1.getAllWineInventoryByDeviceId(r2)     // Catch:{ all -> 0x01a6 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01a6 }
            r3.<init>()     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x0091:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x01a6 }
            r5 = 1
            if (r4 == 0) goto L_0x0103
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x01a6 }
            r6 = r4
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r6 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r6     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = r6.getCategoryId()     // Catch:{ all -> 0x01a6 }
            if (r7 == 0) goto L_0x00ae
            int r7 = r7.length()     // Catch:{ all -> 0x01a6 }
            if (r7 != 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r7 = r12
            goto L_0x00af
        L_0x00ae:
            r7 = r5
        L_0x00af:
            if (r7 != 0) goto L_0x00ca
            java.lang.String r7 = r6.getCategoryId()     // Catch:{ all -> 0x01a6 }
            java.lang.String r8 = "0"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ all -> 0x01a6 }
            if (r7 != 0) goto L_0x00ca
            java.lang.String r7 = r0.getCategoryId()     // Catch:{ all -> 0x01a6 }
            java.lang.String r8 = r6.getCategoryId()     // Catch:{ all -> 0x01a6 }
            boolean r7 = android.text.TextUtils.equals(r7, r8)     // Catch:{ all -> 0x01a6 }
            goto L_0x00cb
        L_0x00ca:
            r7 = r12
        L_0x00cb:
            java.lang.String r8 = r6.getVivinoId()     // Catch:{ all -> 0x01a6 }
            if (r8 == 0) goto L_0x00da
            int r8 = r8.length()     // Catch:{ all -> 0x01a6 }
            if (r8 != 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r8 = r12
            goto L_0x00db
        L_0x00da:
            r8 = r5
        L_0x00db:
            if (r8 != 0) goto L_0x00f6
            java.lang.String r8 = r6.getVivinoId()     // Catch:{ all -> 0x01a6 }
            java.lang.String r9 = "-1"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x01a6 }
            if (r8 != 0) goto L_0x00f6
            java.lang.String r8 = r0.getVivinoId()     // Catch:{ all -> 0x01a6 }
            java.lang.String r6 = r6.getVivinoId()     // Catch:{ all -> 0x01a6 }
            boolean r6 = android.text.TextUtils.equals(r8, r6)     // Catch:{ all -> 0x01a6 }
            goto L_0x00f7
        L_0x00f6:
            r6 = r12
        L_0x00f7:
            if (r7 != 0) goto L_0x00fd
            if (r6 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r5 = r12
        L_0x00fd:
            if (r5 == 0) goto L_0x0091
            r3.add(r4)     // Catch:{ all -> 0x01a6 }
            goto L_0x0091
        L_0x0103:
            java.lang.String r0 = r11.$auid     // Catch:{ all -> 0x01a6 }
            kotlin.jvm.internal.Ref$IntRef r1 = r11.$inventoryType     // Catch:{ all -> 0x01a6 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01a6 }
            r4.<init>()     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x0110:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x019c
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x01a6 }
            r7 = r6
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r7 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r7     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r8 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r8 = r8.getInstance()     // Catch:{ all -> 0x01a6 }
            int r8 = r8.isDeviceType(r0)     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r9 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion     // Catch:{ all -> 0x01a6 }
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r9 = r9.getInstance()     // Catch:{ all -> 0x01a6 }
            int r9 = r9.getSingleZoneDevice()     // Catch:{ all -> 0x01a6 }
            java.lang.String r10 = "N"
            if (r8 == r9) goto L_0x0170
            int r8 = r1.element     // Catch:{ all -> 0x01a6 }
            if (r8 != 0) goto L_0x014e
            java.lang.String r8 = r7.getZoneName()     // Catch:{ all -> 0x01a6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01a6 }
            if (r8 != 0) goto L_0x0187
            java.lang.String r8 = r7.getZoneName()     // Catch:{ all -> 0x01a6 }
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r10)     // Catch:{ all -> 0x01a6 }
            if (r8 == 0) goto L_0x0185
            goto L_0x0187
        L_0x014e:
            java.lang.String r8 = r7.getZoneName()     // Catch:{ all -> 0x01a6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01a6 }
            if (r8 != 0) goto L_0x0187
            java.lang.String r8 = r7.getZoneName()     // Catch:{ all -> 0x01a6 }
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r10)     // Catch:{ all -> 0x01a6 }
            if (r8 != 0) goto L_0x0187
            int r8 = r7.getCellNum()     // Catch:{ all -> 0x01a6 }
            r9 = -1
            if (r8 == r9) goto L_0x0187
            int r8 = r7.getPositionNum()     // Catch:{ all -> 0x01a6 }
            if (r8 != r9) goto L_0x0185
            goto L_0x0187
        L_0x0170:
            java.lang.String r8 = r7.getZoneName()     // Catch:{ all -> 0x01a6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01a6 }
            if (r8 != 0) goto L_0x0187
            java.lang.String r8 = r7.getZoneName()     // Catch:{ all -> 0x01a6 }
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r10)     // Catch:{ all -> 0x01a6 }
            if (r8 == 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r8 = r12
            goto L_0x0188
        L_0x0187:
            r8 = r5
        L_0x0188:
            if (r8 == 0) goto L_0x0195
            long r9 = r7.getInventoryId()     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x01a6 }
            r2.add(r7)     // Catch:{ all -> 0x01a6 }
        L_0x0195:
            if (r8 == 0) goto L_0x0110
            r4.add(r6)     // Catch:{ all -> 0x01a6 }
            goto L_0x0110
        L_0x019c:
            int r0 = r4.size()     // Catch:{ all -> 0x01a6 }
            com.internationalwinecooler.ui.WineWebViewModel r1 = r11.this$0     // Catch:{ all -> 0x01a6 }
            com.internationalwinecooler.p529ui.WineWebViewModel.getNoShelfWineNum$evaluateJs(r1, r0, r2)     // Catch:{ all -> 0x01a6 }
            goto L_0x01af
        L_0x01a6:
            com.internationalwinecooler.ui.WineWebViewModel r0 = r11.this$0
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            com.internationalwinecooler.p529ui.WineWebViewModel.getNoShelfWineNum$evaluateJs(r0, r12, r1)
        L_0x01af:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x01b2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel$getNoShelfWineNum$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
