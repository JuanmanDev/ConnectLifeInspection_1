package p040c.p048b.p049a.p050a.p051a.p060m;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import javax.net.ssl.HttpsURLConnection;
import p040c.p048b.p049a.p050a.p051a.p060m.C1440o;

/* renamed from: c.b.a.a.a.m.d */
/* compiled from: AbstractPandaGetRequest */
public abstract class C1429d<T extends C1440o> extends C1430e<T> {
    public C1429d(Context context, AppInfo appInfo) {
        super(context, appInfo);
    }

    /* renamed from: i */
    public void mo15219i(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
    }

    /* renamed from: l */
    public void mo15222l(HttpsURLConnection httpsURLConnection) {
    }
}
