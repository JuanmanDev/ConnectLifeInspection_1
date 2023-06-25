package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeleteAccountEmailCode;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.a3 */
/* compiled from: lambda */
public final /* synthetic */ class C7167a3 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeleteAccountEmailCode f13793a;

    public /* synthetic */ C7167a3(DeleteAccountEmailCode deleteAccountEmailCode) {
        this.f13793a = deleteAccountEmailCode;
    }

    public final void onChanged(Object obj) {
        DeleteAccountEmailCode.m26812subscribeObservable$lambda1(this.f13793a, (Pair) obj);
    }
}
