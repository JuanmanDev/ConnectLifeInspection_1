package p040c.p200q.p201a.p264c.p276d.p277g;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a.C3338d;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3372e;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3390k;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3474i;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3334a<O extends C3338d> {

    /* renamed from: a */
    public final C3335a<?, O> f6218a;

    /* renamed from: b */
    public final C3343g<?> f6219b;

    /* renamed from: c */
    public final String f6220c;

    /* renamed from: c.q.a.c.d.g.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C3335a<T extends C3342f, O> extends C3341e<T, O> {
        @NonNull
        @Deprecated
        /* renamed from: a */
        public T mo20326a(@NonNull Context context, @NonNull Looper looper, @NonNull C3461e eVar, @NonNull O o, @NonNull C3348d.C3349a aVar, @NonNull C3348d.C3350b bVar) {
            return mo20418b(context, looper, eVar, o, aVar, bVar);
        }

        @NonNull
        /* renamed from: b */
        public T mo20418b(@NonNull Context context, @NonNull Looper looper, @NonNull C3461e eVar, @NonNull O o, @NonNull C3372e eVar2, @NonNull C3390k kVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: c.q.a.c.d.g.a$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C3336b {
    }

    /* renamed from: c.q.a.c.d.g.a$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C3337c<C extends C3336b> {
    }

    /* renamed from: c.q.a.c.d.g.a$d */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C3338d {

        /* renamed from: c.q.a.c.d.g.a$d$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C3339a extends C3338d {
            @NonNull
            /* renamed from: f */
            Account mo20419f();
        }

        /* renamed from: c.q.a.c.d.g.a$d$b */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C3340b extends C3338d {
            @Nullable
            /* renamed from: z */
            GoogleSignInAccount mo20420z();
        }
    }

    /* renamed from: c.q.a.c.d.g.a$e */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C3341e<T extends C3336b, O> {
    }

    /* renamed from: c.q.a.c.d.g.a$f */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C3342f extends C3336b {
        @NonNull
        /* renamed from: a */
        Set<Scope> mo20421a();

        /* renamed from: b */
        void mo20422b(@Nullable C3474i iVar, @Nullable Set<Scope> set);

        /* renamed from: c */
        void mo20423c(@NonNull String str);

        /* renamed from: d */
        boolean mo20424d();

        void disconnect();

        @NonNull
        /* renamed from: e */
        String mo20426e();

        /* renamed from: f */
        void mo20427f(@NonNull C3453d.C3456c cVar);

        /* renamed from: g */
        void mo20428g(@NonNull C3453d.C3458e eVar);

        /* renamed from: h */
        boolean mo20429h();

        boolean isConnected();

        /* renamed from: j */
        int mo20302j();

        @NonNull
        /* renamed from: k */
        Feature[] mo20431k();

        @Nullable
        /* renamed from: l */
        String mo20432l();

        /* renamed from: m */
        boolean mo20433m();
    }

    /* renamed from: c.q.a.c.d.g.a$g */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C3343g<C extends C3342f> extends C3337c<C> {
    }

    public <C extends C3342f> C3334a(@NonNull String str, @NonNull C3335a<C, O> aVar, @NonNull C3343g<C> gVar) {
        C3495o.m8909k(aVar, "Cannot construct an Api with a null ClientBuilder");
        C3495o.m8909k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f6220c = str;
        this.f6218a = aVar;
        this.f6219b = gVar;
    }

    @NonNull
    /* renamed from: a */
    public final C3335a<?, O> mo20415a() {
        return this.f6218a;
    }

    @NonNull
    /* renamed from: b */
    public final C3337c<?> mo20416b() {
        return this.f6219b;
    }

    @NonNull
    /* renamed from: c */
    public final String mo20417c() {
        return this.f6220c;
    }
}
