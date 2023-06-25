package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.fragment.MoreFragment;

/* renamed from: c.r.b.a.c.q */
/* compiled from: lambda */
public final /* synthetic */ class C7551q implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MoreFragment f14251a;

    public /* synthetic */ C7551q(MoreFragment moreFragment) {
        this.f14251a = moreFragment;
    }

    public final void onChanged(Object obj) {
        MoreFragment.m27157subscribeObservable$lambda0(this.f14251a, (Boolean) obj);
    }
}
