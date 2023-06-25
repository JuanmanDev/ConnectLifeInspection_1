package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PasswordActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.h1 */
/* compiled from: lambda */
public final /* synthetic */ class C7194h1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PasswordActivity f13820a;

    public /* synthetic */ C7194h1(PasswordActivity passwordActivity) {
        this.f13820a = passwordActivity;
    }

    public final void onChanged(Object obj) {
        PasswordActivity.m26851subscribeObservable$lambda4(this.f13820a, (Pair) obj);
    }
}
