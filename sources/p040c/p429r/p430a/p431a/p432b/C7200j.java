package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputVerificationActivity;

/* renamed from: c.r.a.a.b.j */
/* compiled from: lambda */
public final /* synthetic */ class C7200j implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputVerificationActivity f13827a;

    public /* synthetic */ C7200j(RegisterInputVerificationActivity registerInputVerificationActivity) {
        this.f13827a = registerInputVerificationActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputVerificationActivity.m26879subscribeObservable$lambda9(this.f13827a, (Boolean) obj);
    }
}
