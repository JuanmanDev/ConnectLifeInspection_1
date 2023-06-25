package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.Comparator;

/* renamed from: c.q.a.c.g.g.b0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4300b0 implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzacc zzacc = (zzacc) obj;
        zzacc zzacc2 = (zzacc) obj2;
        C4273a0 a0Var = new C4273a0(zzacc);
        C4273a0 a0Var2 = new C4273a0(zzacc2);
        while (a0Var.hasNext() && a0Var2.hasNext()) {
            int compareTo = Integer.valueOf(a0Var.zza() & 255).compareTo(Integer.valueOf(a0Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzacc.zzd()).compareTo(Integer.valueOf(zzacc2.zzd()));
    }
}
