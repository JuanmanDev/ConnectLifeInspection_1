package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.EditText;
import com.hisense.juconnect.app_device.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneSetApplianceNameActivity.kt */
public final class SingleZoneSetApplianceNameActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ SingleZoneSetApplianceNameActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneSetApplianceNameActivity$setListeners$2(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity) {
        super(1);
        this.this$0 = singleZoneSetApplianceNameActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (Intrinsics.areEqual((Object) this.this$0.getMyFrom(), (Object) "pair")) {
            SingleZoneSetApplianceNameActivity.access$getMViewModel(this.this$0).bindDevice("", this.this$0.getMDevId(), ((EditText) this.this$0._$_findCachedViewById(R$id.et_appliance_name)).getText().toString(), "", "", "");
        } else {
            SingleZoneSetApplianceNameActivity.access$getMViewModel(this.this$0).bindDevice(this.this$0.getMWifiId(), this.this$0.getMDevId(), ((EditText) this.this$0._$_findCachedViewById(R$id.et_appliance_name)).getText().toString(), this.this$0.getMDevType(), "", "");
        }
    }
}
