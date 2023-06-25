package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import java.util.List;

/* renamed from: c.r.a.a.b.z2 */
/* compiled from: lambda */
public final /* synthetic */ class C7267z2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ UserProfileActivity f13894a;

    public /* synthetic */ C7267z2(UserProfileActivity userProfileActivity) {
        this.f13894a = userProfileActivity;
    }

    public final void onChanged(Object obj) {
        UserProfileActivity.m26905subscribeObservable$lambda37(this.f13894a, (List) obj);
    }
}
