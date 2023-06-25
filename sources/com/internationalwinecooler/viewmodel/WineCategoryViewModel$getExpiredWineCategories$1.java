package com.internationalwinecooler.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getExpiredWineCategories$1 extends Lambda implements Function1<QueryCategoryResult, Unit> {
    public final /* synthetic */ MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> $expiredLiveData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$getExpiredWineCategories$1(MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> mutableLiveData) {
        super(1);
        this.$expiredLiveData = mutableLiveData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QueryCategoryResult) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017 A[Catch:{ Exception -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[Catch:{ Exception -> 0x005e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.NotNull com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult r5) {
        /*
            r4 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.List r0 = r5.getCategoryList()     // Catch:{ Exception -> 0x005e }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.isEmpty()     // Catch:{ Exception -> 0x005e }
            if (r1 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r1 = 0
            goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            if (r1 == 0) goto L_0x003e
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r1 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x005e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e }
            r2.<init>()     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = "获取过期的酒品类成功isNullOrEmpty  "
            r2.append(r3)     // Catch:{ Exception -> 0x005e }
            int r0 = r0.size()     // Catch:{ Exception -> 0x005e }
            r2.append(r0)     // Catch:{ Exception -> 0x005e }
            r0 = 32
            r2.append(r0)     // Catch:{ Exception -> 0x005e }
            int r5 = r5.getResultCode()     // Catch:{ Exception -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x005e }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x005e }
            r1.mo39140i(r5)     // Catch:{ Exception -> 0x005e }
            goto L_0x0079
        L_0x003e:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r5 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x005e }
            java.lang.String r1 = "获取过期的酒品类成功  size is "
            int r2 = r0.size()     // Catch:{ Exception -> 0x005e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x005e }
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)     // Catch:{ Exception -> 0x005e }
            r5.mo39140i(r1)     // Catch:{ Exception -> 0x005e }
            androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo>>> r5 = r4.$expiredLiveData     // Catch:{ Exception -> 0x005e }
            kotlin.Pair r1 = new kotlin.Pair     // Catch:{ Exception -> 0x005e }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005e }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x005e }
            r5.postValue(r1)     // Catch:{ Exception -> 0x005e }
            goto L_0x0079
        L_0x005e:
            r5 = move-exception
            r5.printStackTrace()
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.String r0 = "获取过期的酒品类失败"
            r5.println(r0)
            androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo>>> r5 = r4.$expiredLiveData
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r0.<init>(r1, r2)
            r5.postValue(r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.viewmodel.WineCategoryViewModel$getExpiredWineCategories$1.invoke(com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult):void");
    }
}
