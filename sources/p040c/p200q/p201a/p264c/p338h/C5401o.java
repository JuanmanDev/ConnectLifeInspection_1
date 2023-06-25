package p040c.p200q.p201a.p264c.p338h;

import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* renamed from: c.q.a.c.h.o */
public final class C5401o implements Comparator<ActivityTransition> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int P = activityTransition.mo33547P();
        int P2 = activityTransition2.mo33547P();
        if (P != P2) {
            return P < P2 ? -1 : 1;
        }
        int Q = activityTransition.mo33548Q();
        int Q2 = activityTransition2.mo33548Q();
        if (Q == Q2) {
            return 0;
        }
        return Q < Q2 ? -1 : 1;
    }
}
