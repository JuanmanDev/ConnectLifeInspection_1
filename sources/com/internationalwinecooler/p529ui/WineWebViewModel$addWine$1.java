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
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$addWine$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$addWine$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$addWine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$addWine$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$addWine$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$addWine$1(this.$model, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$addWine$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca A[Catch:{ all -> 0x00d0 }] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            if (r0 != 0) goto L_0x00de
            kotlin.ResultKt.throwOnFailure(r5)
            r5 = 1
            java.lang.String r0 = r4.$model     // Catch:{ all -> 0x00d0 }
            java.lang.Class<com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine> r1 = com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine.class
            java.lang.Object r0 = p040c.p072c.p073a.p074a.C1502i.m924d(r0, r1)     // Catch:{ all -> 0x00d0 }
            com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine r0 = (com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine) r0     // Catch:{ all -> 0x00d0 }
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r1 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion     // Catch:{ all -> 0x00d0 }
            com.hisense.connect_life.hismart.networks.request.device.DeviceCache r1 = r1.getInstance()     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r0.getDeviceId()     // Catch:{ all -> 0x00d0 }
            com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo r1 = r1.getDevice(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "wineType is "
            java.lang.String r3 = r0.getWineType()     // Catch:{ all -> 0x00d0 }
            kotlin.jvm.internal.Intrinsics.stringPlus(r2, r3)     // Catch:{ all -> 0x00d0 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = r1.getWifiId()     // Catch:{ all -> 0x00d0 }
            r0.setWifiId(r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = r0.getWineType()     // Catch:{ all -> 0x00d0 }
            r2 = 0
            if (r1 == 0) goto L_0x0046
            int r1 = r1.length()     // Catch:{ all -> 0x00d0 }
            if (r1 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r1 = r2
            goto L_0x0047
        L_0x0046:
            r1 = r5
        L_0x0047:
            if (r1 == 0) goto L_0x0055
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "add wine  wineType is null"
            r1.println(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "Red Wine"
            r0.setWineType(r1)     // Catch:{ all -> 0x00d0 }
        L_0x0055:
            java.lang.String r1 = r0.getWineName()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0064
            int r1 = r1.length()     // Catch:{ all -> 0x00d0 }
            if (r1 != 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r1 = r2
            goto L_0x0065
        L_0x0064:
            r1 = r5
        L_0x0065:
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = "Other"
            r0.setWineName(r1)     // Catch:{ all -> 0x00d0 }
        L_0x006c:
            java.util.List r1 = r0.getFoodMatch()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x007b
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r1 = r2
            goto L_0x007c
        L_0x007b:
            r1 = r5
        L_0x007c:
            r3 = 0
            if (r1 == 0) goto L_0x0082
            r0.setFoodMatch(r3)     // Catch:{ all -> 0x00d0 }
        L_0x0082:
            java.util.List r1 = r0.getGrapes()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x008e
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x008f
        L_0x008e:
            r2 = r5
        L_0x008f:
            if (r2 == 0) goto L_0x0094
            r0.setGrapes(r3)     // Catch:{ all -> 0x00d0 }
        L_0x0094:
            com.internationalwinecooler.ui.WineWebViewModel r1 = r4.this$0     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "h5AddWine"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x00d0 }
            r1.handleAddWinePicture(r0)     // Catch:{ all -> 0x00d0 }
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "添加酒categoryId IS "
            java.lang.Long r3 = r0.getCategoryId()     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r3)     // Catch:{ all -> 0x00d0 }
            r1.println(r2)     // Catch:{ all -> 0x00d0 }
            boolean r1 = r0.categoryExists()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00ca
            com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult r1 = new com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult     // Catch:{ all -> 0x00d0 }
            java.lang.Long r2 = r0.getCategoryId()     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = r0.getPhoneUrl()     // Catch:{ all -> 0x00d0 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x00d0 }
            com.internationalwinecooler.ui.WineWebViewModel r2 = r4.this$0     // Catch:{ all -> 0x00d0 }
            com.hisense.connect_life.hismart.networks.request.wine.model.AddWine r0 = r0.getAddWine()     // Catch:{ all -> 0x00d0 }
            r2.addWineDirectly(r0, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00db
        L_0x00ca:
            com.internationalwinecooler.ui.WineWebViewModel r1 = r4.this$0     // Catch:{ all -> 0x00d0 }
            r1.searchCategoryExist(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00db
        L_0x00d0:
            r0 = move-exception
            r0.printStackTrace()
            com.internationalwinecooler.ui.WineWebViewModel r0 = r4.this$0
            java.lang.String r1 = "model is error"
            r0.addWineInfoError(r1, r5)
        L_0x00db:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x00de:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel$addWine$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
