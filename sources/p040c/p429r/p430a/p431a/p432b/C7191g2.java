package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PasswordActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.g2 */
/* compiled from: lambda */
public final /* synthetic */ class C7191g2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PasswordActivity f13817a;

    public /* synthetic */ C7191g2(PasswordActivity passwordActivity) {
        this.f13817a = passwordActivity;
    }

    public final void onChanged(Object obj) {
        PasswordActivity.m26849subscribeObservable$lambda2(this.f13817a, (Pair) obj);
    }
}
