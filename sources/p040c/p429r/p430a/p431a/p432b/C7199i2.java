package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy;
import com.hisense.connect_life.hismart.model.JHLAgreementData;

/* renamed from: c.r.a.a.b.i2 */
/* compiled from: lambda */
public final /* synthetic */ class C7199i2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputEmaliActiviy f13826a;

    public /* synthetic */ C7199i2(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        this.f13826a = registerInputEmaliActiviy;
    }

    public final void onChanged(Object obj) {
        RegisterInputEmaliActiviy.m26863subscribeObservable$lambda6(this.f13826a, (JHLAgreementData) obj);
    }
}
