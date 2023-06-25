package p040c.p200q.p201a.p219b.p241k0.p243c0;

import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.c0.l */
/* compiled from: MediaChunk */
public abstract class C2884l extends C2872d {

    /* renamed from: i */
    public final long f4619i;

    public C2884l(C3122h hVar, C3125j jVar, Format format, int i, Object obj, long j, long j2, long j3) {
        super(hVar, jVar, 1, format, i, obj, j, j2);
        C3151e.m7757e(format);
        this.f4619i = j3;
    }

    /* renamed from: f */
    public long mo19122f() {
        long j = this.f4619i;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    /* renamed from: g */
    public abstract boolean mo19123g();
}
