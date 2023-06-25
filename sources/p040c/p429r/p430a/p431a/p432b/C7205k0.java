package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import java.util.List;

/* renamed from: c.r.a.a.b.k0 */
/* compiled from: lambda */
public final /* synthetic */ class C7205k0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputUserInfoActivity f13832a;

    public /* synthetic */ C7205k0(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.f13832a = registerInputUserInfoActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputUserInfoActivity.m26867subscribeObservable$lambda13(this.f13832a, (List) obj);
    }
}
