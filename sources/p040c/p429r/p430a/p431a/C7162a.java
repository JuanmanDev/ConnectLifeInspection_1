package p040c.p429r.p430a.p431a;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.TestLoginSuccessActivity;

/* renamed from: c.r.a.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C7162a implements Observer {

    /* renamed from: a */
    public final /* synthetic */ TestLoginSuccessActivity f13788a;

    public /* synthetic */ C7162a(TestLoginSuccessActivity testLoginSuccessActivity) {
        this.f13788a = testLoginSuccessActivity;
    }

    public final void onChanged(Object obj) {
        TestLoginSuccessActivity.m26801subscribeObservable$lambda0(this.f13788a, (Boolean) obj);
    }
}
