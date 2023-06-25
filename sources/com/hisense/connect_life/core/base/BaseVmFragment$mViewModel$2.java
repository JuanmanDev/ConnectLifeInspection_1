package com.hisense.connect_life.core.base;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo47991d2 = {"<anonymous>", "P", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "invoke", "()Lcom/hisense/connect_life/core/base/BaseViewModel;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseVmFragment.kt */
public final class BaseVmFragment$mViewModel$2 extends Lambda implements Function0<P> {
    public final /* synthetic */ BaseVmFragment<P> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseVmFragment$mViewModel$2(BaseVmFragment<P> baseVmFragment) {
        super(0);
        this.this$0 = baseVmFragment;
    }

    @NotNull
    public final P invoke() {
        P p = ViewModelProviders.m95of((Fragment) this.this$0).get(this.this$0.initViewModelClz());
        Intrinsics.checkNotNullExpressionValue(p, "of(this@BaseVmFragment).get(initViewModelClz())");
        return (BaseViewModel) p;
    }
}
