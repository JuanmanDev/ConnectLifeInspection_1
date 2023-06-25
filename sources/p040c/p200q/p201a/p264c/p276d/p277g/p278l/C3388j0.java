package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.os.Looper;
import androidx.annotation.NonNull;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a.C3338d;
import p040c.p200q.p201a.p264c.p276d.p277g.C3345c;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;

/* renamed from: c.q.a.c.d.g.l.j0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3388j0<O extends C3334a.C3338d> extends C3423x {
    @NotOnlyInitialized

    /* renamed from: c */
    public final C3345c<O> f6325c;

    public C3388j0(C3345c<O> cVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f6325c = cVar;
    }

    /* renamed from: a */
    public final <A extends C3334a.C3336b, T extends C3369d<? extends C3356i, A>> T mo20450a(@NonNull T t) {
        this.f6325c.mo20438f(t);
        return t;
    }

    /* renamed from: c */
    public final Looper mo20451c() {
        return this.f6325c.mo20442j();
    }
}
