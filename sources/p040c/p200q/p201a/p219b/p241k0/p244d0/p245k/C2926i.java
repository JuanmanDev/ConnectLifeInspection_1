package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import android.net.Uri;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p241k0.p244d0.C2906f;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2930j;

/* renamed from: c.q.a.b.k0.d0.k.i */
/* compiled from: Representation */
public abstract class C2926i {

    /* renamed from: a */
    public final Format f4812a;

    /* renamed from: b */
    public final String f4813b;

    /* renamed from: c */
    public final long f4814c;

    /* renamed from: d */
    public final List<C2921d> f4815d;

    /* renamed from: e */
    public final C2925h f4816e;

    /* renamed from: c.q.a.b.k0.d0.k.i$b */
    /* compiled from: Representation */
    public static class C2928b extends C2926i implements C2906f {

        /* renamed from: f */
        public final C2930j.C2931a f4817f;

        public C2928b(String str, long j, Format format, String str2, C2930j.C2931a aVar, List<C2921d> list) {
            super(str, j, format, str2, aVar, list);
            this.f4817f = aVar;
        }

        /* renamed from: a */
        public long mo19188a(long j) {
            return this.f4817f.mo19299g(j);
        }

        /* renamed from: b */
        public long mo19189b(long j, long j2) {
            return this.f4817f.mo19297e(j, j2);
        }

        /* renamed from: c */
        public C2925h mo19190c(long j) {
            return this.f4817f.mo19300h(this, j);
        }

        /* renamed from: d */
        public long mo19191d(long j, long j2) {
            return this.f4817f.mo19298f(j, j2);
        }

        /* renamed from: e */
        public boolean mo19192e() {
            return this.f4817f.mo19301i();
        }

        /* renamed from: f */
        public long mo19193f() {
            return this.f4817f.mo19295c();
        }

        /* renamed from: g */
        public int mo19194g(long j) {
            return this.f4817f.mo19296d(j);
        }

        /* renamed from: h */
        public String mo19289h() {
            return null;
        }

        /* renamed from: i */
        public C2906f mo19290i() {
            return this;
        }

        /* renamed from: j */
        public C2925h mo19291j() {
            return null;
        }
    }

    /* renamed from: c.q.a.b.k0.d0.k.i$c */
    /* compiled from: Representation */
    public static class C2929c extends C2926i {

        /* renamed from: f */
        public final Uri f4818f;

        /* renamed from: g */
        public final String f4819g;

        /* renamed from: h */
        public final C2925h f4820h;

        /* renamed from: i */
        public final C2936k f4821i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2929c(String str, long j, Format format, String str2, C2930j.C2935e eVar, List<C2921d> list, String str3, long j2) {
            super(str, j, format, str2, eVar, list);
            String str4;
            String str5 = str;
            this.f4818f = Uri.parse(str2);
            this.f4820h = eVar.mo19302c();
            C2936k kVar = null;
            if (str3 != null) {
                str4 = str3;
            } else if (str5 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(MAPCookie.DOT);
                sb.append(format.f7560e);
                sb.append(MAPCookie.DOT);
                long j3 = j;
                sb.append(j);
                str4 = sb.toString();
            } else {
                str4 = null;
            }
            this.f4819g = str4;
            this.f4821i = this.f4820h == null ? new C2936k(new C2925h((String) null, 0, j2)) : kVar;
        }

        /* renamed from: h */
        public String mo19289h() {
            return this.f4819g;
        }

        /* renamed from: i */
        public C2906f mo19290i() {
            return this.f4821i;
        }

        /* renamed from: j */
        public C2925h mo19291j() {
            return this.f4820h;
        }
    }

    /* renamed from: l */
    public static C2926i m6573l(String str, long j, Format format, String str2, C2930j jVar, List<C2921d> list) {
        return m6574m(str, j, format, str2, jVar, list, (String) null);
    }

    /* renamed from: m */
    public static C2926i m6574m(String str, long j, Format format, String str2, C2930j jVar, List<C2921d> list, String str3) {
        C2930j jVar2 = jVar;
        if (jVar2 instanceof C2930j.C2935e) {
            return new C2929c(str, j, format, str2, (C2930j.C2935e) jVar2, list, str3, -1);
        } else if (jVar2 instanceof C2930j.C2931a) {
            return new C2928b(str, j, format, str2, (C2930j.C2931a) jVar2, list);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    /* renamed from: h */
    public abstract String mo19289h();

    /* renamed from: i */
    public abstract C2906f mo19290i();

    /* renamed from: j */
    public abstract C2925h mo19291j();

    /* renamed from: k */
    public C2925h mo19292k() {
        return this.f4816e;
    }

    public C2926i(String str, long j, Format format, String str2, C2930j jVar, List<C2921d> list) {
        List<C2921d> list2;
        this.f4812a = format;
        this.f4813b = str2;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f4815d = list2;
        this.f4816e = jVar.mo19293a(this);
        this.f4814c = jVar.mo19294b();
    }
}
