package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeleteAccountEmailCode;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.s */
/* compiled from: lambda */
public final /* synthetic */ class C7236s implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeleteAccountEmailCode f13863a;

    public /* synthetic */ C7236s(DeleteAccountEmailCode deleteAccountEmailCode) {
        this.f13863a = deleteAccountEmailCode;
    }

    public final void onChanged(Object obj) {
        DeleteAccountEmailCode.m26814subscribeObservable$lambda3(this.f13863a, (Pair) obj);
    }
}
