package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.v */
/* compiled from: lambda */
public final /* synthetic */ class C7248v implements Observer {

    /* renamed from: a */
    public final /* synthetic */ UserProfileActivity f13875a;

    public /* synthetic */ C7248v(UserProfileActivity userProfileActivity) {
        this.f13875a = userProfileActivity;
    }

    public final void onChanged(Object obj) {
        UserProfileActivity.m26907subscribeObservable$lambda39(this.f13875a, (Pair) obj);
    }
}
