package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.util.Comparator;

/* renamed from: c.q.a.c.g.i.m7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5173m7 implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzje zzje = (zzje) obj;
        zzje zzje2 = (zzje) obj2;
        C5158l7 l7Var = new C5158l7(zzje);
        C5158l7 l7Var2 = new C5158l7(zzje2);
        while (l7Var.hasNext() && l7Var2.hasNext()) {
            int compareTo = Integer.valueOf(l7Var.zza() & 255).compareTo(Integer.valueOf(l7Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzje.zzd()).compareTo(Integer.valueOf(zzje2.zzd()));
    }
}
