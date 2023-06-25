package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeleteAccountEmailCode;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.l0 */
/* compiled from: lambda */
public final /* synthetic */ class C7209l0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeleteAccountEmailCode f13836a;

    public /* synthetic */ C7209l0(DeleteAccountEmailCode deleteAccountEmailCode) {
        this.f13836a = deleteAccountEmailCode;
    }

    public final void onChanged(Object obj) {
        DeleteAccountEmailCode.m26813subscribeObservable$lambda2(this.f13836a, (Pair) obj);
    }
}
