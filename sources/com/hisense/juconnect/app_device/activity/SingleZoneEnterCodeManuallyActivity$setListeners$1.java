package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.juconnect.app_device.R$drawable;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneEnterCodeManuallyActivity.kt */
public final class SingleZoneEnterCodeManuallyActivity$setListeners$1 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ SingleZoneEnterCodeManuallyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneEnterCodeManuallyActivity$setListeners$1(SingleZoneEnterCodeManuallyActivity singleZoneEnterCodeManuallyActivity) {
        super(1);
        this.this$0 = singleZoneEnterCodeManuallyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        SingleZoneEnterCodeManuallyActivity singleZoneEnterCodeManuallyActivity = this.this$0;
        singleZoneEnterCodeManuallyActivity.auid = ((EditText) singleZoneEnterCodeManuallyActivity._$_findCachedViewById(R$id.et_enter_code)).getText().toString();
        ToastUtils.m9601y(this.this$0.auid, new Object[0]);
        if (this.this$0.auid.length() != 37) {
            ((TextView) this.this$0._$_findCachedViewById(R$id.tv_audi_code_invalid)).setVisibility(0);
            ((TextView) this.this$0._$_findCachedViewById(R$id.tv_single_zone_invalid_auid_guid)).setText(this.this$0.getString(R$string.manually_enter_invalid_guide));
            ((TextView) this.this$0._$_findCachedViewById(R$id.tv_audi_code_error)).setVisibility(0);
            ((EditText) this.this$0._$_findCachedViewById(R$id.et_enter_code)).setBackground(this.this$0.getDrawable(R$drawable.shape_rect_red_bg));
            return;
        }
        SingleZoneEnterCodeManuallyActivity.access$getMViewModel(this.this$0).queryApplianceProfile(this.this$0.auid, "");
        ((EditText) this.this$0._$_findCachedViewById(R$id.et_enter_code)).setBackground(this.this$0.getDrawable(R$drawable.shape_rect_bg));
    }
}
