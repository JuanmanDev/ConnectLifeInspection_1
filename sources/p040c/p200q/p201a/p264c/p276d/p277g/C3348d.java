package p040c.p200q.p201a.p264c.p276d.p277g;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3369d;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3372e;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3390k;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3399n;

@Deprecated
/* renamed from: c.q.a.c.d.g.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3348d {

    /* renamed from: a */
    public static final Set<C3348d> f6236a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: c.q.a.c.d.g.d$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C3349a extends C3372e {
    }

    @Deprecated
    /* renamed from: c.q.a.c.d.g.d$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C3350b extends C3390k {
    }

    @NonNull
    /* renamed from: b */
    public static Set<C3348d> m8496b() {
        Set<C3348d> set;
        synchronized (f6236a) {
            set = f6236a;
        }
        return set;
    }

    @NonNull
    /* renamed from: a */
    public <A extends C3334a.C3336b, T extends C3369d<? extends C3356i, A>> T mo20450a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: c */
    public Looper mo20451c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public boolean mo20452d(@NonNull C3399n nVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public void mo20453e() {
        throw new UnsupportedOperationException();
    }

    public abstract void registerConnectionFailedListener(@NonNull C3350b bVar);

    public abstract void unregisterConnectionFailedListener(@NonNull C3350b bVar);
}
