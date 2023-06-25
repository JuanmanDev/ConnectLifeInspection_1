package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import kotlin.Triple;

/* renamed from: c.r.a.a.b.c0 */
/* compiled from: lambda */
public final /* synthetic */ class C7173c0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ UserProfileActivity f13799a;

    public /* synthetic */ C7173c0(UserProfileActivity userProfileActivity) {
        this.f13799a = userProfileActivity;
    }

    public final void onChanged(Object obj) {
        UserProfileActivity.m26904subscribeObservable$lambda35(this.f13799a, (Triple) obj);
    }
}
