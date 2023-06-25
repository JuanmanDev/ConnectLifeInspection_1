package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.a0 */
/* compiled from: lambda */
public final /* synthetic */ class C7164a0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputEmaliActiviy f13790a;

    public /* synthetic */ C7164a0(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        this.f13790a = registerInputEmaliActiviy;
    }

    public final void onChanged(Object obj) {
        RegisterInputEmaliActiviy.m26860subscribeObservable$lambda10(this.f13790a, (Pair) obj);
    }
}
