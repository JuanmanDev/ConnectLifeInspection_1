package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p344k.C5731a;

/* renamed from: c.q.a.c.d.j.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3461e {

    /* renamed from: a */
    public final Account f6437a;

    /* renamed from: b */
    public final Set<Scope> f6438b;

    /* renamed from: c */
    public final Set<Scope> f6439c;

    /* renamed from: d */
    public final Map<C3334a<?>, C3445a0> f6440d;

    /* renamed from: e */
    public final String f6441e;

    /* renamed from: f */
    public final String f6442f;

    /* renamed from: g */
    public final C5731a f6443g;

    /* renamed from: h */
    public Integer f6444h;

    /* renamed from: c.q.a.c.d.j.e$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C3462a {

        /* renamed from: a */
        public Account f6445a;

        /* renamed from: b */
        public ArraySet<Scope> f6446b;

        /* renamed from: c */
        public String f6447c;

        /* renamed from: d */
        public String f6448d;

        /* renamed from: e */
        public C5731a f6449e = C5731a.f11204t;

        @NonNull
        /* renamed from: a */
        public C3461e mo20707a() {
            return new C3461e(this.f6445a, this.f6446b, (Map<C3334a<?>, C3445a0>) null, 0, (View) null, this.f6447c, this.f6448d, this.f6449e, false);
        }

        @NonNull
        /* renamed from: b */
        public C3462a mo20708b(@NonNull String str) {
            this.f6447c = str;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final C3462a mo20709c(@NonNull Collection<Scope> collection) {
            if (this.f6446b == null) {
                this.f6446b = new ArraySet<>();
            }
            this.f6446b.addAll(collection);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final C3462a mo20710d(Account account) {
            this.f6445a = account;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final C3462a mo20711e(@NonNull String str) {
            this.f6448d = str;
            return this;
        }
    }

    public C3461e(Account account, @NonNull Set<Scope> set, @NonNull Map<C3334a<?>, C3445a0> map, int i, View view, @NonNull String str, @NonNull String str2, C5731a aVar, boolean z) {
        this.f6437a = account;
        this.f6438b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f6440d = map == null ? Collections.emptyMap() : map;
        this.f6441e = str;
        this.f6442f = str2;
        this.f6443g = aVar == null ? C5731a.f11204t : aVar;
        HashSet hashSet = new HashSet(this.f6438b);
        for (C3445a0 a0Var : this.f6440d.values()) {
            hashSet.addAll(a0Var.f6400a);
        }
        this.f6439c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public Account mo20696a() {
        return this.f6437a;
    }

    @Deprecated
    @Nullable
    /* renamed from: b */
    public String mo20697b() {
        Account account = this.f6437a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    /* renamed from: c */
    public Account mo20698c() {
        Account account = this.f6437a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    /* renamed from: d */
    public Set<Scope> mo20699d() {
        return this.f6439c;
    }

    @NonNull
    /* renamed from: e */
    public Set<Scope> mo20700e(@NonNull C3334a<?> aVar) {
        C3445a0 a0Var = this.f6440d.get(aVar);
        if (a0Var == null || a0Var.f6400a.isEmpty()) {
            return this.f6438b;
        }
        HashSet hashSet = new HashSet(this.f6438b);
        hashSet.addAll(a0Var.f6400a);
        return hashSet;
    }

    @NonNull
    /* renamed from: f */
    public String mo20701f() {
        return this.f6441e;
    }

    @NonNull
    /* renamed from: g */
    public Set<Scope> mo20702g() {
        return this.f6438b;
    }

    @NonNull
    /* renamed from: h */
    public final C5731a mo20703h() {
        return this.f6443g;
    }

    @Nullable
    /* renamed from: i */
    public final Integer mo20704i() {
        return this.f6444h;
    }

    @Nullable
    /* renamed from: j */
    public final String mo20705j() {
        return this.f6442f;
    }

    /* renamed from: k */
    public final void mo20706k(@NonNull Integer num) {
        this.f6444h = num;
    }
}
