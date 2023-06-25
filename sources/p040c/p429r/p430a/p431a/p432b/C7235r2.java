package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PasswordActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.r2 */
/* compiled from: lambda */
public final /* synthetic */ class C7235r2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PasswordActivity f13862a;

    public /* synthetic */ C7235r2(PasswordActivity passwordActivity) {
        this.f13862a = passwordActivity;
    }

    public final void onChanged(Object obj) {
        PasswordActivity.m26850subscribeObservable$lambda3(this.f13862a, (Pair) obj);
    }
}
