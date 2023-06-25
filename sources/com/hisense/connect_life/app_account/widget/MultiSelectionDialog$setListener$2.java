package com.hisense.connect_life.app_account.widget;

import android.view.View;
import com.contrarywind.view.WheelView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.widget.MultiSelectionDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MultiSelectionDialog.kt */
public final class MultiSelectionDialog$setListener$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ MultiSelectionDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiSelectionDialog$setListener$2(MultiSelectionDialog multiSelectionDialog) {
        super(1);
        this.this$0 = multiSelectionDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        MultiSelectionDialog.ISelectSelection callback = this.this$0.getCallback();
        if (callback != null) {
            String[] selections = this.this$0.getSelections();
            View access$getLayout$p = this.this$0.layout;
            if (access$getLayout$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layout");
                access$getLayout$p = null;
            }
            callback.onSelectionSelected(selections[((WheelView) access$getLayout$p.findViewById(R$id.wheelview)).getCurrentItem()]);
        }
        this.this$0.dismiss();
    }
}
