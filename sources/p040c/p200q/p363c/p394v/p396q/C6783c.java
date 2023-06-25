package p040c.p200q.p363c.p394v.p396q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import p040c.p200q.p363c.p394v.p396q.C6779a;

/* renamed from: c.q.c.v.q.c */
/* compiled from: PersistedInstallationEntry */
public abstract class C6783c {

    /* renamed from: c.q.c.v.q.c$a */
    /* compiled from: PersistedInstallationEntry */
    public static abstract class C6784a {
        @NonNull
        /* renamed from: a */
        public abstract C6783c mo31497a();

        @NonNull
        /* renamed from: b */
        public abstract C6784a mo31498b(@Nullable String str);

        @NonNull
        /* renamed from: c */
        public abstract C6784a mo31499c(long j);

        @NonNull
        /* renamed from: d */
        public abstract C6784a mo31500d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C6784a mo31501e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract C6784a mo31502f(@Nullable String str);

        @NonNull
        /* renamed from: g */
        public abstract C6784a mo31503g(@NonNull PersistedInstallation.RegistrationStatus registrationStatus);

        @NonNull
        /* renamed from: h */
        public abstract C6784a mo31504h(long j);
    }

    static {
        m19208a().mo31497a();
    }

    @NonNull
    /* renamed from: a */
    public static C6784a m19208a() {
        C6779a.C6781b bVar = new C6779a.C6781b();
        bVar.mo31504h(0);
        bVar.mo31503g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        bVar.mo31499c(0);
        return bVar;
    }

    @Nullable
    /* renamed from: b */
    public abstract String mo31486b();

    /* renamed from: c */
    public abstract long mo31487c();

    @Nullable
    /* renamed from: d */
    public abstract String mo31488d();

    @Nullable
    /* renamed from: e */
    public abstract String mo31489e();

    @Nullable
    /* renamed from: f */
    public abstract String mo31491f();

    @NonNull
    /* renamed from: g */
    public abstract PersistedInstallation.RegistrationStatus mo31492g();

    /* renamed from: h */
    public abstract long mo31493h();

    /* renamed from: i */
    public boolean mo31512i() {
        return mo31492g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo31513j() {
        return mo31492g() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || mo31492g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo31514k() {
        return mo31492g() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo31515l() {
        return mo31492g() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo31516m() {
        return mo31492g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    @NonNull
    /* renamed from: n */
    public abstract C6784a mo31495n();

    @NonNull
    /* renamed from: o */
    public C6783c mo31517o(@NonNull String str, long j, long j2) {
        C6784a n = mo31495n();
        n.mo31498b(str);
        n.mo31499c(j);
        n.mo31504h(j2);
        return n.mo31497a();
    }

    @NonNull
    /* renamed from: p */
    public C6783c mo31518p() {
        C6784a n = mo31495n();
        n.mo31498b((String) null);
        return n.mo31497a();
    }

    @NonNull
    /* renamed from: q */
    public C6783c mo31519q(@NonNull String str) {
        C6784a n = mo31495n();
        n.mo31501e(str);
        n.mo31503g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
        return n.mo31497a();
    }

    @NonNull
    /* renamed from: r */
    public C6783c mo31520r() {
        C6784a n = mo31495n();
        n.mo31503g(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
        return n.mo31497a();
    }

    @NonNull
    /* renamed from: s */
    public C6783c mo31521s(@NonNull String str, @NonNull String str2, long j, @Nullable String str3, long j2) {
        C6784a n = mo31495n();
        n.mo31500d(str);
        n.mo31503g(PersistedInstallation.RegistrationStatus.REGISTERED);
        n.mo31498b(str3);
        n.mo31502f(str2);
        n.mo31499c(j2);
        n.mo31504h(j);
        return n.mo31497a();
    }

    @NonNull
    /* renamed from: t */
    public C6783c mo31522t(@NonNull String str) {
        C6784a n = mo31495n();
        n.mo31500d(str);
        n.mo31503g(PersistedInstallation.RegistrationStatus.UNREGISTERED);
        return n.mo31497a();
    }
}
