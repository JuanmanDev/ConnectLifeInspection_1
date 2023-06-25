package p040c.p048b.p049a.p050a.p051a;

import android.content.Context;
import android.content.Intent;
import com.amazon.identity.auth.device.authorization.AuthorizationActivity;
import com.amazon.identity.auth.device.workflow.WorkflowActivity;

/* renamed from: c.b.a.a.a.b */
/* compiled from: AndroidManifest */
public final class C1355b {

    /* renamed from: a */
    public Boolean f381a;

    /* renamed from: b */
    public Boolean f382b;

    /* renamed from: a */
    public boolean mo15051a(Context context) {
        if (this.f381a == null) {
            this.f381a = Boolean.valueOf(mo15052b(context, new Intent(context, AuthorizationActivity.class)));
        }
        return this.f381a.booleanValue();
    }

    /* renamed from: b */
    public boolean mo15052b(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty();
    }

    /* renamed from: c */
    public boolean mo15053c(Context context) {
        if (this.f382b == null) {
            this.f382b = Boolean.valueOf(mo15052b(context, new Intent(context, WorkflowActivity.class)));
        }
        return this.f382b.booleanValue();
    }
}
