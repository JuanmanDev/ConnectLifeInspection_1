package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.AboutActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.w0 */
/* compiled from: lambda */
public final /* synthetic */ class C7253w0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ AboutActivity f13880a;

    public /* synthetic */ C7253w0(AboutActivity aboutActivity) {
        this.f13880a = aboutActivity;
    }

    public final void onChanged(Object obj) {
        AboutActivity.m26803subscribeObservable$lambda2(this.f13880a, (Pair) obj);
    }
}
