package com.internationalwinecooler.p529ui.fragment.dialog;

import android.view.View;
import android.widget.CheckBox;
import com.juconnect.connect_life.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1524t;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.DeletedDialog$setListener$8 */
/* compiled from: DeletedDialog.kt */
public final class DeletedDialog$setListener$8 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ DeletedDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeletedDialog$setListener$8(DeletedDialog deletedDialog) {
        super(1);
        this.this$0 = deletedDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        C1524t.m1041e().mo15425p("isShowDeleted", ((CheckBox) this.this$0._$_findCachedViewById(R$id.checkBox)).isChecked());
    }
}
