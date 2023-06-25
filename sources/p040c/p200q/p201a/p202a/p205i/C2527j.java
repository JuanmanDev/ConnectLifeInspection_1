package p040c.p200q.p201a.p202a.p205i;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p201a.p202a.p205i.C2408c;

/* renamed from: c.q.a.a.i.j */
/* compiled from: EventInternal */
public abstract class C2527j {

    /* renamed from: c.q.a.a.i.j$a */
    /* compiled from: EventInternal */
    public static abstract class C2528a {
        /* renamed from: a */
        public final C2528a mo17971a(String str, int i) {
            mo17792e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C2528a mo17972b(String str, long j) {
            mo17792e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C2528a mo17973c(String str, String str2) {
            mo17792e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C2527j mo17791d();

        /* renamed from: e */
        public abstract Map<String, String> mo17792e();

        /* renamed from: f */
        public abstract C2528a mo17793f(Map<String, String> map);

        /* renamed from: g */
        public abstract C2528a mo17794g(Integer num);

        /* renamed from: h */
        public abstract C2528a mo17795h(C2526i iVar);

        /* renamed from: i */
        public abstract C2528a mo17796i(long j);

        /* renamed from: j */
        public abstract C2528a mo17797j(String str);

        /* renamed from: k */
        public abstract C2528a mo17798k(long j);
    }

    /* renamed from: a */
    public static C2528a m4486a() {
        C2408c.C2410b bVar = new C2408c.C2410b();
        bVar.mo17793f(new HashMap());
        return bVar;
    }

    /* renamed from: b */
    public final String mo17966b(String str) {
        String str2 = mo17782c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo17782c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo17783d();

    /* renamed from: e */
    public abstract C2526i mo17784e();

    /* renamed from: f */
    public abstract long mo17786f();

    /* renamed from: g */
    public final int mo17967g(String str) {
        String str2 = mo17782c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo17968h(String str) {
        String str2 = mo17782c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo17969i() {
        return Collections.unmodifiableMap(mo17782c());
    }

    /* renamed from: j */
    public abstract String mo17788j();

    /* renamed from: k */
    public abstract long mo17789k();

    /* renamed from: l */
    public C2528a mo17970l() {
        C2408c.C2410b bVar = new C2408c.C2410b();
        bVar.mo17797j(mo17788j());
        bVar.mo17794g(mo17783d());
        bVar.mo17795h(mo17784e());
        bVar.mo17796i(mo17786f());
        bVar.mo17798k(mo17789k());
        bVar.mo17793f(new HashMap(mo17782c()));
        return bVar;
    }
}
