package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.o2 */
/* compiled from: lambda */
public final /* synthetic */ class C7223o2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ UserProfileActivity f13850a;

    public /* synthetic */ C7223o2(UserProfileActivity userProfileActivity) {
        this.f13850a = userProfileActivity;
    }

    public final void onChanged(Object obj) {
        UserProfileActivity.m26903subscribeObservable$lambda34(this.f13850a, (Pair) obj);
    }
}
