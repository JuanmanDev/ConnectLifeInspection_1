package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzlg;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.p9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5220p9 {
    /* renamed from: a */
    public static final int m14648a(int i, Object obj, Object obj2) {
        zzlg zzlg = (zzlg) obj;
        C5205o9 o9Var = (C5205o9) obj2;
        if (zzlg.isEmpty()) {
            return 0;
        }
        Iterator it = zzlg.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m14649b(Object obj, Object obj2) {
        zzlg zzlg = (zzlg) obj;
        zzlg zzlg2 = (zzlg) obj2;
        if (!zzlg2.isEmpty()) {
            if (!zzlg.zze()) {
                zzlg = zzlg.zzb();
            }
            zzlg.zzd(zzlg2);
        }
        return zzlg;
    }
}
