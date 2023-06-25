package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneAddNewApplicationActivity.kt */
public final class SingleZoneAddNewApplicationActivity$setListeners$3 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ SingleZoneAddNewApplicationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneAddNewApplicationActivity$setListeners$3(SingleZoneAddNewApplicationActivity singleZoneAddNewApplicationActivity) {
        super(1);
        this.this$0 = singleZoneAddNewApplicationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        SingleZoneAddNewApplicationActivity singleZoneAddNewApplicationActivity = this.this$0;
        int access$getSINGLE_QR_CODE_PAIR_APPLIANCE_REQUEST_CODE$p = singleZoneAddNewApplicationActivity.SINGLE_QR_CODE_PAIR_APPLIANCE_REQUEST_CODE;
        SingleZoneAddNewApplicationActivity singleZoneAddNewApplicationActivity2 = this.this$0;
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.SingleZonePairApplianceGuideActivity);
        a.withString(KeyConst.KEY_AUIT, singleZoneAddNewApplicationActivity2.getMAuid());
        a.navigation((Activity) singleZoneAddNewApplicationActivity, access$getSINGLE_QR_CODE_PAIR_APPLIANCE_REQUEST_CODE$p);
    }
}
