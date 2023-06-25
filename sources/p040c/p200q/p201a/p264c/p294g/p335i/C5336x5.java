package p040c.p200q.p201a.p264c.p294g.p335i;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* renamed from: c.q.a.c.g.i.x5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5336x5 {

    /* renamed from: a */
    public final SimpleArrayMap f10248a;

    public C5336x5(SimpleArrayMap simpleArrayMap) {
        this.f10248a = simpleArrayMap;
    }

    /* renamed from: a */
    public final String mo27892a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.f10248a.get(uri.toString());
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("".concat(String.valueOf(str3)));
    }
}
