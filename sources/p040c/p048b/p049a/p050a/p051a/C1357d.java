package p040c.p048b.p049a.p050a.p051a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazon.identity.auth.device.AuthError;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.d */
/* compiled from: ExternalBrowserManager */
public class C1357d {

    /* renamed from: a */
    public static final String f384a = "c.b.a.a.a.d";

    /* renamed from: a */
    public final Intent mo15054a(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.addFlags(1073741824);
        intent.putExtra("com.android.browser.application_id", context.getPackageName() + ".amazon.auth");
        return intent;
    }

    /* renamed from: b */
    public void mo15055b(C1354a aVar, String str, Context context) {
        C1356c.m266a(context);
        Intent a = mo15054a(str, context);
        C1485a.m832e(f384a, "Starting External Browser");
        try {
            aVar.mo15050i();
            context.startActivity(a);
        } catch (Exception e) {
            String str2 = f384a;
            C1485a.m829b(str2, "Unable to Launch Browser: " + e.getMessage());
            throw new AuthError("Unable to Launch Browser.", e, AuthError.ERROR_TYPE.ERROR_UNKNOWN);
        }
    }
}
