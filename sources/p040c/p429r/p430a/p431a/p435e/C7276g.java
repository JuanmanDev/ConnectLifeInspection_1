package p040c.p429r.p430a.p431a.p435e;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.widget.ChangeEmailDialog;
import kotlin.Pair;

/* renamed from: c.r.a.a.e.g */
/* compiled from: lambda */
public final /* synthetic */ class C7276g implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ChangeEmailDialog f13904a;

    public /* synthetic */ C7276g(ChangeEmailDialog changeEmailDialog) {
        this.f13904a = changeEmailDialog;
    }

    public final void onChanged(Object obj) {
        ChangeEmailDialog.m26916subscribeObserver$lambda7(this.f13904a, (Pair) obj);
    }
}
