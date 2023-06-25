package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import kotlin.Triple;

/* renamed from: c.r.a.a.b.n2 */
/* compiled from: lambda */
public final /* synthetic */ class C7219n2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ UserProfileActivity f13846a;

    public /* synthetic */ C7219n2(UserProfileActivity userProfileActivity) {
        this.f13846a = userProfileActivity;
    }

    public final void onChanged(Object obj) {
        UserProfileActivity.m26902subscribeObservable$lambda29(this.f13846a, (Triple) obj);
    }
}
