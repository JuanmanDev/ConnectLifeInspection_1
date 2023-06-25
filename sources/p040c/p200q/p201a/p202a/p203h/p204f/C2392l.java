package p040c.p200q.p201a.p202a.p203h.p204f;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import p040c.p200q.p201a.p202a.p203h.p204f.C2382g;

/* renamed from: c.q.a.a.h.f.l */
/* compiled from: LogRequest */
public abstract class C2392l {

    /* renamed from: c.q.a.a.h.f.l$a */
    /* compiled from: LogRequest */
    public static abstract class C2393a {
        @NonNull
        /* renamed from: a */
        public abstract C2392l mo17753a();

        @NonNull
        /* renamed from: b */
        public abstract C2393a mo17754b(@Nullable ClientInfo clientInfo);

        @NonNull
        /* renamed from: c */
        public abstract C2393a mo17755c(@Nullable List<C2390k> list);

        @NonNull
        /* renamed from: d */
        public abstract C2393a mo17756d(@Nullable Integer num);

        @NonNull
        /* renamed from: e */
        public abstract C2393a mo17757e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract C2393a mo17758f(@Nullable QosTier qosTier);

        @NonNull
        /* renamed from: g */
        public abstract C2393a mo17759g(long j);

        @NonNull
        /* renamed from: h */
        public abstract C2393a mo17760h(long j);

        @NonNull
        /* renamed from: i */
        public C2393a mo17773i(int i) {
            mo17756d(Integer.valueOf(i));
            return this;
        }

        @NonNull
        /* renamed from: j */
        public C2393a mo17774j(@NonNull String str) {
            mo17757e(str);
            return this;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C2393a m4185a() {
        return new C2382g.C2384b();
    }

    @Nullable
    /* renamed from: b */
    public abstract ClientInfo mo17743b();

    @Nullable
    /* renamed from: c */
    public abstract List<C2390k> mo17744c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo17745d();

    @Nullable
    /* renamed from: e */
    public abstract String mo17746e();

    @Nullable
    /* renamed from: f */
    public abstract QosTier mo17748f();

    /* renamed from: g */
    public abstract long mo17749g();

    /* renamed from: h */
    public abstract long mo17750h();
}
