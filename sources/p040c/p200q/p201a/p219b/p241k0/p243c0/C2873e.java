package p040c.p200q.p201a.p219b.p241k0.p243c0;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p224f0.C2673f;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.k0.c0.e */
/* compiled from: ChunkExtractorWrapper */
public final class C2873e implements C2676i {

    /* renamed from: e */
    public final C2674g f4561e;

    /* renamed from: l */
    public final int f4562l;

    /* renamed from: m */
    public final Format f4563m;

    /* renamed from: n */
    public final SparseArray<C2874a> f4564n = new SparseArray<>();

    /* renamed from: o */
    public boolean f4565o;

    /* renamed from: p */
    public C2875b f4566p;

    /* renamed from: q */
    public long f4567q;

    /* renamed from: r */
    public C2682o f4568r;

    /* renamed from: s */
    public Format[] f4569s;

    /* renamed from: c.q.a.b.k0.c0.e$a */
    /* compiled from: ChunkExtractorWrapper */
    public static final class C2874a implements C2686q {

        /* renamed from: a */
        public final int f4570a;

        /* renamed from: b */
        public final int f4571b;

        /* renamed from: c */
        public final Format f4572c;

        /* renamed from: d */
        public final C2673f f4573d = new C2673f();

        /* renamed from: e */
        public Format f4574e;

        /* renamed from: f */
        public C2686q f4575f;

        /* renamed from: g */
        public long f4576g;

        public C2874a(int i, int i2, Format format) {
            this.f4570a = i;
            this.f4571b = i2;
            this.f4572c = format;
        }

        /* renamed from: a */
        public int mo18543a(C2675h hVar, int i, boolean z) {
            return this.f4575f.mo18543a(hVar, i, z);
        }

        /* renamed from: b */
        public void mo18544b(C3173t tVar, int i) {
            this.f4575f.mo18544b(tVar, i);
        }

        /* renamed from: c */
        public void mo18545c(long j, int i, int i2, int i3, C2686q.C2687a aVar) {
            long j2 = this.f4576g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f4575f = this.f4573d;
            }
            this.f4575f.mo18545c(j, i, i2, i3, aVar);
        }

        /* renamed from: d */
        public void mo18546d(Format format) {
            Format format2 = this.f4572c;
            if (format2 != null) {
                format = format.mo23918e(format2);
            }
            this.f4574e = format;
            this.f4575f.mo18546d(format);
        }

        /* renamed from: e */
        public void mo19079e(C2875b bVar, long j) {
            if (bVar == null) {
                this.f4575f = this.f4573d;
                return;
            }
            this.f4576g = j;
            C2686q a = bVar.mo19069a(this.f4570a, this.f4571b);
            this.f4575f = a;
            Format format = this.f4574e;
            if (format != null) {
                a.mo18546d(format);
            }
        }
    }

    /* renamed from: c.q.a.b.k0.c0.e$b */
    /* compiled from: ChunkExtractorWrapper */
    public interface C2875b {
        /* renamed from: a */
        C2686q mo19069a(int i, int i2);
    }

    public C2873e(C2674g gVar, int i, Format format) {
        this.f4561e = gVar;
        this.f4562l = i;
        this.f4563m = format;
    }

    /* renamed from: a */
    public C2686q mo18552a(int i, int i2) {
        C2874a aVar = this.f4564n.get(i);
        if (aVar == null) {
            C3151e.m7759g(this.f4569s == null);
            aVar = new C2874a(i, i2, i2 == this.f4562l ? this.f4563m : null);
            aVar.mo19079e(this.f4566p, this.f4567q);
            this.f4564n.put(i, aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public Format[] mo19076b() {
        return this.f4569s;
    }

    /* renamed from: c */
    public void mo18553c(C2682o oVar) {
        this.f4568r = oVar;
    }

    /* renamed from: d */
    public C2682o mo19077d() {
        return this.f4568r;
    }

    /* renamed from: e */
    public void mo19078e(@Nullable C2875b bVar, long j, long j2) {
        this.f4566p = bVar;
        this.f4567q = j2;
        if (!this.f4565o) {
            this.f4561e.mo18549f(this);
            if (j != -9223372036854775807L) {
                this.f4561e.mo18550g(0, j);
            }
            this.f4565o = true;
            return;
        }
        C2674g gVar = this.f4561e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        gVar.mo18550g(0, j);
        for (int i = 0; i < this.f4564n.size(); i++) {
            this.f4564n.valueAt(i).mo19079e(bVar, j2);
        }
    }

    /* renamed from: o */
    public void mo18554o() {
        Format[] formatArr = new Format[this.f4564n.size()];
        for (int i = 0; i < this.f4564n.size(); i++) {
            formatArr[i] = this.f4564n.valueAt(i).f4574e;
        }
        this.f4569s = formatArr;
    }
}
