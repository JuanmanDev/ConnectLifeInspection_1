package com.hisense.juconnect.app_device.activity;

import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.widget.MultiModeDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SingleZoneApplianceIdentificationActivity.kt */
public final class SingleZoneApplianceIdentificationActivity$initWidgets$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ SingleZoneApplianceIdentificationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleZoneApplianceIdentificationActivity$initWidgets$2(SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity) {
        super(1);
        this.this$0 = singleZoneApplianceIdentificationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        MultiModeDialog access$getDialog$p = this.this$0.dialog;
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(access$getDialog$p, supportFragmentManager);
        this.this$0.modeList.add("OPEN");
        this.this$0.modeList.add("WPA");
        this.this$0.modeList.add("WPA2");
        this.this$0.dialog.setModeList(this.this$0.modeList);
        this.this$0.dialog.setCurrentItem(0);
        MultiModeDialog access$getDialog$p2 = this.this$0.dialog;
        final SingleZoneApplianceIdentificationActivity singleZoneApplianceIdentificationActivity = this.this$0;
        access$getDialog$p2.setResult(new MultiModeDialog.ModeResult() {
            public void modeResult(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "mode");
                ((TextView) singleZoneApplianceIdentificationActivity._$_findCachedViewById(R$id.et_connection_setup_wifi_type)).setText((CharSequence) singleZoneApplianceIdentificationActivity.modeList.get(i));
                if (i == 0) {
                    ((LinearLayout) singleZoneApplianceIdentificationActivity._$_findCachedViewById(R$id.psw_linear)).setVisibility(8);
                } else {
                    ((LinearLayout) singleZoneApplianceIdentificationActivity._$_findCachedViewById(R$id.psw_linear)).setVisibility(0);
                }
            }
        });
        Dialog dialog = this.this$0.dialog.getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = this.this$0.dialog.getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }
}
