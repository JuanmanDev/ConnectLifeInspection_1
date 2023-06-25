package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.d.j.y0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3532y0 {

    /* renamed from: a */
    public static final Object f6526a = new Object();

    /* renamed from: b */
    public static boolean f6527b;

    /* renamed from: c */
    public static int f6528c;

    /* renamed from: a */
    public static int m9013a(Context context) {
        m9014b(context);
        return f6528c;
    }

    /* renamed from: b */
    public static void m9014b(Context context) {
        synchronized (f6526a) {
            if (!f6527b) {
                f6527b = true;
                try {
                    Bundle bundle = C3573c.m9110a(context).mo20845c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        f6528c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
