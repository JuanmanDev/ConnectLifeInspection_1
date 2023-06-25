package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.t2 */
/* compiled from: lambda */
public final /* synthetic */ class C7243t2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputEmaliActiviy f13870a;

    public /* synthetic */ C7243t2(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        this.f13870a = registerInputEmaliActiviy;
    }

    public final void onChanged(Object obj) {
        RegisterInputEmaliActiviy.m26864subscribeObservable$lambda7(this.f13870a, (Pair) obj);
    }
}
