package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.m */
/* compiled from: lambda */
public final /* synthetic */ class C7212m implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginEmailActivity f13839a;

    public /* synthetic */ C7212m(LoginEmailActivity loginEmailActivity) {
        this.f13839a = loginEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginEmailActivity.m26836subscribeObservable$lambda9(this.f13839a, (Pair) obj);
    }
}
