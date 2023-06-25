package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;

/* renamed from: c.r.a.a.b.z1 */
/* compiled from: lambda */
public final /* synthetic */ class C7266z1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ UserProfileActivity f13893a;

    public /* synthetic */ C7266z1(UserProfileActivity userProfileActivity) {
        this.f13893a = userProfileActivity;
    }

    public final void onChanged(Object obj) {
        UserProfileActivity.m26906subscribeObservable$lambda38(this.f13893a, (Boolean) obj);
    }
}
