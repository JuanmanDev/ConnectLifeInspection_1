package p040c.p429r.p430a.p431a.p435e;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.widget.ChangeEmailDialog;
import kotlin.Pair;

/* renamed from: c.r.a.a.e.c */
/* compiled from: lambda */
public final /* synthetic */ class C7272c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ChangeEmailDialog f13900a;

    public /* synthetic */ C7272c(ChangeEmailDialog changeEmailDialog) {
        this.f13900a = changeEmailDialog;
    }

    public final void onChanged(Object obj) {
        ChangeEmailDialog.m26912subscribeObserver$lambda11(this.f13900a, (Pair) obj);
    }
}
