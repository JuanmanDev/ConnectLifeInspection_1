package p040c.p429r.p430a.p431a.p435e;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.widget.ChangeEmailDialog;
import kotlin.Pair;

/* renamed from: c.r.a.a.e.e */
/* compiled from: lambda */
public final /* synthetic */ class C7274e implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ChangeEmailDialog f13902a;

    public /* synthetic */ C7274e(ChangeEmailDialog changeEmailDialog) {
        this.f13902a = changeEmailDialog;
    }

    public final void onChanged(Object obj) {
        ChangeEmailDialog.m26914subscribeObserver$lambda14(this.f13902a, (Pair) obj);
    }
}
