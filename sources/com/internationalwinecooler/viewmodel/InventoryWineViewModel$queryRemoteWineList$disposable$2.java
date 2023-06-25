package com.internationalwinecooler.viewmodel;

import com.hisense.connect_life.core.utils.LoggerUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWineViewModel.kt */
public final class InventoryWineViewModel$queryRemoteWineList$disposable$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ Function1<String, Unit> $failure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWineViewModel$queryRemoteWineList$disposable$2(Function1<? super String, Unit> function1) {
        super(1);
        this.$failure = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        String message;
        LoggerUtil.Companion.mo39146e("updateWineList== 远程获取失败");
        Function1<String, Unit> function1 = this.$failure;
        String str = "";
        if (!(th == null || (message = th.getMessage()) == null)) {
            str = message;
        }
        function1.invoke(str);
    }
}
