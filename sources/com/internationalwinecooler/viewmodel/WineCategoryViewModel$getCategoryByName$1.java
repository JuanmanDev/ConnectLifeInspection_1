package com.internationalwinecooler.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "it", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$getCategoryByName$1 extends Lambda implements Function1<List<? extends WineCategoryInfo>, Unit> {
    public static final WineCategoryViewModel$getCategoryByName$1 INSTANCE = new WineCategoryViewModel$getCategoryByName$1();

    public WineCategoryViewModel$getCategoryByName$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<WineCategoryInfo>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
        System.out.println(Intrinsics.stringPlus(" 返回喜爱", Integer.valueOf(list.get(0).getFavorite())));
    }
}
