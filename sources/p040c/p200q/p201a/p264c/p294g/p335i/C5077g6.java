package p040c.p200q.p201a.p264c.p294g.p335i;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* renamed from: c.q.a.c.g.i.g6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5077g6 {
    @GuardedBy("PhenotypeConstants.class")

    /* renamed from: a */
    public static final ArrayMap f9904a = new ArrayMap();

    /* renamed from: a */
    public static synchronized Uri m14133a(String str) {
        synchronized (C5077g6.class) {
            Uri uri = (Uri) f9904a.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            f9904a.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
