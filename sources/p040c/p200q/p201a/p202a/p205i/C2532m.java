package p040c.p200q.p201a.p202a.p205i;

import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import p040c.p200q.p201a.p202a.C2353e;

/* renamed from: c.q.a.a.i.m */
/* compiled from: ForcedSender */
public final class C2532m {
    /* renamed from: a */
    public static C2538q m4514a(C2353e<?> eVar) {
        if (eVar instanceof C2541s) {
            return ((C2541s) eVar).mo17982c();
        }
        throw new IllegalArgumentException("Expected instance of TransportImpl.");
    }

    @WorkerThread
    /* renamed from: b */
    public static void m4515b(C2353e<?> eVar, Priority priority) {
        C2543u.m4547c().mo17985e().mo17842l(m4514a(eVar).mo17980f(priority), 1);
    }
}
