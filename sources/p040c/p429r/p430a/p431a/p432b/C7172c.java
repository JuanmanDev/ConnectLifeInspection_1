package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginResetPswActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.c */
/* compiled from: lambda */
public final /* synthetic */ class C7172c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginResetPswActivity f13798a;

    public /* synthetic */ C7172c(LoginResetPswActivity loginResetPswActivity) {
        this.f13798a = loginResetPswActivity;
    }

    public final void onChanged(Object obj) {
        LoginResetPswActivity.m26843subscribeObservable$lambda4(this.f13798a, (Pair) obj);
    }
}
