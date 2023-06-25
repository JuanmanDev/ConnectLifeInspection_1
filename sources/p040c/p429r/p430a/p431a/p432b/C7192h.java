package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.h */
/* compiled from: lambda */
public final /* synthetic */ class C7192h implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceCerVerificationActivity f13818a;

    public /* synthetic */ C7192h(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        this.f13818a = deviceCerVerificationActivity;
    }

    public final void onChanged(Object obj) {
        DeviceCerVerificationActivity.m26816subscribeObservable$lambda2(this.f13818a, (Pair) obj);
    }
}
