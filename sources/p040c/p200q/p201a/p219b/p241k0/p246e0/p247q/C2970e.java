package p040c.p200q.p201a.p219b.p241k0.p246e0.p247q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p239i0.C2848d;

/* renamed from: c.q.a.b.k0.e0.q.e */
/* compiled from: HlsMediaPlaylist */
public final class C2970e extends C2972f {

    /* renamed from: d */
    public final int f5033d;

    /* renamed from: e */
    public final long f5034e;

    /* renamed from: f */
    public final long f5035f;

    /* renamed from: g */
    public final boolean f5036g;

    /* renamed from: h */
    public final int f5037h;

    /* renamed from: i */
    public final long f5038i;

    /* renamed from: j */
    public final int f5039j;

    /* renamed from: k */
    public final long f5040k;

    /* renamed from: l */
    public final boolean f5041l;

    /* renamed from: m */
    public final boolean f5042m;
    @Nullable

    /* renamed from: n */
    public final DrmInitData f5043n;

    /* renamed from: o */
    public final List<C2971a> f5044o;

    /* renamed from: p */
    public final long f5045p;

    /* renamed from: c.q.a.b.k0.e0.q.e$a */
    /* compiled from: HlsMediaPlaylist */
    public static final class C2971a implements Comparable<Long> {

        /* renamed from: e */
        public final String f5046e;
        @Nullable

        /* renamed from: l */
        public final C2971a f5047l;

        /* renamed from: m */
        public final long f5048m;

        /* renamed from: n */
        public final int f5049n;

        /* renamed from: o */
        public final long f5050o;
        @Nullable

        /* renamed from: p */
        public final DrmInitData f5051p;
        @Nullable

        /* renamed from: q */
        public final String f5052q;
        @Nullable

        /* renamed from: r */
        public final String f5053r;

        /* renamed from: s */
        public final long f5054s;

        /* renamed from: t */
        public final long f5055t;

        /* renamed from: u */
        public final boolean f5056u;

        public C2971a(String str, long j, long j2) {
            this(str, (C2971a) null, "", 0, -1, -9223372036854775807L, (DrmInitData) null, (String) null, (String) null, j, j2, false);
        }

        /* renamed from: c */
        public int compareTo(@NonNull Long l) {
            if (this.f5050o > l.longValue()) {
                return 1;
            }
            return this.f5050o < l.longValue() ? -1 : 0;
        }

        public C2971a(String str, @Nullable C2971a aVar, String str2, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j3, long j4, boolean z) {
            this.f5046e = str;
            this.f5047l = aVar;
            this.f5048m = j;
            this.f5049n = i;
            this.f5050o = j2;
            this.f5051p = drmInitData;
            this.f5052q = str3;
            this.f5053r = str4;
            this.f5054s = j3;
            this.f5055t = j4;
            this.f5056u = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2970e(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, @Nullable DrmInitData drmInitData, List<C2971a> list2) {
        super(str, list, z2);
        String str2 = str;
        List<String> list3 = list;
        this.f5033d = i;
        this.f5035f = j2;
        this.f5036g = z;
        this.f5037h = i2;
        this.f5038i = j3;
        this.f5039j = i3;
        this.f5040k = j4;
        this.f5041l = z3;
        this.f5042m = z4;
        this.f5043n = drmInitData;
        this.f5044o = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            C2971a aVar = list2.get(list2.size() - 1);
            this.f5045p = aVar.f5050o + aVar.f5048m;
        } else {
            this.f5045p = 0;
        }
        this.f5034e = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f5045p + j;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo18947a(List list) {
        mo19436b(list);
        return this;
    }

    /* renamed from: b */
    public C2970e mo19436b(List<C2848d> list) {
        return this;
    }

    /* renamed from: c */
    public C2970e mo19437c(long j, int i) {
        return new C2970e(this.f5033d, this.f5057a, this.f5058b, this.f5034e, j, true, i, this.f5038i, this.f5039j, this.f5040k, this.f5059c, this.f5041l, this.f5042m, this.f5043n, this.f5044o);
    }

    /* renamed from: d */
    public C2970e mo19438d() {
        if (this.f5041l) {
            return this;
        }
        C2970e eVar = r2;
        C2970e eVar2 = new C2970e(this.f5033d, this.f5057a, this.f5058b, this.f5034e, this.f5035f, this.f5036g, this.f5037h, this.f5038i, this.f5039j, this.f5040k, this.f5059c, true, this.f5042m, this.f5043n, this.f5044o);
        return eVar;
    }

    /* renamed from: e */
    public long mo19439e() {
        return this.f5035f + this.f5045p;
    }

    /* renamed from: f */
    public boolean mo19440f(C2970e eVar) {
        if (eVar == null) {
            return true;
        }
        long j = this.f5038i;
        long j2 = eVar.f5038i;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.f5044o.size();
        int size2 = eVar.f5044o.size();
        if (size > size2) {
            return true;
        }
        if (size != size2 || !this.f5041l || eVar.f5041l) {
            return false;
        }
        return true;
    }
}
