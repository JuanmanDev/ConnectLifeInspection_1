package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ApplicationSettingsActivity;

/* renamed from: c.r.b.a.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C7481a implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ApplicationSettingsActivity f14175a;

    public /* synthetic */ C7481a(ApplicationSettingsActivity applicationSettingsActivity) {
        this.f14175a = applicationSettingsActivity;
    }

    public final void onChanged(Object obj) {
        ApplicationSettingsActivity.m27101subscribeObservable$lambda2(this.f14175a, (Boolean) obj);
    }
}
