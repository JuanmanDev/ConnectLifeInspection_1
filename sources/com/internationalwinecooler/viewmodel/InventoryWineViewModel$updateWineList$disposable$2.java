package com.internationalwinecooler.viewmodel;

import com.hisense.connect_life.core.utils.LoggerUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$updateWineList$disposable$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ Function0<Unit> $loadCache;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWineViewModel$updateWineList$disposable$2(Function0<Unit> function0) {
        super(1);
        this.$loadCache = function0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        LoggerUtil.Companion.mo39146e("updateWineList== 获取lastChange失败，使用缓存 ");
        Function0<Unit> function0 = this.$loadCache;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
