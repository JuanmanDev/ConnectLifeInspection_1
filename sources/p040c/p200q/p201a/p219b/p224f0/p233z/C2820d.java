package p040c.p200q.p201a.p219b.p224f0.p233z;

import com.google.android.exoplayer2.ParserException;
import p040c.p200q.p201a.p219b.p221c0.C2626y;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.z.d */
/* compiled from: WavHeaderReader */
public final class C2820d {

    /* renamed from: c.q.a.b.f0.z.d$a */
    /* compiled from: WavHeaderReader */
    public static final class C2821a {

        /* renamed from: a */
        public final int f4380a;

        /* renamed from: b */
        public final long f4381b;

        public C2821a(int i, long j) {
            this.f4380a = i;
            this.f4381b = j;
        }

        /* renamed from: a */
        public static C2821a m5994a(C2675h hVar, C3173t tVar) {
            hVar.mo18531i(tVar.f5877a, 0, 8);
            tVar.mo20006L(0);
            return new C2821a(tVar.mo20017j(), tVar.mo20022o());
        }
    }

    /* renamed from: a */
    public static C2819c m5992a(C2675h hVar) {
        C3151e.m7757e(hVar);
        C3173t tVar = new C3173t(16);
        if (C2821a.m5994a(hVar, tVar).f4380a != C2626y.f3276a) {
            return null;
        }
        hVar.mo18531i(tVar.f5877a, 0, 4);
        tVar.mo20006L(0);
        int j = tVar.mo20017j();
        if (j != C2626y.f3277b) {
            C3163m.m7877c("WavHeaderReader", "Unsupported RIFF format: " + j);
            return null;
        }
        C2821a a = C2821a.m5994a(hVar, tVar);
        while (a.f4380a != C2626y.f3278c) {
            hVar.mo18525d((int) a.f4381b);
            a = C2821a.m5994a(hVar, tVar);
        }
        C3151e.m7759g(a.f4381b >= 16);
        hVar.mo18531i(tVar.f5877a, 0, 16);
        tVar.mo20006L(0);
        int q = tVar.mo20024q();
        int q2 = tVar.mo20024q();
        int p = tVar.mo20023p();
        int p2 = tVar.mo20023p();
        int q3 = tVar.mo20024q();
        int q4 = tVar.mo20024q();
        int i = (q2 * q4) / 8;
        if (q3 == i) {
            int a2 = C2626y.m5056a(q, q4);
            if (a2 == 0) {
                C3163m.m7877c("WavHeaderReader", "Unsupported WAV format: " + q4 + " bit/sample, type " + q);
                return null;
            }
            hVar.mo18525d(((int) a.f4381b) - 16);
            return new C2819c(q2, p, p2, q3, q4, a2);
        }
        throw new ParserException("Expected block alignment: " + i + "; got: " + q3);
    }

    /* renamed from: b */
    public static void m5993b(C2675h hVar, C2819c cVar) {
        C3151e.m7757e(hVar);
        C3151e.m7757e(cVar);
        hVar.mo18527f();
        C3173t tVar = new C3173t(8);
        C2821a a = C2821a.m5994a(hVar, tVar);
        while (a.f4380a != C3152e0.m7764D("data")) {
            C3163m.m7880f("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.f4380a);
            long j = a.f4381b + 8;
            if (a.f4380a == C3152e0.m7764D("RIFF")) {
                j = 12;
            }
            if (j <= 2147483647L) {
                hVar.mo18528g((int) j);
                a = C2821a.m5994a(hVar, tVar);
            } else {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + a.f4380a);
            }
        }
        hVar.mo18528g(8);
        cVar.mo18875m(hVar.getPosition(), a.f4381b);
    }
}
