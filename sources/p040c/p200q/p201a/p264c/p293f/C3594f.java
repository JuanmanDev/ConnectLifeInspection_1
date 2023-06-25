package p040c.p200q.p201a.p264c.p293f;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: c.q.a.c.f.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3594f implements DynamiteModule.C4074a {
    /* renamed from: a */
    public final DynamiteModule.C4074a.C4076b mo20864a(Context context, String str, DynamiteModule.C4074a.C4075a aVar) {
        DynamiteModule.C4074a.C4076b bVar = new DynamiteModule.C4074a.C4076b();
        bVar.f8380a = aVar.mo20863b(context, str);
        int a = aVar.mo20862a(context, str, true);
        bVar.f8381b = a;
        int i = bVar.f8380a;
        if (i == 0) {
            if (a == 0) {
                bVar.f8382c = 0;
                return bVar;
            }
            i = 0;
        }
        if (i >= a) {
            bVar.f8382c = -1;
        } else {
            bVar.f8382c = 1;
        }
        return bVar;
    }
}
