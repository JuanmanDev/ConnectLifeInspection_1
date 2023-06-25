package p040c.p200q.p201a.p264c.p276d.p281j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3352f;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.j.n */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3491n {

    /* renamed from: a */
    public static final C3493n0 f6479a = new C3482k0();

    /* renamed from: c.q.a.c.d.j.n$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C3492a<R extends C3356i, T> {
        @Nullable
        /* renamed from: a */
        T mo20749a(@NonNull R r);
    }

    @NonNull
    /* renamed from: a */
    public static <R extends C3356i, T> C5771j<T> m8892a(@NonNull C3352f<R> fVar, @NonNull C3492a<R, T> aVar) {
        C3493n0 n0Var = f6479a;
        C5773k kVar = new C5773k();
        fVar.mo20456a(new C3485l0(fVar, kVar, aVar, n0Var));
        return kVar.mo28859a();
    }

    @NonNull
    /* renamed from: b */
    public static <R extends C3356i> C5771j<Void> m8893b(@NonNull C3352f<R> fVar) {
        return m8892a(fVar, new C3489m0());
    }
}
