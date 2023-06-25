package p040c.p429r.p430a.p431a.p435e;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.widget.ChangeEmailDialog;
import kotlin.Pair;

/* renamed from: c.r.a.a.e.h */
/* compiled from: lambda */
public final /* synthetic */ class C7277h implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ChangeEmailDialog f13905a;

    public /* synthetic */ C7277h(ChangeEmailDialog changeEmailDialog) {
        this.f13905a = changeEmailDialog;
    }

    public final void onChanged(Object obj) {
        ChangeEmailDialog.m26911subscribeObserver$lambda10(this.f13905a, (Pair) obj);
    }
}
