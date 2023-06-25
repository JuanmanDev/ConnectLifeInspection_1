package p040c.p200q.p201a.p264c.p293f;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: c.q.a.c.f.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3595g implements DynamiteModule.C4074a {
    /* renamed from: a */
    public final DynamiteModule.C4074a.C4076b mo20864a(Context context, String str, DynamiteModule.C4074a.C4075a aVar) {
        int i;
        DynamiteModule.C4074a.C4076b bVar = new DynamiteModule.C4074a.C4076b();
        int b = aVar.mo20863b(context, str);
        bVar.f8380a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo20862a(context, str, false);
            bVar.f8381b = i;
        } else {
            i = aVar.mo20862a(context, str, true);
            bVar.f8381b = i;
        }
        int i3 = bVar.f8380a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f8382c = 0;
            return bVar;
        }
        if (i2 >= i) {
            bVar.f8382c = -1;
        } else {
            bVar.f8382c = 1;
        }
        return bVar;
    }
}
