package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzaee;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.g2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4437g2 {
    /* renamed from: a */
    public static final int m12016a(int i, Object obj, Object obj2) {
        zzaee zzaee = (zzaee) obj;
        C4410f2 f2Var = (C4410f2) obj2;
        if (zzaee.isEmpty()) {
            return 0;
        }
        Iterator it = zzaee.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m12017b(Object obj) {
        return !((zzaee) obj).zze();
    }

    /* renamed from: c */
    public static final Object m12018c(Object obj, Object obj2) {
        zzaee zzaee = (zzaee) obj;
        zzaee zzaee2 = (zzaee) obj2;
        if (!zzaee2.isEmpty()) {
            if (!zzaee.zze()) {
                zzaee = zzaee.zzb();
            }
            zzaee.zzd(zzaee2);
        }
        return zzaee;
    }
}
