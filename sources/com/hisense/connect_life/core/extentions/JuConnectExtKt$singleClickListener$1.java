package com.hisense.connect_life.core.extentions;

import android.view.View;
import com.hisense.connect_life.core.listener.ISingleClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/hisense/connect_life/core/extentions/JuConnectExtKt$singleClickListener$1", "Lcom/hisense/connect_life/core/listener/ISingleClickListener;", "accept", "", "v", "Landroid/view/View;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuConnectExt.kt */
public final class JuConnectExtKt$singleClickListener$1 implements ISingleClickListener {
    public final /* synthetic */ Function1<View, Unit> $action;

    public JuConnectExtKt$singleClickListener$1(Function1<? super View, Unit> function1) {
        this.$action = function1;
    }

    public void accept(@Nullable View view) {
        this.$action.invoke(view);
    }

    public void onClick(@Nullable View view) {
        ISingleClickListener.DefaultImpls.onClick(this, view);
    }
}
