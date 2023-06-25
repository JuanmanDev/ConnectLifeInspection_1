package p040c.p048b.p049a.p050a.p051a;

import android.content.Context;
import com.amazon.identity.auth.device.api.InvalidIntegrationException;

/* renamed from: c.b.a.a.a.c */
/* compiled from: CompatibilityUtil */
public final class C1356c {

    /* renamed from: a */
    public static final C1355b f383a = new C1355b();

    /* renamed from: a */
    public static void m266a(Context context) {
        m267b(f383a.mo15051a(context), f383a.mo15053c(context));
    }

    /* renamed from: b */
    public static void m267b(boolean z, boolean z2) {
        if (z && z2) {
            throw new InvalidIntegrationException("Both AuthorizationActivity and WorkflowActivity are declared in your AndroidManifest.xml. This will cause your users to have to pick from the Android activity chooser when they are redirected back from the browser, and the SDK may not behave as expected. Please remove the deprecated AuthorizationActivity from the manifest.");
        } else if (!z && !z2) {
            throw new InvalidIntegrationException("WorkflowActivity is not declared in your app's AndroidManifest.xml Enable manifest merging or refer to the integration guide to manually add WorkflowActivity to your manifest.");
        }
    }
}
