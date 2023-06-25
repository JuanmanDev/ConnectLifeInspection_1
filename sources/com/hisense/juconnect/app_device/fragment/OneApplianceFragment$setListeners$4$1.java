package com.hisense.juconnect.app_device.fragment;

import com.blankj.utilcode.util.ToastUtils;
import com.hisense.juconnect.app_device.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: OneApplianceFragment.kt */
public final class OneApplianceFragment$setListeners$4$1 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ OneApplianceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneApplianceFragment$setListeners$4$1(OneApplianceFragment oneApplianceFragment) {
        super(1);
        this.this$0 = oneApplianceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.this$0.dismissProgressDialog();
        ToastUtils.m9582A(this.this$0.getString(R$string.success), new Object[0]);
    }
}
