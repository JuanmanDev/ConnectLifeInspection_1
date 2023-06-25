package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.e2 */
/* compiled from: lambda */
public final /* synthetic */ class C7183e2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputVerificationActivity f13809a;

    public /* synthetic */ C7183e2(RegisterInputVerificationActivity registerInputVerificationActivity) {
        this.f13809a = registerInputVerificationActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputVerificationActivity.m26878subscribeObservable$lambda6(this.f13809a, (Pair) obj);
    }
}
