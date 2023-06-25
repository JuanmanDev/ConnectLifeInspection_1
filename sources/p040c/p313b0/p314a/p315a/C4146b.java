package p040c.p313b0.p314a.p315a;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ServiceConnection;
import java.util.List;

/* renamed from: c.b0.a.a.b */
/* compiled from: CustomTabActivityHelper */
public class C4146b implements C4149d {

    /* renamed from: a */
    public CustomTabsSession f8733a;

    /* renamed from: b */
    public CustomTabsClient f8734b;

    /* renamed from: c */
    public CustomTabsServiceConnection f8735c;

    /* renamed from: d */
    public C4147a f8736d;

    /* renamed from: e */
    public CustomTabsCallback f8737e;

    /* renamed from: c.b0.a.a.b$a */
    /* compiled from: CustomTabActivityHelper */
    public interface C4147a {
        /* renamed from: a */
        void mo25476a();

        /* renamed from: b */
        void mo25477b();
    }

    /* renamed from: e */
    public static boolean m11373e(Activity activity) {
        return C4148c.m11386b(activity) != null;
    }

    /* renamed from: g */
    public static void m11374g(Activity activity, CustomTabsIntent customTabsIntent, Uri uri, int i) {
        customTabsIntent.intent.setData(uri);
        activity.startActivityForResult(customTabsIntent.intent, i);
    }

    /* renamed from: a */
    public void mo25468a() {
        this.f8734b = null;
        this.f8733a = null;
        C4147a aVar = this.f8736d;
        if (aVar != null) {
            aVar.mo25476a();
        }
    }

    /* renamed from: b */
    public void mo25469b(CustomTabsClient customTabsClient) {
        this.f8734b = customTabsClient;
        customTabsClient.warmup(0);
        C4147a aVar = this.f8736d;
        if (aVar != null) {
            aVar.mo25477b();
        }
    }

    /* renamed from: c */
    public void mo25470c(Activity activity) {
        String b;
        if (this.f8734b == null && (b = C4148c.m11386b(activity)) != null) {
            ServiceConnection serviceConnection = new ServiceConnection(this);
            this.f8735c = serviceConnection;
            CustomTabsClient.bindCustomTabsService(activity, b, serviceConnection);
        }
    }

    /* renamed from: d */
    public CustomTabsSession mo25471d() {
        CustomTabsClient customTabsClient = this.f8734b;
        if (customTabsClient == null) {
            this.f8733a = null;
        } else if (this.f8733a == null) {
            this.f8733a = customTabsClient.newSession(this.f8737e);
        }
        return this.f8733a;
    }

    /* renamed from: f */
    public boolean mo25472f(Uri uri, Bundle bundle, List<Bundle> list) {
        CustomTabsSession d;
        if (this.f8734b == null || (d = mo25471d()) == null) {
            return false;
        }
        return d.mayLaunchUrl(uri, bundle, list);
    }

    /* renamed from: h */
    public void mo25473h(C4147a aVar) {
        this.f8736d = aVar;
    }

    /* renamed from: i */
    public void mo25474i(CustomTabsCallback customTabsCallback) {
        this.f8737e = customTabsCallback;
    }

    /* renamed from: j */
    public void mo25475j(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.f8735c;
        if (customTabsServiceConnection != null) {
            activity.unbindService(customTabsServiceConnection);
            this.f8734b = null;
            this.f8733a = null;
            this.f8735c = null;
        }
    }
}
