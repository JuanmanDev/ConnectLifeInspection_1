package p040c.p200q.p201a.p202a.p203h.p204f;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import p040c.p200q.p201a.p202a.p203h.p204f.C2379f;

/* renamed from: c.q.a.a.h.f.k */
/* compiled from: LogEvent */
public abstract class C2390k {

    /* renamed from: c.q.a.a.h.f.k$a */
    /* compiled from: LogEvent */
    public static abstract class C2391a {
        @NonNull
        /* renamed from: a */
        public abstract C2390k mo17735a();

        @NonNull
        /* renamed from: b */
        public abstract C2391a mo17736b(@Nullable Integer num);

        @NonNull
        /* renamed from: c */
        public abstract C2391a mo17737c(long j);

        @NonNull
        /* renamed from: d */
        public abstract C2391a mo17738d(long j);

        @NonNull
        /* renamed from: e */
        public abstract C2391a mo17739e(@Nullable NetworkConnectionInfo networkConnectionInfo);

        @NonNull
        /* renamed from: f */
        public abstract C2391a mo17740f(@Nullable byte[] bArr);

        @NonNull
        /* renamed from: g */
        public abstract C2391a mo17741g(@Nullable String str);

        @NonNull
        /* renamed from: h */
        public abstract C2391a mo17742h(long j);
    }

    /* renamed from: a */
    public static C2391a m4167a() {
        return new C2379f.C2381b();
    }

    @NonNull
    /* renamed from: i */
    public static C2391a m4168i(@NonNull String str) {
        C2391a a = m4167a();
        a.mo17741g(str);
        return a;
    }

    @NonNull
    /* renamed from: j */
    public static C2391a m4169j(@NonNull byte[] bArr) {
        C2391a a = m4167a();
        a.mo17740f(bArr);
        return a;
    }

    @Nullable
    /* renamed from: b */
    public abstract Integer mo17725b();

    /* renamed from: c */
    public abstract long mo17726c();

    /* renamed from: d */
    public abstract long mo17727d();

    @Nullable
    /* renamed from: e */
    public abstract NetworkConnectionInfo mo17728e();

    @Nullable
    /* renamed from: f */
    public abstract byte[] mo17730f();

    @Nullable
    /* renamed from: g */
    public abstract String mo17731g();

    /* renamed from: h */
    public abstract long mo17732h();
}
