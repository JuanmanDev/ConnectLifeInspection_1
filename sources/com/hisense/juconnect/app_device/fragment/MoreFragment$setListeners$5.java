package com.hisense.juconnect.app_device.fragment;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.juconnect.app_device.R$mipmap;
import com.hisense.juconnect.app_device.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p464c.C7550p;
import p040c.p429r.p460b.p461a.p464c.C7554t;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MoreFragment.kt */
public final class MoreFragment$setListeners$5 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ MoreFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreFragment$setListeners$5(MoreFragment moreFragment) {
        super(1);
        this.this$0 = moreFragment;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m27158invoke$lambda0(MoreFragment moreFragment, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(moreFragment, "this$0");
        ((AccountViewModel) moreFragment.getMViewModel()).updateLoadingStatus(true);
        EventBus.getDefault().post(103);
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final void m27159invoke$lambda1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        new AlertDialog.Builder(this.this$0.requireActivity()).setIcon(R$mipmap.hisense_launcher).setTitle(R$string.warning).setMessage(R$string.confirm_logout).setPositiveButton(R$string.key_confirm_upper, (DialogInterface.OnClickListener) new C7550p(this.this$0)).setNegativeButton(R$string.cancel, (DialogInterface.OnClickListener) C7554t.f14254e).create().show();
    }
}
