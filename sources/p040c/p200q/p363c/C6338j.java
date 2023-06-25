package p040c.p200q.p363c;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.C3501q;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;

/* renamed from: c.q.c.j */
/* compiled from: FirebaseOptions */
public final class C6338j {

    /* renamed from: a */
    public final String f11990a;

    /* renamed from: b */
    public final String f11991b;

    /* renamed from: c */
    public final String f11992c;

    /* renamed from: d */
    public final String f11993d;

    /* renamed from: e */
    public final String f11994e;

    /* renamed from: f */
    public final String f11995f;

    /* renamed from: g */
    public final String f11996g;

    /* renamed from: c.q.c.j$b */
    /* compiled from: FirebaseOptions */
    public static final class C6340b {

        /* renamed from: a */
        public String f11997a;

        /* renamed from: b */
        public String f11998b;

        /* renamed from: c */
        public String f11999c;

        /* renamed from: d */
        public String f12000d;

        /* renamed from: e */
        public String f12001e;

        /* renamed from: f */
        public String f12002f;

        /* renamed from: g */
        public String f12003g;

        @NonNull
        /* renamed from: a */
        public C6338j mo30429a() {
            return new C6338j(this.f11998b, this.f11997a, this.f11999c, this.f12000d, this.f12001e, this.f12002f, this.f12003g);
        }

        @NonNull
        /* renamed from: b */
        public C6340b mo30430b(@NonNull String str) {
            C3495o.m8905g(str, "ApiKey must be set.");
            this.f11997a = str;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C6340b mo30431c(@NonNull String str) {
            C3495o.m8905g(str, "ApplicationId must be set.");
            this.f11998b = str;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C6340b mo30432d(@Nullable String str) {
            this.f11999c = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C6340b mo30433e(@Nullable String str) {
            this.f12000d = str;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C6340b mo30434f(@Nullable String str) {
            this.f12001e = str;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public C6340b mo30435g(@Nullable String str) {
            this.f12003g = str;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public C6340b mo30436h(@Nullable String str) {
            this.f12002f = str;
            return this;
        }
    }

    @Nullable
    /* renamed from: a */
    public static C6338j m17817a(@NonNull Context context) {
        C3501q qVar = new C3501q(context);
        String a = qVar.mo20777a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C6338j(a, qVar.mo20777a("google_api_key"), qVar.mo20777a("firebase_database_url"), qVar.mo20777a("ga_trackingId"), qVar.mo20777a("gcm_defaultSenderId"), qVar.mo20777a("google_storage_bucket"), qVar.mo20777a("project_id"));
    }

    @NonNull
    /* renamed from: b */
    public String mo30419b() {
        return this.f11990a;
    }

    @NonNull
    /* renamed from: c */
    public String mo30420c() {
        return this.f11991b;
    }

    @Nullable
    /* renamed from: d */
    public String mo30421d() {
        return this.f11992c;
    }

    @Nullable
    /* renamed from: e */
    public String mo30422e() {
        return this.f11993d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6338j)) {
            return false;
        }
        C6338j jVar = (C6338j) obj;
        if (!C3487m.m8886a(this.f11991b, jVar.f11991b) || !C3487m.m8886a(this.f11990a, jVar.f11990a) || !C3487m.m8886a(this.f11992c, jVar.f11992c) || !C3487m.m8886a(this.f11993d, jVar.f11993d) || !C3487m.m8886a(this.f11994e, jVar.f11994e) || !C3487m.m8886a(this.f11995f, jVar.f11995f) || !C3487m.m8886a(this.f11996g, jVar.f11996g)) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: f */
    public String mo30424f() {
        return this.f11994e;
    }

    @Nullable
    /* renamed from: g */
    public String mo30425g() {
        return this.f11996g;
    }

    @Nullable
    /* renamed from: h */
    public String mo30426h() {
        return this.f11995f;
    }

    public int hashCode() {
        return C3487m.m8887b(this.f11991b, this.f11990a, this.f11992c, this.f11993d, this.f11994e, this.f11995f, this.f11996g);
    }

    public String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a("applicationId", this.f11991b);
        c.mo20747a("apiKey", this.f11990a);
        c.mo20747a("databaseUrl", this.f11992c);
        c.mo20747a("gcmSenderId", this.f11994e);
        c.mo20747a("storageBucket", this.f11995f);
        c.mo20747a("projectId", this.f11996g);
        return c.toString();
    }

    public C6338j(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        C3495o.m8912n(!C3564o.m9094b(str), "ApplicationId must be set.");
        this.f11991b = str;
        this.f11990a = str2;
        this.f11992c = str3;
        this.f11993d = str4;
        this.f11994e = str5;
        this.f11995f = str6;
        this.f11996g = str7;
    }
}
