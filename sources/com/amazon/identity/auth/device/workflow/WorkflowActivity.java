package com.amazon.identity.auth.device.workflow;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import java.util.Locale;
import p040c.p048b.p049a.p050a.p051a.C1358e;
import p040c.p048b.p049a.p050a.p051a.C1359f;
import p040c.p048b.p049a.p050a.p051a.p052h.p054c.C1373a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

@SuppressLint({"Registered"})
public final class WorkflowActivity extends Activity {

    /* renamed from: e */
    public static final String f6951e = WorkflowActivity.class.getName();

    /* renamed from: a */
    public static void m9557a(Uri uri, Activity activity, String str) {
        if (uri == null) {
            C1485a.m832e(str, "uri is null onCreate - closing activity");
            return;
        }
        try {
            if (C1358e.m272h(uri)) {
                C1485a.m828a(str, "Receiving response for interactive request");
                String e = C1358e.m271e(uri);
                C1485a.m828a(str, "Receiving response for request " + e);
                C1359f.m278a().mo15062c(e, uri);
                C1373a d = C1358e.m270c().mo15058d(e);
                if (d != null && !d.mo15090l()) {
                    C1485a.m828a(str, String.format(Locale.ENGLISH, "Request %s is not hooked on UI resume, should be handled immediately", new Object[]{e}));
                    d.mo15091m();
                    return;
                }
                return;
            }
            C1485a.m828a(str, "Receiving response for auth request");
            if (!C1358e.m270c().mo15059f(uri, activity.getApplicationContext())) {
                C1485a.m836i(str, "Could not find active request for redirect URI", uri.toString());
            }
        } catch (AuthError e2) {
            C1485a.m837j(str, "Could not handle response URI", uri.toString(), e2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1485a.m828a(f6951e, "onCreate");
        m9557a(getIntent().getData(), this, f6951e);
        C1485a.m828a(f6951e, "finish");
        finish();
    }
}
