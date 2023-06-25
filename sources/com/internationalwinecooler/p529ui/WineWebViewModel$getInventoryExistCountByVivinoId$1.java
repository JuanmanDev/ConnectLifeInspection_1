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
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getInventoryExistCountByVivinoId$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getInventoryExistCountByVivinoId$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getInventoryExistCountByVivinoId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getInventoryExistCountByVivinoId$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getInventoryExistCountByVivinoId$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getInventoryExistCountByVivinoId$1(this.$model, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getInventoryExistCountByVivinoId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[Catch:{ all -> 0x0058 }] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
        /*
            r2 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r2.label
            if (r0 != 0) goto L_0x0068
            kotlin.ResultKt.throwOnFailure(r3)
            com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch:{ all -> 0x0058 }
            r3.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = r2.$model     // Catch:{ all -> 0x0058 }
            java.lang.Class<com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo> r1 = com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo.class
            java.lang.Object r3 = r3.fromJson((java.lang.String) r0, r1)     // Catch:{ all -> 0x0058 }
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r3 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r3     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = r3.getCategoryId()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = r3.getCategoryId()     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0038
            goto L_0x0049
        L_0x0038:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r0 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "getInventoryExistCountByVivinoId: 缓存查询"
            r0.mo39138e(r1)     // Catch:{ all -> 0x0058 }
            com.internationalwinecooler.ui.WineWebViewModel r0 = r2.this$0     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = r3.getCategoryId()     // Catch:{ all -> 0x0058 }
            r0.searchCategoryExiestWithCategory(r3)     // Catch:{ all -> 0x0058 }
            goto L_0x0065
        L_0x0049:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r3 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "getInventoryExistCountByVivinoId: searchCategoryExiestWithNet"
            r3.mo39138e(r0)     // Catch:{ all -> 0x0058 }
            com.internationalwinecooler.ui.WineWebViewModel r3 = r2.this$0     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = r2.$model     // Catch:{ all -> 0x0058 }
            r3.searchCategoryExiestWithNet(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x0065
        L_0x0058:
            r3 = move-exception
            r3.printStackTrace()
            com.internationalwinecooler.ui.WineWebViewModel r0 = r2.this$0
            java.lang.String r3 = r3.toString()
            r0.queryInventCountByVivioIdError(r3)
        L_0x0065:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L_0x0068:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel$getInventoryExistCountByVivinoId$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
