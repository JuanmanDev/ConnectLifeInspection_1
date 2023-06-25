package p001a.p004b.p005a;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSessionToken;

/* renamed from: a.b.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C0001a implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ CustomTabsService.C03131 f1a;

    /* renamed from: b */
    public final /* synthetic */ CustomTabsSessionToken f2b;

    public /* synthetic */ C0001a(CustomTabsService.C03131 r1, CustomTabsSessionToken customTabsSessionToken) {
        this.f1a = r1;
        this.f2b = customTabsSessionToken;
    }

    public final void binderDied() {
        this.f1a.mo3453d(this.f2b);
    }
}
