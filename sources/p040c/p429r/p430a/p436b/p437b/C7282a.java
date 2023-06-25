package p040c.p429r.p430a.p436b.p437b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.core.base.BaseVmActivity;

/* renamed from: c.r.a.b.b.a */
/* compiled from: lambda */
public final /* synthetic */ class C7282a implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BaseVmActivity f13909a;

    /* renamed from: b */
    public final /* synthetic */ boolean f13910b;

    public /* synthetic */ C7282a(BaseVmActivity baseVmActivity, boolean z) {
        this.f13909a = baseVmActivity;
        this.f13910b = z;
    }

    public final void onChanged(Object obj) {
        BaseVmActivity.m26921subscribeObservable$lambda1(this.f13909a, this.f13910b, (Boolean) obj);
    }
}
