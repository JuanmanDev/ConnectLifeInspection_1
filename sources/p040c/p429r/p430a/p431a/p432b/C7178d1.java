package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.d1 */
/* compiled from: lambda */
public final /* synthetic */ class C7178d1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputEmaliActiviy f13804a;

    public /* synthetic */ C7178d1(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        this.f13804a = registerInputEmaliActiviy;
    }

    public final void onChanged(Object obj) {
        RegisterInputEmaliActiviy.m26862subscribeObservable$lambda5(this.f13804a, (Pair) obj);
    }
}
