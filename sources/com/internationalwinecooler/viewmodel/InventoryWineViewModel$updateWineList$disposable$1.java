package com.internationalwinecooler.viewmodel;

import com.juconnect.connectlife.model.LastChangeBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/juconnect/connectlife/model/LastChangeBean;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$updateWineList$disposable$1 extends Lambda implements Function1<LastChangeBean, Unit> {
    public final /* synthetic */ Function0<Unit> $action;
    public final /* synthetic */ Function1<String, Unit> $failure;
    public final /* synthetic */ String $identityPage;
    public final /* synthetic */ boolean $returnRemoved;
    public final /* synthetic */ InventoryWineViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWineViewModel$updateWineList$disposable$1(boolean z, Function0<Unit> function0, InventoryWineViewModel inventoryWineViewModel, String str, Function1<? super String, Unit> function1) {
        super(1);
        this.$returnRemoved = z;
        this.$action = function0;
        this.this$0 = inventoryWineViewModel;
        this.$identityPage = str;
        this.$failure = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LastChangeBean) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r8 = r8.getLastChange();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.Nullable com.juconnect.connectlife.model.LastChangeBean r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            if (r8 != 0) goto L_0x0006
        L_0x0004:
            r3 = r0
            goto L_0x000e
        L_0x0006:
            java.lang.String r8 = r8.getLastChange()
            if (r8 != 0) goto L_0x000d
            goto L_0x0004
        L_0x000d:
            r3 = r8
        L_0x000e:
            com.hisense.connect_life.core.utils.LoggerUtil$Companion r8 = com.hisense.connect_life.core.utils.LoggerUtil.Companion
            java.lang.String r0 = "updateWineList== "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r3)
            r8.mo39146e(r0)
            java.lang.String r8 = "sp_last_change"
            c.c.a.a.t r0 = p040c.p072c.p073a.p074a.C1524t.m1042f(r8)
            java.lang.String r1 = "key_last_change_inventory"
            java.lang.String r0 = r0.mo15419i(r1)
            c.c.a.a.t r8 = p040c.p072c.p073a.p074a.C1524t.m1042f(r8)
            java.lang.String r1 = "KEY_INVENTORY_CATEGORY"
            java.lang.String r2 = "0"
            java.lang.String r8 = r8.mo15420j(r1, r2)
            boolean r1 = r7.$returnRemoved
            java.lang.String r4 = "1"
            if (r1 == 0) goto L_0x0038
            r2 = r4
        L_0x0038:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r4)
            if (r1 != 0) goto L_0x0047
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r2)
            if (r8 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r8 = 0
            goto L_0x0048
        L_0x0047:
            r8 = 1
        L_0x0048:
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x005d
            com.hisense.connect_life.core.utils.LoggerUtil$Companion r8 = com.hisense.connect_life.core.utils.LoggerUtil.Companion
            java.lang.String r0 = "updateWineList== 使用缓存"
            r8.mo39146e(r0)
            kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r7.$action
            r8.invoke()
            goto L_0x006a
        L_0x005d:
            com.internationalwinecooler.viewmodel.InventoryWineViewModel r1 = r7.this$0
            java.lang.String r2 = r7.$identityPage
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r7.$action
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r5 = r7.$failure
            boolean r6 = r7.$returnRemoved
            r1.queryRemoteWineList(r2, r3, r4, r5, r6)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.viewmodel.InventoryWineViewModel$updateWineList$disposable$1.invoke(com.juconnect.connectlife.model.LastChangeBean):void");
    }
}
