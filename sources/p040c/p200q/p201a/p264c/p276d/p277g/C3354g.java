package p040c.p200q.p201a.p264c.p276d.p277g;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3405p;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3354g {
    @NonNull
    /* renamed from: a */
    public static <R extends C3356i> C3352f<R> m8505a(@NonNull R r, @NonNull C3348d dVar) {
        C3495o.m8909k(r, "Result must not be null");
        C3495o.m8900b(!r.mo20282F().mo24536U(), "Status code must not be SUCCESS");
        C3430n nVar = new C3430n(dVar, r);
        nVar.mo24546f(r);
        return nVar;
    }

    @NonNull
    /* renamed from: b */
    public static C3352f<Status> m8506b(@NonNull Status status, @NonNull C3348d dVar) {
        C3495o.m8909k(status, "Result must not be null");
        C3405p pVar = new C3405p(dVar);
        pVar.mo24546f(status);
        return pVar;
    }
}
