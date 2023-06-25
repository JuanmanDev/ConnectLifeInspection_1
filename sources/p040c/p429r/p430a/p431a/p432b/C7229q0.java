package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.q0 */
/* compiled from: lambda */
public final /* synthetic */ class C7229q0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputEmaliActiviy f13856a;

    public /* synthetic */ C7229q0(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        this.f13856a = registerInputEmaliActiviy;
    }

    public final void onChanged(Object obj) {
        RegisterInputEmaliActiviy.m26865subscribeObservable$lambda9(this.f13856a, (Pair) obj);
    }
}
