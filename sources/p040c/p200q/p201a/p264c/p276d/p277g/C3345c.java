package p040c.p200q.p201a.p264c.p276d.p277g;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a.C3338d;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3359a;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3362b;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3369d;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3373e0;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3375f;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3387j;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3388j0;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3402o;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3408q;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3419v;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3420v0;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3345c<O extends C3334a.C3338d> implements C3351e<O> {

    /* renamed from: a */
    public final Context f6221a;
    @Nullable

    /* renamed from: b */
    public final String f6222b;

    /* renamed from: c */
    public final C3334a<O> f6223c;

    /* renamed from: d */
    public final O f6224d;

    /* renamed from: e */
    public final C3362b<O> f6225e;

    /* renamed from: f */
    public final Looper f6226f;

    /* renamed from: g */
    public final int f6227g;
    @NotOnlyInitialized

    /* renamed from: h */
    public final C3348d f6228h;

    /* renamed from: i */
    public final C3402o f6229i;
    @NonNull

    /* renamed from: j */
    public final C3375f f6230j;

    /* renamed from: c.q.a.c.d.g.c$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C3346a {
        @NonNull

        /* renamed from: c */
        public static final C3346a f6231c = new C3347a().mo20448a();
        @NonNull

        /* renamed from: a */
        public final C3402o f6232a;
        @NonNull

        /* renamed from: b */
        public final Looper f6233b;

        /* renamed from: c.q.a.c.d.g.c$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static class C3347a {

            /* renamed from: a */
            public C3402o f6234a;

            /* renamed from: b */
            public Looper f6235b;

            @NonNull
            /* renamed from: a */
            public C3346a mo20448a() {
                if (this.f6234a == null) {
                    this.f6234a = new C3359a();
                }
                if (this.f6235b == null) {
                    this.f6235b = Looper.getMainLooper();
                }
                return new C3346a(this.f6234a, this.f6235b);
            }

            @NonNull
            /* renamed from: b */
            public C3347a mo20449b(@NonNull C3402o oVar) {
                C3495o.m8909k(oVar, "StatusExceptionMapper must not be null.");
                this.f6234a = oVar;
                return this;
            }
        }

        public C3346a(C3402o oVar, Account account, Looper looper) {
            this.f6232a = oVar;
            this.f6233b = looper;
        }
    }

    public C3345c(@NonNull Context context, @Nullable Activity activity, C3334a<O> aVar, O o, C3346a aVar2) {
        C3495o.m8909k(context, "Null context is not permitted.");
        C3495o.m8909k(aVar, "Api must not be null.");
        C3495o.m8909k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f6221a = context.getApplicationContext();
        String str = null;
        if (C3562m.m9090k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f6222b = str;
        this.f6223c = aVar;
        this.f6224d = o;
        this.f6226f = aVar2.f6233b;
        this.f6225e = C3362b.m8510a(aVar, o, str);
        this.f6228h = new C3388j0(this);
        C3375f y = C3375f.m8599y(this.f6221a);
        this.f6230j = y;
        this.f6227g = y.mo20544n();
        this.f6229i = aVar2.f6232a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C3419v.m8711u(activity, this.f6230j, this.f6225e);
        }
        this.f6230j.mo20534c(this);
    }

    @NonNull
    /* renamed from: b */
    public final C3362b<O> mo20434b() {
        return this.f6225e;
    }

    @NonNull
    /* renamed from: c */
    public C3348d mo20435c() {
        return this.f6228h;
    }

    @NonNull
    /* renamed from: d */
    public C3461e.C3462a mo20436d() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount z;
        C3461e.C3462a aVar = new C3461e.C3462a();
        O o = this.f6224d;
        if (!(o instanceof C3334a.C3338d.C3340b) || (z = ((C3334a.C3338d.C3340b) o).mo20420z()) == null) {
            O o2 = this.f6224d;
            account = o2 instanceof C3334a.C3338d.C3339a ? ((C3334a.C3338d.C3339a) o2).mo20419f() : null;
        } else {
            account = z.mo24430f();
        }
        aVar.mo20710d(account);
        O o3 = this.f6224d;
        if (o3 instanceof C3334a.C3338d.C3340b) {
            GoogleSignInAccount z2 = ((C3334a.C3338d.C3340b) o3).mo20420z();
            if (z2 == null) {
                set = Collections.emptySet();
            } else {
                set = z2.mo24425W();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.mo20709c(set);
        aVar.mo20711e(this.f6221a.getClass().getName());
        aVar.mo20708b(this.f6221a.getPackageName());
        return aVar;
    }

    @NonNull
    /* renamed from: e */
    public <TResult, A extends C3334a.C3336b> C5771j<TResult> mo20437e(@NonNull C3408q<A, TResult> qVar) {
        return mo20447o(2, qVar);
    }

    @NonNull
    /* renamed from: f */
    public <A extends C3334a.C3336b, T extends C3369d<? extends C3356i, A>> T mo20438f(@NonNull T t) {
        mo20446n(1, t);
        return t;
    }

    @NonNull
    /* renamed from: g */
    public O mo20439g() {
        return this.f6224d;
    }

    @NonNull
    /* renamed from: h */
    public Context mo20440h() {
        return this.f6221a;
    }

    @Nullable
    /* renamed from: i */
    public String mo20441i() {
        return this.f6222b;
    }

    @NonNull
    /* renamed from: j */
    public Looper mo20442j() {
        return this.f6226f;
    }

    /* renamed from: k */
    public final int mo20443k() {
        return this.f6227g;
    }

    @WorkerThread
    /* renamed from: l */
    public final C3334a.C3342f mo20444l(Looper looper, C3373e0<O> e0Var) {
        C3461e a = mo20436d().mo20707a();
        C3334a.C3335a<?, O> a2 = this.f6223c.mo20415a();
        C3495o.m8908j(a2);
        C3334a.C3342f a3 = a2.mo20326a(this.f6221a, looper, a, this.f6224d, e0Var, e0Var);
        String i = mo20441i();
        if (i != null && (a3 instanceof C3453d)) {
            ((C3453d) a3).mo20658N(i);
        }
        if (i != null && (a3 instanceof C3387j)) {
            ((C3387j) a3).mo20573p(i);
        }
        return a3;
    }

    /* renamed from: m */
    public final C3420v0 mo20445m(Context context, Handler handler) {
        return new C3420v0(context, handler, mo20436d().mo20707a());
    }

    /* renamed from: n */
    public final <A extends C3334a.C3336b, T extends C3369d<? extends C3356i, A>> T mo20446n(int i, @NonNull T t) {
        t.mo24549j();
        this.f6230j.mo20529E(this, i, t);
        return t;
    }

    /* renamed from: o */
    public final <TResult, A extends C3334a.C3336b> C5771j<TResult> mo20447o(int i, @NonNull C3408q<A, TResult> qVar) {
        C5773k kVar = new C5773k();
        this.f6230j.mo20530F(this, i, qVar, kVar, this.f6229i);
        return kVar.mo28859a();
    }

    public C3345c(@NonNull Context context, @NonNull C3334a<O> aVar, @NonNull O o, @NonNull C3346a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3345c(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.p277g.C3334a<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3402o r5) {
        /*
            r1 = this;
            c.q.a.c.d.g.c$a$a r0 = new c.q.a.c.d.g.c$a$a
            r0.<init>()
            r0.mo20449b(r5)
            c.q.a.c.d.g.c$a r5 = r0.mo20448a()
            r1.<init>((android.content.Context) r2, r3, r4, (p040c.p200q.p201a.p264c.p276d.p277g.C3345c.C3346a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p277g.C3345c.<init>(android.content.Context, c.q.a.c.d.g.a, c.q.a.c.d.g.a$d, c.q.a.c.d.g.l.o):void");
    }
}
