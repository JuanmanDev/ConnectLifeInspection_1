package p040c.p429r.p430a.p431a.p435e;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.widget.ChangeEmailDialog;
import kotlin.Pair;

/* renamed from: c.r.a.a.e.f */
/* compiled from: lambda */
public final /* synthetic */ class C7275f implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ChangeEmailDialog f13903a;

    public /* synthetic */ C7275f(ChangeEmailDialog changeEmailDialog) {
        this.f13903a = changeEmailDialog;
    }

    public final void onChanged(Object obj) {
        ChangeEmailDialog.m26913subscribeObserver$lambda12(this.f13903a, (Pair) obj);
    }
}
